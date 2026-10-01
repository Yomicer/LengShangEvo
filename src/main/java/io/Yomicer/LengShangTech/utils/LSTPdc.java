package io.Yomicer.LengShangTech.utils;

import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

/** 物品 PDC 读写小工具 (经验存储器/鲸吞桶等)。 */
public final class LSTPdc {

    private LSTPdc() {
    }

    private static NamespacedKey key(String name) {
        return new NamespacedKey(io.Yomicer.LengShangTech.LengShangEvo.getInstance(), name);
    }

    public static void set(ItemStack item, String key, String value) {
        ItemMeta meta = item.getItemMeta();
        if (meta == null) return;
        PersistentDataContainer pdc = meta.getPersistentDataContainer();
        if (value == null) {
            pdc.remove(key(key));
        } else {
            pdc.set(key(key), PersistentDataType.STRING, value);
        }
        item.setItemMeta(meta);
    }

    public static String get(ItemStack item, String key) {
        ItemMeta meta = item.getItemMeta();
        if (meta == null) return null;
        return meta.getPersistentDataContainer().get(key(key), PersistentDataType.STRING);
    }

    public static void setInt(ItemStack item, String key, int value) {
        ItemMeta meta = item.getItemMeta();
        if (meta == null) return;
        meta.getPersistentDataContainer().set(key(key), PersistentDataType.INTEGER, value);
        item.setItemMeta(meta);
    }

    public static Integer getInt(ItemStack item, String key) {
        ItemMeta meta = item.getItemMeta();
        if (meta == null) return null;
        return meta.getPersistentDataContainer().get(key(key), PersistentDataType.INTEGER);
    }
}
