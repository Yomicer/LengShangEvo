package io.Yomicer.LengShangTech.scripts;

import io.Yomicer.LengShangTech.core.MagicExpansionHook;
import io.Yomicer.LengShangTech.core.LSTReg;
import io.Yomicer.LengShangTech.items.LSTArmorPiece;
import io.Yomicer.LengShangTech.machines.LSTGeoResource;
import io.Yomicer.LengShangTech.machines.LSTRecipeMachine;
import io.Yomicer.LengShangTech.utils.LSTLog;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.api.researches.Research;
import io.github.thebusybiscuit.slimefun4.implementation.items.blocks.UnplaceableBlock;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;

/**
 * 生成代码与运行时之间的桥梁: 所有"注册类"行为集中在这里,
 * 便于统一处理守卫、日志与 Slimefun 注册细节。
 */
public final class LSTScriptBridge {

    /** 空配方 (9 格全空)。 */
    public static final ItemStack[] NO_RECIPE = new ItemStack[] {
            null, null, null, null, null, null, null, null, null
    };

    /** 运行时注册去重: 同 ID 已注册时返回 false (防止任何路径的双重注册)。 */
    private static boolean canRegister(String id) {
        String normalized = LSTReg.norm(id);
        if (normalized == null || io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem.getById(normalized) != null) {
            LSTLog.info("跳过重复注册: " + id);
            return false;
        }
        return true;
    }

    private LSTScriptBridge() {
    }

    /** 由图标 + 名字 + 描述构造并索引一个 SlimefunItemStack (supers.yml 用)。 */
    public static SlimefunItemStack sfStack(String id, ItemStack icon, String name, String... lore) {
        CustomItemStack custom = new CustomItemStack(icon == null ? Material.PAPER : icon.getType(), name, lore);
        SlimefunItemStack item = new SlimefunItemStack(LSTReg.norm(id), custom);
        LSTReg.index(id, item);
        return item;
    }

    /** 注册普通物品 (有/无配方的展示与合成物品)。 */
    public static void registerPlainItem(io.Yomicer.LengShangTech.LengShangEvo plugin, String id, ItemGroup group,
                                         RecipeType recipeType, ItemStack[] recipe, boolean placeable) {
        if (!canRegister(id)) {
            return;
        }
        SlimefunItemStack item = LSTReg.lstStack(id);
        if (item == null) {
            return;
        }
        try {
            if (placeable) {
                new SlimefunItem(group, item, recipeType, recipe).register(plugin);
            } else {
                new UnplaceableBlock(group, item, recipeType, recipe).register(plugin);
            }
        } catch (Throwable t) {
            LSTLog.warn("注册物品失败: " + id + " - " + t.getMessage());
        }
    }

    /** 注册脚本道具 (RSC script: 指向的效果由 LSTScriptBindings 提供)。无配方重载。 */
    public static void registerScriptItem(io.Yomicer.LengShangTech.LengShangEvo plugin, String id, String script, ItemGroup group) {
        registerScriptItem(plugin, id, script, group, RecipeType.NULL, NO_RECIPE);
    }

    /** 注册脚本道具, 并带上 RSC 配置里的合成方式与配方 (指南里可查获取途径)。 */
    public static void registerScriptItem(io.Yomicer.LengShangTech.LengShangEvo plugin, String id, String script,
                                          ItemGroup group, RecipeType recipeType, ItemStack[] recipe) {
        SlimefunItemStack item = LSTReg.lstStack(id);
        if (item == null) {
            return;
        }
        try {
            LSTScriptBindings.registerItem(plugin, id, script, group, item, recipeType, recipe);
        } catch (Throwable t) {
            LSTLog.warn("注册脚本道具失败: " + id + " - " + t.getMessage());
        }
    }

    /** 注册配方机器。 */
    public static void machine(String id, LSTRecipeMachine machine) {
        try {
            if (!canRegister(id)) {
                return;
            }
            machine.register(io.Yomicer.LengShangTech.LengShangEvo.getInstance());
        } catch (Throwable t) {
            LSTLog.warn("注册机器失败: " + id + " - " + t.getMessage());
        }
    }

    /** 注册生物掉落。 */
    public static void registerMobDrop(io.Yomicer.LengShangTech.LengShangEvo plugin, String id, SlimefunItemStack item,
                                       ItemGroup group, String entity, int chancePercent) {
        try {
            if (canRegister(id)) {
                new UnplaceableBlock(group, item, RecipeType.NULL, NO_RECIPE).register(plugin);
                EntityType type = EntityType.valueOf(entity.toUpperCase());
                LSTMobDropListener.register(type, id, chancePercent);
            }
        } catch (Throwable t) {
            LSTLog.warn("注册生物掉落失败: " + id + " - " + t.getMessage());
        }
    }

    /** 注册 GEO 资源 + 资源物品本体。 */
    public static void registerGeoResource(io.Yomicer.LengShangTech.LengShangEvo plugin, String id, String geoName,
                                           SlimefunItemStack item, ItemGroup group,
                                           int normal, int nether, int end, int deviation, boolean obtainable) {
        try {
            if (!canRegister(id)) {
                return;
            }
            new UnplaceableBlock(group, item, RecipeType.GEO_MINER, NO_RECIPE).register(plugin);
            LSTGeoResource resource = new LSTGeoResource(
                    MagicExpansionHook.key("lst_geo_" + id.toLowerCase().replaceAll("[^a-z0-9_]", "_")),
                    geoName == null ? id : geoName,
                    item, normal, nether, end, deviation, obtainable);
            resource.register();
        } catch (Throwable t) {
            LSTLog.warn("注册 GEO 资源失败: " + id + " - " + t.getMessage());
        }
    }

    /** 注册盔甲件 (saveditem 本体 + 药水效果 + 保护类型)。 */
    public static void registerArmorPiece(io.Yomicer.LengShangTech.LengShangEvo plugin, String id, ItemGroup group,
                                          RecipeType recipeType, ItemStack[] recipe, PotionEffect[] effects,
                                          io.github.thebusybiscuit.slimefun4.core.attributes.ProtectionType[] protections,
                                          boolean fullSet, String setKey) {
        SlimefunItemStack item = LSTReg.lstStack(id);
        if (item == null || !canRegister(id)) {
            return;
        }
        try {
            new LSTArmorPiece(group, item, recipeType, recipe, effects, protections, fullSet,
                    MagicExpansionHook.key(setKey)).register(plugin);
        } catch (Throwable t) {
            LSTLog.warn("注册盔甲失败: " + id + " - " + t.getMessage());
        }
    }

    /** 注册研究 (缺失的物品自动跳过)。 */
    public static void registerResearch(io.Yomicer.LengShangTech.LengShangEvo plugin, String id, int numericId,
                                        String name, int levelCost, String... itemIds) {
        try {
            Research research = new Research(MagicExpansionHook.key("lst_research_" + id), numericId, name, levelCost);
            boolean any = false;
            for (String itemId : itemIds) {
                SlimefunItem sfItem = SlimefunItem.getById(io.Yomicer.LengShangTech.core.LSTReg.norm(itemId));
                if (sfItem != null) {
                    research.addItems(sfItem);
                    any = true;
                }
            }
            if (any) {
                research.register();
            }
        } catch (Throwable t) {
            LSTLog.warn("注册研究失败: " + id + " - " + t.getMessage());
        }
    }
}
