package io.Yomicer.LengShangTech.utils;

import org.bukkit.Bukkit;

import java.util.logging.Level;

/** 冷殇科技统一日志出口。 */
public final class LSTLog {

    private static final String PREFIX = "[冷殇科技] ";

    private LSTLog() {
    }

    public static void info(String message) {
        Bukkit.getLogger().info(PREFIX + message);
    }

    public static void warn(String message) {
        Bukkit.getLogger().warning(PREFIX + message);
    }

    public static void error(String message, Throwable t) {
        Bukkit.getLogger().log(Level.SEVERE, PREFIX + message, t);
    }
}
