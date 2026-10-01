package io.Yomicer.LengShangTech.scripts.listeners;

import io.Yomicer.LengShangTech.scripts.effects.LSTEffectLib;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityShootBowEvent;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.metadata.FixedMetadataValue;
import org.bukkit.metadata.MetadataValue;
import org.bukkit.util.Vector;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

/**
 * 弓类技能 (scripts/监听.js): 天堂陨落长弓箭雨 / 重箭王多重箭 / 修罗灭世神弓天罚。
 */
public class LSTBowSkillListener implements Listener {

    public enum BowSkill {
        /** 3 波 × 15 支天火箭雨 */
        ARROW_RAIN,
        /** 10 支 4 倍蓄力箭 */
        HEAVY_ARROWS,
        /** 落点 5 连雷 + 递增爆炸 */
        THUNDER_BOW
    }

    private static final Map<String, BowSkill> BOWS = new HashMap<>();

    public static void register(String itemId, BowSkill skill) {
        BOWS.put(itemId, skill);
    }

    @EventHandler(ignoreCancelled = true)
    public void onShoot(EntityShootBowEvent event) {
        if (!(event.getEntity() instanceof Player player)) {
            return;
        }
        SlimefunItem bow = SlimefunItem.getByItem(event.getBow());
        if (bow == null) {
            return;
        }
        BowSkill skill = BOWS.get(bow.getId());
        if (skill == null) {
            return;
        }
        if (!(event.getProjectile() instanceof Arrow arrow)) {
            return;
        }
        switch (skill) {
            case ARROW_RAIN -> {
                if (LSTEffectLib.onCooldown(player, "bow_rain", 5000)) {
                    return; // 冷却中: 本箭不触发箭雨 (仍作为普通箭射出)
                }
                arrow.setMetadata("lst_arrow_rain",
                        new FixedMetadataValue(io.Yomicer.LengShangTech.LengShangEvo.getInstance(), bow.getId()));
            }
            case HEAVY_ARROWS -> {
                Vector velocity = player.getLocation().getDirection().multiply(event.getForce() * 4);
                for (int i = 0; i < 10; i++) {
                    Arrow extra = player.getWorld().spawnArrow(player.getEyeLocation(),
                            player.getLocation().getDirection(),
                            (float) event.getForce() * 4f, 10f);
                    extra.setShooter(player);
                    extra.setVelocity(velocity.clone().add(new Vector(
                            ThreadLocalRandom.current().nextDouble(-0.15, 0.15),
                            ThreadLocalRandom.current().nextDouble(-0.1, 0.1),
                            ThreadLocalRandom.current().nextDouble(-0.15, 0.15))));
                }
            }
            case THUNDER_BOW -> {
                if (LSTEffectLib.onCooldown(player, "bow_thunder", 5000)) {
                    return;
                }
                arrow.setMetadata("lst_thunder",
                        new FixedMetadataValue(io.Yomicer.LengShangTech.LengShangEvo.getInstance(), true));
            }
        }
    }

    @EventHandler(ignoreCancelled = true)
    public void onHit(ProjectileHitEvent event) {
        if (!(event.getEntity() instanceof Arrow arrow)) {
            return;
        }
        List<MetadataValue> rain = arrow.getMetadata("lst_arrow_rain");
        List<MetadataValue> thunder = arrow.getMetadata("lst_thunder");
        org.bukkit.projectiles.ProjectileSource shooter = arrow.getShooter();
        if (!rain.isEmpty()) {
            Location loc = arrow.getLocation();
            // 3 波箭雨: 每波 15 支从高空(20-30格)落下, 附带暴击与伤害、点燃
            for (int w = 0; w < 3; w++) {
                final int wave = w;
                org.bukkit.Bukkit.getScheduler().runTaskLater(io.Yomicer.LengShangTech.LengShangEvo.getInstance(), () -> {
                    for (int i = 0; i < 15; i++) {
                        Location drop = loc.clone().add(
                                ThreadLocalRandom.current().nextDouble(-3, 3),
                                20 + ThreadLocalRandom.current().nextDouble(10),
                                ThreadLocalRandom.current().nextDouble(-3, 3));
                        Arrow falling = arrow.getWorld().spawnArrow(drop, new Vector(0, -1, 0), 1.6f, 0f);
                        falling.setCritical(true);
                        falling.setDamage(4.0 + wave * 0.5);
                        falling.setFireTicks(100);
                        if (shooter != null) {
                            falling.setShooter(shooter);
                        }
                    }
                    loc.getWorld().spawnParticle(Particle.FLAME, loc, 30, 2, 1, 2, 0.1);
                }, w * 10L);
            }
            arrow.remove();
        } else if (!thunder.isEmpty()) {
            Location loc = arrow.getLocation();
            Player shooterPlayer = shooter instanceof Player ? (Player) shooter : null;
            for (int i = 0; i < 5; i++) {
                final int idx = i;
                org.bukkit.Bukkit.getScheduler().runTaskLater(io.Yomicer.LengShangTech.LengShangEvo.getInstance(), () -> {
                    Location strike = loc.clone().add(
                            ThreadLocalRandom.current().nextDouble(-2.5, 2.5), 0,
                            ThreadLocalRandom.current().nextDouble(-2.5, 2.5));
                    loc.getWorld().strikeLightning(strike);
                    loc.getWorld().createExplosion(strike, 2.0f + idx * 0.5f, true, false);
                    double radius = 4 + idx;
                    for (org.bukkit.entity.Entity e : strike.getWorld().getNearbyEntities(strike, radius, radius, radius)) {
                        if (!(e instanceof org.bukkit.entity.LivingEntity living)) continue;
                        if (shooterPlayer != null && living.equals(shooterPlayer)) continue;
                        living.damage(6 + idx * 2.0, shooterPlayer);
                        Vector kb = living.getLocation().toVector().subtract(strike.toVector());
                        if (kb.lengthSquared() > 0) {
                            living.setVelocity(living.getVelocity().add(kb.normalize().multiply(0.8).setY(0.4)));
                        }
                        living.addPotionEffect(new org.bukkit.potion.PotionEffect(org.bukkit.potion.PotionEffectType.SLOW, 60, 1));
                        living.addPotionEffect(new org.bukkit.potion.PotionEffect(org.bukkit.potion.PotionEffectType.BLINDNESS, 60, 0));
                    }
                }, idx * 6L);
            }
            arrow.remove();
        }
    }
}
