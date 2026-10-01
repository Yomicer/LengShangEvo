package io.Yomicer.LengShangTech.gen;

import io.Yomicer.LengShangTech.core.*;
import io.Yomicer.LengShangTech.scripts.LSTScriptBridge;
import io.Yomicer.LengShangTech.scripts.LSTBlockDrops;
import io.Yomicer.LengShangTech.LengShangEvo;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import org.bukkit.inventory.ItemStack;

/** 冷殇物品定义 (自动转换, 第 48 批)。 */
public final class LSTItems47 {

    public static void create() {
        // LENGSHANG_YYLK
        LSTItemFactory.saved("LENGSHANG_YYLK","技能武器/YYLK","PAPER");
        // LENGSHANG_JZYB
        LSTItemFactory.saved("LENGSHANG_JZYB","技能武器/JZYB","PAPER");
        // LENGSHANG_SJZC
        LSTItemFactory.savedVersion("LENGSHANG_SJZC","技能武器/SJZC","1.21","1.21.3.4","PAPER");
        // LENGSHANG_QMLK
        LSTItemFactory.savedVersion("LENGSHANG_QMLK","技能武器/QMLK","1.21","1.21.3.4","PAPER");
        // LENGSHANG_YYSJ
        LSTItemFactory.savedVersion("LENGSHANG_YYSJ","技能武器/YYSJ","1.21","1.21.3.4","PAPER");
        // LENGSHANG_ZDQS
        LSTItemFactory.savedVersion("LENGSHANG_ZDQS","技能武器/ZDQS","1.21","1.21.3.4","PAPER");
        // LENGSHANG_PJQR
        LSTItemFactory.savedVersion("LENGSHANG_PJQR","技能武器/PJQR","1.21","1.21.3.4","PAPER");
        // LENGSHANG_XMBH
        LSTItemFactory.savedVersion("LENGSHANG_XMBH","技能武器/XMBH","1.21","1.21.3.4","PAPER");
        // LENGSHANG_YGZF
        LSTItemFactory.savedVersion("LENGSHANG_YGZF","技能武器/YGZF","1.21","1.21.3.4","PAPER");
        // LENGSHANG_QYMZ
        LSTItemFactory.savedVersion("LENGSHANG_QYMZ","技能武器/QYMZ","1.21","1.21.3.4","PAPER");
        // LENGSHANG_CTG
        LSTItemFactory.savedVersion("LENGSHANG_CTG","道具/CTG","1.21","1.21.3.4","PAPER");
        // LENGSHANG_SDZ
        LSTItemFactory.savedVersion("LENGSHANG_SDZ","道具/SDZ","1.21","1.21.3.4","PAPER");
        // LENGSHANG_便携式复刻坤
        LSTItemFactory.material("LENGSHANG_便携式复刻坤","BLAZE_ROD",false,"&c便&6携&e式&a复&9刻&5坤","&b&l右&3&l键&6&l复&9&l制&5&l掉&d&l落&c&l物","&6&l冷&e&l殇&a&l出&b&l品&a&l，&c&l必&d&l属&5&l精&9&l品&b&l！");
        // LENGSHANG_便携式复刻坤2
        LSTItemFactory.material("LENGSHANG_便携式复刻坤2","BLAZE_ROD",false,"&c便&6携&e式&a复&9刻&5坤","&b&l右&3&l键&6&l复&9&l制&e&l64个&5&l掉&d&l落&c&l物","&6&l冷&e&l殇&a&l出&b&l品，&c&l必&d&l属&5&l精&9&l品！");
        // LENGSHANG_修罗·戮世魔剑
        LSTItemFactory.savedVersion("LENGSHANG_修罗·戮世魔剑","套装系列/修罗/XLLSMJ","1.21","1.21.3.4","PAPER");
        // LENGSHANG_修罗·破界神镐
        LSTItemFactory.savedVersion("LENGSHANG_修罗·破界神镐","套装系列/修罗/XLPJSG","1.21","1.21.3.4","PAPER");
        // LENGSHANG_修罗·断魂战斧
        LSTItemFactory.savedVersion("LENGSHANG_修罗·断魂战斧","套装系列/修罗/XLDHZF","1.21","1.21.3.4","PAPER");
        // LENGSHANG_修罗·移山灵锹
        LSTItemFactory.savedVersion("LENGSHANG_修罗·移山灵锹","套装系列/修罗/XLYSLQ","1.21","1.21.3.4","PAPER");
        // LENGSHANG_修罗·灭世神弓
        LSTItemFactory.savedVersion("LENGSHANG_修罗·灭世神弓","套装系列/修罗/XLMSSG","1.21","1.21.3.4","PAPER");
        // LENGSHANG_幻彩源晶
        LSTItemFactory.head("LENGSHANG_幻彩源晶","bb1c35b04b7bf761619863c80d19d0fd339ef4ef64701fd0ea5ed84aa5470ccc","&x&F&F&3&B&F&F幻彩源晶","&f这玩意居然是重要材料？？");
        // LENGSHANG_YSMLFK_1
        LSTItemFactory.material("LENGSHANG_YSMLFK_1","COMMAND_BLOCK",false,"&a一阶压缩命令方块","&78个命令方块压缩而来");
        // LENGSHANG_YSMLFK_2
        LSTItemFactory.material("LENGSHANG_YSMLFK_2","COMMAND_BLOCK",false,"&b二阶压缩命令方块","&764个命令方块压缩而来");
        // LENGSHANG_YSMLFK_3
        LSTItemFactory.material("LENGSHANG_YSMLFK_3","COMMAND_BLOCK",false,"&5三阶压缩命令方块","&7512个命令方块压缩而来");
        // LENGSHANG_YSMLFK_4
        LSTItemFactory.material("LENGSHANG_YSMLFK_4","COMMAND_BLOCK",false,"&6四阶压缩命令方块","&74096个命令方块压缩而来");
        // LENGSHANG_YSMLFK_5
        LSTItemFactory.material("LENGSHANG_YSMLFK_5","COMMAND_BLOCK",false,"&e五阶压缩命令方块","&732768个命令方块压缩而来");
        // LENGSHANG_YSMLFK_6
        LSTItemFactory.material("LENGSHANG_YSMLFK_6","COMMAND_BLOCK",false,"&c六阶压缩命令方块","&7262144个命令方块压缩而来");
        // LENGSHANG_YSMLFK_7
        LSTItemFactory.material("LENGSHANG_YSMLFK_7","COMMAND_BLOCK",false,"&x&0&0&B&F&F&F七阶压缩命令方块","&72097152个命令方块压缩而来");
        // LENGSHANG_YSMLFK_8
        LSTItemFactory.material("LENGSHANG_YSMLFK_8","COMMAND_BLOCK",false,"&x&8&7&C&E&F&A八阶压缩命令方块","&716777216个命令方块压缩而来");
        // LENGSHANG_YSMLFK_9
        LSTItemFactory.material("LENGSHANG_YSMLFK_9","COMMAND_BLOCK",false,"&x&F&F&A&F&A&F九阶压缩命令方块","&7134217728个命令方块压缩而来");
        // LENGSHANG_YSXHXMLFK_1
        LSTItemFactory.material("LENGSHANG_YSXHXMLFK_1","REPEATING_COMMAND_BLOCK",false,"&a一阶压缩循环型命令方块","&78个循环型命令方块压缩而来");
        // LENGSHANG_YSXHXMLFK_2
        LSTItemFactory.material("LENGSHANG_YSXHXMLFK_2","REPEATING_COMMAND_BLOCK",false,"&b二阶压缩循环型命令方块","&764个循环型命令方块压缩而来");
        // LENGSHANG_YSXHXMLFK_3
        LSTItemFactory.material("LENGSHANG_YSXHXMLFK_3","REPEATING_COMMAND_BLOCK",false,"&5三阶压缩循环型命令方块","&7512个循环型命令方块压缩而来");
        // LENGSHANG_YSXHXMLFK_4
        LSTItemFactory.material("LENGSHANG_YSXHXMLFK_4","REPEATING_COMMAND_BLOCK",false,"&6四阶压缩循环型命令方块","&74096个循环型命令方块压缩而来");
        // LENGSHANG_YSXHXMLFK_5
        LSTItemFactory.material("LENGSHANG_YSXHXMLFK_5","REPEATING_COMMAND_BLOCK",false,"&e五阶压缩循环型命令方块","&732768个循环型命令方块压缩而来");
        // LENGSHANG_YSXHXMLFK_6
        LSTItemFactory.material("LENGSHANG_YSXHXMLFK_6","REPEATING_COMMAND_BLOCK",false,"&c六阶压缩循环型命令方块","&7262144个循环型命令方块压缩而来");
        // LENGSHANG_YSXHXMLFK_7
        LSTItemFactory.material("LENGSHANG_YSXHXMLFK_7","REPEATING_COMMAND_BLOCK",false,"&x&0&0&B&F&F&F七阶压缩循环型命令方块","&72097152个循环型命令方块压缩而来");
        // LENGSHANG_YSXHXMLFK_8
        LSTItemFactory.material("LENGSHANG_YSXHXMLFK_8","REPEATING_COMMAND_BLOCK",false,"&x&8&7&C&E&F&A八阶压缩循环型命令方块","&716777216个循环型命令方块压缩而来");
        // LENGSHANG_YSXHXMLFK_9
        LSTItemFactory.material("LENGSHANG_YSXHXMLFK_9","REPEATING_COMMAND_BLOCK",false,"&x&F&F&A&F&A&F九阶压缩循环型命令方块","&7134217728个循环型命令方块压缩而来");
        // LENGSHANG_YSLSXMLFK_1
        LSTItemFactory.material("LENGSHANG_YSLSXMLFK_1","CHAIN_COMMAND_BLOCK",false,"&a一阶压缩连锁型命令方块","&78个连锁型命令方块压缩而来");
        // LENGSHANG_YSLSXMLFK_2
        LSTItemFactory.material("LENGSHANG_YSLSXMLFK_2","CHAIN_COMMAND_BLOCK",false,"&b二阶压缩连锁型命令方块","&764个连锁型命令方块压缩而来");
        // LENGSHANG_YSLSXMLFK_3
        LSTItemFactory.material("LENGSHANG_YSLSXMLFK_3","CHAIN_COMMAND_BLOCK",false,"&5三阶压缩连锁型命令方块","&7512个连锁型命令方块压缩而来");
        // LENGSHANG_YSLSXMLFK_4
        LSTItemFactory.material("LENGSHANG_YSLSXMLFK_4","CHAIN_COMMAND_BLOCK",false,"&6四阶压缩连锁型命令方块","&74096个连锁型命令方块压缩而来");
        // LENGSHANG_YSLSXMLFK_5
        LSTItemFactory.material("LENGSHANG_YSLSXMLFK_5","CHAIN_COMMAND_BLOCK",false,"&e五阶压缩连锁型命令方块","&732768个连锁型命令方块压缩而来");
        // LENGSHANG_YSLSXMLFK_6
        LSTItemFactory.material("LENGSHANG_YSLSXMLFK_6","CHAIN_COMMAND_BLOCK",false,"&c六阶压缩连锁型命令方块","&7262144个连锁型命令方块压缩而来");
        // LENGSHANG_YSLSXMLFK_7
        LSTItemFactory.material("LENGSHANG_YSLSXMLFK_7","CHAIN_COMMAND_BLOCK",false,"&x&0&0&B&F&F&F七阶压缩连锁型命令方块","&72097152个连锁型命令方块压缩而来");
        // LENGSHANG_YSLSXMLFK_8
        LSTItemFactory.material("LENGSHANG_YSLSXMLFK_8","CHAIN_COMMAND_BLOCK",false,"&x&8&7&C&E&F&A八阶压缩连锁型命令方块","&716777216个连锁型命令方块压缩而来");
        // LENGSHANG_YSLSXMLFK_9
        LSTItemFactory.material("LENGSHANG_YSLSXMLFK_9","CHAIN_COMMAND_BLOCK",false,"&x&F&F&A&F&A&F九阶压缩连锁型命令方块","&7134217728个连锁型命令方块压缩而来");
        // LENGSHANG_YSJGFK_1
        LSTItemFactory.material("LENGSHANG_YSJGFK_1","STRUCTURE_BLOCK",false,"&a一阶压缩结构方块","&78个结构方块压缩而来");
        // LENGSHANG_YSJGFK_2
        LSTItemFactory.material("LENGSHANG_YSJGFK_2","STRUCTURE_BLOCK",false,"&b二阶压缩结构方块","&764个结构方块压缩而来");
        // LENGSHANG_YSJGFK_3
        LSTItemFactory.material("LENGSHANG_YSJGFK_3","STRUCTURE_BLOCK",false,"&5三阶压缩结构方块","&7512个结构方块压缩而来");
        // LENGSHANG_YSJGFK_4
        LSTItemFactory.material("LENGSHANG_YSJGFK_4","STRUCTURE_BLOCK",false,"&6四阶压缩结构方块","&74096个结构方块压缩而来");
        // LENGSHANG_YSJGFK_5
        LSTItemFactory.material("LENGSHANG_YSJGFK_5","STRUCTURE_BLOCK",false,"&e五阶压缩结构方块","&732768个结构方块压缩而来");
        // LENGSHANG_YSJGFK_6
        LSTItemFactory.material("LENGSHANG_YSJGFK_6","STRUCTURE_BLOCK",false,"&c六阶压缩结构方块","&7262144个结构方块压缩而来");
        // LENGSHANG_YSJGFK_7
        LSTItemFactory.material("LENGSHANG_YSJGFK_7","STRUCTURE_BLOCK",false,"&x&0&0&B&F&F&F七阶压缩结构方块","&72097152个结构方块压缩而来");
        // LENGSHANG_YSJGFK_8
        LSTItemFactory.material("LENGSHANG_YSJGFK_8","STRUCTURE_BLOCK",false,"&x&8&7&C&E&F&A八阶压缩结构方块","&716777216个结构方块压缩而来");
        // LENGSHANG_YSJGFK_9
        LSTItemFactory.material("LENGSHANG_YSJGFK_9","STRUCTURE_BLOCK",false,"&x&F&F&A&F&A&F九阶压缩结构方块","&7134217728个结构方块压缩而来");
        // LENGSHANG_YSPTFK_1
        LSTItemFactory.material("LENGSHANG_YSPTFK_1","JIGSAW",false,"&a一阶压缩拼图方块","&78个拼图方块压缩而来");
        // LENGSHANG_YSPTFK_2
        LSTItemFactory.material("LENGSHANG_YSPTFK_2","JIGSAW",false,"&b二阶压缩拼图方块","&764个拼图方块压缩而来");
        // LENGSHANG_YSPTFK_3
        LSTItemFactory.material("LENGSHANG_YSPTFK_3","JIGSAW",false,"&5三阶压缩拼图方块","&7512个拼图方块压缩而来");
        // LENGSHANG_YSPTFK_4
        LSTItemFactory.material("LENGSHANG_YSPTFK_4","JIGSAW",false,"&6四阶压缩拼图方块","&74096个拼图方块压缩而来");
        // LENGSHANG_YSPTFK_5
        LSTItemFactory.material("LENGSHANG_YSPTFK_5","JIGSAW",false,"&e五阶压缩拼图方块","&732768个拼图方块压缩而来");
    }

    public static void register(LengShangEvo plugin) {
        LSTScriptBridge.registerScriptItem(plugin, "LENGSHANG_CXYH", "武器/赤霄援护", LSTGroups.WQ, LSTRecipeTypes.get("LENGSHANG_XX_TMMHDHJ"), LSTScriptBridge.NO_RECIPE);
        LSTScriptBridge.registerScriptItem(plugin, "LENGSHANG_YYLK", "武器/幽影裂空", LSTGroups.WQ, LSTRecipeTypes.get("LENGSHANG_XX_TMMHDHJ"), LSTScriptBridge.NO_RECIPE);
        LSTScriptBridge.registerScriptItem(plugin, "LENGSHANG_JZYB", "武器/极昼耀斑", LSTGroups.WQ, LSTRecipeTypes.get("LENGSHANG_XX_TMMHDHJ"), LSTScriptBridge.NO_RECIPE);
        LSTScriptBridge.registerScriptItem(plugin, "LENGSHANG_SJZC", "武器/霜烬战锤", LSTGroups.WQ, LSTRecipeTypes.get("LENGSHANG_XX_TMMHDHJ"), LSTScriptBridge.NO_RECIPE);
        LSTScriptBridge.registerScriptItem(plugin, "LENGSHANG_QMLK", "武器/青冥裂空", LSTGroups.WQ, LSTRecipeTypes.get("LENGSHANG_XX_TMMHDHJ"), LSTScriptBridge.NO_RECIPE);
        LSTScriptBridge.registerScriptItem(plugin, "LENGSHANG_YYSJ", "武器/幽荧噬界", LSTGroups.WQ, LSTRecipeTypes.get("LENGSHANG_XX_TMMHDHJ"), LSTScriptBridge.NO_RECIPE);
        LSTScriptBridge.registerScriptItem(plugin, "LENGSHANG_ZDQS", "武器/紫电青霜", LSTGroups.WQ, LSTRecipeTypes.get("LENGSHANG_XX_TMMHDHJ"), LSTScriptBridge.NO_RECIPE);
        LSTScriptBridge.registerScriptItem(plugin, "LENGSHANG_PJQR", "武器/破军千刃", LSTGroups.WQ, LSTRecipeTypes.get("LENGSHANG_XX_TMMHDHJ"), LSTScriptBridge.NO_RECIPE);
        LSTScriptBridge.registerScriptItem(plugin, "LENGSHANG_XMBH", "武器/玄冥庇护", LSTGroups.WQ, LSTRecipeTypes.get("LENGSHANG_XX_TMMHDHJ"), LSTScriptBridge.NO_RECIPE);
        LSTScriptBridge.registerScriptItem(plugin, "LENGSHANG_YGZF", "武器/瑶光祝福", LSTGroups.WQ, LSTRecipeTypes.get("LENGSHANG_XX_TMMHDHJ"), LSTScriptBridge.NO_RECIPE);
        LSTScriptBridge.registerScriptItem(plugin, "LENGSHANG_QYMZ", "武器/青鸾鸣奏1.21", LSTGroups.WQ, LSTRecipeTypes.get("LENGSHANG_XX_TMMHDHJ"), LSTScriptBridge.NO_RECIPE);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_CTG", LSTGroups.TSWP, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("MAGICAL_GLASS",1),LSTReg.sf("ELECTRIC_MOTOR",1),LSTReg.sf("MAGICAL_GLASS",1),LSTReg.sf("BASIC_CIRCUIT_BOARD",1),LSTReg.sf("REINFORCED_ALLOY_INGOT",1),LSTReg.sf("ADVANCED_CIRCUIT_BOARD",1),LSTReg.sf("MAGICAL_GLASS",1),LSTReg.sf("HEATING_COIL",1),LSTReg.sf("MAGICAL_GLASS",1)}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_SDZ", LSTGroups.TSWP, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("MAGICAL_GLASS",1),LSTReg.sf("ELECTRIC_MOTOR",1),LSTReg.sf("MAGICAL_GLASS",1),LSTReg.sf("ADVANCED_CIRCUIT_BOARD",1),LSTReg.sf("REDSTONE_ALLOY",1),LSTReg.sf("BASIC_CIRCUIT_BOARD",1),LSTReg.sf("MAGICAL_GLASS",1),LSTReg.sf("HEATING_COIL",1),LSTReg.sf("MAGICAL_GLASS",1)}, false);
        LSTScriptBridge.registerScriptItem(plugin, "LENGSHANG_便携式复刻坤", "道具/便携式复刻坤", LSTGroups.ZHONGZHANG, LSTRecipeTypes.get("LENGSHANG_XX_ZYGZT"), new ItemStack[]{null,null,null,null,LSTReg.sf("LENGSHANG_终焉工作台",1),null,null,null,null});
        LSTScriptBridge.registerScriptItem(plugin, "LENGSHANG_便携式复刻坤2", "道具/便携式复刻坤2", LSTGroups.ZHONGZHANG, RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_便携式复刻坤",64),null,null,null,null,null,null,null,null});
        LSTScriptBridge.registerScriptItem(plugin, "LENGSHANG_修罗·戮世魔剑", "武器/修罗·戮世魔剑", LSTGroups.WQ, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{null,LSTReg.sf("HSNB5",1),null,null,LSTReg.sf("AW_YZXWZJ",1),null,null,LSTReg.sf("LENGSHANG_修罗之心",1),null});
        LSTScriptBridge.registerScriptItem(plugin, "LENGSHANG_修罗·破界神镐", "武器/修罗·破界神镐", LSTGroups.GJ, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{null,LSTReg.sf("HSNB6",1),null,null,LSTReg.sf("LENGSHANG_修罗之心",1),null,null,null,null});
        LSTScriptBridge.registerScriptItem(plugin, "LENGSHANG_修罗·断魂战斧", "武器/修罗·断魂战斧", LSTGroups.GJ, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{null,LSTReg.sf("HSNB7",1),null,null,LSTReg.sf("LENGSHANG_修罗之心",1),null,null,null,null});
        LSTScriptBridge.registerScriptItem(plugin, "LENGSHANG_修罗·移山灵锹", "武器/修罗·移山灵锹", LSTGroups.GJ, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{null,LSTReg.sf("HSNB8",1),null,null,LSTReg.sf("LENGSHANG_修罗之心",1),null,null,null,null});
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_修罗·灭世神弓", LSTGroups.WQ, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{null,LSTReg.sf("INFINITY_BOW",1),null,null,LSTReg.sf("SUPREME_BOW_SUPREME",1),null,null,LSTReg.sf("LENGSHANG_修罗之心",1),null}, true);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_幻彩源晶", LSTGroups.CL, LSTRecipeTypes.get("LENGSHANG_XX_HCYJ"), LSTScriptBridge.NO_RECIPE, false);
        LSTBlockDrops.register("STONE", "LENGSHANG_幻彩源晶", 10);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_YSMLFK_1", LSTGroups.YSCL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.mat("COMMAND_BLOCK",1),LSTReg.mat("COMMAND_BLOCK",1),LSTReg.mat("COMMAND_BLOCK",1),LSTReg.mat("COMMAND_BLOCK",1),LSTReg.sf("LENGSHANG_幻彩源晶",1),LSTReg.mat("COMMAND_BLOCK",1),LSTReg.mat("COMMAND_BLOCK",1),LSTReg.mat("COMMAND_BLOCK",1),LSTReg.mat("COMMAND_BLOCK",1)}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_YSMLFK_2", LSTGroups.YSCL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("LENGSHANG_YSMLFK_1",1),LSTReg.sf("LENGSHANG_YSMLFK_1",1),LSTReg.sf("LENGSHANG_YSMLFK_1",1),LSTReg.sf("LENGSHANG_YSMLFK_1",1),LSTReg.sf("LENGSHANG_幻彩源晶",1),LSTReg.sf("LENGSHANG_YSMLFK_1",1),LSTReg.sf("LENGSHANG_YSMLFK_1",1),LSTReg.sf("LENGSHANG_YSMLFK_1",1),LSTReg.sf("LENGSHANG_YSMLFK_1",1)}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_YSMLFK_3", LSTGroups.YSCL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("LENGSHANG_YSMLFK_2",1),LSTReg.sf("LENGSHANG_YSMLFK_2",1),LSTReg.sf("LENGSHANG_YSMLFK_2",1),LSTReg.sf("LENGSHANG_YSMLFK_2",1),LSTReg.sf("LENGSHANG_幻彩源晶",1),LSTReg.sf("LENGSHANG_YSMLFK_2",1),LSTReg.sf("LENGSHANG_YSMLFK_2",1),LSTReg.sf("LENGSHANG_YSMLFK_2",1),LSTReg.sf("LENGSHANG_YSMLFK_2",1)}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_YSMLFK_4", LSTGroups.YSCL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("LENGSHANG_YSMLFK_3",1),LSTReg.sf("LENGSHANG_YSMLFK_3",1),LSTReg.sf("LENGSHANG_YSMLFK_3",1),LSTReg.sf("LENGSHANG_YSMLFK_3",1),LSTReg.sf("LENGSHANG_幻彩源晶",1),LSTReg.sf("LENGSHANG_YSMLFK_3",1),LSTReg.sf("LENGSHANG_YSMLFK_3",1),LSTReg.sf("LENGSHANG_YSMLFK_3",1),LSTReg.sf("LENGSHANG_YSMLFK_3",1)}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_YSMLFK_5", LSTGroups.YSCL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("LENGSHANG_YSMLFK_4",1),LSTReg.sf("LENGSHANG_YSMLFK_4",1),LSTReg.sf("LENGSHANG_YSMLFK_4",1),LSTReg.sf("LENGSHANG_YSMLFK_4",1),LSTReg.sf("LENGSHANG_幻彩源晶",1),LSTReg.sf("LENGSHANG_YSMLFK_4",1),LSTReg.sf("LENGSHANG_YSMLFK_4",1),LSTReg.sf("LENGSHANG_YSMLFK_4",1),LSTReg.sf("LENGSHANG_YSMLFK_4",1)}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_YSMLFK_6", LSTGroups.YSCL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("LENGSHANG_YSMLFK_5",1),LSTReg.sf("LENGSHANG_YSMLFK_5",1),LSTReg.sf("LENGSHANG_YSMLFK_5",1),LSTReg.sf("LENGSHANG_YSMLFK_5",1),LSTReg.sf("LENGSHANG_幻彩源晶",1),LSTReg.sf("LENGSHANG_YSMLFK_5",1),LSTReg.sf("LENGSHANG_YSMLFK_5",1),LSTReg.sf("LENGSHANG_YSMLFK_5",1),LSTReg.sf("LENGSHANG_YSMLFK_5",1)}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_YSMLFK_7", LSTGroups.YSCL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("LENGSHANG_YSMLFK_6",1),LSTReg.sf("LENGSHANG_YSMLFK_6",1),LSTReg.sf("LENGSHANG_YSMLFK_6",1),LSTReg.sf("LENGSHANG_YSMLFK_6",1),LSTReg.sf("LENGSHANG_幻彩源晶",1),LSTReg.sf("LENGSHANG_YSMLFK_6",1),LSTReg.sf("LENGSHANG_YSMLFK_6",1),LSTReg.sf("LENGSHANG_YSMLFK_6",1),LSTReg.sf("LENGSHANG_YSMLFK_6",1)}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_YSMLFK_8", LSTGroups.YSCL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("LENGSHANG_YSMLFK_7",1),LSTReg.sf("LENGSHANG_YSMLFK_7",1),LSTReg.sf("LENGSHANG_YSMLFK_7",1),LSTReg.sf("LENGSHANG_YSMLFK_7",1),LSTReg.sf("LENGSHANG_幻彩源晶",1),LSTReg.sf("LENGSHANG_YSMLFK_7",1),LSTReg.sf("LENGSHANG_YSMLFK_7",1),LSTReg.sf("LENGSHANG_YSMLFK_7",1),LSTReg.sf("LENGSHANG_YSMLFK_7",1)}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_YSMLFK_9", LSTGroups.YSCL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("LENGSHANG_YSMLFK_8",1),LSTReg.sf("LENGSHANG_YSMLFK_8",1),LSTReg.sf("LENGSHANG_YSMLFK_8",1),LSTReg.sf("LENGSHANG_YSMLFK_8",1),LSTReg.sf("LENGSHANG_幻彩源晶",1),LSTReg.sf("LENGSHANG_YSMLFK_8",1),LSTReg.sf("LENGSHANG_YSMLFK_8",1),LSTReg.sf("LENGSHANG_YSMLFK_8",1),LSTReg.sf("LENGSHANG_YSMLFK_8",1)}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_YSXHXMLFK_1", LSTGroups.YSCL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.mat("REPEATING_COMMAND_BLOCK",1),LSTReg.mat("REPEATING_COMMAND_BLOCK",1),LSTReg.mat("REPEATING_COMMAND_BLOCK",1),LSTReg.mat("REPEATING_COMMAND_BLOCK",1),LSTReg.sf("LENGSHANG_幻彩源晶",1),LSTReg.mat("REPEATING_COMMAND_BLOCK",1),LSTReg.mat("REPEATING_COMMAND_BLOCK",1),LSTReg.mat("REPEATING_COMMAND_BLOCK",1),LSTReg.mat("REPEATING_COMMAND_BLOCK",1)}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_YSXHXMLFK_2", LSTGroups.YSCL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("LENGSHANG_YSXHXMLFK_1",1),LSTReg.sf("LENGSHANG_YSXHXMLFK_1",1),LSTReg.sf("LENGSHANG_YSXHXMLFK_1",1),LSTReg.sf("LENGSHANG_YSXHXMLFK_1",1),LSTReg.sf("LENGSHANG_幻彩源晶",1),LSTReg.sf("LENGSHANG_YSXHXMLFK_1",1),LSTReg.sf("LENGSHANG_YSXHXMLFK_1",1),LSTReg.sf("LENGSHANG_YSXHXMLFK_1",1),LSTReg.sf("LENGSHANG_YSXHXMLFK_1",1)}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_YSXHXMLFK_3", LSTGroups.YSCL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("LENGSHANG_YSXHXMLFK_2",1),LSTReg.sf("LENGSHANG_YSXHXMLFK_2",1),LSTReg.sf("LENGSHANG_YSXHXMLFK_2",1),LSTReg.sf("LENGSHANG_YSXHXMLFK_2",1),LSTReg.sf("LENGSHANG_幻彩源晶",1),LSTReg.sf("LENGSHANG_YSXHXMLFK_2",1),LSTReg.sf("LENGSHANG_YSXHXMLFK_2",1),LSTReg.sf("LENGSHANG_YSXHXMLFK_2",1),LSTReg.sf("LENGSHANG_YSXHXMLFK_2",1)}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_YSXHXMLFK_4", LSTGroups.YSCL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("LENGSHANG_YSXHXMLFK_3",1),LSTReg.sf("LENGSHANG_YSXHXMLFK_3",1),LSTReg.sf("LENGSHANG_YSXHXMLFK_3",1),LSTReg.sf("LENGSHANG_YSXHXMLFK_3",1),LSTReg.sf("LENGSHANG_幻彩源晶",1),LSTReg.sf("LENGSHANG_YSXHXMLFK_3",1),LSTReg.sf("LENGSHANG_YSXHXMLFK_3",1),LSTReg.sf("LENGSHANG_YSXHXMLFK_3",1),LSTReg.sf("LENGSHANG_YSXHXMLFK_3",1)}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_YSXHXMLFK_5", LSTGroups.YSCL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("LENGSHANG_YSXHXMLFK_4",1),LSTReg.sf("LENGSHANG_YSXHXMLFK_4",1),LSTReg.sf("LENGSHANG_YSXHXMLFK_4",1),LSTReg.sf("LENGSHANG_YSXHXMLFK_4",1),LSTReg.sf("LENGSHANG_幻彩源晶",1),LSTReg.sf("LENGSHANG_YSXHXMLFK_4",1),LSTReg.sf("LENGSHANG_YSXHXMLFK_4",1),LSTReg.sf("LENGSHANG_YSXHXMLFK_4",1),LSTReg.sf("LENGSHANG_YSXHXMLFK_4",1)}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_YSXHXMLFK_6", LSTGroups.YSCL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("LENGSHANG_YSXHXMLFK_5",1),LSTReg.sf("LENGSHANG_YSXHXMLFK_5",1),LSTReg.sf("LENGSHANG_YSXHXMLFK_5",1),LSTReg.sf("LENGSHANG_YSXHXMLFK_5",1),LSTReg.sf("LENGSHANG_幻彩源晶",1),LSTReg.sf("LENGSHANG_YSXHXMLFK_5",1),LSTReg.sf("LENGSHANG_YSXHXMLFK_5",1),LSTReg.sf("LENGSHANG_YSXHXMLFK_5",1),LSTReg.sf("LENGSHANG_YSXHXMLFK_5",1)}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_YSXHXMLFK_7", LSTGroups.YSCL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("LENGSHANG_YSXHXMLFK_6",1),LSTReg.sf("LENGSHANG_YSXHXMLFK_6",1),LSTReg.sf("LENGSHANG_YSXHXMLFK_6",1),LSTReg.sf("LENGSHANG_YSXHXMLFK_6",1),LSTReg.sf("LENGSHANG_幻彩源晶",1),LSTReg.sf("LENGSHANG_YSXHXMLFK_6",1),LSTReg.sf("LENGSHANG_YSXHXMLFK_6",1),LSTReg.sf("LENGSHANG_YSXHXMLFK_6",1),LSTReg.sf("LENGSHANG_YSXHXMLFK_6",1)}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_YSXHXMLFK_8", LSTGroups.YSCL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("LENGSHANG_YSXHXMLFK_7",1),LSTReg.sf("LENGSHANG_YSXHXMLFK_7",1),LSTReg.sf("LENGSHANG_YSXHXMLFK_7",1),LSTReg.sf("LENGSHANG_YSXHXMLFK_7",1),LSTReg.sf("LENGSHANG_幻彩源晶",1),LSTReg.sf("LENGSHANG_YSXHXMLFK_7",1),LSTReg.sf("LENGSHANG_YSXHXMLFK_7",1),LSTReg.sf("LENGSHANG_YSXHXMLFK_7",1),LSTReg.sf("LENGSHANG_YSXHXMLFK_7",1)}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_YSXHXMLFK_9", LSTGroups.YSCL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("LENGSHANG_YSXHXMLFK_8",1),LSTReg.sf("LENGSHANG_YSXHXMLFK_8",1),LSTReg.sf("LENGSHANG_YSXHXMLFK_8",1),LSTReg.sf("LENGSHANG_YSXHXMLFK_8",1),LSTReg.sf("LENGSHANG_幻彩源晶",1),LSTReg.sf("LENGSHANG_YSXHXMLFK_8",1),LSTReg.sf("LENGSHANG_YSXHXMLFK_8",1),LSTReg.sf("LENGSHANG_YSXHXMLFK_8",1),LSTReg.sf("LENGSHANG_YSXHXMLFK_8",1)}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_YSLSXMLFK_1", LSTGroups.YSCL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.mat("CHAIN_COMMAND_BLOCK",1),LSTReg.mat("CHAIN_COMMAND_BLOCK",1),LSTReg.mat("CHAIN_COMMAND_BLOCK",1),LSTReg.mat("CHAIN_COMMAND_BLOCK",1),LSTReg.sf("LENGSHANG_幻彩源晶",1),LSTReg.mat("CHAIN_COMMAND_BLOCK",1),LSTReg.mat("CHAIN_COMMAND_BLOCK",1),LSTReg.mat("CHAIN_COMMAND_BLOCK",1),LSTReg.mat("CHAIN_COMMAND_BLOCK",1)}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_YSLSXMLFK_2", LSTGroups.YSCL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("LENGSHANG_YSLSXMLFK_1",1),LSTReg.sf("LENGSHANG_YSLSXMLFK_1",1),LSTReg.sf("LENGSHANG_YSLSXMLFK_1",1),LSTReg.sf("LENGSHANG_YSLSXMLFK_1",1),LSTReg.sf("LENGSHANG_幻彩源晶",1),LSTReg.sf("LENGSHANG_YSLSXMLFK_1",1),LSTReg.sf("LENGSHANG_YSLSXMLFK_1",1),LSTReg.sf("LENGSHANG_YSLSXMLFK_1",1),LSTReg.sf("LENGSHANG_YSLSXMLFK_1",1)}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_YSLSXMLFK_3", LSTGroups.YSCL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("LENGSHANG_YSLSXMLFK_2",1),LSTReg.sf("LENGSHANG_YSLSXMLFK_2",1),LSTReg.sf("LENGSHANG_YSLSXMLFK_2",1),LSTReg.sf("LENGSHANG_YSLSXMLFK_2",1),LSTReg.sf("LENGSHANG_幻彩源晶",1),LSTReg.sf("LENGSHANG_YSLSXMLFK_2",1),LSTReg.sf("LENGSHANG_YSLSXMLFK_2",1),LSTReg.sf("LENGSHANG_YSLSXMLFK_2",1),LSTReg.sf("LENGSHANG_YSLSXMLFK_2",1)}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_YSLSXMLFK_4", LSTGroups.YSCL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("LENGSHANG_YSLSXMLFK_3",1),LSTReg.sf("LENGSHANG_YSLSXMLFK_3",1),LSTReg.sf("LENGSHANG_YSLSXMLFK_3",1),LSTReg.sf("LENGSHANG_YSLSXMLFK_3",1),LSTReg.sf("LENGSHANG_幻彩源晶",1),LSTReg.sf("LENGSHANG_YSLSXMLFK_3",1),LSTReg.sf("LENGSHANG_YSLSXMLFK_3",1),LSTReg.sf("LENGSHANG_YSLSXMLFK_3",1),LSTReg.sf("LENGSHANG_YSLSXMLFK_3",1)}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_YSLSXMLFK_5", LSTGroups.YSCL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("LENGSHANG_YSLSXMLFK_4",1),LSTReg.sf("LENGSHANG_YSLSXMLFK_4",1),LSTReg.sf("LENGSHANG_YSLSXMLFK_4",1),LSTReg.sf("LENGSHANG_YSLSXMLFK_4",1),LSTReg.sf("LENGSHANG_幻彩源晶",1),LSTReg.sf("LENGSHANG_YSLSXMLFK_4",1),LSTReg.sf("LENGSHANG_YSLSXMLFK_4",1),LSTReg.sf("LENGSHANG_YSLSXMLFK_4",1),LSTReg.sf("LENGSHANG_YSLSXMLFK_4",1)}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_YSLSXMLFK_6", LSTGroups.YSCL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("LENGSHANG_YSLSXMLFK_5",1),LSTReg.sf("LENGSHANG_YSLSXMLFK_5",1),LSTReg.sf("LENGSHANG_YSLSXMLFK_5",1),LSTReg.sf("LENGSHANG_YSLSXMLFK_5",1),LSTReg.sf("LENGSHANG_幻彩源晶",1),LSTReg.sf("LENGSHANG_YSLSXMLFK_5",1),LSTReg.sf("LENGSHANG_YSLSXMLFK_5",1),LSTReg.sf("LENGSHANG_YSLSXMLFK_5",1),LSTReg.sf("LENGSHANG_YSLSXMLFK_5",1)}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_YSLSXMLFK_7", LSTGroups.YSCL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("LENGSHANG_YSLSXMLFK_6",1),LSTReg.sf("LENGSHANG_YSLSXMLFK_6",1),LSTReg.sf("LENGSHANG_YSLSXMLFK_6",1),LSTReg.sf("LENGSHANG_YSLSXMLFK_6",1),LSTReg.sf("LENGSHANG_幻彩源晶",1),LSTReg.sf("LENGSHANG_YSLSXMLFK_6",1),LSTReg.sf("LENGSHANG_YSLSXMLFK_6",1),LSTReg.sf("LENGSHANG_YSLSXMLFK_6",1),LSTReg.sf("LENGSHANG_YSLSXMLFK_6",1)}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_YSLSXMLFK_8", LSTGroups.YSCL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("LENGSHANG_YSLSXMLFK_7",1),LSTReg.sf("LENGSHANG_YSLSXMLFK_7",1),LSTReg.sf("LENGSHANG_YSLSXMLFK_7",1),LSTReg.sf("LENGSHANG_YSLSXMLFK_7",1),LSTReg.sf("LENGSHANG_幻彩源晶",1),LSTReg.sf("LENGSHANG_YSLSXMLFK_7",1),LSTReg.sf("LENGSHANG_YSLSXMLFK_7",1),LSTReg.sf("LENGSHANG_YSLSXMLFK_7",1),LSTReg.sf("LENGSHANG_YSLSXMLFK_7",1)}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_YSLSXMLFK_9", LSTGroups.YSCL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("LENGSHANG_YSLSXMLFK_8",1),LSTReg.sf("LENGSHANG_YSLSXMLFK_8",1),LSTReg.sf("LENGSHANG_YSLSXMLFK_8",1),LSTReg.sf("LENGSHANG_YSLSXMLFK_8",1),LSTReg.sf("LENGSHANG_幻彩源晶",1),LSTReg.sf("LENGSHANG_YSLSXMLFK_8",1),LSTReg.sf("LENGSHANG_YSLSXMLFK_8",1),LSTReg.sf("LENGSHANG_YSLSXMLFK_8",1),LSTReg.sf("LENGSHANG_YSLSXMLFK_8",1)}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_YSJGFK_1", LSTGroups.YSCL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.mat("STRUCTURE_BLOCK",1),LSTReg.mat("STRUCTURE_BLOCK",1),LSTReg.mat("STRUCTURE_BLOCK",1),LSTReg.mat("STRUCTURE_BLOCK",1),LSTReg.sf("LENGSHANG_幻彩源晶",1),LSTReg.mat("STRUCTURE_BLOCK",1),LSTReg.mat("STRUCTURE_BLOCK",1),LSTReg.mat("STRUCTURE_BLOCK",1),LSTReg.mat("STRUCTURE_BLOCK",1)}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_YSJGFK_2", LSTGroups.YSCL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("LENGSHANG_YSJGFK_1",1),LSTReg.sf("LENGSHANG_YSJGFK_1",1),LSTReg.sf("LENGSHANG_YSJGFK_1",1),LSTReg.sf("LENGSHANG_YSJGFK_1",1),LSTReg.sf("LENGSHANG_幻彩源晶",1),LSTReg.sf("LENGSHANG_YSJGFK_1",1),LSTReg.sf("LENGSHANG_YSJGFK_1",1),LSTReg.sf("LENGSHANG_YSJGFK_1",1),LSTReg.sf("LENGSHANG_YSJGFK_1",1)}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_YSJGFK_3", LSTGroups.YSCL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("LENGSHANG_YSJGFK_2",1),LSTReg.sf("LENGSHANG_YSJGFK_2",1),LSTReg.sf("LENGSHANG_YSJGFK_2",1),LSTReg.sf("LENGSHANG_YSJGFK_2",1),LSTReg.sf("LENGSHANG_幻彩源晶",1),LSTReg.sf("LENGSHANG_YSJGFK_2",1),LSTReg.sf("LENGSHANG_YSJGFK_2",1),LSTReg.sf("LENGSHANG_YSJGFK_2",1),LSTReg.sf("LENGSHANG_YSJGFK_2",1)}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_YSJGFK_4", LSTGroups.YSCL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("LENGSHANG_YSJGFK_3",1),LSTReg.sf("LENGSHANG_YSJGFK_3",1),LSTReg.sf("LENGSHANG_YSJGFK_3",1),LSTReg.sf("LENGSHANG_YSJGFK_3",1),LSTReg.sf("LENGSHANG_幻彩源晶",1),LSTReg.sf("LENGSHANG_YSJGFK_3",1),LSTReg.sf("LENGSHANG_YSJGFK_3",1),LSTReg.sf("LENGSHANG_YSJGFK_3",1),LSTReg.sf("LENGSHANG_YSJGFK_3",1)}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_YSJGFK_5", LSTGroups.YSCL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("LENGSHANG_YSJGFK_4",1),LSTReg.sf("LENGSHANG_YSJGFK_4",1),LSTReg.sf("LENGSHANG_YSJGFK_4",1),LSTReg.sf("LENGSHANG_YSJGFK_4",1),LSTReg.sf("LENGSHANG_幻彩源晶",1),LSTReg.sf("LENGSHANG_YSJGFK_4",1),LSTReg.sf("LENGSHANG_YSJGFK_4",1),LSTReg.sf("LENGSHANG_YSJGFK_4",1),LSTReg.sf("LENGSHANG_YSJGFK_4",1)}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_YSJGFK_6", LSTGroups.YSCL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("LENGSHANG_YSJGFK_5",1),LSTReg.sf("LENGSHANG_YSJGFK_5",1),LSTReg.sf("LENGSHANG_YSJGFK_5",1),LSTReg.sf("LENGSHANG_YSJGFK_5",1),LSTReg.sf("LENGSHANG_幻彩源晶",1),LSTReg.sf("LENGSHANG_YSJGFK_5",1),LSTReg.sf("LENGSHANG_YSJGFK_5",1),LSTReg.sf("LENGSHANG_YSJGFK_5",1),LSTReg.sf("LENGSHANG_YSJGFK_5",1)}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_YSJGFK_7", LSTGroups.YSCL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("LENGSHANG_YSJGFK_6",1),LSTReg.sf("LENGSHANG_YSJGFK_6",1),LSTReg.sf("LENGSHANG_YSJGFK_6",1),LSTReg.sf("LENGSHANG_YSJGFK_6",1),LSTReg.sf("LENGSHANG_幻彩源晶",1),LSTReg.sf("LENGSHANG_YSJGFK_6",1),LSTReg.sf("LENGSHANG_YSJGFK_6",1),LSTReg.sf("LENGSHANG_YSJGFK_6",1),LSTReg.sf("LENGSHANG_YSJGFK_6",1)}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_YSJGFK_8", LSTGroups.YSCL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("LENGSHANG_YSJGFK_7",1),LSTReg.sf("LENGSHANG_YSJGFK_7",1),LSTReg.sf("LENGSHANG_YSJGFK_7",1),LSTReg.sf("LENGSHANG_YSJGFK_7",1),LSTReg.sf("LENGSHANG_幻彩源晶",1),LSTReg.sf("LENGSHANG_YSJGFK_7",1),LSTReg.sf("LENGSHANG_YSJGFK_7",1),LSTReg.sf("LENGSHANG_YSJGFK_7",1),LSTReg.sf("LENGSHANG_YSJGFK_7",1)}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_YSJGFK_9", LSTGroups.YSCL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("LENGSHANG_YSJGFK_8",1),LSTReg.sf("LENGSHANG_YSJGFK_8",1),LSTReg.sf("LENGSHANG_YSJGFK_8",1),LSTReg.sf("LENGSHANG_YSJGFK_8",1),LSTReg.sf("LENGSHANG_幻彩源晶",1),LSTReg.sf("LENGSHANG_YSJGFK_8",1),LSTReg.sf("LENGSHANG_YSJGFK_8",1),LSTReg.sf("LENGSHANG_YSJGFK_8",1),LSTReg.sf("LENGSHANG_YSJGFK_8",1)}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_YSPTFK_1", LSTGroups.YSCL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.mat("JIGSAW",1),LSTReg.mat("JIGSAW",1),LSTReg.mat("JIGSAW",1),LSTReg.mat("JIGSAW",1),LSTReg.sf("LENGSHANG_幻彩源晶",1),LSTReg.mat("JIGSAW",1),LSTReg.mat("JIGSAW",1),LSTReg.mat("JIGSAW",1),LSTReg.mat("JIGSAW",1)}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_YSPTFK_2", LSTGroups.YSCL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("LENGSHANG_YSPTFK_1",1),LSTReg.sf("LENGSHANG_YSPTFK_1",1),LSTReg.sf("LENGSHANG_YSPTFK_1",1),LSTReg.sf("LENGSHANG_YSPTFK_1",1),LSTReg.sf("LENGSHANG_幻彩源晶",1),LSTReg.sf("LENGSHANG_YSPTFK_1",1),LSTReg.sf("LENGSHANG_YSPTFK_1",1),LSTReg.sf("LENGSHANG_YSPTFK_1",1),LSTReg.sf("LENGSHANG_YSPTFK_1",1)}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_YSPTFK_3", LSTGroups.YSCL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("LENGSHANG_YSPTFK_2",1),LSTReg.sf("LENGSHANG_YSPTFK_2",1),LSTReg.sf("LENGSHANG_YSPTFK_2",1),LSTReg.sf("LENGSHANG_YSPTFK_2",1),LSTReg.sf("LENGSHANG_幻彩源晶",1),LSTReg.sf("LENGSHANG_YSPTFK_2",1),LSTReg.sf("LENGSHANG_YSPTFK_2",1),LSTReg.sf("LENGSHANG_YSPTFK_2",1),LSTReg.sf("LENGSHANG_YSPTFK_2",1)}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_YSPTFK_4", LSTGroups.YSCL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("LENGSHANG_YSPTFK_3",1),LSTReg.sf("LENGSHANG_YSPTFK_3",1),LSTReg.sf("LENGSHANG_YSPTFK_3",1),LSTReg.sf("LENGSHANG_YSPTFK_3",1),LSTReg.sf("LENGSHANG_幻彩源晶",1),LSTReg.sf("LENGSHANG_YSPTFK_3",1),LSTReg.sf("LENGSHANG_YSPTFK_3",1),LSTReg.sf("LENGSHANG_YSPTFK_3",1),LSTReg.sf("LENGSHANG_YSPTFK_3",1)}, false);
    }

    private LSTItems47() {
    }
}
