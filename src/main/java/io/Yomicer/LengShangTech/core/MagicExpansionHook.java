package io.Yomicer.LengShangTech.core;

import io.Yomicer.LengShangTech.LengShangEvo;
import org.bukkit.NamespacedKey;
import org.bukkit.plugin.Plugin;

import java.util.Locale;

/** 生成代码访问主插件实例的统一入口。 */
public final class MagicExpansionHook {

    private MagicExpansionHook() {
    }

    public static Plugin plugin() {
        return LengShangEvo.getInstance();
    }

    public static NamespacedKey key(String name) {
        return new NamespacedKey(LengShangEvo.getInstance(), name.toLowerCase(Locale.ROOT)
                .replaceAll("[^a-z0-9_.-]", "_"));
    }}
