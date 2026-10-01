package io.Yomicer.LengShangTech.gen;

import io.Yomicer.LengShangTech.core.*;
import io.Yomicer.LengShangTech.scripts.LSTScriptBridge;
import io.Yomicer.LengShangTech.scripts.LSTBlockDrops;
import io.Yomicer.LengShangTech.LengShangEvo;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import org.bukkit.inventory.ItemStack;

/** 冷殇物品定义 (自动转换, 第 53 批)。 */
public final class LSTItems52 {

    public static void create() {
        // LENGSHANG_寂灭星骸
        LSTItemFactory.material("LENGSHANG_寂灭星骸","ANCIENT_DEBRIS",true,"&x&7&5&F&1&F&C寂&x&A&A&F&2&B&7灭&x&D&E&F&3&7&2星&x&D&E&F&3&7&2骸","&7星生于爆，星死于寂","&7寂非终结——寂是另一种永恒");
        // LENGSHANG_永恒无尽模板
        LSTItemFactory.material("LENGSHANG_永恒无尽模板","NETHERITE_UPGRADE_SMITHING_TEMPLATE",true,"&x&0&F&F&F&F&F永&x&0&F&F&C&C&F恒&x&0&F&F&9&9&F无&x&0&F&F&6&6&F尽&x&0&F&F&3&3&F模&x&0&F&F&0&0&F板","&7所有锻造模板在此归一","&7你曾在远古城市、丛林神庙、末地城等地收集的每一种纹样与升级技艺","&7最终凝聚为这一块不朽结晶。");
        // LENGSHANG_唱片集成回响
        LSTItemFactory.material("LENGSHANG_唱片集成回响","MUSIC_DISC_5",true,"&x&B&F&4&D&F&7唱&x&B&7&5&7&F&5片&x&A&F&6&1&F&3集&x&A&7&6&B&F&0成&x&9&F&7&5&E&E回&x&9&7&7&F&E&C响","&7所有唱片的精华融为一体，每一首旋律在此共鸣");
        // LENGSHANG_寰宇陶典
        LSTItemFactory.material("LENGSHANG_寰宇陶典","HEART_POTTERY_SHERD",true,"&x&5&0&3&8&F&E寰&x&7&D&2&7&D&C宇&x&A&9&1&7&B&A陶&x&D&6&0&6&9&8典","&7你从沙漠神殿、古迹废墟、海底遗迹中耐心刷出的每一枚残片，如今拼合为一","&7它不再是一件破碎的文物，而是不破的永恒。");
        // LENGSHANG_色素之核
        LSTItemFactory.material("LENGSHANG_色素之核","YELLOW_DYE",true,"&x&E&7&6&2&5&D色&x&A&9&6&0&8&4素&x&6&C&5&F&A&B之&x&2&E&5&D&D&2核","&7由全部16种染料压缩而成的色素核心");
        // LENGSHANG_色纺之源
        LSTItemFactory.material("LENGSHANG_色纺之源","WHITE_WOOL",true,"&x&0&C&C&6&2&0色&x&4&3&9&0&6&7纺&x&7&A&5&A&A&F之&x&B&1&2&4&F&6源","&7全部16种染色羊毛的终极凝聚，柔软与色彩在此归一");
        // LENGSHANG_釉彩之核
        LSTItemFactory.material("LENGSHANG_釉彩之核","LIGHT_BLUE_GLAZED_TERRACOTTA",true,"&x&D&9&5&C&7&A釉&x&9&F&5&5&9&6彩&x&6&6&4&F&B&3之&x&2&C&4&8&C&F核","&7它承载了所有陶瓦烧制时的温度与色彩");
        // LENGSHANG_固色之芯
        LSTItemFactory.material("LENGSHANG_固色之芯","LIGHT_BLUE_CONCRETE",true,"&x&4&3&B&B&B&5固&x&7&B&7&D&9&C色&x&B&4&4&0&8&2之&x&E&C&0&2&6&9芯","&716色混凝土在此合为一体，灰白不再单调");
        // LENGSHANG_透色之核
        LSTItemFactory.material("LENGSHANG_透色之核","PINK_STAINED_GLASS",true,"&x&5&5&2&A&E&1透&x&5&5&5&8&E&7色&x&5&5&8&5&E&E之&x&5&5&B&3&F&4核","&7你将沙子烧炼后染上每一种颜色","&7再将它们融合为一块晶莹的整体","&7它不再碎裂，却能折射出世间所有色彩的光辉。");
        // LENGSHANG_无尽催化剂
        LSTItemFactory.material("LENGSHANG_无尽催化剂","NETHER_STAR",true,"&x&0&F&F&F&F&F无&x&0&F&F&C&C&F尽&x&0&F&F&9&9&F催&x&0&F&F&6&6&F化&x&0&F&F&3&3&F剂","&7一即全，全即一");
        // LENGSHANG_说明1
        LSTItemFactory.material("LENGSHANG_说明1","BOOK",false,"&e奇点","&7在 &x&0&F&F&F&F&F永&x&0&F&F&C&C&F恒&x&0&F&F&9&9&F奇&x&0&F&F&6&6&F点&x&0&F&F&3&3&F构&x&0&F&F&0&0&F造&x&0&C&C&0&0&F机 &7中输入45x64个相应物品后生成");
        // LENGSHANG_说明2
        LSTItemFactory.material("LENGSHANG_说明2","BOOK",false,"&8中子粒","&7在 &a基础中子收集器 &7中缓慢收集");
        // LENGSHANG_黑曜石奇点
        LSTItemFactory.material("LENGSHANG_黑曜石奇点","OBSIDIAN",true,"&8黑曜石奇点");
        // LENGSHANG_蓝冰奇点
        LSTItemFactory.material("LENGSHANG_蓝冰奇点","BLUE_ICE",true,"&9蓝冰奇点");
        // LENGSHANG_紫水晶奇点
        LSTItemFactory.material("LENGSHANG_紫水晶奇点","AMETHYST_BLOCK",true,"&5紫水晶奇点");
        // LENGSHANG_荧石奇点
        LSTItemFactory.material("LENGSHANG_荧石奇点","GLOWSTONE",true,"&e荧石奇点");
        // LENGSHANG_原版铜奇点
        LSTItemFactory.material("LENGSHANG_原版铜奇点","COPPER_BLOCK",true,"&6原版铜奇点");
        // LENGSHANG_中子粒
        LSTItemFactory.material("LENGSHANG_中子粒","IRON_NUGGET",true,"&8中子粒");
        // LENGSHANG_中子尘埃
        LSTItemFactory.material("LENGSHANG_中子尘埃","GUNPOWDER",true,"&8中子尘埃");
        // LENGSHANG_中子锭
        LSTItemFactory.material("LENGSHANG_中子锭","NETHERITE_INGOT",true,"&8中子锭");
        // LENGSHANG_中子块
        LSTItemFactory.material("LENGSHANG_中子块","NETHERITE_BLOCK",true,"&8中子块");
        // LENGSHANG_中子齿轮
        LSTItemFactory.material("LENGSHANG_中子齿轮","ENDER_PEARL",true,"&8中子齿轮");
        // LENGSHANG_耀金
        LSTItemFactory.material("LENGSHANG_耀金","GOLD_INGOT",true,"&e耀金");
        // LENGSHANG_紫金
        LSTItemFactory.material("LENGSHANG_紫金","IRON_INGOT",true,"&5紫金");
        // LENGSHANG_魂晶
        LSTItemFactory.material("LENGSHANG_魂晶","NETHERITE_INGOT",true,"&8魂晶");
        // LENGSHANG_星铜
        LSTItemFactory.material("LENGSHANG_星铜","COPPER_INGOT",true,"&6星铜");
        // LENGSHANG_钻石晶格
        LSTItemFactory.material("LENGSHANG_钻石晶格","DIAMOND",false,"&b钻石晶格","&7致密材料...");
        // LENGSHANG_水晶矩阵锭
        LSTItemFactory.material("LENGSHANG_水晶矩阵锭","IRON_INGOT",true,"&b水晶矩阵锭","&7这甚至不是最终形态...");
        // LENGSHANG_寰宇支配之剑
        LSTItemFactory.saved("LENGSHANG_寰宇支配之剑","永恒无尽/武器/HYZPZJ","PAPER");
        // LENGSHANG_自然荒芜之斧
        LSTItemFactory.saved("LENGSHANG_自然荒芜之斧","永恒无尽/工具/ZRHWZF","PAPER");
        // LENGSHANG_星球吞噬之铲
        LSTItemFactory.saved("LENGSHANG_星球吞噬之铲","永恒无尽/工具/XQTSZC","PAPER");
        // LENGSHANG_世界崩解之镐
        LSTItemFactory.saved("LENGSHANG_世界崩解之镐","永恒无尽/工具/SJBJZG","PAPER");
        // LENGSHANG_地蕴复生之锄
        LSTItemFactory.saved("LENGSHANG_地蕴复生之锄","永恒无尽/工具/DYFSZC","PAPER");
        // LENGSHANG_天堂陨落长弓
        LSTItemFactory.saved("LENGSHANG_天堂陨落长弓","永恒无尽/武器/TTYLCG","PAPER");
        // LENGSHANG_地核磐石之盾
        LSTItemFactory.saved("LENGSHANG_地核磐石之盾","永恒无尽/武器/DHPSZD","PAPER");
        // LENGSHANG_海渊裂空之戟
        LSTItemFactory.saved("LENGSHANG_海渊裂空之戟","永恒无尽/武器/HYLKZJ","PAPER");
        // LENGSHANG_九霄惊雷之锤
        LSTItemFactory.saved("LENGSHANG_九霄惊雷之锤","永恒无尽/武器/JXJLZC","PAPER");
        // LENGSHANG_远海鲸吞之桶
        LSTItemFactory.material("LENGSHANG_远海鲸吞之桶","BUCKET",true,"&x&0&F&F&F&F&F远&x&0&F&F&D&D&9海&x&0&F&F&A&B&2鲸&x&0&F&F&8&8&C吞&x&0&F&F&5&6&5之&x&0&F&F&3&3&F桶","&7吞噬一切流体...");
        // LENGSHANG_幸运四叶草
        LSTItemFactory.material("LENGSHANG_幸运四叶草","SHORT_GRASS",true,"&a幸运四叶草","&7随机获取一个原版物品");
        // LENGSHANG_呼风符
        LSTItemFactory.material("LENGSHANG_呼风符","PAPER",false,"&x&0&0&e&0&f&f呼&x&0&3&f&0&8&0风&x&0&6&f&f&0&1符","&x&0&0&e&0&f&f右&x&0&1&e&3&e&3键&x&0&1&e&7&c&7将&x&0&2&e&a&a&a天&x&0&3&e&e&8&e气&x&0&3&f&1&7&2转&x&0&4&f&5&5&6换&x&0&5&f&8&3&9为&x&0&5&f&c&1&d晴&x&0&6&f&f&0&1天");
        // LENGSHANG_唤雨符
        LSTItemFactory.material("LENGSHANG_唤雨符","PAPER",false,"&x&0&0&f&0&f&f唤&x&1&3&7&9&f&f雨&x&2&5&0&1&f&f符","&x&0&0&f&0&f&f右&x&0&4&d&5&f&f键&x&0&8&b&b&f&f将&x&0&c&a&0&f&f天&x&1&0&8&6&f&f气&x&1&5&6&b&f&f转&x&1&9&5&1&f&f换&x&1&d&3&6&f&f为&x&2&1&1&c&f&f雨&x&2&5&0&1&f&f天");
        // LENGSHANG_唤雷符
        LSTItemFactory.material("LENGSHANG_唤雷符","PAPER",false,"&x&0&0&e&0&f&f唤&x&8&0&d&b&8&0雷&x&f&f&d&6&0&1符","&x&0&0&e&0&f&f右&x&1&a&d&f&e&6键&x&3&3&d&e&c&c将&x&4&d&d&d&b&3天&x&6&6&d&c&9&9气&x&8&0&d&b&8&0转&x&9&9&d&a&6&7换&x&b&3&d&9&4&d为&x&c&c&d&8&3&4雷&x&e&6&d&7&1&a雨&x&f&f&d&6&0&1天");
        // LENGSHANG_巨人刷怪蛋
        LSTItemFactory.material("LENGSHANG_巨人刷怪蛋","ZOMBIE_SPAWN_EGG",false,"&f巨人刷怪蛋");
        // LENGSHANG_经验存储器
        LSTItemFactory.material("LENGSHANG_经验存储器","EXPERIENCE_BOTTLE",false,"&x&2&8&E&0&B&6经&x&2&D&C&B&B&D验&x&3&2&B&6&C&5存&x&3&7&A&1&C&C储&x&3&C&8&C&D&3器","&9右键提升一级等级","&9蹲下右键存储一级经验");
        // LENGSHANG_命运之轮
        LSTItemFactory.head("LENGSHANG_命运之轮","32fe2f24b695966b774d79ad6f8822909b9fb4baeb80542322d81bbbab0ecb1f","&x&B&B&5&1&F&2命&x&C&1&3&A&B&B运&x&C&7&2&2&8&4之&x&C&D&0&B&4&D轮","&6命运转动，神迹降临");
        // LENGSHANG_海神·黄金三叉戟
        LSTItemFactory.savedVersion("LENGSHANG_海神·黄金三叉戟","套装系列/海神/HSSCJ","1.21","1.21.3.4","PAPER");
        // LENGSHANG_镧纱
        LSTItemFactory.head("LENGSHANG_镧纱","a14d3c57f80824b3839b8b220f2158bca505d497fd1c9e3f29f422b1e6206a45","&a&l镧纱","&7富含稀有元素！");
        // LENGSHANG_光腺
        LSTItemFactory.head("LENGSHANG_光腺","5d225635fe66cced5e1f1030a11bfbe1e28a8745f920e7b7076eb669c902283","&e&l光腺","&7如星星般闪耀");
        // LENGSHANG_游商
        LSTItemFactory.head("LENGSHANG_游商","5ccf9ea1a6e1b86ad60a804ff800b0dfd76d73e5c91f47f84bb7169306546012","&b&l游商","&7行商人的前世");
        // LENGSHANG_寂骸
        LSTItemFactory.head("LENGSHANG_寂骸","99f334426eca60de8d0982f1c43f182d0240b39736780e72596f6fc70ec3cdee","&8&l寂骸","&7被遗忘在月球的流浪者");
        // LENGSHANG_MTXJ
        LSTItemFactory.head("LENGSHANG_MTXJ","f274a8a5ca66afeb2c7f162253a6c461d56b8511427a55857882a1f77aac8","&x&F&F&B&6&C&1莓糖星酱","&x&F&F&9&B&B&3是一颗从棉花糖星系掉下来的小脑袋","&x&F&F&9&B&B&3软萌的粉色外壳里装着一整罐草莓气泡和闪闪星屑","&x&F&F&9&B&B&3谁敲一下都会“啵”地冒出甜甜圈味的彩虹");
        // LENGSHANG_BLX_BLS
        LSTItemFactory.head("LENGSHANG_BLX_BLS","8988fe7f49072bd9be53d16e589ce72e0dca8c308b3e9dc6f43262a816e60473","&b&l箔澜沙","&7在深渊中留存有一丝痕迹");
        // LENGSHANG_BLX_YTB
        LSTItemFactory.material("LENGSHANG_BLX_YTB","STONE_SWORD",false,"&b&l陨土碑","&7它撕开了一条裂缝...");
    }

    public static void register(LengShangEvo plugin) {
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_世界之心", LSTGroups.G11, LSTRecipeTypes.get("LENGSHANG_XX_YHWJGZT"), LSTScriptBridge.NO_RECIPE, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_寂灭星骸", LSTGroups.G11, LSTRecipeTypes.get("LENGSHANG_XX_YHWJGZT"), LSTScriptBridge.NO_RECIPE, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_永恒无尽模板", LSTGroups.G11, LSTRecipeTypes.get("LENGSHANG_XX_YHWJGZT"), LSTScriptBridge.NO_RECIPE, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_唱片集成回响", LSTGroups.G11, LSTRecipeTypes.get("LENGSHANG_XX_YHWJGZT"), LSTScriptBridge.NO_RECIPE, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_寰宇陶典", LSTGroups.G11, LSTRecipeTypes.get("LENGSHANG_XX_YHWJGZT"), LSTScriptBridge.NO_RECIPE, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_色素之核", LSTGroups.G11, LSTRecipeTypes.get("LENGSHANG_XX_YHWJGZT"), LSTScriptBridge.NO_RECIPE, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_色纺之源", LSTGroups.G11, LSTRecipeTypes.get("LENGSHANG_XX_YHWJGZT"), LSTScriptBridge.NO_RECIPE, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_釉彩之核", LSTGroups.G11, LSTRecipeTypes.get("LENGSHANG_XX_YHWJGZT"), LSTScriptBridge.NO_RECIPE, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_固色之芯", LSTGroups.G11, LSTRecipeTypes.get("LENGSHANG_XX_YHWJGZT"), LSTScriptBridge.NO_RECIPE, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_透色之核", LSTGroups.G11, LSTRecipeTypes.get("LENGSHANG_XX_YHWJGZT"), LSTScriptBridge.NO_RECIPE, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_无尽催化剂", LSTGroups.G11, LSTRecipeTypes.get("LENGSHANG_XX_YHWJGZT"), LSTScriptBridge.NO_RECIPE, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_说明1", LSTGroups.G11, RecipeType.NULL, LSTScriptBridge.NO_RECIPE, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_说明2", LSTGroups.G11, RecipeType.NULL, LSTScriptBridge.NO_RECIPE, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_黑曜石奇点", LSTGroups.G11, RecipeType.NULL, new ItemStack[]{null,null,null,null,LSTReg.sf("LENGSHANG_说明1",1),null,null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_蓝冰奇点", LSTGroups.G11, RecipeType.NULL, new ItemStack[]{null,null,null,null,LSTReg.sf("LENGSHANG_说明1",1),null,null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_紫水晶奇点", LSTGroups.G11, RecipeType.NULL, new ItemStack[]{null,null,null,null,LSTReg.sf("LENGSHANG_说明1",1),null,null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_荧石奇点", LSTGroups.G11, RecipeType.NULL, new ItemStack[]{null,null,null,null,LSTReg.sf("LENGSHANG_说明1",1),null,null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_原版铜奇点", LSTGroups.G11, RecipeType.NULL, new ItemStack[]{null,null,null,null,LSTReg.sf("LENGSHANG_说明1",1),null,null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_中子粒", LSTGroups.G11, RecipeType.NULL, new ItemStack[]{null,null,null,null,LSTReg.sf("LENGSHANG_说明2",1),null,null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_中子尘埃", LSTGroups.G11, LSTRecipeTypes.get("LENGSHANG_XX_YHYLL"), new ItemStack[]{LSTReg.saved("永恒无尽/材料/ZZL",9),null,null,null,null,null,null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_中子锭", LSTGroups.G11, LSTRecipeTypes.get("LENGSHANG_XX_YHYLL"), new ItemStack[]{LSTReg.saved("永恒无尽/材料/ZZCA",9),null,null,null,null,null,null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_中子块", LSTGroups.G11, LSTRecipeTypes.get("LENGSHANG_XX_YHYLL"), new ItemStack[]{LSTReg.saved("永恒无尽/材料/ZZD",9),null,null,null,null,null,null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_中子齿轮", LSTGroups.G11, LSTRecipeTypes.get("LENGSHANG_XX_YHYLL"), new ItemStack[]{LSTReg.saved("永恒无尽/材料/ZZD",4),LSTReg.sf("LENGSHANG_水晶矩阵锭",1),null,null,null,null,null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_耀金", LSTGroups.G11, LSTRecipeTypes.get("LENGSHANG_XX_YHYLL"), new ItemStack[]{LSTReg.sf("GOLD_24K",1),LSTReg.saved("永恒无尽/奇点/YSQD",1),LSTReg.sf("GILDED_IRON",1),null,null,null,null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_紫金", LSTGroups.G11, LSTRecipeTypes.get("LENGSHANG_XX_YHYLL"), new ItemStack[]{LSTReg.sf("SUPREME_SYNTHETIC_AMETHYST",1),LSTReg.saved("永恒无尽/奇点/ZSJQD",1),LSTReg.sf("SUPREME_DUST_AMETHYST",1),null,null,null,null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_魂晶", LSTGroups.G11, LSTRecipeTypes.get("LENGSHANG_XX_YHYLL"), new ItemStack[]{LSTReg.sf("NEPTUNIUM",1),LSTReg.saved("永恒无尽/奇点/HYSQD",1),LSTReg.sf("ANCIENT_RUNE_SOULBOUND",1),null,null,null,null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_星铜", LSTGroups.G11, LSTRecipeTypes.get("LENGSHANG_XX_YHYLL"), new ItemStack[]{LSTReg.sf("BRONZE_INGOT",1),LSTReg.saved("永恒无尽/奇点/YBTQD",1),LSTReg.sf("COPPER_WIRE",1),null,null,null,null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_钻石晶格", LSTGroups.CL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.mat("DIAMOND",1),LSTReg.mat("DIAMOND",1),LSTReg.mat("DIAMOND",1),LSTReg.mat("DIAMOND",1),LSTReg.mat("NETHERITE_SCRAP",1),LSTReg.mat("DIAMOND",1),LSTReg.mat("DIAMOND",1),LSTReg.mat("DIAMOND",1),LSTReg.mat("DIAMOND",1)}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_水晶矩阵锭", LSTGroups.CL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("LENGSHANG_钻石晶格",1),LSTReg.mat("NETHER_STAR",1),LSTReg.sf("LENGSHANG_钻石晶格",1),LSTReg.sf("LENGSHANG_钻石晶格",1),LSTReg.mat("NETHER_STAR",1),LSTReg.sf("LENGSHANG_钻石晶格",1),LSTReg.sf("LENGSHANG_钻石晶格",1),LSTReg.mat("NETHER_STAR",1),LSTReg.sf("LENGSHANG_钻石晶格",1)}, false);
        LSTScriptBridge.registerScriptItem(plugin, "LENGSHANG_寰宇支配之剑", "永恒无尽/寰宇支配之剑", LSTGroups.G11, LSTRecipeTypes.get("LENGSHANG_XX_YHWJGZT"), LSTScriptBridge.NO_RECIPE);
        LSTScriptBridge.registerScriptItem(plugin, "LENGSHANG_自然荒芜之斧", "永恒无尽/自然荒芜之斧", LSTGroups.G11, LSTRecipeTypes.get("LENGSHANG_XX_YHWJGZT"), LSTScriptBridge.NO_RECIPE);
        LSTScriptBridge.registerScriptItem(plugin, "LENGSHANG_星球吞噬之铲", "永恒无尽/星球吞噬之铲", LSTGroups.G11, LSTRecipeTypes.get("LENGSHANG_XX_YHWJGZT"), LSTScriptBridge.NO_RECIPE);
        LSTScriptBridge.registerScriptItem(plugin, "LENGSHANG_世界崩解之镐", "永恒无尽/世界崩解之镐", LSTGroups.G11, LSTRecipeTypes.get("LENGSHANG_XX_YHWJGZT"), LSTScriptBridge.NO_RECIPE);
        LSTScriptBridge.registerScriptItem(plugin, "LENGSHANG_地蕴复生之锄", "永恒无尽/地蕴复生之锄", LSTGroups.G11, LSTRecipeTypes.get("LENGSHANG_XX_YHWJGZT"), LSTScriptBridge.NO_RECIPE);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_天堂陨落长弓", LSTGroups.G11, LSTRecipeTypes.get("LENGSHANG_XX_YHWJGZT"), LSTScriptBridge.NO_RECIPE, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_地核磐石之盾", LSTGroups.G11, LSTRecipeTypes.get("LENGSHANG_XX_YHWJGZT"), LSTScriptBridge.NO_RECIPE, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_海渊裂空之戟", LSTGroups.G11, LSTRecipeTypes.get("LENGSHANG_XX_YHWJGZT"), LSTScriptBridge.NO_RECIPE, false);
        LSTScriptBridge.registerScriptItem(plugin, "LENGSHANG_九霄惊雷之锤", "永恒无尽/九霄惊雷之锤", LSTGroups.G11, LSTRecipeTypes.get("LENGSHANG_XX_YHWJGZT"), LSTScriptBridge.NO_RECIPE);
        LSTScriptBridge.registerScriptItem(plugin, "LENGSHANG_远海鲸吞之桶", "永恒无尽/远海鲸吞之桶", LSTGroups.G11, LSTRecipeTypes.get("LENGSHANG_XX_YHWJGZT"), LSTScriptBridge.NO_RECIPE);
        LSTScriptBridge.registerScriptItem(plugin, "LENGSHANG_幸运四叶草", "道具/幸运四叶草", LSTGroups.G8, RecipeType.NULL, LSTScriptBridge.NO_RECIPE);
        LSTBlockDrops.register("SHORT_GRASS", "LENGSHANG_幸运四叶草", 10);
        LSTScriptBridge.registerScriptItem(plugin, "LENGSHANG_呼风符", "道具/呼风符", LSTGroups.TSWP, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("ANCIENT_RUNE_EARTH",1),LSTReg.sf("ANCIENT_RUNE_EARTH",1),LSTReg.sf("ANCIENT_RUNE_EARTH",1),LSTReg.sf("ANCIENT_RUNE_EARTH",1),LSTReg.mat("PAPER",1),LSTReg.sf("ANCIENT_RUNE_EARTH",1),LSTReg.sf("ANCIENT_RUNE_EARTH",1),LSTReg.sf("ANCIENT_RUNE_EARTH",1),LSTReg.sf("ANCIENT_RUNE_EARTH",1)});
        LSTScriptBridge.registerScriptItem(plugin, "LENGSHANG_唤雨符", "道具/唤雨符", LSTGroups.TSWP, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("ANCIENT_RUNE_WATER",1),LSTReg.sf("ANCIENT_RUNE_WATER",1),LSTReg.sf("ANCIENT_RUNE_WATER",1),LSTReg.sf("ANCIENT_RUNE_WATER",1),LSTReg.mat("PAPER",1),LSTReg.sf("ANCIENT_RUNE_WATER",1),LSTReg.sf("ANCIENT_RUNE_WATER",1),LSTReg.sf("ANCIENT_RUNE_WATER",1),LSTReg.sf("ANCIENT_RUNE_WATER",1)});
        LSTScriptBridge.registerScriptItem(plugin, "LENGSHANG_唤雷符", "道具/唤雷符", LSTGroups.TSWP, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("ANCIENT_RUNE_LIGHTNING",1),LSTReg.sf("ANCIENT_RUNE_LIGHTNING",1),LSTReg.sf("ANCIENT_RUNE_LIGHTNING",1),LSTReg.sf("ANCIENT_RUNE_LIGHTNING",1),LSTReg.mat("PAPER",1),LSTReg.sf("ANCIENT_RUNE_LIGHTNING",1),LSTReg.sf("ANCIENT_RUNE_LIGHTNING",1),LSTReg.sf("ANCIENT_RUNE_LIGHTNING",1),LSTReg.sf("ANCIENT_RUNE_LIGHTNING",1)});
        LSTScriptBridge.registerScriptItem(plugin, "LENGSHANG_巨人刷怪蛋", "道具/巨人刷怪蛋", LSTGroups.G8, RecipeType.NULL, LSTScriptBridge.NO_RECIPE);
        LSTScriptBridge.registerScriptItem(plugin, "LENGSHANG_经验存储器", "道具/经验存储器", LSTGroups.TSWP, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.mat("CHERRY_PLANKS",1),LSTReg.mat("CHERRY_PLANKS",1),LSTReg.mat("CHERRY_PLANKS",1),LSTReg.mat("CHERRY_PLANKS",1),LSTReg.mat("DIAMOND",1),LSTReg.mat("CHERRY_PLANKS",1),LSTReg.mat("CHERRY_PLANKS",1),LSTReg.mat("CHERRY_PLANKS",1),LSTReg.mat("CHERRY_PLANKS",1)});
        LSTScriptBridge.registerScriptItem(plugin, "LENGSHANG_命运之轮", "道具/命运之轮", LSTGroups.ZHONGZHANG, LSTRecipeTypes.get("LENGSHANG_XX_ZWPF"), LSTScriptBridge.NO_RECIPE);
        LSTScriptBridge.registerScriptItem(plugin, "LENGSHANG_海神·黄金三叉戟", "武器/海神·黄金三叉戟", LSTGroups.WQ, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{null,LSTReg.sf("AW_YZXWZJ",1),null,null,LSTReg.sf("LENGSHANG_海渊裂空之戟",1),null,null,LSTReg.sf("LENGSHANG_海神之心",1),null});
    }

    private LSTItems52() {
    }
}
