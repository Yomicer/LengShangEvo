package io.Yomicer.LengShangTech.machines;

import io.Yomicer.LengShangTech.LengShangEvo;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.utils.HeadTexture;
import io.github.thebusybiscuit.slimefun4.utils.SlimefunUtils;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.persistence.PersistentDataType;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 指南配方显示工具:
 * 每条配方折叠成上下两个物品 (同一列): 上格=输入 (图标取首个输入物品的材质, 强调输入材料),
 * 下格=输出 (图标取首个产物的材质, 强调输出产物)。两格 lore 都完整列出全部材料+产物+制作时间
 * (瞬间完成为 0 秒)。相邻配方之间用一整列 (上下各一个) 箭头头颅分隔。
 * 点击上/下格 → 打开配方明细界面 (把全部输入/产物摆成可查看的真实物品, 附返回键)。
 */
public final class LSTDisplayUtil {

    /** 箭头分隔头颅 (懒加载, 需 Slimefun 已加载)。 */
    private static ItemStack arrowHead;

    /** 折叠物品上的明细键 (PDC): 值为 DETAILS 里的键, 点击后据此打开明细界面。 */
    private static final NamespacedKey DETAIL_KEY =
            new NamespacedKey(LengShangEvo.getInstance(), "lst_recipe_detail");

    /** 产物概率键 (PDC): 存该产物的出现概率百分比 (仅 <100 时写入)。 */
    private static final NamespacedKey CHANCE_KEY =
            new NamespacedKey(LengShangEvo.getInstance(), "lst_out_chance");

    /** 返回一个附带出现概率 (百分比) 的产物克隆; percent 在 (0,100) 之外则不标记。 */
    public static ItemStack withChance(ItemStack item, double percent) {
        if (item == null) {
            return null;
        }
        ItemStack clone = item.clone();
        if (percent > 0 && percent < 100) {
            clone.editMeta(meta -> meta.getPersistentDataContainer()
                    .set(CHANCE_KEY, PersistentDataType.DOUBLE, percent));
        }
        return clone;
    }

    /** 读取产物出现概率百分比; 未标记 (必出) 返回 null。 */
    public static Double getChancePercent(ItemStack item) {
        if (item == null || !item.hasItemMeta()) {
            return null;
        }
        return item.getItemMeta().getPersistentDataContainer().get(CHANCE_KEY, PersistentDataType.DOUBLE);
    }

    /** 概率百分比格式化: 整数不带小数, 否则最多一位小数。 */
    public static String formatPercent(double percent) {
        if (Math.abs(percent - Math.rint(percent)) < 1e-6) {
            return String.valueOf((long) Math.rint(percent));
        }
        return String.valueOf(Math.round(percent * 10.0) / 10.0);
    }

    /** 一条配方的完整明细 (输入+产物+来源机器 ID, 供明细界面与返回键使用)。 */
    public static final class RecipeDetail {
        final List<ItemStack> inputs;
        final List<ItemStack> outputs;
        final String sourceId;

        RecipeDetail(List<ItemStack> inputs, List<ItemStack> outputs, String sourceId) {
            this.inputs = inputs;
            this.outputs = outputs;
            this.sourceId = sourceId;
        }

        public List<ItemStack> getInputs() {
            return inputs;
        }

        public List<ItemStack> getOutputs() {
            return outputs;
        }

        public String getSourceId() {
            return sourceId;
        }
    }

    /** 明细注册表: 键 (来源ID#序号) -> 完整配方。 */
    private static final Map<String, RecipeDetail> DETAILS = new ConcurrentHashMap<>();

    private LSTDisplayUtil() {
    }

    public static NamespacedKey getDetailKey() {
        return DETAIL_KEY;
    }

    /** 按键取明细; 不存在返回 null。 */
    public static RecipeDetail getRecipeDetail(String key) {
        return DETAILS.get(key);
    }

    /** 注册一条配方明细 (键为 来源ID#序号, 同键覆盖), 返回明细键。 */
    public static String registerDetail(String sourceId, int index, List<ItemStack> inputs, List<ItemStack> outputs) {
        String key = sourceId + "#" + index;
        if (DETAILS.size() > 8192) {
            DETAILS.clear();
        }
        DETAILS.put(key, new RecipeDetail(
                clean(inputs), clean(outputs), sourceId));
        return key;
    }

    /**
     * 把一条配方折叠成单侧展示物品 (输入侧或输出侧)。
     * 两侧 lore 内容一致 (全部材料+产物+制作时间), 仅图标与顶部强调标签不同。
     * 附带明细键, 点击可打开配方明细界面。
     *
     * @param inputs      材料 (数量保留), 可空/空表示无输入 (如生成器)
     * @param outputs     产物 (数量保留)
     * @param headerLines 顶部信息行 (如制作时间、生产效率), 可为 null
     * @param inputSide   true=输入侧 (图标取首个材料); false=输出侧 (图标取首个产物)
     * @param detailKey   明细键 (写入 PDC), 可为 null
     */
    public static ItemStack compressRecipe(List<ItemStack> inputs, List<ItemStack> outputs,
                                           List<String> headerLines, boolean inputSide, String detailKey) {
        List<ItemStack> realIn = clean(inputs);
        List<ItemStack> realOut = clean(outputs);

        // 该侧只有单个物品时不压缩, 直接显示物品本体 (仍附明细键以便点击查看完整配方)
        List<ItemStack> side = inputSide ? realIn : realOut;
        if (side.size() == 1) {
            ItemStack self = side.get(0).clone();
            Double chance = getChancePercent(self);
            self.setAmount(Math.min(64, Math.max(1, self.getAmount())));
            if (!inputSide && chance != null) {
                appendLore(self, "§7出现概率: §e" + formatPercent(chance) + "%");
            }
            if (detailKey != null) {
                self.editMeta(meta -> meta.getPersistentDataContainer()
                        .set(DETAIL_KEY, PersistentDataType.STRING, detailKey));
            }
            stripSlimefunId(self);
            return self;
        }

        List<String> lore = new ArrayList<>();
        lore.add(inputSide ? "§b§l▏本格 · 输入材料" : "§a§l▏本格 · 输出产物");
        if (headerLines != null) {
            lore.addAll(headerLines);
        }
        lore.add("");

        lore.add("§b§l材料 §7(" + realIn.size() + " 种)");
        if (realIn.isEmpty()) {
            lore.add("§8· 无 (自动产出)");
        } else {
            for (ItemStack item : realIn) {
                lore.add("§7· §f" + nameOf(item) + " §7×§e" + item.getAmount());
            }
        }
        lore.add("");
        lore.add("§a§l产物 §7(" + realOut.size() + " 种)");
        if (realOut.isEmpty()) {
            lore.add("§8· 无");
        } else {
            for (ItemStack item : realOut) {
                String line = "§7· §f" + nameOf(item) + " §7×§e" + item.getAmount();
                Double chance = getChancePercent(item);
                if (chance != null) {
                    line += " §8(§e" + formatPercent(chance) + "%§8几率)";
                }
                lore.add(line);
            }
        }
        lore.add("");
        lore.add("§e▸ 点击查看完整配方明细");

        ItemStack result;
        List<ItemStack> iconSource = inputSide ? realIn : realOut;
        if (!iconSource.isEmpty()) {
            ItemStack icon = iconSource.get(0).clone();
            icon.setAmount(1);
            result = new CustomItemStack(icon, lore);
        } else {
            // 无对应侧物品时的兜底图标 (通常是生成器的输入侧)
            result = new CustomItemStack(inputSide ? Material.KNOWLEDGE_BOOK : Material.NETHER_STAR,
                    inputSide ? "§b无需输入 (自动产出)" : "§a配方产物", lore.toArray(new String[0]));
        }
        if (detailKey != null) {
            result.editMeta(meta -> meta.getPersistentDataContainer()
                    .set(DETAIL_KEY, PersistentDataType.STRING, detailKey));
        }
        stripSlimefunId(result);
        return result;
    }

    /**
     * 抹除折叠展示物品上的 Slimefun 物品 ID (PDC), 使其在指南里不被识别为可跳转的粘液物品,
     * 从而点击时只触发我们自己的明细界面, 不会污染指南历史 (避免返回需点两次)。
     * 外观 (材质/名字/lore/自定义模型/头颅) 保持不变。
     */
    private static void stripSlimefunId(ItemStack item) {
        if (item == null) {
            return;
        }
        try {
            org.bukkit.NamespacedKey key =
                    io.github.thebusybiscuit.slimefun4.implementation.Slimefun.getItemDataService().getKey();
            item.editMeta(meta -> meta.getPersistentDataContainer().remove(key));
        } catch (Throwable ignored) {
        }
    }

    /** 配方之间的箭头头颅分隔物 (一条配方后连发两个, 占满分隔列的上下两格)。 */
    public static ItemStack arrowDivider() {
        if (arrowHead == null) {
            try {
                arrowHead = SlimefunUtils.getCustomHead(HeadTexture.CARGO_ARROW_RIGHT.getTexture());
            } catch (Throwable ignored) {
                arrowHead = new ItemStack(Material.ARROW);
            }
        }
        return new CustomItemStack(arrowHead.clone(), "§8➜ §7配方分隔", "§8左列为一条完整配方", "§8上格输入 · 下格输出");
    }

    /** 在物品 lore 末尾追加一行。 */
    private static void appendLore(ItemStack item, String line) {
        item.editMeta(meta -> {
            List<String> lore = meta.hasLore() ? new ArrayList<>(meta.getLore()) : new ArrayList<>();
            lore.add(line);
            meta.setLore(lore);
        });
    }

    /** 过滤空气/空值并克隆, 保持数量。 */
    private static List<ItemStack> clean(List<ItemStack> items) {
        List<ItemStack> out = new ArrayList<>();
        if (items != null) {
            for (ItemStack item : items) {
                if (item != null && item.getType() != Material.AIR) {
                    out.add(item.clone());
                }
            }
        }
        return out;
    }

    /** 物品显示名: 粘液物品用注册名, 原版物品用鬼斩库的本地化中文名。 */
    public static String nameOf(ItemStack item) {
        try {
            SlimefunItem sfItem = SlimefunItem.getByItem(item);
            if (sfItem != null) {
                return sfItem.getItemName();
            }
        } catch (Throwable ignored) {
        }
        try {
            String localized = net.guizhanss.guizhanlib.minecraft.helper.inventory.ItemStackHelper.getDisplayName(item);
            if (localized != null && !localized.isEmpty()) {
                return localized;
            }
        } catch (Throwable ignored) {
        }
        return prettify(item.getType().name());
    }

    private static String prettify(String materialName) {
        String[] parts = materialName.toLowerCase().replace('_', ' ').split(" ");
        StringBuilder sb = new StringBuilder();
        for (String part : parts) {
            if (part.isEmpty()) continue;
            if (sb.length() > 0) sb.append(' ');
            sb.append(Character.toUpperCase(part.charAt(0))).append(part.substring(1));
        }
        return sb.toString();
    }
}
