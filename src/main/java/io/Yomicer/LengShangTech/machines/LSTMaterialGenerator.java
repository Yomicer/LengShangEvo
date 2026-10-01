package io.Yomicer.LengShangTech.machines;

import io.Yomicer.magicExpansion.items.abstracts.AbstractElectricResourceMachine;
import io.Yomicer.LengShangTech.core.LSTReg;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.libraries.dough.inventory.InvUtils;
import io.github.thebusybiscuit.slimefun4.utils.ChestMenuUtils;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineRecipe;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenuPreset;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * 冷殇材料生成器 (mat_generators.yml)。
 * 语义: 每 tickRate 个粘液刻 (tickRate/2 秒) 无中生有产出一次;
 * capacity 为蓄电上限, per 为每次产出的总耗电 (开始产出时一次性扣费)。
 * outputs 为产物池: chooseOne=true 时随机取一个, 否则整组产出。
 */
public class LSTMaterialGenerator extends AbstractElectricResourceMachine {

    private static final int[] BACKGROUND_SLOTS = new int[] { 0, 4, 8, 9, 13, 17 };
    private static final int[] OUTPUT_BORDER_SLOTS = new int[] { 10, 11, 12, 14, 15, 16 };
    private static final int[] INPUT_BORDER_SLOTS = new int[] { 1, 2, 3, 5, 6, 7 };
    private static final int[] OUTPUT_SLOTS = new int[] {
            18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35,
            36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53
    };

    private static final ItemStack PROGRESS_ITEM = new ItemStack(Material.SOUL_LANTERN);
    private static final Random RANDOM = new Random();

    private final int energyPerProduction;
    private final int craftSeconds;
    private final ItemStack[] outputPool;
    private final boolean chooseOne;

    /** 全部实例注册表 (占位物品刷新用)。 */
    static final List<LSTMaterialGenerator> INSTANCES = new ArrayList<>();

    public LSTMaterialGenerator(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe,
                                int capacity, int energyPerProduction, int tickRate, ItemStack[] outputPool, boolean chooseOne) {
        super(itemGroup, item, recipeType, recipe);
        this.energyPerProduction = Math.max(1, energyPerProduction);
        this.craftSeconds = Math.max(1, tickRate / 2);
        // 依赖缺失的产物解析为 null, 这里统一过滤, 保证生成器不产出空气
        this.outputPool = Arrays.stream(outputPool).filter(java.util.Objects::nonNull)
                .map(ItemStack::clone).toArray(ItemStack[]::new);
        this.chooseOne = chooseOne && this.outputPool.length > 0;
        setCapacity(Math.max(1, capacity));
        setConsumption(1); // 逐刻扣费被禁用, 改为产出时一次性扣 energyPerProduction
        INSTANCES.add(this);
    }

    /** 占位物品刷新: 附属晚启后把产物池里的占位品换回真品。 */
    public void refreshPlaceholders() {
        refreshWithCount();
    }

    /** 刷新并返回替换数量。 */
    int refreshWithCount() {
        int swapped = 0;
        for (int i = 0; i < outputPool.length; i++) {
            ItemStack after = LSTReg.refreshPlaceholder(outputPool[i]);
            if (after != outputPool[i]) {
                outputPool[i] = after;
                swapped++;
            }
        }
        return swapped;
    }

    @Override
    protected boolean checkCraftPreconditions(Block b) {
        return true;
    }

    private boolean takeProductionEnergy(Location l) {
        int charge = getCharge(l);
        if (charge < energyPerProduction) {
            return false;
        }
        setCharge(l, charge - energyPerProduction);
        return true;
    }

    private ItemStack[] pickOutputs() {
        if (!chooseOne || outputPool.length <= 1) {
            return outputPool;
        }
        return new ItemStack[] { outputPool[RANDOM.nextInt(outputPool.length)] };
    }

    @Override
    @Nullable
    public MachineRecipe findNextRecipe(BlockMenu menu) {
        if (outputPool.length == 0) {
            return null;
        }
        int maxedSlots = 0;
        for (int slot : getOutputSlots()) {
            ItemStack item = menu.getItemInSlot(slot);
            if (item != null && item.getAmount() == item.getMaxStackSize()) {
                maxedSlots++;
            }
        }
        if (maxedSlots == getOutputSlots().length) {
            return null;
        }
        if (!takeProductionEnergy(menu.getLocation())) {
            return null;
        }
        return new MachineRecipe(craftSeconds, new ItemStack[] { new ItemStack(Material.AIR) }, pickOutputs());
    }

    @Override
    public List<ItemStack> getDisplayRecipes() {
        refreshWithCount();
        List<ItemStack> display = new ArrayList<>();
        List<String> header = new ArrayList<>();
        header.add("§8生产效率 §7» §e每 " + craftSeconds + " 秒一次");
        header.add("§8生产能耗 §7» §e" + energyPerProduction + " J/次");
        if (chooseOne && outputPool.length > 1) {
            header.add("§8产出方式 §7» §e每次随机产出其中一种");
        }
        // 上格输入 (生成器无输入, 自动产出) / 下格输出 (完整列出产物, 点击开明细)
        // 只有一条配方 (产物池), 是最后一条, 后面不加分割线
        List<ItemStack> outs = new ArrayList<>();
        // chooseOne: 每次随机产出其一, 每种概率 = 100/池大小; 否则整组必出
        double pct = (chooseOne && outputPool.length > 1) ? 100.0 / outputPool.length : 100;
        for (ItemStack out : outputPool) {
            outs.add(LSTDisplayUtil.withChance(out, pct));
        }
        String detailKey = LSTDisplayUtil.registerDetail(getId(), 0, java.util.Collections.emptyList(), outs);
        display.add(LSTDisplayUtil.compressRecipe(java.util.Collections.emptyList(), outs, header, true, detailKey));
        display.add(LSTDisplayUtil.compressRecipe(java.util.Collections.emptyList(), outs, header, false, detailKey));
        return display;
    }

    @Override
    protected ItemStack getProgressBar() {
        return PROGRESS_ITEM;
    }

    /** 菜单布局 (RSC menus.yml, 懒查缓存; 无字段初始化器避免 super() 期间被重置)。 */
    private boolean layoutInit;
    private LSTMenuRegistry.Layout menuLayout;
    private int[] cachedOutputs;

    private LSTMenuRegistry.Layout layout() {
        if (!layoutInit) {
            menuLayout = LSTMenuRegistry.get(getId());
            layoutInit = true;
        }
        return menuLayout;
    }

    @Override
    protected int getProgressSlot() {
        LSTMenuRegistry.Layout l = layout();
        return (l != null && l.progressSlot >= 0) ? l.progressSlot : super.getProgressSlot();
    }

    @Override
    protected void setupMenu(BlockMenuPreset preset) {
        LSTMenuRegistry.Layout l = layout();
        if (LSTMenuRegistry.applyDecorations(preset, l)) {
            // 进度指示槽若未被装饰占用, 补一个空闲背景 (该槽已从产物槽里排除)
            int ps = getProgressSlot();
            if (!l.decorations.containsKey(ps)) {
                preset.addItem(ps, new CustomItemStack(Material.BLACK_STAINED_GLASS_PANE, " "), ChestMenuUtils.getEmptyClickHandler());
            }
            return;
        }
        preset.drawBackground(new CustomItemStack(Material.PINK_STAINED_GLASS_PANE, " "), BACKGROUND_SLOTS);
        preset.drawBackground(new CustomItemStack(Material.LIGHT_BLUE_STAINED_GLASS_PANE, " "), INPUT_BORDER_SLOTS);
        preset.drawBackground(new CustomItemStack(Material.LIME_STAINED_GLASS_PANE, " "), OUTPUT_BORDER_SLOTS);
        preset.addItem(4, new CustomItemStack(Material.SOUL_CAMPFIRE,
                "§b信息", "§7类型: 材料生成器", "§7所属附属: 冷殇科技"), ChestMenuUtils.getEmptyClickHandler());
        preset.addItem(13, new CustomItemStack(Material.PINK_STAINED_GLASS_PANE, " "), ChestMenuUtils.getEmptyClickHandler());
    }

    @Override
    protected int[] getInputSlots() {
        return new int[0];
    }

    @Override
    protected int[] getOutputSlots() {
        if (cachedOutputs != null) {
            return cachedOutputs;
        }
        LSTMenuRegistry.Layout l = layout();
        if (l != null && l.output.length > 0) {
            // 从产物槽里排除进度指示槽, 避免产物覆盖进度条
            int ps = getProgressSlot();
            int[] src = l.output;
            int[] tmp = new int[src.length];
            int n = 0;
            for (int s : src) {
                if (s != ps) {
                    tmp[n++] = s;
                }
            }
            cachedOutputs = java.util.Arrays.copyOf(tmp, n);
        } else {
            cachedOutputs = OUTPUT_SLOTS;
        }
        return cachedOutputs;
    }

    @Override
    public boolean isSynchronized() {
        return false;
    }
}
