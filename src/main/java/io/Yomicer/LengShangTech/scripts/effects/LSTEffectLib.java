package io.Yomicer.LengShangTech.scripts.effects;

import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.Sound;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.util.Vector;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.function.Predicate;

/** 脚本效果通用工具: 冷却/范围搜索/扇形搜索/药水/音效。 */
public final class LSTEffectLib {

    private static final Map<UUID, Map<String, Long>> COOLDOWNS = new HashMap<>();

    private LSTEffectLib() {
    }

    /** 按玩家+键的冷却; 返回 true 表示已在冷却中。 */
    public static boolean onCooldown(Player player, String key, long millis) {
        long now = System.currentTimeMillis();
        Map<String, Long> map = COOLDOWNS.computeIfAbsent(player.getUniqueId(), k -> new HashMap<>());
        Long last = map.get(key);
        if (last != null && now - last < millis) {
            return true;
        }
        map.put(key, now);
        return false;
    }

    /**
     * 同 {@link #onCooldown}, 但在冷却中时用动作栏提示剩余时间 (道具用)。
     * 返回 true 表示仍在冷却 (且已提示玩家)。
     */
    public static boolean onCooldownNotify(Player player, String key, long millis) {
        long now = System.currentTimeMillis();
        Map<String, Long> map = COOLDOWNS.computeIfAbsent(player.getUniqueId(), k -> new HashMap<>());
        Long last = map.get(key);
        if (last != null && now - last < millis) {
            long remain = millis - (now - last);
            double sec = Math.ceil(remain / 100.0) / 10.0; // 向上取整到 0.1 秒
            actionBar(player, "§e冷却中: §c" + sec + " §e秒");
            return true;
        }
        map.put(key, now);
        return false;
    }

    /** 发送动作栏消息 (跨版本稳定的 Spigot API)。 */
    public static void actionBar(Player player, String message) {
        try {
            player.spigot().sendMessage(net.md_5.bungee.api.ChatMessageType.ACTION_BAR,
                    new net.md_5.bungee.api.chat.TextComponent(message));
        } catch (Throwable t) {
            player.sendMessage(message);
        }
    }

    public static double health(Object entity) {
        if (entity instanceof LivingEntity living) {
            return living.getHealth();
        }
        return 0;
    }

    /** 范围内活体 (排除自己/盔甲架/旁观者)。 */
    public static List<LivingEntity> nearbyLiving(Player center, double radius) {
        List<LivingEntity> out = new ArrayList<>();
        for (Entity entity : center.getWorld().getNearbyEntities(center.getLocation(), radius, radius, radius)) {
            if (entity instanceof LivingEntity living && entity != center && isTargetable(living)) {
                out.add(living);
            }
        }
        return out;
    }

    public static boolean isTargetable(LivingEntity living) {
        return !(living instanceof org.bukkit.entity.ArmorStand)
                && !(living instanceof org.bukkit.entity.Player p && p.getGameMode() == org.bukkit.GameMode.SPECTATOR);
    }

    /** 视线方向扇形 (angleDegrees 半角, distance 距离) 内的活体。 */
    public static List<LivingEntity> coneLiving(Player player, double angleDegrees, double distance) {
        List<LivingEntity> out = new ArrayList<>();
        Vector facing = player.getLocation().getDirection().setY(0).normalize();
        for (LivingEntity living : nearbyLiving(player, distance)) {
            Vector to = living.getLocation().toVector().subtract(player.getLocation().toVector()).setY(0);
            if (to.lengthSquared() < 0.01) {
                out.add(living);
                continue;
            }
            double angle = Math.toDegrees(facing.angle(to.normalize()));
            if (angle <= angleDegrees) {
                out.add(living);
            }
        }
        return out;
    }

    public static LivingEntity lookTarget(Player player, double maxDistance) {
        Entity target = player.getTargetEntity((int) Math.ceil(maxDistance));
        return target instanceof LivingEntity living && isTargetable(living) ? living : null;
    }

    public static void damage(LivingEntity target, Player attacker, double damage) {
        target.damage(damage, attacker);
    }

    public static void damageTrue(LivingEntity target, Player attacker, double damage) {
        double health = target.getHealth() - damage;
        target.setNoDamageTicks(0);
        target.damage(0.01, attacker);
        target.setHealth(Math.max(0.1, health));
    }

    public static void applyPotion(LivingEntity target, PotionEffectType type, int amplifier, int seconds) {
        target.addPotionEffect(new PotionEffect(type, seconds * 20, amplifier, false, true));
    }

    public static void potionMap(Player player, Map<PotionEffectType, int[]> effects) {
        for (Map.Entry<PotionEffectType, int[]> e : effects.entrySet()) {
            applyPotion(player, e.getKey(), e.getValue()[0], e.getValue()[1]);
        }
    }

    public static void lightning(Location location) {
        location.getWorld().strikeLightningEffect(location);
    }

    public static void sound(Location location, Sound sound, float volume, float pitch) {
        location.getWorld().playSound(location, sound, volume, pitch);
    }

    public static void particles(Location location, Particle particle, int count, double spread) {
        location.getWorld().spawnParticle(particle, location, count, spread, spread, spread, 0);
    }

    public static boolean consume(ItemStack item) {
        if (item == null) {
            return false;
        }
        item.setAmount(item.getAmount() - 1);
        return true;
    }
}
