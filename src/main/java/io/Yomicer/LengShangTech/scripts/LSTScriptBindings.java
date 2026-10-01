package io.Yomicer.LengShangTech.scripts;

import io.Yomicer.LengShangTech.gen.LSTGroups;
import io.Yomicer.LengShangTech.core.LSTItemFactory;
import io.Yomicer.LengShangTech.core.LSTReg;
import io.Yomicer.LengShangTech.scripts.effects.CleanerEffects;
import io.Yomicer.LengShangTech.scripts.effects.LSTEffectLib;
import io.Yomicer.LengShangTech.scripts.effects.LSTShopMenu;
import io.Yomicer.LengShangTech.scripts.effects.LuckyBlocks;
import io.Yomicer.LengShangTech.scripts.effects.MiscEffects;
import io.Yomicer.LengShangTech.scripts.effects.QuoteService;
import io.Yomicer.LengShangTech.scripts.effects.WeaponEffects;
import io.Yomicer.LengShangTech.scripts.listeners.LSTBowSkillListener;
import io.Yomicer.LengShangTech.scripts.listeners.LSTHitEffectListener;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.Rechargeable;
import io.github.thebusybiscuit.slimefun4.implementation.Slimefun;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 冷殇脚本效果绑定 (scripts/*.js → Java): script 路径 → 右键动作。
 */
public final class LSTScriptBindings {

    private static final Map<String, LSTItemAction> ACTIONS = new HashMap<>();
    private static final Map<String, LSTActionItem> SCRIPT_ITEMS = new HashMap<>();
    private static boolean listenersRegistered;

    private LSTScriptBindings() {
    }

    static {
        // ===== 命中类 (onWeaponHit) =====
        // (由 LSTHitEffectListener 处理, 见 registerListeners)

        // ===== 命中类 (onWeaponHit, 由 LSTHitEffectListener 处理, 右键无效果) =====
        ACTIONS.put("道具/德古拉之吻", noAction());
        ACTIONS.put("道具/破军", noAction());
        ACTIONS.put("道具/天罚之刃", noAction());

        // ===== 道具 =====
        ACTIONS.put("道具/天命盲盒", blindBox());
        ACTIONS.put("道具/便携式复刻坤", cooldown(MiscEffects.cloneAimed(1), 1000));
        ACTIONS.put("道具/便携式复刻坤2", cooldown(MiscEffects.cloneAimed(64), 1000));
        ACTIONS.put("道具/卸甲令", MiscEffects.UNARM);
        ACTIONS.put("道具/呼风符", MiscEffects.weather("clear"));
        ACTIONS.put("道具/唤雨符", MiscEffects.weather("rain"));
        ACTIONS.put("道具/唤雷符", MiscEffects.weather("thunder"));
        ACTIONS.put("道具/幸运四叶草", MiscEffects.CLOVER);
        ACTIONS.put("道具/巨人刷怪蛋", MiscEffects.GIANT_EGG);
        ACTIONS.put("道具/经验作弊器", MiscEffects.XP_CHEAT);
        ACTIONS.put("道具/经验存储器", MiscEffects.XP_STORE);
        ACTIONS.put("道具/命运之轮", MiscEffects.WHEEL);
        ACTIONS.put("道具/粘液全解", MiscEffects.SF_ALL);
        ACTIONS.put("道具/诅咒消除令", MiscEffects.CURSE);
        ACTIONS.put("道具/智能充电器", MiscEffects.CHARGER);
        ACTIONS.put("道具/幻穹瞬闪", cooldown(MiscEffects.BLINK, 5000));
        ACTIONS.put("道具/全息文字清除器", cooldown(MiscEffects.HOLO_CLEAR, 1500));
        ACTIONS.put("道具/附魔提取器", MiscEffects.ENCH_EXTRACT);
        ACTIONS.put("道具/配方拆解器", uncraft());
        ACTIONS.put("道具/堆叠乱码核心", MiscEffects.UNSUPPORTED);
        ACTIONS.put("道具/堆叠乱码生成器", MiscEffects.UNSUPPORTED);
        ACTIONS.put("道具/快捷序列化构造机", MiscEffects.UNSUPPORTED);
        ACTIONS.put("道具/聚宝阁", openShop());

        // 语录
        ACTIONS.put("道具/EMO文案", QuoteService.of("https://api.4qb.cn/api/emowenan"));
        ACTIONS.put("道具/伤感语录", QuoteService.of("https://api.yuafeng.cn/API/ly/shanggan.php"));
        ACTIONS.put("道具/舔狗语录", QuoteService.of("https://openapi.dwo.cc/api/tdog"));
        ACTIONS.put("道具/随机一言", QuoteService.of("https://openapi.dwo.cc/api/yi"));

        // ===== 武器 =====
        ACTIONS.put("武器/修罗·戮世魔剑", cooldown(WeaponEffects.XL_LSMJ, 1000));
        ACTIONS.put("武器/修罗·断魂战斧", cooldown(WeaponEffects.XL_DHZF, 600));
        ACTIONS.put("武器/修罗·破界神镐", WeaponEffects.XL_PJSG);
        ACTIONS.put("武器/修罗·移山灵锹", WeaponEffects.XL_YSLQ);
        ACTIONS.put("武器/幽影裂空", WeaponEffects.YYLK);
        ACTIONS.put("武器/幽荧噬界", WeaponEffects.YYSJ);
        ACTIONS.put("武器/极昼耀斑", WeaponEffects.JZYB);
        ACTIONS.put("武器/海神·黄金三叉戟", WeaponEffects.HSSCJ);
        ACTIONS.put("武器/玄冥庇护", WeaponEffects.XMBH);
        ACTIONS.put("武器/瑶光祝福", WeaponEffects.YGZF);
        ACTIONS.put("武器/破军千刃", WeaponEffects.PJQR);
        ACTIONS.put("武器/紫电青霜", WeaponEffects.ZDQS);
        ACTIONS.put("武器/赤霄援护", WeaponEffects.CXFT);
        ACTIONS.put("武器/赤霄焚天", WeaponEffects.CXFT_CONE);
        ACTIONS.put("武器/霜烬战锤", WeaponEffects.SJZC);
        ACTIONS.put("武器/青冥裂空", WeaponEffects.QMLK);
        ACTIONS.put("武器/青鸾鸣奏1.21", WeaponEffects.QYMZ);
        ACTIONS.put("武器/寂灭·生息骤断", noAction()); // onWeaponHit 效果

        // ===== 永恒无尽 =====
        ACTIONS.put("永恒无尽/寰宇肉丸", food("hyrw"));
        ACTIONS.put("永恒无尽/超级煲", food("cjb"));
        ACTIONS.put("永恒无尽/终望珍珠", WeaponEffects.ZWZZ);
        ACTIONS.put("永恒无尽/寰宇支配之剑", WeaponEffects.HYZPZJ);
        ACTIONS.put("永恒无尽/自然荒芜之斧", WeaponEffects.ZRHWZF);
        ACTIONS.put("永恒无尽/星球吞噬之铲", WeaponEffects.XQTSZC);
        ACTIONS.put("永恒无尽/世界崩解之镐", WeaponEffects.SJBJZG);
        ACTIONS.put("永恒无尽/地蕴复生之锄", WeaponEffects.DYFSZC);
        ACTIONS.put("永恒无尽/九霄惊雷之锤", WeaponEffects.JXJLZC);
        ACTIONS.put("永恒无尽/远海鲸吞之桶", WeaponEffects.YJHTZT);

        // ===== 清除器 =====
        ACTIONS.put("清除器/怪物清除器", CleanerEffects.MONSTER);
        ACTIONS.put("清除器/僵尸清除器", CleanerEffects.ZOMBIE);
        ACTIONS.put("清除器/骷髅清除器", CleanerEffects.SKELETON);
        ACTIONS.put("清除器/苦力怕清除器", CleanerEffects.CREEPER);
        ACTIONS.put("清除器/蜘蛛清除器", CleanerEffects.SPIDER);
        ACTIONS.put("清除器/末影人清除器", CleanerEffects.ENDERMAN);
        ACTIONS.put("清除器/僵尸猪灵清除器", CleanerEffects.PIGLIN);
        ACTIONS.put("清除器/史莱姆清除器", CleanerEffects.SLIME);
        ACTIONS.put("清除器/幻翼清除器", CleanerEffects.PHANTOM);
        ACTIONS.put("清除器/投影方块清除器", CleanerEffects.DISPLAY);
        ACTIONS.put("清除器/掉落物清除器", CleanerEffects.DROPPED_ITEMS);

        // ===== 幸运方块 =====
        List<String> luckySet = List.of(
                "LENGSHANG_幸运头盔", "LENGSHANG_幸运胸甲", "LENGSHANG_幸运护腿", "LENGSHANG_幸运靴子",
                "LENGSHANG_幸运剑", "LENGSHANG_幸运镐", "LENGSHANG_幸运斧", "LENGSHANG_幸运铲");
        List<String> endlessSet1 = List.of("LENGSHANG_永恒无尽锭", "LENGSHANG_钻石晶格", "LENGSHANG_水晶矩阵锭");
        ACTIONS.put("幸运方块/幸运方块", LuckyBlocks.action(p -> LuckyBlocks.basic(luckySet)));
        ACTIONS.put("幸运方块/粘液幸运方块", LuckyBlocks.action(p -> LuckyBlocks.slime(luckySet)));
        ACTIONS.put("幸运方块/花朵幸运方块", LuckyBlocks.action(p -> LuckyBlocks.flower()));
        ACTIONS.put("幸运方块/矿物幸运方块", LuckyBlocks.action(p -> LuckyBlocks.ore()));
        ACTIONS.put("幸运方块/树木幸运方块", LuckyBlocks.action(p -> LuckyBlocks.wood()));
        ACTIONS.put("幸运方块/逻辑幸运方块", LuckyBlocks.action(p -> LuckyBlocks.logic(luckySet)));
        ACTIONS.put("幸运方块/初阶无尽幸运方块", LuckyBlocks.action(p -> LuckyBlocks.endlessBasic(endlessSet1)));
        ACTIONS.put("幸运方块/高阶无尽幸运方块", LuckyBlocks.action(p -> LuckyBlocks.endlessAdvanced(endlessSet1)));

        // 命中效果注册表
        LSTHitEffectListener.register("LENGSHANG_德古拉之吻", LSTHitEffectListener.HitEffect.LIFESTEAL);
        LSTHitEffectListener.register("LENGSHANG_破军", LSTHitEffectListener.HitEffect.DOUBLE_DAMAGE);
        LSTHitEffectListener.register("LENGSHANG_天罚之刃", LSTHitEffectListener.HitEffect.LIGHTNING);
        LSTHitEffectListener.register("LENGSHANG_JM_SXZD", LSTHitEffectListener.HitEffect.INSTAKILL_PLAYER);
        LSTHitEffectListener.register("LENGSHANG_九霄惊雷之锤", LSTHitEffectListener.HitEffect.STORM_BONUS);

        // 弓技能
        LSTBowSkillListener.register("LENGSHANG_天堂陨落长弓", LSTBowSkillListener.BowSkill.ARROW_RAIN);
        LSTBowSkillListener.register("LENGSHANG_重箭王", LSTBowSkillListener.BowSkill.HEAVY_ARROWS);
        LSTBowSkillListener.register("LENGSHANG_修罗·灭世神弓", LSTBowSkillListener.BowSkill.THUNDER_BOW);
    }

    private static LSTItemAction cooldown(LSTItemAction action, long millis) {
        // 每个被包裹的道具用独立冷却键 (identityHashCode), 避免所有道具共用一个键互相顶掉; 冷却中提示剩余时间
        String key = "cd_" + System.identityHashCode(action);
        return (player, item) -> {
            if (LSTEffectLib.onCooldownNotify(player, key, millis)) {
                return false;
            }
            return action.run(player, item);
        };
    }

    private static LSTItemAction noAction() {
        return (player, item) -> false;
    }

    /** 天命盲盒: 49 档加权抽取 (普通45/良好28/史诗15/传奇10/传说2, 总权重100)。 */
    private static LSTItemAction blindBox() {
        return (player, item) -> {
            double roll = java.util.concurrent.ThreadLocalRandom.current().nextDouble(100);
            int index;
            if (roll < 45) { // 普通
                index = 1 + java.util.concurrent.ThreadLocalRandom.current().nextInt(12);
            } else if (roll < 73) { // 良好
                index = 13 + java.util.concurrent.ThreadLocalRandom.current().nextInt(12);
            } else if (roll < 88) { // 史诗
                index = 25 + java.util.concurrent.ThreadLocalRandom.current().nextInt(12);
            } else if (roll < 98) { // 传奇
                index = 37 + java.util.concurrent.ThreadLocalRandom.current().nextInt(8);
            } else { // 传说
                index = 45 + java.util.concurrent.ThreadLocalRandom.current().nextInt(5);
            }
            String targetId = "LENGSHANG_TMMH_" + index;
            ItemStack reward = LSTReg.lst(targetId, 1);
            if (reward == null) {
                player.sendMessage("§c盲盒奖励暂时无法发放!");
                return false;
            }
            player.getInventory().addItem(reward).values()
                    .forEach(rest -> player.getWorld().dropItemNaturally(player.getLocation(), rest));
            player.sendMessage("§6§l天命盲盒开启了!");
            LSTEffectLib.sound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1f, 1.3f);
            item.setAmount(item.getAmount() - 1); // 开盒消耗 1 个
            return true;
        };
    }

    /** 食物效果: 寰宇肉丸 / 超级煲。 */
    private static LSTItemAction food(String kind) {
        return (player, item) -> {
            player.setFoodLevel(20);
            player.setSaturation(20);
            if ("hyrw".equals(kind)) {
                apply(player, PotionEffectType.DAMAGE_RESISTANCE, 1, 60);
                apply(player, PotionEffectType.WATER_BREATHING, 2, 120);
                apply(player, PotionEffectType.ABSORPTION, 2, 180);
                apply(player, PotionEffectType.NIGHT_VISION, 0, 180);
                apply(player, PotionEffectType.REGENERATION, 4, 300);
                apply(player, PotionEffectType.FIRE_RESISTANCE, 0, 300);
            } else {
                apply(player, PotionEffectType.SPEED, 2, 180);
                apply(player, PotionEffectType.FAST_DIGGING, 2, 180);
                apply(player, PotionEffectType.JUMP, 2, 180);
                apply(player, PotionEffectType.INCREASE_DAMAGE, 4, 300);
            }
            player.getWorld().spawnParticle(Particle.HEART, player.getLocation().add(0, 2, 0), 8, 0.4, 0.4, 0.4, 0);
            return true;
        };
    }

    private static void apply(Player player, PotionEffectType type, int amplifier, int seconds) {
        player.addPotionEffect(new PotionEffect(type, seconds * 20, amplifier));
    }

    /** 配方拆解器: 退回副手粘液物品的工作台原料 (一次性: 用后消耗自身)。 */
    private static LSTItemAction uncraft() {
        return (player, item) -> {
            ItemStack off = player.getInventory().getItemInOffHand();
            SlimefunItem sfItem = SlimefunItem.getByItem(off);
            if (sfItem == null) {
                player.sendMessage("§c请把要拆解的粘液物品放在副手!");
                return false;
            }
            ItemStack[] recipe = sfItem.getRecipe();
            if (recipe == null) {
                player.sendMessage("§c该物品没有可拆解的配方!");
                return false;
            }
            // 消耗副手一份产物 (通常 1 个), 而不是清空整叠
            int outputAmount = 1;
            try {
                ItemStack recipeOutput = sfItem.getRecipeOutput();
                if (recipeOutput != null && recipeOutput.getAmount() > 0) {
                    outputAmount = recipeOutput.getAmount();
                }
            } catch (Throwable ignored) {
            }
            if (off.getAmount() < outputAmount) {
                player.sendMessage("§c副手物品数量不足以拆解!");
                return false;
            }
            int returned = 0;
            for (ItemStack ingredient : recipe) {
                if (ingredient != null && !ingredient.getType().isAir()) {
                    ItemStack give = ingredient.clone();
                    give.setAmount(1);
                    player.getInventory().addItem(give).values()
                            .forEach(rest -> player.getWorld().dropItemNaturally(player.getLocation(), rest));
                    returned++;
                }
            }
            if (returned > 0) {
                off.setAmount(off.getAmount() - outputAmount); // 只消耗一份产物
                player.sendMessage("§a拆解成功, 退回 " + returned + " 格原料");
                item.setAmount(item.getAmount() - 1); // 拆解器一次性
            }
            return false;
        };
    }

    /** 聚宝阁入口。 */
    private static LSTItemAction openShop() {
        return (player, item) -> {
            LSTShopMenu.open(player);
            return false;
        };
    }

    /** 由生成代码调用: 注册一个脚本道具 (无配方重载)。 */
    public static void registerItem(io.Yomicer.LengShangTech.LengShangEvo plugin, String id, String script,
                                    ItemGroup group, SlimefunItemStack item) {
        registerItem(plugin, id, script, group, item, RecipeType.NULL, LSTScriptBridge.NO_RECIPE);
    }

    /** 由生成代码调用: 注册一个脚本道具, 带 RSC 的合成方式与配方 (指南可查获取途径)。 */
    public static void registerItem(io.Yomicer.LengShangTech.LengShangEvo plugin, String id, String script,
                                    ItemGroup group, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        String actionKey = script.startsWith("script ") ? script.substring("script ".length()).trim() : script.trim();
        LSTItemAction action = ACTIONS.get(actionKey);
        if (action == null) {
            io.Yomicer.LengShangTech.utils.LSTLog.info("脚本效果缺失, 使用占位: " + script);
            action = (LSTItemAction) ACTIONS.getOrDefault("道具/聚宝阁", MiscEffects.UNSUPPORTED);
        }
        LSTActionItem registered = new LSTActionItem(group, item,
                recipeType == null ? RecipeType.NULL : recipeType,
                recipe == null ? LSTScriptBridge.NO_RECIPE : recipe,
                0, false, action.needsProtectionCheck(), action);
        registered.register(plugin);
        SCRIPT_ITEMS.put(id, registered);
    }

    /** 注册指南组别按钮 (聚宝阁/语录)。 */
    public static void registerGuideButtons(io.Yomicer.LengShangTech.LengShangEvo plugin) {
        shopButton(plugin);
        button(plugin, "LENGSHANG_BTN_TGYL", LSTGroups.TGYL, "舔狗语录", QuoteService.of("https://openapi.dwo.cc/api/tdog"), false);
        button(plugin, "LENGSHANG_BTN_SJYY", LSTGroups.SJYY, "随机一言", QuoteService.of("https://openapi.dwo.cc/api/yi"), false);
        button(plugin, "LENGSHANG_BTN_EMO", LSTGroups.G29, "emo文案", QuoteService.of("https://api.4qb.cn/api/emowenan"), false);
        button(plugin, "LENGSHANG_BTN_SG", LSTGroups.G35, "伤感语录", QuoteService.of("https://api.yuafeng.cn/API/ly/shanggan.php"), false);
    }

    /**
     * 聚宝阁入口按钮: 不再点击物品本身直接开店 (那会让指南历史停留在空配方页)。
     * 改为点击物品进入其配方页 (合成方式 NULL), 配方中心格放一个"打开聚宝阁"图标,
     * 点击该图标才打开聚宝阁 —— 关闭聚宝阁后回到配方页仍可再次点击开店。
     */
    private static void shopButton(io.Yomicer.LengShangTech.LengShangEvo plugin) {
        try {
            SlimefunItemStack stack = LSTItemFactory.material("LENGSHANG_BTN_JBG", "BOOK", false,
                    "&x&F&E&3&C&3&C冷&x&F&A&1&6&6&9殇&x&E&5&1&C&9&3科&x&B&C&3&B&B&7技 · ❀ 聚宝阁 ❀");
            ItemStack[] recipe = new ItemStack[9];
            recipe[4] = LSTShopMenu.openIcon();
            new LSTActionItem(LSTGroups.SD, stack, RecipeType.NULL, recipe, 0, false, false, false, noAction())
                    .register(plugin);
        } catch (Throwable t) {
            io.Yomicer.LengShangTech.utils.LSTLog.warn("注册聚宝阁按钮失败: " + t.getMessage());
        }
    }

    private static void button(io.Yomicer.LengShangTech.LengShangEvo plugin, String id, ItemGroup group,
                               String label, LSTItemAction action, boolean glow) {
        try {
            SlimefunItemStack stack = LSTItemFactory.material(id, "BOOK", glow,
                    "&x&F&E&3&C&3&C冷&x&F&A&1&6&6&9殇&x&E&5&1&C&9&3科&x&B&C&3&B&B&7技 · " + label);
            new LSTActionItem(group, stack, RecipeType.NULL, LSTScriptBridge.NO_RECIPE, 1500, false, false, true, action).register(plugin);
        } catch (Throwable t) {
            io.Yomicer.LengShangTech.utils.LSTLog.warn("注册指南按钮失败: " + id + " - " + t.getMessage());
        }
    }

    /** 注册事件监听器 (主插件 onEnable 调用一次)。 */
    public static void registerListeners(io.Yomicer.LengShangTech.LengShangEvo plugin) {
        if (listenersRegistered) {
            return;
        }
        listenersRegistered = true;
        plugin.getServer().getPluginManager().registerEvents(new LSTItemUseListener(), plugin);
        plugin.getServer().getPluginManager().registerEvents(new LSTHitEffectListener(), plugin);
        plugin.getServer().getPluginManager().registerEvents(new LSTBowSkillListener(), plugin);
        plugin.getServer().getPluginManager().registerEvents(new LSTShopMenu(), plugin);
        plugin.getServer().getPluginManager().registerEvents(new io.Yomicer.LengShangTech.machines.LSTRecipeBook(), plugin);
        plugin.getServer().getPluginManager().registerEvents(new LSTBlockDrops(), plugin);
        plugin.getServer().getPluginManager().registerEvents(new LSTMobDropListener(), plugin);
        plugin.getServer().getPluginManager().registerEvents(
                io.Yomicer.LengShangTech.scripts.effects.LSTChatInput.create(), plugin);
    }
}
