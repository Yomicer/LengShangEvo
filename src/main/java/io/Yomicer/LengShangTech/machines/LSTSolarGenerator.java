package io.Yomicer.LengShangTech.machines;

import io.Yomicer.magicExpansion.items.abstracts.MenuBlock;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.EnergyNetProvider;
import io.github.thebusybiscuit.slimefun4.core.networks.energy.EnergyNetComponentType;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.utils.ChestMenuUtils;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenuPreset;
import me.mrCookieSlime.Slimefun.api.inventory.DirtyChestMenu;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;

/**
 * 冷殇太阳能/环境发电机 (solar_generators.yml)。
 * 语义: 白天输出 dayEnergy J/s, 夜晚输出 nightEnergy J/s (每粘液刻折半)。
 */
public class LSTSolarGenerator extends MenuBlock implements EnergyNetProvider {

    private final int capacity;
    private final int dayEnergy;
    private final int nightEnergy;

    public LSTSolarGenerator(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe,
                             int capacity, int dayEnergy, int nightEnergy) {
        super(itemGroup, item, recipeType, recipe);
        this.capacity = capacity;
        this.dayEnergy = Math.max(0, dayEnergy);
        this.nightEnergy = Math.max(0, nightEnergy);
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
        World world = l.getWorld();
        if (world == null) {
            return 0;
        }
        boolean day = world.isDayTime() && world.getEnvironment() != World.Environment.NETHER
                && world.getEnvironment() != World.Environment.THE_END;
        int perSecond = day ? dayEnergy : nightEnergy;
        return perSecond / 2;
    }

    @Override
    protected void setup(BlockMenuPreset blockMenuPreset) {
        blockMenuPreset.drawBackground(new CustomItemStack(Material.PINK_STAINED_GLASS_PANE, " "), new int[] {
                0, 1, 2, 3, 4, 5, 6, 7, 8,
                9, 10, 11, 12, 13, 14, 15, 16, 17,
                18, 19, 20, 21, 22, 23, 24, 25, 26
        });
        blockMenuPreset.addItem(4, new CustomItemStack(Material.SOUL_CAMPFIRE,
                "§b信息", "§7类型: 太阳能/环境发电机", "§7所属附属: 冷殇科技",
                "§7白天: §e" + dayEnergy + " J/s", "§7夜晚: §e" + nightEnergy + " J/s"), ChestMenuUtils.getEmptyClickHandler());
    }

    @Nonnull
    @Override
    protected int[] getInputSlots(DirtyChestMenu dirtyChestMenu, ItemStack itemStack) {
        return new int[0];
    }

    @Override
    protected int[] getInputSlots() {
        return new int[0];
    }

    @Override
    protected int[] getOutputSlots() {
        return new int[0];
    }
}
