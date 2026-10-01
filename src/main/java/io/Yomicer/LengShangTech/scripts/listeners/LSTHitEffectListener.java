package io.Yomicer.LengShangTech.scripts.listeners;

import io.Yomicer.LengShangTech.scripts.effects.WeaponEffects;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import org.bukkit.Sound;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

/**
 * 命中类脚本效果 (onWeaponHit): 德古拉之吻吸血 / 破军双倍伤害 / 天罚之刃落雷 / 寂灭生息骤断即死 / 九霄惊雷之锤。
 */
public class LSTHitEffectListener implements Listener {

    public enum HitEffect {
        /** 吸血 20% */
        LIFESTEAL,
        /** 20% 概率双倍伤害 */
        DOUBLE_DAMAGE,
        /** 20% 概率落雷 */
        LIGHTNING,
        /** 命中玩家即死 */
        INSTAKILL_PLAYER,
        /** 雷锤: 雨天 +50% */
        STORM_BONUS
    }

    private static final Map<String, HitEffect> EFFECTS = new HashMap<>();

    public static void register(String itemId, HitEffect effect) {
        EFFECTS.put(itemId, effect);
    }

    @EventHandler(ignoreCancelled = true)
    public void onHit(EntityDamageByEntityEvent event) {
        if (!(event.getDamager() instanceof Player attacker)) {
            return;
        }
        if (!(event.getEntity() instanceof LivingEntity target)) {
            return;
        }
        ItemStack weapon = attacker.getInventory().getItemInMainHand();
        SlimefunItem sfItem = SlimefunItem.getByItem(weapon);
        if (sfItem == null) {
            return;
        }
        HitEffect effect = EFFECTS.get(sfItem.getId());
        if (effect == null) {
            return;
        }
        switch (effect) {
            case LIFESTEAL -> {
                double heal = event.getFinalDamage() * 0.2;
                attacker.setHealth(Math.min(attacker.getMaxHealth(), attacker.getHealth() + heal));
            }
            case DOUBLE_DAMAGE -> {
                if (ThreadLocalRandom.current().nextInt(100) < 20) {
                    event.setDamage(event.getDamage() * 2);
                }
            }
            case LIGHTNING -> {
                if (ThreadLocalRandom.current().nextInt(100) < 20) {
                    // 真实落雷 (造成伤害/点燃), 对应 lore "召唤落雷"
                    target.getWorld().strikeLightning(target.getLocation());
                }
            }
            case INSTAKILL_PLAYER -> {
                if (target instanceof Player playerTarget) {
                    WeaponEffects.jmSxzHit(playerTarget);
                }
            }
            case STORM_BONUS -> {
                // 仅在下砸/坠击时触发 (对应 RSC: 下落距离>0.5 或本次伤害>6.5)
                boolean smash = attacker.getFallDistance() > 0.5f || event.getDamage() > 6.5;
                if (!smash) {
                    return;
                }
                attacker.getWorld().strikeLightningEffect(target.getLocation());
                if (attacker.getWorld().hasStorm() || attacker.getWorld().isThundering()) {
                    event.setDamage(event.getDamage() * 1.5);
                }
            }
        }
        attacker.playSound(attacker.getLocation(), Sound.ENTITY_PLAYER_ATTACK_SWEEP, 0.6f, 1.2f);
    }
}
