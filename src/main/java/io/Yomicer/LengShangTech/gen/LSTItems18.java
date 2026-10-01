package io.Yomicer.LengShangTech.gen;

import io.Yomicer.LengShangTech.core.*;
import io.Yomicer.LengShangTech.scripts.LSTScriptBridge;
import io.Yomicer.LengShangTech.scripts.LSTBlockDrops;
import io.Yomicer.LengShangTech.LengShangEvo;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import org.bukkit.inventory.ItemStack;

/** 冷殇物品定义 (自动转换, 第 19 批)。 */
public final class LSTItems18 {

    public static void create() {
        // LENGSHANG_YS_GTSCQ_1
        LSTItemFactory.material("LENGSHANG_YS_GTSCQ_1","BLAST_FURNACE",false,"&d压缩 · 骨头生成器 - I","&e材料生成器","&8⇨ &7速度: &b每 60 粘液刻生成一次","&8⇨ &e⚡&7 6400 J 可存储","&8⇨ &e⚡&7 100 J/s");
        // LENGSHANG_YS_GTSCQ_2
        LSTItemFactory.material("LENGSHANG_YS_GTSCQ_2","BLAST_FURNACE",false,"&d压缩 · 骨头生成器 - II","&e材料生成器","&8⇨ &7速度: &b每 30 粘液刻生成一次","&8⇨ &e⚡&7 32000 J 可存储","&8⇨ &e⚡&7 500 J/s");
        // LENGSHANG_YS_GTSCQ_3
        LSTItemFactory.material("LENGSHANG_YS_GTSCQ_3","BLAST_FURNACE",false,"&d压缩 · 骨头生成器 - III","&e材料生成器","&8⇨ &7速度: &b每 10 粘液刻生成一次","&8⇨ &e⚡&7 640000 J 可存储","&8⇨ &e⚡&7 1000 J/s");
        // LENGSHANG_YS_YMSCQ_1
        LSTItemFactory.material("LENGSHANG_YS_YMSCQ_1","BLAST_FURNACE",false,"&d压缩 · 羽毛生成器 - I","&e材料生成器","&8⇨ &7速度: &b每 60 粘液刻生成一次","&8⇨ &e⚡&7 6400 J 可存储","&8⇨ &e⚡&7 100 J/s");
        // LENGSHANG_YS_YMSCQ_2
        LSTItemFactory.material("LENGSHANG_YS_YMSCQ_2","BLAST_FURNACE",false,"&d压缩 · 羽毛生成器 - II","&e材料生成器","&8⇨ &7速度: &b每 30 粘液刻生成一次","&8⇨ &e⚡&7 32000 J 可存储","&8⇨ &e⚡&7 500 J/s");
        // LENGSHANG_YS_YMSCQ_3
        LSTItemFactory.material("LENGSHANG_YS_YMSCQ_3","BLAST_FURNACE",false,"&d压缩 · 羽毛生成器 - III","&e材料生成器","&8⇨ &7速度: &b每 10 粘液刻生成一次","&8⇨ &e⚡&7 640000 J 可存储","&8⇨ &e⚡&7 1000 J/s");
        // LENGSHANG_YS_SSSCQ_1
        LSTItemFactory.material("LENGSHANG_YS_SSSCQ_1","BLAST_FURNACE",false,"&d压缩 · 燧石生成器 - I","&e材料生成器","&8⇨ &7速度: &b每 60 粘液刻生成一次","&8⇨ &e⚡&7 6400 J 可存储","&8⇨ &e⚡&7 100 J/s");
        // LENGSHANG_YS_SSSCQ_2
        LSTItemFactory.material("LENGSHANG_YS_SSSCQ_2","BLAST_FURNACE",false,"&d压缩 · 燧石生成器 - II","&e材料生成器","&8⇨ &7速度: &b每 30 粘液刻生成一次","&8⇨ &e⚡&7 32000 J 可存储","&8⇨ &e⚡&7 500 J/s");
        // LENGSHANG_YS_SSSCQ_3
        LSTItemFactory.material("LENGSHANG_YS_SSSCQ_3","BLAST_FURNACE",false,"&d压缩 · 燧石生成器 - III","&e材料生成器","&8⇨ &7速度: &b每 10 粘液刻生成一次","&8⇨ &e⚡&7 640000 J 可存储","&8⇨ &e⚡&7 1000 J/s");
        // LENGSHANG_YS_HYSCQ_1
        LSTItemFactory.material("LENGSHANG_YS_HYSCQ_1","BLAST_FURNACE",false,"&d压缩 · 火药生成器 - I","&e材料生成器","&8⇨ &7速度: &b每 60 粘液刻生成一次","&8⇨ &e⚡&7 6400 J 可存储","&8⇨ &e⚡&7 100 J/s");
        // LENGSHANG_YS_HYSCQ_2
        LSTItemFactory.material("LENGSHANG_YS_HYSCQ_2","BLAST_FURNACE",false,"&d压缩 · 火药生成器 - II","&e材料生成器","&8⇨ &7速度: &b每 30 粘液刻生成一次","&8⇨ &e⚡&7 32000 J 可存储","&8⇨ &e⚡&7 500 J/s");
        // LENGSHANG_YS_HYSCQ_3
        LSTItemFactory.material("LENGSHANG_YS_HYSCQ_3","BLAST_FURNACE",false,"&d压缩 · 火药生成器 - III","&e材料生成器","&8⇨ &7速度: &b每 10 粘液刻生成一次","&8⇨ &e⚡&7 640000 J 可存储","&8⇨ &e⚡&7 1000 J/s");
        // LENGSHANG_YS_NYQSCQ_1
        LSTItemFactory.material("LENGSHANG_YS_NYQSCQ_1","BLAST_FURNACE",false,"&d压缩 · 粘液球/黏液球生成器 - I","&e材料生成器","&8⇨ &7速度: &b每 60 粘液刻生成一次","&8⇨ &e⚡&7 6400 J 可存储","&8⇨ &e⚡&7 100 J/s");
        // LENGSHANG_YS_NYQSCQ_2
        LSTItemFactory.material("LENGSHANG_YS_NYQSCQ_2","BLAST_FURNACE",false,"&d压缩 · 粘液球/黏液球生成器 - II","&e材料生成器","&8⇨ &7速度: &b每 30 粘液刻生成一次","&8⇨ &e⚡&7 32000 J 可存储","&8⇨ &e⚡&7 500 J/s");
        // LENGSHANG_YS_NYQSCQ_3
        LSTItemFactory.material("LENGSHANG_YS_NYQSCQ_3","BLAST_FURNACE",false,"&d压缩 · 粘液球/黏液球生成器 - III","&e材料生成器","&8⇨ &7速度: &b每 10 粘液刻生成一次","&8⇨ &e⚡&7 640000 J 可存储","&8⇨ &e⚡&7 1000 J/s");
        // LENGSHANG_YS_NTSCQ_1
        LSTItemFactory.material("LENGSHANG_YS_NTSCQ_1","BLAST_FURNACE",false,"&d压缩 · 黏土生成器 - I","&e材料生成器","&8⇨ &7速度: &b每 60 粘液刻生成一次","&8⇨ &e⚡&7 6400 J 可存储","&8⇨ &e⚡&7 100 J/s");
        // LENGSHANG_YS_NTSCQ_2
        LSTItemFactory.material("LENGSHANG_YS_NTSCQ_2","BLAST_FURNACE",false,"&d压缩 · 黏土生成器 - II","&e材料生成器","&8⇨ &7速度: &b每 30 粘液刻生成一次","&8⇨ &e⚡&7 32000 J 可存储","&8⇨ &e⚡&7 500 J/s");
        // LENGSHANG_YS_NTSCQ_3
        LSTItemFactory.material("LENGSHANG_YS_NTSCQ_3","BLAST_FURNACE",false,"&d压缩 · 黏土生成器 - III","&e材料生成器","&8⇨ &7速度: &b每 10 粘液刻生成一次","&8⇨ &e⚡&7 640000 J 可存储","&8⇨ &e⚡&7 1000 J/s");
        // LENGSHANG_YS_KQDHYSSCQ_1
        LSTItemFactory.material("LENGSHANG_YS_KQDHYSSCQ_1","BLAST_FURNACE",false,"&d压缩 · 哭泣的黑曜石生成器 - I","&e材料生成器","&8⇨ &7速度: &b每 60 粘液刻生成一次","&8⇨ &e⚡&7 6400 J 可存储","&8⇨ &e⚡&7 100 J/s");
        // LENGSHANG_YS_KQDHYSSCQ_2
        LSTItemFactory.material("LENGSHANG_YS_KQDHYSSCQ_2","BLAST_FURNACE",false,"&d压缩 · 哭泣的黑曜石生成器 - II","&e材料生成器","&8⇨ &7速度: &b每 30 粘液刻生成一次","&8⇨ &e⚡&7 32000 J 可存储","&8⇨ &e⚡&7 500 J/s");
        // LENGSHANG_YS_KQDHYSSCQ_3
        LSTItemFactory.material("LENGSHANG_YS_KQDHYSSCQ_3","BLAST_FURNACE",false,"&d压缩 · 哭泣的黑曜石生成器 - III","&e材料生成器","&8⇨ &7速度: &b每 10 粘液刻生成一次","&8⇨ &e⚡&7 640000 J 可存储","&8⇨ &e⚡&7 1000 J/s");
        // LENGSHANG_YS_NITUSCQ_1
        LSTItemFactory.material("LENGSHANG_YS_NITUSCQ_1","BLAST_FURNACE",false,"&d压缩 · 泥土生成器 - I","&e材料生成器","&8⇨ &7速度: &b每 60 粘液刻生成一次","&8⇨ &e⚡&7 6400 J 可存储","&8⇨ &e⚡&7 100 J/s");
        // LENGSHANG_YS_NITUSCQ_2
        LSTItemFactory.material("LENGSHANG_YS_NITUSCQ_2","BLAST_FURNACE",false,"&d压缩 · 泥土生成器 - II","&e材料生成器","&8⇨ &7速度: &b每 30 粘液刻生成一次","&8⇨ &e⚡&7 32000 J 可存储","&8⇨ &e⚡&7 500 J/s");
        // LENGSHANG_YS_NITUSCQ_3
        LSTItemFactory.material("LENGSHANG_YS_NITUSCQ_3","BLAST_FURNACE",false,"&d压缩 · 泥土生成器 - III","&e材料生成器","&8⇨ &7速度: &b每 10 粘液刻生成一次","&8⇨ &e⚡&7 640000 J 可存储","&8⇨ &e⚡&7 1000 J/s");
        // LENGSHANG_YS_SLSCQ_1
        LSTItemFactory.material("LENGSHANG_YS_SLSCQ_1","BLAST_FURNACE",false,"&d压缩 · 沙砾生成器 - I","&e材料生成器","&8⇨ &7速度: &b每 60 粘液刻生成一次","&8⇨ &e⚡&7 6400 J 可存储","&8⇨ &e⚡&7 100 J/s");
        // LENGSHANG_YS_SLSCQ_2
        LSTItemFactory.material("LENGSHANG_YS_SLSCQ_2","BLAST_FURNACE",false,"&d压缩 · 沙砾生成器 - II","&e材料生成器","&8⇨ &7速度: &b每 30 粘液刻生成一次","&8⇨ &e⚡&7 32000 J 可存储","&8⇨ &e⚡&7 500 J/s");
        // LENGSHANG_YS_SLSCQ_3
        LSTItemFactory.material("LENGSHANG_YS_SLSCQ_3","BLAST_FURNACE",false,"&d压缩 · 沙砾生成器 - III","&e材料生成器","&8⇨ &7速度: &b每 10 粘液刻生成一次","&8⇨ &e⚡&7 640000 J 可存储","&8⇨ &e⚡&7 1000 J/s");
        // LENGSHANG_YS_BSCQ_1
        LSTItemFactory.material("LENGSHANG_YS_BSCQ_1","BLAST_FURNACE",false,"&d压缩 · 冰生成器 - I","&e材料生成器","&8⇨ &7速度: &b每 60 粘液刻生成一次","&8⇨ &e⚡&7 6400 J 可存储","&8⇨ &e⚡&7 100 J/s");
        // LENGSHANG_YS_BSCQ_2
        LSTItemFactory.material("LENGSHANG_YS_BSCQ_2","BLAST_FURNACE",false,"&d压缩 · 冰生成器 - II","&e材料生成器","&8⇨ &7速度: &b每 30 粘液刻生成一次","&8⇨ &e⚡&7 32000 J 可存储","&8⇨ &e⚡&7 500 J/s");
        // LENGSHANG_YS_BSCQ_3
        LSTItemFactory.material("LENGSHANG_YS_BSCQ_3","BLAST_FURNACE",false,"&d压缩 · 冰生成器 - III","&e材料生成器","&8⇨ &7速度: &b每 10 粘液刻生成一次","&8⇨ &e⚡&7 640000 J 可存储","&8⇨ &e⚡&7 1000 J/s");
        // LENGSHANG_YS_HMSCQ_1
        LSTItemFactory.material("LENGSHANG_YS_HMSCQ_1","BLAST_FURNACE",false,"&d压缩 · 海绵生成器 - I","&e材料生成器","&8⇨ &7速度: &b每 60 粘液刻生成一次","&8⇨ &e⚡&7 6400 J 可存储","&8⇨ &e⚡&7 100 J/s");
        // LENGSHANG_YS_HMSCQ_2
        LSTItemFactory.material("LENGSHANG_YS_HMSCQ_2","BLAST_FURNACE",false,"&d压缩 · 海绵生成器 - II","&e材料生成器","&8⇨ &7速度: &b每 30 粘液刻生成一次","&8⇨ &e⚡&7 32000 J 可存储","&8⇨ &e⚡&7 500 J/s");
        // LENGSHANG_YS_HMSCQ_3
        LSTItemFactory.material("LENGSHANG_YS_HMSCQ_3","BLAST_FURNACE",false,"&d压缩 · 海绵生成器 - III","&e材料生成器","&8⇨ &7速度: &b每 10 粘液刻生成一次","&8⇨ &e⚡&7 640000 J 可存储","&8⇨ &e⚡&7 1000 J/s");
        // LENGSHANG_YS_ZZYSCQ_1
        LSTItemFactory.material("LENGSHANG_YS_ZZYSCQ_1","BLAST_FURNACE",false,"&d压缩 · 蜘蛛眼生成器 - I","&e材料生成器","&8⇨ &7速度: &b每 60 粘液刻生成一次","&8⇨ &e⚡&7 6400 J 可存储","&8⇨ &e⚡&7 100 J/s");
        // LENGSHANG_YS_ZZYSCQ_2
        LSTItemFactory.material("LENGSHANG_YS_ZZYSCQ_2","BLAST_FURNACE",false,"&d压缩 · 蜘蛛眼生成器 - II","&e材料生成器","&8⇨ &7速度: &b每 30 粘液刻生成一次","&8⇨ &e⚡&7 32000 J 可存储","&8⇨ &e⚡&7 500 J/s");
        // LENGSHANG_YS_ZZYSCQ_3
        LSTItemFactory.material("LENGSHANG_YS_ZZYSCQ_3","BLAST_FURNACE",false,"&d压缩 · 蜘蛛眼生成器 - III","&e材料生成器","&8⇨ &7速度: &b每 10 粘液刻生成一次","&8⇨ &e⚡&7 640000 J 可存储","&8⇨ &e⚡&7 1000 J/s");
        // LENGSHANG_YS_FRSCQ_1
        LSTItemFactory.material("LENGSHANG_YS_FRSCQ_1","BLAST_FURNACE",false,"&d压缩 · 腐肉生成器 - I","&e材料生成器","&8⇨ &7速度: &b每 60 粘液刻生成一次","&8⇨ &e⚡&7 6400 J 可存储","&8⇨ &e⚡&7 100 J/s");
        // LENGSHANG_YS_FRSCQ_2
        LSTItemFactory.material("LENGSHANG_YS_FRSCQ_2","BLAST_FURNACE",false,"&d压缩 · 腐肉生成器 - II","&e材料生成器","&8⇨ &7速度: &b每 30 粘液刻生成一次","&8⇨ &e⚡&7 32000 J 可存储","&8⇨ &e⚡&7 500 J/s");
        // LENGSHANG_YS_FRSCQ_3
        LSTItemFactory.material("LENGSHANG_YS_FRSCQ_3","BLAST_FURNACE",false,"&d压缩 · 腐肉生成器 - III","&e材料生成器","&8⇨ &7速度: &b每 10 粘液刻生成一次","&8⇨ &e⚡&7 640000 J 可存储","&8⇨ &e⚡&7 1000 J/s");
        // LENGSHANG_YS_FMPSCQ_1
        LSTItemFactory.material("LENGSHANG_YS_FMPSCQ_1","BLAST_FURNACE",false,"&d压缩 · 蜂蜜瓶生成器 - I","&e材料生成器","&8⇨ &7速度: &b每 60 粘液刻生成一次","&8⇨ &e⚡&7 6400 J 可存储","&8⇨ &e⚡&7 100 J/s");
        // LENGSHANG_YS_FMPSCQ_2
        LSTItemFactory.material("LENGSHANG_YS_FMPSCQ_2","BLAST_FURNACE",false,"&d压缩 · 蜂蜜瓶生成器 - II","&e材料生成器","&8⇨ &7速度: &b每 30 粘液刻生成一次","&8⇨ &e⚡&7 32000 J 可存储","&8⇨ &e⚡&7 500 J/s");
        // LENGSHANG_YS_FMPSCQ_3
        LSTItemFactory.material("LENGSHANG_YS_FMPSCQ_3","BLAST_FURNACE",false,"&d压缩 · 蜂蜜瓶生成器 - III","&e材料生成器","&8⇨ &7速度: &b每 10 粘液刻生成一次","&8⇨ &e⚡&7 640000 J 可存储","&8⇨ &e⚡&7 1000 J/s");
        // LENGSHANG_YS_MPSCQ_1
        LSTItemFactory.material("LENGSHANG_YS_MPSCQ_1","BLAST_FURNACE",false,"&d压缩 · 蜜牌生成器 - I","&e材料生成器","&8⇨ &7速度: &b每 60 粘液刻生成一次","&8⇨ &e⚡&7 6400 J 可存储","&8⇨ &e⚡&7 100 J/s");
        // LENGSHANG_YS_MPSCQ_2
        LSTItemFactory.material("LENGSHANG_YS_MPSCQ_2","BLAST_FURNACE",false,"&d压缩 · 蜜牌生成器 - II","&e材料生成器","&8⇨ &7速度: &b每 30 粘液刻生成一次","&8⇨ &e⚡&7 32000 J 可存储","&8⇨ &e⚡&7 500 J/s");
        // LENGSHANG_YS_MPSCQ_3
        LSTItemFactory.material("LENGSHANG_YS_MPSCQ_3","BLAST_FURNACE",false,"&d压缩 · 蜜牌生成器 - III","&e材料生成器","&8⇨ &7速度: &b每 10 粘液刻生成一次","&8⇨ &e⚡&7 640000 J 可存储","&8⇨ &e⚡&7 1000 J/s");
        // LENGSHANG_YS_FJSSCQ_1
        LSTItemFactory.material("LENGSHANG_YS_FJSSCQ_1","BLAST_FURNACE",false,"&d压缩 · 方解石生成器 - I","&e材料生成器","&8⇨ &7速度: &b每 60 粘液刻生成一次","&8⇨ &e⚡&7 6400 J 可存储","&8⇨ &e⚡&7 100 J/s");
        // LENGSHANG_YS_FJSSCQ_2
        LSTItemFactory.material("LENGSHANG_YS_FJSSCQ_2","BLAST_FURNACE",false,"&d压缩 · 方解石生成器 - II","&e材料生成器","&8⇨ &7速度: &b每 30 粘液刻生成一次","&8⇨ &e⚡&7 32000 J 可存储","&8⇨ &e⚡&7 500 J/s");
        // LENGSHANG_YS_FJSSCQ_3
        LSTItemFactory.material("LENGSHANG_YS_FJSSCQ_3","BLAST_FURNACE",false,"&d压缩 · 方解石生成器 - III","&e材料生成器","&8⇨ &7速度: &b每 10 粘液刻生成一次","&8⇨ &e⚡&7 640000 J 可存储","&8⇨ &e⚡&7 1000 J/s");
        // LENGSHANG_YS_NHYSCQ_1
        LSTItemFactory.material("LENGSHANG_YS_NHYSCQ_1","BLAST_FURNACE",false,"&d压缩 · 凝灰岩生成器 - I","&e材料生成器","&8⇨ &7速度: &b每 60 粘液刻生成一次","&8⇨ &e⚡&7 6400 J 可存储","&8⇨ &e⚡&7 100 J/s");
        // LENGSHANG_YS_NHYSCQ_2
        LSTItemFactory.material("LENGSHANG_YS_NHYSCQ_2","BLAST_FURNACE",false,"&d压缩 · 凝灰岩生成器 - II","&e材料生成器","&8⇨ &7速度: &b每 30 粘液刻生成一次","&8⇨ &e⚡&7 32000 J 可存储","&8⇨ &e⚡&7 500 J/s");
        // LENGSHANG_YS_NHYSCQ_3
        LSTItemFactory.material("LENGSHANG_YS_NHYSCQ_3","BLAST_FURNACE",false,"&d压缩 · 凝灰岩生成器 - III","&e材料生成器","&8⇨ &7速度: &b每 10 粘液刻生成一次","&8⇨ &e⚡&7 640000 J 可存储","&8⇨ &e⚡&7 1000 J/s");
        // LENGSHANG_YS_SXYSCQ_1
        LSTItemFactory.material("LENGSHANG_YS_SXYSCQ_1","BLAST_FURNACE",false,"&d压缩 · 生鳕鱼生成器 - I","&e材料生成器","&8⇨ &7速度: &b每 60 粘液刻生成一次","&8⇨ &e⚡&7 6400 J 可存储","&8⇨ &e⚡&7 100 J/s");
        // LENGSHANG_YS_SXYSCQ_2
        LSTItemFactory.material("LENGSHANG_YS_SXYSCQ_2","BLAST_FURNACE",false,"&d压缩 · 生鳕鱼生成器 - II","&e材料生成器","&8⇨ &7速度: &b每 30 粘液刻生成一次","&8⇨ &e⚡&7 32000 J 可存储","&8⇨ &e⚡&7 500 J/s");
        // LENGSHANG_YS_SXYSCQ_3
        LSTItemFactory.material("LENGSHANG_YS_SXYSCQ_3","BLAST_FURNACE",false,"&d压缩 · 生鳕鱼生成器 - III","&e材料生成器","&8⇨ &7速度: &b每 10 粘液刻生成一次","&8⇨ &e⚡&7 640000 J 可存储","&8⇨ &e⚡&7 1000 J/s");
        // LENGSHANG_YS_SGYSCQ_1
        LSTItemFactory.material("LENGSHANG_YS_SGYSCQ_1","BLAST_FURNACE",false,"&d压缩 · 生鲑鱼生成器 - I","&e材料生成器","&8⇨ &7速度: &b每 60 粘液刻生成一次","&8⇨ &e⚡&7 6400 J 可存储","&8⇨ &e⚡&7 100 J/s");
        // LENGSHANG_YS_SGYSCQ_2
        LSTItemFactory.material("LENGSHANG_YS_SGYSCQ_2","BLAST_FURNACE",false,"&d压缩 · 生鲑鱼生成器 - II","&e材料生成器","&8⇨ &7速度: &b每 30 粘液刻生成一次","&8⇨ &e⚡&7 32000 J 可存储","&8⇨ &e⚡&7 500 J/s");
        // LENGSHANG_YS_SGYSCQ_3
        LSTItemFactory.material("LENGSHANG_YS_SGYSCQ_3","BLAST_FURNACE",false,"&d压缩 · 生鲑鱼生成器 - III","&e材料生成器","&8⇨ &7速度: &b每 10 粘液刻生成一次","&8⇨ &e⚡&7 640000 J 可存储","&8⇨ &e⚡&7 1000 J/s");
        // LENGSHANG_YS_SNRSCQ_1
        LSTItemFactory.material("LENGSHANG_YS_SNRSCQ_1","BLAST_FURNACE",false,"&d压缩 · 生牛肉生成器 - I","&e材料生成器","&8⇨ &7速度: &b每 60 粘液刻生成一次","&8⇨ &e⚡&7 6400 J 可存储","&8⇨ &e⚡&7 100 J/s");
        // LENGSHANG_YS_SNRSCQ_2
        LSTItemFactory.material("LENGSHANG_YS_SNRSCQ_2","BLAST_FURNACE",false,"&d压缩 · 生牛肉生成器 - II","&e材料生成器","&8⇨ &7速度: &b每 30 粘液刻生成一次","&8⇨ &e⚡&7 32000 J 可存储","&8⇨ &e⚡&7 500 J/s");
        // LENGSHANG_YS_SNRSCQ_3
        LSTItemFactory.material("LENGSHANG_YS_SNRSCQ_3","BLAST_FURNACE",false,"&d压缩 · 生牛肉生成器 - III","&e材料生成器","&8⇨ &7速度: &b每 10 粘液刻生成一次","&8⇨ &e⚡&7 640000 J 可存储","&8⇨ &e⚡&7 1000 J/s");
        // LENGSHANG_YS_SJRSCQ_1
        LSTItemFactory.material("LENGSHANG_YS_SJRSCQ_1","BLAST_FURNACE",false,"&d压缩 · 生鸡肉生成器 - I","&e材料生成器","&8⇨ &7速度: &b每 60 粘液刻生成一次","&8⇨ &e⚡&7 6400 J 可存储","&8⇨ &e⚡&7 100 J/s");
    }

    public static void register(LengShangEvo plugin) {
    }

    private LSTItems18() {
    }
}
