package io.Yomicer.LengShangTech.gen;

import io.Yomicer.LengShangTech.core.MagicExpansionHook;
import io.Yomicer.LengShangTech.utils.LSTHeads;
import io.github.thebusybiscuit.slimefun4.api.items.groups.NestedItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.groups.SubItemGroup;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;

/**
 * 冷殇科技组别树 (groups.yml 自动转换, 已按 4x9 网格重排美化)。
 * 指南每页 36 格 (9 列 x 4 行), 内容组共 33 个 + 3 个分区头玻璃板 = 36, 正好一页。
 * 3 个头玻璃板放在第 2/3/4 行行首 (tier 10/19/28), 作带名分区标题。
 */
public final class LSTGroups {

    /** 冷殇科技通用渐变前缀。 */
    private static final String P = "&x&F&E&3&C&3&C冷&x&F&A&1&6&6&9殇&x&E&5&1&C&9&3科&x&B&C&3&B&B&7技&6 · ";

    public static final NestedItemGroup LENGSHANG_TECH = new NestedItemGroup(
            new NamespacedKey(MagicExpansionHook.plugin(), "lengshang_tech"),
            new CustomItemStack(LSTHeads.byHash("73112785f64d814103931505ace00048c087337785550c99a67449c392b39772"),
                    "&d&k12&r&x&F&E&3&C&3&C冷&x&F&C&2&9&5&2殇&x&F&A&1&6&6&9科&x&F&0&1&9&7&E技&x&E&5&1&C&9&3E&x&D&1&2&C&A&5v&x&B&C&3&B&B&7o&d&k34&r"));

    // ===================== 第 1 行: 入口 · 基础制作 =====================

    /** 说明书 */
    public static final SubItemGroup SMS = new SubItemGroup(
            new NamespacedKey(MagicExpansionHook.plugin(), "lst_sms"), LENGSHANG_TECH,
            new CustomItemStack(LSTHeads.byHash("20b13024045c5c0d6d2afb059ae9660f7ad020fd895bb75f64fcc02ddb07d327"), P + "&e说明书"), 1);

    /** 聚宝阁 */
    public static final SubItemGroup SD = new SubItemGroup(
            new NamespacedKey(MagicExpansionHook.plugin(), "lst_sd"), LENGSHANG_TECH,
            new CustomItemStack(Material.matchMaterial("CLOCK"), P + "§x§F§F§B§6§C§1❀ §x§F§5§A§3§B§9聚§x§E§B§9§1§B§1宝§x§E§1§7§F§A§9阁 §x§C§D§5§B§9§9❀"), 2);

    /** 材料 */
    public static final SubItemGroup CL = new SubItemGroup(
            new NamespacedKey(MagicExpansionHook.plugin(), "lst_cl"), LENGSHANG_TECH,
            new CustomItemStack(Material.matchMaterial("NETHERITE_INGOT"), P + "&a材料"), 3);

    /** 武器 */
    public static final SubItemGroup WQ = new SubItemGroup(
            new NamespacedKey(MagicExpansionHook.plugin(), "lst_wq"), LENGSHANG_TECH,
            new CustomItemStack(Material.matchMaterial("NETHERITE_SWORD"), P + "&6武器"), 4);

    /** 工具 */
    public static final SubItemGroup GJ = new SubItemGroup(
            new NamespacedKey(MagicExpansionHook.plugin(), "lst_gj"), LENGSHANG_TECH,
            new CustomItemStack(Material.matchMaterial("NETHERITE_PICKAXE"), P + "&e工具"), 5);

    /** 装备 */
    public static final SubItemGroup ZB = new SubItemGroup(
            new NamespacedKey(MagicExpansionHook.plugin(), "lst_zb"), LENGSHANG_TECH,
            new CustomItemStack(Material.matchMaterial("NETHERITE_CHESTPLATE"), P + "&b装备"), 6);

    /** 特殊物品 */
    public static final SubItemGroup TSWP = new SubItemGroup(
            new NamespacedKey(MagicExpansionHook.plugin(), "lst_tswp"), LENGSHANG_TECH,
            new CustomItemStack(Material.matchMaterial("CHAIN_COMMAND_BLOCK"), P + "&c特殊物品"), 7);

    /** 趣味道具 */
    public static final SubItemGroup G8 = new SubItemGroup(
            new NamespacedKey(MagicExpansionHook.plugin(), "lst_8"), LENGSHANG_TECH,
            new CustomItemStack(Material.matchMaterial("RABBIT_FOOT"), P + "&d趣味道具"), 8);

    /** 天命盲盒 */
    public static final SubItemGroup G2 = new SubItemGroup(
            new NamespacedKey(MagicExpansionHook.plugin(), "lst_2"), LENGSHANG_TECH,
            new CustomItemStack(LSTHeads.byHash("7fbb45f4ea1e54f88e7e00859e8ec9a5982823d888b6e1f6ae1d69a414fff70f"),
                    P + "&6天&c命&d盲&5盒"), 9);

    // ================ 第 2 行: 机器 · 生产 · 压缩(前半) ================

    /** 分区头 · 机器/生产/压缩 (第 2 行行首) */
    public static final SubItemGroup G20 = new SubItemGroup(
            new NamespacedKey(MagicExpansionHook.plugin(), "lst_20"), LENGSHANG_TECH,
            new CustomItemStack(Material.matchMaterial("LIGHT_BLUE_STAINED_GLASS_PANE"),
                    "&b&l✦ 机器 · 生产 · 压缩 ✦",
                    "&8▬▬▬▬▬▬▬▬▬▬▬▬",
                    "&7▸ 本区: 机器 / 电力 / 材料生成 / 压缩产线"), 10);

    /** 机器 */
    public static final SubItemGroup JQ = new SubItemGroup(
            new NamespacedKey(MagicExpansionHook.plugin(), "lst_jq"), LENGSHANG_TECH,
            new CustomItemStack(Material.matchMaterial("CHISELED_DEEPSLATE"), P + "&x&6&6&9&9&F&F机器"), 11);

    /** 电力 */
    public static final SubItemGroup DL = new SubItemGroup(
            new NamespacedKey(MagicExpansionHook.plugin(), "lst_dl"), LENGSHANG_TECH,
            new CustomItemStack(Material.matchMaterial("ORANGE_GLAZED_TERRACOTTA"), P + "&5电力"), 12);

    /** 原版材料生成器 */
    public static final SubItemGroup YBCLSCQ = new SubItemGroup(
            new NamespacedKey(MagicExpansionHook.plugin(), "lst_ybclscq"), LENGSHANG_TECH,
            new CustomItemStack(LSTHeads.byHash("bdc7913229cb2e898071b0c2bc8f13bd8dba69dbdccaf4d1da643ab726b925af"), P + "原版材料生成器"), 13);

    /** 粘液材料生成器 */
    public static final SubItemGroup NYCLSCQ = new SubItemGroup(
            new NamespacedKey(MagicExpansionHook.plugin(), "lst_nyclscq"), LENGSHANG_TECH,
            new CustomItemStack(LSTHeads.byHash("bdc7913229cb2e898071b0c2bc8f13bd8dba69dbdccaf4d1da643ab726b925af"), P + "粘液材料生成器"), 14);

    /** 压缩材料 */
    public static final SubItemGroup YSCL = new SubItemGroup(
            new NamespacedKey(MagicExpansionHook.plugin(), "lst_yscl"), LENGSHANG_TECH,
            new CustomItemStack(LSTHeads.byHash("6fde01e7abb58ab3a531c9ae1e6044d822764f97b7c545a8df6f32b603e4ce39"), "&x&F&E&3&C&3&C冷&x&F&A&1&6&6&9殇&x&E&5&1&C&9&3科&x&B&C&3&B&B&7技&e · 压缩材料"), 15);

    /** 压缩机器 */
    public static final SubItemGroup YSJQ = new SubItemGroup(
            new NamespacedKey(MagicExpansionHook.plugin(), "lst_ysjq"), LENGSHANG_TECH,
            new CustomItemStack(Material.matchMaterial("PISTON"), P + "&5压缩机器"), 16);

    /** 压缩 · 原版材料生成器 */
    public static final SubItemGroup YS_YBCLSCQ = new SubItemGroup(
            new NamespacedKey(MagicExpansionHook.plugin(), "lst_ys_ybclscq"), LENGSHANG_TECH,
            new CustomItemStack(LSTHeads.byHash("bdc7913229cb2e898071b0c2bc8f13bd8dba69dbdccaf4d1da643ab726b925af"), P + "压缩 · 原版材料生成器"), 17);

    /** 压缩 · 粘液材料生成器 */
    public static final SubItemGroup YS_NYCLSCQ = new SubItemGroup(
            new NamespacedKey(MagicExpansionHook.plugin(), "lst_ys_nyclscq"), LENGSHANG_TECH,
            new CustomItemStack(LSTHeads.byHash("bdc7913229cb2e898071b0c2bc8f13bd8dba69dbdccaf4d1da643ab726b925af"), P + "压缩 · 粘液材料生成器"), 18);

    // ================ 第 3 行: 压缩(后半) · 星际 · 套装 ================

    /** 分区头 · 压缩/星际/套装 (第 3 行行首) */
    public static final SubItemGroup G26 = new SubItemGroup(
            new NamespacedKey(MagicExpansionHook.plugin(), "lst_26"), LENGSHANG_TECH,
            new CustomItemStack(Material.matchMaterial("MAGENTA_STAINED_GLASS_PANE"),
                    "&d&l✦ 压缩 · 星际 · 套装 ✦",
                    "&8▬▬▬▬▬▬▬▬▬▬▬▬",
                    "&7▸ 本区: 高阶压缩 / 星际 / 箔澜星 / 套装"), 19);

    /** 压缩生成器 · 海曼科技院 */
    public static final SubItemGroup YS_HMKJY = new SubItemGroup(
            new NamespacedKey(MagicExpansionHook.plugin(), "lst_ys_hmkjy"), LENGSHANG_TECH,
            new CustomItemStack(LSTHeads.byHash("1421f1514da756c8c6c7c0b83a79265c26c9ece66b3bad8fbd94bd96d7040d7e"), P + "压缩生成器 · &7&kll&x&F&F&F&F&0&0海&x&C&C&F&F&0&0曼&x&8&8&F&F&0&0科技&x&4&4&F&F&0&0院&7&kll"), 20);

    /** 压缩机器 · 海曼科技院 */
    public static final SubItemGroup YS_HMKJY_JQ = new SubItemGroup(
            new NamespacedKey(MagicExpansionHook.plugin(), "lst_ys_hmkjy_jq"), LENGSHANG_TECH,
            new CustomItemStack(LSTHeads.byHash("1421f1514da756c8c6c7c0b83a79265c26c9ece66b3bad8fbd94bd96d7040d7e"), P + "压缩机器 · &7&kll&x&F&F&F&F&0&0海&x&C&C&F&F&0&0曼&x&8&8&F&F&0&0科技&x&4&4&F&F&0&0院&7&kll"), 21);

    /** 压缩 · 无尽贪婪 */
    public static final SubItemGroup YS_WJTL = new SubItemGroup(
            new NamespacedKey(MagicExpansionHook.plugin(), "lst_ys_wjtl"), LENGSHANG_TECH,
            new CustomItemStack(Material.matchMaterial("NETHER_STAR"), P + "压缩 · &e&k1&r&b无尽&4贪婪&k1&r"), 22);

    /** 堆叠生成器 */
    public static final SubItemGroup DDSCQ = new SubItemGroup(
            new NamespacedKey(MagicExpansionHook.plugin(), "lst_ddscq"), LENGSHANG_TECH,
            new CustomItemStack(LSTHeads.byHash("289804b7986a1fe08e9e2966dcd286f72edb52870ceae74cc6f0e0574cbf41e3"), P + "&x&F&F&B&F&F&F堆叠生成器"), 23);

    /** 星际 */
    public static final SubItemGroup XJ = new SubItemGroup(
            new NamespacedKey(MagicExpansionHook.plugin(), "lst_xj"), LENGSHANG_TECH,
            new CustomItemStack(Material.matchMaterial("BEACON"), P + "&9星际"), 24);

    /** 箔澜星 · 企划材料 */
    public static final SubItemGroup BLX_CL = new SubItemGroup(
            new NamespacedKey(MagicExpansionHook.plugin(), "lst_blx_cl"), LENGSHANG_TECH,
            new CustomItemStack(LSTHeads.byHash("ffd21f16347a401ca5e97f47782f4739bf5480a1c29e19743945b4dc529f5859"), P + "&a箔澜星&6 · &d企划材料"), 25);

    /** 箔澜星 · 崭新出厂 */
    public static final SubItemGroup BLX_JQ = new SubItemGroup(
            new NamespacedKey(MagicExpansionHook.plugin(), "lst_blx_jq"), LENGSHANG_TECH,
            new CustomItemStack(LSTHeads.byHash("818f83eb64f438e3f6ae3a5c2dea8ed10303bad85ac34a798659a275aa096506"), P + "&a箔澜星&6 · &4崭新出厂"), 26);

    /** 永恒无尽套装 */
    public static final SubItemGroup G11 = new SubItemGroup(
            new NamespacedKey(MagicExpansionHook.plugin(), "lst_11"), LENGSHANG_TECH,
            new CustomItemStack(Material.matchMaterial("NETHERITE_CHESTPLATE"),
                    "&x&0&F&F&F&F&F永&x&0&F&F&C&C&F恒&x&0&F&F&9&9&F无&x&0&F&F&6&6&F尽&6 · &b套装"), 27);

    // ================ 第 4 行: 终章 · 娱乐 · 语录 ================

    /** 分区头 · 终章/娱乐/语录 (第 4 行行首) */
    public static final SubItemGroup G17 = new SubItemGroup(
            new NamespacedKey(MagicExpansionHook.plugin(), "lst_17"), LENGSHANG_TECH,
            new CustomItemStack(Material.matchMaterial("ORANGE_STAINED_GLASS_PANE"),
                    "&6&l✦ 终章 · 娱乐 · 语录 ✦",
                    "&8▬▬▬▬▬▬▬▬▬▬▬▬",
                    "&7▸ 本区: 终章 / 幸运方块 / 语录 / 娱乐文案"), 28);

    /** 终章 */
    public static final SubItemGroup ZHONGZHANG = new SubItemGroup(
            new NamespacedKey(MagicExpansionHook.plugin(), "lst_zhongzhang"), LENGSHANG_TECH,
            new CustomItemStack(Material.matchMaterial("END_CRYSTAL"), P + "&x&F&E&3&C&3&C终&x&F&A&1&6&6&9章"), 29);

    /** 幸运方块 */
    public static final SubItemGroup XYFK = new SubItemGroup(
            new NamespacedKey(MagicExpansionHook.plugin(), "lst_xyfk"), LENGSHANG_TECH,
            new CustomItemStack(LSTHeads.byHash(LSTHeads.hashFromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjNiNzEwYjA4YjUyM2JiYTdlZmJhMDdjNjI5YmEwODk1YWQ2MTEyNmQyNmM4NmJlYjM4NDU2MDNhOTc0MjZjIn19fQ==")), P + "&f幸运方块"), 30);

    /** 材质 */
    public static final SubItemGroup CZ = new SubItemGroup(
            new NamespacedKey(MagicExpansionHook.plugin(), "lst_cz"), LENGSHANG_TECH,
            new CustomItemStack(LSTHeads.byHash(LSTHeads.hashFromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTFkYzUwZjcyMTYxZDRkMWYyZjYzZGJlZjgxMGYyYjM1ZmJkNjU5NTg4MzY0MDdiMmFhYzkxMGJlMGFkZmI1YiJ9fX0=")), P + "&e材质"), 31);

    /** 留名集 */
    public static final SubItemGroup LMJ = new SubItemGroup(
            new NamespacedKey(MagicExpansionHook.plugin(), "lst_lmj"), LENGSHANG_TECH,
            new CustomItemStack(Material.matchMaterial("WRITABLE_BOOK"), P + "&a留&b名&c集"), 32);

    /** 舔狗语录 */
    public static final SubItemGroup TGYL = new SubItemGroup(
            new NamespacedKey(MagicExpansionHook.plugin(), "lst_tgyl"), LENGSHANG_TECH,
            new CustomItemStack(LSTHeads.byHash("a374fd6d1448fa130e9249af199023846b8fc877f117f3ac1c43403ba7fef3"), P + "&a舔狗语录"), 33);

    /** 随机一言 */
    public static final SubItemGroup SJYY = new SubItemGroup(
            new NamespacedKey(MagicExpansionHook.plugin(), "lst_sjyy"), LENGSHANG_TECH,
            new CustomItemStack(Material.matchMaterial("BOOK"), P + "&d随机一言"), 34);

    /** emo文案 */
    public static final SubItemGroup G29 = new SubItemGroup(
            new NamespacedKey(MagicExpansionHook.plugin(), "lst_29"), LENGSHANG_TECH,
            new CustomItemStack(Material.matchMaterial("GHAST_TEAR"), P + "&eemo文案"), 35);

    /** 伤感语录 */
    public static final SubItemGroup G35 = new SubItemGroup(
            new NamespacedKey(MagicExpansionHook.plugin(), "lst_35"), LENGSHANG_TECH,
            new CustomItemStack(Material.matchMaterial("GHAST_TEAR"), P + "&c伤感语录"), 36);

    /** 兜底分组 (第 5 行/次页)。 */
    public static final SubItemGroup MISC = new SubItemGroup(
            new NamespacedKey(MagicExpansionHook.plugin(), "lst_misc"), LENGSHANG_TECH,
            new CustomItemStack(Material.PAPER, "&7冷殇科技 · 其它"), 99);

    private LSTGroups() {
    }
}
