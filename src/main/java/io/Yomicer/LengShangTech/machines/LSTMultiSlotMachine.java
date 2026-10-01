package io.Yomicer.LengShangTech.machines;

import io.Yomicer.magicExpansion.items.abstracts.AbstractMachine;
import io.Yomicer.LengShangTech.core.LSTReg;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.EnergyNetComponent;
import io.github.thebusybiscuit.slimefun4.core.networks.energy.EnergyNetComponentType;
import io.github.thebusybiscuit.slimefun4.libraries.dough.inventory.InvUtils;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.utils.ChestMenuUtils;
import io.github.thebusybiscuit.slimefun4.utils.SlimefunUtils;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineRecipe;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenuPreset;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * 冷殇大网格多槽位机器 (linked_recipe_machines.yml / workbenches.yml / 特殊 machines.yml)。
 * 语义: 输入/输出槽位可配置 (最大 5x9 网格); 配方按"槽位->物品"精确匹配;
 * capacity 蓄电上限, energyPerCraft 每次加工总耗电 (开始加工时一次扣费);
 * 支持_chance 概率产物、noConsume 不消耗原料 (终极屠宰工厂)。
 */
public class LSTMultiSlotMachine extends AbstractMachine implements EnergyNetComponent {

    public static final class LSTShapedRecipe {
        private final Map<Integer, ItemStack> inputs = new LinkedHashMap<>();
        private final Map<Integer, ItemStack> outputs = new LinkedHashMap<>();
        private final Map<Integer, Double> chances = new LinkedHashMap<>();
        private final int seconds;
        private final boolean noConsume;

        public LSTShapedRecipe(int seconds, boolean noConsume) {
            this.seconds = Math.max(0, seconds);
            this.noConsume = noConsume;
        }

        public LSTShapedRecipe input(int slot, ItemStack item) {
            inputs.put(slot, item);
            return this;
        }

        public LSTShapedRecipe output(int slot, ItemStack item) {
            outputs.put(slot, item);
            return this;
        }

        public LSTShapedRecipe output(int slot, ItemStack item, double chancePercent) {
            outputs.put(slot, item);
            if (chancePercent < 100) {
                chances.put(slot, chancePercent / 10.0); // RSC chance: N => N*10%
            }
            return this;
        }

        Map<Integer, ItemStack> getInputs() {
            return inputs;
        }

        Map<Integer, ItemStack> getOutputs() {
            return outputs;
        }

        Map<Integer, Double> getChances() {
            return chances;
        }

        int getSeconds() {
            return seconds;
        }

        boolean isNoConsume() {
            return noConsume;
        }
    }

    private static final Random RANDOM = new Random();

    private final int[] inputSlots;
    private final int[] outputSlots;
    private final int energyPerCraft;
    private final int capacity;
    private final List<LSTShapedRecipe> recipes = new ArrayList<>();

    /**
     * setupMenu 会在 super() 构造期间被触发, 此时实例字段尚未赋值。
     * 通过 super() 实参里的静态调用先把槽位暂存, setupMenu 从这里取。
     */
    private static int[] lastPendingInput;
    private static int[] lastPendingOutput;

    private static ItemStack[] registerPending(int[] inputSlots, int[] outputSlots, ItemStack[] recipe) {
        lastPendingInput = inputSlots == null ? new int[0] : inputSlots;
        lastPendingOutput = outputSlots == null ? new int[0] : outputSlots;
        return recipe;
    }

    /** 全部实例注册表 (占位物品刷新用)。 */
    static final List<LSTMultiSlotMachine> INSTANCES = new ArrayList<>();

    public LSTMultiSlotMachine(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe,
                               int[] inputSlots, int[] outputSlots, int capacity, int energyPerCraft) {
        super(itemGroup, item, recipeType, registerPending(inputSlots, outputSlots, recipe));
        this.inputSlots = lastPendingInput;
        this.outputSlots = lastPendingOutput;
        this.energyPerCraft = Math.max(0, energyPerCraft);
        this.capacity = Math.max(1, capacity);
        lastPendingInput = null;
        lastPendingOutput = null;
        INSTANCES.add(this);
    }

    /** 占位物品刷新: 附属晚启后把配方里的占位品换回真品。 */
    public void refreshPlaceholders() {
        refreshWithCount();
    }

    /** 刷新并返回替换数量。 */
    int refreshWithCount() {
        int swapped = 0;
        for (LSTShapedRecipe recipe : recipes) {
            for (Map.Entry<Integer, ItemStack> e : recipe.inputs.entrySet()) {
                ItemStack after = LSTReg.refreshPlaceholder(e.getValue());
                if (after != e.getValue()) {
                    recipe.inputs.put(e.getKey(), after);
                    swapped++;
                }
            }
            for (Map.Entry<Integer, ItemStack> e : recipe.outputs.entrySet()) {
                ItemStack after = LSTReg.refreshPlaceholder(e.getValue());
                if (after != e.getValue()) {
                    recipe.outputs.put(e.getKey(), after);
                    swapped++;
                }
            }
        }
        return swapped;
    }

    public LSTMultiSlotMachine addRecipe(LSTShapedRecipe recipe) {
        recipes.add(recipe);
        return this;
    }

    @Nonnull
    @Override
    public EnergyNetComponentType getEnergyComponentType() {
        return EnergyNetComponentType.CONSUMER;
    }

    @Override
    public int getCapacity() {
        return capacity;
    }

    private boolean takeCraftEnergy(Location l) {
        if (energyPerCraft <= 0) {
            return true;
        }
        int charge = getCharge(l);
        if (charge < energyPerCraft) {
            return false;
        }
        setCharge(l, charge - energyPerCraft);
        return true;
    }

    @Override
    @Nullable
    public MachineRecipe findNextRecipe(BlockMenu menu) {
        for (LSTShapedRecipe recipe : recipes) {
            if (!matches(menu, recipe)) {
                continue;
            }
            ItemStack[] outputArray = rollOutputs(recipe);
            if (outputArray.length == 0 || !InvUtils.fitAll(menu.toInventory(), outputArray, outputSlots)) {
                continue;
            }
            if (!takeCraftEnergy(menu.getLocation())) {
                return null;
            }
            if (!recipe.isNoConsume()) {
                for (Map.Entry<Integer, ItemStack> entry : recipe.getInputs().entrySet()) {
                    menu.consumeItem(entry.getKey(), entry.getValue().getAmount());
                }
            }
            return new MachineRecipe(recipe.getSeconds(),
                    recipe.getInputs().values().toArray(new ItemStack[0]),
                    outputArray);
        }
        return null;
    }

    private boolean matches(BlockMenu menu, LSTShapedRecipe recipe) {
        for (Map.Entry<Integer, ItemStack> entry : recipe.getInputs().entrySet()) {
            ItemStack required = entry.getValue();
            if (required == null) {
                return false; // 依赖缺失的原料无法匹配
            }
            ItemStack have = menu.getItemInSlot(entry.getKey());
            if (have == null || have.getAmount() < required.getAmount()
                    || !SlimefunUtils.isItemSimilar(have, required, true)) {
                return false;
            }
        }
        return !recipe.getInputs().isEmpty();
    }

    private ItemStack[] rollOutputs(LSTShapedRecipe recipe) {
        List<ItemStack> results = new ArrayList<>();
        for (Map.Entry<Integer, ItemStack> entry : recipe.getOutputs().entrySet()) {
            ItemStack output = entry.getValue();
            if (output == null) {
                continue; // 依赖缺失的产物跳过
            }
            Double chance = recipe.getChances().get(entry.getKey());
            if (chance != null && RANDOM.nextDouble() >= chance) {
                continue;
            }
            results.add(output.clone());
        }
        return results.toArray(new ItemStack[0]);
    }

    @Override
    protected boolean checkCraftPreconditions(Block b) {
        return true; // 耗电已在开始加工时一次性扣除
    }

    @Override
    public List<ItemStack> getDisplayRecipes() {
        // 渲染时就地刷新占位品, 保证指南显示与实际配方一致
        refreshWithCount();
        List<ItemStack> display = new ArrayList<>();
        int index = 0;
        for (LSTShapedRecipe recipe : recipes) {
            List<ItemStack> rawInputs = new ArrayList<>();
            for (ItemStack input : recipe.getInputs().values()) {
                if (input != null) {
                    rawInputs.add(input);
                }
            }
            List<ItemStack> rawOutputs = new ArrayList<>();
            for (Map.Entry<Integer, ItemStack> e : recipe.getOutputs().entrySet()) {
                if (e.getValue() == null) {
                    continue;
                }
                Double chance = recipe.getChances().get(e.getKey());
                double pct = (chance != null && chance > 0 && chance < 1) ? chance * 100 : 100;
                rawOutputs.add(LSTDisplayUtil.withChance(e.getValue(), pct));
            }
            List<String> header = new ArrayList<>();
            header.add("§8制作时间 §7» §e" + recipe.getSeconds() + " 秒");
            String detailKey = LSTDisplayUtil.registerDetail(getId(), index++, rawInputs, rawOutputs);
            // 上格输入 / 下格输出 (各自完整列出材料+产物, 点击开明细)
            display.add(LSTDisplayUtil.compressRecipe(rawInputs, rawOutputs, header, true, detailKey));
            display.add(LSTDisplayUtil.compressRecipe(rawInputs, rawOutputs, header, false, detailKey));
            // 第二列上下各一个箭头分隔; 最后一条配方后面不再加分割线
            if (index < recipes.size()) {
                display.add(LSTDisplayUtil.arrowDivider());
                display.add(LSTDisplayUtil.arrowDivider());
            }
        }
        return display;
    }

    /** 供配方浏览器使用: 全部配方的完整输入/输出。 */
    public List<LSTRecipeBook.RecipeView> recipeViews() {
        refreshWithCount();
        List<LSTRecipeBook.RecipeView> views = new ArrayList<>();
        int index = 1;
        for (LSTShapedRecipe recipe : recipes) {
            List<ItemStack> inputs = new ArrayList<>();
            for (ItemStack input : recipe.getInputs().values()) {
                if (input != null) {
                    inputs.add(input.clone());
                }
            }
            List<ItemStack> outputs = new ArrayList<>();
            for (ItemStack output : recipe.getOutputs().values()) {
                if (output != null) {
                    outputs.add(output.clone());
                }
            }
            views.add(new LSTRecipeBook.RecipeView("配方 #" + index++, inputs, outputs, recipe.getSeconds()));
        }
        return views;
    }

    @Nonnull
    @Override
    protected ItemStack getProgressBar() {
        LSTMenuRegistry.Layout l = LSTMenuRegistry.get(getId());
        return (l != null && l.progressBar != null) ? l.progressBar : new ItemStack(Material.SOUL_LANTERN);
    }

    @Override
    protected int getProgressSlot() {
        LSTMenuRegistry.Layout l = LSTMenuRegistry.get(getId());
        return (l != null && l.progressSlot >= 0) ? l.progressSlot : super.getProgressSlot();
    }

    @Override
    protected void setupMenu(BlockMenuPreset preset) {
        LSTMenuRegistry.Layout l = LSTMenuRegistry.get(getId());
        if (!LSTMenuRegistry.applyDecorations(preset, l)) {
            preset.addItem(4, new CustomItemStack(Material.SOUL_CAMPFIRE,
                    "§b信息", "§7类型: 冷殇机器", "§7所属附属: 冷殇科技"), ChestMenuUtils.getEmptyClickHandler());
        }
        int[] outputs = outputSlots != null ? outputSlots : lastPendingOutput;
        if (outputs != null) {
            for (int slot : outputs) {
                // 输出槽只挂空点击处理, 不放占位物品 (addItem(null) 会 NPE)
                preset.addMenuClickHandler(slot, ChestMenuUtils.getEmptyClickHandler());
            }
        }
    }

    private static final int[] BACKGROUND_BORDER = new int[0];

    @Override
    protected int[] getInputSlots() {
        return inputSlots != null ? inputSlots : new int[0];
    }

    @Override
    protected int[] getOutputSlots() {
        return outputSlots != null ? outputSlots : new int[0];
    }
}
