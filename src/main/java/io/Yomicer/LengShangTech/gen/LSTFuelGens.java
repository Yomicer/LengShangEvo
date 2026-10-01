package io.Yomicer.LengShangTech.gen;

import io.Yomicer.LengShangTech.core.*;
import io.Yomicer.LengShangTech.machines.*;
import io.Yomicer.LengShangTech.scripts.*;
import io.Yomicer.LengShangTech.LengShangEvo;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.items.electric.Capacitor;
import org.bukkit.inventory.ItemStack;

/** 冷殇燃料发电机 (generators.yml)。 */
public final class LSTFuelGens {

    public static void setup(LengShangEvo plugin) {
        // ===== LENGSHANG_M87FDJ =====
        {
            LSTFuelGenerator gen = new LSTFuelGenerator(LSTGroups.DL, LSTReg.lstStack("LENGSHANG_M87FDJ"), RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("M87WZT",1),LSTReg.sf("M87NJW",1),LSTReg.sf("M87WZT",1),LSTReg.sf("M87NJW",1),LSTReg.sf("INFINITE_PANEL",1),LSTReg.sf("M87NJW",1),LSTReg.sf("M87WZT",1),LSTReg.sf("M87NJW",1),LSTReg.sf("M87WZT",1)}, 2000000000, 400000000);
            gen.addFuel(LSTReg.sf("HSYS",1), 31536000);
            gen.register(plugin);
        }
        // ===== LENGSHANG_ys_WJTL_XKFDJ =====
        {
            LSTFuelGenerator gen = new LSTFuelGenerator(LSTGroups.YS_WJTL, LSTReg.lstStack("LENGSHANG_ys_WJTL_XKFDJ"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("VOID_PANEL",64),null,null,null,null,null,null,null,null}, 20000000, 200000);
            gen.addFuel(LSTReg.mat("COBBLESTONE",1), 31536000);
            gen.register(plugin);
        }
        // ===== LENGSHANG_ys_WJTL_WJFDJ =====
        {
            LSTFuelGenerator gen = new LSTFuelGenerator(LSTGroups.YS_WJTL, LSTReg.lstStack("LENGSHANG_ys_WJTL_WJFDJ"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("INFINITE_PANEL",64),null,null,null,null,null,null,null,null}, 400000000, 4000000);
            gen.addFuel(LSTReg.mat("COBBLESTONE",1), 31536000);
            gen.register(plugin);
        }
        // ===== LENGSHANG_FDJ_LZRYFDJ =====
        {
            LSTFuelGenerator gen = new LSTFuelGenerator(LSTGroups.DL, LSTReg.lstStack("LENGSHANG_FDJ_LZRYFDJ"), RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("ADVANCED_CIRCUIT_BOARD",1),LSTReg.sf("HEATING_COIL",1),LSTReg.sf("ADVANCED_CIRCUIT_BOARD",1),LSTReg.mat("NETHERITE_INGOT",1),LSTReg.sf("ELECTRIC_MOTOR",1),LSTReg.mat("NETHERITE_INGOT",1),LSTReg.sf("LAVA_GENERATOR",1),LSTReg.sf("CARBONADO",1),LSTReg.sf("LAVA_GENERATOR",1)}, 50000, 400);
            gen.addFuel(LSTReg.mat("LAVA_BUCKET",1), 60);
            gen.register(plugin);
        }
        // ===== LENGSHANG_FDJ_LXNLHX =====
        {
            LSTFuelGenerator gen = new LSTFuelGenerator(LSTGroups.DL, LSTReg.lstStack("LENGSHANG_FDJ_LXNLHX"), RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.mat("DRAGON_BREATH",1),LSTReg.sf("ELECTRIC_MOTOR",1),LSTReg.mat("DRAGON_BREATH",1),LSTReg.mat("END_CRYSTAL",1),LSTReg.sf("POWER_CRYSTAL",1),LSTReg.mat("END_CRYSTAL",1),LSTReg.sf("ADVANCED_CIRCUIT_BOARD",1),LSTReg.sf("CARBONADO",1),LSTReg.sf("ADVANCED_CIRCUIT_BOARD",1)}, 150000, 1250);
            gen.addFuel(LSTReg.mat("DRAGON_BREATH",1), 300);
            gen.addFuel(LSTReg.mat("DRAGON_EGG",1), 600);
            gen.register(plugin);
        }
        // ===== LENGSHANG_FDJ_SJLFFDJ =====
        {
            LSTFuelGenerator gen = new LSTFuelGenerator(LSTGroups.DL, LSTReg.lstStack("LENGSHANG_FDJ_SJLFFDJ"), RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.mat("CHORUS_FRUIT",1),LSTReg.mat("CLOCK",1),LSTReg.mat("CHORUS_FRUIT",1),LSTReg.sf("ADVANCED_CIRCUIT_BOARD",1),LSTReg.sf("ELECTRIC_MOTOR",1),LSTReg.sf("ADVANCED_CIRCUIT_BOARD",1),LSTReg.mat("OBSIDIAN",1),LSTReg.mat("ENDER_PEARL",1),LSTReg.mat("OBSIDIAN",1)}, 500000, 2500);
            gen.addFuel(LSTReg.mat("CHORUS_FRUIT",8), 120);
            gen.addFuel(LSTReg.sf("ENDER_LUMP_3",1), 180);
            gen.register(plugin);
        }
        // ===== LENGSHANG_聚变反应堆 =====
        {
            LSTFuelGenerator gen = new LSTFuelGenerator(LSTGroups.DL, LSTReg.lstStack("LENGSHANG_聚变反应堆"), LSTRecipeTypes.get("LENGSHANG_XX_XJZPT"), new ItemStack[]{null,null,null,null,null,null,null,null,null}, 10000000, 327680);
            gen.addFuel(LSTReg.sf("LENGSHANG_聚变燃料",1), 180);
            gen.register(plugin);
        }
        // ===== LENGSHANG_开普勒星云树 =====
        {
            LSTFuelGenerator gen = new LSTFuelGenerator(LSTGroups.BLX_JQ, LSTReg.lstStack("LENGSHANG_开普勒星云树"), RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("LENGSHANG_时光沙漏",1),LSTReg.sf("LENGSHANG_时光沙漏",1),LSTReg.sf("LENGSHANG_时光沙漏",1),LSTReg.sf("LENGSHANG_一阶火箭发动机",1),LSTReg.sf("LENGSHANG_一阶火箭",1),LSTReg.sf("LENGSHANG_一阶火箭发动机",1),LSTReg.sf("LENGSHANG_时光沙漏",1),LSTReg.sf("LENGSHANG_时光沙漏",1),LSTReg.sf("LENGSHANG_时光沙漏",1)}, 66666, 4833);
            gen.addFuel(LSTReg.sf("LENGSHANG_时光沙漏",1), 4000);
            gen.register(plugin);
        }
        // ===== LENGSHANG_次元内核 =====
        {
            LSTFuelGenerator gen = new LSTFuelGenerator(LSTGroups.BLX_JQ, LSTReg.lstStack("LENGSHANG_次元内核"), RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("LENGSHANG_超镧燃料",1),LSTReg.sf("LENGSHANG_星轨列车",1),LSTReg.sf("LENGSHANG_超镧燃料",1),LSTReg.sf("LENGSHANG_箔澜处理单元",1),LSTReg.sf("LENGSHANG_箔澜处理单元",1),LSTReg.sf("LENGSHANG_箔澜处理单元",1),LSTReg.sf("LENGSHANG_超镧燃料",1),LSTReg.sf("LENGSHANG_星轨列车",1),LSTReg.sf("LENGSHANG_超镧燃料",1)}, 48888888, 333333);
            gen.addFuel(LSTReg.sf("LENGSHANG_超镧燃料",1), 1228);
            gen.addFuel(LSTReg.sf("LENGSHANG_机器人晶源",64), 1828);
            gen.register(plugin);
        }
    }

    private LSTFuelGens() {
    }
}
