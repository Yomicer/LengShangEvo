package io.Yomicer.LengShangTech.utils;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.core.attributes.Rechargeable;
import org.bukkit.inventory.ItemStack;

/** 充能物品电量读写 (Slimefun Rechargeable)。 */
public final class LSTCharge {

    private LSTCharge() {
    }

    /** 获取物品当前电量; 不可充能物品返回 0。 */
    public static float getCharge(ItemStack item) {
        SlimefunItem sfItem = SlimefunItem.getByItem(item);
        if (sfItem instanceof Rechargeable rechargeable) {
            return rechargeable.getItemCharge(item);
        }
        return 0;
    }

    public static int getChargeInt(ItemStack item) {
        return (int) getCharge(item);
    }

    /** 设置物品电量; 不可充能物品忽略。 */
    public static void setCharge(ItemStack item, float charge) {
        SlimefunItem sfItem = SlimefunItem.getByItem(item);
        if (sfItem instanceof Rechargeable rechargeable) {
            rechargeable.setItemCharge(item, Math.max(0, Math.min(charge, rechargeable.getMaxItemCharge(item))));
        }
    }
}
