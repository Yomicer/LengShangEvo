package io.Yomicer.LengShangTech.scripts;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

/**
 * 方块破坏掉落 (items.yml 的 drop_from/drop_chance/drop_amount, 如各源晶与幸运四叶草)。
 */
public class LSTBlockDrops implements Listener {

    /** 材质名 -> (物品ID, 概率%) */
    private static final Map<String, DropEntry> DROPS = new HashMap<>();

    public record DropEntry(String itemId, int chancePercent) {
    }

    LSTBlockDrops() {
    }

    public static void register(String materialName, String itemId, int chancePercent) {
        Material material = Material.matchMaterial(materialName);
        if (material != null) {
            DROPS.put(material.getKey().getKey(), new DropEntry(itemId, chancePercent));
        }
    }

    @EventHandler(ignoreCancelled = true)
    public void onBlockBreak(BlockBreakEvent event) {
        DropEntry entry = DROPS.get(event.getBlock().getType().getKey().getKey());
        if (entry == null) {
            return;
        }
        Player player = event.getPlayer();
        if (player.getGameMode() != org.bukkit.GameMode.SURVIVAL) {
            return;
        }
        if (ThreadLocalRandom.current().nextInt(100) >= entry.chancePercent()) {
            return;
        }
        SlimefunItem item = SlimefunItem.getById(io.Yomicer.LengShangTech.core.LSTReg.norm(entry.itemId()));
        if (item != null) {
            event.getBlock().getWorld().dropItemNaturally(
                    event.getBlock().getLocation().add(0.5, 0.5, 0.5), item.getItem().clone());
        }
    }
}
