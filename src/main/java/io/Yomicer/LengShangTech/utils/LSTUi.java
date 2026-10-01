package io.Yomicer.LengShangTech.utils;

import io.github.thebusybiscuit.slimefun4.utils.HeadTexture;
import io.github.thebusybiscuit.slimefun4.utils.SlimefunUtils;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

/**
 * 冷殇科技通用 UI 主题工具。
 * 统一各自建菜单 (聚宝阁 / 配方列表 / 配方明细) 的观感:
 * 背景占位填充、外框描边 + 四角强调色、带页码的中文翻页/返回按钮。
 * 机器菜单沿用 RSC 原始装饰, 不走本工具。
 */
public final class LSTUi {

    /** 背景占位 (深色底, 让物品图标更突出)。 */
    public static final Material BACKDROP = Material.BLACK_STAINED_GLASS_PANE;

    /** 冷殇霜寒主色: 配方浏览/明细外框。 */
    public static final Material FROST_EDGE = Material.LIGHT_BLUE_STAINED_GLASS_PANE;
    public static final Material FROST_CORNER = Material.CYAN_STAINED_GLASS_PANE;

    /** 聚宝阁珍藏色: 商店外框。 */
    public static final Material TREASURE_EDGE = Material.YELLOW_STAINED_GLASS_PANE;
    public static final Material TREASURE_CORNER = Material.ORANGE_STAINED_GLASS_PANE;

    /** 输入 / 输出分区强调色。 */
    public static final Material INPUT_ACCENT = Material.LIGHT_BLUE_STAINED_GLASS_PANE;
    public static final Material OUTPUT_ACCENT = Material.ORANGE_STAINED_GLASS_PANE;

    private LSTUi() {
    }

    /** 空名占位玻璃板 (隐藏多余提示)。 */
    public static ItemStack pane(Material material) {
        return labeled(material, " ");
    }

    /** 带名字/lore 的装饰物 (隐藏属性提示)。 */
    public static ItemStack labeled(Material material, String name, String... lore) {
        ItemStack item = new ItemStack(material);
        ItemMeta meta = item.getItemMeta();
        if (meta != null) {
            meta.setDisplayName(name);
            if (lore.length > 0) {
                meta.setLore(new ArrayList<>(List.of(lore)));
            }
            meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_DYE);
            item.setItemMeta(meta);
        }
        return item;
    }

    /** 用占位板填满所有当前为空的格子。 */
    public static void fillEmpty(Inventory inv, ItemStack filler) {
        for (int i = 0; i < inv.getSize(); i++) {
            ItemStack cur = inv.getItem(i);
            if (cur == null || cur.getType() == Material.AIR) {
                inv.setItem(i, filler.clone());
            }
        }
    }

    /** 描外框 (顶/底行 + 左/右列), 四角用强调色。 */
    public static void frame(Inventory inv, Material edge, Material corner) {
        int size = inv.getSize();
        int rows = size / 9;
        ItemStack edgePane = pane(edge);
        for (int c = 0; c < 9; c++) {
            inv.setItem(c, edgePane.clone());
            inv.setItem(size - 9 + c, edgePane.clone());
        }
        for (int r = 0; r < rows; r++) {
            inv.setItem(r * 9, edgePane.clone());
            inv.setItem(r * 9 + 8, edgePane.clone());
        }
        ItemStack cornerPane = pane(corner);
        inv.setItem(0, cornerPane.clone());
        inv.setItem(8, cornerPane.clone());
        inv.setItem(size - 9, cornerPane.clone());
        inv.setItem(size - 1, cornerPane.clone());
    }

    /** 背景填充 + 外框描边, 一步到位 (先铺底再描边)。 */
    public static void decorate(Inventory inv, Material edge, Material corner) {
        fillEmpty(inv, pane(BACKDROP));
        frame(inv, edge, corner);
    }

    /** 头颅 (纹理取自 HeadTexture); 失败退回给定材质。 */
    private static ItemStack head(HeadTexture texture, Material fallback) {
        try {
            return SlimefunUtils.getCustomHead(texture.getTexture());
        } catch (Throwable t) {
            return new ItemStack(fallback);
        }
    }

    /** 上一页按钮 (箭头头颅 + 页码); page/pages 为 1 基显示值。 */
    public static ItemStack prevButton(int page, int pages) {
        ItemStack btn = head(HeadTexture.CARGO_ARROW_LEFT, Material.ARROW);
        return rename(btn, "§a« 上一页", "§7第 §e" + page + " §7/ §e" + pages + " §7页");
    }

    /** 下一页按钮 (箭头头颅 + 页码); page/pages 为 1 基显示值。 */
    public static ItemStack nextButton(int page, int pages) {
        ItemStack btn = head(HeadTexture.CARGO_ARROW_RIGHT, Material.ARROW);
        return rename(btn, "§a下一页 »", "§7第 §e" + page + " §7/ §e" + pages + " §7页");
    }

    /** 返回按钮。 */
    public static ItemStack backButton(String... lore) {
        return labeled(Material.NETHER_STAR, "§c« 返回", lore);
    }

    /** 关闭按钮。 */
    public static ItemStack closeButton() {
        return labeled(Material.BARRIER, "§c✖ 关闭");
    }

    /** 顶部标题装饰物。 */
    public static ItemStack title(Material material, String name, String... lore) {
        return labeled(material, name, lore);
    }

    private static ItemStack rename(ItemStack item, String name, String... lore) {
        ItemMeta meta = item.getItemMeta();
        if (meta != null) {
            meta.setDisplayName(name);
            if (lore.length > 0) {
                meta.setLore(new ArrayList<>(List.of(lore)));
            }
            meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            item.setItemMeta(meta);
        }
        return item;
    }
}
