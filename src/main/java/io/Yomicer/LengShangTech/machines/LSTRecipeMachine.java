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
import io.github.thebusybiscuit.slimefun4.utils.itemstack.ItemStackWrapper;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.ChestMenu;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineRecipe;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenuPreset;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * 冷殇标准配方机器 (recipe_machines.yml)。
 * 与 RecipeMachine 相同的 24 进/24 出槽位布局, 但耗电语义按 RSC:
 * capacity 为蓄电上限, energyPerCraft 为每次加工的总耗电 (开始加工时一次性扣除)。
 * 配方输入按物品匹配 (不限槽位), 支持概率产物。
 */
public class LSTRecipeMachine extends AbstractMachine implements EnergyNetComponent {

    public static final int[] INPUT_SLOTS = { 0, 1, 2, 3, 9, 10, 11, 12, 18, 19, 20, 21, 27, 28, 29, 30, 36, 37, 38, 39, 45, 46, 47, 48 };
    public static final int[] OUTPUT_SLOTS = { 5, 6, 7, 8, 14, 15, 16, 17, 23, 24, 25, 26, 32, 33, 34, 35, 41, 42, 43, 44, 50, 51, 52, 53 };

    private static final int[] BACKGROUND_SLOTS = { 4, 49 };
    private static final Random RANDOM = new Random();

    private final int capacity;
    private final int energyPerCraft;
    private final List<LSTProcessRecipe> recipes = new ArrayList<>();
    private ItemStack progressBar = new ItemStack(Material.SOUL_LANTERN);

    /** 全部实例注册表 (占位物品刷新用)。 */
    static final List<LSTRecipeMachine> INSTANCES = new ArrayList<>();

    /** 单条加工配方: 输入(物品+数量) -> 输出(物品, 可带概率), seconds 为加工秒数, noConsume 不消耗原料。 */
    public static final class LSTProcessRecipe {
        private final ItemStack[] inputs;
        private final ItemStack[] outputs;
        private final double[] chances; // 0..1, 与 outputs 对齐; >=1 表示必出
        private final int seconds;
        private final boolean noConsume;

        public LSTProcessRecipe(int seconds, ItemStack[] inputs, ItemStack[] outputs, double[] chances) {
            this(seconds, inputs, outputs, chances, false);
        }

        public LSTProcessRecipe(int seconds, ItemStack[] inputs, ItemStack[] outputs, double[] chances, boolean noConsume) {
            this.seconds = Math.max(0, seconds);
            this.inputs = inputs;
            this.outputs = outputs;
            this.chances = chances;
            this.noConsume = noConsume;
        }

        public ItemStack[] getInputs() {
            return inputs;
        }

        public ItemStack[] getOutputs() {
            return outputs;
        }

        public double[] getChances() {
            return chances;
        }

        public int getSeconds() {
            return seconds;
        }

        public boolean isNoConsume() {
            return noConsume;
        }
    }

    public LSTRecipeMachine(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe,
                            int capacity, int energyPerCraft) {
        super(itemGroup, item, recipeType, recipe);
        this.capacity = Math.max(1, capacity);
        this.energyPerCraft = Math.max(0, energyPerCraft);
        INSTANCES.add(this);
    }

    /** 占位物品刷新: 附属晚启后把配方里的占位品换回真品。 */
    public void refreshPlaceholders() {
        refreshWithCount();
    }

    /** 刷新并返回替换数量。 */
    int refreshWithCount() {
        int swapped = 0;
        for (LSTProcessRecipe recipe : recipes) {
            swapped += refreshArray(recipe.inputs);
            swapped += refreshArray(recipe.outputs);
        }
        return swapped;
    }

    private static int refreshArray(ItemStack[] arr) {
        int swapped = 0;
        for (int i = 0; i < arr.length; i++) {
            ItemStack before = arr[i];
            ItemStack after = LSTReg.refreshPlaceholder(before);
            if (after != before) {
                arr[i] = after;
                swapped++;
            }
        }
        return swapped;
    }

    public LSTRecipeMachine addRecipe(int seconds, ItemStack[] inputs, ItemStack[] outputs, double[] chances) {
        recipes.add(new LSTProcessRecipe(seconds, inputs, outputs, chances));
        return this;
    }

    /** 全部必出的简化注册。 */
    public LSTRecipeMachine addRecipe(int seconds, ItemStack[] inputs, ItemStack[] outputs) {
        return addRecipe(seconds, inputs, outputs, null);
    }

    /** noConsume: 原料不被消耗 (终极屠宰工厂检测型配方)。 */
    public LSTRecipeMachine addRecipe(int seconds, ItemStack[] inputs, ItemStack[] outputs, double[] chances, boolean noConsume) {
        recipes.add(new LSTProcessRecipe(seconds, inputs, outputs, chances, noConsume));
        return this;
    }

    public LSTRecipeMachine setHiddenRecipes() {
        setHidden(true);
        return this;
    }

    public LSTRecipeMachine build() {
        return this;
    }

    public LSTRecipeMachine setProgressBarItem(ItemStack item) {
        if (item != null) {
            this.progressBar = item;
        }
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
        Map<Integer, ItemStack> inv = new HashMap<>();
        for (int slot : INPUT_SLOTS) {
            ItemStack item = menu.getItemInSlot(slot);
            if (item != null && item.getType() != Material.AIR) {
                inv.put(slot, ItemStackWrapper.wrap(item));
            }
        }
        if (inv.isEmpty()) {
            return null;
        }

        int maxed = 0;
        for (int slot : OUTPUT_SLOTS) {
            ItemStack item = menu.getItemInSlot(slot);
            if (item != null && item.getAmount() == item.getMaxStackSize()) {
                maxed++;
            }
        }
        if (maxed == OUTPUT_SLOTS.length) {
            return null;
        }

        for (LSTProcessRecipe recipe : recipes) {
            Map<Integer, Integer> found = new HashMap<>();
            for (ItemStack input : recipe.getInputs()) {
                if (input == null) {
                    continue; // 依赖缺失的原料跳过 (由注册守卫兜底)
                }
                boolean matched = false;
                for (int slot : INPUT_SLOTS) {
                    if (SlimefunUtils.isItemSimilar(inv.get(slot), input, true)) {
                        found.put(slot, input.getAmount());
                        matched = true;
                        break;
                    }
                }
                if (!matched) {
                    found.clear();
                    break;
                }
            }
            if (found.size() != recipe.getInputs().length || found.isEmpty()) {
                continue;
            }
            ItemStack[] outputs = rollOutputs(recipe);
            if (outputs.length == 0 || !InvUtils.fitAll(menu.toInventory(), outputs, OUTPUT_SLOTS)) {
                continue;
            }
            if (!takeCraftEnergy(menu.getLocation())) {
                return null;
            }
            if (!recipe.isNoConsume()) {
                for (Map.Entry<Integer, Integer> entry : found.entrySet()) {
                    menu.consumeItem(entry.getKey(), entry.getValue());
                }
            }
            return new MachineRecipe(recipe.getSeconds(), recipe.getInputs(), outputs);
        }
        return null;
    }

    private ItemStack[] rollOutputs(LSTProcessRecipe recipe) {
        double[] chances = recipe.getChances();
        List<ItemStack> results = new ArrayList<>();
        for (int i = 0; i < recipe.getOutputs().length; i++) {
            ItemStack output = recipe.getOutputs()[i];
            if (output == null) {
                continue; // 依赖缺失的产物跳过
            }
            if (chances != null && i < chances.length && chances[i] < 1 && RANDOM.nextDouble() >= chances[i]) {
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
        for (LSTProcessRecipe recipe : recipes) {
            List<ItemStack> rawInputs = new ArrayList<>();
            for (ItemStack input : recipe.getInputs()) {
                if (input != null) {
                    rawInputs.add(input);
                }
            }
            List<ItemStack> rawOutputs = new ArrayList<>();
            ItemStack[] outs = recipe.getOutputs();
            double[] chances = recipe.getChances();
            for (int i = 0; i < outs.length; i++) {
                if (outs[i] == null) {
                    continue;
                }
                double pct = (chances != null && i < chances.length && chances[i] > 0 && chances[i] < 1)
                        ? chances[i] * 100 : 100;
                rawOutputs.add(LSTDisplayUtil.withChance(outs[i], pct));
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
        for (LSTProcessRecipe recipe : recipes) {
            List<ItemStack> inputs = new ArrayList<>();
            for (ItemStack input : recipe.getInputs()) {
                if (input != null) {
                    inputs.add(input.clone());
                }
            }
            List<ItemStack> outputs = new ArrayList<>();
            for (ItemStack output : recipe.getOutputs()) {
                if (output != null) {
                    outputs.add(output.clone());
                }
            }
            views.add(new LSTRecipeBook.RecipeView("配方 #" + index++, inputs, outputs, recipe.getSeconds()));
        }
        return views;
    }

    private ItemStack addLore(ItemStack item, String line) {
        var meta = item.getItemMeta();
        List<String> lore = meta.hasLore() ? new ArrayList<>(meta.getLore()) : new ArrayList<>();
        lore.add(line);
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }

    /** 菜单布局 (来自 RSC menus.yml, 懒查并缓存; 无字段初始化器, 避免 super() 期间被重置)。 */
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
    protected ItemStack getProgressBar() {
        LSTMenuRegistry.Layout l = layout();
        if (l != null && l.progressBar != null) {
            return l.progressBar;
        }
        // 字段初始化发生在 super() 之后, 构造期间会短暂为 null
        return progressBar != null ? progressBar : new ItemStack(Material.SOUL_LANTERN);
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
            // RSC menus.yml 还原完成 (装饰含进度条槽空闲背景)
        } else {
            // 无 RSC 布局时的默认布局 (兼容兜底) + 配方浏览器按钮
            preset.drawBackground(new CustomItemStack(Material.PINK_STAINED_GLASS_PANE, " "), BACKGROUND_SLOTS);
            preset.addItem(13, new CustomItemStack(Material.LIGHT_BLUE_STAINED_GLASS_PANE, " "), ChestMenuUtils.getEmptyClickHandler());
            preset.addItem(40, new CustomItemStack(Material.LIME_STAINED_GLASS_PANE, " "), ChestMenuUtils.getEmptyClickHandler());
            preset.addItem(22, new CustomItemStack(Material.NETHER_STAR,
                    "§b配方列表 §7(点击查看全部配方)", "§7每条配方的材料与产物", "§7均在此浏览器中分页展示"), (player, slot, item, action) -> {
                LSTRecipeBook.open(player, this.getItemName(), recipeViews());
                return false;
            });
        }
        for (int slot : getOutputSlots()) {
            preset.addMenuClickHandler(slot, new ChestMenu.AdvancedMenuClickHandler() {
                @Override
                public boolean onClick(InventoryClickEvent e, Player p, int slot, ItemStack cursor, me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.ClickAction action) {
                    return cursor.getType().isAir();
                }

                @Override
                public boolean onClick(Player p, int slot, ItemStack item, me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.ClickAction action) {
                    return false;
                }
            });
        }
    }

    @Override
    protected int[] getInputSlots() {
        LSTMenuRegistry.Layout l = layout();
        return (l != null && l.input.length > 0) ? l.input : INPUT_SLOTS;
    }

    @Override
    protected int[] getOutputSlots() {
        LSTMenuRegistry.Layout l = layout();
        return (l != null && l.output.length > 0) ? l.output : OUTPUT_SLOTS;
    }
}
