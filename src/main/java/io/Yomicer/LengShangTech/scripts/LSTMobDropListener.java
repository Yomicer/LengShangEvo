package io.Yomicer.LengShangTech.scripts;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

/**
 * 冷殇生物掉落 (mob_drops.yml): 击杀指定生物按概率掉落对应物品。
 */
public class LSTMobDropListener implements Listener {

    private static final Map<EntityType, DropEntry> DROPS = new HashMap<>();

    public record DropEntry(String itemId, int chancePercent) {
    }

    LSTMobDropListener() {
    }

    public static void register(EntityType type, String itemId, int chancePercent) {
        DROPS.put(type, new DropEntry(itemId, chancePercent));
    }

    @EventHandler(ignoreCancelled = true)
    public void onEntityDeath(EntityDeathEvent event) {
        DropEntry entry = DROPS.get(event.getEntity().getType());
        if (entry == null) {
            return;
        }
        if (ThreadLocalRandom.current().nextInt(100) >= entry.chancePercent()) {
            return;
        }
        SlimefunItem item = SlimefunItem.getById(io.Yomicer.LengShangTech.core.LSTReg.norm(entry.itemId()));
        if (item != null) {
            ItemStack stack = item.getItem().clone();
            event.getDrops().add(stack);
        }
    }
}
