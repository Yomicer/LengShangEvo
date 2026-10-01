package io.Yomicer.LengShangTech.scripts;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

/**
 * 脚本道具效果接口: run 返回 true 表示效果已触发 (可消耗物品), false 表示被冷却/条件拦截。
 */
@FunctionalInterface
public interface LSTItemAction {

    boolean run(Player player, ItemStack item);

    /** 是否需要在触发前检查保护区域 (建筑/交互权限)。 */
    default boolean needsProtectionCheck() {
        return false;
    }
}
