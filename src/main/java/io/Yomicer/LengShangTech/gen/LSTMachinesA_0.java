package io.Yomicer.LengShangTech.gen;

import io.Yomicer.LengShangTech.core.*;
import io.Yomicer.LengShangTech.machines.*;
import io.Yomicer.LengShangTech.scripts.*;
import io.Yomicer.LengShangTech.LengShangEvo;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.items.electric.Capacitor;
import org.bukkit.inventory.ItemStack;

/** 冷殇机器注册 (自动转换)。 */
public final class LSTMachinesA_0 {

    public static void setup(LengShangEvo plugin) {
        // ===== LENGSHANG_LSKJGZZ =====
        LSTScriptBridge.machine("LENGSHANG_LSKJGZZ", new LSTRecipeMachine(LSTGroups.JQ, LSTReg.lstStack("LENGSHANG_LSKJGZZ"), RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{null,LSTReg.sf("LENGSHANG_LENGSHANG",1),null,null,LSTReg.mat("CRAFTING_TABLE",1),null,null,LSTReg.mat("DISPENSER",1),null}, 360, 24)
                .addRecipe(1, new ItemStack[]{LSTReg.sf("LOGITECH_TRANSMUTATOR_FRAME",25)}, new ItemStack[]{LSTReg.sf("LENGSHANG_YSSBJKJ",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.sf("LENGSHANG_YSSBJKJ",5)}, new ItemStack[]{LSTReg.sf("LENGSHANG_JJYSSBJKJ",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.sf("LOGITECH_TRANSMUTATOR_GLASS",34)}, new ItemStack[]{LSTReg.sf("LENGSHANG_YSSBJFHZ",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.sf("LENGSHANG_YSSBJFHZ",7)}, new ItemStack[]{LSTReg.sf("LENGSHANG_JJYSSBJFHZ",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.sf("LOGITECH_TRANSMUTATOR_ROD",48)}, new ItemStack[]{LSTReg.sf("LENGSHANG_YSSBJRLB",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.sf("LENGSHANG_YSSBJRLB",3)}, new ItemStack[]{LSTReg.sf("LENGSHANG_JJYSSBJRLB",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.sf("LOGITECH_SOLAR_REACTOR_FRAME",51)}, new ItemStack[]{LSTReg.sf("LENGSHANG_CXXMNQKJ",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.sf("LENGSHANG_CXXMNQKJ",2)}, new ItemStack[]{LSTReg.sf("LENGSHANG_JJCXXMNQKJ",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.sf("LOGITECH_SOLAR_REACTOR_GLASS",42)}, new ItemStack[]{LSTReg.sf("LENGSHANG_CXXMNQFHZ",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.sf("LENGSHANG_CXXMNQFHZ",2)}, new ItemStack[]{LSTReg.sf("LENGSHANG_JJCXXMNQFHZ",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.sf("_FINALTECH_ETHER",16)}, new ItemStack[]{LSTReg.sf("LENGSHANG_YSYT",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.sf("_FINALTECH_ANNULAR",4)}, new ItemStack[]{LSTReg.sf("LENGSHANG_YSHUAN",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.sf("_FINALTECH_BUG",16)}, new ItemStack[]{LSTReg.sf("LENGSHANG_YSKJK",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.sf("_FINALTECH_ORDERED_DUST",16)}, new ItemStack[]{LSTReg.sf("LENGSHANG_YSYXCA",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.sf("_FINALTECH_GEARWHEEL",16)}, new ItemStack[]{LSTReg.sf("LENGSHANG_YSQCL",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.sf("LOGITECH_CHIP_CORE",16)}, new ItemStack[]{LSTReg.sf("LENGSHANG_YSZNKZHX",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.sf("LOGITECH_FINAL_BASE",54)}, new ItemStack[]{LSTReg.sf("LENGSHANG_YSZJJTJS",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.sf("LENGSHANG_YSZJJTJS",5)}, new ItemStack[]{LSTReg.sf("LENGSHANG_JJYSZJJTJS",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.sf("LENGSHANG_反概念物质碎片",50)}, new ItemStack[]{LSTReg.sf("LENGSHANG_反概念物质核心碎片",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.sf("LENGSHANG_反概念物质核心碎片",20)}, new ItemStack[]{LSTReg.sf("LOGITECH_ANTIMASS",1)}, new double[]{1.0})
                .build());
        // ===== LENGSHANG_WZSYYTJ =====
        LSTScriptBridge.machine("LENGSHANG_WZSYYTJ", new LSTRecipeMachine(LSTGroups.JQ, LSTReg.lstStack("LENGSHANG_WZSYYTJ"), RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("_FINALTECH_GEARWHEEL",1),LSTReg.sf("_FINALTECH_MESH_TRANSFER",1),LSTReg.sf("_FINALTECH_REMOTE_ACCESSOR",1),LSTReg.sf("_FINALTECH_LINE_TRANSFER",1),LSTReg.sf("_FINALTECH_POINT_TRANSFER",1),LSTReg.sf("_FINALTECH_LOCATION_TRANSFER",1),LSTReg.sf("_FINALTECH_ORDERED_DUST_FACTORY_STONE",1),LSTReg.sf("_FINALTECH_ORDERED_DUST_FACTORY_DIRT",1),LSTReg.sf("_FINALTECH_BASIC_FRAME_MACHINE",1)}, 360, 24)
                .addRecipe(1, new ItemStack[]{LSTReg.mat("COBBLESTONE",64)}, new ItemStack[]{LSTReg.sf("_FINALTECH_UNORDERED_DUST",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("DIRT",64)}, new ItemStack[]{LSTReg.sf("_FINALTECH_ORDERED_DUST",1)}, new double[]{1.0})
                .build());
        // ===== LENGSHANG_HZZJ_1 =====
        LSTScriptBridge.machine("LENGSHANG_HZZJ_1", new LSTRecipeMachine(LSTGroups.JQ, LSTReg.lstStack("LENGSHANG_HZZJ_1"), RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("_FINALTECH_POINT_TRANSFER",1),LSTReg.sf("_FINALTECH_ORDERED_DUST_FACTORY_DIRT",1),LSTReg.sf("_FINALTECH_LOCATION_TRANSFER",1),LSTReg.sf("_FINALTECH_UNORDERED_DUST",1),LSTReg.sf("_FINALTECH_BOX",1),LSTReg.sf("_FINALTECH_ORDERED_DUST",1),LSTReg.sf("_FINALTECH_LINE_TRANSFER",1),LSTReg.sf("_FINALTECH_ORDERED_DUST_FACTORY_STONE",1),LSTReg.sf("_FINALTECH_MESH_TRANSFER",1)}, 256, 12)
                .addRecipe(10, new ItemStack[]{LSTReg.sf("_FINALTECH_UNORDERED_DUST",1),LSTReg.sf("_FINALTECH_ORDERED_DUST",1)}, new ItemStack[]{LSTReg.sf("_FINALTECH_BOX",1)}, new double[]{1.0})
                .addRecipe(10, new ItemStack[]{LSTReg.sf("_FINALTECH_BOX",1),LSTReg.sf("MOMOTECH_QUANTUM",1)}, new ItemStack[]{LSTReg.sf("MOMOTECH_QUANTUM1",1)}, new double[]{1.0})
                .build());
        // ===== LENGSHANG_HZZJ_2 =====
        LSTScriptBridge.machine("LENGSHANG_HZZJ_2", new LSTRecipeMachine(LSTGroups.JQ, LSTReg.lstStack("LENGSHANG_HZZJ_2"), RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("_FINALTECH_POINT_TRANSFER",1),LSTReg.sf("_FINALTECH_ORDERED_DUST_FACTORY_DIRT",1),LSTReg.sf("_FINALTECH_LOCATION_TRANSFER",1),LSTReg.sf("_FINALTECH_UNORDERED_DUST",1),LSTReg.sf("LENGSHANG_HZZJ_1",1),LSTReg.sf("_FINALTECH_ORDERED_DUST",1),LSTReg.sf("_FINALTECH_LINE_TRANSFER",1),LSTReg.sf("_FINALTECH_ORDERED_DUST_FACTORY_STONE",1),LSTReg.sf("_FINALTECH_MESH_TRANSFER",1)}, 2560, 120)
                .addRecipe(1, new ItemStack[]{LSTReg.sf("_FINALTECH_UNORDERED_DUST",10),LSTReg.sf("_FINALTECH_ORDERED_DUST",10)}, new ItemStack[]{LSTReg.sf("_FINALTECH_BOX",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.sf("_FINALTECH_BOX",1),LSTReg.sf("MOMOTECH_QUANTUM",1)}, new ItemStack[]{LSTReg.sf("MOMOTECH_QUANTUM1",1)}, new double[]{1.0})
                .build());
        // ===== LENGSHANG_YZHQ_1 =====
        LSTScriptBridge.machine("LENGSHANG_YZHQ_1", new LSTRecipeMachine(LSTGroups.JQ, LSTReg.lstStack("LENGSHANG_YZHQ_1"), RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("ADVANCED_CIRCUIT_BOARD",1),LSTReg.sf("CALCITE_3L",1),LSTReg.sf("_FINALTECH_UNORDERED_DUST",1),LSTReg.sf("HEATING_COIL",1),LSTReg.sf("_FINALTECH_BOX",1),LSTReg.sf("_FINALTECH_GEARWHEEL",1),LSTReg.sf("_FINALTECH_POINT_TRANSFER",1),LSTReg.sf("_FINALTECH_LINE_TRANSFER",1),LSTReg.sf("_FINALTECH_BASIC_FRAME_MACHINE",1)}, 256, 12)
                .addRecipe(30, new ItemStack[]{LSTReg.sf("_FINALTECH_BOX",1)}, new ItemStack[]{LSTReg.sf("_FINALTECH_SHINE",1)}, new double[]{1.0})
                .build());
        // ===== LENGSHANG_YZHQ_2 =====
        LSTScriptBridge.machine("LENGSHANG_YZHQ_2", new LSTRecipeMachine(LSTGroups.JQ, LSTReg.lstStack("LENGSHANG_YZHQ_2"), RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("STEEL_PLATE",1),LSTReg.sf("ELECTRO_MAGNET",1),LSTReg.sf("_FINALTECH_ORDERED_DUST",1),LSTReg.sf("CARBONADO",1),LSTReg.sf("LENGSHANG_YZHQ_1",1),LSTReg.sf("BOOSTED_URANIUM",1),LSTReg.firstOf(new String[]{"COMPRESS_NETHERITE_BLOCK_2","_FINALTECH_ETHER"},1),LSTReg.firstOf(new String[]{"COMPRESS_DIAMOND_BLOCK_2","_FINALTECH_COPY_CARD"},1),LSTReg.firstOf(new String[]{"COMPRESS_IRON_BLOCK_2","_FINALTECH_BUG"},1)}, 2560, 120)
                .addRecipe(1, new ItemStack[]{LSTReg.sf("_FINALTECH_BOX",1)}, new ItemStack[]{LSTReg.sf("_FINALTECH_SHINE",1)}, new double[]{1.0})
                .build());
        // ===== LENGSHANG_KJKYTJ =====
        LSTScriptBridge.machine("LENGSHANG_KJKYTJ", new LSTRecipeMachine(LSTGroups.JQ, LSTReg.lstStack("LENGSHANG_KJKYTJ"), RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("KLMSYHJD",1),LSTReg.sf("_FINALTECH_COPY_CARD",1),LSTReg.sf("_FINALTECH_EQUIVALENT_EXCHANGE_TABLE",1),LSTReg.sf("_FINALTECH_ANNULAR",1),LSTReg.sf("LENGSHANG_WZSYYTJ",1),LSTReg.sf("_FINALTECH_GEARWHEEL",1),LSTReg.sf("_FINALTECH_UNORDERED_DUST",1),LSTReg.sf("_FINALTECH_OVERLOADED_QUANTITY_MODULE",1),LSTReg.firstOf(new String[]{"COMPRESS_DIAMOND_BLOCK_4","_FINALTECH_BUG"},1)}, 360, 24)
                .addRecipe(1, new ItemStack[]{LSTReg.sf("_FINALTECH_UNORDERED_DUST",64),LSTReg.sf("_FINALTECH_ORDERED_DUST",64)}, new ItemStack[]{LSTReg.sf("HSBUG",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.sf("HSBUG",24)}, new ItemStack[]{LSTReg.sf("_FINALTECH_BUG",1)}, new double[]{1.0})
                .build());
        // ===== LENGSHANG_YTYTJ =====
        LSTScriptBridge.machine("LENGSHANG_YTYTJ", new LSTRecipeMachine(LSTGroups.JQ, LSTReg.lstStack("LENGSHANG_YTYTJ"), RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{null,LSTReg.sf("LENGSHANG_YSYT",1),null,LSTReg.sf("LENGSHANG_YSHUAN",1),LSTReg.sf("_FINALTECH_ETHER_MINER",1),LSTReg.sf("LENGSHANG_YSHUAN",1),null,LSTReg.sf("LENGSHANG_YSYT",1),null}, 3600, 240)
                .addRecipe(1, new ItemStack[]{LSTReg.sf("_FINALTECH_UNORDERED_DUST",16)}, new ItemStack[]{LSTReg.sf("_FINALTECH_ETHER",1)}, new double[]{1.0})
                .build());
        // ===== LENGSHANG_SJDKYTJ =====
        LSTScriptBridge.machine("LENGSHANG_SJDKYTJ", new LSTRecipeMachine(LSTGroups.JQ, LSTReg.lstStack("LENGSHANG_SJDKYTJ"), RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{null,LSTReg.sf("ENERGY_REGULATOR",1),null,LSTReg.sf("LENGSHANG_TINALNESS",1),LSTReg.sf("_FINALTECH_PORTABLE_ENERGY_STORAGE",1),LSTReg.sf("INFINITY_CAPACITOR",1),null,LSTReg.sf("INFINITE_PANEL",1),null}, 50000, 260)
                .addRecipe(10, new ItemStack[]{LSTReg.sf("_FINALTECH_ORDERED_DUST",1)}, new ItemStack[]{LSTReg.sf("_FINALTECH_ENERGY_CARD_K",1),LSTReg.sf("_FINALTECH_ENERGY_CARD_M",1),LSTReg.sf("_FINALTECH_ENERGY_CARD_B",1),LSTReg.sf("_FINALTECH_ENERGY_CARD_T",1)}, new double[]{1.0,1.0,1.0,0.1})
                .build());
        // ===== LENGSHANG_LXWZZHQ =====
        LSTScriptBridge.machine("LENGSHANG_LXWZZHQ", new LSTRecipeMachine(LSTGroups.JQ, LSTReg.lstStack("LENGSHANG_LXWZZHQ"), RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("M87WZT",1),LSTReg.sf("_FINALTECH_OVERLOADED_QUANTITY_MODULE",1),LSTReg.sf("M87WZT",1),LSTReg.sf("_FINALTECH_PHONY",1),LSTReg.sf("LENGSHANG_WZSYYTJ",1),LSTReg.sf("_FINALTECH_PHONY",1),LSTReg.sf("CALCITE_3L",1),LSTReg.sf("LENGSHANG_KJKYTJ",1),LSTReg.sf("CALCITE_3L",1)}, 256, 15)
                .addRecipe(1, new ItemStack[]{LSTReg.mat("COBBLESTONE",64)}, new ItemStack[]{LSTReg.sf("_FINALTECH_UNORDERED_DUST",64)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("DIRT",64)}, new ItemStack[]{LSTReg.sf("_FINALTECH_ORDERED_DUST",64)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.sf("_FINALTECH_ORDERED_DUST",64)}, new ItemStack[]{LSTReg.sf("_FINALTECH_ETHER",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.sf("_FINALTECH_ETHER",64)}, new ItemStack[]{LSTReg.sf("_FINALTECH_BUG",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.sf("_FINALTECH_BUG",64)}, new ItemStack[]{LSTReg.sf("_FINALTECH_COPY_CARD",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.sf("_FINALTECH_COPY_CARD",1)}, new ItemStack[]{LSTReg.sf("_FINALTECH_ANNULAR",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.sf("_FINALTECH_ANNULAR",64)}, new ItemStack[]{LSTReg.sf("_FINALTECH_SINGULARITY",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.sf("_FINALTECH_SINGULARITY",2)}, new ItemStack[]{LSTReg.sf("_FINALTECH_SPIROCHETE",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.sf("_FINALTECH_SPIROCHETE",2)}, new ItemStack[]{LSTReg.sf("_FINALTECH_PHONY",1)}, new double[]{1.0})
                .build());
        // ===== LENGSHANG_M87WZNJQ =====
        LSTScriptBridge.machine("LENGSHANG_M87WZNJQ", new LSTRecipeMachine(LSTGroups.JQ, LSTReg.lstStack("LENGSHANG_M87WZNJQ"), RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("METAL_SINGULARITY",1),LSTReg.sf("KLMSYXKD",1),LSTReg.sf("EARTH_SINGULARITY",1),LSTReg.firstOf(new String[]{"COMPRESS_IRON_BLOCK_5","SUPREME_ATTRIBUTE_IMPETUS"},1),LSTReg.sf("KLMSYSJHX",1),LSTReg.firstOf(new String[]{"COMPRESS_IRON_BLOCK_5","SUPREME_ATTRIBUTE_IMPETUS"},1),LSTReg.sf("KLMSYWJD",1),LSTReg.sf("KLMSYXKD",1),LSTReg.sf("KLMSYWJD",1)}, 1024, 64)
                .addRecipe(6000, new ItemStack[]{LSTReg.sf("VOID_INGOT",64),LSTReg.sf("INFINITE_INGOT",64)}, new ItemStack[]{LSTReg.sf("M87NJW",1)}, new double[]{1.0})
                .addRecipe(6000, new ItemStack[]{LSTReg.sf("M87NJW",5)}, new ItemStack[]{LSTReg.sf("M87WZT",1)}, new double[]{1.0})
                .build());
        // ===== LENGSHANG_HSNYRHJ =====
        LSTScriptBridge.machine("LENGSHANG_HSNYRHJ", new LSTRecipeMachine(LSTGroups.JQ, LSTReg.lstStack("LENGSHANG_HSNYRHJ"), RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("M87WZT",1),LSTReg.sf("M87WZT",1),LSTReg.sf("M87WZT",1),LSTReg.sf("EARTH_SINGULARITY",1),LSTReg.sf("SUPREME_SUPREME",1),LSTReg.sf("METAL_SINGULARITY",1),LSTReg.sf("HSYS",1),LSTReg.sf("WJJJHX",1),LSTReg.sf("CALCITE_3L",1)}, 1024, 64)
                .addRecipe(6000, new ItemStack[]{LSTReg.sf("M87WZT",24)}, new ItemStack[]{LSTReg.sf("HSHXSP",1)}, new double[]{1.0})
                .addRecipe(10000, new ItemStack[]{LSTReg.sf("HSHXSP",64)}, new ItemStack[]{LSTReg.sf("HSHX",1)}, new double[]{1.0})
                .addRecipe(12000, new ItemStack[]{LSTReg.sf("HSHX",32)}, new ItemStack[]{LSTReg.sf("JJHSHX",1)}, new double[]{1.0})
                .build());
        // ===== LENGSHANG_YSFUZ =====
        LSTScriptBridge.machine("LENGSHANG_YSFUZ", new LSTRecipeMachine(LSTGroups.JQ, LSTReg.lstStack("LENGSHANG_YSFUZ"), RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("_FINALTECH_COPY_CARD",1),LSTReg.sf("_FINALTECH_ORDERED_DUST_FACTORY_STONE",1),LSTReg.mat("COBBLESTONE",1),null,null,null,null,null,null}, 256, 8)
                .addRecipe(1, new ItemStack[]{LSTReg.mat("COBBLESTONE",1)}, new ItemStack[]{LSTReg.mat("COBBLESTONE",64),LSTReg.mat("COBBLESTONE",64)}, new double[]{1.0,1.0})
                .build());
        // ===== LENGSHANG_HJDYTJ =====
        LSTScriptBridge.machine("LENGSHANG_HJDYTJ", new LSTRecipeMachine(LSTGroups.JQ, LSTReg.lstStack("LENGSHANG_HJDYTJ"), RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("_FINALTECH_GEARWHEEL",1),LSTReg.sf("_FINALTECH_ORDERED_DUST",1),LSTReg.sf("_FINALTECH_GEARWHEEL",1),LSTReg.sf("_FINALTECH_ORDERED_DUST",1),LSTReg.mat("HEART_OF_THE_SEA",1),LSTReg.sf("_FINALTECH_ORDERED_DUST",1),LSTReg.sf("_FINALTECH_GEARWHEEL",1),LSTReg.sf("_FINALTECH_ORDERED_DUST",1),LSTReg.sf("_FINALTECH_GEARWHEEL",1)}, 256, 12)
                .addRecipe(1, new ItemStack[]{LSTReg.mat("WATER_BUCKET",1),LSTReg.mat("GLOWSTONE_DUST",12)}, new ItemStack[]{LSTReg.mat("SEA_LANTERN",1)}, new double[]{1.0})
                .build());
        // ===== LENGSHANG_HZHJ =====
        LSTScriptBridge.machine("LENGSHANG_HZHJ", new LSTRecipeMachine(LSTGroups.JQ, LSTReg.lstStack("LENGSHANG_HZHJ"), RecipeType.MAGIC_WORKBENCH, new ItemStack[]{LSTReg.mat("IRON_INGOT",1),LSTReg.sf("MAGICAL_GLASS",1),LSTReg.mat("IRON_INGOT",1),LSTReg.sf("MAGICAL_BOOK_COVER",1),LSTReg.sf("MFZZ",1),LSTReg.sf("MAGICAL_BOOK_COVER",1),LSTReg.mat("IRON_INGOT",1),LSTReg.sf("MAGIC_LUMP_3",1),LSTReg.mat("IRON_INGOT",1)}, 128, 3)
                .addRecipe(1, new ItemStack[]{LSTReg.sf("MFZZ",1)}, new ItemStack[]{LSTReg.mat("DANDELION",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("DANDELION",1)}, new ItemStack[]{LSTReg.mat("POPPY",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("POPPY",1)}, new ItemStack[]{LSTReg.mat("BLUE_ORCHID",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("BLUE_ORCHID",1)}, new ItemStack[]{LSTReg.mat("ALLIUM",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("ALLIUM",1)}, new ItemStack[]{LSTReg.mat("AZURE_BLUET",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("AZURE_BLUET",1)}, new ItemStack[]{LSTReg.mat("RED_TULIP",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("RED_TULIP",1)}, new ItemStack[]{LSTReg.mat("ORANGE_TULIP",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("ORANGE_TULIP",1)}, new ItemStack[]{LSTReg.mat("WHITE_TULIP",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("WHITE_TULIP",1)}, new ItemStack[]{LSTReg.mat("PINK_TULIP",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("PINK_TULIP",1)}, new ItemStack[]{LSTReg.mat("OXEYE_DAISY",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("OXEYE_DAISY",1)}, new ItemStack[]{LSTReg.mat("CORNFLOWER",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("CORNFLOWER",1)}, new ItemStack[]{LSTReg.mat("LILY_OF_THE_VALLEY",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("LILY_OF_THE_VALLEY",1)}, new ItemStack[]{LSTReg.mat("WITHER_ROSE",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("WITHER_ROSE",1)}, new ItemStack[]{LSTReg.mat("SUNFLOWER",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("SUNFLOWER",1)}, new ItemStack[]{LSTReg.mat("LILAC",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("LILAC",1)}, new ItemStack[]{LSTReg.mat("ROSE_BUSH",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("ROSE_BUSH",1)}, new ItemStack[]{LSTReg.mat("PEONY",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("PEONY",1)}, new ItemStack[]{LSTReg.sf("MFZZ",1)}, new double[]{1.0})
                .build());
        // ===== LENGSHANG_YSRLZZJ =====
        LSTScriptBridge.machine("LENGSHANG_YSRLZZJ", new LSTRecipeMachine(LSTGroups.JQ, LSTReg.lstStack("LENGSHANG_YSRLZZJ"), RecipeType.MAGIC_WORKBENCH, new ItemStack[]{LSTReg.sf("MAGIC_LUMP_3",1),LSTReg.sf("ANCIENT_RUNE_WATER",1),LSTReg.sf("MAGIC_LUMP_3",1),LSTReg.sf("ANCIENT_RUNE_EARTH",1),LSTReg.sf("ANCIENT_ALTAR",1),LSTReg.sf("ANCIENT_RUNE_ENDER",1),LSTReg.sf("ENDER_LUMP_3",1),LSTReg.sf("ANCIENT_RUNE_FIRE",1),LSTReg.sf("ENDER_LUMP_3",1)}, 1024, 42)
                .addRecipe(60, new ItemStack[]{LSTReg.mat("HEART_OF_THE_SEA",1)}, new ItemStack[]{LSTReg.sf("HYLS",1)}, new double[]{1.0})
                .addRecipe(60, new ItemStack[]{LSTReg.mat("OAK_LEAVES",1)}, new ItemStack[]{LSTReg.sf("SYLS",1)}, new double[]{1.0})
                .addRecipe(60, new ItemStack[]{LSTReg.mat("END_STONE",1)}, new ItemStack[]{LSTReg.sf("MDHS",1)}, new double[]{1.0})
                .addRecipe(60, new ItemStack[]{LSTReg.mat("NETHERRACK",1)}, new ItemStack[]{LSTReg.sf("DYHS",1)}, new double[]{1.0})
                .build());
        // ===== LENGSHANG_CHZBDZJ =====
        LSTScriptBridge.machine("LENGSHANG_CHZBDZJ", new LSTRecipeMachine(LSTGroups.JQ, LSTReg.lstStack("LENGSHANG_CHZBDZJ"), RecipeType.MAGIC_WORKBENCH, new ItemStack[]{LSTReg.sf("MAGIC_LUMP_3",1),LSTReg.sf("STEEL_PLATE",1),LSTReg.sf("MAGIC_LUMP_3",1),LSTReg.sf("STEEL_PLATE",1),LSTReg.sf("LENGSHANG_YSRLZZJ",1),LSTReg.sf("STEEL_PLATE",1),LSTReg.sf("ENDER_LUMP_3",1),LSTReg.sf("STEEL_PLATE",1),LSTReg.sf("ENDER_LUMP_3",1)}, 1024, 42)
                .addRecipe(60, new ItemStack[]{LSTReg.mat("NETHERITE_HELMET",1),LSTReg.sf("HYLS",1)}, new ItemStack[]{LSTReg.sf("CH1",1)}, new double[]{1.0})
                .addRecipe(60, new ItemStack[]{LSTReg.mat("NETHERITE_CHESTPLATE",1),LSTReg.sf("SYLS",1)}, new ItemStack[]{LSTReg.sf("CH2",1)}, new double[]{1.0})
                .addRecipe(60, new ItemStack[]{LSTReg.mat("NETHERITE_LEGGINGS",1),LSTReg.sf("MDHS",1)}, new ItemStack[]{LSTReg.sf("CH3",1)}, new double[]{1.0})
                .addRecipe(60, new ItemStack[]{LSTReg.mat("NETHERITE_BOOTS",1),LSTReg.sf("DYHS",1)}, new ItemStack[]{LSTReg.sf("CH4",1)}, new double[]{1.0})
                .build());
        // ===== LENGSHANG_FMFZJ =====
        LSTScriptBridge.machine("LENGSHANG_FMFZJ", new LSTRecipeMachine(LSTGroups.JQ, LSTReg.lstStack("LENGSHANG_FMFZJ"), RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("_FINALTECH_COPY_CARD",1),LSTReg.sf("_FINALTECH_ORDERED_DUST",1),LSTReg.sf("_FINALTECH_BASIC_FRAME_MACHINE",1),LSTReg.sf("_FINALTECH_GEARWHEEL",1),LSTReg.mat("HONEYCOMB_BLOCK",1),LSTReg.mat("HONEY_BLOCK",1),null,null,null}, 256, 8)
                .addRecipe(1, new ItemStack[]{LSTReg.mat("HONEY_BOTTLE",1)}, new ItemStack[]{LSTReg.mat("HONEY_BOTTLE",64)}, new double[]{1.0})
                .build());
        // ===== LENGSHANG_SKZZJ =====
        LSTScriptBridge.machine("LENGSHANG_SKZZJ", new LSTRecipeMachine(LSTGroups.JQ, LSTReg.lstStack("LENGSHANG_SKZZJ"), RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.mat("OAK_PLANKS",1),LSTReg.sf("DAMASCUS_STEEL_INGOT",1),LSTReg.mat("OAK_PLANKS",1),LSTReg.mat("COBBLESTONE",1),LSTReg.mat("OAK_TRAPDOOR",1),LSTReg.mat("COBBLESTONE",1),LSTReg.sf("ALUMINUM_BRASS_INGOT",1),LSTReg.mat("CAULDRON",1),LSTReg.sf("ALUMINUM_BRASS_INGOT",1)}, 256, 12)
                .addRecipe(1, new ItemStack[]{LSTReg.mat("GRAVEL",1)}, new ItemStack[]{LSTReg.sf("SIFTED_ORE",6)}, new double[]{1.0})
                .build());
        // ===== LENGSHANG_YSFYTJ =====
        LSTScriptBridge.machine("LENGSHANG_YSFYTJ", new LSTRecipeMachine(LSTGroups.JQ, LSTReg.lstStack("LENGSHANG_YSFYTJ"), RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.mat("IRON_BLOCK",1),LSTReg.mat("IRON_BLOCK",1),LSTReg.mat("IRON_BLOCK",1),LSTReg.mat("REDSTONE",1),LSTReg.mat("GOLD_NUGGET",1),LSTReg.mat("GUNPOWDER",1),LSTReg.mat("IRON_BLOCK",1),LSTReg.mat("IRON_BLOCK",1),LSTReg.mat("IRON_BLOCK",1)}, 256, 12)
                .addRecipe(1, new ItemStack[]{LSTReg.mat("REDSTONE",1),LSTReg.mat("GOLD_NUGGET",1)}, new ItemStack[]{LSTReg.mat("GLOWSTONE_DUST",1)}, new double[]{1.0})
                .build());
        // ===== LENGSHANG_ys_HMKJY_MLFKRSJ_1 =====
        LSTScriptBridge.machine("LENGSHANG_ys_HMKJY_MLFKRSJ_1", new LSTRecipeMachine(LSTGroups.YS_HMKJY_JQ, LSTReg.lstStack("LENGSHANG_ys_HMKJY_MLFKRSJ_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("COMMAND_BLOCK_DYE_MACHINE",30),null,null,null,null,null,null,null,null}, 25000, 4500)
                .addRecipe(1, new ItemStack[]{LSTReg.mat("COMMAND_BLOCK",1)}, new ItemStack[]{LSTReg.mat("REPEATING_COMMAND_BLOCK",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("REPEATING_COMMAND_BLOCK",1)}, new ItemStack[]{LSTReg.mat("CHAIN_COMMAND_BLOCK",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("CHAIN_COMMAND_BLOCK",1)}, new ItemStack[]{LSTReg.mat("COMMAND_BLOCK",1)}, new double[]{1.0})
                .build());
        // ===== LENGSHANG_ys_HMKJY_MLFKRSJ_2 =====
        LSTScriptBridge.machine("LENGSHANG_ys_HMKJY_MLFKRSJ_2", new LSTRecipeMachine(LSTGroups.YS_HMKJY_JQ, LSTReg.lstStack("LENGSHANG_ys_HMKJY_MLFKRSJ_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_ys_HMKJY_MLFKRSJ_1",64),null,null,null,null,null,null,null,null}, 25000, 4500)
                .addRecipe(1, new ItemStack[]{LSTReg.mat("COMMAND_BLOCK",64)}, new ItemStack[]{LSTReg.mat("REPEATING_COMMAND_BLOCK",64)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("REPEATING_COMMAND_BLOCK",64)}, new ItemStack[]{LSTReg.mat("CHAIN_COMMAND_BLOCK",64)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("CHAIN_COMMAND_BLOCK",64)}, new ItemStack[]{LSTReg.mat("COMMAND_BLOCK",64)}, new double[]{1.0})
                .build());
        // ===== LENGSHANG_ys_HMKJY_MLFKJRJ_1 =====
        LSTScriptBridge.machine("LENGSHANG_ys_HMKJY_MLFKJRJ_1", new LSTRecipeMachine(LSTGroups.YS_HMKJY_JQ, LSTReg.lstStack("LENGSHANG_ys_HMKJY_MLFKJRJ_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("COMMAND_BLOCK_DYE_MACHINE_2",5),null,null,null,null,null,null,null,null}, 60000, 15000)
                .addRecipe(1, new ItemStack[]{LSTReg.mat("COMMAND_BLOCK",16)}, new ItemStack[]{LSTReg.mat("REPEATING_COMMAND_BLOCK",16)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("REPEATING_COMMAND_BLOCK",16)}, new ItemStack[]{LSTReg.mat("CHAIN_COMMAND_BLOCK",16)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("CHAIN_COMMAND_BLOCK",16)}, new ItemStack[]{LSTReg.mat("COMMAND_BLOCK",16)}, new double[]{1.0})
                .build());
        // ===== LENGSHANG_ys_HMKJY_MLFKJRJ_2 =====
        LSTScriptBridge.machine("LENGSHANG_ys_HMKJY_MLFKJRJ_2", new LSTRecipeMachine(LSTGroups.YS_HMKJY_JQ, LSTReg.lstStack("LENGSHANG_ys_HMKJY_MLFKJRJ_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_ys_HMKJY_MLFKJRJ_1",4),null,null,null,null,null,null,null,null}, 60000, 15000)
                .addRecipe(1, new ItemStack[]{LSTReg.mat("COMMAND_BLOCK",64)}, new ItemStack[]{LSTReg.mat("REPEATING_COMMAND_BLOCK",64)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("REPEATING_COMMAND_BLOCK",64)}, new ItemStack[]{LSTReg.mat("CHAIN_COMMAND_BLOCK",64)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("CHAIN_COMMAND_BLOCK",64)}, new ItemStack[]{LSTReg.mat("COMMAND_BLOCK",64)}, new double[]{1.0})
                .build());
        // ===== LENGSHANG_ys_HMKJY_YKJ =====
        LSTScriptBridge.machine("LENGSHANG_ys_HMKJY_YKJ", new LSTRecipeMachine(LSTGroups.YS_HMKJY_JQ, LSTReg.lstStack("LENGSHANG_ys_HMKJY_YKJ"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("COMPRESSION_BLOCK_MACHINE",16),null,null,null,null,null,null,null,null}, 1600, 160)
                .addRecipe(0, new ItemStack[]{LSTReg.mat("IRON_INGOT",63)}, new ItemStack[]{LSTReg.mat("IRON_BLOCK",7)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.sf("GOLD_24K",63)}, new ItemStack[]{LSTReg.sf("GOLD_24K_BLOCK",7)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("COAL",63)}, new ItemStack[]{LSTReg.mat("COAL_BLOCK",7)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("GOLD_INGOT",63)}, new ItemStack[]{LSTReg.mat("GOLD_BLOCK",7)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("REDSTONE",63)}, new ItemStack[]{LSTReg.mat("REDSTONE_BLOCK",7)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("EMERALD",63)}, new ItemStack[]{LSTReg.mat("EMERALD_BLOCK",7)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("LAPIS_LAZULI",63)}, new ItemStack[]{LSTReg.mat("LAPIS_BLOCK",7)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("DIAMOND",63)}, new ItemStack[]{LSTReg.mat("DIAMOND_BLOCK",7)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("COPPER_INGOT",63)}, new ItemStack[]{LSTReg.mat("COPPER_BLOCK",7)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("NETHERITE_INGOT",63)}, new ItemStack[]{LSTReg.mat("NETHERITE_BLOCK",7)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("WHEAT",63)}, new ItemStack[]{LSTReg.mat("HAY_BLOCK",7)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("BONE_MEAL",63)}, new ItemStack[]{LSTReg.mat("BONE_BLOCK",7)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("RAW_IRON",63)}, new ItemStack[]{LSTReg.mat("RAW_IRON_BLOCK",7)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("RAW_COPPER",63)}, new ItemStack[]{LSTReg.mat("RAW_COPPER_BLOCK",7)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("RAW_GOLD",63)}, new ItemStack[]{LSTReg.mat("RAW_GOLD_BLOCK",7)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("QUARTZ",64)}, new ItemStack[]{LSTReg.mat("QUARTZ_BLOCK",16)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("AMETHYST_SHARD",64)}, new ItemStack[]{LSTReg.mat("AMETHYST_BLOCK",16)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("DRIED_KELP",64)}, new ItemStack[]{LSTReg.mat("DRIED_KELP_BLOCK",16)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("SLIME_BALL",63)}, new ItemStack[]{LSTReg.mat("SLIME_BLOCK",7)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("HONEY_BOTTLE",16)}, new ItemStack[]{LSTReg.mat("HONEY_BLOCK",4)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("MAGMA_CREAM",64)}, new ItemStack[]{LSTReg.mat("MAGMA_BLOCK",16)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("CLAY_BALL",64)}, new ItemStack[]{LSTReg.mat("CLAY",16)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("SNOWBALL",16)}, new ItemStack[]{LSTReg.mat("SNOW_BLOCK",4)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("BAMBOO",63)}, new ItemStack[]{LSTReg.mat("BAMBOO_BLOCK",7)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("BRICK",64)}, new ItemStack[]{LSTReg.mat("BRICKS",16)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("NETHER_BRICK",64)}, new ItemStack[]{LSTReg.mat("NETHER_BRICKS",16)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("POPPED_CHORUS_FRUIT",64)}, new ItemStack[]{LSTReg.mat("PURPUR_BLOCK",16)}, new double[]{1.0})
                .build());
        // ===== LENGSHANG_ys_HMKJY_HSBJ_1 =====
        LSTScriptBridge.machine("LENGSHANG_ys_HMKJY_HSBJ_1", new LSTRecipeMachine(LSTGroups.YS_HMKJY_JQ, LSTReg.lstStack("LENGSHANG_ys_HMKJY_HSBJ_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("NUCLEAR_DECAY_MACHINE",4),null,null,null,null,null,null,null,null}, 40000, 2400)
                .addRecipe(1, new ItemStack[]{LSTReg.sf("BOOSTED_URANIUM",1)}, new ItemStack[]{LSTReg.sf("URANIUM",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.sf("URANIUM",1)}, new ItemStack[]{LSTReg.sf("NEPTUNIUM",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.sf("NEPTUNIUM",1)}, new ItemStack[]{LSTReg.sf("PLUTONIUM",1)}, new double[]{1.0})
                .build());
        // ===== LENGSHANG_ys_HMKJY_HSBJ_2 =====
        LSTScriptBridge.machine("LENGSHANG_ys_HMKJY_HSBJ_2", new LSTRecipeMachine(LSTGroups.YS_HMKJY_JQ, LSTReg.lstStack("LENGSHANG_ys_HMKJY_HSBJ_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_ys_HMKJY_HSBJ_1",64),null,null,null,null,null,null,null,null}, 400000, 24000)
                .addRecipe(1, new ItemStack[]{LSTReg.sf("BOOSTED_URANIUM",64)}, new ItemStack[]{LSTReg.sf("URANIUM",64)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.sf("URANIUM",64)}, new ItemStack[]{LSTReg.sf("NEPTUNIUM",64)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.sf("NEPTUNIUM",64)}, new ItemStack[]{LSTReg.sf("PLUTONIUM",64)}, new double[]{1.0})
                .build());
        // ===== LENGSHANG_ys_HMKJY_CHSCJ =====
        LSTScriptBridge.machine("LENGSHANG_ys_HMKJY_CHSCJ", new LSTRecipeMachine(LSTGroups.YS_HMKJY_JQ, LSTReg.lstStack("LENGSHANG_ys_HMKJY_CHSCJ"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("ANCIENT_DEBRIS_MACHINE",15),null,null,null,null,null,null,null,null}, 200000, 38000)
                .addRecipe(1, new ItemStack[]{LSTReg.mat("BONE_BLOCK",20)}, new ItemStack[]{LSTReg.mat("ANCIENT_DEBRIS",1)}, new double[]{1.0})
                .build());
        // ===== LENGSHANG_ys_HMKJY_QGDXJNYJYJ_1 =====
        LSTScriptBridge.machine("LENGSHANG_ys_HMKJY_QGDXJNYJYJ_1", new LSTRecipeMachine(LSTGroups.YS_HMKJY_JQ, LSTReg.lstStack("LENGSHANG_ys_HMKJY_QGDXJNYJYJ_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("STRANGE_NETHER_GOO_MACHINE",5),null,null,null,null,null,null,null,null}, 50000, 1000)
                .addRecipe(1, new ItemStack[]{LSTReg.mat("GOLD_INGOT",3)}, new ItemStack[]{LSTReg.sf("STRANGE_NETHER_GOO",1)}, new double[]{1.0})
                .build());
        // ===== LENGSHANG_ys_HMKJY_QGDXJNYJYJ_2 =====
        LSTScriptBridge.machine("LENGSHANG_ys_HMKJY_QGDXJNYJYJ_2", new LSTRecipeMachine(LSTGroups.YS_HMKJY_JQ, LSTReg.lstStack("LENGSHANG_ys_HMKJY_QGDXJNYJYJ_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_ys_HMKJY_QGDXJNYJYJ_1",64),null,null,null,null,null,null,null,null}, 500000, 10000)
                .addRecipe(1, new ItemStack[]{LSTReg.mat("GOLD_INGOT",64),LSTReg.mat("GOLD_INGOT",64),LSTReg.mat("GOLD_INGOT",64)}, new ItemStack[]{LSTReg.sf("STRANGE_NETHER_GOO",64)}, new double[]{1.0})
                .build());
        // ===== LENGSHANG_ys_HMKJY_TZPSJ_1 =====
        LSTScriptBridge.machine("LENGSHANG_ys_HMKJY_TZPSJ_1", new LSTRecipeMachine(LSTGroups.YS_HMKJY_JQ, LSTReg.lstStack("LENGSHANG_ys_HMKJY_TZPSJ_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("HAIMAN_ANVIL_BROKER",5),null,null,null,null,null,null,null,null}, 12750, 100)
                .addRecipe(1, new ItemStack[]{LSTReg.mat("ANVIL",1)}, new ItemStack[]{LSTReg.mat("CHIPPED_ANVIL",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("CHIPPED_ANVIL",1)}, new ItemStack[]{LSTReg.mat("DAMAGED_ANVIL",1)}, new double[]{1.0})
                .build());
        // ===== LENGSHANG_ys_HMKJY_TZPSJ_2 =====
        LSTScriptBridge.machine("LENGSHANG_ys_HMKJY_TZPSJ_2", new LSTRecipeMachine(LSTGroups.YS_HMKJY_JQ, LSTReg.lstStack("LENGSHANG_ys_HMKJY_TZPSJ_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_ys_HMKJY_TZPSJ_1",64),null,null,null,null,null,null,null,null}, 127500, 1000)
                .addRecipe(1, new ItemStack[]{LSTReg.mat("ANVIL",64)}, new ItemStack[]{LSTReg.mat("CHIPPED_ANVIL",64)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("CHIPPED_ANVIL",64)}, new ItemStack[]{LSTReg.mat("DAMAGED_ANVIL",64)}, new double[]{1.0})
                .build());
        // ===== LENGSHANG_ys_HMKJY_MDCSMKJGZJ =====
        LSTScriptBridge.machine("LENGSHANG_ys_HMKJY_MDCSMKJGZJ", new LSTRecipeMachine(LSTGroups.YS_HMKJY_JQ, LSTReg.lstStack("LENGSHANG_ys_HMKJY_MDCSMKJGZJ"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("HAIMAN_END_PORTAL_FRAME_CREATER",20),null,null,null,null,null,null,null,null}, 10000000, 900000)
                .addRecipe(1, new ItemStack[]{LSTReg.mat("CRYING_OBSIDIAN",5)}, new ItemStack[]{LSTReg.mat("END_PORTAL_FRAME",1)}, new double[]{1.0})
                .build());
        // ===== LENGSHANG_ys_HMKJY_CSJ =====
        LSTScriptBridge.machine("LENGSHANG_ys_HMKJY_CSJ", new LSTRecipeMachine(LSTGroups.YS_HMKJY_JQ, LSTReg.lstStack("LENGSHANG_ys_HMKJY_CSJ"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("INFESTED_MACHINE",5),null,null,null,null,null,null,null,null}, 640, 160)
                .addRecipe(1, new ItemStack[]{LSTReg.mat("COBBLESTONE",1)}, new ItemStack[]{LSTReg.mat("INFESTED_COBBLESTONE",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("STONE",1)}, new ItemStack[]{LSTReg.mat("INFESTED_STONE",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("STONE_BRICKS",1)}, new ItemStack[]{LSTReg.mat("INFESTED_STONE_BRICKS",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("MOSSY_STONE_BRICKS",1)}, new ItemStack[]{LSTReg.mat("INFESTED_MOSSY_STONE_BRICKS",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("CRACKED_STONE_BRICKS",1)}, new ItemStack[]{LSTReg.mat("INFESTED_CRACKED_STONE_BRICKS",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("CHISELED_STONE_BRICKS",1)}, new ItemStack[]{LSTReg.mat("INFESTED_CHISELED_STONE_BRICKS",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("DEEPSLATE",1)}, new ItemStack[]{LSTReg.mat("INFESTED_DEEPSLATE",1)}, new double[]{1.0})
                .build());
        // ===== LENGSHANG_ys_HMKJY_WJYYB_1 =====
        LSTScriptBridge.machine("LENGSHANG_ys_HMKJY_WJYYB_1", new LSTRecipeMachine(LSTGroups.YS_HMKJY_JQ, LSTReg.lstStack("LENGSHANG_ys_HMKJY_WJYYB_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("HAIMAN_INFINITY_OIL_PUMP",5),null,null,null,null,null,null,null,null}, 30000, 4000)
                .addRecipe(1, new ItemStack[]{LSTReg.mat("BUCKET",1)}, new ItemStack[]{LSTReg.sf("BUCKET_OF_OIL",1)}, new double[]{1.0})
                .build());
        // ===== LENGSHANG_ys_HMKJY_WJYYB_2 =====
        LSTScriptBridge.machine("LENGSHANG_ys_HMKJY_WJYYB_2", new LSTRecipeMachine(LSTGroups.YS_HMKJY_JQ, LSTReg.lstStack("LENGSHANG_ys_HMKJY_WJYYB_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_ys_HMKJY_WJYYB_1",16),null,null,null,null,null,null,null,null}, 300000, 40000)
                .addRecipe(1, new ItemStack[]{LSTReg.mat("BUCKET",16)}, new ItemStack[]{LSTReg.sf("BUCKET_OF_OIL",16)}, new double[]{1.0})
                .build());
        // ===== LENGSHANG_ys_HMKJY_TONGFZHJ =====
        LSTScriptBridge.machine("LENGSHANG_ys_HMKJY_TONGFZHJ", new LSTRecipeMachine(LSTGroups.YS_HMKJY_JQ, LSTReg.lstStack("LENGSHANG_ys_HMKJY_TONGFZHJ"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("HAIMAN_COPPER_DUST_PRODUCER",8),null,null,null,null,null,null,null,null}, 200000, 10000)
                .addRecipe(1, new ItemStack[]{LSTReg.sf("IRON_DUST",64)}, new ItemStack[]{LSTReg.sf("COPPER_DUST",64)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.sf("GOLD_DUST",64)}, new ItemStack[]{LSTReg.sf("COPPER_DUST",64)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.sf("LEAD_DUST",64)}, new ItemStack[]{LSTReg.sf("COPPER_DUST",64)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.sf("TIN_DUST",64)}, new ItemStack[]{LSTReg.sf("COPPER_DUST",64)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.sf("ZINC_DUST",64)}, new ItemStack[]{LSTReg.sf("COPPER_DUST",64)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.sf("ALUMINUM_DUST",64)}, new ItemStack[]{LSTReg.sf("COPPER_DUST",64)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.sf("MAGNESIUM_DUST",64)}, new ItemStack[]{LSTReg.sf("COPPER_DUST",64)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.sf("SILVER_DUST",64)}, new ItemStack[]{LSTReg.sf("COPPER_DUST",64)}, new double[]{1.0})
                .build());
        // ===== LENGSHANG_ys_HMKJY_TFZHJ =====
        LSTScriptBridge.machine("LENGSHANG_ys_HMKJY_TFZHJ", new LSTRecipeMachine(LSTGroups.YS_HMKJY_JQ, LSTReg.lstStack("LENGSHANG_ys_HMKJY_TFZHJ"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("HAIMAN_IRON_DUST_PRODUCER",8),null,null,null,null,null,null,null,null}, 200000, 10000)
                .addRecipe(1, new ItemStack[]{LSTReg.sf("COPPER_DUST",64)}, new ItemStack[]{LSTReg.sf("IRON_DUST",64)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.sf("GOLD_DUST",64)}, new ItemStack[]{LSTReg.sf("IRON_DUST",64)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.sf("LEAD_DUST",64)}, new ItemStack[]{LSTReg.sf("IRON_DUST",64)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.sf("TIN_DUST",64)}, new ItemStack[]{LSTReg.sf("IRON_DUST",64)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.sf("ZINC_DUST",64)}, new ItemStack[]{LSTReg.sf("IRON_DUST",64)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.sf("ALUMINUM_DUST",64)}, new ItemStack[]{LSTReg.sf("IRON_DUST",64)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.sf("MAGNESIUM_DUST",64)}, new ItemStack[]{LSTReg.sf("IRON_DUST",64)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.sf("SILVER_DUST",64)}, new ItemStack[]{LSTReg.sf("IRON_DUST",64)}, new double[]{1.0})
                .build());
        // ===== LENGSHANG_ys_HMKJY_RZGLJ =====
        LSTScriptBridge.machine("LENGSHANG_ys_HMKJY_RZGLJ", new LSTRecipeMachine(LSTGroups.YS_HMKJY_JQ, LSTReg.lstStack("LENGSHANG_ys_HMKJY_RZGLJ"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("SYNTHETIC_CHANGER",6),null,null,null,null,null,null,null,null}, 160000, 40000)
                .addRecipe(1, new ItemStack[]{LSTReg.mat("DIAMOND",24)}, new ItemStack[]{LSTReg.sf("SYNTHETIC_DIAMOND",2)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("LAPIS_LAZULI",48)}, new ItemStack[]{LSTReg.sf("SYNTHETIC_SAPPHIRE",2)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("EMERALD",24)}, new ItemStack[]{LSTReg.sf("SYNTHETIC_EMERALD",2)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("SHULKER_SHELL",26)}, new ItemStack[]{LSTReg.sf("SYNTHETIC_SHULKER_SHELL",1)}, new double[]{1.0})
                .build());
        // ===== LENGSHANG_ys_HMKJY_CPKYJ =====
        LSTScriptBridge.machine("LENGSHANG_ys_HMKJY_CPKYJ", new LSTRecipeMachine(LSTGroups.YS_HMKJY_JQ, LSTReg.lstStack("LENGSHANG_ys_HMKJY_CPKYJ"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("MUSIC_DISC_PRODUCER",6),null,null,null,null,null,null,null,null}, 32000, 320)
                .addRecipe(1, new ItemStack[]{LSTReg.mat("YELLOW_DYE",6)}, new ItemStack[]{LSTReg.mat("MUSIC_DISC_13",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("LIME_DYE",6)}, new ItemStack[]{LSTReg.mat("MUSIC_DISC_CAT",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("ORANGE_DYE",6)}, new ItemStack[]{LSTReg.mat("MUSIC_DISC_BLOCKS",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("RED_DYE",6)}, new ItemStack[]{LSTReg.mat("MUSIC_DISC_CHIRP",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("SLIME_BALL",3)}, new ItemStack[]{LSTReg.mat("MUSIC_DISC_FAR",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("PURPLE_DYE",6)}, new ItemStack[]{LSTReg.mat("MUSIC_DISC_MALL",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("MAGENTA_DYE",6)}, new ItemStack[]{LSTReg.mat("MUSIC_DISC_MELLOHI",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("BLACK_DYE",6)}, new ItemStack[]{LSTReg.mat("MUSIC_DISC_STAL",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("WHITE_DYE",6)}, new ItemStack[]{LSTReg.mat("MUSIC_DISC_STRAD",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("GREEN_DYE",6)}, new ItemStack[]{LSTReg.mat("MUSIC_DISC_WARD",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("BLUE_DYE",6)}, new ItemStack[]{LSTReg.mat("MUSIC_DISC_WAIT",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("CRACKED_STONE_BRICKS",32)}, new ItemStack[]{LSTReg.mat("MUSIC_DISC_11",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("BLAZE_ROD",64)}, new ItemStack[]{LSTReg.mat("MUSIC_DISC_PIGSTEP",1)}, new double[]{1.0})
                .addRecipe(6, new ItemStack[]{LSTReg.mat("SCULK_CATALYST",1)}, new ItemStack[]{LSTReg.mat("MUSIC_DISC_OTHERSIDE",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("DISC_FRAGMENT_5",4)}, new ItemStack[]{LSTReg.mat("MUSIC_DISC_5",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("CHERRY_SAPLING",4)}, new ItemStack[]{LSTReg.mat("MUSIC_DISC_RELIC",1)}, new double[]{1.0})
                .build());
        // ===== LENGSHANG_ys_HMKJY_MJDZJ =====
        LSTScriptBridge.machine("LENGSHANG_ys_HMKJY_MJDZJ", new LSTRecipeMachine(LSTGroups.YS_HMKJY_JQ, LSTReg.lstStack("LENGSHANG_ys_HMKJY_MJDZJ"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("HAIMAN_HORSE_ARMOR_PRODUCER",4),null,null,null,null,null,null,null,null}, 320, 40)
                .addRecipe(1, new ItemStack[]{LSTReg.mat("IRON_INGOT",7)}, new ItemStack[]{LSTReg.mat("IRON_HORSE_ARMOR",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("GOLD_INGOT",7)}, new ItemStack[]{LSTReg.mat("GOLDEN_HORSE_ARMOR",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("LEATHER",7)}, new ItemStack[]{LSTReg.mat("LEATHER_HORSE_ARMOR",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("DIAMOND",7)}, new ItemStack[]{LSTReg.mat("DIAMOND_HORSE_ARMOR",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("RABBIT_HIDE",6)}, new ItemStack[]{LSTReg.mat("SADDLE",1)}, new double[]{1.0})
                .build());
        // ===== LENGSHANG_ys_HMKJY_RLYHJ_1 =====
        LSTScriptBridge.machine("LENGSHANG_ys_HMKJY_RLYHJ_1", new LSTRecipeMachine(LSTGroups.YS_HMKJY_JQ, LSTReg.lstStack("LENGSHANG_ys_HMKJY_RLYHJ_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("HAIMAN_FUEL_MACHINE",10),null,null,null,null,null,null,null,null}, 9500000, 450000)
                .addRecipe(1000, new ItemStack[]{LSTReg.sf("PLUTONIUM",16)}, new ItemStack[]{LSTReg.sf("H_FUEL",1)}, new double[]{1.0})
                .addRecipe(1200, new ItemStack[]{LSTReg.sf("ZOT_INGOT",16)}, new ItemStack[]{LSTReg.sf("HD_FUEL",1)}, new double[]{1.0})
                .addRecipe(1800, new ItemStack[]{LSTReg.sf("MINECRAFT_DEAD_BUSH_GHOST",2)}, new ItemStack[]{LSTReg.sf("HDB_FUEL",1)}, new double[]{1.0})
                .addRecipe(2000, new ItemStack[]{LSTReg.sf("MINECRAFT_SOURCE_STONE",1)}, new ItemStack[]{LSTReg.sf("HDBU_FUEL",1)}, new double[]{1.0})
                .build());
        // ===== LENGSHANG_ys_HMKJY_RLYHJ_2 =====
        LSTScriptBridge.machine("LENGSHANG_ys_HMKJY_RLYHJ_2", new LSTRecipeMachine(LSTGroups.YS_HMKJY_JQ, LSTReg.lstStack("LENGSHANG_ys_HMKJY_RLYHJ_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_ys_HMKJY_RLYHJ_1",10),null,null,null,null,null,null,null,null}, 95000000, 4500000)
                .addRecipe(100, new ItemStack[]{LSTReg.sf("PLUTONIUM",16)}, new ItemStack[]{LSTReg.sf("H_FUEL",1)}, new double[]{1.0})
                .addRecipe(120, new ItemStack[]{LSTReg.sf("ZOT_INGOT",16)}, new ItemStack[]{LSTReg.sf("HD_FUEL",1)}, new double[]{1.0})
                .addRecipe(180, new ItemStack[]{LSTReg.sf("MINECRAFT_DEAD_BUSH_GHOST",2)}, new ItemStack[]{LSTReg.sf("HDB_FUEL",1)}, new double[]{1.0})
                .addRecipe(200, new ItemStack[]{LSTReg.sf("MINECRAFT_SOURCE_STONE",1)}, new ItemStack[]{LSTReg.sf("HDBU_FUEL",1)}, new double[]{1.0})
                .build());
        // ===== LENGSHANG_ys_HMKJY_KCZPJ_1 =====
        LSTScriptBridge.machine("LENGSHANG_ys_HMKJY_KCZPJ_1", new LSTRecipeMachine(LSTGroups.YS_HMKJY_JQ, LSTReg.lstStack("LENGSHANG_ys_HMKJY_KCZPJ_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("HAIMAN_MINECART_MACHINE",10),null,null,null,null,null,null,null,null}, 25000, 500)
                .addRecipe(1, new ItemStack[]{LSTReg.mat("IRON_INGOT",3)}, new ItemStack[]{LSTReg.mat("MINECART",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("FURNACE",1),LSTReg.mat("MINECART",1)}, new ItemStack[]{LSTReg.mat("FURNACE_MINECART",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("TNT",1),LSTReg.mat("MINECART",1)}, new ItemStack[]{LSTReg.mat("TNT_MINECART",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("HOPPER",1),LSTReg.mat("MINECART",1)}, new ItemStack[]{LSTReg.mat("HOPPER_MINECART",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("CHEST",1),LSTReg.mat("MINECART",1)}, new ItemStack[]{LSTReg.mat("CHEST_MINECART",1)}, new double[]{1.0})
                .addRecipe(220, new ItemStack[]{LSTReg.mat("COMMAND_BLOCK",1),LSTReg.mat("MINECART",1)}, new ItemStack[]{LSTReg.mat("COMMAND_BLOCK_MINECART",1)}, new double[]{1.0})
                .build());
        // ===== LENGSHANG_ys_HMKJY_KCZPJ_2 =====
        LSTScriptBridge.machine("LENGSHANG_ys_HMKJY_KCZPJ_2", new LSTRecipeMachine(LSTGroups.YS_HMKJY_JQ, LSTReg.lstStack("LENGSHANG_ys_HMKJY_KCZPJ_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_ys_HMKJY_KCZPJ_1",10),null,null,null,null,null,null,null,null}, 250000, 10000)
                .addRecipe(1, new ItemStack[]{LSTReg.mat("IRON_INGOT",3)}, new ItemStack[]{LSTReg.mat("MINECART",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("FURNACE",1),LSTReg.mat("MINECART",1)}, new ItemStack[]{LSTReg.mat("FURNACE_MINECART",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("TNT",1),LSTReg.mat("MINECART",1)}, new ItemStack[]{LSTReg.mat("TNT_MINECART",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("HOPPER",1),LSTReg.mat("MINECART",1)}, new ItemStack[]{LSTReg.mat("HOPPER_MINECART",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("CHEST",1),LSTReg.mat("MINECART",1)}, new ItemStack[]{LSTReg.mat("CHEST_MINECART",1)}, new double[]{1.0})
                .addRecipe(22, new ItemStack[]{LSTReg.mat("COMMAND_BLOCK",1),LSTReg.mat("MINECART",1)}, new ItemStack[]{LSTReg.mat("COMMAND_BLOCK_MINECART",1)}, new double[]{1.0})
                .build());
        // ===== LENGSHANG_ys_HMKJY_SHUCHUANG_1 =====
        LSTScriptBridge.machine("LENGSHANG_ys_HMKJY_SHUCHUANG_1", new LSTRecipeMachine(LSTGroups.YS_HMKJY_JQ, LSTReg.lstStack("LENGSHANG_ys_HMKJY_SHUCHUANG_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("HAIMAN_BOOK_MACHINE",10),null,null,null,null,null,null,null,null}, 86000, 800)
                .addRecipe(1, new ItemStack[]{LSTReg.mat("BOOKSHELF",1)}, new ItemStack[]{LSTReg.mat("BOOKSHELF",2)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("PAPER",2)}, new ItemStack[]{LSTReg.mat("BOOK",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("BOOK",1)}, new ItemStack[]{LSTReg.mat("WRITABLE_BOOK",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("WRITABLE_BOOK",1)}, new ItemStack[]{LSTReg.mat("WRITTEN_BOOK",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("WRITTEN_BOOK",1)}, new ItemStack[]{LSTReg.mat("ENCHANTED_BOOK",1)}, new double[]{1.0})
                .addRecipe(128, new ItemStack[]{LSTReg.mat("ENCHANTED_BOOK",1)}, new ItemStack[]{LSTReg.mat("KNOWLEDGE_BOOK",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("ENDER_PEARL",1)}, new ItemStack[]{LSTReg.saved("海曼科技院/TE_GUIDE",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("ENDER_EYE",1)}, new ItemStack[]{LSTReg.sf("TE_INFO",1)}, new double[]{1.0})
                .addRecipe(6, new ItemStack[]{LSTReg.mat("SLIME_BALL",1)}, new ItemStack[]{LSTReg.saved("海曼科技院/SFBOOK",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("CHISELED_BOOKSHELF",1)}, new ItemStack[]{LSTReg.mat("CHISELED_BOOKSHELF",2)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("SUGAR_CANE",2)}, new ItemStack[]{LSTReg.mat("PAPER",8)}, new double[]{1.0})
                .build());
        // ===== LENGSHANG_ys_HMKJY_SHUCHUANG_2 =====
        LSTScriptBridge.machine("LENGSHANG_ys_HMKJY_SHUCHUANG_2", new LSTRecipeMachine(LSTGroups.YS_HMKJY_JQ, LSTReg.lstStack("LENGSHANG_ys_HMKJY_SHUCHUANG_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_ys_HMKJY_SHUCHUANG_1",10),null,null,null,null,null,null,null,null}, 860000, 8000)
                .addRecipe(1, new ItemStack[]{LSTReg.mat("BOOKSHELF",32)}, new ItemStack[]{LSTReg.mat("BOOKSHELF",64)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("PAPER",64)}, new ItemStack[]{LSTReg.mat("BOOK",32)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("BOOK",1)}, new ItemStack[]{LSTReg.mat("WRITABLE_BOOK",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("WRITABLE_BOOK",1)}, new ItemStack[]{LSTReg.mat("WRITTEN_BOOK",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("WRITTEN_BOOK",1)}, new ItemStack[]{LSTReg.mat("ENCHANTED_BOOK",1)}, new double[]{1.0})
                .addRecipe(12, new ItemStack[]{LSTReg.mat("ENCHANTED_BOOK",1)}, new ItemStack[]{LSTReg.mat("KNOWLEDGE_BOOK",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("ENDER_PEARL",1)}, new ItemStack[]{LSTReg.saved("海曼科技院/TE_GUIDE",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("ENDER_EYE",1)}, new ItemStack[]{LSTReg.sf("TE_INFO",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("SLIME_BALL",1)}, new ItemStack[]{LSTReg.saved("海曼科技院/SFBOOK",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("CHISELED_BOOKSHELF",32)}, new ItemStack[]{LSTReg.mat("CHISELED_BOOKSHELF",64)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("SUGAR_CANE",16)}, new ItemStack[]{LSTReg.mat("PAPER",64)}, new double[]{1.0})
                .build());
        // ===== LENGSHANG_ys_HMKJY_DEBUGTSJ_1 =====
        LSTScriptBridge.machine("LENGSHANG_ys_HMKJY_DEBUGTSJ_1", new LSTRecipeMachine(LSTGroups.YS_HMKJY_JQ, LSTReg.lstStack("LENGSHANG_ys_HMKJY_DEBUGTSJ_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("HAIMAN_DEBUG_MACHINE",10),null,null,null,null,null,null,null,null}, 600000, 60000)
                .addRecipe(400, new ItemStack[]{LSTReg.mat("STICK",1)}, new ItemStack[]{LSTReg.mat("DEBUG_STICK",1)}, new double[]{1.0})
                .addRecipe(420, new ItemStack[]{LSTReg.mat("DEBUG_STICK",1)}, new ItemStack[]{LSTReg.saved("海曼科技院/HM_DEBUG_FISH",1)}, new double[]{1.0})
                .build());
        // ===== LENGSHANG_ys_HMKJY_DEBUGTSJ_2 =====
        LSTScriptBridge.machine("LENGSHANG_ys_HMKJY_DEBUGTSJ_2", new LSTRecipeMachine(LSTGroups.YS_HMKJY_JQ, LSTReg.lstStack("LENGSHANG_ys_HMKJY_DEBUGTSJ_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_ys_HMKJY_DEBUGTSJ_1",10),null,null,null,null,null,null,null,null}, 6000000, 600000)
                .addRecipe(40, new ItemStack[]{LSTReg.mat("STICK",1)}, new ItemStack[]{LSTReg.mat("DEBUG_STICK",1)}, new double[]{1.0})
                .addRecipe(42, new ItemStack[]{LSTReg.mat("DEBUG_STICK",1)}, new ItemStack[]{LSTReg.saved("海曼科技院/HM_DEBUG_FISH",1)}, new double[]{1.0})
                .build());
        // ===== LENGSHANG_ys_HMKJY_CJJLL_1 =====
        LSTScriptBridge.machine("LENGSHANG_ys_HMKJY_CJJLL_1", new LSTRecipeMachine(LSTGroups.YS_HMKJY_JQ, LSTReg.lstStack("LENGSHANG_ys_HMKJY_CJJLL_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("HAIMAN_JINGLIANLU",3),null,null,null,null,null,null,null,null}, 3600, 180)
                .addRecipe(1, new ItemStack[]{LSTReg.mat("IRON_INGOT",1)}, new ItemStack[]{LSTReg.sf("REFINED_IRON",1)}, new double[]{1.0})
                .build());
        // ===== LENGSHANG_ys_HMKJY_CJJLL_2 =====
        LSTScriptBridge.machine("LENGSHANG_ys_HMKJY_CJJLL_2", new LSTRecipeMachine(LSTGroups.YS_HMKJY_JQ, LSTReg.lstStack("LENGSHANG_ys_HMKJY_CJJLL_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_ys_HMKJY_CJJLL_1",64),null,null,null,null,null,null,null,null}, 36000, 1800)
                .addRecipe(1, new ItemStack[]{LSTReg.mat("IRON_INGOT",64)}, new ItemStack[]{LSTReg.sf("REFINED_IRON",64)}, new double[]{1.0})
                .build());
        // ===== LENGSHANG_ys_HMKJY_GJJLL =====
        LSTScriptBridge.machine("LENGSHANG_ys_HMKJY_GJJLL", new LSTRecipeMachine(LSTGroups.YS_HMKJY_JQ, LSTReg.lstStack("LENGSHANG_ys_HMKJY_GJJLL"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("GJJLL",64),null,null,null,null,null,null,null,null}, 10240, 300)
                .addRecipe(0, new ItemStack[]{LSTReg.mat("IRON_INGOT",64)}, new ItemStack[]{LSTReg.sf("REFINED_IRON",64)}, new double[]{1.0})
                .build());
        // ===== LENGSHANG_ys_HMKJY_JSJGC =====
        LSTScriptBridge.machine("LENGSHANG_ys_HMKJY_JSJGC", new LSTRecipeMachine(LSTGroups.YS_HMKJY_JQ, LSTReg.lstStack("LENGSHANG_ys_HMKJY_JSJGC"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("JINSHUJGC",64),null,null,null,null,null,null,null,null}, 20000, 7500)
                .addRecipe(1, new ItemStack[]{LSTReg.sf("TIN_INGOT",64)}, new ItemStack[]{LSTReg.sf("TIN_PLATE",64)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.sf("COPPER_INGOT",64)}, new ItemStack[]{LSTReg.sf("COPPER_PLATE",64)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("GOLD_INGOT",64)}, new ItemStack[]{LSTReg.sf("GOLD_PLATE",64)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("DIAMOND",64)}, new ItemStack[]{LSTReg.sf("DIAMOND_PLATE",64)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("IRON_INGOT",64)}, new ItemStack[]{LSTReg.sf("IRON_PLATE",64)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.sf("THORIUM",64)}, new ItemStack[]{LSTReg.sf("THORIUM_PLATE",64)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("IRON_BLOCK",64)}, new ItemStack[]{LSTReg.sf("MACHINE_BLOCK",64)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.sf("RAW_CARBON_MESH",64)}, new ItemStack[]{LSTReg.sf("CARBON_PLATE",64)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.sf("MIXED_METAL_INGOT",64)}, new ItemStack[]{LSTReg.sf("ADVANCED_ALLOY",64)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.sf("MACHINE_BLOCK",20),LSTReg.sf("CARBON_PLATE",60)}, new ItemStack[]{LSTReg.sf("ADVANCED_MACHINE_BLOCK",20)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.sf("HEJINDING_YUANPEI",64)}, new ItemStack[]{LSTReg.sf("MIXED_METAL_INGOT",64)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.sf("IRIDIUM",64),LSTReg.sf("ADVANCED_ALLOY",64)}, new ItemStack[]{LSTReg.sf("IRIDIUM_PLATE",16)}, new double[]{1.0})
                .build());
        // ===== LENGSHANG_ys_HMKJY_SMJGC =====
        LSTScriptBridge.machine("LENGSHANG_ys_HMKJY_SMJGC", new LSTRecipeMachine(LSTGroups.YS_HMKJY_JQ, LSTReg.lstStack("LENGSHANG_ys_HMKJY_SMJGC"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("SHOUMOJGC",64),null,null,null,null,null,null,null,null}, 20000, 5000)
                .addRecipe(1, new ItemStack[]{LSTReg.sf("TIN_PLATE",64)}, new ItemStack[]{LSTReg.sf("TIN_ITEM_CASING",64)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.sf("TIN_ITEM_CASING",20)}, new ItemStack[]{LSTReg.sf("UNINSULATED_TIN_CABLE",60)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.sf("COPPER_PLATE",64)}, new ItemStack[]{LSTReg.sf("COPPER_ITEM_CASING",64)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.sf("COPPER_ITEM_CASING",20)}, new ItemStack[]{LSTReg.sf("UNINSULATED_COPPER_CABLE",60)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.sf("GOLD_PLATE",64)}, new ItemStack[]{LSTReg.sf("GOLD_ITEM_CASING",64)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.sf("GOLD_ITEM_CASING",20)}, new ItemStack[]{LSTReg.sf("UNINSULATED_GOLD_CABLE",60)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.sf("IRON_PLATE",64)}, new ItemStack[]{LSTReg.sf("IRON_ITEM_CASING",64)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("COAL",64)}, new ItemStack[]{LSTReg.sf("COAL_DUST",64)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.sf("COAL_DUST",64)}, new ItemStack[]{LSTReg.sf("RAW_CARBON_FIBRE",16)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.sf("RAW_CARBON_FIBRE",64)}, new ItemStack[]{LSTReg.sf("RAW_CARBON_MESH",32)}, new double[]{1.0})
                .build());
        // ===== LENGSHANG_ys_HMKJY_SWXJJ =====
        LSTScriptBridge.machine("LENGSHANG_ys_HMKJY_SWXJJ", new LSTRecipeMachine(LSTGroups.YS_HMKJY_JQ, LSTReg.lstStack("LENGSHANG_ys_HMKJY_SWXJJ"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("HAIMAN_FOXY_PRODUCER",6),null,null,null,null,null,null,null,null}, 60000, 6000)
                .addRecipe(1, new ItemStack[]{LSTReg.mat("BUCKET",10)}, new ItemStack[]{LSTReg.sf("BLOOD",2)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("RABBIT_FOOT",12)}, new ItemStack[]{LSTReg.sf("CURSED_RABBIT_PAW",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("PLAYER_HEAD",16)}, new ItemStack[]{LSTReg.sf("HUMAN_SKULL",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("TROPICAL_FISH",32)}, new ItemStack[]{LSTReg.sf("TROPICAL_FISH_SCALE",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("SWEET_BERRIES",64)}, new ItemStack[]{LSTReg.sf("POLAR_FOX_HIDE",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("MAGMA_CREAM",24)}, new ItemStack[]{LSTReg.sf("MAGMA_ESSENCE",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("FEATHER",64)}, new ItemStack[]{LSTReg.sf("PARROT_FEATHER",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("HEART_OF_THE_SEA",4)}, new ItemStack[]{LSTReg.sf("POSEIDONS_BLESSING",1)}, new double[]{1.0})
                .addRecipe(30, new ItemStack[]{LSTReg.sf("CELESTIAL_SWORD",1)}, new ItemStack[]{LSTReg.sf("CELESTIAL_SWORD",1),LSTReg.sf("CELESTIAL_SHARD",1)}, new double[]{1.0,1.0})
                .addRecipe(30, new ItemStack[]{LSTReg.sf("CURSED_SWORD",1)}, new ItemStack[]{LSTReg.sf("CURSED_SWORD",1),LSTReg.sf("CURSED_SHARD",1)}, new double[]{1.0,1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("BONE",64)}, new ItemStack[]{LSTReg.sf("UNHOLY_WITHER_SKELETON_BONE",1)}, new double[]{1.0})
                .build());
        // ===== LENGSHANG_ys_HMKJY_SGLGZJ =====
        LSTScriptBridge.machine("LENGSHANG_ys_HMKJY_SGLGZJ", new LSTRecipeMachine(LSTGroups.YS_HMKJY_JQ, LSTReg.lstStack("LENGSHANG_ys_HMKJY_SGLGZJ"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("SHUAGUAILONG_MACHINE",10),null,null,null,null,null,null,null,null}, 1200000, 600000)
                .addRecipe(4, new ItemStack[]{LSTReg.mat("CHAIN",64)}, new ItemStack[]{LSTReg.mat("SPAWNER",1)}, new double[]{1.0})
                .addRecipe(4, new ItemStack[]{LSTReg.mat("SPAWNER",1)}, new ItemStack[]{LSTReg.sf("BROKEN_SPAWNER",1)}, new double[]{1.0})
                .addRecipe(5, new ItemStack[]{LSTReg.sf("BROKEN_SPAWNER",1)}, new ItemStack[]{LSTReg.sf("REINFORCED_SPAWNER",1)}, new double[]{1.0})
                .build());
        // ===== LENGSHANG_ys_HMKJY_FZCZY_1 =====
        LSTScriptBridge.machine("LENGSHANG_ys_HMKJY_FZCZY_1", new LSTRecipeMachine(LSTGroups.YS_HMKJY_JQ, LSTReg.lstStack("LENGSHANG_ys_HMKJY_FZCZY_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("MOLECULAR_RECOMBINATION_INSTRUMENT_I",10),null,null,null,null,null,null,null,null}, 360000, 18000)
                .addRecipe(45, new ItemStack[]{LSTReg.mat("SUGAR_CANE",1)}, new ItemStack[]{LSTReg.mat("SLIME_BALL",1)}, new double[]{1.0})
                .addRecipe(45, new ItemStack[]{LSTReg.mat("POPPY",1)}, new ItemStack[]{LSTReg.mat("WITHER_ROSE",1)}, new double[]{1.0})
                .addRecipe(50, new ItemStack[]{LSTReg.mat("CHORUS_FRUIT",1)}, new ItemStack[]{LSTReg.mat("CHORUS_PLANT",1)}, new double[]{1.0})
                .addRecipe(60, new ItemStack[]{LSTReg.mat("EGG",1)}, new ItemStack[]{LSTReg.mat("TURTLE_EGG",1)}, new double[]{1.0})
                .addRecipe(65, new ItemStack[]{LSTReg.mat("COD",1)}, new ItemStack[]{LSTReg.mat("NAUTILUS_SHELL",1)}, new double[]{1.0})
                .addRecipe(42, new ItemStack[]{LSTReg.mat("SUGAR",1)}, new ItemStack[]{LSTReg.mat("HONEYCOMB",1)}, new double[]{1.0})
                .addRecipe(120, new ItemStack[]{LSTReg.mat("MUSIC_DISC_11",1)}, new ItemStack[]{LSTReg.mat("MUSIC_DISC_PIGSTEP",1)}, new double[]{1.0})
                .addRecipe(38, new ItemStack[]{LSTReg.mat("CACTUS",1)}, new ItemStack[]{LSTReg.mat("BAMBOO",1)}, new double[]{1.0})
                .addRecipe(42, new ItemStack[]{LSTReg.mat("GLASS_BOTTLE",1)}, new ItemStack[]{LSTReg.mat("EXPERIENCE_BOTTLE",1)}, new double[]{1.0})
                .addRecipe(80, new ItemStack[]{LSTReg.mat("EXPERIENCE_BOTTLE",1)}, new ItemStack[]{LSTReg.mat("DRAGON_BREATH",1)}, new double[]{1.0})
                .addRecipe(72, new ItemStack[]{LSTReg.mat("FEATHER",1)}, new ItemStack[]{LSTReg.mat("PHANTOM_MEMBRANE",1)}, new double[]{1.0})
                .addRecipe(48, new ItemStack[]{LSTReg.mat("CARROT",1)}, new ItemStack[]{LSTReg.mat("RABBIT_FOOT",1)}, new double[]{1.0})
                .addRecipe(52, new ItemStack[]{LSTReg.mat("STRING",1)}, new ItemStack[]{LSTReg.mat("COBWEB",1)}, new double[]{1.0})
                .addRecipe(26, new ItemStack[]{LSTReg.mat("BLUE_DYE",1)}, new ItemStack[]{LSTReg.mat("PRISMARINE_SHARD",1)}, new double[]{1.0})
                .addRecipe(26, new ItemStack[]{LSTReg.mat("CHORUS_PLANT",1)}, new ItemStack[]{LSTReg.mat("CHORUS_FLOWER",1)}, new double[]{1.0})
                .addRecipe(90, new ItemStack[]{LSTReg.mat("CHORUS_FLOWER",1)}, new ItemStack[]{LSTReg.mat("SHULKER_SHELL",1)}, new double[]{1.0})
                .addRecipe(26, new ItemStack[]{LSTReg.mat("PRISMARINE_SHARD",1)}, new ItemStack[]{LSTReg.mat("PRISMARINE_CRYSTALS",1)}, new double[]{1.0})
                .build());
        // ===== LENGSHANG_ys_HMKJY_FZCZY_2 =====
        LSTScriptBridge.machine("LENGSHANG_ys_HMKJY_FZCZY_2", new LSTRecipeMachine(LSTGroups.YS_HMKJY_JQ, LSTReg.lstStack("LENGSHANG_ys_HMKJY_FZCZY_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("MOLECULAR_RECOMBINATION_INSTRUMENT_II",10),null,null,null,null,null,null,null,null}, 700000, 70000)
                .addRecipe(3, new ItemStack[]{LSTReg.mat("COBWEB",32)}, new ItemStack[]{LSTReg.mat("NETHER_STAR",1)}, new double[]{1.0})
                .addRecipe(100, new ItemStack[]{LSTReg.mat("TURTLE_EGG",35)}, new ItemStack[]{LSTReg.mat("DRAGON_EGG",1)}, new double[]{1.0})
                .addRecipe(2, new ItemStack[]{LSTReg.mat("SKELETON_SKULL",16)}, new ItemStack[]{LSTReg.mat("WITHER_SKELETON_SKULL",1)}, new double[]{1.0})
                .addRecipe(12, new ItemStack[]{LSTReg.mat("WITHER_SKELETON_SKULL",20)}, new ItemStack[]{LSTReg.mat("DRAGON_HEAD",1)}, new double[]{1.0})
                .addRecipe(50, new ItemStack[]{LSTReg.mat("NAUTILUS_SHELL",64)}, new ItemStack[]{LSTReg.mat("HEART_OF_THE_SEA",1)}, new double[]{1.0})
                .addRecipe(5, new ItemStack[]{LSTReg.mat("SLIME_BALL",32)}, new ItemStack[]{LSTReg.mat("TURTLE_SCUTE",1)}, new double[]{1.0})
                .addRecipe(5, new ItemStack[]{LSTReg.mat("BEEF",32)}, new ItemStack[]{LSTReg.mat("PLAYER_HEAD",1)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("GUNPOWDER",32)}, new ItemStack[]{LSTReg.mat("CREEPER_HEAD",1)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("BONE",32)}, new ItemStack[]{LSTReg.mat("SKELETON_SKULL",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("SUGAR_CANE",32)}, new ItemStack[]{LSTReg.mat("SLIME_BALL",1)}, new double[]{1.0})
                .addRecipe(5, new ItemStack[]{LSTReg.mat("POPPY",32)}, new ItemStack[]{LSTReg.mat("WITHER_ROSE",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("CHORUS_FRUIT",25)}, new ItemStack[]{LSTReg.mat("CHORUS_PLANT",1)}, new double[]{1.0})
                .addRecipe(4, new ItemStack[]{LSTReg.mat("EGG",16)}, new ItemStack[]{LSTReg.mat("TURTLE_EGG",1)}, new double[]{1.0})
                .addRecipe(3, new ItemStack[]{LSTReg.mat("COD",25)}, new ItemStack[]{LSTReg.mat("NAUTILUS_SHELL",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("SUGAR",25)}, new ItemStack[]{LSTReg.mat("HONEYCOMB",1)}, new double[]{1.0})
                .addRecipe(8, new ItemStack[]{LSTReg.mat("MUSIC_DISC_11",1)}, new ItemStack[]{LSTReg.mat("MUSIC_DISC_PIGSTEP",1)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("CACTUS",32)}, new ItemStack[]{LSTReg.mat("BAMBOO",1)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("GLASS_BOTTLE",32)}, new ItemStack[]{LSTReg.mat("EXPERIENCE_BOTTLE",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("EXPERIENCE_BOTTLE",36)}, new ItemStack[]{LSTReg.mat("DRAGON_BREATH",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("FEATHER",30)}, new ItemStack[]{LSTReg.mat("PHANTOM_MEMBRANE",1)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("CARROT",25)}, new ItemStack[]{LSTReg.mat("RABBIT_FOOT",1)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("STRING",40)}, new ItemStack[]{LSTReg.mat("COBWEB",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("BLUE_DYE",22)}, new ItemStack[]{LSTReg.mat("PRISMARINE_SHARD",1)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("CHORUS_PLANT",10)}, new ItemStack[]{LSTReg.mat("CHORUS_FLOWER",1)}, new double[]{1.0})
                .addRecipe(4, new ItemStack[]{LSTReg.mat("CHORUS_FLOWER",35)}, new ItemStack[]{LSTReg.mat("SHULKER_SHELL",1)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("PRISMARINE_SHARD",4)}, new ItemStack[]{LSTReg.mat("PRISMARINE_CRYSTALS",1)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("ROTTEN_FLESH",32)}, new ItemStack[]{LSTReg.mat("ZOMBIE_HEAD",1)}, new double[]{1.0})
                .build());
        // ===== LENGSHANG_ys_HMKJY_FZCZY_3 =====
        LSTScriptBridge.machine("LENGSHANG_ys_HMKJY_FZCZY_3", new LSTRecipeMachine(LSTGroups.YS_HMKJY_JQ, LSTReg.lstStack("LENGSHANG_ys_HMKJY_FZCZY_3"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("MOLECULAR_RECOMBINATION_INSTRUMENT_III",10),null,null,null,null,null,null,null,null}, 9000000, 200000)
                .addRecipe(1, new ItemStack[]{LSTReg.mat("COBWEB",16)}, new ItemStack[]{LSTReg.mat("NETHER_STAR",1)}, new double[]{1.0})
                .addRecipe(50, new ItemStack[]{LSTReg.mat("TURTLE_EGG",32)}, new ItemStack[]{LSTReg.mat("DRAGON_EGG",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("SKELETON_SKULL",32)}, new ItemStack[]{LSTReg.mat("WITHER_SKELETON_SKULL",1)}, new double[]{1.0})
                .addRecipe(5, new ItemStack[]{LSTReg.mat("WITHER_SKELETON_SKULL",16)}, new ItemStack[]{LSTReg.mat("DRAGON_HEAD",1)}, new double[]{1.0})
                .addRecipe(22, new ItemStack[]{LSTReg.mat("NAUTILUS_SHELL",48)}, new ItemStack[]{LSTReg.mat("HEART_OF_THE_SEA",1)}, new double[]{1.0})
                .addRecipe(3, new ItemStack[]{LSTReg.mat("SLIME_BALL",16)}, new ItemStack[]{LSTReg.mat("TURTLE_SCUTE",1)}, new double[]{1.0})
                .addRecipe(2, new ItemStack[]{LSTReg.mat("BEEF",32)}, new ItemStack[]{LSTReg.mat("PLAYER_HEAD",1)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("GUNPOWDER",32)}, new ItemStack[]{LSTReg.mat("CREEPER_HEAD",1)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("BONE",32)}, new ItemStack[]{LSTReg.mat("SKELETON_SKULL",1)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("SUGAR_CANE",32)}, new ItemStack[]{LSTReg.mat("SLIME_BALL",1)}, new double[]{1.0})
                .addRecipe(2, new ItemStack[]{LSTReg.mat("POPPY",25)}, new ItemStack[]{LSTReg.mat("WITHER_ROSE",1)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("CHORUS_FRUIT",16)}, new ItemStack[]{LSTReg.mat("CHORUS_PLANT",1)}, new double[]{1.0})
                .addRecipe(2, new ItemStack[]{LSTReg.mat("EGG",16)}, new ItemStack[]{LSTReg.mat("TURTLE_EGG",1)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("COD",18)}, new ItemStack[]{LSTReg.mat("NAUTILUS_SHELL",1)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("SUGAR",32)}, new ItemStack[]{LSTReg.mat("HONEYCOMB",1)}, new double[]{1.0})
                .addRecipe(2, new ItemStack[]{LSTReg.mat("MUSIC_DISC_11",1)}, new ItemStack[]{LSTReg.mat("MUSIC_DISC_PIGSTEP",1)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("CACTUS",24)}, new ItemStack[]{LSTReg.mat("BAMBOO",1)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("GLASS_BOTTLE",20)}, new ItemStack[]{LSTReg.mat("EXPERIENCE_BOTTLE",1)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("EXPERIENCE_BOTTLE",8)}, new ItemStack[]{LSTReg.mat("DRAGON_BREATH",1)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("FEATHER",32)}, new ItemStack[]{LSTReg.mat("PHANTOM_MEMBRANE",1)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("CARROT",20)}, new ItemStack[]{LSTReg.mat("RABBIT_FOOT",1)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("STRING",32)}, new ItemStack[]{LSTReg.mat("COBWEB",1)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("BLUE_DYE",20)}, new ItemStack[]{LSTReg.mat("PRISMARINE_SHARD",1)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("CHORUS_PLANT",8)}, new ItemStack[]{LSTReg.mat("CHORUS_FLOWER",1)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("CHORUS_FLOWER",32)}, new ItemStack[]{LSTReg.mat("SHULKER_SHELL",1)}, new double[]{1.0})
                .addRecipe(1660, new ItemStack[]{LSTReg.mat("DEAD_BUSH",1)}, new ItemStack[]{LSTReg.mat("COMMAND_BLOCK",1)}, new double[]{1.0})
                .addRecipe(1400, new ItemStack[]{LSTReg.mat("CRIMSON_FUNGUS",1)}, new ItemStack[]{LSTReg.mat("STRUCTURE_VOID",1)}, new double[]{1.0})
                .addRecipe(1240, new ItemStack[]{LSTReg.mat("PURPUR_BLOCK",1)}, new ItemStack[]{LSTReg.mat("STRUCTURE_BLOCK",1)}, new double[]{1.0})
                .addRecipe(1240, new ItemStack[]{LSTReg.mat("STRUCTURE_BLOCK",1)}, new ItemStack[]{LSTReg.mat("JIGSAW",1)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("PRISMARINE_SHARD",2)}, new ItemStack[]{LSTReg.mat("PRISMARINE_CRYSTALS",2)}, new double[]{1.0})
                .addRecipe(140, new ItemStack[]{LSTReg.sf("INFINITY_SINGULARITY",32)}, new ItemStack[]{LSTReg.sf("HAIMAN_INFINITY_CONSTRUCTOR_2",1)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("ROTTEN_FLESH",32)}, new ItemStack[]{LSTReg.mat("ZOMBIE_HEAD",1)}, new double[]{1.0})
                .build());
        // ===== LENGSHANG_ys_HMKJY_FZCZY_4 =====
        LSTScriptBridge.machine("LENGSHANG_ys_HMKJY_FZCZY_4", new LSTRecipeMachine(LSTGroups.YS_HMKJY_JQ, LSTReg.lstStack("LENGSHANG_ys_HMKJY_FZCZY_4"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("MOLECULAR_RECOMBINATION_INSTRUMENT_IV",10),null,null,null,null,null,null,null,null}, 9300000, 300000)
                .addRecipe(0, new ItemStack[]{LSTReg.mat("COBWEB",8)}, new ItemStack[]{LSTReg.mat("NETHER_STAR",4)}, new double[]{1.0})
                .addRecipe(5, new ItemStack[]{LSTReg.mat("TURTLE_EGG",32)}, new ItemStack[]{LSTReg.mat("DRAGON_EGG",1)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("SKELETON_SKULL",8)}, new ItemStack[]{LSTReg.mat("WITHER_SKELETON_SKULL",4)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("WITHER_SKELETON_SKULL",4)}, new ItemStack[]{LSTReg.mat("DRAGON_HEAD",1)}, new double[]{1.0})
                .addRecipe(3, new ItemStack[]{LSTReg.mat("NAUTILUS_SHELL",32)}, new ItemStack[]{LSTReg.mat("HEART_OF_THE_SEA",2)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("SLIME_BALL",16)}, new ItemStack[]{LSTReg.mat("TURTLE_SCUTE",5)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("BEEF",16)}, new ItemStack[]{LSTReg.mat("PLAYER_HEAD",4)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("GUNPOWDER",16)}, new ItemStack[]{LSTReg.mat("CREEPER_HEAD",4)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("BONE",16)}, new ItemStack[]{LSTReg.mat("SKELETON_SKULL",4)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("SUGAR_CANE",48)}, new ItemStack[]{LSTReg.mat("SLIME_BALL",25)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("POPPY",20)}, new ItemStack[]{LSTReg.mat("WITHER_ROSE",5)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("CHORUS_FRUIT",15)}, new ItemStack[]{LSTReg.mat("CHORUS_PLANT",15)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("EGG",16)}, new ItemStack[]{LSTReg.mat("TURTLE_EGG",5)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("COD",8)}, new ItemStack[]{LSTReg.mat("NAUTILUS_SHELL",5)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("SUGAR",12)}, new ItemStack[]{LSTReg.mat("HONEYCOMB",6)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("MUSIC_DISC_11",1)}, new ItemStack[]{LSTReg.mat("MUSIC_DISC_PIGSTEP",1)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("CACTUS",4)}, new ItemStack[]{LSTReg.mat("BAMBOO",32)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("GLASS_BOTTLE",10)}, new ItemStack[]{LSTReg.mat("EXPERIENCE_BOTTLE",10)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("EXPERIENCE_BOTTLE",12)}, new ItemStack[]{LSTReg.mat("DRAGON_BREATH",12)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("FEATHER",12)}, new ItemStack[]{LSTReg.mat("PHANTOM_MEMBRANE",12)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("CARROT",6)}, new ItemStack[]{LSTReg.mat("RABBIT_FOOT",5)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("STRING",10)}, new ItemStack[]{LSTReg.mat("COBWEB",10)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("BLUE_DYE",8)}, new ItemStack[]{LSTReg.mat("PRISMARINE_SHARD",6)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("CHORUS_PLANT",15)}, new ItemStack[]{LSTReg.mat("CHORUS_FLOWER",15)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("CHORUS_FLOWER",5)}, new ItemStack[]{LSTReg.mat("SHULKER_SHELL",5)}, new double[]{1.0})
                .addRecipe(600, new ItemStack[]{LSTReg.mat("DEAD_BUSH",1)}, new ItemStack[]{LSTReg.mat("COMMAND_BLOCK",1)}, new double[]{1.0})
                .addRecipe(310, new ItemStack[]{LSTReg.mat("CRIMSON_FUNGUS",1)}, new ItemStack[]{LSTReg.mat("STRUCTURE_VOID",1)}, new double[]{1.0})
                .addRecipe(265, new ItemStack[]{LSTReg.mat("PURPUR_BLOCK",1)}, new ItemStack[]{LSTReg.mat("STRUCTURE_BLOCK",1)}, new double[]{1.0})
                .addRecipe(265, new ItemStack[]{LSTReg.mat("STRUCTURE_BLOCK",1)}, new ItemStack[]{LSTReg.mat("JIGSAW",1)}, new double[]{1.0})
                .addRecipe(1668, new ItemStack[]{LSTReg.mat("JIGSAW",2)}, new ItemStack[]{LSTReg.sf("MINECRAFT_DEAD_BUSH_GHOST",1)}, new double[]{1.0})
                .addRecipe(80, new ItemStack[]{LSTReg.sf("INFINITY_SINGULARITY",32)}, new ItemStack[]{LSTReg.sf("HAIMAN_INFINITY_CONSTRUCTOR_2",1)}, new double[]{1.0})
                .addRecipe(30, new ItemStack[]{LSTReg.saved("海曼科技院/ARTIFICIAL_MILKY_WAY",1)}, new ItemStack[]{LSTReg.sf("HAIMAN_GALAXY_PIECE",1)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("PRISMARINE_SHARD",1)}, new ItemStack[]{LSTReg.mat("PRISMARINE_CRYSTALS",4)}, new double[]{1.0})
                .addRecipe(25, new ItemStack[]{LSTReg.mat("GOLD_INGOT",16)}, new ItemStack[]{LSTReg.mat("PIGLIN_HEAD",1)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("ROTTEN_FLESH",16)}, new ItemStack[]{LSTReg.mat("ZOMBIE_HEAD",4)}, new double[]{1.0})
                .build());
        // ===== LENGSHANG_ys_HMKJY_FZCZY_5 =====
        LSTScriptBridge.machine("LENGSHANG_ys_HMKJY_FZCZY_5", new LSTRecipeMachine(LSTGroups.YS_HMKJY_JQ, LSTReg.lstStack("LENGSHANG_ys_HMKJY_FZCZY_5"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("MOLECULAR_RECOMBINATION_INSTRUMENT_V",10),null,null,null,null,null,null,null,null}, 9500000, 400000)
                .addRecipe(0, new ItemStack[]{LSTReg.mat("COBWEB",8)}, new ItemStack[]{LSTReg.mat("NETHER_STAR",16)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("TURTLE_EGG",8)}, new ItemStack[]{LSTReg.mat("DRAGON_EGG",16)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("SKELETON_SKULL",8)}, new ItemStack[]{LSTReg.mat("WITHER_SKELETON_SKULL",16)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("WITHER_SKELETON_SKULL",8)}, new ItemStack[]{LSTReg.mat("DRAGON_HEAD",16)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("NAUTILUS_SHELL",8)}, new ItemStack[]{LSTReg.mat("HEART_OF_THE_SEA",16)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("SLIME_BALL",16)}, new ItemStack[]{LSTReg.mat("TURTLE_SCUTE",32)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("BEEF",8)}, new ItemStack[]{LSTReg.mat("PLAYER_HEAD",16)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("GUNPOWDER",8)}, new ItemStack[]{LSTReg.mat("CREEPER_HEAD",16)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("BONE",8)}, new ItemStack[]{LSTReg.mat("SKELETON_SKULL",16)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("SUGAR_CANE",16)}, new ItemStack[]{LSTReg.mat("SLIME_BALL",64)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("POPPY",10)}, new ItemStack[]{LSTReg.mat("WITHER_ROSE",22)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("CHORUS_FRUIT",8)}, new ItemStack[]{LSTReg.mat("CHORUS_PLANT",32)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("EGG",16)}, new ItemStack[]{LSTReg.mat("TURTLE_EGG",22)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("COD",16)}, new ItemStack[]{LSTReg.mat("NAUTILUS_SHELL",22)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("SUGAR",16)}, new ItemStack[]{LSTReg.mat("HONEYCOMB",32)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("MUSIC_DISC_11",1)}, new ItemStack[]{LSTReg.mat("MUSIC_DISC_PIGSTEP",1),LSTReg.mat("MUSIC_DISC_PIGSTEP",1)}, new double[]{1.0,1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("CACTUS",16)}, new ItemStack[]{LSTReg.mat("BAMBOO",64)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("GLASS_BOTTLE",16)}, new ItemStack[]{LSTReg.mat("EXPERIENCE_BOTTLE",32)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("EXPERIENCE_BOTTLE",16)}, new ItemStack[]{LSTReg.mat("DRAGON_BREATH",32)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("FEATHER",16)}, new ItemStack[]{LSTReg.mat("PHANTOM_MEMBRANE",32)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("CARROT",8)}, new ItemStack[]{LSTReg.mat("RABBIT_FOOT",16)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("STRING",16)}, new ItemStack[]{LSTReg.mat("COBWEB",32)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("BLUE_DYE",8)}, new ItemStack[]{LSTReg.mat("PRISMARINE_SHARD",32)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("CHORUS_PLANT",16)}, new ItemStack[]{LSTReg.mat("CHORUS_FLOWER",48)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("CHORUS_FLOWER",8)}, new ItemStack[]{LSTReg.mat("SHULKER_SHELL",16)}, new double[]{1.0})
                .addRecipe(50, new ItemStack[]{LSTReg.mat("DEAD_BUSH",16)}, new ItemStack[]{LSTReg.mat("COMMAND_BLOCK",16)}, new double[]{1.0})
                .addRecipe(70, new ItemStack[]{LSTReg.mat("CRIMSON_FUNGUS",16)}, new ItemStack[]{LSTReg.mat("STRUCTURE_VOID",16)}, new double[]{1.0})
                .addRecipe(52, new ItemStack[]{LSTReg.mat("PURPUR_BLOCK",16)}, new ItemStack[]{LSTReg.mat("STRUCTURE_BLOCK",16)}, new double[]{1.0})
                .addRecipe(52, new ItemStack[]{LSTReg.mat("STRUCTURE_BLOCK",16)}, new ItemStack[]{LSTReg.mat("JIGSAW",16)}, new double[]{1.0})
                .addRecipe(380, new ItemStack[]{LSTReg.mat("JIGSAW",2)}, new ItemStack[]{LSTReg.sf("MINECRAFT_DEAD_BUSH_GHOST",1)}, new double[]{1.0})
                .addRecipe(25, new ItemStack[]{LSTReg.sf("INFINITY_SINGULARITY",32)}, new ItemStack[]{LSTReg.sf("HAIMAN_INFINITY_CONSTRUCTOR_2",1)}, new double[]{1.0})
                .addRecipe(18, new ItemStack[]{LSTReg.saved("海曼科技院/ARTIFICIAL_MILKY_WAY",1)}, new ItemStack[]{LSTReg.sf("HAIMAN_GALAXY_PIECE",1)}, new double[]{1.0})
                .addRecipe(420, new ItemStack[]{LSTReg.mat("STONE",64)}, new ItemStack[]{LSTReg.mat("BEDROCK",1)}, new double[]{1.0})
                .addRecipe(420, new ItemStack[]{LSTReg.mat("STRUCTURE_VOID",1)}, new ItemStack[]{LSTReg.mat("BARRIER",1)}, new double[]{1.0})
                .addRecipe(320, new ItemStack[]{LSTReg.sf("INFINITE_PANEL",12),LSTReg.sf("CHUANGSHI_YIN",6)}, new ItemStack[]{LSTReg.sf("HT_MODULE_1",1)}, new double[]{1.0})
                .addRecipe(510, new ItemStack[]{LSTReg.sf("HAIMAN_GALAXY_PIECE",16)}, new ItemStack[]{LSTReg.sf("HAIMAN_BLACK_HOLE_PIECE",1)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("GOLDEN_APPLE",4)}, new ItemStack[]{LSTReg.mat("ENCHANTED_GOLDEN_APPLE",4)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("PRISMARINE_SHARD",1)}, new ItemStack[]{LSTReg.mat("PRISMARINE_CRYSTALS",8)}, new double[]{1.0})
                .addRecipe(5, new ItemStack[]{LSTReg.mat("GOLD_INGOT",6)}, new ItemStack[]{LSTReg.mat("PIGLIN_HEAD",1)}, new double[]{1.0})
                .addRecipe(0, new ItemStack[]{LSTReg.mat("ROTTEN_FLESH",8)}, new ItemStack[]{LSTReg.mat("ZOMBIE_HEAD",1)}, new double[]{1.0})
                .build());
        // ===== LENGSHANG_ys_HMKJY_JLJ =====
        LSTScriptBridge.machine("LENGSHANG_ys_HMKJY_JLJ", new LSTRecipeMachine(LSTGroups.YS_HMKJY_JQ, LSTReg.lstStack("LENGSHANG_ys_HMKJY_JLJ"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("HAIMAN_MUSHROOM_MACHINE",32),null,null,null,null,null,null,null,null}, 10000, 150)
                .addRecipe(1, new ItemStack[]{LSTReg.mat("BROWN_MUSHROOM",32)}, new ItemStack[]{LSTReg.mat("BROWN_MUSHROOM",64)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("RED_MUSHROOM",32)}, new ItemStack[]{LSTReg.mat("RED_MUSHROOM",64)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("WARPED_FUNGUS",32)}, new ItemStack[]{LSTReg.mat("WARPED_FUNGUS",64)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("CRIMSON_FUNGUS",32)}, new ItemStack[]{LSTReg.mat("CRIMSON_FUNGUS",64)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("WARPED_ROOTS",32)}, new ItemStack[]{LSTReg.mat("WARPED_ROOTS",64)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("CRIMSON_ROOTS",32)}, new ItemStack[]{LSTReg.mat("CRIMSON_ROOTS",64)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("BROWN_MUSHROOM_BLOCK",32)}, new ItemStack[]{LSTReg.mat("BROWN_MUSHROOM_BLOCK",64)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("RED_MUSHROOM_BLOCK",32)}, new ItemStack[]{LSTReg.mat("RED_MUSHROOM_BLOCK",64)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("MUSHROOM_STEM",32)}, new ItemStack[]{LSTReg.mat("MUSHROOM_STEM",64)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("SHROOMLIGHT",32)}, new ItemStack[]{LSTReg.mat("SHROOMLIGHT",64)}, new double[]{1.0})
                .build());
        // ===== LENGSHANG_ys_HMKJY_HJJ_1 =====
        LSTScriptBridge.machine("LENGSHANG_ys_HMKJY_HJJ_1", new LSTRecipeMachine(LSTGroups.YS_HMKJY_JQ, LSTReg.lstStack("LENGSHANG_ys_HMKJY_HJJ_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("HAIMAN_FLOWER_MACHINE",6),null,null,null,null,null,null,null,null}, 5000, 75)
                .addRecipe(1, new ItemStack[]{LSTReg.mat("DANDELION",1)}, new ItemStack[]{LSTReg.mat("DANDELION",2)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("POPPY",1)}, new ItemStack[]{LSTReg.mat("POPPY",2)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("BLUE_ORCHID",1)}, new ItemStack[]{LSTReg.mat("BLUE_ORCHID",2)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("ALLIUM",1)}, new ItemStack[]{LSTReg.mat("ALLIUM",2)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("AZURE_BLUET",1)}, new ItemStack[]{LSTReg.mat("AZURE_BLUET",2)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("RED_TULIP",1)}, new ItemStack[]{LSTReg.mat("RED_TULIP",2)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("ORANGE_TULIP",1)}, new ItemStack[]{LSTReg.mat("ORANGE_TULIP",2)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("WHITE_TULIP",1)}, new ItemStack[]{LSTReg.mat("WHITE_TULIP",2)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("PINK_TULIP",1)}, new ItemStack[]{LSTReg.mat("PINK_TULIP",2)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("OXEYE_DAISY",1)}, new ItemStack[]{LSTReg.mat("OXEYE_DAISY",2)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("CORNFLOWER",1)}, new ItemStack[]{LSTReg.mat("CORNFLOWER",2)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("LILY_OF_THE_VALLEY",1)}, new ItemStack[]{LSTReg.mat("LILY_OF_THE_VALLEY",2)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("WITHER_ROSE",1)}, new ItemStack[]{LSTReg.mat("WITHER_ROSE",2)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("SUNFLOWER",1)}, new ItemStack[]{LSTReg.mat("SUNFLOWER",2)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("LILAC",1)}, new ItemStack[]{LSTReg.mat("LILAC",2)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("PEONY",1)}, new ItemStack[]{LSTReg.mat("PEONY",2)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("ROSE_BUSH",1)}, new ItemStack[]{LSTReg.mat("ROSE_BUSH",2)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("SPORE_BLOSSOM",1)}, new ItemStack[]{LSTReg.mat("SPORE_BLOSSOM",2)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("AZALEA",1)}, new ItemStack[]{LSTReg.mat("AZALEA",2)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("FLOWERING_AZALEA",1)}, new ItemStack[]{LSTReg.mat("FLOWERING_AZALEA",2)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("FLOWERING_AZALEA_LEAVES",1)}, new ItemStack[]{LSTReg.mat("FLOWERING_AZALEA_LEAVES",2)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("PINK_PETALS",1)}, new ItemStack[]{LSTReg.mat("PINK_PETALS",2)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("CHORUS_FLOWER",1)}, new ItemStack[]{LSTReg.mat("CHORUS_FLOWER",2)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("TORCHFLOWER",1)}, new ItemStack[]{LSTReg.mat("TORCHFLOWER",2)}, new double[]{1.0})
                .build());
        // ===== LENGSHANG_ys_HMKJY_HJJ_2 =====
        LSTScriptBridge.machine("LENGSHANG_ys_HMKJY_HJJ_2", new LSTRecipeMachine(LSTGroups.YS_HMKJY_JQ, LSTReg.lstStack("LENGSHANG_ys_HMKJY_HJJ_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_ys_HMKJY_HJJ_1",32),null,null,null,null,null,null,null,null}, 50000, 750)
                .addRecipe(1, new ItemStack[]{LSTReg.mat("DANDELION",32)}, new ItemStack[]{LSTReg.mat("DANDELION",64)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("POPPY",32)}, new ItemStack[]{LSTReg.mat("POPPY",64)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("BLUE_ORCHID",32)}, new ItemStack[]{LSTReg.mat("BLUE_ORCHID",64)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("ALLIUM",32)}, new ItemStack[]{LSTReg.mat("ALLIUM",64)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("AZURE_BLUET",32)}, new ItemStack[]{LSTReg.mat("AZURE_BLUET",64)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("RED_TULIP",32)}, new ItemStack[]{LSTReg.mat("RED_TULIP",64)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("ORANGE_TULIP",32)}, new ItemStack[]{LSTReg.mat("ORANGE_TULIP",64)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("WHITE_TULIP",32)}, new ItemStack[]{LSTReg.mat("WHITE_TULIP",64)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("PINK_TULIP",32)}, new ItemStack[]{LSTReg.mat("PINK_TULIP",64)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("OXEYE_DAISY",32)}, new ItemStack[]{LSTReg.mat("OXEYE_DAISY",64)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("CORNFLOWER",32)}, new ItemStack[]{LSTReg.mat("CORNFLOWER",64)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("LILY_OF_THE_VALLEY",32)}, new ItemStack[]{LSTReg.mat("LILY_OF_THE_VALLEY",64)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("WITHER_ROSE",32)}, new ItemStack[]{LSTReg.mat("WITHER_ROSE",64)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("SUNFLOWER",32)}, new ItemStack[]{LSTReg.mat("SUNFLOWER",64)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("LILAC",32)}, new ItemStack[]{LSTReg.mat("LILAC",64)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("PEONY",32)}, new ItemStack[]{LSTReg.mat("PEONY",64)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("ROSE_BUSH",32)}, new ItemStack[]{LSTReg.mat("ROSE_BUSH",64)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("SPORE_BLOSSOM",32)}, new ItemStack[]{LSTReg.mat("SPORE_BLOSSOM",64)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("AZALEA",32)}, new ItemStack[]{LSTReg.mat("AZALEA",64)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("FLOWERING_AZALEA",32)}, new ItemStack[]{LSTReg.mat("FLOWERING_AZALEA",64)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("FLOWERING_AZALEA_LEAVES",32)}, new ItemStack[]{LSTReg.mat("FLOWERING_AZALEA_LEAVES",64)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("PINK_PETALS",32)}, new ItemStack[]{LSTReg.mat("PINK_PETALS",64)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("CHORUS_FLOWER",32)}, new ItemStack[]{LSTReg.mat("CHORUS_FLOWER",64)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("TORCHFLOWER",32)}, new ItemStack[]{LSTReg.mat("TORCHFLOWER",64)}, new double[]{1.0})
                .build());
        // ===== LENGSHANG_ys_HMKJY_ZWZPJ_1 =====
        LSTScriptBridge.machine("LENGSHANG_ys_HMKJY_ZWZPJ_1", new LSTRecipeMachine(LSTGroups.YS_HMKJY_JQ, LSTReg.lstStack("LENGSHANG_ys_HMKJY_ZWZPJ_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("HAIMAN_PLANT_MACHINE",6),null,null,null,null,null,null,null,null}, 5000, 75)
                .addRecipe(1, new ItemStack[]{LSTReg.mat("SHORT_GRASS",1)}, new ItemStack[]{LSTReg.mat("SHORT_GRASS",2)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("TALL_GRASS",1)}, new ItemStack[]{LSTReg.mat("TALL_GRASS",2)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("FERN",1)}, new ItemStack[]{LSTReg.mat("FERN",2)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("LARGE_FERN",1)}, new ItemStack[]{LSTReg.mat("LARGE_FERN",2)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("DEAD_BUSH",1)}, new ItemStack[]{LSTReg.mat("DEAD_BUSH",2)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("SEAGRASS",1)}, new ItemStack[]{LSTReg.mat("SEAGRASS",2)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("SEA_PICKLE",1)}, new ItemStack[]{LSTReg.mat("SEA_PICKLE",2)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("KELP",1)}, new ItemStack[]{LSTReg.mat("KELP",2)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("NETHER_SPROUTS",1)}, new ItemStack[]{LSTReg.mat("NETHER_SPROUTS",2)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("WARPED_ROOTS",1)}, new ItemStack[]{LSTReg.mat("WARPED_ROOTS",2)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("CRIMSON_ROOTS",1)}, new ItemStack[]{LSTReg.mat("CRIMSON_ROOTS",2)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("VINE",1)}, new ItemStack[]{LSTReg.mat("VINE",2)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("LILY_PAD",1)}, new ItemStack[]{LSTReg.mat("LILY_PAD",2)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("GLOW_LICHEN",1)}, new ItemStack[]{LSTReg.mat("GLOW_LICHEN",2)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("HANGING_ROOTS",1)}, new ItemStack[]{LSTReg.mat("HANGING_ROOTS",2)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("MOSS_BLOCK",1)}, new ItemStack[]{LSTReg.mat("MOSS_BLOCK",2)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("MOSS_CARPET",1)}, new ItemStack[]{LSTReg.mat("MOSS_CARPET",2)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("SMALL_DRIPLEAF",1)}, new ItemStack[]{LSTReg.mat("SMALL_DRIPLEAF",2)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("BIG_DRIPLEAF",1)}, new ItemStack[]{LSTReg.mat("BIG_DRIPLEAF",2)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("GLOW_BERRIES",1)}, new ItemStack[]{LSTReg.mat("GLOW_BERRIES",2)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("CHORUS_PLANT",1)}, new ItemStack[]{LSTReg.mat("CHORUS_PLANT",2)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("WEEPING_VINES",1)}, new ItemStack[]{LSTReg.mat("WEEPING_VINES",2)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("TWISTING_VINES",1)}, new ItemStack[]{LSTReg.mat("TWISTING_VINES",2)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("SCULK_VEIN",1)}, new ItemStack[]{LSTReg.mat("SCULK_VEIN",2)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("BAMBOO",1)}, new ItemStack[]{LSTReg.mat("BAMBOO",2)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("CACTUS",1)}, new ItemStack[]{LSTReg.mat("CACTUS",2)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("SUGAR_CANE",1)}, new ItemStack[]{LSTReg.mat("SUGAR_CANE",2)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("COCOA_BEANS",1)}, new ItemStack[]{LSTReg.mat("COCOA_BEANS",2)}, new double[]{1.0})
                .addRecipe(1, new ItemStack[]{LSTReg.mat("PITCHER_PLANT",1)}, new ItemStack[]{LSTReg.mat("PITCHER_PLANT",2)}, new double[]{1.0})
                .build());
    }

    private LSTMachinesA_0() {
    }
}
