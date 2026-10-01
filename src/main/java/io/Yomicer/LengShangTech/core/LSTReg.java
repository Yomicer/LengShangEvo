package io.Yomicer.LengShangTech.core;

import io.Yomicer.LengShangTech.utils.LSTHeads;
import io.Yomicer.LengShangTech.utils.LSTLog;
import io.Yomicer.LengShangTech.utils.SavedItemLoader;
import io.Yomicer.LengShangTech.LengShangEvo;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nullable;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 冷殇科技注册门面: 所有生成代码通过这里解析配方原料与物品本体。
 * - lst(id): 冷殇内部物品, 从 LSTItems 静态索引解析 (与注册顺序无关)。
 * - sf(id): 任意粘液物品 (含其它附属), 找不到返回 null, 由注册守卫跳过。
 * - mat(name): 原版材质, 服务器不存在该材质时退化为 STONE (1.21 材质在 1.20 编译期不可直接引用)。
 * - saved(path): saveditem NBT 物品。
 * 所有物品 ID 统一规范化为全大写 (Slimefun 强制要求)。
 */
public final class LSTReg {

    /** 冷殇内部物品索引: 规范化 ID -> 物品本体, 由 LSTItemFactory 创建时填充。 */
    public static final Map<String, SlimefunItemStack> INDEX = new HashMap<>();

    /** 缺失依赖的占位替代品缓存: 原 ID -> 物品。 */
    private static final Map<String, ItemStack> PLACEHOLDERS = new ConcurrentHashMap<>();

    /** 高版本缺失材质的屏障占位缓存: 材质名 -> 物品。 */
    private static final Map<String, ItemStack> MC_PLACEHOLDERS = new ConcurrentHashMap<>();

    /** 占位物品 PDC 键: 值为原物品 ID (供附属晚启后的自动刷新)。 */
    public static final NamespacedKey PLACEHOLDER_ID_KEY =
            new NamespacedKey(LengShangEvo.getInstance(), "lst_placeholder_id");

    /** 判断物品是否为占位替代品, 是则返回原 ID, 否则返回 null。 */
    @Nullable
    public static String getPlaceholderOriginalId(@Nullable ItemStack item) {
        if (item == null || !item.hasItemMeta()) {
            return null;
        }
        return item.getItemMeta().getPersistentDataContainer()
                .get(PLACEHOLDER_ID_KEY, org.bukkit.persistence.PersistentDataType.STRING);
    }

    /** 占位物品刷新: 若原 ID 当前已可解析为真实物品, 返回真品; 否则原样返回。 */
    public static ItemStack refreshPlaceholder(ItemStack stack) {
        String originalId = getPlaceholderOriginalId(stack);
        if (originalId == null) {
            return stack;
        }
        ItemStack real = resolve(originalId, stack.getAmount());
        return real != null ? real : stack;
    }

    /**
     * 刷新所有冷殇注册物品的合成配方 (9 格) 里的占位品。
     * 机器配方数组由各类的 refreshPlaceholders 负责, 这里覆盖物品自身的 recipe 字段。
     *
     * @return 替换数量
     */
    public static int refreshItemRecipes() {
        int swapped = 0;
        for (Map.Entry<String, SlimefunItemStack> entry : INDEX.entrySet()) {
            SlimefunItem item = SlimefunItem.getById(entry.getKey());
            if (item == null) {
                continue;
            }
            ItemStack[] recipe = item.getRecipe();
            if (recipe == null) {
                continue;
            }
            for (int i = 0; i < recipe.length; i++) {
                ItemStack before = recipe[i];
                if (before == null) {
                    continue;
                }
                ItemStack after = refreshPlaceholder(before);
                if (after != before) {
                    recipe[i] = after;
                    swapped++;
                }
            }
        }
        return swapped;
    }

    private LSTReg() {
    }

    /** 物品 ID 规范化: Slimefun 强制全大写。 */
    public static String norm(String id) {
        return id == null ? null : id.toUpperCase(Locale.ROOT);
    }

    /** 注册一个冷殇物品到内部索引 (由 LSTItemFactory 调用)。 */
    public static void index(String id, SlimefunItemStack item) {
        INDEX.putIfAbsent(norm(id), item);
    }

    /** 冷殇内部物品按 ID 解析, 数量由 amount 决定; 不存在时返回 null。 */
    @Nullable
    public static ItemStack lst(String id, int amount) {
        SlimefunItemStack item = INDEX.get(norm(id));
        if (item == null) {
            return null;
        }
        ItemStack clone = item.clone();
        clone.setAmount(Math.max(1, amount));
        return clone;
    }

    /**
     * 任意粘液物品 (其它附属/冷殇已注册物品), 数量由 amount 决定。
     * 物品不存在时返回占位替代品 (BARRIER), 保证配方链路完整 —— 消耗品与产物都用占位顶替。
     */
    public static ItemStack sf(String id, int amount) {
        ItemStack resolved = resolve(id, amount);
        return resolved != null ? resolved : placeholder(id, amount);
    }

    /** 解析粘液物品, 不做占位兜底; 缺失返回 null。 */
    @Nullable
    public static ItemStack resolve(String id, int amount) {
        if (id == null) {
            return null;
        }
        String normalized = norm(id);
        SlimefunItemStack own = INDEX.get(normalized);
        if (own != null) {
            ItemStack clone = own.clone();
            clone.setAmount(Math.max(1, amount));
            return clone;
        }
        SlimefunItem external = SlimefunItem.getById(id);
        if (external == null) {
            external = SlimefunItem.getById(normalized);
        }
        if (external != null) {
            ItemStack clone = external.getItem().clone();
            clone.setAmount(Math.max(1, amount));
            return clone;
        }
        return null;
    }

    /** 缺失依赖的占位替代品 (按原 ID 缓存, 同 ID 恒定同一外观, 机器配方匹配不受影响)。 */
    public static ItemStack placeholder(String id, int amount) {
        String key = norm(id) == null ? "UNKNOWN" : norm(id);
        ItemStack stack = PLACEHOLDERS.computeIfAbsent(key, k -> {
            ItemStack base = new io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack(
                    Material.BARRIER,
                    "§c[缺失物品] " + k,
                    "§7该物品来自未安装的附属或其它版本",
                    "§7此为自动生成的占位替代品",
                    "§8原ID: " + k);
            base.editMeta(meta -> meta.getPersistentDataContainer()
                    .set(PLACEHOLDER_ID_KEY, org.bukkit.persistence.PersistentDataType.STRING, k));
            return base;
        });
        ItemStack clone = stack.clone();
        clone.setAmount(Math.max(1, amount));
        return clone;
    }

    /** 原版材质物品; 材质在当前服务器不存在 (通常是高版本才有的物品) 时用带名称/说明的屏障占位。 */
    public static ItemStack mat(String name, int amount) {
        Material material = Material.matchMaterial(name);
        if (material == null) {
            return matPlaceholder(name, amount);
        }
        return new ItemStack(material, Math.max(1, amount));
    }

    /**
     * 高版本材质在当前 (低版本) 服务器缺失时的屏障占位品:
     * 用中文名 (已知则映射, 否则美化英文) 作为显示名, lore 说明这是高版本物品的占位。
     * 按材质名缓存, 保证同名恒定同一外观, 不影响配方按物品匹配。
     */
    public static ItemStack matPlaceholder(String name, int amount) {
        String key = name == null ? "UNKNOWN" : name.toUpperCase(Locale.ROOT);
        ItemStack stack = MC_PLACEHOLDERS.computeIfAbsent(key, k -> new io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack(
                Material.BARRIER,
                "§c" + mcDisplayName(k),
                "§7高版本原版物品 (§e" + k + "§7)",
                "§7当前服务器版本不支持",
                "§8升级服务端后可正常获得"));
        ItemStack clone = stack.clone();
        clone.setAmount(Math.max(1, amount));
        return clone;
    }

    /** 已知高版本材质的中文名映射 (缺失时占位屏障用), 未收录则退化为美化英文名。 */
    private static String mcDisplayName(String materialName) {
        switch (materialName) {
            case "DIAMOND_SPEAR": return "钻石矛";
            case "NETHERITE_SPEAR": return "下界合金矛";
            case "IRON_SPEAR": return "铁矛";
            case "GOLDEN_SPEAR": return "金矛";
            case "STONE_SPEAR": return "石矛";
            case "WOODEN_SPEAR": return "木矛";
            case "MACE": return "重锤";
            case "WOLF_ARMOR": return "狼铠";
            case "BREEZE_ROD": return "旋风棒";
            case "WIND_CHARGE": return "风弹";
            case "TRIDENT": return "三叉戟";
            case "HEAVY_CORE": return "沉重核心";
            case "FLOW_ARMOR_TRIM_SMITHING_TEMPLATE": return "涡流盔甲纹饰锻造模板";
            case "GUSTER_BANNER_PATTERN": return "旋风人旗帜图案";
            case "BOLT_ARMOR_TRIM_SMITHING_TEMPLATE": return "闪电盔甲纹饰锻造模板";
            default: return prettifyMc(materialName);
        }
    }

    private static String prettifyMc(String materialName) {
        String[] parts = materialName.toLowerCase(Locale.ROOT).replace('_', ' ').split(" ");
        StringBuilder sb = new StringBuilder();
        for (String part : parts) {
            if (part.isEmpty()) continue;
            if (sb.length() > 0) sb.append(' ');
            sb.append(Character.toUpperCase(part.charAt(0))).append(part.substring(1));
        }
        return sb.toString();
    }

    /** 多候选原料 (RSC "A | B" 写法): 优先取真实存在的物品, 全部缺失时用第一个 ID 的占位替代。 */
    public static ItemStack firstOf(String[] ids, int amount) {
        if (ids == null || ids.length == 0) {
            return null;
        }
        for (String id : ids) {
            ItemStack resolved = resolve(id, amount);
            if (resolved != null) {
                return resolved;
            }
        }
        return placeholder(ids[0], amount);
    }

    /** 多候选原料 (物品形态, 兼容旧生成代码)。 */
    @Nullable
    public static ItemStack firstOf(ItemStack... candidates) {
        for (ItemStack candidate : candidates) {
            if (candidate != null) {
                return candidate;
            }
        }
        return null;
    }

    /** 多候选原版材质: 优先取当前服务器存在的材质。 */
    public static ItemStack firstOfMc(String[] names, int amount) {
        if (names == null || names.length == 0) {
            return new ItemStack(Material.STONE);
        }
        for (String name : names) {
            Material material = Material.matchMaterial(name);
            if (material != null) {
                return new ItemStack(material, Math.max(1, amount));
            }
        }
        return mat(names[0], amount);
    }

    /** saveditem NBT 物品; 缺失时用占位替代品顶替, 保证配方槽位不空。 */
    public static ItemStack saved(String path, int amount) {
        ItemStack item = SavedItemLoader.get(path);
        if (item == null) {
            return placeholder("saveditem:" + path, amount);
        }
        ItemStack clone = item.clone();
        clone.setAmount(Math.max(1, amount));
        return clone;
    }

    /** saveditem 版本变体 (RSC version 条件规则)。 */
    @Nullable
    public static ItemStack savedForVersion(String base, String name21, String name2134, int amount) {
        ItemStack item = SavedItemLoader.savedForVersion(base, name21, name2134);
        if (item == null) {
            return null;
        }
        ItemStack clone = item.clone();
        clone.setAmount(Math.max(1, amount));
        return clone;
    }

    /** 头颅物品: 64 位哈希。 */
    public static ItemStack head(String hash, int amount) {
        ItemStack item = LSTHeads.byHash(hash);
        item.setAmount(Math.max(1, amount));
        return item;
    }

    /** 头颅物品: base64 纹理 JSON。 */
    public static ItemStack head64(String base64, int amount) {
        ItemStack item = LSTHeads.byBase64(base64);
        item.setAmount(Math.max(1, amount));
        return item;
    }

    /** 冷殇物品本体 (SlimefunItemStack 形式), 供机器注册使用。 */
    public static SlimefunItemStack lstStack(String id) {
        SlimefunItemStack item = INDEX.get(norm(id));
        if (item == null) {
            LSTLog.warn("物品未创建: " + id);
        }
        return item;
    }

    /** 全部给定粘液物品 ID 均存在时才返回 true (用于跨附属注册守卫)。 */
    public static boolean allExist(String... ids) {
        for (String id : ids) {
            if (INDEX.containsKey(norm(id))) {
                continue;
            }
            if (SlimefunItem.getById(id) == null) {
                LSTLog.info("跳过注册: 缺少依赖物品 " + id);
                return false;
            }
        }
        return true;
    }
}
