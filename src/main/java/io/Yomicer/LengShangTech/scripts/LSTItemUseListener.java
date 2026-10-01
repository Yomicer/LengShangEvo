package io.Yomicer.LengShangTech.scripts;

import io.Yomicer.LengShangTech.LengShangEvo;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.utils.SlimefunUtils;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;

/**
 * 脚本道具交互分发器 (对应 RSC 的 onLoad/PlayerInteractEvent 绑定方式)。
 * 匹配顺序: Slimefun 注册表 → 冷殇实例逐个比对; 只处理主手右键, 避免副手重复触发。
 */
public class LSTItemUseListener implements Listener {

    /**
     * 指南按钮点击: 聚宝阁/语录按钮只存在于指南界面, 点击不会触发 PlayerInteractEvent,
     * 这里在指南的点击事件里直接分发 (低优先级, 先于粘液自身的物品页打开)。
     * 动作延迟到下一 tick 执行: 在点击事件内同步 openInventory 会被吞掉, 导致不跳转。
     */
    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void onGuideClick(InventoryClickEvent event) {
        if (!(event.getWhoClicked() instanceof Player player)) {
            return;
        }
        ItemStack clicked = event.getCurrentItem();
        if (clicked == null || clicked.getType().isAir()) {
            return;
        }
        // 聚宝阁配方页中心的"打开"图标: 点击即打开聚宝阁 (延迟一 tick 避免界面切换被吞)
        if (io.Yomicer.LengShangTech.scripts.effects.LSTShopMenu.isOpenIcon(clicked)) {
            event.setCancelled(true);
            Bukkit.getScheduler().runTask(LengShangEvo.getInstance(),
                    () -> io.Yomicer.LengShangTech.scripts.effects.LSTShopMenu.open(player));
            return;
        }
        SlimefunItem sfItem = SlimefunItem.getByItem(clicked);
        if (sfItem instanceof LSTActionItem actionItem && actionItem.isGuideButton()) {
            event.setCancelled(true);
            dispatchNextTick(player, actionItem, clicked);
            return;
        }
        // 兜底: JEG 等插件可能包装指南物品, 按显示内容逐个比对指南按钮
        for (LSTActionItem actionItem : LSTActionItem.INSTANCES) {
            if (!actionItem.isGuideButton()) {
                continue;
            }
            ItemStack registered = actionItem.getItem();
            if (registered != null && SlimefunUtils.isItemSimilar(clicked, registered, false)) {
                event.setCancelled(true);
                dispatchNextTick(player, actionItem, clicked);
                return;
            }
        }
    }

    /** 下一 tick 再执行动作, 避免在点击事件内切换界面被吞。 */
    private void dispatchNextTick(Player player, LSTActionItem actionItem, ItemStack item) {
        ItemStack snapshot = item.clone();
        Bukkit.getScheduler().runTask(LengShangEvo.getInstance(),
                () -> actionItem.tryUse(player, snapshot));
    }

    /**
     * 右键分发: LOWEST + 不忽略已取消事件。
     * Slimefun 会为不可放置物品取消交互事件, 若忽略已取消事件, 武器右键将永远收不到。
     */
    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = false)
    public void onInteract(PlayerInteractEvent event) {
        Action action = event.getAction();
        if (action != Action.RIGHT_CLICK_AIR && action != Action.RIGHT_CLICK_BLOCK) {
            return;
        }
        if (event.getHand() != EquipmentSlot.HAND) {
            return;
        }
        ItemStack item = event.getItem();
        if (item == null || item.getType().isAir()) {
            return;
        }

        // 快路径: Slimefun 注册表直查
        SlimefunItem sfItem = SlimefunItem.getByItem(item);
        if (sfItem instanceof LSTActionItem actionItem) {
            if (actionItem.tryUse(event.getPlayer(), item)) {
                event.setCancelled(true);
            }
            return;
        }

        // 慢路径: 冷殇脚本道具逐个比对 (saveditem 武器栈可能无法通过注册表解析)
        for (LSTActionItem actionItem : LSTActionItem.INSTANCES) {
            ItemStack registered = actionItem.getItem();
            if (registered == null) {
                continue;
            }
            if (SlimefunUtils.isItemSimilar(item, registered, false)) {
                if (actionItem.tryUse(event.getPlayer(), item)) {
                    event.setCancelled(true);
                }
                return;
            }
        }
    }
}
