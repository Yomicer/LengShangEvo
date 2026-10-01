package io.Yomicer.LengShangTech.gen;

import io.Yomicer.LengShangTech.core.*;
import io.Yomicer.LengShangTech.scripts.LSTScriptBridge;
import io.Yomicer.LengShangTech.scripts.LSTBlockDrops;
import io.Yomicer.LengShangTech.LengShangEvo;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import org.bukkit.inventory.ItemStack;

/** 冷殇物品定义 (自动转换, 第 40 批)。 */
public final class LSTItems39 {

    public static void create() {
        // LENGSHANG_DD_YS_DLWSCQ_2
        LSTItemFactory.material("LENGSHANG_DD_YS_DLWSCQ_2","BLAST_FURNACE",false,"&6堆叠 · &d压缩 · 掉落物生成器 - II","&e材料生成器","&8⇨ &7速度: &b每 30 粘液刻生成一次","&8⇨ &e⚡&7 320000 J 可存储","&8⇨ &e⚡&7 5000 J/s");
        // LENGSHANG_DD_YS_DLWSCQ_3
        LSTItemFactory.material("LENGSHANG_DD_YS_DLWSCQ_3","BLAST_FURNACE",false,"&6堆叠 · &d压缩 · 掉落物生成器 - III","&e材料生成器","&8⇨ &7速度: &b每 10 粘液刻生成一次","&8⇨ &e⚡&7 640000 J 可存储","&8⇨ &e⚡&7 10000 J/s");
        // LENGSHANG_DD_YS_ZQ_DLWSCQ_1
        LSTItemFactory.material("LENGSHANG_DD_YS_ZQ_DLWSCQ_1","BLAST_FURNACE",false,"&6堆叠 · &e压缩 · 掉落物生成器 - I","&e材料生成器","&8⇨ &7速度: &b每 1 粘液刻生成一次","&8⇨ &e⚡&7 640000 J 可存储","&8⇨ &e⚡&7 10000 J/s");
        // LENGSHANG_DD_YS_ZQ_DLWSCQ_2
        LSTItemFactory.material("LENGSHANG_DD_YS_ZQ_DLWSCQ_2","BLAST_FURNACE",false,"&6堆叠 · &e压缩 · 掉落物生成器 - II","&e材料生成器","&8⇨ &7速度: &b每 1 粘液刻生成一次","&8⇨ &e⚡&7 3200000 J 可存储","&8⇨ &e⚡&7 50000 J/s");
        // LENGSHANG_DD_YS_ZQ_DLWSCQ_3
        LSTItemFactory.material("LENGSHANG_DD_YS_ZQ_DLWSCQ_3","BLAST_FURNACE",false,"&6堆叠 · &e压缩 · 掉落物生成器 - III","&e材料生成器","&8⇨ &7速度: &b每 1 粘液刻生成一次","&8⇨ &e⚡&7 6400000 J 可存储","&8⇨ &e⚡&7 100000 J/s");
        // LENGSHANG_DD_SWSCQ_1
        LSTItemFactory.material("LENGSHANG_DD_SWSCQ_1","BLAST_FURNACE",false,"&6堆叠 · &a食物生成器 - I","&e材料生成器","&8⇨ &7速度: &b每 60 粘液刻生成一次","&8⇨ &e⚡&7 6400 J 可存储","&8⇨ &e⚡&7 100 J/s");
        // LENGSHANG_DD_SWSCQ_2
        LSTItemFactory.material("LENGSHANG_DD_SWSCQ_2","BLAST_FURNACE",false,"&6堆叠 · &a食物生成器 - II","&e材料生成器","&8⇨ &7速度: &b每 30 粘液刻生成一次","&8⇨ &e⚡&7 32000 J 可存储","&8⇨ &e⚡&7 500 J/s");
        // LENGSHANG_DD_SWSCQ_3
        LSTItemFactory.material("LENGSHANG_DD_SWSCQ_3","BLAST_FURNACE",false,"&6堆叠 · &a食物生成器 - III","&e材料生成器","&8⇨ &7速度: &b每 10 粘液刻生成一次","&8⇨ &e⚡&7 64000 J 可存储","&8⇨ &e⚡&7 1000 J/s");
        // LENGSHANG_DD_YS_SWSCQ_1
        LSTItemFactory.material("LENGSHANG_DD_YS_SWSCQ_1","BLAST_FURNACE",false,"&6堆叠 · &d压缩 · 食物生成器 - I","&e材料生成器","&8⇨ &7速度: &b每 60 粘液刻生成一次","&8⇨ &e⚡&7 64000 J 可存储","&8⇨ &e⚡&7 1000 J/s");
        // LENGSHANG_DD_YS_SWSCQ_2
        LSTItemFactory.material("LENGSHANG_DD_YS_SWSCQ_2","BLAST_FURNACE",false,"&6堆叠 · &d压缩 · 食物生成器 - II","&e材料生成器","&8⇨ &7速度: &b每 30 粘液刻生成一次","&8⇨ &e⚡&7 320000 J 可存储","&8⇨ &e⚡&7 5000 J/s");
        // LENGSHANG_DD_YS_SWSCQ_3
        LSTItemFactory.material("LENGSHANG_DD_YS_SWSCQ_3","BLAST_FURNACE",false,"&6堆叠 · &d压缩 · 食物生成器 - III","&e材料生成器","&8⇨ &7速度: &b每 10 粘液刻生成一次","&8⇨ &e⚡&7 640000 J 可存储","&8⇨ &e⚡&7 10000 J/s");
        // LENGSHANG_DD_YS_ZQ_SWSCQ_1
        LSTItemFactory.material("LENGSHANG_DD_YS_ZQ_SWSCQ_1","BLAST_FURNACE",false,"&6堆叠 · &e压缩 · 食物生成器 - I","&e材料生成器","&8⇨ &7速度: &b每 1 粘液刻生成一次","&8⇨ &e⚡&7 640000 J 可存储","&8⇨ &e⚡&7 10000 J/s");
        // LENGSHANG_DD_YS_ZQ_SWSCQ_2
        LSTItemFactory.material("LENGSHANG_DD_YS_ZQ_SWSCQ_2","BLAST_FURNACE",false,"&6堆叠 · &e压缩 · 食物生成器 - II","&e材料生成器","&8⇨ &7速度: &b每 1 粘液刻生成一次","&8⇨ &e⚡&7 3200000 J 可存储","&8⇨ &e⚡&7 50000 J/s");
        // LENGSHANG_DD_YS_ZQ_SWSCQ_3
        LSTItemFactory.material("LENGSHANG_DD_YS_ZQ_SWSCQ_3","BLAST_FURNACE",false,"&6堆叠 · &e压缩 · 食物生成器 - III","&e材料生成器","&8⇨ &7速度: &b每 1 粘液刻生成一次","&8⇨ &e⚡&7 6400000 J 可存储","&8⇨ &e⚡&7 100000 J/s");
        // LENGSHANG_DD_YMSCQ_1
        LSTItemFactory.material("LENGSHANG_DD_YMSCQ_1","BLAST_FURNACE",false,"&6堆叠 · &a原木生成器 - I","&e材料生成器","&8⇨ &7速度: &b每 60 粘液刻生成一次","&8⇨ &e⚡&7 6400 J 可存储","&8⇨ &e⚡&7 100 J/s");
        // LENGSHANG_DD_YMSCQ_2
        LSTItemFactory.material("LENGSHANG_DD_YMSCQ_2","BLAST_FURNACE",false,"&6堆叠 · &a原木生成器 - II","&e材料生成器","&8⇨ &7速度: &b每 30 粘液刻生成一次","&8⇨ &e⚡&7 32000 J 可存储","&8⇨ &e⚡&7 500 J/s");
        // LENGSHANG_DD_YMSCQ_3
        LSTItemFactory.material("LENGSHANG_DD_YMSCQ_3","BLAST_FURNACE",false,"&6堆叠 · &a原木生成器 - III","&e材料生成器","&8⇨ &7速度: &b每 10 粘液刻生成一次","&8⇨ &e⚡&7 64000 J 可存储","&8⇨ &e⚡&7 1000 J/s");
        // LENGSHANG_DD_YS_YMSCQ_1
        LSTItemFactory.material("LENGSHANG_DD_YS_YMSCQ_1","BLAST_FURNACE",false,"&6堆叠 · &d压缩 · 原木生成器 - I","&e材料生成器","&8⇨ &7速度: &b每 60 粘液刻生成一次","&8⇨ &e⚡&7 64000 J 可存储","&8⇨ &e⚡&7 1000 J/s");
        // LENGSHANG_DD_YS_YMSCQ_2
        LSTItemFactory.material("LENGSHANG_DD_YS_YMSCQ_2","BLAST_FURNACE",false,"&6堆叠 · &d压缩 · 原木生成器 - II","&e材料生成器","&8⇨ &7速度: &b每 30 粘液刻生成一次","&8⇨ &e⚡&7 320000 J 可存储","&8⇨ &e⚡&7 5000 J/s");
        // LENGSHANG_DD_YS_YMSCQ_3
        LSTItemFactory.material("LENGSHANG_DD_YS_YMSCQ_3","BLAST_FURNACE",false,"&6堆叠 · &d压缩 · 原木生成器 - III","&e材料生成器","&8⇨ &7速度: &b每 10 粘液刻生成一次","&8⇨ &e⚡&7 640000 J 可存储","&8⇨ &e⚡&7 10000 J/s");
        // LENGSHANG_DD_YS_ZQ_YMSCQ_1
        LSTItemFactory.material("LENGSHANG_DD_YS_ZQ_YMSCQ_1","BLAST_FURNACE",false,"&6堆叠 · &e压缩 · 原木生成器 - I","&e材料生成器","&8⇨ &7速度: &b每 1 粘液刻生成一次","&8⇨ &e⚡&7 640000 J 可存储","&8⇨ &e⚡&7 10000 J/s");
        // LENGSHANG_DD_YS_ZQ_YMSCQ_2
        LSTItemFactory.material("LENGSHANG_DD_YS_ZQ_YMSCQ_2","BLAST_FURNACE",false,"&6堆叠 · &e压缩 · 原木生成器 - II","&e材料生成器","&8⇨ &7速度: &b每 1 粘液刻生成一次","&8⇨ &e⚡&7 3200000 J 可存储","&8⇨ &e⚡&7 50000 J/s");
        // LENGSHANG_DD_YS_ZQ_YMSCQ_3
        LSTItemFactory.material("LENGSHANG_DD_YS_ZQ_YMSCQ_3","BLAST_FURNACE",false,"&6堆叠 · &e压缩 · 原木生成器 - III","&e材料生成器","&8⇨ &7速度: &b每 1 粘液刻生成一次","&8⇨ &e⚡&7 6400000 J 可存储","&8⇨ &e⚡&7 100000 J/s");
        // LENGSHANG_DD_RLSCQ_1
        LSTItemFactory.material("LENGSHANG_DD_RLSCQ_1","BLAST_FURNACE",false,"&6堆叠 · &a染料生成器 - I","&e材料生成器","&8⇨ &7速度: &b每 60 粘液刻生成一次","&8⇨ &e⚡&7 6400 J 可存储","&8⇨ &e⚡&7 100 J/s");
        // LENGSHANG_DD_RLSCQ_2
        LSTItemFactory.material("LENGSHANG_DD_RLSCQ_2","BLAST_FURNACE",false,"&6堆叠 · &a染料生成器 - II","&e材料生成器","&8⇨ &7速度: &b每 30 粘液刻生成一次","&8⇨ &e⚡&7 32000 J 可存储","&8⇨ &e⚡&7 500 J/s");
        // LENGSHANG_DD_RLSCQ_3
        LSTItemFactory.material("LENGSHANG_DD_RLSCQ_3","BLAST_FURNACE",false,"&6堆叠 · &a染料生成器 - III","&e材料生成器","&8⇨ &7速度: &b每 10 粘液刻生成一次","&8⇨ &e⚡&7 64000 J 可存储","&8⇨ &e⚡&7 1000 J/s");
        // LENGSHANG_DD_YS_RLSCQ_1
        LSTItemFactory.material("LENGSHANG_DD_YS_RLSCQ_1","BLAST_FURNACE",false,"&6堆叠 · &d压缩 · 染料生成器 - I","&e材料生成器","&8⇨ &7速度: &b每 60 粘液刻生成一次","&8⇨ &e⚡&7 64000 J 可存储","&8⇨ &e⚡&7 1000 J/s");
        // LENGSHANG_DD_YS_RLSCQ_2
        LSTItemFactory.material("LENGSHANG_DD_YS_RLSCQ_2","BLAST_FURNACE",false,"&6堆叠 · &d压缩 · 染料生成器 - II","&e材料生成器","&8⇨ &7速度: &b每 30 粘液刻生成一次","&8⇨ &e⚡&7 320000 J 可存储","&8⇨ &e⚡&7 5000 J/s");
        // LENGSHANG_DD_YS_RLSCQ_3
        LSTItemFactory.material("LENGSHANG_DD_YS_RLSCQ_3","BLAST_FURNACE",false,"&6堆叠 · &d压缩 · 染料生成器 - III","&e材料生成器","&8⇨ &7速度: &b每 10 粘液刻生成一次","&8⇨ &e⚡&7 640000 J 可存储","&8⇨ &e⚡&7 10000 J/s");
        // LENGSHANG_DD_YS_ZQ_RLSCQ_1
        LSTItemFactory.material("LENGSHANG_DD_YS_ZQ_RLSCQ_1","BLAST_FURNACE",false,"&6堆叠 · &e压缩 · 染料生成器 - I","&e材料生成器","&8⇨ &7速度: &b每 1 粘液刻生成一次","&8⇨ &e⚡&7 640000 J 可存储","&8⇨ &e⚡&7 10000 J/s");
        // LENGSHANG_DD_YS_ZQ_RLSCQ_2
        LSTItemFactory.material("LENGSHANG_DD_YS_ZQ_RLSCQ_2","BLAST_FURNACE",false,"&6堆叠 · &e压缩 · 染料生成器 - II","&e材料生成器","&8⇨ &7速度: &b每 1 粘液刻生成一次","&8⇨ &e⚡&7 3200000 J 可存储","&8⇨ &e⚡&7 50000 J/s");
        // LENGSHANG_DD_YS_ZQ_RLSCQ_3
        LSTItemFactory.material("LENGSHANG_DD_YS_ZQ_RLSCQ_3","BLAST_FURNACE",false,"&6堆叠 · &e压缩 · 染料生成器 - III","&e材料生成器","&8⇨ &7速度: &b每 1 粘液刻生成一次","&8⇨ &e⚡&7 6400000 J 可存储","&8⇨ &e⚡&7 100000 J/s");
        // LENGSHANG_DD_KWKSCQ_1
        LSTItemFactory.material("LENGSHANG_DD_KWKSCQ_1","BLAST_FURNACE",false,"&6堆叠 · &a矿物块生成器 - I","&e材料生成器","&8⇨ &7速度: &b每 60 粘液刻生成一次","&8⇨ &e⚡&7 6400 J 可存储","&8⇨ &e⚡&7 100 J/s");
        // LENGSHANG_DD_KWKSCQ_2
        LSTItemFactory.material("LENGSHANG_DD_KWKSCQ_2","BLAST_FURNACE",false,"&6堆叠 · &a矿物块生成器 - II","&e材料生成器","&8⇨ &7速度: &b每 30 粘液刻生成一次","&8⇨ &e⚡&7 32000 J 可存储","&8⇨ &e⚡&7 500 J/s");
        // LENGSHANG_DD_KWKSCQ_3
        LSTItemFactory.material("LENGSHANG_DD_KWKSCQ_3","BLAST_FURNACE",false,"&6堆叠 · &a矿物块生成器 - III","&e材料生成器","&8⇨ &7速度: &b每 10 粘液刻生成一次","&8⇨ &e⚡&7 64000 J 可存储","&8⇨ &e⚡&7 1000 J/s");
        // LENGSHANG_DD_YS_KWKSCQ_1
        LSTItemFactory.material("LENGSHANG_DD_YS_KWKSCQ_1","BLAST_FURNACE",false,"&6堆叠 · &d压缩 · 矿物块生成器 - I","&e材料生成器","&8⇨ &7速度: &b每 60 粘液刻生成一次","&8⇨ &e⚡&7 64000 J 可存储","&8⇨ &e⚡&7 1000 J/s");
        // LENGSHANG_DD_YS_KWKSCQ_2
        LSTItemFactory.material("LENGSHANG_DD_YS_KWKSCQ_2","BLAST_FURNACE",false,"&6堆叠 · &d压缩 · 矿物块生成器 - II","&e材料生成器","&8⇨ &7速度: &b每 30 粘液刻生成一次","&8⇨ &e⚡&7 320000 J 可存储","&8⇨ &e⚡&7 5000 J/s");
        // LENGSHANG_DD_YS_KWKSCQ_3
        LSTItemFactory.material("LENGSHANG_DD_YS_KWKSCQ_3","BLAST_FURNACE",false,"&6堆叠 · &d压缩 · 矿物块生成器 - III","&e材料生成器","&8⇨ &7速度: &b每 10 粘液刻生成一次","&8⇨ &e⚡&7 640000 J 可存储","&8⇨ &e⚡&7 10000 J/s");
        // LENGSHANG_DD_YS_ZQ_KWKSCQ_1
        LSTItemFactory.material("LENGSHANG_DD_YS_ZQ_KWKSCQ_1","BLAST_FURNACE",false,"&6堆叠 · &e压缩 · 矿物块生成器 - I","&e材料生成器","&8⇨ &7速度: &b每 1 粘液刻生成一次","&8⇨ &e⚡&7 640000 J 可存储","&8⇨ &e⚡&7 10000 J/s");
        // LENGSHANG_DD_YS_ZQ_KWKSCQ_2
        LSTItemFactory.material("LENGSHANG_DD_YS_ZQ_KWKSCQ_2","BLAST_FURNACE",false,"&6堆叠 · &e压缩 · 矿物块生成器 - II","&e材料生成器","&8⇨ &7速度: &b每 1 粘液刻生成一次","&8⇨ &e⚡&7 3200000 J 可存储","&8⇨ &e⚡&7 50000 J/s");
        // LENGSHANG_DD_YS_ZQ_KWKSCQ_3
        LSTItemFactory.material("LENGSHANG_DD_YS_ZQ_KWKSCQ_3","BLAST_FURNACE",false,"&6堆叠 · &e压缩 · 矿物块生成器 - III","&e材料生成器","&8⇨ &7速度: &b每 1 粘液刻生成一次","&8⇨ &e⚡&7 6400000 J 可存储","&8⇨ &e⚡&7 100000 J/s");
        // LENGSHANG_DD_SF_KFSCQ_1
        LSTItemFactory.material("LENGSHANG_DD_SF_KFSCQ_1","BLAST_FURNACE",false,"&6堆叠 · &a矿粉生成器 - I","&e材料生成器","&8⇨ &7速度: &b每 60 粘液刻生成一次","&8⇨ &e⚡&7 6400 J 可存储","&8⇨ &e⚡&7 100 J/s");
        // LENGSHANG_DD_SF_KFSCQ_2
        LSTItemFactory.material("LENGSHANG_DD_SF_KFSCQ_2","BLAST_FURNACE",false,"&6堆叠 · &a矿粉生成器 - II","&e材料生成器","&8⇨ &7速度: &b每 30 粘液刻生成一次","&8⇨ &e⚡&7 32000 J 可存储","&8⇨ &e⚡&7 500 J/s");
        // LENGSHANG_DD_SF_KFSCQ_3
        LSTItemFactory.material("LENGSHANG_DD_SF_KFSCQ_3","BLAST_FURNACE",false,"&6堆叠 · &a矿粉生成器 - III","&e材料生成器","&8⇨ &7速度: &b每 10 粘液刻生成一次","&8⇨ &e⚡&7 64000 J 可存储","&8⇨ &e⚡&7 1000 J/s");
        // LENGSHANG_DD_YS_SF_KFSCQ_1
        LSTItemFactory.material("LENGSHANG_DD_YS_SF_KFSCQ_1","BLAST_FURNACE",false,"&6堆叠 · &d压缩 · 矿粉生成器 - I","&e材料生成器","&8⇨ &7速度: &b每 60 粘液刻生成一次","&8⇨ &e⚡&7 64000 J 可存储","&8⇨ &e⚡&7 1000 J/s");
        // LENGSHANG_DD_YS_SF_KFSCQ_2
        LSTItemFactory.material("LENGSHANG_DD_YS_SF_KFSCQ_2","BLAST_FURNACE",false,"&6堆叠 · &d压缩 · 矿粉生成器 - II","&e材料生成器","&8⇨ &7速度: &b每 30 粘液刻生成一次","&8⇨ &e⚡&7 320000 J 可存储","&8⇨ &e⚡&7 5000 J/s");
        // LENGSHANG_DD_YS_SF_KFSCQ_3
        LSTItemFactory.material("LENGSHANG_DD_YS_SF_KFSCQ_3","BLAST_FURNACE",false,"&6堆叠 · &d压缩 · 矿粉生成器 - III","&e材料生成器","&8⇨ &7速度: &b每 10 粘液刻生成一次","&8⇨ &e⚡&7 640000 J 可存储","&8⇨ &e⚡&7 10000 J/s");
        // LENGSHANG_DD_YS_ZQ_SF_KFSCQ_1
        LSTItemFactory.material("LENGSHANG_DD_YS_ZQ_SF_KFSCQ_1","BLAST_FURNACE",false,"&6堆叠 · &e压缩 · 矿粉生成器 - I","&e材料生成器","&8⇨ &7速度: &b每 1 粘液刻生成一次","&8⇨ &e⚡&7 640000 J 可存储","&8⇨ &e⚡&7 10000 J/s");
        // LENGSHANG_DD_YS_ZQ_SF_KFSCQ_2
        LSTItemFactory.material("LENGSHANG_DD_YS_ZQ_SF_KFSCQ_2","BLAST_FURNACE",false,"&6堆叠 · &e压缩 · 矿粉生成器 - II","&e材料生成器","&8⇨ &7速度: &b每 1 粘液刻生成一次","&8⇨ &e⚡&7 3200000 J 可存储","&8⇨ &e⚡&7 50000 J/s");
        // LENGSHANG_DD_YS_ZQ_SF_KFSCQ_3
        LSTItemFactory.material("LENGSHANG_DD_YS_ZQ_SF_KFSCQ_3","BLAST_FURNACE",false,"&6堆叠 · &e压缩 · 矿粉生成器 - III","&e材料生成器","&8⇨ &7速度: &b每 1 粘液刻生成一次","&8⇨ &e⚡&7 6400000 J 可存储","&8⇨ &e⚡&7 100000 J/s");
        // LENGSHANG_DD_SF_ZYSCQ_1
        LSTItemFactory.material("LENGSHANG_DD_SF_ZYSCQ_1","BLAST_FURNACE",false,"&6堆叠 · &a资源生成器 - I","&e材料生成器","&8⇨ &7速度: &b每 60 粘液刻生成一次","&8⇨ &e⚡&7 6400 J 可存储","&8⇨ &e⚡&7 100 J/s");
        // LENGSHANG_DD_SF_ZYSCQ_2
        LSTItemFactory.material("LENGSHANG_DD_SF_ZYSCQ_2","BLAST_FURNACE",false,"&6堆叠 · &a资源生成器 - II","&e材料生成器","&8⇨ &7速度: &b每 30 粘液刻生成一次","&8⇨ &e⚡&7 32000 J 可存储","&8⇨ &e⚡&7 500 J/s");
        // LENGSHANG_DD_SF_ZYSCQ_3
        LSTItemFactory.material("LENGSHANG_DD_SF_ZYSCQ_3","BLAST_FURNACE",false,"&6堆叠 · &a资源生成器 - III","&e材料生成器","&8⇨ &7速度: &b每 10 粘液刻生成一次","&8⇨ &e⚡&7 64000 J 可存储","&8⇨ &e⚡&7 1000 J/s");
        // LENGSHANG_DD_YS_SF_ZYSCQ_1
        LSTItemFactory.material("LENGSHANG_DD_YS_SF_ZYSCQ_1","BLAST_FURNACE",false,"&6堆叠 · &d压缩 · 资源生成器 - I","&e材料生成器","&8⇨ &7速度: &b每 60 粘液刻生成一次","&8⇨ &e⚡&7 64000 J 可存储","&8⇨ &e⚡&7 1000 J/s");
        // LENGSHANG_DD_YS_SF_ZYSCQ_2
        LSTItemFactory.material("LENGSHANG_DD_YS_SF_ZYSCQ_2","BLAST_FURNACE",false,"&6堆叠 · &d压缩 · 资源生成器 - II","&e材料生成器","&8⇨ &7速度: &b每 30 粘液刻生成一次","&8⇨ &e⚡&7 320000 J 可存储","&8⇨ &e⚡&7 5000 J/s");
        // LENGSHANG_DD_YS_SF_ZYSCQ_3
        LSTItemFactory.material("LENGSHANG_DD_YS_SF_ZYSCQ_3","BLAST_FURNACE",false,"&6堆叠 · &d压缩 · 资源生成器 - III","&e材料生成器","&8⇨ &7速度: &b每 10 粘液刻生成一次","&8⇨ &e⚡&7 640000 J 可存储","&8⇨ &e⚡&7 10000 J/s");
        // LENGSHANG_DD_YS_ZQ_SF_ZYSCQ_1
        LSTItemFactory.material("LENGSHANG_DD_YS_ZQ_SF_ZYSCQ_1","BLAST_FURNACE",false,"&6堆叠 · &e压缩 · 资源生成器 - I","&e材料生成器","&8⇨ &7速度: &b每 1 粘液刻生成一次","&8⇨ &e⚡&7 640000 J 可存储","&8⇨ &e⚡&7 10000 J/s");
        // LENGSHANG_DD_YS_ZQ_SF_ZYSCQ_2
        LSTItemFactory.material("LENGSHANG_DD_YS_ZQ_SF_ZYSCQ_2","BLAST_FURNACE",false,"&6堆叠 · &e压缩 · 资源生成器 - II","&e材料生成器","&8⇨ &7速度: &b每 1 粘液刻生成一次","&8⇨ &e⚡&7 3200000 J 可存储","&8⇨ &e⚡&7 50000 J/s");
        // LENGSHANG_DD_YS_ZQ_SF_ZYSCQ_3
        LSTItemFactory.material("LENGSHANG_DD_YS_ZQ_SF_ZYSCQ_3","BLAST_FURNACE",false,"&6堆叠 · &e压缩 · 资源生成器 - III","&e材料生成器","&8⇨ &7速度: &b每 1 粘液刻生成一次","&8⇨ &e⚡&7 6400000 J 可存储","&8⇨ &e⚡&7 100000 J/s");
        // LENGSHANG_DD_SF_KWDSCQ_1
        LSTItemFactory.material("LENGSHANG_DD_SF_KWDSCQ_1","BLAST_FURNACE",false,"&6堆叠 · &a矿物锭生成器 - I","&e材料生成器","&8⇨ &7速度: &b每 60 粘液刻生成一次","&8⇨ &e⚡&7 6400 J 可存储","&8⇨ &e⚡&7 100 J/s");
        // LENGSHANG_DD_SF_KWDSCQ_2
        LSTItemFactory.material("LENGSHANG_DD_SF_KWDSCQ_2","BLAST_FURNACE",false,"&6堆叠 · &a矿物锭生成器 - II","&e材料生成器","&8⇨ &7速度: &b每 30 粘液刻生成一次","&8⇨ &e⚡&7 32000 J 可存储","&8⇨ &e⚡&7 500 J/s");
    }

    public static void register(LengShangEvo plugin) {
    }

    private LSTItems39() {
    }
}
