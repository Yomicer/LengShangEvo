package io.Yomicer.LengShangTech;

import io.Yomicer.LengShangTech.gen.LSTGroups;
import io.Yomicer.LengShangTech.core.LSTReg;
import io.Yomicer.LengShangTech.gen.LSTBoot;
import io.Yomicer.LengShangTech.machines.LSTSpecialMachines;
import io.Yomicer.LengShangTech.scripts.LSTScriptBindings;
import io.Yomicer.LengShangTech.scripts.effects.LSTShopMenu;
import io.Yomicer.LengShangTech.utils.LSTLog;
import io.Yomicer.LengShangTech.LengShangEvo;
import org.bukkit.Bukkit;

import javax.annotation.Nonnull;

/**
 * 冷殇科技总入口: 把 RSC 配置包的完整内容以 Java 形式注册进 LengShangEvo。
 * 注册顺序: 物品本体 → 普通物品 → 机器/电容/发电机 → 盔甲/掉落/GEO → 特殊机器 → 组别按钮 →
 *           事件监听 → (下一刻) 材料生成器/研究 → 商店。
 */
public final class LengShangTechSetup {

    private LengShangTechSetup() {
    }

    public static void setup(@Nonnull LengShangEvo plugin) {
        LSTLog.info("开始加载 冷殇科技 (Java 版)...");
        try {
            // 1. 创建全部物品本体 (写入 LSTReg.INDEX)
            LSTBoot.createItems();
            LSTLog.info("物品本体创建完毕 (" + LSTReg.INDEX.size() + " 个)");

            // 2. 触发组别树初始化 (静态字段)
            LSTGroups.MISC.getKey();

            // 3. 注册普通物品 (方块/展示物/脚本道具)
            LSTBoot.registerItems(plugin);
            LSTLog.info("普通物品注册完毕");

            // 4. 机器 / 电容 / 发电机 / 太阳能 / 连接器 / 生物掉落 / GEO / 盔甲
            LSTBoot.setupMain(plugin);
            LSTLog.info("机器注册完毕");

            // 5. 材料生成器与研究 (同步注册, 避免触发 Slimefun 的 runtime 注册警告)
            LSTBoot.setupDelayed(plugin);
            LSTSpecialMachines.registerAll(plugin);
            LSTScriptBindings.registerGuideButtons(plugin);
            io.Yomicer.LengShangTech.utils.LSTLanguage.load();
            LSTShopMenu.load();
            LSTLog.info("冷殇科技加载完成! 全部内容已注册 (" + LSTReg.INDEX.size() + " 个物品)。");

            // 6. 事件监听器
            LSTScriptBindings.registerListeners(plugin);

            // 7. 占位物品刷新: 等附属全部启用完成后, 把晚启附属的物品换回真品
            io.Yomicer.LengShangTech.machines.LSTPlaceholderRefresher.schedule(plugin);
        } catch (Throwable t) {
            LSTLog.error("冷殇科技加载失败", t);
        }
    }
}
