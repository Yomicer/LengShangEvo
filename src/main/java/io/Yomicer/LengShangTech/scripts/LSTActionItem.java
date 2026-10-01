package io.Yomicer.LengShangTech.scripts;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.items.blocks.UnplaceableBlock;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * 冷殇脚本道具基类 (对应 RSC 的 script: 道具/xxx JS)。
 * 不依赖 Slimefun 的 ItemUseHandler 分发 (saveditem 武器栈分发不可靠),
 * 由 {@link LSTItemUseListener} 通过 Bukkit PlayerInteractEvent 直接调用 {@link #tryUse}。
 */
public class LSTActionItem extends UnplaceableBlock {

    /** 所有已注册的脚本道具实例, 供交互监听器匹配。 */
    static final List<LSTActionItem> INSTANCES = new CopyOnWriteArrayList<>();

    private final LSTItemAction action;
    private final long cooldownMillis;
    private final boolean consumeOnUse;
    private final boolean checkProtection;
    private final boolean guideButton;
    private final Map<UUID, Long> lastUse = new HashMap<>();

    public LSTActionItem(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe,
                         long cooldownMillis, boolean consumeOnUse, boolean checkProtection, LSTItemAction action) {
        this(itemGroup, item, recipeType, recipe, cooldownMillis, consumeOnUse, checkProtection, false, action);
    }

    public LSTActionItem(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe,
                         long cooldownMillis, boolean consumeOnUse, boolean checkProtection, boolean guideButton,
                         LSTItemAction action) {
        super(itemGroup, item, recipeType, recipe);
        this.action = action;
        this.cooldownMillis = cooldownMillis;
        this.consumeOnUse = consumeOnUse;
        this.checkProtection = checkProtection;
        this.guideButton = guideButton;
        INSTANCES.add(this);
    }

    /** 指南按钮: 在指南界面里点击即触发 (不走 PlayerInteractEvent)。 */
    public boolean isGuideButton() {
        return guideButton;
    }

    /** 交互监听器入口: 返回 true 表示事件已处理 (应取消原交互)。 */
    public boolean tryUse(Player player, ItemStack item) {
        if (action == null) {
            return false;
        }
        long now = System.currentTimeMillis();
        if (cooldownMillis > 0) {
            Long last = lastUse.get(player.getUniqueId());
            if (last != null && now - last < cooldownMillis) {
                return false;
            }
            lastUse.put(player.getUniqueId(), now);
        }
        if (checkProtection && action.needsProtectionCheck()) {
            if (!SlimefunProtection.canBuild(player, player.getLocation())) {
                return false;
            }
        }
        boolean consumed = action.run(player, item);
        if (consumed && consumeOnUse) {
            consumeOne(item);
        }
        return true;
    }

    private void consumeOne(ItemStack item) {
        if (item == null) {
            return;
        }
        item.setAmount(item.getAmount() - 1);
    }
}
