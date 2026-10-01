package io.Yomicer.LengShangTech.machines;

import io.Yomicer.magicExpansion.items.abstracts.MenuBlock;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.EnergyNetProvider;
import io.github.thebusybiscuit.slimefun4.core.networks.energy.EnergyNetComponentType;
import io.github.thebusybiscuit.slimefun4.implementation.Slimefun;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.utils.ChestMenuUtils;
import com.xzavier0722.mc.plugin.slimefun4.storage.util.StorageCacheUtils;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenuPreset;
import me.mrCookieSlime.Slimefun.api.inventory.DirtyChestMenu;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 冷殇燃料发电机 (generators.yml)。
 * 语义: 燃料表 fuels 定义 每个燃料燃烧 seconds 秒; production 为 J/s;
 * 粘液刻每 0.5 秒调用一次 getGeneratedOutput, 每刻产出 production/2 J。
 */
public class LSTFuelGenerator extends MenuBlock implements EnergyNetProvider {

    /** 燃烧剩余粘液刻缓存 (服务器重启后丢失, 只影响重新点火)。 */
    private static final Map<Location, Integer> BURN_TICKS = new ConcurrentHashMap<>();
    private static final Map<Location, Integer> BURN_TOTAL = new ConcurrentHashMap<>();

    public static final class Fuel {
        private final ItemStack fuel;
        private final int seconds;
        private final ItemStack[] burnOutputs;

        public Fuel(ItemStack fuel, int seconds) {
            this(fuel, seconds, new ItemStack[0]);
        }

        public Fuel(ItemStack fuel, int seconds, ItemStack[] burnOutputs) {
            this.fuel = fuel;
            this.seconds = Math.max(1, seconds);
            this.burnOutputs = burnOutputs == null ? new ItemStack[0] : burnOutputs;
        }

        public ItemStack getFuel() {
            return fuel;
        }

        public int getSeconds() {
            return seconds;
        }

        public ItemStack[] getBurnOutputs() {
            return burnOutputs;
        }
    }

    private static final int[] INPUT_SLOTS = new int[] {
            0, 1, 2, 3, 9, 10, 11, 12, 18, 19, 20, 21, 27, 28, 29, 30, 36, 37, 38, 39, 45, 46, 47, 48
    };
    private static final int[] BACKGROUND_SLOTS = new int[] {
            4, 5, 6, 7, 8, 13, 14, 15, 16, 17, 22, 23, 24, 25, 26, 31, 32, 33, 34, 35, 43, 44, 52, 53
    };

    private final int capacity;
    private final int productionPerSecond;
    private final List<Fuel> fuels = new ArrayList<>();
    private boolean needsOutputs;

    public LSTFuelGenerator(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe,
                            int capacity, int productionPerSecond) {
        super(itemGroup, item, recipeType, recipe);
        this.capacity = capacity;
        this.productionPerSecond = Math.max(1, productionPerSecond);
    }

    public LSTFuelGenerator addFuel(ItemStack fuel, int seconds) {
        fuels.add(new Fuel(fuel, seconds));
        return this;
    }

    public LSTFuelGenerator addFuel(ItemStack fuel, int seconds, ItemStack[] burnOutputs) {
        needsOutputs = true;
        fuels.add(new Fuel(fuel, seconds, burnOutputs));
        return this;
    }

    private static final int[] OUTPUT_SLOTS = new int[] { 40, 41, 42, 49, 50, 51 };

    public List<Fuel> getFuels() {
        return fuels;
    }

    public int getProductionPerSecond() {
        return productionPerSecond;
    }

    @Override
    public int getCapacity() {
        return capacity;
    }

    @Nonnull
    @Override
    public EnergyNetComponentType getEnergyComponentType() {
        return EnergyNetComponentType.GENERATOR;
    }

    @Override
    public int getGeneratedOutput(@Nonnull Location l, com.xzavier0722.mc.plugin.slimefun4.storage.controller.SlimefunBlockData data) {
        BlockMenu menu = StorageCacheUtils.getMenu(l);
        if (menu == null) {
            return 0;
        }
        Integer burn = BURN_TICKS.get(l);
        if (burn != null && burn > 0) {
            int left = burn - 1;
            if (left == 0) {
                BURN_TICKS.remove(l);
                int totalTicks = BURN_TOTAL.getOrDefault(l, 0);
                BURN_TOTAL.remove(l);
                pushBurnOutputs(menu, totalTicks);
            } else {
                BURN_TICKS.put(l, left);
            }
            return productionPerSecond / 2;
        }

        for (int slot : getInputSlots()) {
            ItemStack item = menu.getItemInSlot(slot);
            if (item == null || item.getType() == Material.AIR) {
                continue;
            }
            for (Fuel fuel : fuels) {
                if (item.isSimilar(fuel.getFuel()) || io.github.thebusybiscuit.slimefun4.utils.SlimefunUtils.isItemSimilar(item, fuel.getFuel(), true)) {
                    menu.consumeItem(slot, 1);
                    BURN_TICKS.put(l, fuel.getSeconds() * 2 - 1);
                    BURN_TOTAL.put(l, fuel.getSeconds() * 2);
                    return productionPerSecond / 2;
                }
            }
        }
        return 0;
    }

    private void pushBurnOutputs(BlockMenu menu, int totalTicks) {
        if (!needsOutputs || totalTicks <= 0) {
            return;
        }
        for (Fuel fuel : fuels) {
            if (fuel.getSeconds() * 2 == totalTicks && fuel.getBurnOutputs().length > 0) {
                for (ItemStack out : fuel.getBurnOutputs()) {
                    menu.pushItem(out.clone(), getOutputSlots());
                }
                return;
            }
        }
    }

    @Override
    protected void setup(BlockMenuPreset blockMenuPreset) {
        LSTMenuRegistry.Layout l = layout();
        if (LSTMenuRegistry.applyDecorations(blockMenuPreset, l)) {
            return;
        }
        blockMenuPreset.drawBackground(new CustomItemStack(Material.PINK_STAINED_GLASS_PANE, " "), BACKGROUND_SLOTS);
        blockMenuPreset.addItem(4, new CustomItemStack(Material.SOUL_CAMPFIRE,
                "§b信息", "§7类型: 燃料发电机", "§7所属附属: 冷殇科技",
                "§7输出功率: §e" + productionPerSecond + " J/s"), ChestMenuUtils.getEmptyClickHandler());
    }

    /** 菜单布局 (RSC menus.yml, 懒查缓存; 无字段初始化器避免 super() 期间被重置)。 */
    private boolean layoutInit;
    private LSTMenuRegistry.Layout menuLayout;

    private LSTMenuRegistry.Layout layout() {
        if (!layoutInit) {
            menuLayout = LSTMenuRegistry.get(getId());
            layoutInit = true;
        }
        return menuLayout;
    }

    @Nonnull
    @Override
    protected int[] getInputSlots(DirtyChestMenu dirtyChestMenu, ItemStack itemStack) {
        return getInputSlots();
    }

    @Override
    protected int[] getInputSlots() {
        LSTMenuRegistry.Layout l = layout();
        return (l != null && l.input.length > 0) ? l.input : INPUT_SLOTS;
    }

    @Override
    protected int[] getOutputSlots() {
        if (!needsOutputs) {
            return new int[0];
        }
        LSTMenuRegistry.Layout l = layout();
        return (l != null && l.output.length > 0) ? l.output : OUTPUT_SLOTS;
    }

    @Nullable
    public Map<Location, Integer> snapshotBurn() {
        return new HashMap<>(BURN_TICKS);
    }

    @SuppressWarnings("unused")
    private static void unusedReference() {
        // Slimefun 引用占位, 防止裁剪误报
        Slimefun.getRegistry();
    }
}
