package io.Yomicer.LengShangTech.utils;

import org.bukkit.Bukkit;

/**
 * 服务器 Minecraft 版本比较工具。
 * bukkitVersion 形如 "1.21.4-R0.1-SNAPSHOT", 解析出 1.21.4 与给定版本比较。
 */
public final class LSTVersion {

    private static final int[] VERSION = parse();

    private LSTVersion() {
    }

    private static int[] parse() {
        try {
            String raw = Bukkit.getServer().getBukkitVersion();
            String core = raw.split("-")[0];
            String[] parts = core.split("\\.");
            int major = Integer.parseInt(parts[0]);
            int minor = parts.length > 1 ? Integer.parseInt(parts[1]) : 0;
            int patch = parts.length > 2 ? Integer.parseInt(parts[2]) : 0;
            return new int[] { major, minor, patch };
        } catch (Throwable t) {
            return new int[] { 1, 20, 4 };
        }
    }

    public static int major() {
        return VERSION[0];
    }

    public static int minor() {
        return VERSION[1];
    }

    public static int patch() {
        return VERSION[2];
    }

    /** 当前服务器版本是否 >= 指定版本。 */
    public static boolean atLeast(int major, int minor, int patch) {
        if (VERSION[0] != major) {
            return VERSION[0] > major;
        }
        if (VERSION[1] != minor) {
            return VERSION[1] > minor;
        }
        return VERSION[2] >= patch;
    }
}
