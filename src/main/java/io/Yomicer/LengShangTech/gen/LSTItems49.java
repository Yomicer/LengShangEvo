package io.Yomicer.LengShangTech.gen;

import io.Yomicer.LengShangTech.core.*;
import io.Yomicer.LengShangTech.scripts.LSTScriptBridge;
import io.Yomicer.LengShangTech.scripts.LSTBlockDrops;
import io.Yomicer.LengShangTech.LengShangEvo;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import org.bukkit.inventory.ItemStack;

/** 冷殇物品定义 (自动转换, 第 50 批)。 */
public final class LSTItems49 {

    public static void create() {
        // LENGSHANG_树木之心
        LSTItemFactory.head("LENGSHANG_树木之心","856ee5573fd5ddd851ba42fd55b6966121a3d1163ff5b1ede8806247d28898","&a&l树木&b&l之&9&l心","&7传说中组成Minecraft树木的规则力量");
        // LENGSHANG_海洋之心
        LSTItemFactory.head("LENGSHANG_海洋之心","824fcd2314217cd5da149d063a4e7159bc70daea4a636ad923a54b2ae240eab0","&a&l海洋&b&l之&9&l心","&7传说中组成Minecraft海洋的规则力量");
        // LENGSHANG_怪物之心
        LSTItemFactory.head("LENGSHANG_怪物之心","9069c5db3024ddfc567fbdb7cdef2f1481da2caaceef16381e88ba4e86b0c0ef","&a&l怪物&b&l之&9&l心","&7传说中组成Minecraft掉落物的规则力量");
        // LENGSHANG_染色之心
        LSTItemFactory.head("LENGSHANG_染色之心","15b8dcbea27f42f5ae910445e05dac89d310aaf236a6c2123b8528120","&a&l染色&b&l之&9&l心","&7传说中组成Minecraft各种颜色的规则力量");
        // LENGSHANG_方块之心
        LSTItemFactory.head("LENGSHANG_方块之心","f119be668d45193a08c7bc9af286dc514382e75352e9b3c278522339e84a","&a&l方块&b&l之&9&l心","&7传说中组成Minecraft方块的规则力量");
        // LENGSHANG_勤奋之心
        LSTItemFactory.head("LENGSHANG_勤奋之心","bc2b19c87a482651db8cd07b39baf4ea2b4069eece1d919dded6848350461c11","&a&l勤奋&b&l之&9&l心","&7玩粘液怎么少得了肝呢？");
        // LENGSHANG_泥土源晶
        LSTItemFactory.head("LENGSHANG_泥土源晶","5aa983f94b34276ed8008bdc6e44d945cf24bdaeed5ccab5f66df3247e7c8b97","&6泥土源晶");
        // LENGSHANG_草方块源晶
        LSTItemFactory.head("LENGSHANG_草方块源晶","b1f0edec5121bd681a08bc2429e97b23b477fd5fab49ea30c5b0915aac28be21","&6草方块源晶");
        // LENGSHANG_沙子源晶
        LSTItemFactory.head("LENGSHANG_沙子源晶","53398ab3cb696b34430be944b14afbd227fd87e99026bcfc8b7387a861bde","&6沙子源晶");
        // LENGSHANG_花岗岩源晶
        LSTItemFactory.head("LENGSHANG_花岗岩源晶","63b88c789ab0bc3901f4de38dd72d32553bb08828b73b84fa8d73146e0e58b0c","&6花岗岩源晶");
        // LENGSHANG_闪长岩源晶
        LSTItemFactory.head("LENGSHANG_闪长岩源晶","b6eff6b1103d662638e1030d499cc10204096023303ad3aebe3644142aff50f0","&6闪长岩源晶");
        // LENGSHANG_安山岩源晶
        LSTItemFactory.head("LENGSHANG_安山岩源晶","adb7bf059a62d27b1e1e2f34394f3f38ed8cda45471f6f4d5b47c3912d181135","&6安山岩源晶");
        // LENGSHANG_黑曜石源晶
        LSTItemFactory.head("LENGSHANG_黑曜石源晶","4de719b72909efa097815a63380f4456af9e4afebdd894e5b58b7c9e05675577","&6黑曜石源晶");
        // LENGSHANG_灵魂沙源晶
        LSTItemFactory.head("LENGSHANG_灵魂沙源晶","f08d593766c55e42b4953a68bf6f34825531884081c150c166c8110279c9f2a5","&6灵魂沙源晶");
        // LENGSHANG_方解石源晶
        LSTItemFactory.head("LENGSHANG_方解石源晶","60c4713c2255917366624590626427e492571d05d8e2c5ee899bf61efaf2d6a0","&6方解石源晶");
        // LENGSHANG_修罗之心
        LSTItemFactory.head("LENGSHANG_修罗之心","6fde01e7abb58ab3a531c9ae1e6044d822764f97b7c545a8df6f32b603e4ce39","&c&l修&4&l罗&b&l之&9&l心","&7修罗的终极力量核心！");
        // LENGSHANG_海神之心
        LSTItemFactory.head("LENGSHANG_海神之心","1b30800d1bda61510ba62e2f346b3928ae9eddda4e63e935f60a465374eae63d","&1&l海&9&l神&b&l之&9&l心","&7海神的终极力量核心！");
        // LENGSHANG_一体机支架
        LSTItemFactory.material("LENGSHANG_一体机支架","CHAIN",false,"&4&l一体机支架","&7一体机的一部分");
        // LENGSHANG_一体机电缆
        LSTItemFactory.material("LENGSHANG_一体机电缆","STRING",false,"&4&l一体机电缆","&7一体机的一部分");
        // LENGSHANG_一体机集成电路
        LSTItemFactory.material("LENGSHANG_一体机集成电路","COBWEB",false,"&4&l一体机集成电路","&7一体机的一部分");
        // LENGSHANG_一体机板块
        LSTItemFactory.material("LENGSHANG_一体机板块","PAPER",false,"&4&l一体机板块","&7一体机的一部分");
        // LENGSHANG_一体机框架
        LSTItemFactory.material("LENGSHANG_一体机框架","SNOW_BLOCK",false,"&4&l一体机框架","&7一体机的一部分");
        // LENGSHANG_铱板
        LSTItemFactory.material("LENGSHANG_铱板","PAPER",false,"&7铱板","&7并不能直接使用的铱板","&7该物品还需在 工业一体机 内转换");
        // LENGSHANG_智能充电器
        LSTItemFactory.head("LENGSHANG_智能充电器","87e1dadd2831e74385b130e678af3209390c228a3ec091cf93ef0e8e03d661e5","&d智能充电器","&a","&7右键给物品栏中需要电力的物品充电","&7一键充满，电力存储极高！","&a","&e充电速度：&7无限 J/s");
        // LENGSHANG_SXZR
        LSTItemFactory.material("LENGSHANG_SXZR","BONE",true,"&d&l幻穹&7·&b&l瞬闪","&7右键向前闪现5格距离");
        // LENGSHANG_反概念物质碎片
        LSTItemFactory.material("LENGSHANG_反概念物质碎片","DISC_FRAGMENT_5",true,"&8反概念物质碎片"," ","&7反概念物质被神力粉碎成一粒粒碎片...","&7集齐碎片才能让反概念物质重新现世...");
        // LENGSHANG_反概念物质核心碎片
        LSTItemFactory.material("LENGSHANG_反概念物质核心碎片","ECHO_SHARD",true,"&8反概念物质核心碎片","&7唔...总算集齐了反概念物质的碎片...","&7即将让反概念物质重新现世...");
        // LENGSHANG_凝聚核心
        LSTItemFactory.material("LENGSHANG_凝聚核心","DIAMOND_BLOCK",true,"&d凝聚核心","&7四合一核心");
        // LENGSHANG_虎型轻盾
        LSTItemFactory.savedVersion("LENGSHANG_虎型轻盾","道具/HXQD","1.21","1.21.3.4","PAPER");
        // LENGSHANG_逗虎棍
        LSTItemFactory.savedVersion("LENGSHANG_逗虎棍","道具/DHG","1.21","1.21.3.4","PAPER");
        // LENGSHANG_虎福
        LSTItemFactory.savedVersionGlow("LENGSHANG_虎福","道具/HF","1.21","1.21.3.4","PAPER");
        // LENGSHANG_幸运头盔
        LSTItemFactory.saved("LENGSHANG_幸运头盔","幸运方块/幸运套装/XYTK","PAPER");
        // LENGSHANG_幸运胸甲
        LSTItemFactory.saved("LENGSHANG_幸运胸甲","幸运方块/幸运套装/XYXJ","PAPER");
        // LENGSHANG_幸运护腿
        LSTItemFactory.saved("LENGSHANG_幸运护腿","幸运方块/幸运套装/XYHT","PAPER");
        // LENGSHANG_幸运靴子
        LSTItemFactory.saved("LENGSHANG_幸运靴子","幸运方块/幸运套装/XYXZ","PAPER");
        // LENGSHANG_幸运剑
        LSTItemFactory.saved("LENGSHANG_幸运剑","幸运方块/幸运套装/XYJ","PAPER");
        // LENGSHANG_幸运镐
        LSTItemFactory.saved("LENGSHANG_幸运镐","幸运方块/幸运套装/XYG","PAPER");
        // LENGSHANG_幸运斧
        LSTItemFactory.saved("LENGSHANG_幸运斧","幸运方块/幸运套装/XYF","PAPER");
        // LENGSHANG_幸运铲
        LSTItemFactory.saved("LENGSHANG_幸运铲","幸运方块/幸运套装/XYC","PAPER");
        // LENGSHANG_秒人斧
        LSTItemFactory.saved("LENGSHANG_秒人斧","幸运方块/道具/MRF","PAPER");
        // LENGSHANG_击退棒
        LSTItemFactory.saved("LENGSHANG_击退棒","幸运方块/道具/JTB","PAPER");
        // LENGSHANG_万能附魔书
        LSTItemFactory.saved("LENGSHANG_万能附魔书","幸运方块/道具/WNFMS","PAPER");
        // LENGSHANG_黄金切尔西
        LSTItemFactory.saved("LENGSHANG_黄金切尔西","幸运方块/道具/HJQEX","PAPER");
        // LENGSHANG_矮人鞋
        LSTItemFactory.savedVersion("LENGSHANG_矮人鞋","幸运方块/道具/ARX","1.21","1.21.3.4","PAPER");
        // LENGSHANG_泰坦胸甲
        LSTItemFactory.savedVersion("LENGSHANG_泰坦胸甲","幸运方块/道具/TTXJ","1.21","1.21.3.4","PAPER");
        // LENGSHANG_诸葛连弩
        LSTItemFactory.saved("LENGSHANG_诸葛连弩","幸运方块/道具/ZGLN","PAPER");
        // LENGSHANG_重箭王
        LSTItemFactory.saved("LENGSHANG_重箭王","幸运方块/道具/CJW","PAPER");
        // LENGSHANG_幸运方块
        LSTItemFactory.headBase64("LENGSHANG_幸运方块","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjNiNzEwYjA4YjUyM2JiYTdlZmJhMDdjNjI5YmEwODk1YWQ2MTEyNmQyNmM4NmJlYjM4NDU2MDNhOTc0MjZjIn19fQ==","&x&F&F&0&0&0&0幸&x&F&F&A&5&0&0运&x&F&F&D&7&0&0方&x&A&D&F&F&2&F块","&7一切幸运方块的起始");
        // LENGSHANG_粘液幸运方块
        LSTItemFactory.headBase64("LENGSHANG_粘液幸运方块","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzY2ZDZjMTllNGY1MDUxODgyODUxYTRhZWFkNzlmMGYxZjM4YWE2ODk3MTliNmIzMzAzMTdlYTJiOGIwZTUwMCJ9fX0=","&x&6&6&9&9&F&F粘&x&9&9&6&6&F&F液&x&F&F&0&0&0&0幸&x&F&F&A&5&0&0运&x&F&F&D&7&0&0方&x&A&D&F&F&2&F块");
        // LENGSHANG_花朵幸运方块
        LSTItemFactory.headBase64("LENGSHANG_花朵幸运方块","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTk5N2QzNTVlMjNmNGRhN2JlNjkxMzllZWMxNTg2MDljNzBiZGFiNGJiOTNlM2ZhODI2NzlkNTNiMmRiZGZkIn19fQ==","&x&F&F&B&6&C&1花&x&F&5&A&3&B&9朵&x&F&F&0&0&0&0幸&x&F&F&A&5&0&0运&x&F&F&D&7&0&0方&x&A&D&F&F&2&F块");
        // LENGSHANG_矿物幸运方块
        LSTItemFactory.headBase64("LENGSHANG_矿物幸运方块","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNmNmYjRlYmMzYmE0ZmVjMDRkODk3OGExNjYwYmI3Yzk4ZTk2MzQyZmYyYTIzOGFkYTlkZjJmNzRiZjAzMmI0MCJ9fX0=","&x&6&6&9&9&F&F矿&x&9&9&6&6&F&F物&x&F&F&0&0&0&0幸&x&F&F&A&5&0&0运&x&F&F&D&7&0&0方&x&A&D&F&F&2&F块");
        // LENGSHANG_树木幸运方块
        LSTItemFactory.headBase64("LENGSHANG_树木幸运方块","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTFhNWJkNmZjZDE3OTY4NTZiZDhhNGM2OTk4ODc5NGY4ZWM0NjY0ZTU1MDk4ZDhjZGU5YzdhNzg0MjNjNzFmIn19fQ==","&x&8&7&C&E&E&B树&x&A&D&F&F&2&F木&x&F&F&0&0&0&0幸&x&F&F&A&5&0&0运&x&F&F&D&7&0&0方&x&A&D&F&F&2&F块");
        // LENGSHANG_初阶无尽幸运方块
        LSTItemFactory.head("LENGSHANG_初阶无尽幸运方块","43d5cfb8517bcc709f08a6311b2413ba2a109b3abc970270260fd08a828338c7","&x&0&F&F&F&F&F无&x&A&D&F&F&2&F尽&x&F&F&0&0&0&0幸&x&F&F&A&5&0&0运&x&F&F&D&7&0&0方&x&A&D&F&F&2&F块");
        // LENGSHANG_高阶无尽幸运方块
        LSTItemFactory.head("LENGSHANG_高阶无尽幸运方块","9d9cc58ad25a1ab16d36bb5d6d493c8f5898c2bf302b64e325921c41c35867","&x&F&F&C&C&0&0无&x&F&F&0&0&0&0尽&x&F&F&0&0&0&0幸&x&F&F&A&5&0&0运&x&F&F&D&7&0&0方&x&A&D&F&F&2&F块");
        // LENGSHANG_逻辑幸运方块
        LSTItemFactory.headBase64("LENGSHANG_逻辑幸运方块","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzEyNjExNjU2M2U5MDRjZGU3ZjUyYWUwZmI1ZTA3NjZlNjBhYmY0NzU3OTU3ZGU5ZGQzYjA2ZWRmMWY4YmQ4ZSJ9fX0=","&x&6&6&9&9&F&F逻&x&9&9&6&6&F&F辑&x&F&F&0&0&0&0幸&x&F&F&A&5&0&0运&x&F&F&D&7&0&0方&x&A&D&F&F&2&F块");
        // LENGSHANG_掉落物清除器
        LSTItemFactory.material("LENGSHANG_掉落物清除器","STICK",false,"&6掉落物清除器","&7右键清除半径100格所有掉落物");
        // LENGSHANG_投影方块清除器
        LSTItemFactory.material("LENGSHANG_投影方块清除器","STICK",false,"&b投影方块清除器","&7右键清除半径100格所有投影方块","&7常用于清除建筑魔杖残留的投影方块");
        // LENGSHANG_LDFZ
        LSTItemFactory.savedGlow("LENGSHANG_LDFZ","道具/LDFZ","PAPER");
        // LENGSHANG_全解圣书
        LSTItemFactory.saved("LENGSHANG_全解圣书","道具/QJSS","PAPER");
        // LENGSHANG_全息文字清除器
        LSTItemFactory.material("LENGSHANG_全息文字清除器","GLOW_INK_SAC",false,"&a&l全息文字清除器","&7右键查找最近3格内的全息文字","&7再次右键确认清除全息文字","&7也可用于清除魔法水晶液化池的问题");
        // LENGSHANG_僵尸清除器
        LSTItemFactory.material("LENGSHANG_僵尸清除器","BLAZE_ROD",false,"&6僵尸清除器","&7右键清除半径10格所有僵尸","&4注意：&a无法清除有自定义名称或药水效果的僵尸");
    }

    public static void register(LengShangEvo plugin) {
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_矿物之心", LSTGroups.YSCL, LSTRecipeTypes.get("LENGSHANG_XX_SJZXNJQ"), LSTScriptBridge.NO_RECIPE, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_树木之心", LSTGroups.YSCL, LSTRecipeTypes.get("LENGSHANG_XX_SJZXNJQ"), LSTScriptBridge.NO_RECIPE, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_海洋之心", LSTGroups.YSCL, LSTRecipeTypes.get("LENGSHANG_XX_SJZXNJQ"), LSTScriptBridge.NO_RECIPE, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_怪物之心", LSTGroups.YSCL, LSTRecipeTypes.get("LENGSHANG_XX_SJZXNJQ"), LSTScriptBridge.NO_RECIPE, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_染色之心", LSTGroups.YSCL, LSTRecipeTypes.get("LENGSHANG_XX_SJZXNJQ"), LSTScriptBridge.NO_RECIPE, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_方块之心", LSTGroups.YSCL, LSTRecipeTypes.get("LENGSHANG_XX_SJZXNJQ"), LSTScriptBridge.NO_RECIPE, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_勤奋之心", LSTGroups.YSCL, RecipeType.SMELTERY, new ItemStack[]{LSTReg.sf("LENGSHANG_泥土源晶",64),LSTReg.sf("LENGSHANG_沙子源晶",64),LSTReg.sf("LENGSHANG_草方块源晶",64),LSTReg.sf("LENGSHANG_花岗岩源晶",64),LSTReg.sf("LENGSHANG_闪长岩源晶",64),LSTReg.sf("LENGSHANG_安山岩源晶",64),LSTReg.sf("LENGSHANG_黑曜石源晶",64),LSTReg.sf("LENGSHANG_灵魂沙源晶",64),LSTReg.sf("LENGSHANG_方解石源晶",64)}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_泥土源晶", LSTGroups.CL, LSTRecipeTypes.get("LENGSHANG_XX_NTYJ"), LSTScriptBridge.NO_RECIPE, false);
        LSTBlockDrops.register("DIRT", "LENGSHANG_泥土源晶", 10);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_草方块源晶", LSTGroups.CL, LSTRecipeTypes.get("LENGSHANG_XX_CFKYJ"), LSTScriptBridge.NO_RECIPE, false);
        LSTBlockDrops.register("GRASS_BLOCK", "LENGSHANG_草方块源晶", 10);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_沙子源晶", LSTGroups.CL, LSTRecipeTypes.get("LENGSHANG_XX_SZYJ"), LSTScriptBridge.NO_RECIPE, false);
        LSTBlockDrops.register("SAND", "LENGSHANG_沙子源晶", 10);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_花岗岩源晶", LSTGroups.CL, LSTRecipeTypes.get("LENGSHANG_XX_HGYYJ"), LSTScriptBridge.NO_RECIPE, false);
        LSTBlockDrops.register("GRANITE", "LENGSHANG_花岗岩源晶", 10);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_闪长岩源晶", LSTGroups.CL, LSTRecipeTypes.get("LENGSHANG_XX_SCYYJ"), LSTScriptBridge.NO_RECIPE, false);
        LSTBlockDrops.register("DIORITE", "LENGSHANG_闪长岩源晶", 10);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_安山岩源晶", LSTGroups.CL, LSTRecipeTypes.get("LENGSHANG_XX_ASYYJ"), LSTScriptBridge.NO_RECIPE, false);
        LSTBlockDrops.register("ANDESITE", "LENGSHANG_安山岩源晶", 10);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_黑曜石源晶", LSTGroups.CL, LSTRecipeTypes.get("LENGSHANG_XX_HYSYJ"), LSTScriptBridge.NO_RECIPE, false);
        LSTBlockDrops.register("OBSIDIAN", "LENGSHANG_黑曜石源晶", 10);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_灵魂沙源晶", LSTGroups.CL, LSTRecipeTypes.get("LENGSHANG_XX_LHSYJ"), LSTScriptBridge.NO_RECIPE, false);
        LSTBlockDrops.register("SOUL_SAND", "LENGSHANG_灵魂沙源晶", 10);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_方解石源晶", LSTGroups.CL, LSTRecipeTypes.get("LENGSHANG_XX_FJSYJ"), LSTScriptBridge.NO_RECIPE, false);
        LSTBlockDrops.register("CALCITE", "LENGSHANG_方解石源晶", 10);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_修罗之心", LSTGroups.YSCL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("LENGSHANG_草原之心",1),LSTReg.sf("LENGSHANG_矿物之心",1),LSTReg.sf("LENGSHANG_树木之心",1),LSTReg.sf("LENGSHANG_海洋之心",1),LSTReg.sf("LENGSHANG_GZZX_10",1),LSTReg.sf("LENGSHANG_怪物之心",1),LSTReg.sf("LENGSHANG_染色之心",1),LSTReg.sf("LENGSHANG_方块之心",1),LSTReg.sf("LENGSHANG_勤奋之心",1)}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_海神之心", LSTGroups.YSCL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("LENGSHANG_草原之心",1),LSTReg.sf("LENGSHANG_矿物之心",1),LSTReg.sf("LENGSHANG_树木之心",1),LSTReg.sf("LENGSHANG_海洋之心",1),LSTReg.sf("LENGSHANG_GZZX_10",1),LSTReg.sf("LENGSHANG_怪物之心",1),LSTReg.sf("LENGSHANG_染色之心",1),LSTReg.sf("LENGSHANG_方块之心",1),LSTReg.sf("LENGSHANG_勤奋之心",1)}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_一体机支架", LSTGroups.CL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("STEEL_PLATE",1),LSTReg.sf("CHAIN",1),LSTReg.sf("STEEL_PLATE",1),LSTReg.sf("STEEL_PLATE",1),LSTReg.sf("HARDENED_GLASS",1),LSTReg.sf("STEEL_PLATE",1),LSTReg.sf("STEEL_PLATE",1),LSTReg.sf("CHAIN",1),LSTReg.sf("STEEL_PLATE",1)}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_一体机电缆", LSTGroups.CL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("RUBBER",1),LSTReg.sf("COPPER_WIRE",1),LSTReg.sf("RUBBER",1),LSTReg.sf("RUBBER",1),LSTReg.sf("COPPER_WIRE",1),LSTReg.sf("RUBBER",1),LSTReg.sf("RUBBER",1),LSTReg.sf("COPPER_WIRE",1),LSTReg.sf("RUBBER",1)}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_一体机集成电路", LSTGroups.CL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("LENGSHANG_一体机电缆",1),LSTReg.sf("REFINED_IRON",1),LSTReg.sf("LENGSHANG_一体机电缆",1),LSTReg.sf("POWER_UNIT",1),LSTReg.sf("ADVANCED_CIRCUIT",1),LSTReg.sf("POWER_UNIT",1),LSTReg.sf("LENGSHANG_一体机电缆",1),LSTReg.sf("REFINED_IRON",1),LSTReg.sf("LENGSHANG_一体机电缆",1)}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_一体机板块", LSTGroups.CL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("ADVANCED_ALLOY",1),LSTReg.sf("ADVANCED_ALLOY",1),LSTReg.sf("ADVANCED_ALLOY",1),LSTReg.sf("ADVANCED_ALLOY",1),LSTReg.sf("ADVANCED_ALLOY",1),LSTReg.sf("ADVANCED_ALLOY",1),LSTReg.sf("ADVANCED_ALLOY",1),LSTReg.sf("ADVANCED_ALLOY",1),LSTReg.sf("ADVANCED_ALLOY",1)}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_一体机框架", LSTGroups.CL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("LENGSHANG_一体机支架",1),LSTReg.sf("ADVANCED_ALLOY",1),LSTReg.sf("LENGSHANG_一体机支架",1),LSTReg.sf("ADVANCED_ALLOY",1),LSTReg.sf("LENGSHANG_一体机集成电路",1),LSTReg.sf("ADVANCED_ALLOY",1),LSTReg.sf("LENGSHANG_一体机支架",1),LSTReg.sf("ADVANCED_ALLOY",1),LSTReg.sf("LENGSHANG_一体机支架",1)}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_铱板", LSTGroups.CL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("IRIDIUM",1),LSTReg.sf("ADVANCED_ALLOY",1),LSTReg.sf("IRIDIUM",1),LSTReg.sf("ADVANCED_ALLOY",1),LSTReg.mat("DIAMOND",1),LSTReg.sf("ADVANCED_ALLOY",1),LSTReg.sf("IRIDIUM",1),LSTReg.sf("ADVANCED_ALLOY",1),LSTReg.sf("IRIDIUM",1)}, false);
        LSTScriptBridge.registerScriptItem(plugin, "LENGSHANG_智能充电器", "道具/智能充电器", LSTGroups.TSWP, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("INFINITE_INGOT",1),LSTReg.sf("INFINITE_MACHINE_CIRCUIT",1),LSTReg.sf("INFINITE_INGOT",1),LSTReg.sf("INFINITE_INGOT",1),LSTReg.sf("INFINITY_CAPACITOR",1),LSTReg.sf("INFINITE_INGOT",1),LSTReg.sf("VOID_INGOT",1),LSTReg.sf("INFINITY_CHARGER",1),LSTReg.sf("VOID_INGOT",1)});
        LSTScriptBridge.registerScriptItem(plugin, "LENGSHANG_SXZR", "道具/幻穹瞬闪", LSTGroups.TSWP, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("ENDER_LUMP_3",1),LSTReg.sf("ANCIENT_RUNE_ENDER",1),LSTReg.sf("ENDER_LUMP_3",1),LSTReg.sf("ANCIENT_RUNE_ENDER",1),LSTReg.sf("MAGIC_EYE_OF_ENDER",1),LSTReg.sf("ANCIENT_RUNE_ENDER",1),LSTReg.sf("ENDER_LUMP_3",1),LSTReg.sf("ANCIENT_RUNE_ENDER",1),LSTReg.sf("ENDER_LUMP_3",1)});
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_反概念物质碎片", LSTGroups.CL, LSTRecipeTypes.get("LENGSHANG_XX_FGNWZSP"), LSTScriptBridge.NO_RECIPE, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_反概念物质核心碎片", LSTGroups.CL, LSTRecipeTypes.get("LENGSHANG_XX_LSKJGZZ"), new ItemStack[]{null,null,null,null,LSTReg.sf("LENGSHANG_反概念物质碎片",50),null,null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_凝聚核心", LSTGroups.CL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("LOGITECH_METAL_CORE",1),LSTReg.sf("LOGITECH_SMELERY_CORE",1),null,LSTReg.sf("LOGITECH_MASS_CORE",1),LSTReg.sf("LOGITECH_TECH_CORE",1),null,null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_虎型轻盾", LSTGroups.TSWP, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("HAIMAN_NEW_YEAR_1",1),LSTReg.sf("FUHEBAN",1),LSTReg.sf("HAIMAN_NEW_YEAR_1",1),LSTReg.sf("LENGSHANG_逗虎棍",1),LSTReg.mat("SHIELD",1),LSTReg.sf("LENGSHANG_逗虎棍",1),LSTReg.sf("HAIMAN_NEW_YEAR_1",1),LSTReg.sf("FUHEBAN",1),LSTReg.sf("HAIMAN_NEW_YEAR_1",1)}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_逗虎棍", LSTGroups.TSWP, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.mat("FIRE_CHARGE",1),LSTReg.mat("BLAZE_ROD",1),LSTReg.mat("FIRE_CHARGE",1),LSTReg.mat("GOLDEN_HORSE_ARMOR",1),LSTReg.sf("HAIMAN_TIGER_1",1),LSTReg.mat("GOLDEN_HORSE_ARMOR",1),LSTReg.mat("FIRE_CHARGE",1),LSTReg.mat("BLAZE_ROD",1),LSTReg.mat("FIRE_CHARGE",1)}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_虎福", LSTGroups.TSWP, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("HAIMAN_TIGER_FURRY_1",1),LSTReg.sf("HAIMAN_NEW_YEAR_1",1),LSTReg.sf("HAIMAN_TIGER_FURRY_1",1),LSTReg.sf("HAIMAN_TIGER_FURRY_1",1),LSTReg.sf("HAIMAN_NEW_YEAR_1",1),LSTReg.sf("HAIMAN_TIGER_FURRY_1",1),null,LSTReg.mat("BLAZE_ROD",1),null}, false);
        LSTScriptBridge.registerScriptItem(plugin, "LENGSHANG_幸运方块", "幸运方块/幸运方块", LSTGroups.XYFK, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("GOLD_24K",1),LSTReg.sf("GOLD_24K",1),LSTReg.sf("GOLD_24K",1),LSTReg.sf("GOLD_24K",1),LSTReg.mat("DISPENSER",1),LSTReg.sf("GOLD_24K",1),LSTReg.sf("GOLD_24K",1),LSTReg.sf("GOLD_24K",1),LSTReg.sf("GOLD_24K",1)});
        LSTScriptBridge.registerScriptItem(plugin, "LENGSHANG_粘液幸运方块", "幸运方块/粘液幸运方块", LSTGroups.XYFK, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("IRON_DUST",1),LSTReg.sf("COPPER_DUST",1),LSTReg.sf("TIN_DUST",1),LSTReg.sf("SILVER_DUST",1),LSTReg.sf("LENGSHANG_幸运方块",1),LSTReg.sf("LEAD_DUST",1),LSTReg.sf("ALUMINUM_DUST",1),LSTReg.sf("MAGNESIUM_DUST",1),LSTReg.sf("ZINC_DUST",1)});
        LSTScriptBridge.registerScriptItem(plugin, "LENGSHANG_花朵幸运方块", "幸运方块/花朵幸运方块", LSTGroups.XYFK, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.mat("POPPY",1),LSTReg.mat("POPPY",1),LSTReg.mat("POPPY",1),LSTReg.mat("POPPY",1),LSTReg.sf("LENGSHANG_幸运方块",1),LSTReg.mat("POPPY",1),LSTReg.mat("POPPY",1),LSTReg.mat("POPPY",1),LSTReg.mat("POPPY",1)});
        LSTScriptBridge.registerScriptItem(plugin, "LENGSHANG_矿物幸运方块", "幸运方块/矿物幸运方块", LSTGroups.XYFK, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.mat("IRON_INGOT",1),LSTReg.mat("IRON_INGOT",1),LSTReg.mat("IRON_INGOT",1),LSTReg.mat("IRON_INGOT",1),LSTReg.sf("LENGSHANG_幸运方块",1),LSTReg.mat("IRON_INGOT",1),LSTReg.mat("IRON_INGOT",1),LSTReg.mat("IRON_INGOT",1),LSTReg.mat("IRON_INGOT",1)});
        LSTScriptBridge.registerScriptItem(plugin, "LENGSHANG_树木幸运方块", "幸运方块/树木幸运方块", LSTGroups.XYFK, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.mat("OAK_LOG",1),LSTReg.mat("OAK_LOG",1),LSTReg.mat("OAK_LOG",1),LSTReg.mat("OAK_LOG",1),LSTReg.sf("LENGSHANG_幸运方块",1),LSTReg.mat("OAK_LOG",1),LSTReg.mat("OAK_LOG",1),LSTReg.mat("OAK_LOG",1),LSTReg.mat("OAK_LOG",1)});
        LSTScriptBridge.registerScriptItem(plugin, "LENGSHANG_初阶无尽幸运方块", "幸运方块/初阶无尽幸运方块", LSTGroups.XYFK, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("TITANIUM",1),LSTReg.sf("TITANIUM",1),LSTReg.sf("TITANIUM",1),LSTReg.sf("MAGSTEEL_PLATE",1),LSTReg.sf("LENGSHANG_幸运方块",1),LSTReg.sf("MAGSTEEL_PLATE",1),LSTReg.sf("MACHINE_CIRCUIT",1),LSTReg.sf("MACHINE_CORE",1),LSTReg.sf("MACHINE_PLATE",1)});
        LSTScriptBridge.registerScriptItem(plugin, "LENGSHANG_高阶无尽幸运方块", "幸运方块/高阶无尽幸运方块", LSTGroups.XYFK, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("VOID_INGOT",1),LSTReg.sf("VOID_INGOT",1),LSTReg.sf("VOID_INGOT",1),LSTReg.sf("INFINITE_INGOT",1),LSTReg.sf("LENGSHANG_初阶无尽幸运方块",1),LSTReg.sf("INFINITE_INGOT",1),LSTReg.sf("INFINITE_INGOT",1),LSTReg.sf("INFINITE_INGOT",1),LSTReg.sf("INFINITE_INGOT",1)});
        LSTScriptBridge.registerScriptItem(plugin, "LENGSHANG_逻辑幸运方块", "幸运方块/逻辑幸运方块", LSTGroups.XYFK, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("LOGITECH_ABSTRACT_INGOT",1),LSTReg.sf("LOGITECH_ABSTRACT_INGOT",1),LSTReg.sf("LOGITECH_ABSTRACT_INGOT",1),LSTReg.sf("LOGITECH_ABSTRACT_INGOT",1),LSTReg.sf("LENGSHANG_幸运方块",1),LSTReg.sf("LOGITECH_ABSTRACT_INGOT",1),LSTReg.sf("LOGITECH_ABSTRACT_INGOT",1),LSTReg.sf("LOGITECH_ABSTRACT_INGOT",1),LSTReg.sf("LOGITECH_ABSTRACT_INGOT",1)});
        LSTScriptBridge.registerScriptItem(plugin, "LENGSHANG_掉落物清除器", "清除器/掉落物清除器", LSTGroups.TSWP, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.mat("STICK",1),LSTReg.mat("STICK",1),LSTReg.mat("STICK",1),LSTReg.mat("STICK",1),LSTReg.sf("REINFORCED_ALLOY_INGOT",1),LSTReg.mat("STICK",1),LSTReg.mat("STICK",1),LSTReg.mat("STICK",1),LSTReg.mat("STICK",1)});
        LSTScriptBridge.registerScriptItem(plugin, "LENGSHANG_投影方块清除器", "清除器/投影方块清除器", LSTGroups.TSWP, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.mat("STICK",1),LSTReg.mat("STICK",1),LSTReg.mat("STICK",1),LSTReg.mat("STICK",1),LSTReg.sf("HOLOGRAM_PROJECTOR",1),LSTReg.mat("STICK",1),LSTReg.mat("STICK",1),LSTReg.mat("STICK",1),LSTReg.mat("STICK",1)});
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_LDFZ", LSTGroups.TSWP, LSTRecipeTypes.get("LENGSHANG_XX_TSWPZZJ"), new ItemStack[]{null,LSTReg.sf("ANCIENT_RUNE_LIGHTNING",64),null,null,LSTReg.sf("STAFF_ELEMENTAL_STORM",64),null,null,null,null}, false);
        LSTScriptBridge.registerScriptItem(plugin, "LENGSHANG_全息文字清除器", "道具/全息文字清除器", LSTGroups.TSWP, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("LENGSHANG_LENGSHANG",1),LSTReg.sf("LENGSHANG_LENGSHANG",1),LSTReg.sf("LENGSHANG_LENGSHANG",1),LSTReg.sf("LENGSHANG_LENGSHANG",1),LSTReg.sf("HOLOGRAM_PROJECTOR",1),LSTReg.sf("LENGSHANG_LENGSHANG",1),LSTReg.sf("LENGSHANG_LENGSHANG",1),LSTReg.sf("LENGSHANG_LENGSHANG",1),LSTReg.sf("LENGSHANG_LENGSHANG",1)});
    }

    private LSTItems49() {
    }
}
