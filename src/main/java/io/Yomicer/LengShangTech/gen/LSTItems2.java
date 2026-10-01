package io.Yomicer.LengShangTech.gen;

import io.Yomicer.LengShangTech.core.*;
import io.Yomicer.LengShangTech.scripts.LSTScriptBridge;
import io.Yomicer.LengShangTech.scripts.LSTBlockDrops;
import io.Yomicer.LengShangTech.LengShangEvo;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import org.bukkit.inventory.ItemStack;

/** 冷殇物品定义 (自动转换, 第 3 批)。 */
public final class LSTItems2 {

    public static void create() {
        // LENGSHANG_物质量化重塑模拟器
        LSTItemFactory.material("LENGSHANG_物质量化重塑模拟器","WARPED_HYPHAE",false,"&5物质量化重塑模拟器","&7唔...终于...成功压缩了终极祭坛...","&7舍去了多方块结构许多无用物品..","&7但...总算不用搭建多方块结构了...","&7被压缩成机器后可以进堆叠了呢...","&x&F&E&3&C&3&C冷&x&F&A&1&6&6&9殇&x&E&5&1&C&9&3科&x&B&C&3&B&B&7技&b机器","&8⇨ &e⚡&7 2000000000 J 可存储","&8⇨ &e⚡&7 210,000,000 J/s");
        // LENGSHANG_特殊物品制造机
        LSTItemFactory.material("LENGSHANG_特殊物品制造机","EMERALD_BLOCK",false,"&e特殊物品制造机","&7用于制作一些特殊的物品","&x&F&E&3&C&3&C冷&x&F&A&1&6&6&9殇&x&E&5&1&C&9&3科&x&B&C&3&B&B&7技&b机器","&8⇨ &e⚡&7 20000 J 可存储","&8⇨ &e⚡&7 2000 J/s");
        // LENGSHANG_展示物品制造机
        LSTItemFactory.material("LENGSHANG_展示物品制造机","LAPIS_BLOCK",false,"&c展示物品制造机","&7制造一些无法放上展示框的替代物","&x&F&E&3&C&3&C冷&x&F&A&1&6&6&9殇&x&E&5&1&C&9&3科&x&B&C&3&B&B&7技&b机器","&8⇨ &e⚡&7 20000 J 可存储","&8⇨ &e⚡&7 2000 J/s");
        // LENGSHANG_定向芯片刻印机
        LSTItemFactory.material("LENGSHANG_定向芯片刻印机","CHISELED_BOOKSHELF",false,"&5定向芯片刻印机","&7光刻机定向刻印！","&7完美解决新手不会制造芯片的困扰","&x&F&E&3&C&3&C冷&x&F&A&1&6&6&9殇&x&E&5&1&C&9&3科&x&B&C&3&B&B&7技&b机器","&8⇨ &e⚡&7 40000 J 可存储","&8⇨ &e⚡&7 2000 J/s");
        // LENGSHANG_YS_HZHJ
        LSTItemFactory.material("LENGSHANG_YS_HZHJ","JUKEBOX",false,"&6&l压缩 · &d&l花转换机","&7可以用魔法种子转换花或其他花来转换成别的花","&x&F&E&3&C&3&C冷&x&F&A&1&6&6&9殇&x&E&5&1&C&9&3科&x&B&C&3&B&B&7技&b机器","&8⇨ &e⚡&7 1280 J 可存储","&8⇨ &e⚡&7 60 J/s");
        // LENGSHANG_压缩_工业一体机
        LSTItemFactory.head("LENGSHANG_压缩_工业一体机","144660ad45f000fff86a385ce573fe8ae10a46b0e1b0747480952acb9ee79e4e","&6&l压缩 · &6&l工业&b&l一体机","&7转换工业物品","&x&F&E&3&C&3&C冷&x&F&A&1&6&6&9殇&x&E&5&1&C&9&3科&x&B&C&3&B&B&7技&b机器","&8⇨ &e⚡&7 10240 J 可存储","&8⇨ &e⚡&7 5120 J/s");
        // LENGSHANG_数字构造器
        LSTItemFactory.headBase64("LENGSHANG_数字构造器","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjI2ZGFkNzRiMmJhYjEwNWNiNjhjOTRlYjNiZTMyZjVkYmRhNDJlYWI5NDRiNmVkOWU4MDMxMzZmOGY2MTliYyJ9fX0=","&e&l数字构造器","&7与原版数字构造器的区别是能进堆叠了！","&7不用再摆一堆机器下来卡服了,好耶！","&x&F&E&3&C&3&C冷&x&F&A&1&6&6&9殇&x&E&5&1&C&9&3科&x&B&C&3&B&B&7技&b机器","&8⇨ &e⚡&7 200000 J 可存储","&8⇨ &e⚡&7 2000 J/s");
        // LENGSHANG_压缩_数字构造器
        LSTItemFactory.headBase64("LENGSHANG_压缩_数字构造器","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjI2ZGFkNzRiMmJhYjEwNWNiNjhjOTRlYjNiZTMyZjVkYmRhNDJlYWI5NDRiNmVkOWU4MDMxMzZmOGY2MTliYyJ9fX0=","&6&l压缩 · &e&l数字构造器","&7与原版数字构造器的区别是能进堆叠了！","&7不用再摆一堆机器下来卡服了,好耶！","&x&F&E&3&C&3&C冷&x&F&A&1&6&6&9殇&x&E&5&1&C&9&3科&x&B&C&3&B&B&7技&b机器","&8⇨ &e⚡&7 2000000 J 可存储","&8⇨ &e⚡&7 20000 J/s");
        // LENGSHANG_量子存储制作机
        LSTItemFactory.material("LENGSHANG_量子存储制作机","WHITE_CONCRETE",false,"&b&l量子存储制作机","&7自动化制作量子存储","&x&F&E&3&C&3&C冷&x&F&A&1&6&6&9殇&x&E&5&1&C&9&3科&x&B&C&3&B&B&7技&b机器","&8⇨ &e⚡&7 10000 J 可存储","&8⇨ &e⚡&7 200 J/s");
        // LENGSHANG_网络抽屉升级机
        LSTItemFactory.material("LENGSHANG_网络抽屉升级机","CHISELED_BOOKSHELF",false,"&c&l网络抽屉升级机","&7自动化升级网络抽屉","&x&F&E&3&C&3&C冷&x&F&A&1&6&6&9殇&x&E&5&1&C&9&3科&x&B&C&3&B&B&7技&b机器","&8⇨ &e⚡&7 10000 J 可存储","&8⇨ &e⚡&7 200 J/s");
        // LENGSHANG_箔澜压力机
        LSTItemFactory.material("LENGSHANG_箔澜压力机","STICKY_PISTON",false,"&b&l箔澜压力机","&7制造各种电路板","&x&F&E&3&C&3&C冷&x&F&A&1&6&6&9殇&x&E&5&1&C&9&3科&x&B&C&3&B&B&7技&b机器","&8⇨ &e⚡&7 5120 J 可存储","&8⇨ &e⚡&7 256 J/s");
        // LENGSHANG_玄钨砧
        LSTItemFactory.material("LENGSHANG_玄钨砧","PISTON",false,"&9&l玄钨砧","&7能把物品压缩的更加微小","&7使它完全变成其他物品","&x&F&E&3&C&3&C冷&x&F&A&1&6&6&9殇&x&E&5&1&C&9&3科&x&B&C&3&B&B&7技&b机器","&8⇨ &e⚡&7 20000 J 可存储","&8⇨ &e⚡&7 1024 J/s");
        // LENGSHANG_陨空催肥机
        LSTItemFactory.head("LENGSHANG_陨空催肥机","144660ad45f000fff86a385ce573fe8ae10a46b0e1b0747480952acb9ee79e4e","&c&l陨空催肥机","&7太空粒子催化","&x&F&E&3&C&3&C冷&x&F&A&1&6&6&9殇&x&E&5&1&C&9&3科&x&B&C&3&B&B&7技&b机器","&8⇨ &e⚡&7 65400 J 可存储","&8⇨ &e⚡&7 14000 J/s");
        // LENGSHANG_星轨列车
        LSTItemFactory.head("LENGSHANG_星轨列车","6d5b0e3aa61162a3c6538985c5c11ceb96d5605b3ce9234c88f4fbd723475d","&e&l星轨列车","&7您将到达...","&x&F&E&3&C&3&C冷&x&F&A&1&6&6&9殇&x&E&5&1&C&9&3科&x&B&C&3&B&B&7技&b机器","&8⇨ &e⚡&7 100000 J 可存储","&8⇨ &e⚡&7 10000 J/s");
        // LENGSHANG_物质增生机
        LSTItemFactory.head("LENGSHANG_物质增生机","166fa6731ad8fba370be4b49fc5ab8b1756cd527d73335cef116cb4072dfd954","&4&l物质增生机","&7从湮灭中来，从湮灭中去","&x&F&E&3&C&3&C冷&x&F&A&1&6&6&9殇&x&E&5&1&C&9&3科&x&B&C&3&B&B&7技&b机器","&8⇨ &e⚡&7 50000 J 可存储","&8⇨ &e⚡&7 14560 J/s");
        // LENGSHANG_曲率隧道
        LSTItemFactory.head("LENGSHANG_曲率隧道","92632ba948f3de3a743cea5199424ea72b4b63437a43e39a44039d7535b5018","&e&l曲率隧道","&7宇宙交通改革！","&x&F&E&3&C&3&C冷&x&F&A&1&6&6&9殇&x&E&5&1&C&9&3科&x&B&C&3&B&B&7技&b机器","&8⇨ &e⚡&7 34560 J 可存储","&8⇨ &e⚡&7 20000 J/s");
        // LENGSHANG_箔澜重组仪
        LSTItemFactory.head("LENGSHANG_箔澜重组仪","925aca61e1b8beca9befcadd08262c5821e275be414d94f0b27e8580f20dbf3a","&9&l箔澜重组仪","&7微时空重组","&x&F&E&3&C&3&C冷&x&F&A&1&6&6&9殇&x&E&5&1&C&9&3科&x&B&C&3&B&B&7技&b机器","&8⇨ &e⚡&7 1000000 J 可存储","&8⇨ &e⚡&7 10000 J/s");
        // LENGSHANG_箔澜光子仪
        LSTItemFactory.head("LENGSHANG_箔澜光子仪","925aca61e1b8beca9befcadd08262c5821e275be414d94f0b27e8580f20dbf3a","&9&l箔澜光子仪","&7目标：“归零计划”","&x&F&E&3&C&3&C冷&x&F&A&1&6&6&9殇&x&E&5&1&C&9&3科&x&B&C&3&B&B&7技&b机器","&8⇨ &e⚡&7 2000000 J 可存储","&8⇨ &e⚡&7 20000 J/s");
        // LENGSHANG_箔澜星舰
        LSTItemFactory.head("LENGSHANG_箔澜星舰","9d3f0af3241d61f79ebf8451fbd37bfe49cef3ae9af01bdfb0c02cbacb647cf7","&6&l箔澜星舰","&7向新次元出发","&x&F&E&3&C&3&C冷&x&F&A&1&6&6&9殇&x&E&5&1&C&9&3科&x&B&C&3&B&B&7技&b机器","&8⇨ &e⚡&7 2400000 J 可存储","&8⇨ &e⚡&7 48000 J/s");
        // LENGSHANG_箔澜光刻机器人
        LSTItemFactory.head("LENGSHANG_箔澜光刻机器人","8a7504e8d5579e51ec31fd0edae038624b075b37ee3ce3e8ac3253ff8d09aff3","&c&l箔澜光刻机器人","&7全自动化生产机器人","&x&F&E&3&C&3&C冷&x&F&A&1&6&6&9殇&x&E&5&1&C&9&3科&x&B&C&3&B&B&7技&b机器","&8⇨ &e⚡&7 240000 J 可存储","&8⇨ &e⚡&7 24000 J/s");
        // LENGSHANG_箔澜转码机器人
        LSTItemFactory.head("LENGSHANG_箔澜转码机器人","b71f91f6f712faaecb5bf15fefa7952e492b0d131faa4cc6cc566a586fb45096","&b&l箔澜转码机器人","&7转换机器人的职业","&x&F&E&3&C&3&C冷&x&F&A&1&6&6&9殇&x&E&5&1&C&9&3科&x&B&C&3&B&B&7技&b机器","&8⇨ &e⚡&7 240000 J 可存储","&8⇨ &e⚡&7 24000 J/s");
        // LENGSHANG_箔澜嫡变机器人
        LSTItemFactory.head("LENGSHANG_箔澜嫡变机器人","1b07902b51625333f0eccee47151adb62e22ec058096eade3d4bb0359463b061","&4&l箔澜嫡变机器人","&7将护身符转化为末影护身符","&x&F&E&3&C&3&C冷&x&F&A&1&6&6&9殇&x&E&5&1&C&9&3科&x&B&C&3&B&B&7技&b机器","&8⇨ &e⚡&7 240000 J 可存储","&8⇨ &e⚡&7 12000 J/s");
        // LENGSHANG_箔澜钓鱼机器人
        LSTItemFactory.head("LENGSHANG_箔澜钓鱼机器人","ec4a74ac2d0ceff89157ad16121b6bcb2b5e5e694b460a27d3b9944f368c17ce","&e&l箔澜钓鱼机器人","&7在时空裂缝中钓鱼","&x&F&E&3&C&3&C冷&x&F&A&1&6&6&9殇&x&E&5&1&C&9&3科&x&B&C&3&B&B&7技&b机器","&8⇨ &e⚡&7 8888 J 可存储","&8⇨ &e⚡&7 2048 J/s");
        // LENGSHANG_箔澜采石机器人
        LSTItemFactory.head("LENGSHANG_箔澜采石机器人","7cf67e255192f908c15e89b0a3b3b5e79baa30cce3259c1a7f510fed4a6cad05","&a&l箔澜采石机器人","&7在宇宙中采集各类石头","&x&F&E&3&C&3&C冷&x&F&A&1&6&6&9殇&x&E&5&1&C&9&3科&x&B&C&3&B&B&7技&b机器","&8⇨ &e⚡&7 240000 J 可存储","&8⇨ &e⚡&7 12000 J/s");
        // LENGSHANG_箔澜采矿机器人
        LSTItemFactory.head("LENGSHANG_箔澜采矿机器人","20696a831207ff7c548afe58fd87a094749b678c2e5eae3cdbe6dca8b50b0dd8","&a&l箔澜采矿机器人","&7在行星间采集矿石","&x&F&E&3&C&3&C冷&x&F&A&1&6&6&9殇&x&E&5&1&C&9&3科&x&B&C&3&B&B&7技&b机器","&8⇨ &e⚡&7 240000 J 可存储","&8⇨ &e⚡&7 12000 J/s");
        // LENGSHANG_箔澜水泵机器人
        LSTItemFactory.head("LENGSHANG_箔澜水泵机器人","4a756cfb1dadd53f9f7aead13c386213387159864babcd023dd0d87ba3c86e59","&a&l箔澜水泵机器人","&7泵出无穷无尽的液体","&x&F&E&3&C&3&C冷&x&F&A&1&6&6&9殇&x&E&5&1&C&9&3科&x&B&C&3&B&B&7技&b机器","&8⇨ &e⚡&7 120000 J 可存储","&8⇨ &e⚡&7 6000 J/s");
        // LENGSHANG_行星采集机器人
        LSTItemFactory.head("LENGSHANG_行星采集机器人","8774e1633d423795eec44f27e4ee8044e523baa619629ea75677389126d19f9b","&d&l行星采集机器人","&7前往外星采集方块并带回地球！","&x&F&E&3&C&3&C冷&x&F&A&1&6&6&9殇&x&E&5&1&C&9&3科&x&B&C&3&B&B&7技&b机器","&8⇨ &e⚡&7 1000 J 可存储","&8⇨ &e⚡&7 100 J/s");
        // LENGSHANG_量化压缩机
        LSTItemFactory.material("LENGSHANG_量化压缩机","SLIME_BLOCK",false,"&x&A&D&D&F&4&E量化压缩机","&7用于压缩乱码科技部分物品","&x&F&E&3&C&3&C冷&x&F&A&1&6&6&9殇&x&E&5&1&C&9&3科&x&B&C&3&B&B&7技&b机器","&8⇨ &e⚡&7 40000 J 可存储","&8⇨ &e⚡&7 2000 J/s");
        // LENGSHANG_量化重塑器
        LSTItemFactory.material("LENGSHANG_量化重塑器","HONEY_BLOCK",false,"&x&A&D&D&F&4&E量化重塑器","&7重塑乱码科技物品！","&x&F&E&3&C&3&C冷&x&F&A&1&6&6&9殇&x&E&5&1&C&9&3科&x&B&C&3&B&B&7技&b机器","&8⇨ &e⚡&7 40000 J 可存储","&8⇨ &e⚡&7 2000 J/s");
        // LENGSHANG_造物主 · 森罗万象
        LSTItemFactory.head("LENGSHANG_造物主 · 森罗万象","94e02beccd55355ebfdc67cdc28312431257b201ddc066e2e424aa18db3b347b","&e&l造物主 &6&l· &a&l森罗万象","&7集中陆地/下界/末地/海洋产物为一体的究极机器","&7涵盖食物/农作物/树木等...名副其实的森罗万象","&7当你拥有了它，你就是MC资源造物主！","&x&F&E&3&C&3&C冷&x&F&A&1&6&6&9殇&x&E&5&1&C&9&3科&x&B&C&3&B&B&7技&b机器","&8⇨ &e⚡&7 50000 J 可存储","&8⇨ &e⚡&7 2560 J/s");
        // LENGSHANG_压缩_造物主 · 森罗万象
        LSTItemFactory.head("LENGSHANG_压缩_造物主 · 森罗万象","94e02beccd55355ebfdc67cdc28312431257b201ddc066e2e424aa18db3b347b","&6&l压缩 · &e&l造物主 &6&l· &a&l森罗万象","&7集中陆地/下界/末地/海洋产物为一体的究极机器","&7涵盖食物/农作物/树木等...名副其实的森罗万象","&7当你拥有了它，你就是MC资源造物主！","&x&F&E&3&C&3&C冷&x&F&A&1&6&6&9殇&x&E&5&1&C&9&3科&x&B&C&3&B&B&7技&b机器","&8⇨ &e⚡&7 500000 J 可存储","&8⇨ &e⚡&7 25600 J/s");
        // LENGSHANG_终极屠宰工厂
        LSTItemFactory.material("LENGSHANG_终极屠宰工厂","STONECUTTER",false,"&x&E&B&3&3&E&B终极屠&x&C&F&2&2&C&F宰&x&B&3&1&1&B&3工&x&9&7&0&0&9&7厂","&7屠宰工厂的终极版本","&7需要插入对应的生物特征运行","&7堆叠效率：64.0","&x&F&E&3&C&3&C冷&x&F&A&1&6&6&9殇&x&E&5&1&C&9&3科&x&B&C&3&B&B&7技&b机器","&8⇨ &e⚡&7 500000 J 可存储","&8⇨ &e⚡&7 100000 J/s");
        // LENGSHANG_永恒冶炼炉
        LSTItemFactory.material("LENGSHANG_永恒冶炼炉","FURNACE",false,"&x&0&F&F&F&F&F永&x&0&F&F&C&C&F恒&x&0&F&F&9&9&F冶&x&0&F&F&6&6&F炼&x&0&F&F&3&3&F炉","&7专门用于生产永恒物品的冶炼炉","&x&F&E&3&C&3&C冷&x&F&A&1&6&6&9殇&x&E&5&1&C&9&3科&x&B&C&3&B&B&7技&b机器","&8⇨ &e⚡&7 36000 J 可存储","&8⇨ &e⚡&7 4800 J/s");
        // LENGSHANG_永恒无尽重置器
        LSTItemFactory.material("LENGSHANG_永恒无尽重置器","LIME_CONCRETE_POWDER",false,"&x&0&F&F&F&F&F永&x&0&F&F&D&D&F恒&x&0&F&F&B&B&F无&x&0&F&F&9&9&F尽&x&0&F&F&7&7&F重&x&0&F&F&5&5&F置&x&0&F&F&3&3&F器","&7重置永恒无尽物品","&x&F&E&3&C&3&C冷&x&F&A&1&6&6&9殇&x&E&5&1&C&9&3科&x&B&C&3&B&B&7技&b机器");
        // LENGSHANG_JYCJQ
        LSTItemFactory.material("LENGSHANG_JYCJQ","GRINDSTONE",false,"&b晶源采集器","&7用于将原版方块浓缩为源晶","&x&F&E&3&C&3&C冷&x&F&A&1&6&6&9殇&x&E&5&1&C&9&3科&x&B&C&3&B&B&7技&b机器","&8⇨ &e⚡&7 50000 J 可存储","&8⇨ &e⚡&7 2500 J/s");
        // LENGSHANG_落木成林
        LSTItemFactory.material("LENGSHANG_落木成林","RED_CONCRETE",false,"&x&3&F&F&0&D&A落&x&7&A&D&C&B&2木&x&B&5&C&7&8&B成&x&F&0&B&3&6&3林","&7一树一苗，落木...成林...","&x&F&E&3&C&3&C冷&x&F&A&1&6&6&9殇&x&E&5&1&C&9&3科&x&B&C&3&B&B&7技&b机器","&8⇨ &e⚡&7 30000 J 可存储","&8⇨ &e⚡&7 512 J/s");
        // LENGSHANG_生生不息
        LSTItemFactory.material("LENGSHANG_生生不息","LIME_CONCRETE",false,"&x&3&F&F&0&D&A生&x&7&A&D&C&B&2生&x&B&5&C&7&8&B不&x&F&0&B&3&6&3息","&7源源不断，生生...不息...","&x&F&E&3&C&3&C冷&x&F&A&1&6&6&9殇&x&E&5&1&C&9&3科&x&B&C&3&B&B&7技&b机器","&8⇨ &e⚡&7 50000 J 可存储","&8⇨ &e⚡&7 1024 J/s");
        // LENGSHANG_造物主编码器
        LSTItemFactory.head("LENGSHANG_造物主编码器","7f7b3c9d906f6b8dae8d441fd4ccefc8d8adf0b198167816268d74619d8a7032","&x&8&0&0&0&F&F造&x&9&0&2&0&D&0物&x&A&0&4&0&B&0主&x&B&0&6&0&9&0编&x&C&0&8&0&7&0码&x&D&0&A&0&5&0器","&6当第一位冒险者在命名牌上写下粘液ID并放入编码器时","&6整个粘液世界的法则都为之震颤——从此，凡知真名者，皆可唤其形");
        // LENGSHANG_堆叠乱码核心
        LSTItemFactory.material("LENGSHANG_堆叠乱码核心","GLOWSTONE",false,"&x&F&F&0&0&0&0堆&x&F&F&A&5&0&0叠&x&F&F&D&7&0&0乱&x&0&F&F&0&0&0码&x&0&0&F&F&F&F核&x&8&B&0&0&F&F心","&7堆叠乱码核心需要放在堆叠乱码生成器上面进行检测","&c服务器重启会导致状态重置，重启后需重新点击检测","&6网络量子存储支持光暗生成器和规则光暗生成器与永恒矿机","&6产物存储支持存有光或暗与永恒粒子的网络量子存储","&e生产的物品会直接进入右侧产物的网络量子存储里");
        // LENGSHANG_堆叠乱码生成器
        LSTItemFactory.material("LENGSHANG_堆叠乱码生成器","red_terracotta",false,"&x&F&F&0&0&0&0堆&x&F&F&A&5&0&0叠&x&F&F&D&7&0&0乱&x&0&F&F&0&0&0码&x&0&0&F&F&F&F生&x&8&B&0&0&F&F成&x&6&6&9&9&F&F器","&7堆叠乱码生成器需要放在堆叠乱码核心下面搭配使用","&6左侧输入槽需要放置纠缠量子镐","&6中间输入槽需要放置放有乱码机器的网络量子存储","&6右侧输入槽需要放置放有乱码产物的网络量子存储","&e点击检测并放置了纠缠量子镐后开始运行","&c乱码机器支持列表为：&x&6&F&F&E&F&6光&x&6&F&F&E&F&6暗&x&8&8&F&D&E&E生&x&A&2&F&C&E&5成&x&B&B&F&B&D&D器、&x&4&E&D&E&D&8规&x&4&7&D&F&D&6则&x&3&F&D&F&D&5光&x&3&9&D&C&B&E暗&x&3&4&D&8&A&2生&x&2&E&D&4&8&6成&x&4&E&D&E&D&8器、&x&8&3&D&B&E&4永&x&8&6&C&C&E&6恒&x&8&8&B&E&E&8矿&x&8&A&A&F&E&A机","&c乱码产物支持列表为：&f光、&8暗、&x&B&9&F&2&4&E永&x&B&0&F&2&6&5恒&x&A&7&F&2&7&C粒&x&9&E&F&2&9&3子");
        // LENGSHANG_快捷序列化构造机
        LSTItemFactory.material("LENGSHANG_快捷序列化构造机","AMETHYST_BLOCK",false,"&x&F&F&0&0&0&0快&x&F&F&A&5&0&0捷&x&F&F&D&7&0&0序&x&0&F&F&0&0&0列&x&0&0&F&F&F&F化&x&8&B&0&0&F&F构&x&6&6&9&9&F&F造&x&9&9&6&6&F&F机","&6左侧输入槽放入带有物品数量的网络量子存储","&e点击合成消耗16777216个物品合成这个物品的复制卡");
        // LENGSHANG_星际装配台
        LSTItemFactory.material("LENGSHANG_星际装配台","SMITHING_TABLE",false,"&6&l星际装配台","&7建造各种星际物品","&x&F&E&3&C&3&C冷&x&F&A&1&6&6&9殇&x&E&5&1&C&9&3科&x&B&C&3&B&B&7技&b机器","&8⇨&e ⚡ &7 2000000 J 可存储","&8⇨&e ⚡ &7 100000  J/每个物品");
        // LENGSHANG_永恒奇点构造机
        LSTItemFactory.material("LENGSHANG_永恒奇点构造机","QUARTZ_BRICKS",false,"&x&0&F&F&F&F&F永&x&0&F&F&C&C&F恒&x&0&F&F&9&9&F奇&x&0&F&F&6&6&F点&x&0&F&F&3&3&F构&x&0&F&F&0&0&F造&x&0&C&C&0&0&F机","&7用于制造特殊永恒无尽奇点","&x&F&E&3&C&3&C冷&x&F&A&1&6&6&9殇&x&E&5&1&C&9&3科&x&B&C&3&B&B&7技&b机器","&8⇨&e ⚡ &7 200000 J 可存储","&8⇨&e ⚡ &7 2400  J/每个物品");
        // LENGSHANG_概念序列模拟器
        LSTItemFactory.material("LENGSHANG_概念序列模拟器","BAMBOO_MOSAIC",false,"&x&E&B&3&3&E&B概&x&D&D&2&B&D&D念&x&C&F&2&2&C&F序&x&C&1&1&A&C&1列&x&B&3&1&1&B&3模&x&A&5&0&9&A&5拟&x&9&7&0&0&9&7器","&7模拟概念序列化的工作逻辑","&7总算不用卡进度消耗材料了！？","&x&F&E&3&C&3&C冷&x&F&A&1&6&6&9殇&x&E&5&1&C&9&3科&x&B&C&3&B&B&7技&b机器","&8⇨&e ⚡ &7 114514 J 可存储","&8⇨&e ⚡ &7 5120  J/每个物品");
        // LENGSHANG_终极概念模拟器
        LSTItemFactory.material("LENGSHANG_终极概念模拟器","STRIPPED_BAMBOO_BLOCK",false,"&x&E&B&3&3&E&B终&x&D&D&2&B&D&D极&x&C&F&2&2&C&F概&x&C&1&1&A&C&1念&x&B&3&1&1&B&3模&x&A&5&0&9&A&5拟&x&9&7&0&0&9&7器","&7模拟终极概念凝聚者的工作逻辑","&7也许...总算可以自动化终极逻辑框架了吧?...","&x&F&E&3&C&3&C冷&x&F&A&1&6&6&9殇&x&E&5&1&C&9&3科&x&B&C&3&B&B&7技&b机器","&8⇨&e ⚡ &7 114514 J 可存储","&8⇨&e ⚡ &7 20480  J/每个物品");
        // LENGSHANG_终焉工作台
        LSTItemFactory.head("LENGSHANG_终焉工作台","34fec5cdc2e22401a4b5ba376ffe647279ed3f94fd75f8056d986f33c931ac55","&x&F&F&0&0&0&0终&x&F&F&A&5&0&0焉&x&F&F&D&7&0&0工&x&0&F&F&0&0&0作&x&0&F&F&F&F&F台","&x&F&F&0&0&0&0冷&x&F&F&A&5&0&0殇&x&F&F&D&7&0&0科&x&0&F&F&0&0&0技&x&0&0&F&F&F&F的&x&8&B&0&0&F&F终&x&6&6&9&9&F&F点&x&9&9&6&6&F&F站...","&8⇨ &e⚡&7 1000000000 J 可存储","&8⇨ &e⚡&7 100000000 J/物品");
        // LENGSHANG_永恒无尽工作台
        LSTItemFactory.material("LENGSHANG_永恒无尽工作台","RESPAWN_ANCHOR",false,"&x&0&F&F&F&F&F永&x&0&F&F&C&C&F恒&x&0&F&F&9&9&F无&x&0&F&F&6&6&F尽&x&0&F&F&3&3&F工&x&0&F&F&0&0&F作&x&0&C&C&0&0&F台","&7用于制造永恒无尽物品","&x&F&E&3&C&3&C冷&x&F&A&1&6&6&9殇&x&E&5&1&C&9&3科&x&B&C&3&B&B&7技&b机器","&8⇨ &e⚡&7 1000000 J 可存储","&8⇨ &e⚡&7 100000 J/物品");
        // LENGSHANG_M87JJDR
        LSTItemFactory.head("LENGSHANG_M87JJDR","91361e576b493cbfdfae328661cedd1add55fab4e5eb418b92cebf6275f8bb4","&x&F&4&A&4&6&0M87电容","&7无尽的吞噬即是黑洞之力！","&e电容","&8⇨ &e⚡&7 2,100,000,000 J 可存储");
        // LENGSHANG_箔澜电容
        LSTItemFactory.head("LENGSHANG_箔澜电容","91361e576b493cbfdfae328661cedd1add55fab4e5eb418b92cebf6275f8bb4","&9&l箔澜电容","&7箔澜星常用电容","&7","&e电容","&8⇨ &e⚡&7 29079 J 可存储");
        // LENGSHANG_M87FDJ
        LSTItemFactory.material("LENGSHANG_M87FDJ","ORANGE_GLAZED_TERRACOTTA",false,"&x&F&4&A&4&6&0M87发电机","&7黑洞吞噬陨石从而产生大量能量！","&b一块陨石可发电365天，只需一秒就能给你把电整满","&c注: 搭配M87电容会因为存储极限重置，但机器不受任何影响，只会持续消耗陨石发电时间","&a发电机","&8⇨ &e⚡&7 2,000,000,000 J 可存储","&8⇨ &e⚡&7 800,000,000 J/s");
        // LENGSHANG_ys_WJTL_XKFDJ
        LSTItemFactory.material("LENGSHANG_ys_WJTL_XKFDJ","LIGHT_GRAY_GLAZED_TERRACOTTA",false,"&6&l压缩 · &8虚空发电机","&7利用暗能量发电","&a发电机","&8⇨ &e⚡&7 20000000 J 可储存","&8⇨ &e⚡&7 400000 J/s");
        // LENGSHANG_ys_WJTL_WJFDJ
        LSTItemFactory.material("LENGSHANG_ys_WJTL_WJFDJ","LIGHT_BLUE_GLAZED_TERRACOTTA",false,"&6&l压缩 · &b无尽发电机","&7利用宇宙能量发电","&a发电机","&8⇨ &e⚡&7 400000000 J 可储存","&8⇨ &e⚡&7 8000000 J/s");
        // LENGSHANG_FDJ_LZRYFDJ
        LSTItemFactory.head("LENGSHANG_FDJ_LZRYFDJ","51d59eabc38b2538efa40d52be61d30a32e369e7b519e88db015a52e66111019","&6&l量子熔岩发电机","&7利用量子技术高效转化熔岩能量","&a发电机","&8⇨ &e⚡&7 50000 J 可存储","&8⇨ &e⚡&7 800 J/s");
        // LENGSHANG_FDJ_LXNLHX
        LSTItemFactory.head("LENGSHANG_FDJ_LXNLHX","a1cd6d2d03f135e7c6b5d6cdae1b3a68743db4eb749faf7341e9fb347aa283b","&5&l龙息能量核心","&7利用末影龙的气息产生神秘能量","&a发电机","&8⇨ &e⚡&7 150000 J 可存储","&8⇨ &e⚡&7 2500 J/s");
        // LENGSHANG_FDJ_SJLFFDJ
        LSTItemFactory.head("LENGSHANG_FDJ_SJLFFDJ","63a405fb286dbb32e9b3908f60948f0207306c825e63ac9e626ed1dbb2f7a2be","&3&l时间裂缝发电机","&7从时间的裂缝中汲取无限能量","&a发电机","&8⇨ &e⚡&7 500000 J 可存储","&8⇨ &e⚡&7 5000 J/s");
        // LENGSHANG_聚变反应堆
        LSTItemFactory.headBase64("LENGSHANG_聚变反应堆","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTExZWQxZDFiMjViNjI0NjY1ZWNkZGRjM2QzYTVkZmYwYjlmMzVlM2RlNzdhMTJmNTE2ZTYwZmU4NTAxY2M4ZCJ9fX0=","&5聚变反应堆","&7通过燃烧聚变燃料产生大量能量","&a发电机","&8⇨ &e⚡&7 10000000 J 可存储","&8⇨ &e⚡&7 655360 J/s");
        // LENGSHANG_开普勒星云树
        LSTItemFactory.head("LENGSHANG_开普勒星云树","f12a3efc96bb7a0b291f373719ad2e56ead4e895ef9cf6da6d7aca9eefad73cd","&d&l开普勒星云树","&7无垠宇宙中的烟火","&a发电机","&8⇨ &e⚡&7 66666 J 可存储","&8⇨ &e⚡&7 9666 J/s");
        // LENGSHANG_次元内核
        LSTItemFactory.head("LENGSHANG_次元内核","200c16738c372484628ca15cf7b0731b810bd3142e07c1053b5e3da6b6e523ca","&9&l次元内核","&7第一次接近宇宙核心","&a发电机","&8⇨ &e⚡&7 48888888 J 可存储","&8⇨ &e⚡&7 666666 J/s");
        // LENGSHANG_YGFDXRK
        LSTItemFactory.material("LENGSHANG_YGFDXRK","DANDELION",false,"&e&l阳光发电小向日葵","&7一朵能够吸收阳光来发电的小向日葵","&e太阳能发电机","&8⇨ &e⚡&7 24 J/s (昼)","&8⇨ &e⚡&7 4 J/s (夜)");
        // LENGSHANG_HSFDJ
        LSTItemFactory.head("LENGSHANG_HSFDJ","c102bf7741c3e5c7f3ac460871943b37ac7da975b3b4b3bd02c2a37f0aacfb68","&c火山发电机","&b吸收阳光发电","&e太阳能发电机","&8⇨ &e⚡&7 36 J/s (昼)","&8⇨ &e⚡&7 8 J/s (夜)");
        // LENGSHANG_XXFDJ
        LSTItemFactory.head("LENGSHANG_XXFDJ","dbf93fbc29c9ed6d669750f4672bc2fab39e7cf043e47366a014c8aaf26dbdf8","&e星星发电机","&b吸收夜光发电","&e太阳能发电机","&8⇨ &e⚡&7 8 J/s (昼)","&8⇨ &e⚡&7 36 J/s (夜)");
    }

    public static void register(LengShangEvo plugin) {
    }

    private LSTItems2() {
    }
}
