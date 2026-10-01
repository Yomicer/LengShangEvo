package io.Yomicer.LengShangTech.scripts;

import io.github.thebusybiscuit.slimefun4.implementation.Slimefun;
import io.github.thebusybiscuit.slimefun4.libraries.dough.protection.Interaction;
import org.bukkit.Location;
import org.bukkit.entity.Player;

/** 保护区域检查: 优先使用粘液自身的保护管理器, 异常时放行。 */
public final class SlimefunProtection {

    private SlimefunProtection() {
    }

    public static boolean canBuild(Player player, Location location) {
        try {
            return Slimefun.getProtectionManager().hasPermission(player, location, Interaction.BREAK_BLOCK);
        } catch (Throwable t) {
            return true;
        }
    }
}
