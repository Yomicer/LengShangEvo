package io.Yomicer.LengShangTech.items;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.ProtectionType;
import io.github.thebusybiscuit.slimefun4.core.attributes.ProtectiveArmor;
import io.github.thebusybiscuit.slimefun4.implementation.items.armor.SlimefunArmorPiece;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;

/**
 * 冷殇盔甲件 (armors.yml): 继承粘液盔甲药水效果机制, 并实现 Protect iveArmor 的伤害类型免疫
 * (RADIATION / BEES / FLYING_INTO_WALL)。
 */
public class LSTArmorPiece extends SlimefunArmorPiece implements ProtectiveArmor {

    private final ProtectionType[] protectionTypes;
    private final boolean fullSet;
    private final NamespacedKey armorSetId;

    public LSTArmorPiece(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe,
                         PotionEffect[] effects, ProtectionType[] protectionTypes, boolean fullSet, NamespacedKey armorSetId) {
        super(itemGroup, item, recipeType, recipe, effects);
        this.protectionTypes = protectionTypes;
        this.fullSet = fullSet;
        this.armorSetId = armorSetId;
    }

    @Override
    public ProtectionType[] getProtectionTypes() {
        return protectionTypes;
    }

    @Override
    public boolean isFullSetRequired() {
        return fullSet;
    }

    @Override
    public NamespacedKey getArmorSetId() {
        return armorSetId;
    }
}
