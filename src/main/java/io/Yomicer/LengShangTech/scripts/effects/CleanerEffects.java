package io.Yomicer.LengShangTech.scripts.effects;

import io.Yomicer.LengShangTech.scripts.LSTItemAction;
import org.bukkit.Material;
import org.bukkit.entity.BlockDisplay;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Item;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.entity.TextDisplay;

import java.util.List;

/**
 * 清除器 (scripts/清除器 的 11 个 JS): 右键移除范围内的目标实体。
 */
public final class CleanerEffects {

    private CleanerEffects() {
    }

    /** 单一生物类型清除 (默认半径 10)。 */
    public static LSTItemAction of(EntityType type, double radius) {
        return (player, item) -> clean(player, List.of(type), radius);
    }

    /** 怪物清除器: 多种常见怪物。 */
    public static final LSTItemAction MONSTER = (player, item) -> clean(player, List.of(
            EntityType.ZOMBIE, EntityType.SKELETON, EntityType.CREEPER, EntityType.SPIDER,
            EntityType.ENDERMAN, EntityType.ZOMBIFIED_PIGLIN, EntityType.PHANTOM, EntityType.SLIME), 10);

    public static final LSTItemAction ZOMBIE = of(EntityType.ZOMBIE, 10);
    public static final LSTItemAction SKELETON = of(EntityType.SKELETON, 10);
    public static final LSTItemAction CREEPER = of(EntityType.CREEPER, 10);
    public static final LSTItemAction SPIDER = of(EntityType.SPIDER, 10);
    public static final LSTItemAction ENDERMAN = of(EntityType.ENDERMAN, 10);
    public static final LSTItemAction PIGLIN = of(EntityType.ZOMBIFIED_PIGLIN, 10);
    public static final LSTItemAction SLIME = of(EntityType.SLIME, 10);
    public static final LSTItemAction PHANTOM = of(EntityType.PHANTOM, 30);

    /** 投影方块清除器: 100 格内 display 实体。 */
    public static final LSTItemAction DISPLAY = (player, item) -> {
        int count = 0;
        for (Entity entity : player.getWorld().getNearbyEntities(player.getLocation(), 100, 100, 100)) {
            if (entity instanceof BlockDisplay || entity instanceof TextDisplay
                    || entity instanceof org.bukkit.entity.ItemDisplay || entity instanceof org.bukkit.entity.Interaction) {
                entity.remove();
                count++;
            }
        }
        player.sendMessage("§a已清除 " + count + " 个投影实体");
        return false;
    };

    /** 掉落物清除器: 100 格内掉落物。 */
    public static final LSTItemAction DROPPED_ITEMS = (player, item) -> {
        int count = 0;
        for (Entity entity : player.getWorld().getNearbyEntities(player.getLocation(), 100, 100, 100)) {
            if (entity instanceof Item dropped) {
                dropped.remove();
                count++;
            }
        }
        player.sendMessage("§a已清除 " + count + " 个掉落物");
        return false;
    };

    private static boolean clean(Player player, List<EntityType> types, double radius) {
        int count = 0;
        for (Entity entity : player.getWorld().getNearbyEntities(player.getLocation(), radius, radius, radius)) {
            if (types.contains(entity.getType())) {
                if (entity instanceof LivingEntity living) {
                    if (!LSTEffectLib.isTargetable(living)) {
                        continue;
                    }
                    // 只清除"裸生物": 跳过有自定义名或身上带药水效果的生物 (保护命名怪/宠物/被增益的目标)
                    if (living.getCustomName() != null || !living.getActivePotionEffects().isEmpty()) {
                        continue;
                    }
                }
                entity.remove();
                count++;
            }
        }
        player.sendMessage("§a已清除 " + count + " 个目标");
        LSTEffectLib.sound(player.getLocation(), org.bukkit.Sound.ENTITY_ENDERMAN_TELEPORT, 0.6f, 1.6f);
        return false;
    }
}
