package io.Yomicer.LengShangTech.gen;

import io.Yomicer.LengShangTech.core.*;
import io.Yomicer.LengShangTech.scripts.LSTScriptBridge;
import io.Yomicer.LengShangTech.scripts.LSTBlockDrops;
import io.Yomicer.LengShangTech.LengShangEvo;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import org.bukkit.inventory.ItemStack;

/** 冷殇物品定义 (自动转换, 第 43 批)。 */
public final class LSTItems42 {

    public static void create() {
        // LENGSHANG_美西螈桶永动机
        LSTItemFactory.material("LENGSHANG_美西螈桶永动机","DIRT_PATH",false,"&f&l美西螈桶永动机","&7永无止境","&x&F&E&3&C&3&C冷&x&F&A&1&6&6&9殇&x&E&5&1&C&9&3科&x&B&C&3&B&B&7技&e材料生成器","&8⇨ &7速度: &b每 10 粘液刻生成一次","&8⇨ &e⚡&7 10000 J 可存储","&8⇨ &e⚡&7 100 J/s");
        // KLMSYHJD
        LSTItemFactory.material("KLMSYHJD","IRON_INGOT",false,"&b克拉美斯亚合金锭");
        // KLMSYWJD
        LSTItemFactory.material("KLMSYWJD","IRON_INGOT",false,"&b克拉美斯亚无尽锭");
        // KLMSYXKD
        LSTItemFactory.material("KLMSYXKD","NETHERITE_INGOT",false,"&5克拉美斯亚虚空锭");
        // KLMSYSJHX
        LSTItemFactory.material("KLMSYSJHX","NETHER_STAR",false,"&5克拉美斯亚无尽升华核心");
        // WJJJHX
        LSTItemFactory.material("WJJJHX","NETHER_STAR",false,"&e无&a尽&b进&d阶&5核&6心");
        // INFINITY_BLADE_V2
        LSTItemFactory.savedVersion("INFINITY_BLADE_V2","套装系列/无尽V2/INFINITY_BLADE_V2","1.21","1.21.3.4","PAPER");
        // INFINITY_PICKAXE_V2
        LSTItemFactory.savedVersion("INFINITY_PICKAXE_V2","套装系列/无尽V2/INFINITY_PICKAXE_V2","1.21","1.21.3.4","PAPER");
        // INFINITY_AXE_V2
        LSTItemFactory.savedVersion("INFINITY_AXE_V2","套装系列/无尽V2/INFINITY_AXE_V2","1.21","1.21.3.4","PAPER");
        // INFINITY_SHOVEL_V2
        LSTItemFactory.savedVersion("INFINITY_SHOVEL_V2","套装系列/无尽V2/INFINITY_SHOVEL_V2","1.21","1.21.3.4","PAPER");
        // AW_JSBS
        LSTItemFactory.savedVersion("AW_JSBS","火山工艺物品/AW_JSBS","1.21","1.21.3.4","PAPER");
        // AW_XLBS
        LSTItemFactory.savedVersion("AW_XLBS","火山工艺物品/AW_XLBS","1.21","1.21.3.4","PAPER");
        // AW_LLBS
        LSTItemFactory.savedVersion("AW_LLBS","火山工艺物品/AW_LLBS","1.21","1.21.3.4","PAPER");
        // AW_KWZG
        LSTItemFactory.saved("AW_KWZG","火山工艺物品/AW_KWZG","PAPER");
        // AW_BZ
        LSTItemFactory.savedVersion("AW_BZ","火山工艺物品/AW_BZ","1.21","1.21.3.4","PAPER");
        // AW_KXJ
        LSTItemFactory.savedVersion("AW_KXJ","火山工艺物品/AW_KXJ","1.21","1.21.3.4","PAPER");
        // AW_SG
        LSTItemFactory.saved("AW_SG","火山工艺物品/AW_SG","PAPER");
        // AW_XYM
        LSTItemFactory.savedVersion("AW_XYM","火山工艺物品/AW_XYM","1.21","1.21.3.4","PAPER");
        // AW_XZM
        LSTItemFactory.savedVersion("AW_XZM","火山工艺物品/AW_XZM","1.21","1.21.3.4","PAPER");
        // AW_NMZSJ
        LSTItemFactory.savedVersion("AW_NMZSJ","火山工艺物品/AW_NMZSJ","1.21","1.21.3.4","PAPER");
        // AW_MLFKJ
        LSTItemFactory.savedVersion("AW_MLFKJ","火山工艺物品/AW_MLFKJ","1.21","1.21.3.4","PAPER");
        // AW_LZR
        LSTItemFactory.savedVersion("AW_LZR","火山工艺物品/AW_LZR","1.21","1.21.3.4","PAPER");
        // AW_DLB
        LSTItemFactory.savedVersion("AW_DLB","火山工艺物品/AW_DLB","1.21","1.21.3.4","PAPER");
        // AW_G288
        LSTItemFactory.savedVersion("AW_G288","火山工艺物品/AW_G288","1.21","1.21.3.4","PAPER");
        // AW_YZXWZJ
        LSTItemFactory.savedVersion("AW_YZXWZJ","火山工艺物品/AW_YZXWZJ","1.21","1.21.3.4","PAPER");
        // KMSYHJTK
        LSTItemFactory.saved("KMSYHJTK","套装系列/克拉美斯亚合金/KMSYHJTK","PAPER");
        // KLMSYHJXJ
        LSTItemFactory.saved("KLMSYHJXJ","套装系列/克拉美斯亚合金/KLMSYHJXJ","PAPER");
        // KLMSYHJHT
        LSTItemFactory.saved("KLMSYHJHT","套装系列/克拉美斯亚合金/KLMSYHJHT","PAPER");
        // KLMSYHJXZ
        LSTItemFactory.saved("KLMSYHJXZ","套装系列/克拉美斯亚合金/KLMSYHJXZ","PAPER");
        // KLMSYHJJ
        LSTItemFactory.saved("KLMSYHJJ","套装系列/克拉美斯亚合金/KLMSYHJJ","PAPER");
        // KLMSYHJG
        LSTItemFactory.saved("KLMSYHJG","套装系列/克拉美斯亚合金/KLMSYHJG","PAPER");
        // KLMSYHJF
        LSTItemFactory.saved("KLMSYHJF","套装系列/克拉美斯亚合金/KLMSYHJF","PAPER");
        // KLMSYHJC
        LSTItemFactory.saved("KLMSYHJC","套装系列/克拉美斯亚合金/KLMSYHJC","PAPER");
        // HLYHX
        LSTItemFactory.saved("HLYHX","套装系列/火莱伊/HLYHX","PAPER");
        // HLYTK
        LSTItemFactory.savedVersion("HLYTK","套装系列/火莱伊/HLYTK","1.21","1.21.3.4","PAPER");
        // HLYXJ
        LSTItemFactory.savedVersion("HLYXJ","套装系列/火莱伊/HLYXJ","1.21","1.21.3.4","PAPER");
        // HLYHT
        LSTItemFactory.savedVersion("HLYHT","套装系列/火莱伊/HLYHT","1.21","1.21.3.4","PAPER");
        // HLYXZ
        LSTItemFactory.savedVersion("HLYXZ","套装系列/火莱伊/HLYXZ","1.21","1.21.3.4","PAPER");
        // HLYZJ
        LSTItemFactory.savedVersion("HLYZJ","套装系列/火莱伊/HLYZJ","1.21","1.21.3.4","PAPER");
        // HLYZG
        LSTItemFactory.savedVersion("HLYZG","套装系列/火莱伊/HLYZG","1.21","1.21.3.4","PAPER");
        // HLYZF
        LSTItemFactory.savedVersion("HLYZF","套装系列/火莱伊/HLYZF","1.21","1.21.3.4","PAPER");
        // HLYZC
        LSTItemFactory.savedVersion("HLYZC","套装系列/火莱伊/HLYZC","1.21","1.21.3.4","PAPER");
        // CALCITE_1L
        LSTItemFactory.material("CALCITE_1L","CALCITE",false,"&7一阶压缩方解石","&79个方解石");
        // CALCITE_2L
        LSTItemFactory.material("CALCITE_2L","CALCITE",false,"&7二阶压缩方解石","&781个方解石");
        // CALCITE_3L
        LSTItemFactory.material("CALCITE_3L","CALCITE",false,"&7三阶压缩方解石","&7729个方解石");
        // M87NJW
        LSTItemFactory.material("M87NJW","ORANGE_DYE",false,"&x&F&4&A&4&6&0M87凝聚物","&7特殊的物质");
        // M87WZT
        LSTItemFactory.head("M87WZT","7e423e8368c2560e2f05d95d369381ef1fa40b85468781f219ddececdd70f4de","&x&F&4&A&4&6&0M87物质团","&7由某种物质形成的");
        // HSBUG
        LSTItemFactory.head("HSBUG","9f13197c6a7cf52570fe564aab9944a9043bdf7d957479311ece0225e1d38df4","&2&lBUG","&4写了个BUG属于是...");
        // HSYS
        LSTItemFactory.material("HSYS","BLACKSTONE",false,"&x&D&2&6&9&1&E陨石","&4来自太空的“燃料”？");
        // MFZZ
        LSTItemFactory.material("MFZZ","WHEAT_SEEDS",false,"&d魔法种子","&7用于转换成花");
        // HSHXSP
        LSTItemFactory.material("HSHXSP","RED_DYE",false,"&x&F&4&A&4&6&0火山核心碎片","&b强大核心失传许久的碎片？");
        // HSHX
        LSTItemFactory.material("HSHX","NETHER_STAR",false,"&x&6&6&C&D&A&A火山核心","&b拥有最强大的核心能量！");
        // JJHSHX
        LSTItemFactory.material("JJHSHX","COMMAND_BLOCK",false,"&x&B&2&2&2&2&2究极火山核心","&b已经封神了！");
        // HSNB1
        LSTItemFactory.savedVersion("HSNB1","套装系列/火山/HSNB1","1.21","1.21.3.4","PAPER");
        // HSNB2
        LSTItemFactory.savedVersion("HSNB2","套装系列/火山/HSNB2","1.21","1.21.3.4","PAPER");
        // HSNB3
        LSTItemFactory.savedVersion("HSNB3","套装系列/火山/HSNB3","1.21","1.21.3.4","PAPER");
        // HSNB4
        LSTItemFactory.savedVersion("HSNB4","套装系列/火山/HSNB4","1.21","1.21.3.4","PAPER");
        // HSNB5
        LSTItemFactory.savedVersion("HSNB5","套装系列/火山/HSNB5","1.21","1.21.3.4","PAPER");
        // HSNB6
        LSTItemFactory.savedVersion("HSNB6","套装系列/火山/HSNB6","1.21","1.21.3.4","PAPER");
        // HSNB7
        LSTItemFactory.savedVersion("HSNB7","套装系列/火山/HSNB7","1.21","1.21.3.4","PAPER");
        // HSNB8
        LSTItemFactory.savedVersion("HSNB8","套装系列/火山/HSNB8","1.21","1.21.3.4","PAPER");
    }

    public static void register(LengShangEvo plugin) {
        LSTScriptBridge.registerPlainItem(plugin, "KLMSYHJD", LSTGroups.CL, RecipeType.SMELTERY, new ItemStack[]{LSTReg.sf("REINFORCED_ALLOY_INGOT",1),LSTReg.sf("DAMASCUS_STEEL_INGOT",1),LSTReg.sf("STEEL_INGOT",1),LSTReg.sf("GILDED_IRON",1),LSTReg.sf("NICKEL_INGOT",1),LSTReg.sf("COBALT_INGOT",1),LSTReg.sf("GOLD_24K",1),null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "KLMSYWJD", LSTGroups.CL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("KLMSYHJD",1),LSTReg.sf("KLMSYHJD",1),LSTReg.sf("KLMSYHJD",1),LSTReg.sf("KLMSYHJD",1),LSTReg.sf("INFINITE_INGOT",1),LSTReg.sf("KLMSYHJD",1),LSTReg.sf("KLMSYHJD",1),LSTReg.sf("KLMSYHJD",1),LSTReg.sf("KLMSYHJD",1)}, false);
        LSTScriptBridge.registerPlainItem(plugin, "KLMSYXKD", LSTGroups.CL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("KLMSYHJD",1),LSTReg.sf("KLMSYHJD",1),LSTReg.sf("KLMSYHJD",1),LSTReg.sf("KLMSYHJD",1),LSTReg.sf("VOID_INGOT",1),LSTReg.sf("KLMSYHJD",1),LSTReg.sf("KLMSYHJD",1),LSTReg.sf("KLMSYHJD",1),LSTReg.sf("KLMSYHJD",1)}, false);
        LSTScriptBridge.registerPlainItem(plugin, "KLMSYSJHX", LSTGroups.CL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("KLMSYXKD",1),LSTReg.sf("KLMSYXKD",1),LSTReg.sf("KLMSYXKD",1),LSTReg.sf("KLMSYXKD",1),LSTReg.sf("INFINITY_SINGULARITY",1),LSTReg.sf("KLMSYWJD",1),LSTReg.sf("KLMSYWJD",1),LSTReg.sf("KLMSYWJD",1),LSTReg.sf("KLMSYWJD",1)}, false);
        LSTScriptBridge.registerPlainItem(plugin, "WJJJHX", LSTGroups.CL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("FORTUNE_SINGULARITY",1),LSTReg.sf("MAGIC_SINGULARITY",1),LSTReg.sf("EARTH_SINGULARITY",1),LSTReg.sf("METAL_SINGULARITY",1),LSTReg.sf("KLMSYSJHX",1),LSTReg.sf("METAL_SINGULARITY",1),LSTReg.sf("DIAMOND_SINGULARITY",1),LSTReg.sf("EMERALD_SINGULARITY",1),LSTReg.sf("NETHERITE_SINGULARITY",1)}, false);
        LSTScriptBridge.registerPlainItem(plugin, "INFINITY_BLADE_V2", LSTGroups.WQ, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{null,LSTReg.sf("WJJJHX",1),null,null,LSTReg.sf("INFINITY_BLADE",1),null,null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "INFINITY_PICKAXE_V2", LSTGroups.GJ, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{null,LSTReg.sf("WJJJHX",1),null,null,LSTReg.sf("INFINITY_PICKAXE",1),null,null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "INFINITY_AXE_V2", LSTGroups.GJ, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{null,LSTReg.sf("WJJJHX",1),null,null,LSTReg.sf("INFINITY_AXE",1),null,null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "INFINITY_SHOVEL_V2", LSTGroups.GJ, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{null,LSTReg.sf("WJJJHX",1),null,null,LSTReg.sf("INFINITY_SHOVEL",1),null,null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "AW_JSBS", LSTGroups.TSWP, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.mat("FEATHER",1),LSTReg.mat("FEATHER",1),LSTReg.mat("FEATHER",1),LSTReg.mat("FEATHER",1),LSTReg.sf("STAFF_ELEMENTAL_WIND",1),LSTReg.mat("FEATHER",1),LSTReg.mat("FEATHER",1),LSTReg.mat("FEATHER",1),LSTReg.mat("FEATHER",1)}, false);
        LSTScriptBridge.registerPlainItem(plugin, "AW_XLBS", LSTGroups.TSWP, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.mat("ENCHANTED_GOLDEN_APPLE",1),LSTReg.mat("ENCHANTED_GOLDEN_APPLE",1),LSTReg.mat("ENCHANTED_GOLDEN_APPLE",1),LSTReg.mat("ENCHANTED_GOLDEN_APPLE",1),LSTReg.sf("STAFF_ELEMENTAL_FIRE",1),LSTReg.mat("ENCHANTED_GOLDEN_APPLE",1),LSTReg.mat("ENCHANTED_GOLDEN_APPLE",1),LSTReg.mat("ENCHANTED_GOLDEN_APPLE",1),LSTReg.mat("ENCHANTED_GOLDEN_APPLE",1)}, false);
        LSTScriptBridge.registerPlainItem(plugin, "AW_LLBS", LSTGroups.TSWP, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.mat("ENCHANTED_GOLDEN_APPLE",1),LSTReg.mat("ENCHANTED_GOLDEN_APPLE",1),LSTReg.mat("ENCHANTED_GOLDEN_APPLE",1),LSTReg.mat("ENCHANTED_GOLDEN_APPLE",1),LSTReg.mat("EMERALD",1),LSTReg.mat("ENCHANTED_GOLDEN_APPLE",1),LSTReg.mat("ENCHANTED_GOLDEN_APPLE",1),LSTReg.mat("ENCHANTED_GOLDEN_APPLE",1),LSTReg.mat("ENCHANTED_GOLDEN_APPLE",1)}, false);
        LSTScriptBridge.registerPlainItem(plugin, "AW_KWZG", LSTGroups.TSWP, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("GOLD_24K",1),LSTReg.sf("GOLD_24K",1),LSTReg.sf("GOLD_24K",1),null,LSTReg.mat("STICK",1),null,null,LSTReg.mat("STICK",1),null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "AW_BZ", LSTGroups.TSWP, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.mat("BRICK",1),LSTReg.mat("BRICK",1),LSTReg.mat("BRICK",1),LSTReg.mat("BRICK",1),null,LSTReg.mat("BRICK",1),LSTReg.mat("BRICK",1),LSTReg.mat("BRICK",1),LSTReg.mat("BRICK",1)}, false);
        LSTScriptBridge.registerPlainItem(plugin, "AW_KXJ", LSTGroups.TSWP, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("VOID_INGOT",1),LSTReg.sf("VOID_INGOT",1),LSTReg.sf("VOID_INGOT",1),LSTReg.sf("VOID_INGOT",1),LSTReg.sf("INFINITY_CHESTPLATE",1),LSTReg.sf("VOID_INGOT",1),LSTReg.sf("VOID_INGOT",1),LSTReg.sf("VOID_INGOT",1),LSTReg.sf("VOID_INGOT",1)}, false);
        LSTScriptBridge.registerPlainItem(plugin, "AW_SG", LSTGroups.TSWP, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("COBALT_PICKAXE",1),LSTReg.sf("COBALT_PICKAXE",1),LSTReg.sf("COBALT_PICKAXE",1),null,LSTReg.mat("STICK",1),null,null,LSTReg.mat("STICK",1),null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "AW_XYM", LSTGroups.TSWP, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.mat("GREEN_DYE",1),LSTReg.mat("GREEN_DYE",1),LSTReg.mat("GREEN_DYE",1),LSTReg.mat("GREEN_DYE",1),LSTReg.mat("LEATHER_HELMET",1),LSTReg.mat("GREEN_DYE",1),LSTReg.mat("GREEN_DYE",1),LSTReg.mat("GREEN_DYE",1),LSTReg.mat("GREEN_DYE",1)}, false);
        LSTScriptBridge.registerPlainItem(plugin, "AW_XZM", LSTGroups.TSWP, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.mat("RED_DYE",1),LSTReg.mat("RED_DYE",1),LSTReg.mat("RED_DYE",1),LSTReg.mat("RED_DYE",1),LSTReg.mat("LEATHER_HELMET",1),LSTReg.mat("RED_DYE",1),LSTReg.mat("RED_DYE",1),LSTReg.mat("RED_DYE",1),LSTReg.mat("RED_DYE",1)}, false);
        LSTScriptBridge.registerPlainItem(plugin, "AW_NMZSJ", LSTGroups.TSWP, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("VOID_INGOT",1),LSTReg.sf("VOID_INGOT",1),LSTReg.sf("VOID_INGOT",1),LSTReg.sf("VOID_INGOT",1),LSTReg.sf("INFINITY_BLADE",1),LSTReg.sf("VOID_INGOT",1),LSTReg.sf("VOID_INGOT",1),LSTReg.sf("VOID_INGOT",1),LSTReg.sf("VOID_INGOT",1)}, false);
        LSTScriptBridge.registerPlainItem(plugin, "AW_MLFKJ", LSTGroups.TSWP, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{null,LSTReg.mat("COMMAND_BLOCK",1),null,null,LSTReg.mat("COMMAND_BLOCK",1),null,null,LSTReg.mat("STICK",1),null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "AW_LZR", LSTGroups.TSWP, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("VOID_INGOT",1),LSTReg.sf("VOID_INGOT",1),LSTReg.sf("VOID_INGOT",1),LSTReg.sf("VOID_INGOT",1),LSTReg.mat("NETHERITE_HOE",1),LSTReg.sf("VOID_INGOT",1),LSTReg.sf("VOID_INGOT",1),LSTReg.sf("VOID_INGOT",1),LSTReg.sf("VOID_INGOT",1)}, false);
        LSTScriptBridge.registerPlainItem(plugin, "AW_DLB", LSTGroups.TSWP, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{null,null,null,LSTReg.mat("BREAD",1),LSTReg.mat("BREAD",1),LSTReg.mat("BREAD",1),null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "AW_G288", LSTGroups.TSWP, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.mat("IRON_PICKAXE",1),LSTReg.mat("IRON_PICKAXE",1),LSTReg.mat("IRON_PICKAXE",1),null,LSTReg.mat("STICK",1),null,null,LSTReg.mat("STICK",1),null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "AW_YZXWZJ", LSTGroups.TSWP, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{null,LSTReg.sf("INFINITY_BLADE_V2",1),null,null,LSTReg.sf("HSNB5",1),null,null,LSTReg.sf("JJHSHX",1),null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "KMSYHJTK", LSTGroups.ZB, RecipeType.ARMOR_FORGE, new ItemStack[]{LSTReg.sf("KLMSYHJD",1),LSTReg.sf("KLMSYHJD",1),LSTReg.sf("KLMSYHJD",1),LSTReg.sf("KLMSYHJD",1),null,LSTReg.sf("KLMSYHJD",1),null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "KLMSYHJXJ", LSTGroups.ZB, RecipeType.ARMOR_FORGE, new ItemStack[]{LSTReg.sf("KLMSYHJD",1),null,LSTReg.sf("KLMSYHJD",1),LSTReg.sf("KLMSYHJD",1),LSTReg.sf("KLMSYHJD",1),LSTReg.sf("KLMSYHJD",1),LSTReg.sf("KLMSYHJD",1),LSTReg.sf("KLMSYHJD",1),LSTReg.sf("KLMSYHJD",1)}, false);
        LSTScriptBridge.registerPlainItem(plugin, "KLMSYHJHT", LSTGroups.ZB, RecipeType.ARMOR_FORGE, new ItemStack[]{LSTReg.sf("KLMSYHJD",1),LSTReg.sf("KLMSYHJD",1),LSTReg.sf("KLMSYHJD",1),LSTReg.sf("KLMSYHJD",1),null,LSTReg.sf("KLMSYHJD",1),LSTReg.sf("KLMSYHJD",1),null,LSTReg.sf("KLMSYHJD",1)}, false);
        LSTScriptBridge.registerPlainItem(plugin, "KLMSYHJXZ", LSTGroups.ZB, RecipeType.ARMOR_FORGE, new ItemStack[]{LSTReg.sf("KLMSYHJD",1),null,LSTReg.sf("KLMSYHJD",1),LSTReg.sf("KLMSYHJD",1),null,LSTReg.sf("KLMSYHJD",1),null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "KLMSYHJJ", LSTGroups.WQ, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{null,LSTReg.sf("KLMSYHJD",1),null,null,LSTReg.sf("KLMSYHJD",1),null,null,LSTReg.mat("STICK",1),null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "KLMSYHJG", LSTGroups.GJ, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("KLMSYHJD",1),LSTReg.sf("KLMSYHJD",1),LSTReg.sf("KLMSYHJD",1),null,LSTReg.mat("STICK",1),null,null,LSTReg.mat("STICK",1),null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "KLMSYHJF", LSTGroups.GJ, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("KLMSYHJD",1),LSTReg.sf("KLMSYHJD",1),null,LSTReg.sf("KLMSYHJD",1),LSTReg.mat("STICK",1),null,null,LSTReg.mat("STICK",1),null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "KLMSYHJC", LSTGroups.GJ, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{null,LSTReg.sf("KLMSYHJD",1),null,null,LSTReg.mat("STICK",1),null,null,LSTReg.mat("STICK",1),null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "HLYHX", LSTGroups.CL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("REINFORCED_ALLOY_INGOT",1),LSTReg.sf("REINFORCED_ALLOY_INGOT",1),LSTReg.sf("REINFORCED_ALLOY_INGOT",1),LSTReg.sf("REINFORCED_ALLOY_INGOT",1),LSTReg.sf("KLMSYSJHX",1),LSTReg.sf("REINFORCED_ALLOY_INGOT",1),LSTReg.sf("REINFORCED_ALLOY_INGOT",1),LSTReg.sf("WJJJHX",1),LSTReg.sf("REINFORCED_ALLOY_INGOT",1)}, false);
        LSTScriptBridge.registerPlainItem(plugin, "HLYTK", LSTGroups.ZB, RecipeType.ARMOR_FORGE, new ItemStack[]{null,LSTReg.sf("HLYHX",1),null,null,LSTReg.firstOf(new String[]{"ULTIMA_COMPRESS_NETHERITE_HELMET","SUPREME_HELMET_LEGENDARY"},1),null,null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "HLYXJ", LSTGroups.ZB, RecipeType.ARMOR_FORGE, new ItemStack[]{null,LSTReg.sf("HLYHX",1),null,null,LSTReg.firstOf(new String[]{"ULTIMA_COMPRESS_NETHERITE_CHESTPLATE","SUPREME_CHESTPLATE_LEGENDARY"},1),null,null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "HLYHT", LSTGroups.ZB, RecipeType.ARMOR_FORGE, new ItemStack[]{null,LSTReg.sf("HLYHX",1),null,null,LSTReg.firstOf(new String[]{"ULTIMA_COMPRESS_NETHERITE_LEGGINGS","SUPREME_LEGGINGS_LEGENDARY"},1),null,null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "HLYXZ", LSTGroups.ZB, RecipeType.ARMOR_FORGE, new ItemStack[]{null,LSTReg.sf("HLYHX",1),null,null,LSTReg.firstOf(new String[]{"ULTIMA_COMPRESS_NETHERITE_BOOTS","SUPREME_BOOTS_LEGENDARY"},1),null,null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "HLYZJ", LSTGroups.WQ, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{null,LSTReg.sf("HLYHX",1),null,null,LSTReg.firstOf(new String[]{"ULTIMA_COMPRESS_NETHERITE_SWORD","SUPREME_SWORD_RARE"},1),null,null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "HLYZG", LSTGroups.GJ, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{null,LSTReg.sf("HLYHX",1),null,null,LSTReg.firstOf(new String[]{"ULTIMA_COMPRESS_NETHERITE_PICKAXE","SUPREME_PICKAXE_RARE"},1),null,null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "HLYZF", LSTGroups.GJ, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{null,LSTReg.sf("HLYHX",1),null,null,LSTReg.firstOf(new String[]{"ULTIMA_COMPRESS_NETHERITE_AXE","SUPREME_AXE_RARE"},1),null,null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "HLYZC", LSTGroups.GJ, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{null,LSTReg.sf("HLYHX",1),null,null,LSTReg.firstOf(new String[]{"ULTIMA_COMPRESS_NETHERITE_SHOVEL","SUPREME_SHOVEL_RARE"},1),null,null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "CALCITE_1L", LSTGroups.CL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.mat("CALCITE",1),LSTReg.mat("CALCITE",1),LSTReg.mat("CALCITE",1),LSTReg.mat("CALCITE",1),LSTReg.mat("CALCITE",1),LSTReg.mat("CALCITE",1),LSTReg.mat("CALCITE",1),LSTReg.mat("CALCITE",1),LSTReg.mat("CALCITE",1)}, false);
        LSTScriptBridge.registerPlainItem(plugin, "CALCITE_2L", LSTGroups.CL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("CALCITE_1L",1),LSTReg.sf("CALCITE_1L",1),LSTReg.sf("CALCITE_1L",1),LSTReg.sf("CALCITE_1L",1),LSTReg.sf("CALCITE_1L",1),LSTReg.sf("CALCITE_1L",1),LSTReg.sf("CALCITE_1L",1),LSTReg.sf("CALCITE_1L",1),LSTReg.sf("CALCITE_1L",1)}, false);
        LSTScriptBridge.registerPlainItem(plugin, "CALCITE_3L", LSTGroups.CL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("CALCITE_2L",1),LSTReg.sf("CALCITE_2L",1),LSTReg.sf("CALCITE_2L",1),LSTReg.sf("CALCITE_2L",1),LSTReg.sf("CALCITE_2L",1),LSTReg.sf("CALCITE_2L",1),LSTReg.sf("CALCITE_2L",1),LSTReg.sf("CALCITE_2L",1),LSTReg.sf("CALCITE_2L",1)}, false);
        LSTScriptBridge.registerPlainItem(plugin, "M87NJW", LSTGroups.CL, LSTRecipeTypes.get("LENGSHANG_XX_M87WZNJQ"), new ItemStack[]{LSTReg.sf("VOID_INGOT",64),null,LSTReg.sf("INFINITE_INGOT",64),null,null,null,null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "M87WZT", LSTGroups.CL, LSTRecipeTypes.get("LENGSHANG_XX_M87WZNJQ"), new ItemStack[]{null,null,null,null,LSTReg.sf("M87NJW",5),null,null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "HSBUG", LSTGroups.CL, LSTRecipeTypes.get("LENGSHANG_XX_KJKYTJ"), new ItemStack[]{null,null,null,LSTReg.sf("_FINALTECH_UNORDERED_DUST",64),null,LSTReg.sf("_FINALTECH_ORDERED_DUST",64),null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "HSYS", LSTGroups.CL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.mat("COBBLESTONE",1),LSTReg.mat("GRANITE",1),LSTReg.mat("DIORITE",1),LSTReg.mat("ANDESITE",1),LSTReg.mat("IRON_BLOCK",1),null,null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "MFZZ", LSTGroups.CL, RecipeType.MAGIC_WORKBENCH, new ItemStack[]{LSTReg.sf("MAGIC_SUGAR",1),LSTReg.mat("WHEAT_SEEDS",1),null,null,null,null,null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "HSHXSP", LSTGroups.CL, LSTRecipeTypes.get("LENGSHANG_XX_HSNYRHJ"), new ItemStack[]{null,null,null,null,LSTReg.sf("M87WZT",24),null,null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "HSHX", LSTGroups.CL, LSTRecipeTypes.get("LENGSHANG_XX_HSNYRHJ"), new ItemStack[]{null,null,null,null,LSTReg.sf("HSHXSP",64),null,null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "JJHSHX", LSTGroups.CL, LSTRecipeTypes.get("LENGSHANG_XX_HSNYRHJ"), new ItemStack[]{null,null,null,null,LSTReg.sf("HSHX",32),null,null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "HSNB1", LSTGroups.ZB, RecipeType.ARMOR_FORGE, new ItemStack[]{LSTReg.sf("INFINITY_CROWN_V2",1),LSTReg.sf("JJHSHX",1),LSTReg.firstOf(new String[]{"ULTIMA_COMPRESS_NETHERITE_HELMET","SUPREME_HELMET_LEGENDARY"},1),LSTReg.sf("HLYTK",1),null,LSTReg.sf("SUPREME_HELMET_SUPREME",1),null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "HSNB2", LSTGroups.ZB, RecipeType.ARMOR_FORGE, new ItemStack[]{LSTReg.sf("INFINITY_CHESTPLATE_V2",1),null,LSTReg.firstOf(new String[]{"ULTIMA_COMPRESS_NETHERITE_CHESTPLATE","AW_KXJ"},1),LSTReg.sf("HLYXJ",1),LSTReg.sf("JJHSHX",1),LSTReg.sf("SUPREME_CHESTPLATE_SUPREME",1),LSTReg.sf("SUPREME_CHESTPLATE_LEGENDARY",1),LSTReg.sf("SUPREME_CHESTPLATE_EPIC",1),LSTReg.sf("SUPREME_CHESTPLATE_RARE",1)}, false);
        LSTScriptBridge.registerPlainItem(plugin, "HSNB3", LSTGroups.ZB, RecipeType.ARMOR_FORGE, new ItemStack[]{LSTReg.sf("INFINITY_LEGGINGS_V2",1),LSTReg.sf("JJHSHX",1),LSTReg.firstOf(new String[]{"ULTIMA_COMPRESS_NETHERITE_LEGGINGS","INFINITY_LEGGINGS"},1),LSTReg.sf("HLYHT",1),null,LSTReg.sf("SUPREME_LEGGINGS_SUPREME",1),LSTReg.sf("SUPREME_LEGGINGS_LEGENDARY",1),null,LSTReg.sf("SUPREME_LEGGINGS_EPIC",1)}, false);
        LSTScriptBridge.registerPlainItem(plugin, "HSNB4", LSTGroups.ZB, RecipeType.ARMOR_FORGE, new ItemStack[]{LSTReg.sf("INFINITY_BOOTS_V2",1),null,LSTReg.sf("JJHSHX",1),LSTReg.sf("HLYXZ",1),null,LSTReg.sf("SUPREME_BOOTS_SUPREME",1),null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "HSNB5", LSTGroups.WQ, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{null,LSTReg.sf("INFINITY_BLADE_V2",1),null,null,LSTReg.sf("SUPREME_SWORD_SUPREME",1),null,null,LSTReg.sf("JJHSHX",1),null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "HSNB6", LSTGroups.GJ, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("INFINITY_PICKAXE",1),LSTReg.sf("JJHSHX",1),LSTReg.firstOf(new String[]{"ULTIMA_COMPRESS_NETHERITE_PICKAXE","INFINITY_PICKAXE_V2"},1),null,LSTReg.sf("HLYZG",1),null,null,LSTReg.sf("SUPREME_PICKAXE_SUPREME",1),null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "HSNB7", LSTGroups.GJ, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("INFINITY_AXE",1),LSTReg.firstOf(new String[]{"ULTIMA_COMPRESS_NETHERITE_AXE","INFINITY_AXE_V2"},1),null,LSTReg.sf("HLYZF",1),LSTReg.sf("JJHSHX",1),null,null,LSTReg.sf("SUPREME_AXE_SUPREME",1),null}, false);
    }

    private LSTItems42() {
    }
}
