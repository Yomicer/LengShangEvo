package io.Yomicer.LengShangTech.core;

import io.Yomicer.LengShangTech.utils.LSTHeads;
import io.Yomicer.LengShangTech.utils.SavedItemLoader;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import javax.annotation.Nullable;
import java.util.function.Consumer;

/**
 * 冷殇物品工厂: LSTItems 生成代码统一从这里创建物品本体。
 * 全部创建后立即写入 LSTReg.INDEX, 供配方原料解析。
 */
public final class LSTItemFactory {

    private LSTItemFactory() {
    }

    private static final Consumer<ItemMeta> GLOW = meta -> {
        meta.addEnchant(Enchantment.DURABILITY, 1, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
    };

    /** Slimefun 强制物品 ID 全大写; RSC 里留名集等 ID 带小写, 统一在此规范化。 */
    private static String norm(String id) {
        return id == null ? null : id.toUpperCase(java.util.Locale.ROOT);
    }

    /** 原版材质物品。 */
    public static SlimefunItemStack material(String id, String materialName, String name, String... lore) {
        return material(id, materialName, false, name, lore);
    }

    public static SlimefunItemStack material(String id, String materialName, boolean glow, String name, String... lore) {
        Material material = Material.matchMaterial(materialName);
        if (material == null) {
            material = Material.PAPER;
        }
        String sid = norm(id);
        SlimefunItemStack item;
        if (glow) {
            item = new SlimefunItemStack(sid, new CustomItemStack(material, name, lore), GLOW);
        } else {
            item = new SlimefunItemStack(sid, material, name, lore);
        }
        return indexed(item);
    }

    /** 64 位纹理哈希头颅物品。 */
    public static SlimefunItemStack head(String id, String hash, String name, String... lore) {
        String sid = norm(id);
        SlimefunItemStack item;
        try {
            item = new SlimefunItemStack(sid, hash, name, lore);
        } catch (Throwable t) {
            item = new SlimefunItemStack(sid, Material.PLAYER_HEAD, name, lore);
        }
        return indexed(item);
    }

    /** base64 纹理头颅物品。 */
    public static SlimefunItemStack headBase64(String id, String base64, String name, String... lore) {
        String hash = LSTHeads.hashFromBase64(base64);
        if (hash != null) {
            return head(id, hash, name, lore);
        }
        return material(id, "PLAYER_HEAD", name, lore);
    }

    /** saveditem NBT 物品 (完整还原 RSC 的装备/武器 NBT)。 */
    public static SlimefunItemStack saved(String id, String savedPath, String fallbackMaterial) {
        ItemStack base = SavedItemLoader.get(savedPath);
        if (base == null) {
            Material material = Material.matchMaterial(fallbackMaterial == null ? "PAPER" : fallbackMaterial);
            base = new ItemStack(material == null ? Material.PAPER : material);
        }
        return indexed(new SlimefunItemStack(norm(id), base));
    }

    /** saveditem 版本变体物品。 */
    public static SlimefunItemStack savedVersion(String id, String base, String name21, String name2134, String fallbackMaterial) {
        ItemStack stack = SavedItemLoader.savedForVersion(base, name21, name2134);
        if (stack == null) {
            Material material = Material.matchMaterial(fallbackMaterial == null ? "PAPER" : fallbackMaterial);
            stack = new ItemStack(material == null ? Material.PAPER : material);
        }
        return indexed(new SlimefunItemStack(id, stack));
    }

    /** saveditem + 发光。 */
    public static SlimefunItemStack savedGlow(String id, String savedPath, String fallbackMaterial) {
        SlimefunItemStack item = saved(id, savedPath, fallbackMaterial);
        return applyGlow(item);
    }

    public static SlimefunItemStack savedVersionGlow(String id, String base, String name21, String name2134, String fallbackMaterial) {
        SlimefunItemStack item = savedVersion(id, base, name21, name2134, fallbackMaterial);
        return applyGlow(item);
    }

    private static SlimefunItemStack applyGlow(SlimefunItemStack item) {
        try {
            ItemMeta meta = item.getItemMeta();
            if (meta != null) {
                GLOW.accept(meta);
                item.setItemMeta(meta);
            }
        } catch (Throwable ignored) {
        }
        return item;
    }

    private static SlimefunItemStack indexed(@Nullable SlimefunItemStack item) {
        if (item != null) {
            LSTReg.index(item.getItemId(), item);
        }
        return item;
    }
}
