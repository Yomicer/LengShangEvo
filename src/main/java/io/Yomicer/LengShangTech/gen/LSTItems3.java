package io.Yomicer.LengShangTech.gen;

import io.Yomicer.LengShangTech.core.*;
import io.Yomicer.LengShangTech.scripts.LSTScriptBridge;
import io.Yomicer.LengShangTech.scripts.LSTBlockDrops;
import io.Yomicer.LengShangTech.LengShangEvo;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import org.bukkit.inventory.ItemStack;

/** 冷殇物品定义 (自动转换, 第 4 批)。 */
public final class LSTItems3 {

    public static void create() {
        // LENGSHANG_HXFDJ
        LSTItemFactory.head("LENGSHANG_HXFDJ","5dbfb4b5efc2da90069d58a685d1a8e9eac777f23704dc34e920b56117c8f2e1","&a火星发电机","&b日夜均可发电","&e太阳能发电机","&8⇨ &e⚡&7 128 J/s (昼)","&8⇨ &e⚡&7 128 J/s (夜)");
        // LENGSHANG_ys_WJTL_JCTYNFDJ
        LSTItemFactory.material("LENGSHANG_ys_WJTL_JCTYNFDJ","BLUE_GLAZED_TERRACOTTA",false,"&6&l压缩 · &9基础太阳能发电机","&7利用太阳能发电","&e太阳能发电机","&8⇨ &e⚡&7 60000 J 可储存","&8⇨ &e⚡&7 1200 J/s ");
        // LENGSHANG_ys_WJTL_GJTYNFDJ
        LSTItemFactory.material("LENGSHANG_ys_WJTL_GJTYNFDJ","RED_GLAZED_TERRACOTTA",false,"&6&l压缩 · &c高级太阳能发电机","&7利用太阳能发电","&e太阳能发电机","&8⇨ &e⚡&7 1000000 J 可储存","&8⇨ &e⚡&7 20000 J/s ");
        // LENGSHANG_ys_WJTL_CJTYNFDJ
        LSTItemFactory.material("LENGSHANG_ys_WJTL_CJTYNFDJ","YELLOW_GLAZED_TERRACOTTA",false,"&6&l压缩 · &e超级太阳能发电机","&7利用太阳能发电","&e太阳能发电机","&8⇨ &e⚡&7 5000000 J 可储存","&8⇨ &e⚡&7 100000 J/s ");
        // LENGSHANG_TYNFDJ_LZTYNB
        LSTItemFactory.material("LENGSHANG_TYNFDJ_LZTYNB","DAYLIGHT_DETECTOR",false,"&b&l量子太阳能板","&7运用量子技术最大化太阳能转化效率","&e太阳能发电机","&8⇨ &e⚡&7 8000 J/s (昼)","&8⇨ &e⚡&7 4000 J/s (夜)");
        // LENGSHANG_TYNFDJ_YGFDJ
        LSTItemFactory.material("LENGSHANG_TYNFDJ_YGFDJ","END_ROD",false,"&f&l月光发电机","&7在月光下反而能产生更多能量","&e太阳能发电机","&8⇨ &e⚡&7 800 J/s (昼)","&8⇨ &e⚡&7 2000 J/s (夜)");
        // LENGSHANG_TYNFDJ_CHNLSJQ
        LSTItemFactory.material("LENGSHANG_TYNFDJ_CHNLSJQ","CONDUIT",false,"&c&l彩&6&l虹&e&l能&a&l量&b&l收&9&l集&5&l器","&7在雨天时发电效率大幅提升","&e太阳能发电机","&8⇨ &e⚡&7 500 J/s (晴天)","&8⇨ &e⚡&7 1000 J/s (雨天)");
        // LENGSHANG_TYNFDJ_GJTYNZL
        LSTItemFactory.material("LENGSHANG_TYNFDJ_GJTYNZL","DAYLIGHT_DETECTOR",false,"&e&l高级太阳能阵列","&7改进型太阳能板，效率大幅提升","&e太阳能发电机","&8⇨ &e⚡&7 500 J/s (昼)","&8⇨ &e⚡&7 250 J/s (夜)");
        // LENGSHANG_TYNFDJ_SJTYNB
        LSTItemFactory.material("LENGSHANG_TYNFDJ_SJTYNB","AMETHYST_CLUSTER",false,"&b&l水晶太阳能板","&7使用水晶增强光能吸收效率","&e太阳能发电机","&8⇨ &e⚡&7 3000 J/s (昼)","&8⇨ &e⚡&7 1500 J/s (夜)");
        // LENGSHANG_箔澜光能板
        LSTItemFactory.head("LENGSHANG_箔澜光能板","6881309256a064135c09d48b738881c702e9cdc13062dc9927cec4ec4fe5ed7b","&6&l箔澜光能板","&7在宇宙中收集能量","&e太阳能发电机","&8⇨ &e⚡&7 888888 J/s (昼)","&8⇨ &e⚡&7 666666 J/s (夜)");
        // LENGSHANG_尊贵的冷殇发电机
        LSTItemFactory.head("LENGSHANG_尊贵的冷殇发电机","edf84715a64dc45586f7a6079f8e49a9477c0fe96589b4cfd71cba32254ac8","&x&0&0&F&F&F&F尊&x&0&F&F&F&F&F贵&x&0&F&F&C&C&F的&x&0&F&F&9&9&F冷&x&0&F&F&6&6&F殇&x&0&F&F&3&3&F发&x&0&F&F&0&0&F电&x&0&F&F&0&0&0机","&7冷殇科技作者专用发电机","&e太阳能发电机","&8⇨ &e⚡&7 4294967294 J/s (昼)","&8⇨ &e⚡&7 4294967294 J/s (夜)");
        // LENGSHANG_压缩_基础火电发电机
        LSTItemFactory.material("LENGSHANG_压缩_基础火电发电机","ORANGE_CONCRETE",false,"&d压缩&7 · &9基础火电发电机","&e至尊发电机","&8⇨ &e⚡&7 50000 J 可存储","&8⇨ &e⚡&7 25000 J/s");
        // LENGSHANG_压缩_基础风力发电机
        LSTItemFactory.material("LENGSHANG_压缩_基础风力发电机","LIGHT_BLUE_CONCRETE",false,"&d压缩&7 · &9基础风力发电机","&e至尊发电机","&8⇨ &e⚡&7 50000 J 可存储","&8⇨ &e⚡&7 25000 J/s");
        // LENGSHANG_压缩_基础水利发电机
        LSTItemFactory.material("LENGSHANG_压缩_基础水利发电机","BLUE_CONCRETE",false,"&d压缩&7 · &9基础水利发电机","&e至尊发电机","&8⇨ &e⚡&7 50000 J 可存储","&8⇨ &e⚡&7 25000 J/s");
        // LENGSHANG_压缩_基础光能发电机
        LSTItemFactory.material("LENGSHANG_压缩_基础光能发电机","WHITE_CONCRETE",false,"&d压缩&7 · &9基础光能发电机","&e至尊发电机","&8⇨ &e⚡&7 50000 J 可存储","&8⇨ &e⚡&7 25000 J/s");
        // LENGSHANG_压缩_基础地能发电机
        LSTItemFactory.material("LENGSHANG_压缩_基础地能发电机","BROWN_CONCRETE",false,"&d压缩&7 · &9基础地能发电机","&e至尊发电机","&8⇨ &e⚡&7 100000 J 可存储","&8⇨ &e⚡&7 50000 J/s");
        // LENGSHANG_压缩_增强_基础火电发电机
        LSTItemFactory.material("LENGSHANG_压缩_增强_基础火电发电机","ORANGE_CONCRETE",false,"&e压缩&7 · &9基础火电发电机","&e至尊发电机","&8⇨ &e⚡&7 500000 J 可存储","&8⇨ &e⚡&7 250000 J/s");
        // LENGSHANG_压缩_增强_基础风力发电机
        LSTItemFactory.material("LENGSHANG_压缩_增强_基础风力发电机","LIGHT_BLUE_CONCRETE",false,"&e压缩&7 · &9基础风力发电机","&e至尊发电机","&8⇨ &e⚡&7 500000 J 可存储","&8⇨ &e⚡&7 250000 J/s");
        // LENGSHANG_压缩_增强_基础水利发电机
        LSTItemFactory.material("LENGSHANG_压缩_增强_基础水利发电机","BLUE_CONCRETE",false,"&e压缩&7 · &9基础水利发电机","&e至尊发电机","&8⇨ &e⚡&7 500000 J 可存储","&8⇨ &e⚡&7 250000 J/s");
        // LENGSHANG_压缩_增强_基础光能发电机
        LSTItemFactory.material("LENGSHANG_压缩_增强_基础光能发电机","WHITE_CONCRETE",false,"&e压缩&7 · &9基础光能发电机","&e至尊发电机","&8⇨ &e⚡&7 500000 J 可存储","&8⇨ &e⚡&7 250000 J/s");
        // LENGSHANG_压缩_增强_基础地能发电机
        LSTItemFactory.material("LENGSHANG_压缩_增强_基础地能发电机","BROWN_CONCRETE",false,"&e压缩&7 · &9基础地能发电机","&e至尊发电机","&8⇨ &e⚡&7 1000000 J 可存储","&8⇨ &e⚡&7 500000 J/s");
        // LENGSHANG_MKSSCQ_1
        LSTItemFactory.material("LENGSHANG_MKSSCQ_1","BLAST_FURNACE",false,"&a煤矿石生成器 - I","&e材料生成器","&8⇨ &7速度: &b每 60 粘液刻生成一次","&8⇨ &e⚡&7 640 J 可存储","&8⇨ &e⚡&7 10 J/s");
        // LENGSHANG_MKSSCQ_2
        LSTItemFactory.material("LENGSHANG_MKSSCQ_2","BLAST_FURNACE",false,"&a煤矿石生成器 - II","&e材料生成器","&8⇨ &7速度: &b每 30 粘液刻生成一次","&8⇨ &e⚡&7 3200 J 可存储","&8⇨ &e⚡&7 50 J/s");
        // LENGSHANG_MKSSCQ_3
        LSTItemFactory.material("LENGSHANG_MKSSCQ_3","BLAST_FURNACE",false,"&a煤矿石生成器 - III","&e材料生成器","&8⇨ &7速度: &b每 10 粘液刻生成一次","&8⇨ &e⚡&7 6400 J 可存储","&8⇨ &e⚡&7 100 J/s");
        // LENGSHANG_TKSSCQ_1
        LSTItemFactory.material("LENGSHANG_TKSSCQ_1","BLAST_FURNACE",false,"&a铁矿石生成器 - I","&e材料生成器","&8⇨ &7速度: &b每 60 粘液刻生成一次","&8⇨ &e⚡&7 640 J 可存储","&8⇨ &e⚡&7 10 J/s");
        // LENGSHANG_TKSSCQ_2
        LSTItemFactory.material("LENGSHANG_TKSSCQ_2","BLAST_FURNACE",false,"&a铁矿石生成器 - II","&e材料生成器","&8⇨ &7速度: &b每 30 粘液刻生成一次","&8⇨ &e⚡&7 3200 J 可存储","&8⇨ &e⚡&7 50 J/s");
        // LENGSHANG_TKSSCQ_3
        LSTItemFactory.material("LENGSHANG_TKSSCQ_3","BLAST_FURNACE",false,"&a铁矿石生成器 - III","&e材料生成器","&8⇨ &7速度: &b每 10 粘液刻生成一次","&8⇨ &e⚡&7 6400 J 可存储","&8⇨ &e⚡&7 100 J/s");
        // LENGSHANG_TONGKSSCQ_1
        LSTItemFactory.material("LENGSHANG_TONGKSSCQ_1","BLAST_FURNACE",false,"&a铜矿石生成器 - I","&e材料生成器","&8⇨ &7速度: &b每 60 粘液刻生成一次","&8⇨ &e⚡&7 640 J 可存储","&8⇨ &e⚡&7 10 J/s");
        // LENGSHANG_TONGKSSCQ_2
        LSTItemFactory.material("LENGSHANG_TONGKSSCQ_2","BLAST_FURNACE",false,"&a铜矿石生成器 - II","&e材料生成器","&8⇨ &7速度: &b每 30 粘液刻生成一次","&8⇨ &e⚡&7 3200 J 可存储","&8⇨ &e⚡&7 50 J/s");
        // LENGSHANG_TONGKSSCQ_3
        LSTItemFactory.material("LENGSHANG_TONGKSSCQ_3","BLAST_FURNACE",false,"&a铜矿石生成器 - III","&e材料生成器","&8⇨ &7速度: &b每 10 粘液刻生成一次","&8⇨ &e⚡&7 6400 J 可存储","&8⇨ &e⚡&7 100 J/s");
        // LENGSHANG_JKSSCQ_1
        LSTItemFactory.material("LENGSHANG_JKSSCQ_1","BLAST_FURNACE",false,"&a金矿石生成器 - I","&e材料生成器","&8⇨ &7速度: &b每 60 粘液刻生成一次","&8⇨ &e⚡&7 640 J 可存储","&8⇨ &e⚡&7 10 J/s");
        // LENGSHANG_JKSSCQ_2
        LSTItemFactory.material("LENGSHANG_JKSSCQ_2","BLAST_FURNACE",false,"&a金矿石生成器 - II","&e材料生成器","&8⇨ &7速度: &b每 30 粘液刻生成一次","&8⇨ &e⚡&7 3200 J 可存储","&8⇨ &e⚡&7 50 J/s");
        // LENGSHANG_JKSSCQ_3
        LSTItemFactory.material("LENGSHANG_JKSSCQ_3","BLAST_FURNACE",false,"&a金矿石生成器 - III","&e材料生成器","&8⇨ &7速度: &b每 10 粘液刻生成一次","&8⇨ &e⚡&7 6400 J 可存储","&8⇨ &e⚡&7 100 J/s");
        // LENGSHANG_HSKSSCQ_1
        LSTItemFactory.material("LENGSHANG_HSKSSCQ_1","BLAST_FURNACE",false,"&a红石矿石生成器 - I","&e材料生成器","&8⇨ &7速度: &b每 60 粘液刻生成一次","&8⇨ &e⚡&7 640 J 可存储","&8⇨ &e⚡&7 10 J/s");
        // LENGSHANG_HSKSSCQ_2
        LSTItemFactory.material("LENGSHANG_HSKSSCQ_2","BLAST_FURNACE",false,"&a红石矿石生成器 - II","&e材料生成器","&8⇨ &7速度: &b每 30 粘液刻生成一次","&8⇨ &e⚡&7 3200 J 可存储","&8⇨ &e⚡&7 50 J/s");
        // LENGSHANG_HSKSSCQ_3
        LSTItemFactory.material("LENGSHANG_HSKSSCQ_3","BLAST_FURNACE",false,"&a红石矿石生成器 - III","&e材料生成器","&8⇨ &7速度: &b每 10 粘液刻生成一次","&8⇨ &e⚡&7 6400 J 可存储","&8⇨ &e⚡&7 100 J/s");
        // LENGSHANG_LBSKSSCQ_1
        LSTItemFactory.material("LENGSHANG_LBSKSSCQ_1","BLAST_FURNACE",false,"&a绿宝石矿石生成器 - I","&e材料生成器","&8⇨ &7速度: &b每 60 粘液刻生成一次","&8⇨ &e⚡&7 640 J 可存储","&8⇨ &e⚡&7 10 J/s");
        // LENGSHANG_LBSKSSCQ_2
        LSTItemFactory.material("LENGSHANG_LBSKSSCQ_2","BLAST_FURNACE",false,"&a绿宝石矿石生成器 - II","&e材料生成器","&8⇨ &7速度: &b每 30 粘液刻生成一次","&8⇨ &e⚡&7 3200 J 可存储","&8⇨ &e⚡&7 50 J/s");
        // LENGSHANG_LBSKSSCQ_3
        LSTItemFactory.material("LENGSHANG_LBSKSSCQ_3","BLAST_FURNACE",false,"&a绿宝石矿石生成器 - III","&e材料生成器","&8⇨ &7速度: &b每 10 粘液刻生成一次","&8⇨ &e⚡&7 6400 J 可存储","&8⇨ &e⚡&7 100 J/s");
        // LENGSHANG_QJSKSSCQ_1
        LSTItemFactory.material("LENGSHANG_QJSKSSCQ_1","BLAST_FURNACE",false,"&a青金石矿石生成器 - I","&e材料生成器","&8⇨ &7速度: &b每 60 粘液刻生成一次","&8⇨ &e⚡&7 640 J 可存储","&8⇨ &e⚡&7 10 J/s");
        // LENGSHANG_QJSKSSCQ_2
        LSTItemFactory.material("LENGSHANG_QJSKSSCQ_2","BLAST_FURNACE",false,"&a青金石矿石生成器 - II","&e材料生成器","&8⇨ &7速度: &b每 30 粘液刻生成一次","&8⇨ &e⚡&7 3200 J 可存储","&8⇨ &e⚡&7 50 J/s");
        // LENGSHANG_QJSKSSCQ_3
        LSTItemFactory.material("LENGSHANG_QJSKSSCQ_3","BLAST_FURNACE",false,"&a青金石矿石生成器 - III","&e材料生成器","&8⇨ &7速度: &b每 10 粘液刻生成一次","&8⇨ &e⚡&7 6400 J 可存储","&8⇨ &e⚡&7 100 J/s");
        // LENGSHANG_ZSKSSCQ_1
        LSTItemFactory.material("LENGSHANG_ZSKSSCQ_1","BLAST_FURNACE",false,"&a钻石矿石生成器 - I","&e材料生成器","&8⇨ &7速度: &b每 60 粘液刻生成一次","&8⇨ &e⚡&7 640 J 可存储","&8⇨ &e⚡&7 10 J/s");
        // LENGSHANG_ZSKSSCQ_2
        LSTItemFactory.material("LENGSHANG_ZSKSSCQ_2","BLAST_FURNACE",false,"&a钻石矿石生成器 - II","&e材料生成器","&8⇨ &7速度: &b每 30 粘液刻生成一次","&8⇨ &e⚡&7 3200 J 可存储","&8⇨ &e⚡&7 50 J/s");
        // LENGSHANG_ZSKSSCQ_3
        LSTItemFactory.material("LENGSHANG_ZSKSSCQ_3","BLAST_FURNACE",false,"&a钻石矿石生成器 - III","&e材料生成器","&8⇨ &7速度: &b每 10 粘液刻生成一次","&8⇨ &e⚡&7 6400 J 可存储","&8⇨ &e⚡&7 100 J/s");
        // LENGSHANG_XJSYKSSCQ_1
        LSTItemFactory.material("LENGSHANG_XJSYKSSCQ_1","BLAST_FURNACE",false,"&a下界石英矿石生成器 - I","&e材料生成器","&8⇨ &7速度: &b每 60 粘液刻生成一次","&8⇨ &e⚡&7 640 J 可存储","&8⇨ &e⚡&7 10 J/s");
        // LENGSHANG_XJSYKSSCQ_2
        LSTItemFactory.material("LENGSHANG_XJSYKSSCQ_2","BLAST_FURNACE",false,"&a下界石英矿石生成器 - II","&e材料生成器","&8⇨ &7速度: &b每 30 粘液刻生成一次","&8⇨ &e⚡&7 3200 J 可存储","&8⇨ &e⚡&7 50 J/s");
        // LENGSHANG_XJSYKSSCQ_3
        LSTItemFactory.material("LENGSHANG_XJSYKSSCQ_3","BLAST_FURNACE",false,"&a下界石英矿石生成器 - III","&e材料生成器","&8⇨ &7速度: &b每 10 粘液刻生成一次","&8⇨ &e⚡&7 6400 J 可存储","&8⇨ &e⚡&7 100 J/s");
        // LENGSHANG_SCMKSSCQ_1
        LSTItemFactory.material("LENGSHANG_SCMKSSCQ_1","BLAST_FURNACE",false,"&a深层煤矿石生成器 - I","&e材料生成器","&8⇨ &7速度: &b每 60 粘液刻生成一次","&8⇨ &e⚡&7 640 J 可存储","&8⇨ &e⚡&7 10 J/s");
        // LENGSHANG_SCMKSSCQ_2
        LSTItemFactory.material("LENGSHANG_SCMKSSCQ_2","BLAST_FURNACE",false,"&a深层煤矿石生成器 - II","&e材料生成器","&8⇨ &7速度: &b每 30 粘液刻生成一次","&8⇨ &e⚡&7 3200 J 可存储","&8⇨ &e⚡&7 50 J/s");
        // LENGSHANG_SCMKSSCQ_3
        LSTItemFactory.material("LENGSHANG_SCMKSSCQ_3","BLAST_FURNACE",false,"&a深层煤矿石生成器 - III","&e材料生成器","&8⇨ &7速度: &b每 10 粘液刻生成一次","&8⇨ &e⚡&7 6400 J 可存储","&8⇨ &e⚡&7 100 J/s");
        // LENGSHANG_SCTKSSCQ_1
        LSTItemFactory.material("LENGSHANG_SCTKSSCQ_1","BLAST_FURNACE",false,"&a深层铁矿石生成器 - I","&e材料生成器","&8⇨ &7速度: &b每 60 粘液刻生成一次","&8⇨ &e⚡&7 640 J 可存储","&8⇨ &e⚡&7 10 J/s");
        // LENGSHANG_SCTKSSCQ_2
        LSTItemFactory.material("LENGSHANG_SCTKSSCQ_2","BLAST_FURNACE",false,"&a深层铁矿石生成器 - II","&e材料生成器","&8⇨ &7速度: &b每 30 粘液刻生成一次","&8⇨ &e⚡&7 3200 J 可存储","&8⇨ &e⚡&7 50 J/s");
        // LENGSHANG_SCTKSSCQ_3
        LSTItemFactory.material("LENGSHANG_SCTKSSCQ_3","BLAST_FURNACE",false,"&a深层铁矿石生成器 - III","&e材料生成器","&8⇨ &7速度: &b每 10 粘液刻生成一次","&8⇨ &e⚡&7 6400 J 可存储","&8⇨ &e⚡&7 100 J/s");
        // LENGSHANG_SCTONGKSSCQ_1
        LSTItemFactory.material("LENGSHANG_SCTONGKSSCQ_1","BLAST_FURNACE",false,"&a深层铜矿石生成器 - I","&e材料生成器","&8⇨ &7速度: &b每 60 粘液刻生成一次","&8⇨ &e⚡&7 640 J 可存储","&8⇨ &e⚡&7 10 J/s");
        // LENGSHANG_SCTONGKSSCQ_2
        LSTItemFactory.material("LENGSHANG_SCTONGKSSCQ_2","BLAST_FURNACE",false,"&a深层铜矿石生成器 - II","&e材料生成器","&8⇨ &7速度: &b每 30 粘液刻生成一次","&8⇨ &e⚡&7 3200 J 可存储","&8⇨ &e⚡&7 50 J/s");
        // LENGSHANG_SCTONGKSSCQ_3
        LSTItemFactory.material("LENGSHANG_SCTONGKSSCQ_3","BLAST_FURNACE",false,"&a深层铜矿石生成器 - III","&e材料生成器","&8⇨ &7速度: &b每 10 粘液刻生成一次","&8⇨ &e⚡&7 6400 J 可存储","&8⇨ &e⚡&7 100 J/s");
        // LENGSHANG_SCJKSSCQ_1
        LSTItemFactory.material("LENGSHANG_SCJKSSCQ_1","BLAST_FURNACE",false,"&a深层金矿石生成器 - I","&e材料生成器","&8⇨ &7速度: &b每 60 粘液刻生成一次","&8⇨ &e⚡&7 640 J 可存储","&8⇨ &e⚡&7 10 J/s");
        // LENGSHANG_SCJKSSCQ_2
        LSTItemFactory.material("LENGSHANG_SCJKSSCQ_2","BLAST_FURNACE",false,"&a深层金矿石生成器 - II","&e材料生成器","&8⇨ &7速度: &b每 30 粘液刻生成一次","&8⇨ &e⚡&7 3200 J 可存储","&8⇨ &e⚡&7 50 J/s");
        // LENGSHANG_SCJKSSCQ_3
        LSTItemFactory.material("LENGSHANG_SCJKSSCQ_3","BLAST_FURNACE",false,"&a深层金矿石生成器 - III","&e材料生成器","&8⇨ &7速度: &b每 10 粘液刻生成一次","&8⇨ &e⚡&7 6400 J 可存储","&8⇨ &e⚡&7 100 J/s");
        // LENGSHANG_SCHSKSSCQ_1
        LSTItemFactory.material("LENGSHANG_SCHSKSSCQ_1","BLAST_FURNACE",false,"&a深层红石矿石生成器 - I","&e材料生成器","&8⇨ &7速度: &b每 60 粘液刻生成一次","&8⇨ &e⚡&7 640 J 可存储","&8⇨ &e⚡&7 10 J/s");
    }

    public static void register(LengShangEvo plugin) {
    }

    private LSTItems3() {
    }
}
