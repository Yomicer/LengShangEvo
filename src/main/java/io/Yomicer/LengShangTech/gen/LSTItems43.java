package io.Yomicer.LengShangTech.gen;

import io.Yomicer.LengShangTech.core.*;
import io.Yomicer.LengShangTech.scripts.LSTScriptBridge;
import io.Yomicer.LengShangTech.scripts.LSTBlockDrops;
import io.Yomicer.LengShangTech.LengShangEvo;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import org.bukkit.inventory.ItemStack;

/** 冷殇物品定义 (自动转换, 第 44 批)。 */
public final class LSTItems43 {

    public static void create() {
        // HYLS
        LSTItemFactory.saved("HYLS","材料/彩虹装备材料/HYLS","PAPER");
        // SYLS
        LSTItemFactory.saved("SYLS","材料/彩虹装备材料/SYLS","PAPER");
        // MDHS
        LSTItemFactory.saved("MDHS","材料/彩虹装备材料/MDHS","PAPER");
        // DYHS
        LSTItemFactory.saved("DYHS","材料/彩虹装备材料/DYHS","PAPER");
        // CH1
        LSTItemFactory.savedVersion("CH1","套装系列/彩虹/CH1","1.21","1.21.3.4","PAPER");
        // CH2
        LSTItemFactory.savedVersion("CH2","套装系列/彩虹/CH2","1.21","1.21.3.4","PAPER");
        // CH3
        LSTItemFactory.savedVersion("CH3","套装系列/彩虹/CH3","1.21","1.21.3.4","PAPER");
        // CH4
        LSTItemFactory.savedVersion("CH4","套装系列/彩虹/CH4","1.21","1.21.3.4","PAPER");
        // LENGSHANG_冷殇科技说明书
        LSTItemFactory.material("LENGSHANG_冷殇科技说明书","PAPER",false,"&x&F&E&3&C&3&C冷&x&F&A&1&6&6&9殇&x&E&5&1&C&9&3科&x&B&C&3&B&B&7技&7说明书","&7&l基于&x&F&E&3&C&3&C冷&x&F&A&1&6&6&9殇&x&E&5&1&C&9&3科&x&B&C&3&B&B&7技&7&l配置文件编写的附属插件","&x&F&E&3&C&3&C冷&x&F&A&1&6&6&9殇&x&E&5&1&C&9&3科&x&B&C&3&B&B&7技","&3&l作者：lengshang","&x&F&E&3&C&3&C冷&x&F&A&1&6&6&9殇&x&E&5&1&C&9&3科&x&B&C&3&B&B&7技&x&9&D&4&B&C&BE&x&6&E&6&B&D&Fv&x&3&F&A&0&F&Fo","&3&l作者：Yomicer");
        // LENGSHANG_版本
        LSTItemFactory.material("LENGSHANG_版本","PAPER",false,"&c&l版本号","&f当前&x&F&E&3&C&3&C冷&x&F&A&1&6&6&9殇&x&E&5&1&C&9&3科&x&B&C&3&B&B&7技&x&9&D&4&B&C&BE&x&6&E&6&B&D&Fv&x&3&F&A&0&F&Fo&f版本：","&bBuild-1","&6前置附属如下：","&7无尽贪婪","&7基因工程","&7乱序技艺","&7逻辑工艺","&7至尊研究院","&7海曼科技院","&6软前置（非必须）：","&7火莱伊工艺","&7网络拓展","&7乱码科技","&6粘液科技交流群:985241606","&6群文件可以下载各种附属和找服务器","&6以及可以下载粘液科技单人整合包");
        // LENGSHANG_更新日志1
        LSTItemFactory.material("LENGSHANG_更新日志1","PAPER",false,"&62026.9.25 更新日志","&b冷殇科技Evo版本，新的开始","&5冷殇科技Evo基于粘液开发","&5重构为完全独立的粘液科技附属插件","&5全部内容已原生Java化，不再依赖任何配置包","&5由 Yomicer 接手维护，感谢 lengshang 的原作","&5一切都是新的开始，未来仍会继续更新...");
        // LENGSHANG_16
        LSTItemFactory.material("LENGSHANG_16","LIGHT_GRAY_STAINED_GLASS_PANE",false," ");
        // LENGSHANG_17
        LSTItemFactory.material("LENGSHANG_17","LIGHT_GRAY_STAINED_GLASS_PANE",false," ");
        // LENGSHANG_20
        LSTItemFactory.material("LENGSHANG_20","LIGHT_GRAY_STAINED_GLASS_PANE",false," ");
        // LENGSHANG_24
        LSTItemFactory.material("LENGSHANG_24","LIGHT_GRAY_STAINED_GLASS_PANE",false," ");
        // LENGSHANG_25
        LSTItemFactory.material("LENGSHANG_25","LIGHT_GRAY_STAINED_GLASS_PANE",false," ");
        // LENGSHANG_26
        LSTItemFactory.material("LENGSHANG_26","LIGHT_GRAY_STAINED_GLASS_PANE",false," ");
        // LENGSHANG_29
        LSTItemFactory.material("LENGSHANG_29","LIGHT_GRAY_STAINED_GLASS_PANE",false," ");
        // LENGSHANG_35
        LSTItemFactory.material("LENGSHANG_35","LIGHT_GRAY_STAINED_GLASS_PANE",false," ");
        // LENGSHANG_LMJ_SM
        LSTItemFactory.material("LENGSHANG_LMJ_SM","CHERRY_SIGN",false,"&c&l留名集特别说明","&6想要登上留名集的","&6可以私信我认识的任何人来向我转达意向","&6六命没有任何要求","&6欢迎各位来留下属于自己的名字");
        // LENGSHANG_LENGSHANG
        LSTItemFactory.head("LENGSHANG_LENGSHANG","20b13024045c5c0d6d2afb059ae9660f7ad020fd895bb75f64fcc02ddb07d327","&dlengshang","&a粘&b液&c大&d蛇","&x&F&E&3&C&3&C冷&x&F&A&1&6&6&9殇&x&E&5&1&C&9&3科&x&B&C&3&B&B&7技&x&F&E&3&C&3&C作&x&F&A&1&6&6&9者");
        // LENGSHANG_Yomicer
        LSTItemFactory.head("LENGSHANG_Yomicer","8adb25ab9976d89d0bd8118d72c1c06bb907060c1e02a729b652d1e86b1ebbbc","&6Yomicer","&x&F&A&1&6&6&9代表作：魔法系列插件","&x&F&A&1&6&6&9冷殇科技&x&9&D&4&B&C&BE&x&6&E&6&B&D&Fv&x&3&F&A&0&F&Fo&x&F&A&1&6&6&9作者");
    }

    public static void register(LengShangEvo plugin) {
        LSTScriptBridge.registerPlainItem(plugin, "HSNB8", LSTGroups.GJ, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{null,LSTReg.sf("INFINITY_SHOVEL",1),null,null,LSTReg.sf("JJHSHX",1),null,null,LSTReg.sf("HLYZC",1),null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "HYLS", LSTGroups.CL, LSTRecipeTypes.get("LENGSHANG_XX_YSRLZZJ"), new ItemStack[]{null,null,null,null,LSTReg.mat("HEART_OF_THE_SEA",1),null,null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "SYLS", LSTGroups.CL, LSTRecipeTypes.get("LENGSHANG_XX_YSRLZZJ"), new ItemStack[]{null,null,null,null,LSTReg.mat("OAK_LEAVES",1),null,null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "MDHS", LSTGroups.CL, LSTRecipeTypes.get("LENGSHANG_XX_YSRLZZJ"), new ItemStack[]{null,null,null,null,LSTReg.mat("END_STONE",1),null,null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "DYHS", LSTGroups.CL, LSTRecipeTypes.get("LENGSHANG_XX_YSRLZZJ"), new ItemStack[]{null,null,null,null,LSTReg.mat("NETHERRACK",1),null,null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "CH1", LSTGroups.ZB, LSTRecipeTypes.get("LENGSHANG_XX_CHZBDZJ"), new ItemStack[]{null,LSTReg.sf("HYLS",1),null,null,LSTReg.mat("NETHERITE_HELMET",1),null,null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "CH2", LSTGroups.ZB, LSTRecipeTypes.get("LENGSHANG_XX_CHZBDZJ"), new ItemStack[]{null,LSTReg.sf("SYLS",1),null,null,LSTReg.mat("NETHERITE_CHESTPLATE",1),null,null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "CH3", LSTGroups.ZB, LSTRecipeTypes.get("LENGSHANG_XX_CHZBDZJ"), new ItemStack[]{null,LSTReg.sf("MDHS",1),null,null,LSTReg.mat("NETHERITE_LEGGINGS",1),null,null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "CH4", LSTGroups.ZB, LSTRecipeTypes.get("LENGSHANG_XX_CHZBDZJ"), new ItemStack[]{null,LSTReg.sf("DYHS",1),null,null,LSTReg.mat("NETHERITE_BOOTS",1),null,null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_冷殇科技说明书", LSTGroups.SMS, RecipeType.NULL, LSTScriptBridge.NO_RECIPE, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_版本", LSTGroups.SMS, RecipeType.NULL, LSTScriptBridge.NO_RECIPE, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_更新日志1", LSTGroups.SMS, RecipeType.NULL, LSTScriptBridge.NO_RECIPE, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_LMJ_SM", LSTGroups.LMJ, RecipeType.NULL, LSTScriptBridge.NO_RECIPE, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_LENGSHANG", LSTGroups.LMJ, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.firstOf(new String[]{"LOGITECH_BUG","REINFORCED_ALLOY_INGOT"},1),LSTReg.firstOf(new String[]{"LOGITECH_BUG","REINFORCED_ALLOY_INGOT"},1),LSTReg.firstOf(new String[]{"LOGITECH_BUG","REINFORCED_ALLOY_INGOT"},1),LSTReg.firstOf(new String[]{"LOGITECH_BUG","REINFORCED_ALLOY_INGOT"},1),null,LSTReg.firstOf(new String[]{"LOGITECH_BUG","REINFORCED_ALLOY_INGOT"},1),LSTReg.firstOf(new String[]{"LOGITECH_BUG","REINFORCED_ALLOY_INGOT"},1),LSTReg.firstOf(new String[]{"LOGITECH_BUG","REINFORCED_ALLOY_INGOT"},1),LSTReg.firstOf(new String[]{"LOGITECH_BUG","REINFORCED_ALLOY_INGOT"},1)}, true);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_Yomicer", LSTGroups.LMJ, RecipeType.NULL, LSTScriptBridge.NO_RECIPE, false);
    }

    private LSTItems43() {
    }
}
