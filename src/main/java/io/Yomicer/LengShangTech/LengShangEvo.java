package io.Yomicer.LengShangTech;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import org.bukkit.plugin.java.JavaPlugin;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * 冷殇科技 (LengShangTech) 独立版 —— LengShangEvo。
 * 从原 MagicExpansion 主插件中完全剥离, 作为独立的 Slimefun4 附属运行。
 * 全部内容 (物品/机器/生成器/盔甲/脚本效果/研究/GEO/聚宝阁) 由 {@link LengShangTechSetup} 注册。
 */
public final class LengShangEvo extends JavaPlugin implements SlimefunAddon {

    private static LengShangEvo instance;

    @Override
    public void onEnable() {
        instance = this;
        getLogger().info("LengShangEvo (冷殇科技独立版) 正在启动...");
        LengShangTechSetup.setup(this);
    }

    @Override
    public void onDisable() {
        instance = null;
    }

    public static LengShangEvo getInstance() {
        return instance;
    }

    @Nonnull
    @Override
    public JavaPlugin getJavaPlugin() {
        return this;
    }

    @Nullable
    @Override
    public String getBugTrackerURL() {
        return null;
    }
}
