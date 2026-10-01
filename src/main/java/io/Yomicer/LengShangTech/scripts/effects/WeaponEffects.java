package io.Yomicer.LengShangTech.scripts.effects;

import io.Yomicer.LengShangTech.scripts.LSTItemAction;
import io.Yomicer.LengShangTech.scripts.SlimefunProtection;
import me.mrCookieSlime.Slimefun.api.BlockStorage;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.data.Ageable;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.entity.WindCharge;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.util.Vector;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * 武器/工具右键技能 (scripts/武器 与 scripts/永恒无尽 的 JS 效果)。
 * 冷却与循环节奏按原脚本数值。
 */
public final class WeaponEffects {

    private WeaponEffects() {
    }

    /** 循环技能索引 */
    private static final Map<String, Integer> CYCLE = new HashMap<>();
    /** 移山灵锹的临时墙 */
    private static final Map<UUID, List<Block>> WALLS = new HashMap<>();

    private static int nextCycle(Player player, String key, int size) {
        int idx = CYCLE.merge(player.getUniqueId() + "|" + key, 1, Integer::sum) - 1;
        return idx % size;
    }

    // ===== 修罗系列 =====

    /** 修罗·戮世魔剑: 15 格内全部活体即死。 */
    public static final LSTItemAction XL_LSMJ = (player, item) -> {
        if (LSTEffectLib.onCooldown(player, "xl_lsmj", 1000)) return false;
        List<LivingEntity> targets = LSTEffectLib.nearbyLiving(player, 15);
        for (LivingEntity target : targets) {
            target.setHealth(0);
        }
        Location loc = player.getLocation();
        LSTEffectLib.sound(loc, Sound.ENTITY_WITHER_DEATH, 0.6f, 1.4f);
        LSTEffectLib.particles(loc, Particle.SMOKE_NORMAL, 40, 1.5);
        return false;
    };

    /** 修罗·断魂战斧: 5 格射线, 血量≤10000 即死否则 10000 真伤。 */
    public static final LSTItemAction XL_DHZF = (player, item) -> {
        if (LSTEffectLib.onCooldown(player, "xl_dhzf", 600)) return false;
        LivingEntity target = LSTEffectLib.lookTarget(player, 5);
        if (target == null) return false;
        if (target.getHealth() <= 10000) {
            target.setHealth(0);
        } else {
            LSTEffectLib.damageTrue(target, player, 10000);
        }
        LSTEffectLib.particles(target.getLocation(), Particle.CRIT, 20, 0.5);
        return false;
    };

    /** 修罗·破界神镐: 3x3x3 范围瞬间破坏。 */
    public static final LSTItemAction XL_PJSG = (player, item) -> {
        if (LSTEffectLib.onCooldown(player, "xl_pjsg", 500)) return false;
        Location center = player.getLocation().add(0, 1, 0);
        for (int dx = -1; dx <= 1; dx++) {
            for (int dy = -1; dy <= 1; dy++) {
                for (int dz = -1; dz <= 1; dz++) {
                    Block block = center.clone().add(dx, dy, dz).getBlock();
                    if (block.getType().isAir() || block.getType().getHardness() < 0) continue;
                    if (!SlimefunProtection.canBuild(player, block.getLocation())) continue;
                    if (BlockStorage.hasBlockInfo(block)) {
                        BlockStorage.clearBlockInfo(block);
                    }
                    block.breakNaturally();
                }
            }
        }
        LSTEffectLib.sound(center, Sound.BLOCK_STONE_BREAK, 1f, 0.6f);
        return false;
    };

    /** 修罗·移山灵锹: 前方 5x3 岩浆石墙 (垂直于视线), 再点拆除。 */
    public static final LSTItemAction XL_YSLQ = (player, item) -> {
        if (LSTEffectLib.onCooldown(player, "xl_yslq", 300)) return false;
        List<Block> wall = WALLS.remove(player.getUniqueId());
        if (wall != null) {
            for (Block block : wall) {
                if (block.getType() == Material.NETHERRACK) {
                    block.setType(Material.AIR);
                }
            }
            LSTEffectLib.sound(player.getLocation(), Sound.BLOCK_STONE_BREAK, 1f, 1f);
            return false;
        }
        Location base = player.getLocation().add(player.getLocation().getDirection().setY(0).normalize().multiply(2)).getBlock().getLocation();
        Vector facing = player.getLocation().getDirection().setY(0).normalize();
        // 侧向向量 (垂直于朝向的水平向量)
        Vector side = new Vector(-facing.getZ(), 0, facing.getX());
        List<Block> built = new ArrayList<>();
        for (int s = -2; s <= 2; s++) {
            for (int dy = 0; dy <= 2; dy++) {
                Location loc = base.clone().add(side.clone().multiply(s)).add(0, dy, 0);
                Block block = loc.getBlock();
                if (block.getType().isAir()) {
                    block.setType(Material.NETHERRACK);
                    built.add(block);
                }
            }
        }
        WALLS.put(player.getUniqueId(), built);
        LSTEffectLib.sound(player.getLocation(), Sound.BLOCK_STONE_PLACE, 1f, 0.8f);
        return false;
    };

    // ===== 技能武器 =====

    /** 幽影裂空: 三段循环 (闪烁/背刺/处决)。 */
    public static final LSTItemAction YYLK = (player, item) -> {
        if (LSTEffectLib.onCooldown(player, "yylk", 1000)) return false;
        int step = nextCycle(player, "yylk", 3);
        switch (step) {
            case 0 -> {
                Vector dir = player.getLocation().getDirection().setY(0).normalize().multiply(10);
                Location dest = player.getLocation().add(dir);
                dest.getWorld().spawnParticle(Particle.PORTAL, player.getLocation(), 30, 0.3, 0.5, 0.3, 0.5);
                player.teleport(dest);
            }
            case 1 -> {
                for (LivingEntity target : LSTEffectLib.coneLiving(player, 30, 8)) {
                    // 背刺判定: 攻击者位于目标背后 (目标朝向与"目标->玩家"方向反向)
                    Vector targetFacing = target.getLocation().getDirection().setY(0).normalize();
                    Vector toPlayer = player.getLocation().toVector().subtract(target.getLocation().toVector()).setY(0);
                    boolean backstab = toPlayer.lengthSquared() > 0.01
                            && targetFacing.dot(toPlayer.normalize()) < 0;
                    LSTEffectLib.damage(target, player, backstab ? 12 * 2.2 : 12);
                }
            }
            default -> {
                for (LivingEntity target : LSTEffectLib.nearbyLiving(player, 8)) {
                    if (target.getHealth() <= target.getMaxHealth() * 0.25) {
                        LSTEffectLib.lightning(target.getLocation());
                        LSTEffectLib.damageTrue(target, player, 999);
                    } else {
                        LSTEffectLib.damage(target, player, 16);
                    }
                }
            }
        }
        return false;
    };

    /** 幽荧噬界: 循环 (凋零/致盲/落雷)。 */
    public static final LSTItemAction YYSJ = (player, item) -> {
        if (LSTEffectLib.onCooldown(player, "yysj", 1000)) return false;
        int step = nextCycle(player, "yysj", 3);
        for (LivingEntity target : LSTEffectLib.coneLiving(player, 45, 8)) {
            switch (step) {
                case 0 -> {
                    LSTEffectLib.applyPotion(target, PotionEffectType.WITHER, 1, 5);
                    LSTEffectLib.damage(target, player, 6);
                }
                case 1 -> {
                    LSTEffectLib.applyPotion(target, PotionEffectType.BLINDNESS, 0, 5);
                    LSTEffectLib.damage(target, player, 5);
                }
                default -> {
                    LSTEffectLib.lightning(target.getLocation());
                    LSTEffectLib.damage(target, player, 20);
                }
            }
        }
        return false;
    };

    /** 极昼耀斑: 三连击循环 (10/14/18 伤), 第 3 击附带 15% 真伤范围与灼烧。 */
    public static final LSTItemAction JZYB = (player, item) -> {
        if (LSTEffectLib.onCooldown(player, "jzyb", 800)) return false;
        int step = nextCycle(player, "jzyb", 3);
        double[] damages = {10, 14, 18};
        double dmg = damages[step];
        for (LivingEntity target : LSTEffectLib.coneLiving(player, 60, 5)) {
            LSTEffectLib.damage(target, player, dmg);
            if (step == 2) { // 第三击: 额外 15% 真伤 + 灼烧
                LSTEffectLib.damageTrue(target, player, dmg * 0.15);
                target.setFireTicks(100);
            }
        }
        LSTEffectLib.particles(player.getLocation().add(0, 1, 0), Particle.FLAME, 30, 0.8);
        return false;
    };

    /** 海神·黄金三叉戟: 15 格冰冻定身 (需潜行+左键, 由监听器分流)。 */
    public static final LSTItemAction HSSCJ = (player, item) -> {
        if (LSTEffectLib.onCooldown(player, "hscj", 3000)) return false;
        for (LivingEntity target : LSTEffectLib.nearbyLiving(player, 15)) {
            try {
                target.setFreezeTicks(200);
            } catch (Throwable ignored) {
            }
            // 缓速 255 级 10 秒: 完全定身
            LSTEffectLib.applyPotion(target, PotionEffectType.SLOW, 255, 10);
            LSTEffectLib.damage(target, player, 20);
        }
        LSTEffectLib.particles(player.getLocation(), Particle.SNOWFLAKE, 60, 3);
        return false;
    };

    /** 玄冥庇护: 循环 (治疗雨/庇护领域/疾风)。 */
    public static final LSTItemAction XMBH = (player, item) -> {
        int step = nextCycle(player, "xmbh", 3);
        List<Player> allies = new ArrayList<>();
        allies.add(player);
        for (Player other : player.getWorld().getNearbyPlayers(player.getLocation(), 12)) {
            allies.add(other);
        }
        switch (step) {
            case 0 -> {
                for (Player p : allies) {
                    p.setHealth(Math.min(p.getMaxHealth(), p.getHealth() + 6));
                    LSTEffectLib.applyPotion(p, PotionEffectType.REGENERATION, 1, 5);
                }
            }
            case 1 -> {
                for (Player p : allies) {
                    LSTEffectLib.applyPotion(p, PotionEffectType.ABSORPTION, 2, 60);
                    LSTEffectLib.applyPotion(p, PotionEffectType.DAMAGE_RESISTANCE, 0, 60);
                    LSTEffectLib.applyPotion(p, PotionEffectType.FIRE_RESISTANCE, 0, 60);
                }
            }
            default -> {
                for (Player p : allies) {
                    LSTEffectLib.applyPotion(p, PotionEffectType.SPEED, 2, 30);
                    LSTEffectLib.applyPotion(p, PotionEffectType.JUMP, 1, 30);
                }
            }
        }
        LSTEffectLib.sound(player.getLocation(), Sound.BLOCK_BEACON_ACTIVATE, 0.8f, 1.5f);
        return false;
    };

    /** 瑶光祝福: 循环增益 (10 格, 60 秒)。 */
    public static final LSTItemAction YGZF = (player, item) -> {
        int step = nextCycle(player, "ygzf", 3);
        List<Player> allies = new ArrayList<>();
        allies.add(player);
        allies.addAll(player.getWorld().getNearbyPlayers(player.getLocation(), 10));
        switch (step) {
            case 0 -> {
                for (Player p : allies) {
                    LSTEffectLib.applyPotion(p, PotionEffectType.NIGHT_VISION, 0, 60);
                    LSTEffectLib.applyPotion(p, PotionEffectType.WATER_BREATHING, 0, 60);
                    LSTEffectLib.applyPotion(p, PotionEffectType.GLOWING, 0, 60);
                }
            }
            case 1 -> {
                for (Player p : allies) {
                    LSTEffectLib.applyPotion(p, PotionEffectType.INCREASE_DAMAGE, 1, 60);
                    LSTEffectLib.applyPotion(p, PotionEffectType.DAMAGE_RESISTANCE, 1, 60);
                    LSTEffectLib.applyPotion(p, PotionEffectType.HEALTH_BOOST, 1, 60);
                }
            }
            default -> {
                for (Player p : allies) {
                    LSTEffectLib.applyPotion(p, PotionEffectType.LUCK, 1, 60);
                    LSTEffectLib.applyPotion(p, PotionEffectType.FAST_DIGGING, 1, 60);
                    LSTEffectLib.applyPotion(p, PotionEffectType.SATURATION, 0, 1);
                }
            }
        }
        return false;
    };

    /** 破军千刃: 循环 (锥形 25 伤+凋零II / 连击 / 凋零III 锥形+范围)。 */
    public static final LSTItemAction PJQR = (player, item) -> {
        if (LSTEffectLib.onCooldown(player, "pjqra", 1000)) return false;
        int step = nextCycle(player, "pjqra", 3);
        switch (step) {
            case 0 -> {
                for (LivingEntity target : LSTEffectLib.coneLiving(player, 45, 6)) {
                    LSTEffectLib.damage(target, player, 25);
                    LSTEffectLib.applyPotion(target, PotionEffectType.WITHER, 1, 3);
                }
            }
            case 1 -> {
                int combo = CYCLE.merge(player.getUniqueId() + "|pjqrb", 1, Integer::sum);
                double dmg = 15 + 5 * (combo % 5);
                boolean secondHit = combo % 2 == 0;
                for (LivingEntity target : LSTEffectLib.coneLiving(player, 45, 6)) {
                    LSTEffectLib.damage(target, player, dmg);
                    if (secondHit) {
                        LSTEffectLib.applyPotion(target, PotionEffectType.SLOW, 2, 4);
                        Vector kb = target.getLocation().toVector().subtract(player.getLocation().toVector()).setY(0.2);
                        if (kb.lengthSquared() > 0) {
                            target.setVelocity(target.getVelocity().add(kb.normalize().multiply(1.5).setY(0.4)));
                        }
                    } else {
                        LSTEffectLib.applyPotion(target, PotionEffectType.BLINDNESS, 0, 3);
                    }
                }
            }
            default -> {
                for (LivingEntity target : LSTEffectLib.coneLiving(player, 45, 6)) {
                    LSTEffectLib.applyPotion(target, PotionEffectType.WITHER, 2, 5);
                    LSTEffectLib.damage(target, player, 12);
                    // 命中目标周围 3 格额外 8 点范围伤害
                    for (Entity e : target.getNearbyEntities(3, 3, 3)) {
                        if (e instanceof LivingEntity living && living != player && LSTEffectLib.isTargetable(living)) {
                            LSTEffectLib.damage(living, player, 8);
                        }
                    }
                }
            }
        }
        return false;
    };

    /** 紫电青霜: 循环元素 (雷/冰/火)。 */
    public static final LSTItemAction ZDQS = (player, item) -> {
        if (LSTEffectLib.onCooldown(player, "zdqs", 800)) return false;
        int step = nextCycle(player, "zdqs", 3);
        for (LivingEntity target : LSTEffectLib.coneLiving(player, 45, 8)) {
            switch (step) {
                case 0 -> {
                    // 雷: 仅粒子/音效表现, 不召唤真实落雷
                    LSTEffectLib.damage(target, player, 8);
                    LSTEffectLib.applyPotion(target, PotionEffectType.SLOW, 2, 2);
                    LSTEffectLib.applyPotion(target, PotionEffectType.BLINDNESS, 0, 2);
                    LSTEffectLib.particles(target.getLocation(), Particle.ELECTRIC_SPARK, 15, 0.5);
                }
                case 1 -> {
                    LSTEffectLib.damage(target, player, 6);
                    LSTEffectLib.applyPotion(target, PotionEffectType.SLOW, 3, 5);
                    LSTEffectLib.applyPotion(target, PotionEffectType.WEAKNESS, 0, 5);
                }
                default -> {
                    LSTEffectLib.damage(target, player, 5);
                    target.setFireTicks(80);
                }
            }
        }
        return false;
    };

    /** 赤霄援护: 循环团辅 (50 格)。 */
    public static final LSTItemAction CXFT = (player, item) -> {
        int step = nextCycle(player, "cxft", 3);
        List<Player> allies = new ArrayList<>();
        allies.add(player);
        allies.addAll(player.getWorld().getNearbyPlayers(player.getLocation(), 50));
        switch (step) {
            case 0 -> {
                for (Player p : allies) p.setHealth(p.getMaxHealth());
            }
            case 1 -> {
                for (Player p : allies) {
                    LSTEffectLib.applyPotion(p, PotionEffectType.INCREASE_DAMAGE, 4, 60);
                    LSTEffectLib.applyPotion(p, PotionEffectType.SPEED, 4, 60);
                    LSTEffectLib.applyPotion(p, PotionEffectType.REGENERATION, 4, 60);
                }
            }
            default -> {
                for (Player p : allies) {
                    for (PotionEffect active : p.getActivePotionEffects()) {
                        if (active.getType().getEffectCategory() == PotionEffectType.Category.HARMFUL) {
                            p.removePotionEffect(active.getType());
                        }
                    }
                    LSTEffectLib.applyPotion(p, PotionEffectType.DAMAGE_RESISTANCE, 2, 60);
                    LSTEffectLib.applyPotion(p, PotionEffectType.ABSORPTION, 10, 60);
                }
            }
        }
        return false;
    };

    /** 赤霄焚天: 循环锥形 (火/冰/雷)。 */
    public static final LSTItemAction CXFT_CONE = (player, item) -> {
        if (LSTEffectLib.onCooldown(player, "cxftc", 1000)) return false;
        int step = nextCycle(player, "cxftc", 3);
        for (LivingEntity target : LSTEffectLib.coneLiving(player, 45, 8)) {
            switch (step) {
                case 0 -> {
                    LSTEffectLib.damage(target, player, 6);
                    target.setFireTicks(80);
                }
                case 1 -> {
                    LSTEffectLib.damage(target, player, 5);
                    LSTEffectLib.applyPotion(target, PotionEffectType.SLOW, 2, 5);
                }
                default -> {
                    LSTEffectLib.lightning(target.getLocation());
                    LSTEffectLib.damage(target, player, 20);
                }
            }
        }
        return false;
    };

    /** 霜烬战锤: 循环 (前方冰冻 / 全向震地 / 全向冰火爆发)。 */
    public static final LSTItemAction SJZC = (player, item) -> {
        if (LSTEffectLib.onCooldown(player, "sjzc", 700)) return false;
        int step = nextCycle(player, "sjzc", 3);
        if (step == 0) {
            // 前方锥形冰冻
            for (LivingEntity target : LSTEffectLib.coneLiving(player, 50, 6)) {
                try {
                    target.setFreezeTicks(60);
                } catch (Throwable ignored) {
                }
                LSTEffectLib.applyPotion(target, PotionEffectType.SLOW, 2, 3);
                LSTEffectLib.damage(target, player, 10);
            }
        } else if (step == 1) {
            // 地裂: 全向范围, 点燃 + 上抛
            for (LivingEntity target : LSTEffectLib.nearbyLiving(player, 4)) {
                LSTEffectLib.damage(target, player, 14);
                target.setFireTicks(80);
                target.setVelocity(target.getVelocity().add(new Vector(0, 0.6, 0)));
            }
        } else {
            // 爆发: 全向范围, 冰冻 + 点燃 + 强力上抛
            for (LivingEntity target : LSTEffectLib.nearbyLiving(player, 4)) {
                try {
                    target.setFreezeTicks(60);
                } catch (Throwable ignored) {
                }
                LSTEffectLib.damage(target, player, 12);
                target.setFireTicks(80);
                target.setVelocity(target.getVelocity().add(new Vector(0, 0.8, 0)));
            }
        }
        return false;
    };

    /** 青冥裂空: 循环锥形 (凋零 II / 致盲 II / 落雷 20)。 */
    public static final LSTItemAction QMLK = (player, item) -> {
        if (LSTEffectLib.onCooldown(player, "qmlk", 800)) return false;
        int step = nextCycle(player, "qmlk", 3);
        for (LivingEntity target : LSTEffectLib.coneLiving(player, 45, 8)) {
            switch (step) {
                case 0 -> {
                    LSTEffectLib.applyPotion(target, PotionEffectType.WITHER, 1, 5);
                    LSTEffectLib.damage(target, player, 6);
                }
                case 1 -> {
                    LSTEffectLib.applyPotion(target, PotionEffectType.BLINDNESS, 1, 3);
                    LSTEffectLib.damage(target, player, 5);
                }
                default -> {
                    LSTEffectLib.lightning(target.getLocation());
                    LSTEffectLib.damage(target, player, 20);
                }
            }
        }
        return false;
    };

    /** 青鸾鸣奏: 循环治疗乐章 (12 格)。 */
    public static final LSTItemAction QYMZ = (player, item) -> {
        int step = nextCycle(player, "qymz", 3);
        List<Player> allies = new ArrayList<>();
        allies.add(player);
        allies.addAll(player.getWorld().getNearbyPlayers(player.getLocation(), 12));
        switch (step) {
            case 0 -> {
                for (Player p : allies) {
                    p.setHealth(Math.min(p.getMaxHealth(), p.getHealth() + 6));
                    LSTEffectLib.applyPotion(p, PotionEffectType.REGENERATION, 1, 30);
                }
            }
            case 1 -> {
                for (Player p : allies) {
                    LSTEffectLib.applyPotion(p, PotionEffectType.SPEED, 2, 60);
                    LSTEffectLib.applyPotion(p, PotionEffectType.JUMP, 1, 60);
                    LSTEffectLib.applyPotion(p, PotionEffectType.SLOW_FALLING, 0, 60);
                }
            }
            default -> {
                for (Player p : allies) {
                    LSTEffectLib.applyPotion(p, PotionEffectType.LUCK, 1, 60);
                    LSTEffectLib.applyPotion(p, PotionEffectType.FAST_DIGGING, 1, 60);
                    LSTEffectLib.applyPotion(p, PotionEffectType.SATURATION, 0, 1);
                }
            }
        }
        LSTEffectLib.sound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_BELL, 1f, 1.4f);
        return false;
    };

    /** 寂灭·生息骤断: 命中玩家即死 (onWeaponHit, 由监听器调用)。 */
    public static boolean jmSxzHit(Player target) {
        target.setHealth(0);
        return true;
    }

    // ===== 永恒无尽工具 =====

    /** 世界崩解之镐: 蔓延破坏 5 格内的目标方块。 */
    public static final LSTItemAction SJBJZG = (player, item) -> {
        if (LSTEffectLib.onCooldown(player, "sjbjzg", 500)) return false;
        Block target = player.getTargetBlockExact(5);
        if (target == null || target.getType().isAir()) return false;
        if (!SlimefunProtection.canBuild(player, target.getLocation())) return false;
        disintegrate(player, target);
        return false;
    };

    private static void disintegrate(Player player, Block block) {
        if (block.getType().isAir()) {
            return;
        }
        if (BlockStorage.hasBlockInfo(block)) {
            BlockStorage.clearBlockInfo(block);
        }
        // 世界崩解: 连原本不可破坏的方块 (基岩/传送门/刷怪笼等) 也强制移除
        if (block.getType().getHardness() < 0 || block.isLiquid()) {
            block.setType(Material.AIR);
        } else {
            block.breakNaturally(player.getInventory().getItemInMainHand());
        }
    }

    /** 地蕴复生之锄: 右键对准方块施加骨粉效果 (树苗成树/草生花/作物催熟等)。 */
    public static final LSTItemAction DYFSZC = (player, item) -> {
        Block target = player.getTargetBlockExact(5);
        if (target == null || target.getType().isAir()) return false;
        boolean grew = false;
        try {
            grew = target.applyBoneMeal(BlockFace.UP);
        } catch (Throwable ignored) {
        }
        if (!grew && target.getBlockData() instanceof Ageable ageable && ageable.getAge() < ageable.getMaximumAge()) {
            ageable.setAge(ageable.getMaximumAge());
            target.setBlockData(ageable);
            grew = true;
        }
        if (grew) {
            LSTEffectLib.particles(target.getLocation().add(0.5, 0.5, 0.5), Particle.COMPOSTER, 12, 0.3);
        }
        return false;
    };

    /** 寰宇支配之剑: 20 格立方内全部 20 伤。 */
    public static final LSTItemAction HYZPZJ = (player, item) -> {
        if (LSTEffectLib.onCooldown(player, "hyzpzj", 1500)) return false;
        for (Entity entity : player.getWorld().getNearbyEntities(player.getLocation(), 20, 20, 20)) {
            if (entity instanceof LivingEntity living && entity != player && LSTEffectLib.isTargetable(living)) {
                LSTEffectLib.damage(living, player, 20);
            }
        }
        LSTEffectLib.sound(player.getLocation(), Sound.ENTITY_ENDER_DRAGON_GROWL, 0.7f, 1.6f);
        return false;
    };

    /** 星球吞噬之铲: 黑洞 (需潜行右键)。 */
    public static final LSTItemAction XQTSZC = (player, item) -> {
        if (!player.isSneaking()) return false;
        if (LSTEffectLib.onCooldown(player, "xqtszc", 30000)) return false;
        blackHole(player);
        return false;
    };

    /** 终望珍珠: 黑洞 (消耗 1 个)。 */
    public static final LSTItemAction ZWZZ = (player, item) -> {
        if (LSTEffectLib.onCooldown(player, "zwzz", 30000)) return false;
        blackHole(player);
        item.setAmount(item.getAmount() - 1); // 消耗物品
        return false;
    };

    /**
     * 黑洞: 在瞄准点生成一个持续 5 秒的黑洞, 每刻把 10 格内实体拉向中心,
     * 5 秒后爆炸对范围内实体造成 100 伤害 (对应 lore/RSC)。
     */
    private static void blackHole(Player player) {
        LivingEntity look = LSTEffectLib.lookTarget(player, 30);
        final Location center = (look != null ? look.getLocation()
                : player.getLocation().add(player.getLocation().getDirection().multiply(8))).clone();
        final org.bukkit.World world = center.getWorld();
        if (world == null) return;
        LSTEffectLib.sound(center, Sound.ENTITY_ENDERMAN_TELEPORT, 1f, 0.5f);
        new org.bukkit.scheduler.BukkitRunnable() {
            int ticks = 0;

            @Override
            public void run() {
                if (ticks >= 100) { // 5 秒后爆炸
                    for (Entity entity : world.getNearbyEntities(center, 10, 10, 10)) {
                        if (entity instanceof LivingEntity living && LSTEffectLib.isTargetable(living)) {
                            LSTEffectLib.damage(living, player, 100);
                        }
                    }
                    world.spawnParticle(Particle.EXPLOSION_HUGE, center, 3, 1, 1, 1, 0);
                    world.playSound(center, Sound.ENTITY_GENERIC_EXPLODE, 1f, 0.8f);
                    cancel();
                    return;
                }
                for (Entity entity : world.getNearbyEntities(center, 10, 10, 10)) {
                    if (entity instanceof LivingEntity living && living != player && LSTEffectLib.isTargetable(living)) {
                        Vector pull = center.toVector().subtract(living.getLocation().toVector());
                        if (pull.lengthSquared() > 0.04) {
                            living.setVelocity(pull.normalize().multiply(0.6));
                        }
                    }
                }
                world.spawnParticle(Particle.PORTAL, center, 30, 1.2, 1.2, 1.2, 1);
                ticks++;
            }
        }.runTaskTimer(io.Yomicer.LengShangTech.LengShangEvo.getInstance(), 0L, 1L);
    }

    /** 自然荒芜之斧: 以瞄准方块为中心范围伐木, 按砍伐数量回复生命 (每棵 +2)。 */
    public static final LSTItemAction ZRHWZF = (player, item) -> {
        if (LSTEffectLib.onCooldown(player, "zrhwzf", 5000)) return false;
        Block look = player.getTargetBlockExact(6);
        Location center = (look != null ? look.getLocation() : player.getLocation());
        int trees = 0;
        for (int dx = -6; dx <= 6; dx++) {
            for (int dy = -2; dy <= 8; dy++) {
                for (int dz = -6; dz <= 6; dz++) {
                    Block block = center.clone().add(dx, dy, dz).getBlock();
                    String name = block.getType().name();
                    if (name.endsWith("_LOG") || name.endsWith("_WOOD") || block.getType() == Material.BAMBOO_BLOCK) {
                        block.breakNaturally();
                        trees++;
                    }
                }
            }
        }
        if (trees > 0) {
            player.setHealth(Math.min(player.getMaxHealth(), player.getHealth() + trees * 2.0));
        }
        return false;
    };

    /** 九霄惊雷之锤: 右键发射风弹。 */
    public static final LSTItemAction JXJLZC = (player, item) -> {
        if (LSTEffectLib.onCooldown(player, "jxjlzc", 1000)) return false;
        WindCharge wind = player.getWorld().spawn(player.getEyeLocation(), WindCharge.class);
        wind.setShooter(player);
        wind.setVelocity(player.getLocation().getDirection().multiply(1.5));
        return false;
    };

    /** 远海鲸吞之桶: 吸取/倾倒流体 (简化: 右键吸取源方块, 潜行右键倾倒)。 */
    public static final LSTItemAction YJHTZT = (player, item) -> {
        Block target = player.getTargetBlockExact(5);
        if (target == null) return false;
        if (player.isSneaking()) {
            String fluid = io.Yomicer.LengShangTech.utils.LSTPdc.get(item, "lst_fluid");
            if (fluid == null) return false;
            Block face = target.getRelative(BlockFace.UP);
            face.setType("LAVA".equals(fluid) ? Material.LAVA : Material.WATER);
            io.Yomicer.LengShangTech.utils.LSTPdc.set(item, "lst_fluid", null);
            return false;
        }
        Material type = target.getType();
        if (type == Material.WATER || type == Material.LAVA) {
            io.Yomicer.LengShangTech.utils.LSTPdc.set(item, "lst_fluid", type == Material.LAVA ? "LAVA" : "WATER");
            target.setType(Material.AIR);
            LSTEffectLib.sound(target.getLocation(), Sound.ITEM_BUCKET_FILL, 1f, 1f);
        }
        return false;
    };
}
