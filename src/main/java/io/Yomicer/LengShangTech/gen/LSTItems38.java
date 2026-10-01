package io.Yomicer.LengShangTech.gen;

import io.Yomicer.LengShangTech.core.*;
import io.Yomicer.LengShangTech.scripts.LSTScriptBridge;
import io.Yomicer.LengShangTech.scripts.LSTBlockDrops;
import io.Yomicer.LengShangTech.LengShangEvo;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import org.bukkit.inventory.ItemStack;

/** 冷殇物品定义 (自动转换, 第 39 批)。 */
public final class LSTItems38 {

    public static void create() {
        // LENGSHANG_YS_WJTL_XKSJZ_2
        LSTItemFactory.material("LENGSHANG_YS_WJTL_XKSJZ_2","OBSIDIAN",false,"&5&l压缩 · &8虚空收集者","&7从虚无中缓慢收集&8虚空粉尘","&e材料生成器","&8⇨ &7速度: &b每 1024 粘液刻生成一次","&8⇨ &e⚡&7 400000 J 可存储","&8⇨ &e⚡&7 24000 J/s");
        // LENGSHANG_YS_WJTL_XKSJZ_3
        LSTItemFactory.material("LENGSHANG_YS_WJTL_XKSJZ_3","OBSIDIAN",false,"&d&l压缩 · &8虚空收集者","&7从虚无中缓慢收集&8虚空锭","&e材料生成器","&8⇨ &7速度: &b每 1024 粘液刻生成一次","&8⇨ &e⚡&7 1000000 J 可存储","&8⇨ &e⚡&7 52000 J/s");
        // LENGSHANG_YS_WJTL_WJXKSJZ_1
        LSTItemFactory.material("LENGSHANG_YS_WJTL_WJXKSJZ_1","CRYING_OBSIDIAN",false,"&6&l压缩 · &b无尽&8虚空收集者","&7从虚无中收集&8虚空粒","&e材料生成器","&8⇨ &7速度: &b每 16 粘液刻生成一次","&8⇨ &e⚡&7 4000000 J 可存储","&8⇨ &e⚡&7 240000 J/s");
        // LENGSHANG_YS_WJTL_WJXKSJZ_2
        LSTItemFactory.material("LENGSHANG_YS_WJTL_WJXKSJZ_2","CRYING_OBSIDIAN",false,"&5&l压缩 · &b无尽&8虚空收集者","&7从虚无中收集&8虚空粉尘","&e材料生成器","&8⇨ &7速度: &b每 16 粘液刻生成一次","&8⇨ &e⚡&7 40000000 J 可存储","&8⇨ &e⚡&7 2400000 J/s");
        // LENGSHANG_YS_WJTL_WJXKSJZ_3
        LSTItemFactory.material("LENGSHANG_YS_WJTL_WJXKSJZ_3","CRYING_OBSIDIAN",false,"&d&l压缩 · &b无尽&8虚空收集者","&7从虚无中收集&8虚空锭","&e材料生成器","&8⇨ &7速度: &b每 16 粘液刻生成一次","&8⇨ &e⚡&7 100000000 J 可存储","&8⇨ &e⚡&7 5200000 J/s");
        // LENGSHANG_YS_WJTL_HYSSCQ
        LSTItemFactory.material("LENGSHANG_YS_WJTL_HYSSCQ","SMOOTH_STONE",false,"&6&l压缩 · &8黑曜石生成器"," ","&e材料生成器","&8⇨ &7速度: &b每 1 粘液刻生成一次","&8⇨ &e⚡&7 24000 J 可存储","&8⇨ &e⚡&7 2400 J/s");
        // LENGSHANG_YS_WJTL_JCKJ
        LSTItemFactory.material("LENGSHANG_YS_WJTL_JCKJ","CHISELED_SANDSTONE",false,"&6&l压缩 · &9基础矿机","&7自动挖主世界矿物","&8⇨ &7速度: &b每 10 粘液刻生成一次","&8⇨ &e⚡&7 60000 J 可存储","&8⇨ &e⚡&7 6000 J/s");
        // LENGSHANG_YS_WJTL_GJKJ
        LSTItemFactory.material("LENGSHANG_YS_WJTL_GJKJ","CHISELED_RED_SANDSTONE",false,"&6&l压缩 · &c高级矿机","&7自动挖主世界和下界矿物","&8⇨ &7速度: &b每 10 粘液刻生成一次","&8⇨ &e⚡&7 180000 J 可存储","&8⇨ &e⚡&7 18000 J/s");
        // LENGSHANG_YS_WJTL_XKKJ
        LSTItemFactory.material("LENGSHANG_YS_WJTL_XKKJ","CHISELED_NETHER_BRICKS",false,"&6&l压缩 · &8虚空矿机","&7自动挖主世界和下界矿物","&8⇨ &7速度: &b每 10 粘液刻生成一次","&8⇨ &e⚡&7 720000 J 可存储","&8⇨ &e⚡&7 72000 J/s");
        // LENGSHANG_YS_WJTL_DXGEO_HMXC
        LSTItemFactory.material("LENGSHANG_YS_WJTL_DXGEO_HMXC","QUARTZ_BRICKS",false,"&6&l定向GEO · &6&l海曼星尘","&7从虚无中缓慢生成&6&l海曼星尘","&8⇨ &7速度: &b每 30 粘液刻生成一次","&8⇨ &e⚡&7 90000 J 可存储","&8⇨ &e⚡&7 9000 J/s");
        // LENGSHANG_YS_WJTL_DXGEO_FGZBUG
        LSTItemFactory.material("LENGSHANG_YS_WJTL_DXGEO_FGZBUG","QUARTZ_BRICKS",false,"&6&l定向GEO · &4&l反规则bug","&7从虚无中缓慢生成&4&l反规则bug","&8⇨ &7速度: &b每 30 粘液刻生成一次","&8⇨ &e⚡&7 90000 J 可存储","&8⇨ &e⚡&7 9000 J/s");
        // LENGSHANG_YS_WJTL_DXGEO_TU
        LSTItemFactory.material("LENGSHANG_YS_WJTL_DXGEO_TU","QUARTZ_BRICKS",false,"&6&l定向GEO · &8钍","&7从虚无中缓慢生成&8钍","&8⇨ &7速度: &b每 30 粘液刻生成一次","&8⇨ &e⚡&7 90000 J 可存储","&8⇨ &e⚡&7 9000 J/s");
        // LENGSHANG_YS_WJTL_DXGEO_XJB
        LSTItemFactory.material("LENGSHANG_YS_WJTL_DXGEO_XJB","QUARTZ_BRICKS",false,"&6&l定向GEO · &e下界冰","&7从虚无中缓慢生成&e下界冰","&8⇨ &7速度: &b每 30 粘液刻生成一次","&8⇨ &e⚡&7 90000 J 可存储","&8⇨ &e⚡&7 9000 J/s");
        // LENGSHANG_YS_WJTL_DXGEO_MDJH
        LSTItemFactory.material("LENGSHANG_YS_WJTL_DXGEO_MDJH","QUARTZ_BRICKS",false,"&6&l定向GEO · &5末地精华","&7从虚无中缓慢生成&5末地精华","&8⇨ &7速度: &b每 30 粘液刻生成一次","&8⇨ &e⚡&7 90000 J 可存储","&8⇨ &e⚡&7 9000 J/s");
        // LENGSHANG_YS_WJTL_DXGEO_XCLX
        LSTItemFactory.material("LENGSHANG_YS_WJTL_DXGEO_XCLX","QUARTZ_BRICKS",false,"&6&l定向GEO · &6星尘流星","&7从虚无中缓慢生成&6星尘流星","&8⇨ &7速度: &b每 30 粘液刻生成一次","&8⇨ &e⚡&7 90000 J 可存储","&8⇨ &e⚡&7 9000 J/s");
        // LENGSHANG_YS_WJTL_DXGEO_MTXJ
        LSTItemFactory.material("LENGSHANG_YS_WJTL_DXGEO_MTXJ","QUARTZ_BRICKS",false,"&6&l定向GEO · &x&F&F&B&6&C&1莓糖星酱","&7从虚无中缓慢生成&x&F&F&B&6&C&1莓糖星酱","&8⇨ &7速度: &b每 30 粘液刻生成一次","&8⇨ &e⚡&7 90000 J 可存储","&8⇨ &e⚡&7 9000 J/s");
        // LENGSHANG_YS_WJTL_DXGEO_BLS
        LSTItemFactory.material("LENGSHANG_YS_WJTL_DXGEO_BLS","QUARTZ_BRICKS",false,"&6&l定向GEO · &b&l箔澜沙","&7从虚无中缓慢生成&b&l箔澜沙","&8⇨ &7速度: &b每 30 粘液刻生成一次","&8⇨ &e⚡&7 90000 J 可存储","&8⇨ &e⚡&7 9000 J/s");
        // LENGSHANG_YS_WJTL_DXGEO_YTB
        LSTItemFactory.material("LENGSHANG_YS_WJTL_DXGEO_YTB","QUARTZ_BRICKS",false,"&6&l定向GEO · &b&l陨土碑","&7从虚无中缓慢生成&b&l陨土碑","&8⇨ &7速度: &b每 30 粘液刻生成一次","&8⇨ &e⚡&7 90000 J 可存储","&8⇨ &e⚡&7 9000 J/s");
        // LENGSHANG_BLYTJ
        LSTItemFactory.material("LENGSHANG_BLYTJ","SOUL_LANTERN",false,"&d悖论一体机","&7稳定生产悖论","&7既是合成方式也是摆放结构...","&x&F&E&3&C&3&C冷&x&F&A&1&6&6&9殇&x&E&5&1&C&9&3科&x&B&C&3&B&B&7技&e材料生成器","&8⇨ &7速度: &b每 1 粘液刻生成一次","&8⇨ &e⚡&7 20000 J 可存储","&8⇨ &e⚡&7 2048 J/s");
        // LENGSHANG_BUGPFS
        LSTItemFactory.head("LENGSHANG_BUGPFS","20b13024045c5c0d6d2afb059ae9660f7ad020fd895bb75f64fcc02ddb07d327","&5BUG批发商","&7仿佛看见了黑奴lengshang在不停的从版本与说明拿BUG出来...","&7其实是注意到前期需要拿的BUG数量太多了所以出的(bushi","&x&F&E&3&C&3&C冷&x&F&A&1&6&6&9殇&x&E&5&1&C&9&3科&x&B&C&3&B&B&7技&e材料生成器","&8⇨ &7速度: &b每 3 粘液刻生成一次","&8⇨ &e⚡&7 10000 J 可存储","&8⇨ &e⚡&7 1145 J/s");
        // LENGSHANG_FGNWZTHJ
        LSTItemFactory.material("LENGSHANG_FGNWZTHJ","SCULK",false,"&d反概念物质同化机","&7用于帮你自动化同化方块","&7避免因反概念物质卡服","&x&F&E&3&C&3&C冷&x&F&A&1&6&6&9殇&x&E&5&1&C&9&3科&x&B&C&3&B&B&7技&e材料生成器","&8⇨ &7速度: &b每 64 粘液刻生成一次","&8⇨ &e⚡&7 100000 J 可存储","&8⇨ &e⚡&7 1000 J/s");
        // LENGSHANG_DD_KSSCQ_1
        LSTItemFactory.material("LENGSHANG_DD_KSSCQ_1","BLAST_FURNACE",false,"&6堆叠 · &a矿石生成器 - I","&e材料生成器","&8⇨ &7速度: &b每 60 粘液刻生成一次","&8⇨ &e⚡&7 6400 J 可存储","&8⇨ &e⚡&7 100 J/s");
        // LENGSHANG_DD_KSSCQ_2
        LSTItemFactory.material("LENGSHANG_DD_KSSCQ_2","BLAST_FURNACE",false,"&6堆叠 · &a矿石生成器 - II","&e材料生成器","&8⇨ &7速度: &b每 30 粘液刻生成一次","&8⇨ &e⚡&7 32000 J 可存储","&8⇨ &e⚡&7 500 J/s");
        // LENGSHANG_DD_KSSCQ_3
        LSTItemFactory.material("LENGSHANG_DD_KSSCQ_3","BLAST_FURNACE",false,"&6堆叠 · &a矿石生成器 - III","&e材料生成器","&8⇨ &7速度: &b每 10 粘液刻生成一次","&8⇨ &e⚡&7 64000 J 可存储","&8⇨ &e⚡&7 1000 J/s");
        // LENGSHANG_DD_YS_KSSCQ_1
        LSTItemFactory.material("LENGSHANG_DD_YS_KSSCQ_1","BLAST_FURNACE",false,"&6堆叠 · &d压缩 · 矿石生成器 - I","&e材料生成器","&8⇨ &7速度: &b每 60 粘液刻生成一次","&8⇨ &e⚡&7 64000 J 可存储","&8⇨ &e⚡&7 1000 J/s");
        // LENGSHANG_DD_YS_KSSCQ_2
        LSTItemFactory.material("LENGSHANG_DD_YS_KSSCQ_2","BLAST_FURNACE",false,"&6堆叠 · &d压缩 · 矿石生成器 - II","&e材料生成器","&8⇨ &7速度: &b每 30 粘液刻生成一次","&8⇨ &e⚡&7 320000 J 可存储","&8⇨ &e⚡&7 5000 J/s");
        // LENGSHANG_DD_YS_KSSCQ_3
        LSTItemFactory.material("LENGSHANG_DD_YS_KSSCQ_3","BLAST_FURNACE",false,"&6堆叠 · &d压缩 · 矿石生成器 - III","&e材料生成器","&8⇨ &7速度: &b每 10 粘液刻生成一次","&8⇨ &e⚡&7 640000 J 可存储","&8⇨ &e⚡&7 10000 J/s");
        // LENGSHANG_DD_YS_ZQ_KSSCQ_1
        LSTItemFactory.material("LENGSHANG_DD_YS_ZQ_KSSCQ_1","BLAST_FURNACE",false,"&6堆叠 · &e压缩 · 矿石生成器 - I","&e材料生成器","&8⇨ &7速度: &b每 1 粘液刻生成一次","&8⇨ &e⚡&7 640000 J 可存储","&8⇨ &e⚡&7 10000 J/s");
        // LENGSHANG_DD_YS_ZQ_KSSCQ_2
        LSTItemFactory.material("LENGSHANG_DD_YS_ZQ_KSSCQ_2","BLAST_FURNACE",false,"&6堆叠 · &e压缩 · 矿石生成器 - II","&e材料生成器","&8⇨ &7速度: &b每 1 粘液刻生成一次","&8⇨ &e⚡&7 3200000 J 可存储","&8⇨ &e⚡&7 50000 J/s");
        // LENGSHANG_DD_YS_ZQ_KSSCQ_3
        LSTItemFactory.material("LENGSHANG_DD_YS_ZQ_KSSCQ_3","BLAST_FURNACE",false,"&6堆叠 · &e压缩 · 矿石生成器 - III","&e材料生成器","&8⇨ &7速度: &b每 1 粘液刻生成一次","&8⇨ &e⚡&7 6400000 J 可存储","&8⇨ &e⚡&7 100000 J/s");
        // LENGSHANG_DD_KWSCQ_1
        LSTItemFactory.material("LENGSHANG_DD_KWSCQ_1","BLAST_FURNACE",false,"&6堆叠 · &a矿物生成器 - I","&e材料生成器","&8⇨ &7速度: &b每 60 粘液刻生成一次","&8⇨ &e⚡&7 6400 J 可存储","&8⇨ &e⚡&7 100 J/s");
        // LENGSHANG_DD_KWSCQ_2
        LSTItemFactory.material("LENGSHANG_DD_KWSCQ_2","BLAST_FURNACE",false,"&6堆叠 · &a矿物生成器 - II","&e材料生成器","&8⇨ &7速度: &b每 30 粘液刻生成一次","&8⇨ &e⚡&7 32000 J 可存储","&8⇨ &e⚡&7 500 J/s");
        // LENGSHANG_DD_KWSCQ_3
        LSTItemFactory.material("LENGSHANG_DD_KWSCQ_3","BLAST_FURNACE",false,"&6堆叠 · &a矿物生成器 - III","&e材料生成器","&8⇨ &7速度: &b每 10 粘液刻生成一次","&8⇨ &e⚡&7 64000 J 可存储","&8⇨ &e⚡&7 1000 J/s");
        // LENGSHANG_DD_YS_KWSCQ_1
        LSTItemFactory.material("LENGSHANG_DD_YS_KWSCQ_1","BLAST_FURNACE",false,"&6堆叠 · &d压缩 · 矿物生成器 - I","&e材料生成器","&8⇨ &7速度: &b每 60 粘液刻生成一次","&8⇨ &e⚡&7 64000 J 可存储","&8⇨ &e⚡&7 1000 J/s");
        // LENGSHANG_DD_YS_KWSCQ_2
        LSTItemFactory.material("LENGSHANG_DD_YS_KWSCQ_2","BLAST_FURNACE",false,"&6堆叠 · &d压缩 · 矿物生成器 - II","&e材料生成器","&8⇨ &7速度: &b每 30 粘液刻生成一次","&8⇨ &e⚡&7 320000 J 可存储","&8⇨ &e⚡&7 5000 J/s");
        // LENGSHANG_DD_YS_KWSCQ_3
        LSTItemFactory.material("LENGSHANG_DD_YS_KWSCQ_3","BLAST_FURNACE",false,"&6堆叠 · &d压缩 · 矿物生成器 - III","&e材料生成器","&8⇨ &7速度: &b每 10 粘液刻生成一次","&8⇨ &e⚡&7 640000 J 可存储","&8⇨ &e⚡&7 10000 J/s");
        // LENGSHANG_DD_YS_ZQ_KWSCQ_1
        LSTItemFactory.material("LENGSHANG_DD_YS_ZQ_KWSCQ_1","BLAST_FURNACE",false,"&6堆叠 · &e压缩 · 矿物生成器 - I","&e材料生成器","&8⇨ &7速度: &b每 1 粘液刻生成一次","&8⇨ &e⚡&7 640000 J 可存储","&8⇨ &e⚡&7 10000 J/s");
        // LENGSHANG_DD_YS_ZQ_KWSCQ_2
        LSTItemFactory.material("LENGSHANG_DD_YS_ZQ_KWSCQ_2","BLAST_FURNACE",false,"&6堆叠 · &e压缩 · 矿物生成器 - II","&e材料生成器","&8⇨ &7速度: &b每 1 粘液刻生成一次","&8⇨ &e⚡&7 3200000 J 可存储","&8⇨ &e⚡&7 50000 J/s");
        // LENGSHANG_DD_YS_ZQ_KWSCQ_3
        LSTItemFactory.material("LENGSHANG_DD_YS_ZQ_KWSCQ_3","BLAST_FURNACE",false,"&6堆叠 · &e压缩 · 矿物生成器 - III","&e材料生成器","&8⇨ &7速度: &b每 1 粘液刻生成一次","&8⇨ &e⚡&7 6400000 J 可存储","&8⇨ &e⚡&7 100000 J/s");
        // LENGSHANG_DD_FKSCQ_1
        LSTItemFactory.material("LENGSHANG_DD_FKSCQ_1","BLAST_FURNACE",false,"&6堆叠 · &a方块生成器 - I","&e材料生成器","&8⇨ &7速度: &b每 60 粘液刻生成一次","&8⇨ &e⚡&7 6400 J 可存储","&8⇨ &e⚡&7 100 J/s");
        // LENGSHANG_DD_FKSCQ_2
        LSTItemFactory.material("LENGSHANG_DD_FKSCQ_2","BLAST_FURNACE",false,"&6堆叠 · &a方块生成器 - II","&e材料生成器","&8⇨ &7速度: &b每 30 粘液刻生成一次","&8⇨ &e⚡&7 32000 J 可存储","&8⇨ &e⚡&7 500 J/s");
        // LENGSHANG_DD_FKSCQ_3
        LSTItemFactory.material("LENGSHANG_DD_FKSCQ_3","BLAST_FURNACE",false,"&6堆叠 · &a方块生成器 - III","&e材料生成器","&8⇨ &7速度: &b每 10 粘液刻生成一次","&8⇨ &e⚡&7 64000 J 可存储","&8⇨ &e⚡&7 1000 J/s");
        // LENGSHANG_DD_YS_FKSCQ_1
        LSTItemFactory.material("LENGSHANG_DD_YS_FKSCQ_1","BLAST_FURNACE",false,"&6堆叠 · &d压缩 · 方块生成器 - I","&e材料生成器","&8⇨ &7速度: &b每 60 粘液刻生成一次","&8⇨ &e⚡&7 64000 J 可存储","&8⇨ &e⚡&7 1000 J/s");
        // LENGSHANG_DD_YS_FKSCQ_2
        LSTItemFactory.material("LENGSHANG_DD_YS_FKSCQ_2","BLAST_FURNACE",false,"&6堆叠 · &d压缩 · 方块生成器 - II","&e材料生成器","&8⇨ &7速度: &b每 30 粘液刻生成一次","&8⇨ &e⚡&7 320000 J 可存储","&8⇨ &e⚡&7 5000 J/s");
        // LENGSHANG_DD_YS_FKSCQ_3
        LSTItemFactory.material("LENGSHANG_DD_YS_FKSCQ_3","BLAST_FURNACE",false,"&6堆叠 · &d压缩 · 方块生成器 - III","&e材料生成器","&8⇨ &7速度: &b每 10 粘液刻生成一次","&8⇨ &e⚡&7 640000 J 可存储","&8⇨ &e⚡&7 10000 J/s");
        // LENGSHANG_DD_YS_ZQ_FKSCQ_1
        LSTItemFactory.material("LENGSHANG_DD_YS_ZQ_FKSCQ_1","BLAST_FURNACE",false,"&6堆叠 · &e压缩 · 方块生成器 - I","&e材料生成器","&8⇨ &7速度: &b每 1 粘液刻生成一次","&8⇨ &e⚡&7 640000 J 可存储","&8⇨ &e⚡&7 10000 J/s");
        // LENGSHANG_DD_YS_ZQ_FKSCQ_2
        LSTItemFactory.material("LENGSHANG_DD_YS_ZQ_FKSCQ_2","BLAST_FURNACE",false,"&6堆叠 · &e压缩 · 方块生成器 - II","&e材料生成器","&8⇨ &7速度: &b每 1 粘液刻生成一次","&8⇨ &e⚡&7 3200000 J 可存储","&8⇨ &e⚡&7 50000 J/s");
        // LENGSHANG_DD_YS_ZQ_FKSCQ_3
        LSTItemFactory.material("LENGSHANG_DD_YS_ZQ_FKSCQ_3","BLAST_FURNACE",false,"&6堆叠 · &e压缩 · 方块生成器 - III","&e材料生成器","&8⇨ &7速度: &b每 1 粘液刻生成一次","&8⇨ &e⚡&7 6400000 J 可存储","&8⇨ &e⚡&7 100000 J/s");
        // LENGSHANG_DD_ZWSCQ_1
        LSTItemFactory.material("LENGSHANG_DD_ZWSCQ_1","BLAST_FURNACE",false,"&6堆叠 · &a杂物生成器 - I","&e材料生成器","&8⇨ &7速度: &b每 60 粘液刻生成一次","&8⇨ &e⚡&7 6400 J 可存储","&8⇨ &e⚡&7 100 J/s");
        // LENGSHANG_DD_ZWSCQ_2
        LSTItemFactory.material("LENGSHANG_DD_ZWSCQ_2","BLAST_FURNACE",false,"&6堆叠 · &a杂物生成器 - II","&e材料生成器","&8⇨ &7速度: &b每 30 粘液刻生成一次","&8⇨ &e⚡&7 32000 J 可存储","&8⇨ &e⚡&7 500 J/s");
        // LENGSHANG_DD_ZWSCQ_3
        LSTItemFactory.material("LENGSHANG_DD_ZWSCQ_3","BLAST_FURNACE",false,"&6堆叠 · &a杂物生成器 - III","&e材料生成器","&8⇨ &7速度: &b每 10 粘液刻生成一次","&8⇨ &e⚡&7 64000 J 可存储","&8⇨ &e⚡&7 1000 J/s");
        // LENGSHANG_DD_YS_ZWSCQ_1
        LSTItemFactory.material("LENGSHANG_DD_YS_ZWSCQ_1","BLAST_FURNACE",false,"&6堆叠 · &d压缩 · 杂物生成器 - I","&e材料生成器","&8⇨ &7速度: &b每 60 粘液刻生成一次","&8⇨ &e⚡&7 64000 J 可存储","&8⇨ &e⚡&7 1000 J/s");
        // LENGSHANG_DD_YS_ZWSCQ_2
        LSTItemFactory.material("LENGSHANG_DD_YS_ZWSCQ_2","BLAST_FURNACE",false,"&6堆叠 · &d压缩 · 杂物生成器 - II","&e材料生成器","&8⇨ &7速度: &b每 30 粘液刻生成一次","&8⇨ &e⚡&7 320000 J 可存储","&8⇨ &e⚡&7 5000 J/s");
        // LENGSHANG_DD_YS_ZWSCQ_3
        LSTItemFactory.material("LENGSHANG_DD_YS_ZWSCQ_3","BLAST_FURNACE",false,"&6堆叠 · &d压缩 · 杂物生成器 - III","&e材料生成器","&8⇨ &7速度: &b每 10 粘液刻生成一次","&8⇨ &e⚡&7 640000 J 可存储","&8⇨ &e⚡&7 10000 J/s");
        // LENGSHANG_DD_YS_ZQ_ZWSCQ_1
        LSTItemFactory.material("LENGSHANG_DD_YS_ZQ_ZWSCQ_1","BLAST_FURNACE",false,"&6堆叠 · &e压缩 · 杂物生成器 - I","&e材料生成器","&8⇨ &7速度: &b每 1 粘液刻生成一次","&8⇨ &e⚡&7 640000 J 可存储","&8⇨ &e⚡&7 10000 J/s");
        // LENGSHANG_DD_YS_ZQ_ZWSCQ_2
        LSTItemFactory.material("LENGSHANG_DD_YS_ZQ_ZWSCQ_2","BLAST_FURNACE",false,"&6堆叠 · &e压缩 · 杂物生成器 - II","&e材料生成器","&8⇨ &7速度: &b每 1 粘液刻生成一次","&8⇨ &e⚡&7 3200000 J 可存储","&8⇨ &e⚡&7 50000 J/s");
        // LENGSHANG_DD_YS_ZQ_ZWSCQ_3
        LSTItemFactory.material("LENGSHANG_DD_YS_ZQ_ZWSCQ_3","BLAST_FURNACE",false,"&6堆叠 · &e压缩 · 杂物生成器 - III","&e材料生成器","&8⇨ &7速度: &b每 1 粘液刻生成一次","&8⇨ &e⚡&7 6400000 J 可存储","&8⇨ &e⚡&7 100000 J/s");
        // LENGSHANG_DD_DLWSCQ_1
        LSTItemFactory.material("LENGSHANG_DD_DLWSCQ_1","BLAST_FURNACE",false,"&6堆叠 · &a掉落物生成器 - I","&e材料生成器","&8⇨ &7速度: &b每 60 粘液刻生成一次","&8⇨ &e⚡&7 6400 J 可存储","&8⇨ &e⚡&7 100 J/s");
        // LENGSHANG_DD_DLWSCQ_2
        LSTItemFactory.material("LENGSHANG_DD_DLWSCQ_2","BLAST_FURNACE",false,"&6堆叠 · &a掉落物生成器 - II","&e材料生成器","&8⇨ &7速度: &b每 30 粘液刻生成一次","&8⇨ &e⚡&7 32000 J 可存储","&8⇨ &e⚡&7 500 J/s");
        // LENGSHANG_DD_DLWSCQ_3
        LSTItemFactory.material("LENGSHANG_DD_DLWSCQ_3","BLAST_FURNACE",false,"&6堆叠 · &a掉落物生成器 - III","&e材料生成器","&8⇨ &7速度: &b每 10 粘液刻生成一次","&8⇨ &e⚡&7 64000 J 可存储","&8⇨ &e⚡&7 1000 J/s");
        // LENGSHANG_DD_YS_DLWSCQ_1
        LSTItemFactory.material("LENGSHANG_DD_YS_DLWSCQ_1","BLAST_FURNACE",false,"&6堆叠 · &d压缩 · 掉落物生成器 - I","&e材料生成器","&8⇨ &7速度: &b每 60 粘液刻生成一次","&8⇨ &e⚡&7 64000 J 可存储","&8⇨ &e⚡&7 1000 J/s");
    }

    public static void register(LengShangEvo plugin) {
    }

    private LSTItems38() {
    }
}
