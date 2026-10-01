package io.Yomicer.LengShangTech.gen;

import io.Yomicer.LengShangTech.core.*;
import io.Yomicer.LengShangTech.scripts.LSTScriptBridge;
import io.Yomicer.LengShangTech.scripts.LSTBlockDrops;
import io.Yomicer.LengShangTech.LengShangEvo;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import org.bukkit.inventory.ItemStack;

/** 冷殇物品定义 (自动转换, 第 52 批)。 */
public final class LSTItems51 {

    public static void create() {
        // LENGSHANG_离子火箭
        LSTItemFactory.headBase64("LENGSHANG_离子火箭","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjdhNjI3MjQyYjAxNDkyODJkMmIzODAyYjI0NGI2MjYyMmJlYjE1MmJjNDdmMWRkMDcwNzljZWQzYWQ4YjkwIn19fQ==","&b离子火箭","&7最高级的等离子火箭","&7终于能抵达箔澜星了");
        // LENGSHANG_箔澜金
        LSTItemFactory.head("LENGSHANG_箔澜金","33816458509af0338565d7fa9585be4f1aa045fbad38e86e4718dd6ff1a87e6e","&a&l箔澜金","&7金片上折射出诡异的蓝光");
        // LENGSHANG_陨土石井
        LSTItemFactory.head("LENGSHANG_陨土石井","4231908a3235a61ef3328217e4d9c894c3453d6f00d6f3fa8ff39f249f44700a","&4&l陨土石井","&7类井之石","&7却让人看出了希望");
        // LENGSHANG_陨土石井丛
        LSTItemFactory.head("LENGSHANG_陨土石井丛","79a241fff37206e0db976c792ac2338b2cc39eabae83c7d4673a1b3dbc3f40eb","&a&l陨土石井丛","&7城南的花开了...");
        // LENGSHANG_星际商贩
        LSTItemFactory.head("LENGSHANG_星际商贩","9f89d84bddd06f7b1fb61432c654be411593abd7d3c9957023f3b01d941a0872","&9&l星际商贩","&7你终于找到他了...");
        // LENGSHANG_星轨
        LSTItemFactory.head("LENGSHANG_星轨","5a86652f9fab53df3967ef110f57011666cf80d23e0c98d4a9ea6c8701ba50de","&e&l星轨","&7一缕神秘光环");
        // LENGSHANG_哈勃望远镜
        LSTItemFactory.head("LENGSHANG_哈勃望远镜","1268002cb0b97bee508e87f9954cf1899ab90560bd747c489cb54251ba6c50f3","&c&l哈勃望远镜","&7观测星体");
        // LENGSHANG_星轨币
        LSTItemFactory.head("LENGSHANG_星轨币","82806c28457cb3acbf240823bacb24a83d48c0ef92dbaed223cd19e01fd1e0d9","&c&l星轨币","&7宇宙统一交易货币");
        // LENGSHANG_箔光桶
        LSTItemFactory.head("LENGSHANG_箔光桶","fef3490dc625bd4e7b5c24ae3d0a1669b30cd1c0064c47d00800e38a5408ec10","&6&l箔光桶","&7一桶装万物");
        // LENGSHANG_次元液
        LSTItemFactory.head("LENGSHANG_次元液","39d3ec218f43538255de2afe1bb3c280f884bd261a6df00033f8810f22893d80","&b&l次元液","&7它装着一个维度");
        // LENGSHANG_世轮
        LSTItemFactory.head("LENGSHANG_世轮","6b60171a946b630f46b7b626f4a780bd1a2de9ae3b2bc8a67b6f5bd970eb7","&e&l世轮","&7在维度间穿梭");
        // LENGSHANG_时光沙漏
        LSTItemFactory.head("LENGSHANG_时光沙漏","6fe7d46322477d61d41c18788f5c1afd24ed526eb3ed84127f212e2515b1883","&6&l时光沙漏","&7维度中的时间独裁者");
        // LENGSHANG_时空坍缩仪
        LSTItemFactory.head("LENGSHANG_时空坍缩仪","2fcad72766f384478cfe639f02226fbe836003b0de9aa650fbb49c705429b2ac","&f&l时空坍缩仪","&7向二次元进发！");
        // LENGSHANG_二向箔
        LSTItemFactory.head("LENGSHANG_二向箔","6a5fd09cec4fe97ccc77621b73d89ad6e45d793117f576557d653845acb4f0ad","&e&l二向箔","&7想想太阳系的下场...");
        // LENGSHANG_银河转码仪
        LSTItemFactory.head("LENGSHANG_银河转码仪","badac92f96d889e72ed3872462012ab0bcf41fa82745d83d847458b50cb4f989","&b&l银河转码仪","&7技术的更替！");
        // LENGSHANG_二维地球
        LSTItemFactory.material("LENGSHANG_二维地球","GLOBE_BANNER_PATTERN",false,"&b&l二维地球","&7全员二次元...却坍缩的不成样");
        // LENGSHANG_箔澜人
        LSTItemFactory.head("LENGSHANG_箔澜人","5d47df2481cc0c51ced4496fb5fce26fb9169181abb56b73f72000d0bb23b74c","&c&l箔澜人","&7这颗神秘星球上的居民");
        // LENGSHANG_机器人晶源
        LSTItemFactory.head("LENGSHANG_机器人晶源","deb05dce6e86bfa3d75bfd1e015d34f4a731a9e709fbda611a684cb56d7a4576","&c&l机器人晶源","&7终极劳动力...");
        // LENGSHANG_时空GPS
        LSTItemFactory.head("LENGSHANG_时空GPS","afccbc9396ddc2a1b07846842c0d6561db13d1cb45d6299c2fd981a231f05744","&d&l时空GPS","&7精准定位星球");
        // LENGSHANG_星云果
        LSTItemFactory.material("LENGSHANG_星云果","ENCHANTED_GOLDEN_APPLE",false,"&e&l星云果","&7星云凝聚成的果实");
        // LENGSHANG_超镧系元素
        LSTItemFactory.head("LENGSHANG_超镧系元素","8c10e9d3643cec61a30077d4181435b6ecfe8a884e4c376493be13af82f3e2b8","&6&l超镧系元素","&7突破118号元素！","&8第八周期将有50个元素...");
        // LENGSHANG_超镧燃料
        LSTItemFactory.head("LENGSHANG_超镧燃料","818f83eb64f438e3f6ae3a5c2dea8ed10303bad85ac34a798659a275aa096506","&6&l超镧燃料","&7点燃宇宙！");
        // LENGSHANG_箔澜星
        LSTItemFactory.head("LENGSHANG_箔澜星","ffd21f16347a401ca5e97f47782f4739bf5480a1c29e19743945b4dc529f5859","&9&l箔澜星","&7它来了...");
        // LENGSHANG_箔澜军团
        LSTItemFactory.head("LENGSHANG_箔澜军团","47c1dd4ae9f857aedcccb92914988e489a0f01a23d78e12b00f758da65e55da7","&4&l箔澜军团","&7乌压压一片");
        // LENGSHANG_箔澜传送门
        LSTItemFactory.head("LENGSHANG_箔澜传送门","2b92abeb44c34b998a018ec5b6022e8fc158ee8b13404c0fe6dd0917fed844eb","&9&l箔澜传送门","&7向着箔澜星出发吧！","&7尽管旅途并不如意","&7似乎充满着血腥","&7但是战争之后终将迎来和平","&7你经历了一次次技术革命","&7是时候去改造你的母星了！","&7快为宇宙人民谋求福音吧！","&7当然，记得保护好你自己","&7箔澜可不会罩着你一生！","&7箔澜星——完，感谢您的游玩");
        // LENGSHANG_压缩_不可控空
        LSTItemFactory.material("LENGSHANG_压缩_不可控空","GRAY_STAINED_GLASS_PANE",true,"&6压缩 · &f&l不可控空","&7由64个&f&l不可控空&7压缩而成");
        // LENGSHANG_压缩_BUG运算式
        LSTItemFactory.material("LENGSHANG_压缩_BUG运算式","WHITE_STAINED_GLASS_PANE",true,"&6压缩 · &8&lBUG &e- &a运算式","&7由64个&8&lBUG &e- &a运算式&7压缩而成");
        // LENGSHANG_压缩_BUG小数
        LSTItemFactory.material("LENGSHANG_压缩_BUG小数","RED_STAINED_GLASS_PANE",true,"&6压缩 · &8&lBUG &e- &a小数","&7由64个&8&lBUG &e- &a小数&7压缩而成");
        // LENGSHANG_压缩_BUG日期
        LSTItemFactory.material("LENGSHANG_压缩_BUG日期","ORANGE_STAINED_GLASS_PANE",true,"&6压缩 · &8&lBUG &e- &a日期","&7由64个&8&lBUG &e- &a日期&7压缩而成");
        // LENGSHANG_压缩_BUG正过载
        LSTItemFactory.material("LENGSHANG_压缩_BUG正过载","YELLOW_STAINED_GLASS_PANE",true,"&6压缩 · &8&lBUG &e- &a正过载","&7由64个&8&lBUG &e- &a正过载&7压缩而成");
        // LENGSHANG_压缩_BUG负过载
        LSTItemFactory.material("LENGSHANG_压缩_BUG负过载","GREEN_STAINED_GLASS_PANE",true,"&6压缩 · &8&lBUG &e- &a负过载","&7由64个&8&lBUG &e- &a负过载&7压缩而成");
        // LENGSHANG_压缩_BUG系统
        LSTItemFactory.material("LENGSHANG_压缩_BUG系统","BLUE_STAINED_GLASS_PANE",true,"&6压缩 · &8&lBUG &e- &a系统","&7由64个&8&lBUG &e- &a系统&7压缩而成");
        // LENGSHANG_压缩_原始物质1
        LSTItemFactory.material("LENGSHANG_压缩_原始物质1","END_CRYSTAL",true,"&6压缩 · &x&F&F&7&6&8&B原&x&F&F&6&E&7&7始&x&F&F&6&C&6&4物&x&F&F&7&5&5&6质&x&F&F&7&E&4&8α","&7由64个&x&F&F&7&6&8&B原&x&F&F&6&E&7&7始&x&F&F&6&C&6&4物&x&F&F&7&5&5&6质&x&F&F&7&E&4&8α&7压缩而成");
        // LENGSHANG_压缩_原始物质2
        LSTItemFactory.material("LENGSHANG_压缩_原始物质2","END_CRYSTAL",true,"&6压缩 · &x&F&F&8&7&3&9原&x&F&F&8&F&2&B始&x&F&F&9&8&1&D物&x&F&F&A&1&0&E质&x&F&F&A&A&0&0β","&7由64个&x&F&F&8&7&3&9原&x&F&F&8&F&2&B始&x&F&F&9&8&1&D物&x&F&F&A&1&0&E质&x&F&F&A&A&0&0β&7压缩而成");
        // LENGSHANG_压缩_终极之心
        LSTItemFactory.material("LENGSHANG_压缩_终极之心","HONEYCOMB",true,"&6压缩 · &x&9&D&F&9&9&1终&x&A&C&F&A&8&C极&x&B&A&F&B&8&6之&x&C&8&F&C&8&1心","&7由64个&x&9&D&F&9&9&1终&x&A&C&F&A&8&C极&x&B&A&F&B&8&6之&x&C&8&F&C&8&1心&7压缩而成");
        // LENGSHANG_压缩_命令方块
        LSTItemFactory.material("LENGSHANG_压缩_命令方块","COMMAND_BLOCK",true,"&6压缩 · &d命令方块","&7由64个&d命令方块&7压缩而成");
        // LENGSHANG_压缩_循环型命令方块
        LSTItemFactory.material("LENGSHANG_压缩_循环型命令方块","REPEATING_COMMAND_BLOCK",true,"&6压缩 · &d循环型命令方块","&7由64个&d循环型命令方块&7压缩而成");
        // LENGSHANG_压缩_连锁型命令方块
        LSTItemFactory.material("LENGSHANG_压缩_连锁型命令方块","CHAIN_COMMAND_BLOCK",true,"&6压缩 · &d连锁型命令方块","&7由64个&d连锁型命令方块&7压缩而成");
        // LENGSHANG_压缩_Resource
        LSTItemFactory.material("LENGSHANG_压缩_Resource","COMMAND_BLOCK",true,"&6压缩 · &a&lResource","&7由64个&a&lResource&7压缩而成");
        // LENGSHANG_压缩_一重压缩圆石
        LSTItemFactory.material("LENGSHANG_压缩_一重压缩圆石","COBBLESTONE",true,"&6压缩 · &9一重压缩圆石","&7由64个圆石压缩而成");
        // LENGSHANG_压缩_二重压缩圆石
        LSTItemFactory.material("LENGSHANG_压缩_二重压缩圆石","COBBLESTONE",true,"&6压缩 · &9二重压缩圆石","&7由4096个圆石压缩而成");
        // LENGSHANG_压缩_三重压缩圆石
        LSTItemFactory.material("LENGSHANG_压缩_三重压缩圆石","COBBLESTONE",true,"&6压缩 · &9三重压缩圆石","&7由262144个圆石压缩而成");
        // LENGSHANG_压缩_四重压缩圆石
        LSTItemFactory.material("LENGSHANG_压缩_四重压缩圆石","COBBLESTONE",true,"&6压缩 · &9四重压缩圆石","&7由16777216个圆石压缩而成");
        // LENGSHANG_德古拉之吻
        LSTItemFactory.saved("LENGSHANG_德古拉之吻","道具/DGLZW","PAPER");
        // LENGSHANG_破军
        LSTItemFactory.saved("LENGSHANG_破军","道具/PJ","PAPER");
        // LENGSHANG_天罚之刃
        LSTItemFactory.saved("LENGSHANG_天罚之刃","道具/TFZR","PAPER");
        // LENGSHANG_附魔提取器
        LSTItemFactory.material("LENGSHANG_附魔提取器","BOOK",false,"&9&l附魔提取器","&d需将提取附魔的道具放到副手使用"," ","&7右键将副手的附魔提取成附魔书","&7每次使用随机提取副手的附魔");
        // LENGSHANG_配方拆解器
        LSTItemFactory.head("LENGSHANG_配方拆解器","fd5724a79f90fd1e54765d7596928146dcb9e50fdb88596201c4a235c4a6f4ee","&6&l配方拆解器","&d需将需要反向的道具放到副手使用"," ","&7右键将副手的物品拆解成原合成配方","&7其实就是相当于一次性的反向拆解台");
        // LENGSHANG_魔法结晶_6
        LSTItemFactory.material("LENGSHANG_魔法结晶_6","GOLD_NUGGET",false,"&6魔法结晶 &7- &eVI","&c","&c&o等级: VI");
        // LENGSHANG_魔法结晶_7
        LSTItemFactory.material("LENGSHANG_魔法结晶_7","GOLD_NUGGET",false,"&6魔法结晶 &7- &eVII","&c","&c&o等级: VII");
        // LENGSHANG_魔法结晶_8
        LSTItemFactory.material("LENGSHANG_魔法结晶_8","GOLD_NUGGET",false,"&6魔法结晶 &7- &eVIII","&c","&c&o等级: VIII");
        // LENGSHANG_魔法结晶_9
        LSTItemFactory.material("LENGSHANG_魔法结晶_9","GOLD_NUGGET",false,"&6魔法结晶 &7- &eIX","&c","&c&o等级: IX");
        // LENGSHANG_魔法结晶_10
        LSTItemFactory.material("LENGSHANG_魔法结晶_10","GOLD_NUGGET",false,"&6魔法结晶 &7- &eX","&c","&c&o等级: X");
        // LENGSHANG_经验作弊器
        LSTItemFactory.material("LENGSHANG_经验作弊器","EXPERIENCE_BOTTLE",false,"&x&0&F&F&0&0&0经&x&A&D&F&F&2&F验&x&F&F&D&7&0&0作&x&F&F&A&5&0&0弊&x&9&9&6&6&F&F器","&9右键提升指定等级","&9蹲下右键设置等级");
        // LENGSHANG_永恒无尽锭
        LSTItemFactory.material("LENGSHANG_永恒无尽锭","IRON_INGOT",true,"&x&0&F&F&F&F&F永&x&0&F&F&C&C&F恒&x&0&F&F&9&9&F无&x&0&F&F&6&6&F尽&x&0&F&F&3&3&F锭","&7超越时空维度的终极物质","&7仅一锭便足以扭曲宇宙法则");
        // LENGSHANG_寰宇肉丸
        LSTItemFactory.head("LENGSHANG_寰宇肉丸","696a81b99444dd53aaa0197f37be7b038383ae85cc3a638be54e7b76df36a2c","&x&A&A&0&0&F&F寰宇肉丸","&7以近乎所有肉类与有机食物压缩而成的终极肉丸","&7食用后持续恢复生命并提供强大的抗性");
        // LENGSHANG_超级煲
        LSTItemFactory.material("LENGSHANG_超级煲","SUSPICIOUS_STEW",true,"&6超级煲","&7一个蕴含磅礴生命能量的神奇煲汤","&7食用后赋予短暂但恐怖的力量增幅");
        // LENGSHANG_终望珍珠
        LSTItemFactory.head("LENGSHANG_终望珍珠","67e6ad4b78bd35187a65708991817e26699f902c7738c81c375859d727539","&x&C&C&A&A&F&F终望珍珠","&7看似普通的珍珠，却是从“有限”跃向“无尽”的必经之路","&7右键发射黑洞,吸引周围10格内的实体,5秒后爆炸造成伤害");
        // LENGSHANG_终焉之树
        LSTItemFactory.material("LENGSHANG_终焉之树","CHERRY_SAPLING",true,"&a终焉之树","&7当最后一棵树倒下时","&7它并非死去，而是成为了一切","&5&l「&d森罗万象，归于终焉&5&l」");
        // LENGSHANG_寰宇生态瓶
        LSTItemFactory.material("LENGSHANG_寰宇生态瓶","PITCHER_PLANT",true,"&x&5&0&3&8&F&E寰&x&7&6&4&A&E&D宇&x&9&D&5&D&D&B生&x&C&3&6&F&C&A态&x&E&9&8&1&B&8瓶","&7把整个生物圈塞进一个瓶子，荒诞又浪漫");
        // LENGSHANG_世界之心
        LSTItemFactory.material("LENGSHANG_世界之心","APPLE",true,"&x&2&B&F&5&1&F世&x&1&D&E&8&5&C界&x&1&0&D&B&9&A之&x&0&2&C&E&D&7心","&7世界的第一次心跳，至今未停");
    }

    public static void register(LengShangEvo plugin) {
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_二阶火箭", LSTGroups.XJ, LSTRecipeTypes.get("LENGSHANG_XX_XJZPT"), LSTScriptBridge.NO_RECIPE, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_离子火箭", LSTGroups.XJ, LSTRecipeTypes.get("LENGSHANG_XX_XJZPT"), LSTScriptBridge.NO_RECIPE, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_箔澜金", LSTGroups.BLX_CL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("LENGSHANG_BLX_BLS",1),LSTReg.sf("LENGSHANG_BLX_BLS",1),LSTReg.sf("LENGSHANG_BLX_BLS",1),LSTReg.sf("LENGSHANG_BLX_YTB",1),LSTReg.sf("GOLD_24K_BLOCK",1),LSTReg.sf("LENGSHANG_BLX_YTB",1),LSTReg.sf("LENGSHANG_BLX_BLS",1),LSTReg.sf("LENGSHANG_BLX_BLS",1),LSTReg.sf("LENGSHANG_BLX_BLS",1)}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_陨土石井", LSTGroups.BLX_CL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("LENGSHANG_BLX_BLS",1),LSTReg.sf("LENGSHANG_BLX_YTB",1),LSTReg.sf("LENGSHANG_BLX_BLS",1),LSTReg.sf("LENGSHANG_BLX_YTB",1),LSTReg.sf("GOLD_24K",1),LSTReg.sf("LENGSHANG_BLX_YTB",1),LSTReg.sf("LENGSHANG_BLX_BLS",1),LSTReg.sf("LENGSHANG_BLX_YTB",1),LSTReg.sf("LENGSHANG_BLX_BLS",1)}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_陨土石井丛", LSTGroups.BLX_CL, LSTRecipeTypes.get("LENGSHANG_XX_YKCFJ"), new ItemStack[]{null,null,null,null,LSTReg.sf("LENGSHANG_陨土石井",1),null,null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_星际商贩", LSTGroups.BLX_CL, RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_游商",64),null,null,null,null,null,null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_星轨", LSTGroups.BLX_CL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("LENGSHANG_BLX_BLS",1),LSTReg.sf("LENGSHANG_镧纱",1),LSTReg.sf("LENGSHANG_BLX_BLS",1),LSTReg.sf("LENGSHANG_镧纱",1),LSTReg.sf("LENGSHANG_BLX_YTB",1),LSTReg.sf("LENGSHANG_镧纱",1),LSTReg.sf("LENGSHANG_光腺",1),LSTReg.sf("LENGSHANG_BLX_BLS",1),LSTReg.sf("LENGSHANG_光腺",1)}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_哈勃望远镜", LSTGroups.BLX_CL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("LENGSHANG_BLX_BLS",1),LSTReg.mat("TINTED_GLASS",1),LSTReg.sf("LENGSHANG_BLX_BLS",1),LSTReg.mat("TINTED_GLASS",1),LSTReg.sf("LENGSHANG_BLX_YTB",1),LSTReg.mat("TINTED_GLASS",1),LSTReg.sf("LENGSHANG_光腺",1),LSTReg.sf("LENGSHANG_镧纱",1),LSTReg.sf("LENGSHANG_光腺",1)}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_星轨币", LSTGroups.BLX_CL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("LENGSHANG_星轨",1),LSTReg.sf("LENGSHANG_BLX_YTB",1),LSTReg.sf("LENGSHANG_星轨",1),LSTReg.mat("TINTED_GLASS",1),LSTReg.sf("SYNTHETIC_EMERALD",1),LSTReg.mat("TINTED_GLASS",1),LSTReg.sf("SYNTHETIC_EMERALD",1),LSTReg.sf("LENGSHANG_BLX_YTB",1),LSTReg.sf("SYNTHETIC_EMERALD",1)}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_箔光桶", LSTGroups.BLX_CL, RecipeType.SMELTERY, new ItemStack[]{LSTReg.sf("LENGSHANG_箔澜金",1),LSTReg.sf("LENGSHANG_陨土石井丛",1),LSTReg.sf("LENGSHANG_激光石",1),LSTReg.sf("LENGSHANG_月球玻璃",1),LSTReg.sf("LENGSHANG_月球芝士",1),LSTReg.sf("LENGSHANG_月岩",1),null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_次元液", LSTGroups.BLX_CL, RecipeType.SMELTERY, new ItemStack[]{LSTReg.mat("CHAIN_COMMAND_BLOCK",1),LSTReg.sf("LENGSHANG_陨土石井丛",1),LSTReg.mat("JIGSAW",1),null,null,null,null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_世轮", LSTGroups.BLX_CL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("LENGSHANG_次元液",1),LSTReg.sf("LENGSHANG_次元液",1),LSTReg.sf("LENGSHANG_次元液",1),LSTReg.sf("QUIRPCONDENSATE",1),LSTReg.sf("QUIRPCONDENSATE",1),LSTReg.sf("QUIRPCONDENSATE",1),LSTReg.sf("LENGSHANG_箔澜负荷板",1),LSTReg.sf("LENGSHANG_玄钨晶",1),LSTReg.sf("LENGSHANG_箔澜负荷板",1)}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_时光沙漏", LSTGroups.BLX_CL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("LENGSHANG_金曜锭",1),LSTReg.sf("LENGSHANG_月球玻璃",1),LSTReg.sf("LENGSHANG_金曜锭",1),LSTReg.sf("LENGSHANG_终焉方块",1),LSTReg.sf("LENGSHANG_世轮",1),LSTReg.sf("LENGSHANG_终焉方块",1),LSTReg.sf("LENGSHANG_金曜锭",1),LSTReg.sf("LENGSHANG_月球玻璃",1),LSTReg.sf("LENGSHANG_金曜锭",1)}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_时空坍缩仪", LSTGroups.BLX_CL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("LENGSHANG_箔澜处理单元",1),LSTReg.sf("LENGSHANG_离子发动机",1),LSTReg.sf("LENGSHANG_箔澜处理单元",1),LSTReg.sf("LENGSHANG_荧石电路板",1),LSTReg.sf("LENGSHANG_时光沙漏",1),LSTReg.sf("LENGSHANG_荧石电路板",1),LSTReg.sf("LENGSHANG_钨锭",1),LSTReg.sf("LENGSHANG_月球玻璃",1),LSTReg.sf("LENGSHANG_钨锭",1)}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_二向箔", LSTGroups.BLX_CL, LSTRecipeTypes.get("LENGSHANG_XX_XGLC"), new ItemStack[]{null,null,null,null,LSTReg.sf("LENGSHANG_星轨币",64),null,null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_银河转码仪", LSTGroups.BLX_CL, LSTRecipeTypes.get("LENGSHANG_XX_XGLC"), new ItemStack[]{null,null,null,null,LSTReg.sf("LENGSHANG_星轨币",64),null,null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_二维地球", LSTGroups.BLX_CL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("LENGSHANG_二向箔",1),LSTReg.sf("LENGSHANG_二向箔",1),LSTReg.sf("LENGSHANG_二向箔",1),LSTReg.sf("LENGSHANG_时空坍缩仪",1),LSTReg.sf("LENGSHANG_寂骸",1),LSTReg.sf("LENGSHANG_时空坍缩仪",1),null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_箔澜人", LSTGroups.BLX_CL, RecipeType.SMELTERY, new ItemStack[]{LSTReg.sf("LENGSHANG_游商",4),null,null,null,null,null,null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_机器人晶源", LSTGroups.BLX_CL, LSTRecipeTypes.get("LENGSHANG_XX_WZZSJ"), new ItemStack[]{null,null,null,LSTReg.sf("LENGSHANG_箔澜人",1),null,LSTReg.sf("LENGSHANG_时光沙漏",1),null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_时空GPS", LSTGroups.BLX_CL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("LENGSHANG_箔澜人",1),LSTReg.sf("LENGSHANG_箔澜人",1),LSTReg.sf("LENGSHANG_箔澜人",1),LSTReg.sf("LENGSHANG_二维地球",1),LSTReg.sf("LENGSHANG_超镧燃料",1),LSTReg.sf("LENGSHANG_二维地球",1),LSTReg.sf("LENGSHANG_时光沙漏",1),LSTReg.sf("LENGSHANG_时空坍缩仪",1),LSTReg.sf("LENGSHANG_时光沙漏",1)}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_星云果", LSTGroups.BLX_CL, LSTRecipeTypes.get("LENGSHANG_XX_KPLXYS"), new ItemStack[]{null,null,null,null,LSTReg.sf("LENGSHANG_时光沙漏",1),null,null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_超镧系元素", LSTGroups.BLX_CL, LSTRecipeTypes.get("LENGSHANG_XX_BLGZY"), new ItemStack[]{null,null,null,null,LSTReg.sf("LENGSHANG_镧纱",2),null,null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_超镧燃料", LSTGroups.BLX_CL, LSTRecipeTypes.get("LENGSHANG_XX_WZZSJ"), new ItemStack[]{null,null,null,null,LSTReg.sf("LENGSHANG_超镧系元素",4),null,null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_箔澜星", LSTGroups.BLX_CL, LSTRecipeTypes.get("LENGSHANG_XX_CYNH"), new ItemStack[]{null,null,null,null,LSTReg.sf("LENGSHANG_超镧燃料",1),null,null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_箔澜军团", LSTGroups.BLX_CL, LSTRecipeTypes.get("LENGSHANG_XX_CYNH"), new ItemStack[]{null,null,null,null,LSTReg.sf("LENGSHANG_机器人晶源",64),null,null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_箔澜传送门", LSTGroups.BLX_CL, LSTRecipeTypes.get("LENGSHANG_XX_BLXJ"), new ItemStack[]{null,null,null,null,LSTReg.sf("LENGSHANG_星云果",64),null,null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_压缩_不可控空", LSTGroups.CL, LSTRecipeTypes.get("LENGSHANG_XX_LHYSJ"), new ItemStack[]{null,null,null,null,LSTReg.sf("MOMOTECH_UNCONTROLLABLE_EMPTY_",64),null,null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_压缩_BUG运算式", LSTGroups.CL, LSTRecipeTypes.get("LENGSHANG_XX_LHYSJ"), new ItemStack[]{null,null,null,null,LSTReg.sf("MOMOTECH_NUMBER_BUG",64),null,null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_压缩_BUG小数", LSTGroups.CL, LSTRecipeTypes.get("LENGSHANG_XX_LHYSJ"), new ItemStack[]{null,null,null,null,LSTReg.sf("MOMOTECH_NUMBER_BUG_I",64),null,null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_压缩_BUG日期", LSTGroups.CL, LSTRecipeTypes.get("LENGSHANG_XX_LHYSJ"), new ItemStack[]{null,null,null,null,LSTReg.sf("MOMOTECH_NUMBER_BUG_II",64),null,null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_压缩_BUG正过载", LSTGroups.CL, LSTRecipeTypes.get("LENGSHANG_XX_LHYSJ"), new ItemStack[]{null,null,null,null,LSTReg.sf("MOMOTECH_NUMBER_BUG_III",64),null,null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_压缩_BUG负过载", LSTGroups.CL, LSTRecipeTypes.get("LENGSHANG_XX_LHYSJ"), new ItemStack[]{null,null,null,null,LSTReg.sf("MOMOTECH_NUMBER_BUG_IV",64),null,null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_压缩_BUG系统", LSTGroups.CL, LSTRecipeTypes.get("LENGSHANG_XX_LHYSJ"), new ItemStack[]{null,null,null,null,LSTReg.sf("MOMOTECH_NUMBER_BUG_V",64),null,null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_压缩_原始物质1", LSTGroups.CL, LSTRecipeTypes.get("LENGSHANG_XX_LHYSJ"), new ItemStack[]{null,null,null,null,LSTReg.sf("MOMOTECH_CREATIVE",64),null,null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_压缩_原始物质2", LSTGroups.CL, LSTRecipeTypes.get("LENGSHANG_XX_LHYSJ"), new ItemStack[]{null,null,null,null,LSTReg.sf("MOMOTECH_CREATIVE_I",64),null,null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_压缩_终极之心", LSTGroups.CL, LSTRecipeTypes.get("LENGSHANG_XX_LHYSJ"), new ItemStack[]{null,null,null,null,LSTReg.sf("MOMOTECH_FINAL_STAR",64),null,null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_压缩_命令方块", LSTGroups.CL, LSTRecipeTypes.get("LENGSHANG_XX_LHYSJ"), new ItemStack[]{null,LSTReg.sf("MOMOTECH_EMPTY_SHELL",1),null,null,LSTReg.mat("COMMAND_BLOCK",64),null,null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_压缩_循环型命令方块", LSTGroups.CL, LSTRecipeTypes.get("LENGSHANG_XX_LHYSJ"), new ItemStack[]{null,LSTReg.sf("MOMOTECH_EMPTY_SHELL",1),null,null,LSTReg.mat("REPEATING_COMMAND_BLOCK",64),null,null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_压缩_连锁型命令方块", LSTGroups.CL, LSTRecipeTypes.get("LENGSHANG_XX_LHYSJ"), new ItemStack[]{null,LSTReg.sf("MOMOTECH_EMPTY_SHELL",1),null,null,LSTReg.mat("CHAIN_COMMAND_BLOCK",64),null,null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_压缩_Resource", LSTGroups.CL, LSTRecipeTypes.get("LENGSHANG_XX_LHYSJ"), new ItemStack[]{null,null,null,null,LSTReg.sf("MOMOTECH_RESOURCE",64),null,null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_压缩_一重压缩圆石", LSTGroups.CL, LSTRecipeTypes.get("LENGSHANG_XX_LHYSJ"), new ItemStack[]{null,LSTReg.sf("MOMOTECH_EMPTY_SHELL",1),null,null,LSTReg.mat("COBBLESTONE",64),null,null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_压缩_二重压缩圆石", LSTGroups.CL, LSTRecipeTypes.get("LENGSHANG_XX_LHYSJ"), new ItemStack[]{null,null,null,null,LSTReg.sf("LENGSHANG_压缩_一重压缩圆石",64),null,null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_压缩_三重压缩圆石", LSTGroups.CL, LSTRecipeTypes.get("LENGSHANG_XX_LHYSJ"), new ItemStack[]{null,null,null,null,LSTReg.sf("LENGSHANG_压缩_二重压缩圆石",64),null,null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_压缩_四重压缩圆石", LSTGroups.CL, LSTRecipeTypes.get("LENGSHANG_XX_LHYSJ"), new ItemStack[]{null,null,null,null,LSTReg.sf("LENGSHANG_压缩_三重压缩圆石",64),null,null,null,null}, false);
        LSTScriptBridge.registerScriptItem(plugin, "LENGSHANG_德古拉之吻", "道具/德古拉之吻", LSTGroups.WQ, RecipeType.MAGIC_WORKBENCH, new ItemStack[]{LSTReg.sf("ESSENCE_OF_AFTERLIFE",1),LSTReg.sf("LENGSHANG_魔法结晶_10",1),LSTReg.sf("ESSENCE_OF_AFTERLIFE",1),LSTReg.sf("LENGSHANG_魔法结晶_10",1),LSTReg.sf("BLADE_OF_VAMPIRES",1),LSTReg.sf("LENGSHANG_魔法结晶_10",1),LSTReg.sf("ESSENCE_OF_AFTERLIFE",1),LSTReg.sf("LENGSHANG_魔法结晶_10",1),LSTReg.sf("ESSENCE_OF_AFTERLIFE",1)});
        LSTScriptBridge.registerScriptItem(plugin, "LENGSHANG_破军", "道具/破军", LSTGroups.WQ, RecipeType.MAGIC_WORKBENCH, new ItemStack[]{LSTReg.sf("ESSENCE_OF_AFTERLIFE",1),LSTReg.sf("LENGSHANG_魔法结晶_10",1),LSTReg.sf("ESSENCE_OF_AFTERLIFE",1),LSTReg.sf("LENGSHANG_魔法结晶_10",1),LSTReg.sf("SWORD_OF_BEHEADING",1),LSTReg.sf("LENGSHANG_魔法结晶_10",1),LSTReg.sf("ESSENCE_OF_AFTERLIFE",1),LSTReg.sf("LENGSHANG_魔法结晶_10",1),LSTReg.sf("ESSENCE_OF_AFTERLIFE",1)});
        LSTScriptBridge.registerScriptItem(plugin, "LENGSHANG_天罚之刃", "道具/天罚之刃", LSTGroups.WQ, RecipeType.MAGIC_WORKBENCH, new ItemStack[]{LSTReg.sf("ESSENCE_OF_AFTERLIFE",1),LSTReg.sf("LENGSHANG_魔法结晶_10",1),LSTReg.sf("ESSENCE_OF_AFTERLIFE",1),LSTReg.sf("LENGSHANG_魔法结晶_10",1),LSTReg.mat("NETHERITE_SWORD",1),LSTReg.sf("LENGSHANG_魔法结晶_10",1),LSTReg.sf("ESSENCE_OF_AFTERLIFE",1),LSTReg.sf("LENGSHANG_魔法结晶_10",1),LSTReg.sf("ESSENCE_OF_AFTERLIFE",1)});
        LSTScriptBridge.registerScriptItem(plugin, "LENGSHANG_附魔提取器", "道具/附魔提取器", LSTGroups.TSWP, RecipeType.ANCIENT_ALTAR, new ItemStack[]{LSTReg.sf("FILLED_FLASK_OF_KNOWLEDGE",1),LSTReg.sf("ANCIENT_RUNE_ENCHANTMENT",1),LSTReg.sf("FILLED_FLASK_OF_KNOWLEDGE",1),LSTReg.sf("ANCIENT_RUNE_ENCHANTMENT",1),LSTReg.sf("ESSENCE_OF_AFTERLIFE",1),LSTReg.sf("ANCIENT_RUNE_ENCHANTMENT",1),LSTReg.sf("FILLED_FLASK_OF_KNOWLEDGE",1),LSTReg.sf("ANCIENT_RUNE_ENCHANTMENT",1),LSTReg.sf("FILLED_FLASK_OF_KNOWLEDGE",1)});
        LSTScriptBridge.registerScriptItem(plugin, "LENGSHANG_配方拆解器", "道具/配方拆解器", LSTGroups.TSWP, RecipeType.ANCIENT_ALTAR, new ItemStack[]{LSTReg.sf("MAGIC_LUMP_3",1),LSTReg.sf("STEEL_PLATE",1),LSTReg.sf("ENDER_LUMP_3",1),LSTReg.sf("STEEL_PLATE",1),LSTReg.sf("MAGICAL_BOOK_COVER",1),LSTReg.sf("STEEL_PLATE",1),LSTReg.sf("ENDER_LUMP_3",1),LSTReg.sf("STEEL_PLATE",1),LSTReg.sf("MAGIC_LUMP_3",1)});
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_魔法结晶_6", LSTGroups.CL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("MAGIC_LUMP_5",1),LSTReg.sf("MAGIC_LUMP_5",1),null,LSTReg.sf("MAGIC_LUMP_5",1),LSTReg.sf("MAGIC_LUMP_5",1),null,null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_魔法结晶_7", LSTGroups.CL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("LENGSHANG_魔法结晶_6",1),LSTReg.sf("LENGSHANG_魔法结晶_6",1),null,LSTReg.sf("LENGSHANG_魔法结晶_6",1),LSTReg.sf("LENGSHANG_魔法结晶_6",1),null,null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_魔法结晶_8", LSTGroups.CL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("LENGSHANG_魔法结晶_7",1),LSTReg.sf("LENGSHANG_魔法结晶_7",1),null,LSTReg.sf("LENGSHANG_魔法结晶_7",1),LSTReg.sf("LENGSHANG_魔法结晶_7",1),null,null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_魔法结晶_9", LSTGroups.CL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("LENGSHANG_魔法结晶_8",1),LSTReg.sf("LENGSHANG_魔法结晶_8",1),null,LSTReg.sf("LENGSHANG_魔法结晶_8",1),LSTReg.sf("LENGSHANG_魔法结晶_8",1),null,null,null,null}, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_魔法结晶_10", LSTGroups.CL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("LENGSHANG_魔法结晶_9",1),LSTReg.sf("LENGSHANG_魔法结晶_9",1),null,LSTReg.sf("LENGSHANG_魔法结晶_9",1),LSTReg.sf("LENGSHANG_魔法结晶_9",1),null,null,null,null}, false);
        LSTScriptBridge.registerScriptItem(plugin, "LENGSHANG_经验作弊器", "道具/经验作弊器", LSTGroups.TSWP, LSTRecipeTypes.get("LENGSHANG_XX_TSWPZZJ"), LSTScriptBridge.NO_RECIPE);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_永恒无尽锭", LSTGroups.G11, LSTRecipeTypes.get("LENGSHANG_XX_YHWJGZT"), LSTScriptBridge.NO_RECIPE, false);
        LSTScriptBridge.registerScriptItem(plugin, "LENGSHANG_寰宇肉丸", "永恒无尽/寰宇肉丸", LSTGroups.G11, LSTRecipeTypes.get("LENGSHANG_XX_YHWJGZT"), LSTScriptBridge.NO_RECIPE);
        LSTScriptBridge.registerScriptItem(plugin, "LENGSHANG_超级煲", "永恒无尽/超级煲", LSTGroups.G11, LSTRecipeTypes.get("LENGSHANG_XX_YHWJGZT"), LSTScriptBridge.NO_RECIPE);
        LSTScriptBridge.registerScriptItem(plugin, "LENGSHANG_终望珍珠", "永恒无尽/终望珍珠", LSTGroups.G11, LSTRecipeTypes.get("LENGSHANG_XX_YHWJGZT"), LSTScriptBridge.NO_RECIPE);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_终焉之树", LSTGroups.G11, LSTRecipeTypes.get("LENGSHANG_XX_YHWJGZT"), LSTScriptBridge.NO_RECIPE, false);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_寰宇生态瓶", LSTGroups.G11, LSTRecipeTypes.get("LENGSHANG_XX_YHWJGZT"), LSTScriptBridge.NO_RECIPE, false);
    }

    private LSTItems51() {
    }
}
