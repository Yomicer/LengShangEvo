package io.Yomicer.LengShangTech.gen;

import io.Yomicer.LengShangTech.core.*;
import io.Yomicer.LengShangTech.scripts.LSTScriptBridge;
import io.Yomicer.LengShangTech.scripts.LSTBlockDrops;
import io.Yomicer.LengShangTech.LengShangEvo;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import org.bukkit.inventory.ItemStack;

/** 冷殇物品定义 (自动转换, 第 51 批)。 */
public final class LSTItems50 {

    public static void create() {
        // LENGSHANG_骷髅清除器
        LSTItemFactory.material("LENGSHANG_骷髅清除器","BLAZE_ROD",false,"&6骷髅清除器","&7右键清除半径10格所有骷髅","&4注意：&a无法清除有自定义名称或药水效果的骷髅");
        // LENGSHANG_苦力怕清除器
        LSTItemFactory.material("LENGSHANG_苦力怕清除器","BLAZE_ROD",false,"&6苦力怕清除器","&7右键清除半径10格所有苦力怕","&4注意：&a无法清除有自定义名称或药水效果的苦力怕");
        // LENGSHANG_蜘蛛清除器
        LSTItemFactory.material("LENGSHANG_蜘蛛清除器","BLAZE_ROD",false,"&6蜘蛛清除器","&7右键清除半径10格所有蜘蛛","&4注意：&a无法清除有自定义名称或药水效果的蜘蛛");
        // LENGSHANG_末影人清除器
        LSTItemFactory.material("LENGSHANG_末影人清除器","BLAZE_ROD",false,"&6末影人清除器","&7右键清除半径10格所有末影人","&4注意：&a无法清除有自定义名称或药水效果的末影人");
        // LENGSHANG_史莱姆清除器
        LSTItemFactory.material("LENGSHANG_史莱姆清除器","BLAZE_ROD",false,"&6史莱姆清除器","&7右键清除半径10格所有史莱姆","&4注意：&a无法清除有自定义名称或药水效果的史莱姆");
        // LENGSHANG_僵尸猪灵清除器
        LSTItemFactory.material("LENGSHANG_僵尸猪灵清除器","BLAZE_ROD",false,"&6僵尸猪灵清除器","&7右键清除半径10格所有僵尸猪灵","&4注意：&a无法清除有自定义名称或药水效果的僵尸猪灵");
        // LENGSHANG_幻翼清除器
        LSTItemFactory.material("LENGSHANG_幻翼清除器","BLAZE_ROD",false,"&6幻翼清除器","&7右键清除半径30格所有幻翼","&4注意：&a无法清除有自定义名称或药水效果的幻翼");
        // LENGSHANG_怪物清除器
        LSTItemFactory.material("LENGSHANG_怪物清除器","BLAZE_ROD",false,"&e怪物&6清除器","&7右键清除半径10格所有怪物","&6九九归一,包含了8种怪物的综合清除器！","&4注意：&a无法清除有自定义名称或药水效果的怪物");
        // LENGSHANG_卸甲令
        LSTItemFactory.material("LENGSHANG_卸甲令","EMERALD",false,"&x&8&8&4&4&C&C卸&x&A&A&6&6&E&E甲&x&C&C&8&8&F&F令","&7将所有护甲移到背包中","&7不用再怕绑定诅咒啦");
        // LENGSHANG_诅咒消除令
        LSTItemFactory.material("LENGSHANG_诅咒消除令","EMERALD",false,"&d&l诅咒消除令","&7检测并清除诅咒绑定和消失诅咒附魔");
        // LENGSHANG_黑曜石之钻
        LSTItemFactory.material("LENGSHANG_黑曜石之钻","DIAMOND",true,"&8&l黑曜石之钻","&7用于浇筑坚硬的黑曜石装备");
        // LENGSHANG_网络抽屉升级模板
        LSTItemFactory.material("LENGSHANG_网络抽屉升级模板","NETHERITE_UPGRADE_SMITHING_TEMPLATE",true,"&c&l网络抽屉升级模板","&7","&7用于自动化升级网络抽屉","&7不要问为什么用无限存储","&7逻辑工艺可以从4k直升无限");
        // LENGSHANG_月球尘埃
        LSTItemFactory.material("LENGSHANG_月球尘埃","LIGHT_GRAY_CONCRETE_POWDER",false,"&7月球尘埃");
        // LENGSHANG_月岩
        LSTItemFactory.material("LENGSHANG_月岩","ANDESITE",false,"&7月岩");
        // LENGSHANG_月球玻璃
        LSTItemFactory.material("LENGSHANG_月球玻璃","GLASS",false,"&9月球玻璃","&7月壤与砂同熔","&7凝成幽蓝星玻璃");
        // LENGSHANG_硫酸块
        LSTItemFactory.material("LENGSHANG_硫酸块","YELLOW_TERRACOTTA",false,"&6硫酸块");
        // LENGSHANG_金曜石
        LSTItemFactory.material("LENGSHANG_金曜石","MAGMA_BLOCK",false,"&e金曜石");
        // LENGSHANG_火星岩
        LSTItemFactory.material("LENGSHANG_火星岩","TERRACOTTA",false,"&c火星岩");
        // LENGSHANG_火星尘埃
        LSTItemFactory.material("LENGSHANG_火星尘埃","RED_SAND",false,"&c火星尘埃");
        // LENGSHANG_火星残骸
        LSTItemFactory.material("LENGSHANG_火星残骸","ANCIENT_DEBRIS",false,"&4火星残骸","&7这里残骸里蕴含钨");
        // LENGSHANG_激光矿石
        LSTItemFactory.material("LENGSHANG_激光矿石","REDSTONE_ORE",false,"&c激光矿石");
        // LENGSHANG_激光石粉
        LSTItemFactory.material("LENGSHANG_激光石粉","REDSTONE",false,"&c激光石粉","&7取名真难");
        // LENGSHANG_激光石
        LSTItemFactory.material("LENGSHANG_激光石","RED_DYE",false,"&c激光石");
        // LENGSHANG_钨锭
        LSTItemFactory.material("LENGSHANG_钨锭","NETHERITE_INGOT",false,"&4钨锭","&7这是一种非常坚硬的金属","&7只能从火星残骸中提炼出来");
        // LENGSHANG_碳化钨
        LSTItemFactory.material("LENGSHANG_碳化钨","NETHERITE_INGOT",false,"&c碳化钨","&7经过与碳融合提炼","&7完美融合而成");
        // LENGSHANG_月球芝士
        LSTItemFactory.headBase64("LENGSHANG_月球芝士","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzVlMTQwODY4ZjMzOGFhZTQzZjAxMDg2YWRjMTdiYzMxZGExZTk4MWI4M2I3YTBlMDYzYjRkYTNkNTA3YzFkMyJ9fX0=","&6月球芝士","&7真恶心");
        // LENGSHANG_玄钨晶
        LSTItemFactory.material("LENGSHANG_玄钨晶","DIAMOND",false,"&b玄钨晶");
        // LENGSHANG_金曜锭
        LSTItemFactory.material("LENGSHANG_金曜锭","GOLD_INGOT",false,"&e金曜锭","&7将金曜石置于高温炉熔炼三小时提炼成金曜锭");
        // LENGSHANG_起泡金曜锭
        LSTItemFactory.material("LENGSHANG_起泡金曜锭","GOLD_INGOT",false,"&6起泡金曜锭","&7熔炼时误引入星尘气泡的奇异金锭");
        // LENGSHANG_终焉方块
        LSTItemFactory.material("LENGSHANG_终焉方块","PRISMARINE_BRICKS",false,"&3终焉方块","&7一枚被末地本身遗忘的坐标残片");
        // LENGSHANG_箔澜复合锭
        LSTItemFactory.material("LENGSHANG_箔澜复合锭","IRON_INGOT",false,"&b箔澜复合锭","&7箔澜星最常用的复合锭");
        // LENGSHANG_箔澜复合板
        LSTItemFactory.material("LENGSHANG_箔澜复合板","PAPER",false,"&b箔澜复合板","&7箔澜星最常用的复合板");
        // LENGSHANG_箔澜负荷板
        LSTItemFactory.material("LENGSHANG_箔澜负荷板","PAPER",false,"&b箔澜负荷板","&7箔澜星再次压缩的复合板","&7重量已经严重负荷了！");
        // LENGSHANG_箔澜钨荷板
        LSTItemFactory.material("LENGSHANG_箔澜钨荷板","PAPER",false,"&b箔澜钨荷板","&7万吨压成","&7千度不弯！");
        // LENGSHANG_箔澜超荷板
        LSTItemFactory.material("LENGSHANG_箔澜超荷板","PAPER",false,"&b箔澜超荷板","&7一块被魔法强行压缩的基板");
        // LENGSHANG_钻石电路板
        LSTItemFactory.material("LENGSHANG_钻石电路板","POWERED_RAIL",false,"&b钻石电路板");
        // LENGSHANG_红石电路板
        LSTItemFactory.material("LENGSHANG_红石电路板","POWERED_RAIL",false,"&c红石电路板");
        // LENGSHANG_青金石电路板
        LSTItemFactory.material("LENGSHANG_青金石电路板","POWERED_RAIL",false,"&9青金石电路板");
        // LENGSHANG_荧石电路板
        LSTItemFactory.material("LENGSHANG_荧石电路板","POWERED_RAIL",false,"&e荧石电路板");
        // LENGSHANG_箔澜处理单元
        LSTItemFactory.headBase64("LENGSHANG_箔澜处理单元","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZGM5MzY1NjQyYzZlZGRjZmVkZjViNWUxNGUyYmM3MTI1N2Q5ZTRhMzM2M2QxMjNjNmYzM2M1NWNhZmJmNmQifX19","&4箔澜处理单元");
        // LENGSHANG_加强管道
        LSTItemFactory.material("LENGSHANG_加强管道","BAMBOO",false,"&f加强管道");
        // LENGSHANG_管口
        LSTItemFactory.material("LENGSHANG_管口","IRON_TRAPDOOR",false,"&f管口");
        // LENGSHANG_嗅探信标
        LSTItemFactory.material("LENGSHANG_嗅探信标","REDSTONE_TORCH",false,"&f嗅探信标");
        // LENGSHANG_聚变燃料
        LSTItemFactory.material("LENGSHANG_聚变燃料","COAL",false,"&4聚变燃料");
        // LENGSHANG_发射台
        LSTItemFactory.material("LENGSHANG_发射台","STONE",false,"&6发射台","&7火箭发射！");
        // LENGSHANG_金箔
        LSTItemFactory.material("LENGSHANG_金箔","PAPER",false,"&4金箔");
        // LENGSHANG_滤器
        LSTItemFactory.material("LENGSHANG_滤器","PAPER",false,"&f滤器");
        // LENGSHANG_氧气再生器
        LSTItemFactory.headBase64("LENGSHANG_氧气再生器","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOGJlN2JjNjYzODlkOTZhOWM1ZjRhYTVhODc1NzllZTY2MWU4OGFkYTZmN2I4YmUxNzRiZjM5ODJhMzRmODQifX19","&b氧气再生器");
        // LENGSHANG_氧气维持模块
        LSTItemFactory.headBase64("LENGSHANG_氧气维持模块","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNWFhN2M3YmNjZjkwM2NlYzVmM2QwMzIzYWQwNTA1NGFhMjA3ZDU0MTJmNTA5N2QwYWIyMTRjZjU5YjQyYmMxYyJ9fX0=","&4氧气维持模块");
        // LENGSHANG_一阶油箱
        LSTItemFactory.headBase64("LENGSHANG_一阶油箱","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWIyZTU4OTYyMzMxNjc2ZjY3YTY3YzAyNzNlZDI5YmE0NDY1OTg2YjQ0ZTE1OThlMGI4YTI5YzA0ZjgyZDIxYSJ9fX0=","&6一阶油箱");
        // LENGSHANG_二阶油箱
        LSTItemFactory.headBase64("LENGSHANG_二阶油箱","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWIyZTU4OTYyMzMxNjc2ZjY3YTY3YzAyNzNlZDI5YmE0NDY1OTg2YjQ0ZTE1OThlMGI4YTI5YzA0ZjgyZDIxYSJ9fX0=","&6二阶油箱");
        // LENGSHANG_星际天文台
        LSTItemFactory.material("LENGSHANG_星际天文台","GLASS",false,"&f星际天文台","&7观测光年外的星球！");
        // LENGSHANG_星球分析仪
        LSTItemFactory.material("LENGSHANG_星球分析仪","SEA_LANTERN",false,"&f星球分析仪","&7分析星球的高级信息");
        // LENGSHANG_箔澜星门
        LSTItemFactory.material("LENGSHANG_箔澜星门","QUARTZ_BLOCK",false,"&9箔澜星门","&7用于建造前往箔澜星的传送门");
        // LENGSHANG_箔澜星门控制器
        LSTItemFactory.material("LENGSHANG_箔澜星门控制器","CHISELED_QUARTZ_BLOCK",false,"&9箔澜星门控制器","&7用于控制箔澜星的传送门");
        // LENGSHANG_火花塞
        LSTItemFactory.material("LENGSHANG_火花塞","FLINT_AND_STEEL",false,"&f火花塞");
        // LENGSHANG_一阶火箭发动机
        LSTItemFactory.material("LENGSHANG_一阶火箭发动机","FLINT_AND_STEEL",false,"&f一阶火箭发动机","&7制造火箭前往太空！");
        // LENGSHANG_二阶火箭发动机
        LSTItemFactory.material("LENGSHANG_二阶火箭发动机","FLINT_AND_STEEL",false,"&f二阶火箭发动机","&7开始升级改造火箭！");
        // LENGSHANG_离子发动机
        LSTItemFactory.material("LENGSHANG_离子发动机","FLINT_AND_STEEL",false,"&b离子发动机","&7离子火箭的核心装置！");
        // LENGSHANG_一阶火箭
        LSTItemFactory.headBase64("LENGSHANG_一阶火箭","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjdhNjI3MjQyYjAxNDkyODJkMmIzODAyYjI0NGI2MjYyMmJlYjE1MmJjNDdmMWRkMDcwNzljZWQzYWQ4YjkwIn19fQ==","&4一阶火箭","&7迈出星球的第一步","&7即是人类的一大步");
        // LENGSHANG_二阶火箭
        LSTItemFactory.headBase64("LENGSHANG_二阶火箭","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjdhNjI3MjQyYjAxNDkyODJkMmIzODAyYjI0NGI2MjYyMmJlYjE1MmJjNDdmMWRkMDcwNzljZWQzYWQ4YjkwIn19fQ==","&4二阶火箭","&7改进升级","&7探索宇宙!");
    }

    public static void register(LengShangEvo plugin) {
        LSTScriptBridge.registerScriptItem(plugin, "LENGSHANG_僵尸清除器", "清除器/僵尸清除器", LSTGroups.TSWP, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.mat("ROTTEN_FLESH",1),LSTReg.mat("ROTTEN_FLESH",1),LSTReg.mat("ROTTEN_FLESH",1),LSTReg.mat("ROTTEN_FLESH",1),LSTReg.sf("REINFORCED_ALLOY_INGOT",1),LSTReg.mat("ROTTEN_FLESH",1),LSTReg.mat("ROTTEN_FLESH",1),LSTReg.mat("ROTTEN_FLESH",1),LSTReg.mat("ROTTEN_FLESH",1)});
        LSTScriptBridge.registerScriptItem(plugin, "LENGSHANG_骷髅清除器", "清除器/骷髅清除器", LSTGroups.TSWP, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.mat("BONE",1),LSTReg.mat("BONE",1),LSTReg.mat("BONE",1),LSTReg.mat("BONE",1),LSTReg.sf("REINFORCED_ALLOY_INGOT",1),LSTReg.mat("BONE",1),LSTReg.mat("BONE",1),LSTReg.mat("BONE",1),LSTReg.mat("BONE",1)});
        LSTScriptBridge.registerScriptItem(plugin, "LENGSHANG_苦力怕清除器", "清除器/苦力怕清除器", LSTGroups.TSWP, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.mat("GUNPOWDER",1),LSTReg.mat("GUNPOWDER",1),LSTReg.mat("GUNPOWDER",1),LSTReg.mat("GUNPOWDER",1),LSTReg.sf("REINFORCED_ALLOY_INGOT",1),LSTReg.mat("GUNPOWDER",1),LSTReg.mat("GUNPOWDER",1),LSTReg.mat("GUNPOWDER",1),LSTReg.mat("GUNPOWDER",1)});
        LSTScriptBridge.registerScriptItem(plugin, "LENGSHANG_蜘蛛清除器", "清除器/蜘蛛清除器", LSTGroups.TSWP, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.mat("STRING",1),LSTReg.mat("STRING",1),LSTReg.mat("STRING",1),LSTReg.mat("STRING",1),LSTReg.sf("REINFORCED_ALLOY_INGOT",1),LSTReg.mat("STRING",1),LSTReg.mat("STRING",1),LSTReg.mat("STRING",1),LSTReg.mat("STRING",1)});
        LSTScriptBridge.registerScriptItem(plugin, "LENGSHANG_末影人清除器", "清除器/末影人清除器", LSTGroups.TSWP, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.mat("ENDER_PEARL",1),LSTReg.mat("ENDER_PEARL",1),LSTReg.mat("ENDER_PEARL",1),LSTReg.mat("ENDER_PEARL",1),LSTReg.sf("REINFORCED_ALLOY_INGOT",1),LSTReg.mat("ENDER_PEARL",1),LSTReg.mat("ENDER_PEARL",1),LSTReg.mat("ENDER_PEARL",1),LSTReg.mat("ENDER_PEARL",1)});
        LSTScriptBridge.registerScriptItem(plugin, "LENGSHANG_史莱姆清除器", "清除器/史莱姆清除器", LSTGroups.TSWP, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.mat("SLIME_BALL",1),LSTReg.mat("SLIME_BALL",1),LSTReg.mat("SLIME_BALL",1),LSTReg.mat("SLIME_BALL",1),LSTReg.sf("REINFORCED_ALLOY_INGOT",1),LSTReg.mat("SLIME_BALL",1),LSTReg.mat("SLIME_BALL",1),LSTReg.mat("SLIME_BALL",1),LSTReg.mat("SLIME_BALL",1)});
        LSTScriptBridge.registerScriptItem(plugin, "LENGSHANG_僵尸猪灵清除器", "清除器/僵尸猪灵清除器", LSTGroups.TSWP, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.mat("GOLD_INGOT",1),LSTReg.mat("GOLD_INGOT",1),LSTReg.mat("GOLD_INGOT",1),LSTReg.mat("GOLD_INGOT",1),LSTReg.sf("REINFORCED_ALLOY_INGOT",1),LSTReg.mat("GOLD_INGOT",1),LSTReg.mat("GOLD_INGOT",1),LSTReg.mat("GOLD_INGOT",1),LSTReg.mat("GOLD_INGOT",1)});
        LSTScriptBridge.registerScriptItem(plugin, "LENGSHANG_幻翼清除器", "清除器/幻翼清除器", LSTGroups.TSWP, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.mat("PHANTOM_MEMBRANE",1),LSTReg.mat("PHANTOM_MEMBRANE",1),LSTReg.mat("PHANTOM_MEMBRANE",1),LSTReg.mat("PHANTOM_MEMBRANE",1),LSTReg.sf("REINFORCED_ALLOY_INGOT",1),LSTReg.mat("PHANTOM_MEMBRANE",1),LSTReg.mat("PHANTOM_MEMBRANE",1),LSTReg.mat("PHANTOM_MEMBRANE",1),LSTReg.mat("PHANTOM_MEMBRANE",1)});
        LSTScriptBridge.registerScriptItem(plugin, "LENGSHANG_怪物清除器", "清除器/怪物清除器", LSTGroups.TSWP, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("LENGSHANG_僵尸清除器",1),LSTReg.sf("LENGSHANG_骷髅清除器",1),LSTReg.sf("LENGSHANG_苦力怕清除器",1),LSTReg.sf("LENGSHANG_蜘蛛清除器",1),LSTReg.sf("LENGSHANG_掉落物清除器",1),LSTReg.sf("LENGSHANG_末影人清除器",1),LSTReg.sf("LENGSHANG_史莱姆清除器",1),LSTReg.sf("LENGSHANG_僵尸猪灵清除器",1),LSTReg.sf("LENGSHANG_幻翼清除器",1)});
        LSTScriptBridge.registerScriptItem(plugin, "LENGSHANG_卸甲令", "道具/卸甲令", LSTGroups.TSWP, RecipeType.MAGIC_WORKBENCH, new ItemStack[]{LSTReg.sf("LENGSHANG_LENGSHANG",1),LSTReg.mat("DIAMOND_CHESTPLATE",1),LSTReg.sf("LENGSHANG_LENGSHANG",1),null,null,null,null,null,null});
        LSTScriptBridge.registerScriptItem(plugin, "LENGSHANG_诅咒消除令", "道具/诅咒消除令", LSTGroups.TSWP, RecipeType.MAGIC_WORKBENCH, new ItemStack[]{LSTReg.sf("LENGSHANG_LENGSHANG",1),LSTReg.mat("BOOK",1),LSTReg.sf("LENGSHANG_LENGSHANG",1),null,null,null,null,null,null});
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_黑曜石之钻", LSTGroups.CL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.mat("OBSIDIAN",1),LSTReg.mat("OBSIDIAN",1),LSTReg.mat("OBSIDIAN",1),LSTReg.mat("OBSIDIAN",1),LSTReg.mat("DIAMOND",1),LSTReg.mat("OBSIDIAN",1),LSTReg.mat("OBSIDIAN",1),LSTReg.mat("OBSIDIAN",1),LSTReg.mat("OBSIDIAN",1)}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_网络抽屉升级模板", LSTGroups.CL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("NTW_QUANTUM_STORAGE_8",1),LSTReg.sf("NTW_OPTIC_GLASS",1),LSTReg.sf("NTW_QUANTUM_STORAGE_8",1),LSTReg.sf("NTW_OPTIC_GLASS",1),LSTReg.sf("NTW_AI_CORE",1),LSTReg.sf("NTW_OPTIC_GLASS",1),LSTReg.sf("NTW_QUANTUM_STORAGE_8",1),LSTReg.sf("NTW_OPTIC_GLASS",1),LSTReg.sf("NTW_QUANTUM_STORAGE_8",1)}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_月球尘埃", LSTGroups.XJ, LSTRecipeTypes.get("LENGSHANG_XX_XXCCJQR"), LSTScriptBridge.NO_RECIPE, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_月岩", LSTGroups.XJ, LSTRecipeTypes.get("LENGSHANG_XX_XXCCJQR"), LSTScriptBridge.NO_RECIPE, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_月球玻璃", LSTGroups.XJ, RecipeType.SMELTERY, new ItemStack[]{LSTReg.mat("SAND",1),LSTReg.sf("LENGSHANG_月球尘埃",1),null,null,null,null,null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_硫酸块", LSTGroups.XJ, LSTRecipeTypes.get("LENGSHANG_XX_XXCCJQR"), LSTScriptBridge.NO_RECIPE, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_金曜石", LSTGroups.XJ, LSTRecipeTypes.get("LENGSHANG_XX_XXCCJQR"), LSTScriptBridge.NO_RECIPE, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_火星岩", LSTGroups.XJ, LSTRecipeTypes.get("LENGSHANG_XX_XXCCJQR"), LSTScriptBridge.NO_RECIPE, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_火星尘埃", LSTGroups.XJ, LSTRecipeTypes.get("LENGSHANG_XX_XXCCJQR"), LSTScriptBridge.NO_RECIPE, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_火星残骸", LSTGroups.XJ, LSTRecipeTypes.get("LENGSHANG_XX_XXCCJQR"), LSTScriptBridge.NO_RECIPE, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_激光矿石", LSTGroups.XJ, LSTRecipeTypes.get("LENGSHANG_XX_XXCCJQR"), LSTScriptBridge.NO_RECIPE, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_激光石粉", LSTGroups.XJ, RecipeType.ORE_CRUSHER, new ItemStack[]{LSTReg.sf("LENGSHANG_激光矿石",1),null,null,null,null,null,null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_激光石", LSTGroups.XJ, LSTRecipeTypes.get("LENGSHANG_XX_XWZ"), new ItemStack[]{null,null,null,null,LSTReg.sf("LENGSHANG_激光石粉",12),null,null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_钨锭", LSTGroups.XJ, RecipeType.SMELTERY, new ItemStack[]{LSTReg.sf("LENGSHANG_火星残骸",1),null,null,null,null,null,null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_碳化钨", LSTGroups.XJ, RecipeType.SMELTERY, new ItemStack[]{LSTReg.sf("LENGSHANG_钨锭",1),LSTReg.sf("CARBON_CHUNK",1),null,null,null,null,null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_月球芝士", LSTGroups.XJ, RecipeType.SMELTERY, new ItemStack[]{LSTReg.sf("LENGSHANG_月球尘埃",1),LSTReg.sf("LENGSHANG_月岩",1),LSTReg.sf("LENGSHANG_月球玻璃",1),null,null,null,null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_玄钨晶", LSTGroups.XJ, LSTRecipeTypes.get("LENGSHANG_XX_XJZPT"), LSTScriptBridge.NO_RECIPE, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_金曜锭", LSTGroups.XJ, RecipeType.SMELTERY, new ItemStack[]{LSTReg.sf("LENGSHANG_金曜石",1),null,null,null,null,null,null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_起泡金曜锭", LSTGroups.XJ, LSTRecipeTypes.get("LENGSHANG_XX_XWZ"), new ItemStack[]{LSTReg.sf("LENGSHANG_金曜锭",1),LSTReg.sf("BLISTERING_INGOT_3",1),null,null,null,null,null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_终焉方块", LSTGroups.XJ, LSTRecipeTypes.get("LENGSHANG_XX_XWZ"), new ItemStack[]{LSTReg.mat("ENDER_PEARL",16),LSTReg.sf("LENGSHANG_起泡金曜锭",1),null,null,null,null,null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_箔澜复合锭", LSTGroups.XJ, RecipeType.SMELTERY, new ItemStack[]{LSTReg.sf("REINFORCED_ALLOY_INGOT",1),LSTReg.sf("MAGNESIUM_DUST",1),LSTReg.sf("ALUMINUM_DUST",1),LSTReg.sf("COPPER_DUST",1),LSTReg.sf("LEAD_DUST",1),LSTReg.sf("GOLD_DUST",1),null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_箔澜复合板", LSTGroups.XJ, RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_箔澜复合锭",8),null,null,null,null,null,null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_箔澜负荷板", LSTGroups.XJ, RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_箔澜复合板",8),null,null,null,null,null,null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_箔澜钨荷板", LSTGroups.XJ, RecipeType.SMELTERY, new ItemStack[]{LSTReg.sf("LENGSHANG_箔澜负荷板",1),LSTReg.sf("LENGSHANG_碳化钨",1),null,null,null,null,null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_箔澜超荷板", LSTGroups.XJ, RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_箔澜钨荷板",4),null,null,null,null,null,null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_钻石电路板", LSTGroups.XJ, LSTRecipeTypes.get("LENGSHANG_XX_BLYLJ"), new ItemStack[]{null,null,null,LSTReg.mat("DIAMOND_BLOCK",1),null,LSTReg.sf("SILICON",1),null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_红石电路板", LSTGroups.XJ, LSTRecipeTypes.get("LENGSHANG_XX_BLYLJ"), new ItemStack[]{null,null,null,LSTReg.mat("REDSTONE_BLOCK",1),null,LSTReg.sf("SILICON",1),null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_青金石电路板", LSTGroups.XJ, LSTRecipeTypes.get("LENGSHANG_XX_BLYLJ"), new ItemStack[]{null,null,null,LSTReg.mat("LAPIS_BLOCK",1),null,LSTReg.sf("SILICON",1),null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_荧石电路板", LSTGroups.XJ, LSTRecipeTypes.get("LENGSHANG_XX_BLYLJ"), new ItemStack[]{null,null,null,LSTReg.mat("GLOWSTONE",1),null,LSTReg.sf("SILICON",1),null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_箔澜处理单元", LSTGroups.XJ, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("LENGSHANG_红石电路板",1),LSTReg.sf("LENGSHANG_荧石电路板",1),LSTReg.sf("LENGSHANG_红石电路板",1),LSTReg.sf("LENGSHANG_钻石电路板",1),LSTReg.sf("ADVANCED_CIRCUIT_BOARD",1),LSTReg.sf("LENGSHANG_钻石电路板",1),LSTReg.sf("LENGSHANG_青金石电路板",1),LSTReg.sf("LENGSHANG_荧石电路板",1),LSTReg.sf("LENGSHANG_青金石电路板",1)}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_加强管道", LSTGroups.XJ, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("LENGSHANG_箔澜复合板",1),null,LSTReg.sf("LENGSHANG_箔澜复合板",1),LSTReg.sf("LENGSHANG_箔澜复合板",1),null,LSTReg.sf("LENGSHANG_箔澜复合板",1),LSTReg.sf("LENGSHANG_箔澜复合板",1),null,LSTReg.sf("LENGSHANG_箔澜复合板",1)}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_管口", LSTGroups.XJ, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("DAMASCUS_STEEL_INGOT",1),null,LSTReg.sf("DAMASCUS_STEEL_INGOT",1),LSTReg.sf("DAMASCUS_STEEL_INGOT",1),null,LSTReg.sf("DAMASCUS_STEEL_INGOT",1),null,LSTReg.mat("IRON_TRAPDOOR",1),null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_嗅探信标", LSTGroups.XJ, LSTRecipeTypes.get("LENGSHANG_XX_XJZPT"), LSTScriptBridge.NO_RECIPE, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_聚变燃料", LSTGroups.XJ, LSTRecipeTypes.get("LENGSHANG_XX_XWZ"), new ItemStack[]{null,null,null,LSTReg.sf("LENGSHANG_起泡金曜锭",1),null,LSTReg.sf("LENGSHANG_月球尘埃",8),null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_发射台", LSTGroups.XJ, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("REINFORCED_PLATE",1),LSTReg.sf("LENGSHANG_管口",1),LSTReg.sf("REINFORCED_PLATE",1),LSTReg.sf("CARGO_MOTOR",1),LSTReg.sf("OIL_PUMP",1),LSTReg.sf("CARGO_MOTOR",1),LSTReg.sf("REINFORCED_PLATE",1),LSTReg.sf("LENGSHANG_箔澜处理单元",1),LSTReg.sf("REINFORCED_PLATE",1)}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_金箔", LSTGroups.XJ, RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("GOLD_24K_BLOCK",1),null,null,null,null,null,null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_滤器", LSTGroups.XJ, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("CLOTH",1),LSTReg.mat("COAL",1),LSTReg.sf("CLOTH",1),LSTReg.sf("CLOTH",1),LSTReg.mat("COAL",1),LSTReg.sf("CLOTH",1),LSTReg.sf("CLOTH",1),LSTReg.mat("COAL",1),LSTReg.sf("CLOTH",1)}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_氧气再生器", LSTGroups.XJ, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("ELECTRO_MAGNET",1),LSTReg.sf("LENGSHANG_加强管道",1),LSTReg.sf("LENGSHANG_滤器",1),LSTReg.sf("LENGSHANG_管口",1),LSTReg.sf("LENGSHANG_金箔",1),LSTReg.sf("LENGSHANG_滤器",1),LSTReg.sf("ELECTRO_MAGNET",1),LSTReg.sf("LENGSHANG_加强管道",1),LSTReg.sf("LENGSHANG_滤器",1)}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_氧气维持模块", LSTGroups.XJ, LSTRecipeTypes.get("LENGSHANG_XX_XJZPT"), LSTScriptBridge.NO_RECIPE, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_一阶油箱", LSTGroups.XJ, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("LENGSHANG_箔澜负荷板",1),LSTReg.sf("LENGSHANG_箔澜负荷板",1),LSTReg.sf("LENGSHANG_箔澜负荷板",1),LSTReg.sf("LENGSHANG_箔澜负荷板",1),null,LSTReg.sf("LENGSHANG_箔澜负荷板",1),LSTReg.sf("LENGSHANG_箔澜负荷板",1),LSTReg.sf("LENGSHANG_箔澜负荷板",1),LSTReg.sf("LENGSHANG_箔澜负荷板",1)}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_二阶油箱", LSTGroups.XJ, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("LENGSHANG_箔澜钨荷板",1),LSTReg.sf("LENGSHANG_箔澜钨荷板",1),LSTReg.sf("LENGSHANG_箔澜钨荷板",1),LSTReg.sf("LENGSHANG_箔澜钨荷板",1),null,LSTReg.sf("LENGSHANG_箔澜钨荷板",1),LSTReg.sf("LENGSHANG_箔澜钨荷板",1),LSTReg.sf("LENGSHANG_箔澜钨荷板",1),LSTReg.sf("LENGSHANG_箔澜钨荷板",1)}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_星际天文台", LSTGroups.XJ, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.mat("IRON_BLOCK",1),LSTReg.sf("LENGSHANG_月球玻璃",1),LSTReg.mat("IRON_BLOCK",1),LSTReg.sf("LENGSHANG_月球玻璃",1),LSTReg.sf("LENGSHANG_哈勃望远镜",1),LSTReg.sf("LENGSHANG_月球玻璃",1),LSTReg.mat("IRON_BLOCK",1),LSTReg.sf("LENGSHANG_月球玻璃",1),LSTReg.mat("IRON_BLOCK",1)}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_星球分析仪", LSTGroups.XJ, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("LENGSHANG_钨锭",1),LSTReg.sf("GPS_TRANSMITTER_4",1),LSTReg.sf("LENGSHANG_钨锭",1),LSTReg.sf("LENGSHANG_箔澜钨荷板",1),LSTReg.sf("ENERGIZED_CAPACITOR",1),LSTReg.sf("LENGSHANG_箔澜钨荷板",1),LSTReg.sf("LENGSHANG_钨锭",1),LSTReg.sf("LENGSHANG_金曜锭",1),LSTReg.sf("LENGSHANG_钨锭",1)}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_箔澜星门", LSTGroups.XJ, LSTRecipeTypes.get("LENGSHANG_XX_XJZPT"), LSTScriptBridge.NO_RECIPE, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_箔澜星门控制器", LSTGroups.XJ, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("LENGSHANG_箔澜星门",1),LSTReg.sf("LENGSHANG_荧石电路板",1),LSTReg.sf("LENGSHANG_箔澜星门",1),LSTReg.sf("LENGSHANG_红石电路板",1),LSTReg.sf("LENGSHANG_钻石电路板",1),LSTReg.sf("LENGSHANG_红石电路板",1),LSTReg.sf("LENGSHANG_箔澜星门",1),LSTReg.sf("LENGSHANG_青金石电路板",1),LSTReg.sf("LENGSHANG_箔澜星门",1)}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_火花塞", LSTGroups.XJ, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{null,LSTReg.sf("STEEL_PLATE",1),LSTReg.sf("NICKEL_INGOT",1),LSTReg.sf("LENGSHANG_钨锭",1),null,LSTReg.sf("LENGSHANG_寂骸",1),null,LSTReg.sf("STEEL_PLATE",1),LSTReg.sf("NICKEL_INGOT",1)}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_一阶火箭发动机", LSTGroups.XJ, LSTRecipeTypes.get("LENGSHANG_XX_XJZPT"), LSTScriptBridge.NO_RECIPE, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_二阶火箭发动机", LSTGroups.XJ, LSTRecipeTypes.get("LENGSHANG_XX_XJZPT"), LSTScriptBridge.NO_RECIPE, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_离子发动机", LSTGroups.XJ, LSTRecipeTypes.get("LENGSHANG_XX_XJZPT"), LSTScriptBridge.NO_RECIPE, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_一阶火箭", LSTGroups.XJ, LSTRecipeTypes.get("LENGSHANG_XX_XJZPT"), LSTScriptBridge.NO_RECIPE, false);
    }

    private LSTItems50() {
    }
}
