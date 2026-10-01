package io.Yomicer.LengShangTech.machines;

import io.Yomicer.LengShangTech.utils.LSTLog;
import io.Yomicer.LengShangTech.LengShangEvo;
import org.bukkit.Bukkit;

/**
 * 占位物品自动刷新: 全部插件启用完成后再跑一轮,
 * 把配方里"附属晚启导致没解析到"的占位品换回真品。
 * RSC 配置包插件可能晚于本插件启用, 且 RSC 支持 lateInit 物品 (启动后延迟注册),
 * 因此采用多轮刷新: 2s/5s/10s/20s/30s/60s/90s, 连续两轮零替换则提前停止。
 */
public final class LSTPlaceholderRefresher {

    /** 刷新轮次间隔 (tick): 2s, 5s, 10s, 20s, 30s, 60s, 90s。 */
    private static final long[] ROUND_DELAYS = { 40L, 60L, 100L, 200L, 200L, 600L, 600L };

    private int round;
    private int consecutiveZeroRounds;
    private int totalSwapped;

    private LSTPlaceholderRefresher() {
    }

    public static void schedule(LengShangEvo plugin) {
        new LSTPlaceholderRefresher().start(plugin);
    }

    private void start(LengShangEvo plugin) {
        if (round >= ROUND_DELAYS.length || consecutiveZeroRounds >= 2) {
            if (totalSwapped > 0) {
                LSTLog.info("占位物品刷新完成: 累计替换 " + totalSwapped + " 个缺失依赖为真实物品");
            }
            return;
        }
        long delay = ROUND_DELAYS[round++];
        Bukkit.getScheduler().runTaskLater(plugin, () -> {
            int swapped = refreshAll();
            totalSwapped += swapped;
            consecutiveZeroRounds = swapped == 0 ? consecutiveZeroRounds + 1 : 0;
            if (swapped > 0) {
                LSTLog.info("占位物品刷新(第 " + round + " 轮): 替换 " + swapped + " 个缺失依赖为真实物品");
            }
            start(plugin);
        }, delay);
    }

    private int refreshAll() {
        int swapped = 0;
        for (LSTRecipeMachine machine : LSTRecipeMachine.INSTANCES) {
            swapped += machine.refreshWithCount();
        }
        for (LSTMultiSlotMachine machine : LSTMultiSlotMachine.INSTANCES) {
            swapped += machine.refreshWithCount();
        }
        for (LSTMaterialGenerator machine : LSTMaterialGenerator.INSTANCES) {
            swapped += machine.refreshWithCount();
        }
        // 物品自身的合成配方 (指南里显示的 9 格配方) 也可能有占位品
        swapped += io.Yomicer.LengShangTech.core.LSTReg.refreshItemRecipes();
        return swapped;
    }
}
