package io.Yomicer.LengShangTech.gen;

import io.Yomicer.LengShangTech.core.*;
import io.Yomicer.LengShangTech.machines.*;
import io.Yomicer.LengShangTech.scripts.*;
import io.Yomicer.LengShangTech.LengShangEvo;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.items.electric.Capacitor;
import org.bukkit.inventory.ItemStack;

/** 冷殇材料生成器 (自动转换)。 */
public final class LSTMatGen_5 {

    public static void setup(LengShangEvo plugin) {
        // ===== LENGSHANG_YS_发射器生成器_2 =====
        new LSTMaterialGenerator(LSTGroups.YS_YBCLSCQ, LSTReg.lstStack("LENGSHANG_YS_发射器生成器_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_发射器生成器_2",64),null,null,null,null,null,null,null,null}, 32000, 250, 30, new ItemStack[]{LSTReg.mat("DISPENSER",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_发射器生成器_3 =====
        new LSTMaterialGenerator(LSTGroups.YS_YBCLSCQ, LSTReg.lstStack("LENGSHANG_YS_发射器生成器_3"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_发射器生成器_3",64),null,null,null,null,null,null,null,null}, 640000, 500, 10, new ItemStack[]{LSTReg.mat("DISPENSER",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_TFSCQ_1 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_TFSCQ_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_TFSCQ_1",64),null,null,null,null,null,null,null,null}, 6400, 50, 60, new ItemStack[]{LSTReg.sf("IRON_DUST",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_TFSCQ_2 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_TFSCQ_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_TFSCQ_2",64),null,null,null,null,null,null,null,null}, 32000, 250, 30, new ItemStack[]{LSTReg.sf("IRON_DUST",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_TFSCQ_3 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_TFSCQ_3"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_TFSCQ_3",64),null,null,null,null,null,null,null,null}, 640000, 500, 10, new ItemStack[]{LSTReg.sf("IRON_DUST",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_JFSCQ_1 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_JFSCQ_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_JFSCQ_1",64),null,null,null,null,null,null,null,null}, 6400, 50, 60, new ItemStack[]{LSTReg.sf("GOLD_DUST",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_JFSCQ_2 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_JFSCQ_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_JFSCQ_2",64),null,null,null,null,null,null,null,null}, 32000, 250, 30, new ItemStack[]{LSTReg.sf("GOLD_DUST",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_JFSCQ_3 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_JFSCQ_3"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_JFSCQ_3",64),null,null,null,null,null,null,null,null}, 640000, 500, 10, new ItemStack[]{LSTReg.sf("GOLD_DUST",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_TONGFSCQ_1 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_TONGFSCQ_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_TONGFSCQ_1",64),null,null,null,null,null,null,null,null}, 6400, 50, 60, new ItemStack[]{LSTReg.sf("COPPER_DUST",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_TONGFSCQ_2 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_TONGFSCQ_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_TONGFSCQ_2",64),null,null,null,null,null,null,null,null}, 32000, 250, 30, new ItemStack[]{LSTReg.sf("COPPER_DUST",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_TONGFSCQ_3 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_TONGFSCQ_3"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_TONGFSCQ_3",64),null,null,null,null,null,null,null,null}, 640000, 500, 10, new ItemStack[]{LSTReg.sf("COPPER_DUST",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_XFSCQ_1 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_XFSCQ_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_XFSCQ_1",64),null,null,null,null,null,null,null,null}, 6400, 50, 60, new ItemStack[]{LSTReg.sf("TIN_DUST",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_XFSCQ_2 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_XFSCQ_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_XFSCQ_2",64),null,null,null,null,null,null,null,null}, 32000, 250, 30, new ItemStack[]{LSTReg.sf("TIN_DUST",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_XFSCQ_3 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_XFSCQ_3"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_XFSCQ_3",64),null,null,null,null,null,null,null,null}, 640000, 500, 10, new ItemStack[]{LSTReg.sf("TIN_DUST",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_YFSCQ_1 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_YFSCQ_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_YFSCQ_1",64),null,null,null,null,null,null,null,null}, 6400, 50, 60, new ItemStack[]{LSTReg.sf("SILVER_DUST",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_YFSCQ_2 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_YFSCQ_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_YFSCQ_2",64),null,null,null,null,null,null,null,null}, 32000, 250, 30, new ItemStack[]{LSTReg.sf("SILVER_DUST",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_YFSCQ_3 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_YFSCQ_3"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_YFSCQ_3",64),null,null,null,null,null,null,null,null}, 640000, 500, 10, new ItemStack[]{LSTReg.sf("SILVER_DUST",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_QFSCQ_1 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_QFSCQ_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_QFSCQ_1",64),null,null,null,null,null,null,null,null}, 6400, 50, 60, new ItemStack[]{LSTReg.sf("LEAD_DUST",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_QFSCQ_2 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_QFSCQ_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_QFSCQ_2",64),null,null,null,null,null,null,null,null}, 32000, 250, 30, new ItemStack[]{LSTReg.sf("LEAD_DUST",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_QFSCQ_3 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_QFSCQ_3"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_QFSCQ_3",64),null,null,null,null,null,null,null,null}, 640000, 500, 10, new ItemStack[]{LSTReg.sf("LEAD_DUST",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_LFSCQ_1 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_LFSCQ_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_LFSCQ_1",64),null,null,null,null,null,null,null,null}, 6400, 50, 60, new ItemStack[]{LSTReg.sf("ALUMINUM_DUST",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_LFSCQ_2 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_LFSCQ_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_LFSCQ_2",64),null,null,null,null,null,null,null,null}, 32000, 250, 30, new ItemStack[]{LSTReg.sf("ALUMINUM_DUST",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_LFSCQ_3 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_LFSCQ_3"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_LFSCQ_3",64),null,null,null,null,null,null,null,null}, 640000, 500, 10, new ItemStack[]{LSTReg.sf("ALUMINUM_DUST",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_XINFSCQ_1 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_XINFSCQ_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_XINFSCQ_1",64),null,null,null,null,null,null,null,null}, 6400, 50, 60, new ItemStack[]{LSTReg.sf("ZINC_DUST",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_XINFSCQ_2 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_XINFSCQ_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_XINFSCQ_2",64),null,null,null,null,null,null,null,null}, 32000, 250, 30, new ItemStack[]{LSTReg.sf("ZINC_DUST",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_XINFSCQ_3 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_XINFSCQ_3"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_XINFSCQ_3",64),null,null,null,null,null,null,null,null}, 640000, 500, 10, new ItemStack[]{LSTReg.sf("ZINC_DUST",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_MFSCQ_1 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_MFSCQ_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_MFSCQ_1",64),null,null,null,null,null,null,null,null}, 6400, 50, 60, new ItemStack[]{LSTReg.sf("MAGNESIUM_DUST",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_MFSCQ_2 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_MFSCQ_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_MFSCQ_2",64),null,null,null,null,null,null,null,null}, 32000, 250, 30, new ItemStack[]{LSTReg.sf("MAGNESIUM_DUST",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_MFSCQ_3 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_MFSCQ_3"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_MFSCQ_3",64),null,null,null,null,null,null,null,null}, 640000, 500, 10, new ItemStack[]{LSTReg.sf("MAGNESIUM_DUST",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_LSYSCQ_1 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_LSYSCQ_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_LSYSCQ_1",64),null,null,null,null,null,null,null,null}, 6400, 50, 60, new ItemStack[]{LSTReg.sf("SULFATE",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_LSYSCQ_2 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_LSYSCQ_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_LSYSCQ_2",64),null,null,null,null,null,null,null,null}, 32000, 250, 30, new ItemStack[]{LSTReg.sf("SULFATE",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_LSYSCQ_3 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_LSYSCQ_3"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_LSYSCQ_3",64),null,null,null,null,null,null,null,null}, 640000, 500, 10, new ItemStack[]{LSTReg.sf("SULFATE",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_XJBSCQ_1 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_XJBSCQ_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_XJBSCQ_1",64),null,null,null,null,null,null,null,null}, 6400, 50, 60, new ItemStack[]{LSTReg.sf("NETHER_ICE",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_XJBSCQ_2 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_XJBSCQ_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_XJBSCQ_2",64),null,null,null,null,null,null,null,null}, 32000, 250, 30, new ItemStack[]{LSTReg.sf("NETHER_ICE",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_XJBSCQ_3 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_XJBSCQ_3"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_XJBSCQ_3",64),null,null,null,null,null,null,null,null}, 640000, 500, 10, new ItemStack[]{LSTReg.sf("NETHER_ICE",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_YYTSCQ_1 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_YYTSCQ_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_YYTSCQ_1",64),null,null,null,null,null,null,null,null}, 6400, 50, 60, new ItemStack[]{LSTReg.sf("BUCKET_OF_OIL",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_YYTSCQ_2 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_YYTSCQ_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_YYTSCQ_2",64),null,null,null,null,null,null,null,null}, 32000, 250, 30, new ItemStack[]{LSTReg.sf("BUCKET_OF_OIL",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_YYTSCQ_3 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_YYTSCQ_3"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_YYTSCQ_3",64),null,null,null,null,null,null,null,null}, 640000, 500, 10, new ItemStack[]{LSTReg.sf("BUCKET_OF_OIL",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_TANSCQ_1 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_TANSCQ_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_TANSCQ_1",64),null,null,null,null,null,null,null,null}, 6400, 50, 60, new ItemStack[]{LSTReg.sf("CARBON",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_TANSCQ_2 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_TANSCQ_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_TANSCQ_2",64),null,null,null,null,null,null,null,null}, 32000, 250, 30, new ItemStack[]{LSTReg.sf("CARBON",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_TANSCQ_3 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_TANSCQ_3"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_TANSCQ_3",64),null,null,null,null,null,null,null,null}, 640000, 500, 10, new ItemStack[]{LSTReg.sf("CARBON",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_GUISCQ_1 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_GUISCQ_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_GUISCQ_1",64),null,null,null,null,null,null,null,null}, 6400, 50, 60, new ItemStack[]{LSTReg.sf("SILICON",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_GUISCQ_2 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_GUISCQ_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_GUISCQ_2",64),null,null,null,null,null,null,null,null}, 32000, 250, 30, new ItemStack[]{LSTReg.sf("SILICON",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_GUISCQ_3 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_GUISCQ_3"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_GUISCQ_3",64),null,null,null,null,null,null,null,null}, 640000, 500, 10, new ItemStack[]{LSTReg.sf("SILICON",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_HJGSSCQ_1 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_HJGSSCQ_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_HJGSSCQ_1",64),null,null,null,null,null,null,null,null}, 6400, 50, 60, new ItemStack[]{LSTReg.sf("CARBONADO",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_HJGSSCQ_2 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_HJGSSCQ_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_HJGSSCQ_2",64),null,null,null,null,null,null,null,null}, 32000, 250, 30, new ItemStack[]{LSTReg.sf("CARBONADO",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_HJGSSCQ_3 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_HJGSSCQ_3"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_HJGSSCQ_3",64),null,null,null,null,null,null,null,null}, 640000, 500, 10, new ItemStack[]{LSTReg.sf("CARBONADO",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_GANGDINSCQ_1 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_GANGDINSCQ_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_GANGDINSCQ_1",64),null,null,null,null,null,null,null,null}, 6400, 50, 60, new ItemStack[]{LSTReg.sf("STEEL_INGOT",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_GANGDINSCQ_2 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_GANGDINSCQ_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_GANGDINSCQ_2",64),null,null,null,null,null,null,null,null}, 32000, 250, 30, new ItemStack[]{LSTReg.sf("STEEL_INGOT",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_GANGDINSCQ_3 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_GANGDINSCQ_3"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_GANGDINSCQ_3",64),null,null,null,null,null,null,null,null}, 640000, 500, 10, new ItemStack[]{LSTReg.sf("STEEL_INGOT",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_DMSGGDSCQ_1 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_DMSGGDSCQ_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_DMSGGDSCQ_1",64),null,null,null,null,null,null,null,null}, 6400, 50, 60, new ItemStack[]{LSTReg.sf("DAMASCUS_STEEL_INGOT",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_DMSGGDSCQ_2 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_DMSGGDSCQ_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_DMSGGDSCQ_2",64),null,null,null,null,null,null,null,null}, 32000, 250, 30, new ItemStack[]{LSTReg.sf("DAMASCUS_STEEL_INGOT",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_DMSGGDSCQ_3 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_DMSGGDSCQ_3"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_DMSGGDSCQ_3",64),null,null,null,null,null,null,null,null}, 640000, 500, 10, new ItemStack[]{LSTReg.sf("DAMASCUS_STEEL_INGOT",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_QTDSCQ_1 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_QTDSCQ_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_QTDSCQ_1",64),null,null,null,null,null,null,null,null}, 6400, 50, 60, new ItemStack[]{LSTReg.sf("BRONZE_INGOT",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_QTDSCQ_2 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_QTDSCQ_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_QTDSCQ_2",64),null,null,null,null,null,null,null,null}, 32000, 250, 30, new ItemStack[]{LSTReg.sf("BRONZE_INGOT",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_QTDSCQ_3 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_QTDSCQ_3"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_QTDSCQ_3",64),null,null,null,null,null,null,null,null}, 640000, 500, 10, new ItemStack[]{LSTReg.sf("BRONZE_INGOT",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_YLDSCQ_1 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_YLDSCQ_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_YLDSCQ_1",64),null,null,null,null,null,null,null,null}, 6400, 50, 60, new ItemStack[]{LSTReg.sf("DURALUMIN_INGOT",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_YLDSCQ_2 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_YLDSCQ_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_YLDSCQ_2",64),null,null,null,null,null,null,null,null}, 32000, 250, 30, new ItemStack[]{LSTReg.sf("DURALUMIN_INGOT",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_YLDSCQ_3 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_YLDSCQ_3"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_YLDSCQ_3",64),null,null,null,null,null,null,null,null}, 640000, 500, 10, new ItemStack[]{LSTReg.sf("DURALUMIN_INGOT",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_YTHJDSCQ_1 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_YTHJDSCQ_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_YTHJDSCQ_1",64),null,null,null,null,null,null,null,null}, 6400, 50, 60, new ItemStack[]{LSTReg.sf("BILLON_INGOT",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_YTHJDSCQ_2 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_YTHJDSCQ_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_YTHJDSCQ_2",64),null,null,null,null,null,null,null,null}, 32000, 250, 30, new ItemStack[]{LSTReg.sf("BILLON_INGOT",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_YTHJDSCQ_3 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_YTHJDSCQ_3"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_YTHJDSCQ_3",64),null,null,null,null,null,null,null,null}, 640000, 500, 10, new ItemStack[]{LSTReg.sf("BILLON_INGOT",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_HTDSCQ_1 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_HTDSCQ_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_HTDSCQ_1",64),null,null,null,null,null,null,null,null}, 6400, 50, 60, new ItemStack[]{LSTReg.sf("BRASS_INGOT",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_HTDSCQ_2 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_HTDSCQ_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_HTDSCQ_2",64),null,null,null,null,null,null,null,null}, 32000, 250, 30, new ItemStack[]{LSTReg.sf("BRASS_INGOT",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_HTDSCQ_3 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_HTDSCQ_3"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_HTDSCQ_3",64),null,null,null,null,null,null,null,null}, 640000, 500, 10, new ItemStack[]{LSTReg.sf("BRASS_INGOT",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_LHTDSCQ_1 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_LHTDSCQ_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_LHTDSCQ_1",64),null,null,null,null,null,null,null,null}, 6400, 50, 60, new ItemStack[]{LSTReg.sf("ALUMINUM_BRASS_INGOT",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_LHTDSCQ_2 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_LHTDSCQ_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_LHTDSCQ_2",64),null,null,null,null,null,null,null,null}, 32000, 250, 30, new ItemStack[]{LSTReg.sf("ALUMINUM_BRASS_INGOT",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_LHTDSCQ_3 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_LHTDSCQ_3"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_LHTDSCQ_3",64),null,null,null,null,null,null,null,null}, 640000, 500, 10, new ItemStack[]{LSTReg.sf("ALUMINUM_BRASS_INGOT",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_LQTDSCQ_1 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_LQTDSCQ_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_LQTDSCQ_1",64),null,null,null,null,null,null,null,null}, 6400, 50, 60, new ItemStack[]{LSTReg.sf("ALUMINUM_BRONZE_INGOT",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_LQTDSCQ_2 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_LQTDSCQ_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_LQTDSCQ_2",64),null,null,null,null,null,null,null,null}, 32000, 250, 30, new ItemStack[]{LSTReg.sf("ALUMINUM_BRONZE_INGOT",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_LQTDSCQ_3 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_LQTDSCQ_3"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_LQTDSCQ_3",64),null,null,null,null,null,null,null,null}, 640000, 500, 10, new ItemStack[]{LSTReg.sf("ALUMINUM_BRONZE_INGOT",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_KLSQTDSCQ_1 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_KLSQTDSCQ_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_KLSQTDSCQ_1",64),null,null,null,null,null,null,null,null}, 6400, 50, 60, new ItemStack[]{LSTReg.sf("CORINTHIAN_BRONZE_INGOT",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_KLSQTDSCQ_2 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_KLSQTDSCQ_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_KLSQTDSCQ_2",64),null,null,null,null,null,null,null,null}, 32000, 250, 30, new ItemStack[]{LSTReg.sf("CORINTHIAN_BRONZE_INGOT",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_KLSQTDSCQ_3 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_KLSQTDSCQ_3"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_KLSQTDSCQ_3",64),null,null,null,null,null,null,null,null}, 640000, 500, 10, new ItemStack[]{LSTReg.sf("CORINTHIAN_BRONZE_INGOT",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_HXDSCQ_1 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_HXDSCQ_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_HXDSCQ_1",64),null,null,null,null,null,null,null,null}, 6400, 50, 60, new ItemStack[]{LSTReg.sf("SOLDER_INGOT",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_HXDSCQ_2 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_HXDSCQ_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_HXDSCQ_2",64),null,null,null,null,null,null,null,null}, 32000, 250, 30, new ItemStack[]{LSTReg.sf("SOLDER_INGOT",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_HXDSCQ_3 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_HXDSCQ_3"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_HXDSCQ_3",64),null,null,null,null,null,null,null,null}, 640000, 500, 10, new ItemStack[]{LSTReg.sf("SOLDER_INGOT",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_NDSCQ_1 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_NDSCQ_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_NDSCQ_1",64),null,null,null,null,null,null,null,null}, 6400, 50, 60, new ItemStack[]{LSTReg.sf("NICKEL_INGOT",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_NDSCQ_2 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_NDSCQ_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_NDSCQ_2",64),null,null,null,null,null,null,null,null}, 32000, 250, 30, new ItemStack[]{LSTReg.sf("NICKEL_INGOT",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_NDSCQ_3 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_NDSCQ_3"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_NDSCQ_3",64),null,null,null,null,null,null,null,null}, 640000, 500, 10, new ItemStack[]{LSTReg.sf("NICKEL_INGOT",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_GDSCQ_1 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_GDSCQ_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_GDSCQ_1",64),null,null,null,null,null,null,null,null}, 6400, 50, 60, new ItemStack[]{LSTReg.sf("COBALT_INGOT",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_GDSCQ_2 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_GDSCQ_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_GDSCQ_2",64),null,null,null,null,null,null,null,null}, 32000, 250, 30, new ItemStack[]{LSTReg.sf("COBALT_INGOT",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_GDSCQ_3 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_GDSCQ_3"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_GDSCQ_3",64),null,null,null,null,null,null,null,null}, 640000, 500, 10, new ItemStack[]{LSTReg.sf("COBALT_INGOT",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_GTSCQ_1 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_GTSCQ_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_GTSCQ_1",64),null,null,null,null,null,null,null,null}, 6400, 50, 60, new ItemStack[]{LSTReg.sf("FERROSILICON",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_GTSCQ_2 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_GTSCQ_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_GTSCQ_2",64),null,null,null,null,null,null,null,null}, 32000, 250, 30, new ItemStack[]{LSTReg.sf("FERROSILICON",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_GTSCQ_3 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_GTSCQ_3"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_GTSCQ_3",64),null,null,null,null,null,null,null,null}, 640000, 500, 10, new ItemStack[]{LSTReg.sf("FERROSILICON",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_4KJDSCQ_1 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_4KJDSCQ_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_4KJDSCQ_1",64),null,null,null,null,null,null,null,null}, 6400, 50, 60, new ItemStack[]{LSTReg.sf("GOLD_4K",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_4KJDSCQ_2 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_4KJDSCQ_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_4KJDSCQ_2",64),null,null,null,null,null,null,null,null}, 32000, 250, 30, new ItemStack[]{LSTReg.sf("GOLD_4K",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_4KJDSCQ_3 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_4KJDSCQ_3"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_4KJDSCQ_3",64),null,null,null,null,null,null,null,null}, 640000, 500, 10, new ItemStack[]{LSTReg.sf("GOLD_4K",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_12KJDSCQ_1 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_12KJDSCQ_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_12KJDSCQ_1",64),null,null,null,null,null,null,null,null}, 6400, 50, 60, new ItemStack[]{LSTReg.sf("GOLD_12K",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_12KJDSCQ_2 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_12KJDSCQ_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_12KJDSCQ_2",64),null,null,null,null,null,null,null,null}, 32000, 250, 30, new ItemStack[]{LSTReg.sf("GOLD_12K",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_12KJDSCQ_3 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_12KJDSCQ_3"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_12KJDSCQ_3",64),null,null,null,null,null,null,null,null}, 640000, 500, 10, new ItemStack[]{LSTReg.sf("GOLD_12K",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_18KJDSCQ_1 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_18KJDSCQ_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_18KJDSCQ_1",64),null,null,null,null,null,null,null,null}, 6400, 50, 60, new ItemStack[]{LSTReg.sf("GOLD_18K",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_18KJDSCQ_2 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_18KJDSCQ_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_18KJDSCQ_2",64),null,null,null,null,null,null,null,null}, 32000, 250, 30, new ItemStack[]{LSTReg.sf("GOLD_18K",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_18KJDSCQ_3 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_18KJDSCQ_3"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_18KJDSCQ_3",64),null,null,null,null,null,null,null,null}, 640000, 500, 10, new ItemStack[]{LSTReg.sf("GOLD_18K",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_22KJDSCQ_1 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_22KJDSCQ_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_22KJDSCQ_1",64),null,null,null,null,null,null,null,null}, 6400, 50, 60, new ItemStack[]{LSTReg.sf("GOLD_22K",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_22KJDSCQ_2 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_22KJDSCQ_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_22KJDSCQ_2",64),null,null,null,null,null,null,null,null}, 32000, 250, 30, new ItemStack[]{LSTReg.sf("GOLD_22K",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_22KJDSCQ_3 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_22KJDSCQ_3"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_22KJDSCQ_3",64),null,null,null,null,null,null,null,null}, 640000, 500, 10, new ItemStack[]{LSTReg.sf("GOLD_22K",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_24KJDSCQ_1 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_24KJDSCQ_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_24KJDSCQ_1",64),null,null,null,null,null,null,null,null}, 6400, 50, 60, new ItemStack[]{LSTReg.sf("GOLD_24K",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_24KJDSCQ_2 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_24KJDSCQ_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_24KJDSCQ_2",64),null,null,null,null,null,null,null,null}, 32000, 250, 30, new ItemStack[]{LSTReg.sf("GOLD_24K",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_24KJDSCQ_3 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_24KJDSCQ_3"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_24KJDSCQ_3",64),null,null,null,null,null,null,null,null}, 640000, 500, 10, new ItemStack[]{LSTReg.sf("GOLD_24K",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_DJTDSCQ_1 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_DJTDSCQ_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_DJTDSCQ_1",64),null,null,null,null,null,null,null,null}, 6400, 50, 60, new ItemStack[]{LSTReg.sf("GILDED_IRON",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_DJTDSCQ_2 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_DJTDSCQ_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_DJTDSCQ_2",64),null,null,null,null,null,null,null,null}, 32000, 250, 30, new ItemStack[]{LSTReg.sf("GILDED_IRON",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_DJTDSCQ_3 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_DJTDSCQ_3"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_DJTDSCQ_3",64),null,null,null,null,null,null,null,null}, 640000, 500, 10, new ItemStack[]{LSTReg.sf("GILDED_IRON",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_YHJSSCQ_1 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_YHJSSCQ_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_YHJSSCQ_1",64),null,null,null,null,null,null,null,null}, 6400, 50, 60, new ItemStack[]{LSTReg.sf("HARDENED_METAL_INGOT",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_YHJSSCQ_2 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_YHJSSCQ_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_YHJSSCQ_2",64),null,null,null,null,null,null,null,null}, 32000, 250, 30, new ItemStack[]{LSTReg.sf("HARDENED_METAL_INGOT",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_YHJSSCQ_3 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_YHJSSCQ_3"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_YHJSSCQ_3",64),null,null,null,null,null,null,null,null}, 640000, 500, 10, new ItemStack[]{LSTReg.sf("HARDENED_METAL_INGOT",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_QHHJDSCQ_1 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_QHHJDSCQ_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_QHHJDSCQ_1",64),null,null,null,null,null,null,null,null}, 6400, 50, 60, new ItemStack[]{LSTReg.sf("REINFORCED_ALLOY_INGOT",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_QHHJDSCQ_2 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_QHHJDSCQ_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_QHHJDSCQ_2",64),null,null,null,null,null,null,null,null}, 32000, 250, 30, new ItemStack[]{LSTReg.sf("REINFORCED_ALLOY_INGOT",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_QHHJDSCQ_3 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_QHHJDSCQ_3"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_QHHJDSCQ_3",64),null,null,null,null,null,null,null,null}, 640000, 500, 10, new ItemStack[]{LSTReg.sf("REINFORCED_ALLOY_INGOT",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_HSHJDSCQ_1 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_HSHJDSCQ_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_HSHJDSCQ_1",64),null,null,null,null,null,null,null,null}, 6400, 50, 60, new ItemStack[]{LSTReg.sf("REDSTONE_ALLOY",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_HSHJDSCQ_2 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_HSHJDSCQ_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_HSHJDSCQ_2",64),null,null,null,null,null,null,null,null}, 32000, 250, 30, new ItemStack[]{LSTReg.sf("REDSTONE_ALLOY",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_HSHJDSCQ_3 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_HSHJDSCQ_3"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_HSHJDSCQ_3",64),null,null,null,null,null,null,null,null}, 640000, 500, 10, new ItemStack[]{LSTReg.sf("REDSTONE_ALLOY",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_YOUSCQ_1 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_YOUSCQ_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_YOUSCQ_1",64),null,null,null,null,null,null,null,null}, 6400, 50, 60, new ItemStack[]{LSTReg.sf("URANIUM",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_YOUSCQ_2 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_YOUSCQ_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_YOUSCQ_2",64),null,null,null,null,null,null,null,null}, 32000, 250, 30, new ItemStack[]{LSTReg.sf("URANIUM",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_YOUSCQ_3 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_YOUSCQ_3"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_YOUSCQ_3",64),null,null,null,null,null,null,null,null}, 640000, 500, 10, new ItemStack[]{LSTReg.sf("URANIUM",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_YANSCQ_1 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_YANSCQ_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_YANSCQ_1",64),null,null,null,null,null,null,null,null}, 6400, 50, 60, new ItemStack[]{LSTReg.sf("SALT",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_YANSCQ_2 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_YANSCQ_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_YANSCQ_2",64),null,null,null,null,null,null,null,null}, 32000, 250, 30, new ItemStack[]{LSTReg.sf("SALT",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_YANSCQ_3 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_YANSCQ_3"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_YANSCQ_3",64),null,null,null,null,null,null,null,null}, 640000, 500, 10, new ItemStack[]{LSTReg.sf("SALT",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_RZLANBSSCQ_1 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_RZLANBSSCQ_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_RZLANBSSCQ_1",64),null,null,null,null,null,null,null,null}, 6400, 50, 60, new ItemStack[]{LSTReg.sf("SYNTHETIC_SAPPHIRE",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_RZLANBSSCQ_2 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_RZLANBSSCQ_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_RZLANBSSCQ_2",64),null,null,null,null,null,null,null,null}, 32000, 250, 30, new ItemStack[]{LSTReg.sf("SYNTHETIC_SAPPHIRE",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_RZLANBSSCQ_3 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_RZLANBSSCQ_3"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_RZLANBSSCQ_3",64),null,null,null,null,null,null,null,null}, 640000, 500, 10, new ItemStack[]{LSTReg.sf("SYNTHETIC_SAPPHIRE",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_RZLBSSCQ_1 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_RZLBSSCQ_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_RZLBSSCQ_1",64),null,null,null,null,null,null,null,null}, 6400, 50, 60, new ItemStack[]{LSTReg.sf("SYNTHETIC_EMERALD",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_RZLBSSCQ_2 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_RZLBSSCQ_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_RZLBSSCQ_2",64),null,null,null,null,null,null,null,null}, 32000, 250, 30, new ItemStack[]{LSTReg.sf("SYNTHETIC_EMERALD",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_RZLBSSCQ_3 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_RZLBSSCQ_3"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_RZLBSSCQ_3",64),null,null,null,null,null,null,null,null}, 640000, 500, 10, new ItemStack[]{LSTReg.sf("SYNTHETIC_EMERALD",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_RZZSSCQ_1 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_RZZSSCQ_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_RZZSSCQ_1",64),null,null,null,null,null,null,null,null}, 6400, 50, 60, new ItemStack[]{LSTReg.sf("SYNTHETIC_DIAMOND",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_RZZSSCQ_2 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_RZZSSCQ_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_RZZSSCQ_2",64),null,null,null,null,null,null,null,null}, 32000, 250, 30, new ItemStack[]{LSTReg.sf("SYNTHETIC_DIAMOND",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_RZZSSCQ_3 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_RZZSSCQ_3"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_RZZSSCQ_3",64),null,null,null,null,null,null,null,null}, 640000, 500, 10, new ItemStack[]{LSTReg.sf("SYNTHETIC_DIAMOND",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_33QPDSCQ_1 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_33QPDSCQ_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_33QPDSCQ_1",64),null,null,null,null,null,null,null,null}, 6400, 50, 60, new ItemStack[]{LSTReg.sf("BLISTERING_INGOT",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_33QPDSCQ_2 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_33QPDSCQ_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_33QPDSCQ_2",64),null,null,null,null,null,null,null,null}, 32000, 250, 30, new ItemStack[]{LSTReg.sf("BLISTERING_INGOT",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_33QPDSCQ_3 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_33QPDSCQ_3"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_33QPDSCQ_3",64),null,null,null,null,null,null,null,null}, 640000, 500, 10, new ItemStack[]{LSTReg.sf("BLISTERING_INGOT",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_66QPDSCQ_1 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_66QPDSCQ_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_66QPDSCQ_1",64),null,null,null,null,null,null,null,null}, 6400, 50, 60, new ItemStack[]{LSTReg.sf("BLISTERING_INGOT_2",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_66QPDSCQ_2 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_66QPDSCQ_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_66QPDSCQ_2",64),null,null,null,null,null,null,null,null}, 32000, 250, 30, new ItemStack[]{LSTReg.sf("BLISTERING_INGOT_2",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_66QPDSCQ_3 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_66QPDSCQ_3"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_66QPDSCQ_3",64),null,null,null,null,null,null,null,null}, 640000, 500, 10, new ItemStack[]{LSTReg.sf("BLISTERING_INGOT_2",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_QPDSCQ_1 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_QPDSCQ_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_QPDSCQ_1",64),null,null,null,null,null,null,null,null}, 6400, 50, 60, new ItemStack[]{LSTReg.sf("BLISTERING_INGOT_3",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_QPDSCQ_2 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_QPDSCQ_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_QPDSCQ_2",64),null,null,null,null,null,null,null,null}, 32000, 250, 30, new ItemStack[]{LSTReg.sf("BLISTERING_INGOT_3",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_QPDSCQ_3 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_QPDSCQ_3"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_QPDSCQ_3",64),null,null,null,null,null,null,null,null}, 640000, 500, 10, new ItemStack[]{LSTReg.sf("BLISTERING_INGOT_3",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_DCTSCQ_1 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_DCTSCQ_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_DCTSCQ_1",64),null,null,null,null,null,null,null,null}, 6400, 50, 60, new ItemStack[]{LSTReg.sf("ELECTRO_MAGNET",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_DCTSCQ_2 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_DCTSCQ_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_DCTSCQ_2",64),null,null,null,null,null,null,null,null}, 32000, 250, 30, new ItemStack[]{LSTReg.sf("ELECTRO_MAGNET",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_DCTSCQ_3 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_DCTSCQ_3"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_DCTSCQ_3",64),null,null,null,null,null,null,null,null}, 640000, 500, 10, new ItemStack[]{LSTReg.sf("ELECTRO_MAGNET",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_DDMDSCQ_1 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_DDMDSCQ_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_DDMDSCQ_1",64),null,null,null,null,null,null,null,null}, 6400, 50, 60, new ItemStack[]{LSTReg.sf("ELECTRIC_MOTOR",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_DDMDSCQ_2 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_DDMDSCQ_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_DDMDSCQ_2",64),null,null,null,null,null,null,null,null}, 32000, 250, 30, new ItemStack[]{LSTReg.sf("ELECTRIC_MOTOR",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_DDMDSCQ_3 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_DDMDSCQ_3"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_DDMDSCQ_3",64),null,null,null,null,null,null,null,null}, 640000, 500, 10, new ItemStack[]{LSTReg.sf("ELECTRIC_MOTOR",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_JRXQSCQ_1 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_JRXQSCQ_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_JRXQSCQ_1",64),null,null,null,null,null,null,null,null}, 6400, 50, 60, new ItemStack[]{LSTReg.sf("HEATING_COIL",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_JRXQSCQ_2 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_JRXQSCQ_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_JRXQSCQ_2",64),null,null,null,null,null,null,null,null}, 32000, 250, 30, new ItemStack[]{LSTReg.sf("HEATING_COIL",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_JRXQSCQ_3 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_JRXQSCQ_3"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_JRXQSCQ_3",64),null,null,null,null,null,null,null,null}, 640000, 500, 10, new ItemStack[]{LSTReg.sf("HEATING_COIL",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_NLSJSCQ_1 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_NLSJSCQ_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_NLSJSCQ_1",64),null,null,null,null,null,null,null,null}, 6400, 50, 60, new ItemStack[]{LSTReg.sf("POWER_CRYSTAL",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_NLSJSCQ_2 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_NLSJSCQ_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_NLSJSCQ_2",64),null,null,null,null,null,null,null,null}, 32000, 250, 30, new ItemStack[]{LSTReg.sf("POWER_CRYSTAL",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_NLSJSCQ_3 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_NLSJSCQ_3"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_NLSJSCQ_3",64),null,null,null,null,null,null,null,null}, 640000, 500, 10, new ItemStack[]{LSTReg.sf("POWER_CRYSTAL",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_LQZZSCQ_1 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_LQZZSCQ_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_LQZZSCQ_1",64),null,null,null,null,null,null,null,null}, 6400, 50, 60, new ItemStack[]{LSTReg.sf("COOLING_UNIT",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_LQZZSCQ_2 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_LQZZSCQ_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_LQZZSCQ_2",64),null,null,null,null,null,null,null,null}, 32000, 250, 30, new ItemStack[]{LSTReg.sf("COOLING_UNIT",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_LQZZSCQ_3 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_LQZZSCQ_3"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_LQZZSCQ_3",64),null,null,null,null,null,null,null,null}, 640000, 500, 10, new ItemStack[]{LSTReg.sf("COOLING_UNIT",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_GFDCSCQ_1 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_GFDCSCQ_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_GFDCSCQ_1",64),null,null,null,null,null,null,null,null}, 6400, 50, 60, new ItemStack[]{LSTReg.sf("SOLAR_PANEL",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_GFDCSCQ_2 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_GFDCSCQ_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_GFDCSCQ_2",64),null,null,null,null,null,null,null,null}, 32000, 250, 30, new ItemStack[]{LSTReg.sf("SOLAR_PANEL",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_GFDCSCQ_3 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_GFDCSCQ_3"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_GFDCSCQ_3",64),null,null,null,null,null,null,null,null}, 640000, 500, 10, new ItemStack[]{LSTReg.sf("SOLAR_PANEL",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_JQRNCHXSCQ_1 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_JQRNCHXSCQ_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_JQRNCHXSCQ_1",64),null,null,null,null,null,null,null,null}, 6400, 50, 60, new ItemStack[]{LSTReg.sf("ANDROID_MEMORY_CORE",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_JQRNCHXSCQ_2 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_JQRNCHXSCQ_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_JQRNCHXSCQ_2",64),null,null,null,null,null,null,null,null}, 32000, 250, 30, new ItemStack[]{LSTReg.sf("ANDROID_MEMORY_CORE",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_JQRNCHXSCQ_3 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_JQRNCHXSCQ_3"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_JQRNCHXSCQ_3",64),null,null,null,null,null,null,null,null}, 640000, 500, 10, new ItemStack[]{LSTReg.sf("ANDROID_MEMORY_CORE",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_GBSCQ_1 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_GBSCQ_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_GBSCQ_1",64),null,null,null,null,null,null,null,null}, 6400, 50, 60, new ItemStack[]{LSTReg.sf("STEEL_PLATE",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_GBSCQ_2 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_GBSCQ_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_GBSCQ_2",64),null,null,null,null,null,null,null,null}, 32000, 250, 30, new ItemStack[]{LSTReg.sf("STEEL_PLATE",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_GBSCQ_3 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_GBSCQ_3"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_GBSCQ_3",64),null,null,null,null,null,null,null,null}, 640000, 500, 10, new ItemStack[]{LSTReg.sf("STEEL_PLATE",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_GJBSCQ_1 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_GJBSCQ_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_GJBSCQ_1",64),null,null,null,null,null,null,null,null}, 6400, 50, 60, new ItemStack[]{LSTReg.sf("REINFORCED_PLATE",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_GJBSCQ_2 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_GJBSCQ_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_GJBSCQ_2",64),null,null,null,null,null,null,null,null}, 32000, 250, 30, new ItemStack[]{LSTReg.sf("REINFORCED_PLATE",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_GJBSCQ_3 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_GJBSCQ_3"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_GJBSCQ_3",64),null,null,null,null,null,null,null,null}, 640000, 500, 10, new ItemStack[]{LSTReg.sf("REINFORCED_PLATE",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_CGSCQ_1 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_CGSCQ_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_CGSCQ_1",64),null,null,null,null,null,null,null,null}, 6400, 50, 60, new ItemStack[]{LSTReg.sf("MAGSTEEL",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_CGSCQ_2 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_CGSCQ_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_CGSCQ_2",64),null,null,null,null,null,null,null,null}, 32000, 250, 30, new ItemStack[]{LSTReg.sf("MAGSTEEL",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_CGSCQ_3 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_CGSCQ_3"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_CGSCQ_3",64),null,null,null,null,null,null,null,null}, 640000, 500, 10, new ItemStack[]{LSTReg.sf("MAGSTEEL",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_CGBSCQ_1 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_CGBSCQ_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_CGBSCQ_1",64),null,null,null,null,null,null,null,null}, 6400, 50, 60, new ItemStack[]{LSTReg.sf("MAGSTEEL_PLATE",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_CGBSCQ_2 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_CGBSCQ_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_CGBSCQ_2",64),null,null,null,null,null,null,null,null}, 32000, 250, 30, new ItemStack[]{LSTReg.sf("MAGSTEEL_PLATE",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_CGBSCQ_3 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_CGBSCQ_3"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_CGBSCQ_3",64),null,null,null,null,null,null,null,null}, 640000, 500, 10, new ItemStack[]{LSTReg.sf("MAGSTEEL_PLATE",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_TAISCQ_1 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_TAISCQ_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_TAISCQ_1",64),null,null,null,null,null,null,null,null}, 6400, 50, 60, new ItemStack[]{LSTReg.sf("TITANIUM",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_TAISCQ_2 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_TAISCQ_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_TAISCQ_2",64),null,null,null,null,null,null,null,null}, 32000, 250, 30, new ItemStack[]{LSTReg.sf("TITANIUM",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_TAISCQ_3 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_TAISCQ_3"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_TAISCQ_3",64),null,null,null,null,null,null,null,null}, 640000, 500, 10, new ItemStack[]{LSTReg.sf("TITANIUM",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_JQDLSCQ_1 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_JQDLSCQ_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_JQDLSCQ_1",64),null,null,null,null,null,null,null,null}, 6400, 50, 60, new ItemStack[]{LSTReg.sf("MACHINE_CIRCUIT",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_JQDLSCQ_2 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_JQDLSCQ_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_JQDLSCQ_2",64),null,null,null,null,null,null,null,null}, 32000, 250, 30, new ItemStack[]{LSTReg.sf("MACHINE_CIRCUIT",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_JQDLSCQ_3 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_JQDLSCQ_3"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_JQDLSCQ_3",64),null,null,null,null,null,null,null,null}, 640000, 500, 10, new ItemStack[]{LSTReg.sf("MACHINE_CIRCUIT",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_JQHXSCQ_1 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_JQHXSCQ_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_JQHXSCQ_1",64),null,null,null,null,null,null,null,null}, 6400, 50, 60, new ItemStack[]{LSTReg.sf("MACHINE_CORE",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_JQHXSCQ_2 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_JQHXSCQ_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_JQHXSCQ_2",64),null,null,null,null,null,null,null,null}, 32000, 250, 30, new ItemStack[]{LSTReg.sf("MACHINE_CORE",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_JQHXSCQ_3 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_JQHXSCQ_3"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_JQHXSCQ_3",64),null,null,null,null,null,null,null,null}, 640000, 500, 10, new ItemStack[]{LSTReg.sf("MACHINE_CORE",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_JQBKSCQ_1 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_JQBKSCQ_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_JQBKSCQ_1",64),null,null,null,null,null,null,null,null}, 6400, 50, 60, new ItemStack[]{LSTReg.sf("MACHINE_PLATE",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_JQBKSCQ_2 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_JQBKSCQ_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_JQBKSCQ_2",64),null,null,null,null,null,null,null,null}, 32000, 250, 30, new ItemStack[]{LSTReg.sf("MACHINE_PLATE",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_JQBKSCQ_3 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_JQBKSCQ_3"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_JQBKSCQ_3",64),null,null,null,null,null,null,null,null}, 640000, 500, 10, new ItemStack[]{LSTReg.sf("MACHINE_PLATE",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_8KJDSCQ_1 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_8KJDSCQ_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_8KJDSCQ_1",64),null,null,null,null,null,null,null,null}, 6400, 50, 60, new ItemStack[]{LSTReg.sf("GOLD_8K",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_8KJDSCQ_2 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_8KJDSCQ_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_8KJDSCQ_2",64),null,null,null,null,null,null,null,null}, 32000, 250, 30, new ItemStack[]{LSTReg.sf("GOLD_8K",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_8KJDSCQ_3 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_8KJDSCQ_3"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_8KJDSCQ_3",64),null,null,null,null,null,null,null,null}, 640000, 500, 10, new ItemStack[]{LSTReg.sf("GOLD_8K",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_TONGDSCQ_1 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_TONGDSCQ_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_TONGDSCQ_1",64),null,null,null,null,null,null,null,null}, 6400, 50, 60, new ItemStack[]{LSTReg.sf("COPPER_INGOT",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_TONGDSCQ_2 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_TONGDSCQ_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_TONGDSCQ_2",64),null,null,null,null,null,null,null,null}, 32000, 250, 30, new ItemStack[]{LSTReg.sf("COPPER_INGOT",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_TONGDSCQ_3 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_TONGDSCQ_3"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_TONGDSCQ_3",64),null,null,null,null,null,null,null,null}, 640000, 500, 10, new ItemStack[]{LSTReg.sf("COPPER_INGOT",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_XDSCQ_1 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_XDSCQ_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_XDSCQ_1",64),null,null,null,null,null,null,null,null}, 6400, 50, 60, new ItemStack[]{LSTReg.sf("TIN_INGOT",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_XDSCQ_2 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_XDSCQ_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_XDSCQ_2",64),null,null,null,null,null,null,null,null}, 32000, 250, 30, new ItemStack[]{LSTReg.sf("TIN_INGOT",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_XDSCQ_3 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_XDSCQ_3"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_XDSCQ_3",64),null,null,null,null,null,null,null,null}, 640000, 500, 10, new ItemStack[]{LSTReg.sf("TIN_INGOT",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_YDSCQ_1 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_YDSCQ_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_YDSCQ_1",64),null,null,null,null,null,null,null,null}, 6400, 50, 60, new ItemStack[]{LSTReg.sf("SILVER_INGOT",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_YDSCQ_2 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_YDSCQ_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_YDSCQ_2",64),null,null,null,null,null,null,null,null}, 32000, 250, 30, new ItemStack[]{LSTReg.sf("SILVER_INGOT",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_YDSCQ_3 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_YDSCQ_3"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_YDSCQ_3",64),null,null,null,null,null,null,null,null}, 640000, 500, 10, new ItemStack[]{LSTReg.sf("SILVER_INGOT",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_QDSCQ_1 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_QDSCQ_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_QDSCQ_1",64),null,null,null,null,null,null,null,null}, 6400, 50, 60, new ItemStack[]{LSTReg.sf("LEAD_INGOT",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_QDSCQ_2 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_QDSCQ_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_QDSCQ_2",64),null,null,null,null,null,null,null,null}, 32000, 250, 30, new ItemStack[]{LSTReg.sf("LEAD_INGOT",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_QDSCQ_3 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_QDSCQ_3"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_QDSCQ_3",64),null,null,null,null,null,null,null,null}, 640000, 500, 10, new ItemStack[]{LSTReg.sf("LEAD_INGOT",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_LDSCQ_1 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_LDSCQ_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_LDSCQ_1",64),null,null,null,null,null,null,null,null}, 6400, 50, 60, new ItemStack[]{LSTReg.sf("ALUMINUM_INGOT",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_LDSCQ_2 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_LDSCQ_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_LDSCQ_2",64),null,null,null,null,null,null,null,null}, 32000, 250, 30, new ItemStack[]{LSTReg.sf("ALUMINUM_INGOT",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_LDSCQ_3 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_LDSCQ_3"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_LDSCQ_3",64),null,null,null,null,null,null,null,null}, 640000, 500, 10, new ItemStack[]{LSTReg.sf("ALUMINUM_INGOT",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_XINDSCQ_1 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_XINDSCQ_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_XINDSCQ_1",64),null,null,null,null,null,null,null,null}, 6400, 50, 60, new ItemStack[]{LSTReg.sf("ZINC_INGOT",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_XINDSCQ_2 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_XINDSCQ_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_XINDSCQ_2",64),null,null,null,null,null,null,null,null}, 32000, 250, 30, new ItemStack[]{LSTReg.sf("ZINC_INGOT",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_XINDSCQ_3 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_XINDSCQ_3"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_XINDSCQ_3",64),null,null,null,null,null,null,null,null}, 640000, 500, 10, new ItemStack[]{LSTReg.sf("ZINC_INGOT",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_MDSCQ_1 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_MDSCQ_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_MDSCQ_1",64),null,null,null,null,null,null,null,null}, 6400, 50, 60, new ItemStack[]{LSTReg.sf("MAGNESIUM_INGOT",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_MDSCQ_2 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_MDSCQ_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_MDSCQ_2",64),null,null,null,null,null,null,null,null}, 32000, 250, 30, new ItemStack[]{LSTReg.sf("MAGNESIUM_INGOT",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_MDSCQ_3 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_MDSCQ_3"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_MDSCQ_3",64),null,null,null,null,null,null,null,null}, 640000, 500, 10, new ItemStack[]{LSTReg.sf("MAGNESIUM_INGOT",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_GHJSCQ_1 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_GHJSCQ_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_GHJSCQ_1",64),null,null,null,null,null,null,null,null}, 6400, 50, 60, new ItemStack[]{LSTReg.sf("SUPREME_ALLOY_ZIRCONIUM",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_GHJSCQ_2 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_GHJSCQ_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_GHJSCQ_2",64),null,null,null,null,null,null,null,null}, 32000, 250, 30, new ItemStack[]{LSTReg.sf("SUPREME_ALLOY_ZIRCONIUM",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_GHJSCQ_3 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_GHJSCQ_3"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_GHJSCQ_3",64),null,null,null,null,null,null,null,null}, 640000, 500, 10, new ItemStack[]{LSTReg.sf("SUPREME_ALLOY_ZIRCONIUM",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_THJSCQ_1 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_THJSCQ_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_THJSCQ_1",64),null,null,null,null,null,null,null,null}, 6400, 50, 60, new ItemStack[]{LSTReg.sf("SUPREME_ALLOY_TITANIUM",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_THJSCQ_2 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_THJSCQ_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_THJSCQ_2",64),null,null,null,null,null,null,null,null}, 32000, 250, 30, new ItemStack[]{LSTReg.sf("SUPREME_ALLOY_TITANIUM",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_THJSCQ_3 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_THJSCQ_3"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_THJSCQ_3",64),null,null,null,null,null,null,null,null}, 640000, 500, 10, new ItemStack[]{LSTReg.sf("SUPREME_ALLOY_TITANIUM",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_YHJSCQ_1 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_YHJSCQ_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_YHJSCQ_1",64),null,null,null,null,null,null,null,null}, 6400, 50, 60, new ItemStack[]{LSTReg.sf("SUPREME_ALLOY_IRIDIUM",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_YHJSCQ_2 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_YHJSCQ_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_YHJSCQ_2",64),null,null,null,null,null,null,null,null}, 32000, 250, 30, new ItemStack[]{LSTReg.sf("SUPREME_ALLOY_IRIDIUM",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_YHJSCQ_3 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_YHJSCQ_3"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_YHJSCQ_3",64),null,null,null,null,null,null,null,null}, 640000, 500, 10, new ItemStack[]{LSTReg.sf("SUPREME_ALLOY_IRIDIUM",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_GJHJSCQ_1 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_GJHJSCQ_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_GJHJSCQ_1",64),null,null,null,null,null,null,null,null}, 6400, 50, 60, new ItemStack[]{LSTReg.sf("SUPREME_ALLOY_AURUM",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_GJHJSCQ_2 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_GJHJSCQ_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_GJHJSCQ_2",64),null,null,null,null,null,null,null,null}, 32000, 250, 30, new ItemStack[]{LSTReg.sf("SUPREME_ALLOY_AURUM",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_GJHJSCQ_3 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_GJHJSCQ_3"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_GJHJSCQ_3",64),null,null,null,null,null,null,null,null}, 640000, 500, 10, new ItemStack[]{LSTReg.sf("SUPREME_ALLOY_AURUM",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_MHJSCQ_1 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_MHJSCQ_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_MHJSCQ_1",64),null,null,null,null,null,null,null,null}, 6400, 50, 60, new ItemStack[]{LSTReg.sf("SUPREME_ALLOY_MANGANESE",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_MHJSCQ_2 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_MHJSCQ_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_MHJSCQ_2",64),null,null,null,null,null,null,null,null}, 32000, 250, 30, new ItemStack[]{LSTReg.sf("SUPREME_ALLOY_MANGANESE",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_MHJSCQ_3 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_MHJSCQ_3"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_MHJSCQ_3",64),null,null,null,null,null,null,null,null}, 640000, 500, 10, new ItemStack[]{LSTReg.sf("SUPREME_ALLOY_MANGANESE",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_BJHJSCQ_1 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_BJHJSCQ_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_BJHJSCQ_1",64),null,null,null,null,null,null,null,null}, 6400, 50, 60, new ItemStack[]{LSTReg.sf("SUPREME_ALLOY_PLATINUM",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_BJHJSCQ_2 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_BJHJSCQ_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_BJHJSCQ_2",64),null,null,null,null,null,null,null,null}, 32000, 250, 30, new ItemStack[]{LSTReg.sf("SUPREME_ALLOY_PLATINUM",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_BJHJSCQ_3 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_BJHJSCQ_3"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_BJHJSCQ_3",64),null,null,null,null,null,null,null,null}, 640000, 500, 10, new ItemStack[]{LSTReg.sf("SUPREME_ALLOY_PLATINUM",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_JJHJSCQ_1 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_JJHJSCQ_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_JJHJSCQ_1",64),null,null,null,null,null,null,null,null}, 6400, 50, 60, new ItemStack[]{LSTReg.sf("SUPREME_ALLOY_ADAMANTIUM",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_JJHJSCQ_2 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_JJHJSCQ_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_JJHJSCQ_2",64),null,null,null,null,null,null,null,null}, 32000, 250, 30, new ItemStack[]{LSTReg.sf("SUPREME_ALLOY_ADAMANTIUM",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_JJHJSCQ_3 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_JJHJSCQ_3"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_JJHJSCQ_3",64),null,null,null,null,null,null,null,null}, 640000, 500, 10, new ItemStack[]{LSTReg.sf("SUPREME_ALLOY_ADAMANTIUM",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_SLZSCQ_1 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_SLZSCQ_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_SLZSCQ_1",8),null,null,null,null,null,null,null,null}, 6400, 50, 60, new ItemStack[]{LSTReg.sf("PLASTIC_SHEET",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_SLZSCQ_2 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_SLZSCQ_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_SLZSCQ_2",8),null,null,null,null,null,null,null,null}, 32000, 250, 30, new ItemStack[]{LSTReg.sf("PLASTIC_SHEET",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_SLZSCQ_3 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_SLZSCQ_3"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_SLZSCQ_3",8),null,null,null,null,null,null,null,null}, 640000, 500, 10, new ItemStack[]{LSTReg.sf("PLASTIC_SHEET",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_反应堆冷却剂生成器_1 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_反应堆冷却剂生成器_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_反应堆冷却剂生成器_1",64),null,null,null,null,null,null,null,null}, 6400, 50, 60, new ItemStack[]{LSTReg.sf("REACTOR_COLLANT_CELL",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_反应堆冷却剂生成器_2 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_反应堆冷却剂生成器_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_反应堆冷却剂生成器_2",64),null,null,null,null,null,null,null,null}, 32000, 250, 30, new ItemStack[]{LSTReg.sf("REACTOR_COLLANT_CELL",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_反应堆冷却剂生成器_3 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_反应堆冷却剂生成器_3"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_反应堆冷却剂生成器_3",64),null,null,null,null,null,null,null,null}, 640000, 500, 10, new ItemStack[]{LSTReg.sf("REACTOR_COLLANT_CELL",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_下界冰冷却剂生成器_1 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_下界冰冷却剂生成器_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_下界冰冷却剂生成器_1",64),null,null,null,null,null,null,null,null}, 6400, 50, 60, new ItemStack[]{LSTReg.sf("NETHER_ICE_COOLANT_CELL",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_下界冰冷却剂生成器_2 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_下界冰冷却剂生成器_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_下界冰冷却剂生成器_2",64),null,null,null,null,null,null,null,null}, 32000, 250, 30, new ItemStack[]{LSTReg.sf("NETHER_ICE_COOLANT_CELL",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_下界冰冷却剂生成器_3 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_下界冰冷却剂生成器_3"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_下界冰冷却剂生成器_3",64),null,null,null,null,null,null,null,null}, 640000, 500, 10, new ItemStack[]{LSTReg.sf("NETHER_ICE_COOLANT_CELL",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_钢化玻璃生成器_1 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_钢化玻璃生成器_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_钢化玻璃生成器_1",4),null,null,null,null,null,null,null,null}, 6400, 50, 60, new ItemStack[]{LSTReg.sf("HARDENED_GLASS",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_钢化玻璃生成器_2 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_钢化玻璃生成器_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_钢化玻璃生成器_2",4),null,null,null,null,null,null,null,null}, 32000, 250, 30, new ItemStack[]{LSTReg.sf("HARDENED_GLASS",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_钢化玻璃生成器_3 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_钢化玻璃生成器_3"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_钢化玻璃生成器_3",4),null,null,null,null,null,null,null,null}, 640000, 500, 10, new ItemStack[]{LSTReg.sf("HARDENED_GLASS",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_货运马达生成器_1 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_货运马达生成器_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_货运马达生成器_1",16),null,null,null,null,null,null,null,null}, 6400, 50, 60, new ItemStack[]{LSTReg.sf("CARGO_MOTOR",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_货运马达生成器_2 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_货运马达生成器_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_货运马达生成器_2",16),null,null,null,null,null,null,null,null}, 32000, 250, 30, new ItemStack[]{LSTReg.sf("CARGO_MOTOR",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_SF_货运马达生成器_3 =====
        new LSTMaterialGenerator(LSTGroups.YS_NYCLSCQ, LSTReg.lstStack("LENGSHANG_YS_SF_货运马达生成器_3"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_SF_货运马达生成器_3",16),null,null,null,null,null,null,null,null}, 640000, 500, 10, new ItemStack[]{LSTReg.sf("CARGO_MOTOR",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_ZQ_MKSSCQ_1 =====
        new LSTMaterialGenerator(LSTGroups.YS_YBCLSCQ, LSTReg.lstStack("LENGSHANG_YS_ZQ_MKSSCQ_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_YS_MKSSCQ_1",60),null,null,null,null,null,null,null,null}, 64000, 500, 1, new ItemStack[]{LSTReg.mat("COAL_ORE",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_ZQ_MKSSCQ_2 =====
        new LSTMaterialGenerator(LSTGroups.YS_YBCLSCQ, LSTReg.lstStack("LENGSHANG_YS_ZQ_MKSSCQ_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_YS_MKSSCQ_2",30),null,null,null,null,null,null,null,null}, 32000, 2500, 1, new ItemStack[]{LSTReg.mat("COAL_ORE",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_ZQ_MKSSCQ_3 =====
        new LSTMaterialGenerator(LSTGroups.YS_YBCLSCQ, LSTReg.lstStack("LENGSHANG_YS_ZQ_MKSSCQ_3"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_YS_MKSSCQ_3",10),null,null,null,null,null,null,null,null}, 640000, 5000, 1, new ItemStack[]{LSTReg.mat("COAL_ORE",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_ZQ_TKSSCQ_1 =====
        new LSTMaterialGenerator(LSTGroups.YS_YBCLSCQ, LSTReg.lstStack("LENGSHANG_YS_ZQ_TKSSCQ_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_YS_TKSSCQ_1",60),null,null,null,null,null,null,null,null}, 64000, 500, 1, new ItemStack[]{LSTReg.mat("IRON_ORE",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_ZQ_TKSSCQ_2 =====
        new LSTMaterialGenerator(LSTGroups.YS_YBCLSCQ, LSTReg.lstStack("LENGSHANG_YS_ZQ_TKSSCQ_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_YS_TKSSCQ_2",30),null,null,null,null,null,null,null,null}, 32000, 2500, 1, new ItemStack[]{LSTReg.mat("IRON_ORE",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_ZQ_TKSSCQ_3 =====
        new LSTMaterialGenerator(LSTGroups.YS_YBCLSCQ, LSTReg.lstStack("LENGSHANG_YS_ZQ_TKSSCQ_3"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_YS_TKSSCQ_3",10),null,null,null,null,null,null,null,null}, 640000, 5000, 1, new ItemStack[]{LSTReg.mat("IRON_ORE",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_ZQ_TONGKSSCQ_1 =====
        new LSTMaterialGenerator(LSTGroups.YS_YBCLSCQ, LSTReg.lstStack("LENGSHANG_YS_ZQ_TONGKSSCQ_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_YS_TONGKSSCQ_1",60),null,null,null,null,null,null,null,null}, 64000, 500, 1, new ItemStack[]{LSTReg.mat("COPPER_ORE",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_ZQ_TONGKSSCQ_2 =====
        new LSTMaterialGenerator(LSTGroups.YS_YBCLSCQ, LSTReg.lstStack("LENGSHANG_YS_ZQ_TONGKSSCQ_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_YS_TONGKSSCQ_2",30),null,null,null,null,null,null,null,null}, 32000, 2500, 1, new ItemStack[]{LSTReg.mat("COPPER_ORE",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_ZQ_TONGKSSCQ_3 =====
        new LSTMaterialGenerator(LSTGroups.YS_YBCLSCQ, LSTReg.lstStack("LENGSHANG_YS_ZQ_TONGKSSCQ_3"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_YS_TONGKSSCQ_3",10),null,null,null,null,null,null,null,null}, 640000, 5000, 1, new ItemStack[]{LSTReg.mat("COPPER_ORE",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_ZQ_JKSSCQ_1 =====
        new LSTMaterialGenerator(LSTGroups.YS_YBCLSCQ, LSTReg.lstStack("LENGSHANG_YS_ZQ_JKSSCQ_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_YS_JKSSCQ_1",60),null,null,null,null,null,null,null,null}, 64000, 500, 1, new ItemStack[]{LSTReg.mat("GOLD_ORE",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_ZQ_JKSSCQ_2 =====
        new LSTMaterialGenerator(LSTGroups.YS_YBCLSCQ, LSTReg.lstStack("LENGSHANG_YS_ZQ_JKSSCQ_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_YS_JKSSCQ_2",30),null,null,null,null,null,null,null,null}, 32000, 2500, 1, new ItemStack[]{LSTReg.mat("GOLD_ORE",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_ZQ_JKSSCQ_3 =====
        new LSTMaterialGenerator(LSTGroups.YS_YBCLSCQ, LSTReg.lstStack("LENGSHANG_YS_ZQ_JKSSCQ_3"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_YS_JKSSCQ_3",10),null,null,null,null,null,null,null,null}, 640000, 5000, 1, new ItemStack[]{LSTReg.mat("GOLD_ORE",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_ZQ_HSKSSCQ_1 =====
        new LSTMaterialGenerator(LSTGroups.YS_YBCLSCQ, LSTReg.lstStack("LENGSHANG_YS_ZQ_HSKSSCQ_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_YS_HSKSSCQ_1",60),null,null,null,null,null,null,null,null}, 64000, 500, 1, new ItemStack[]{LSTReg.mat("REDSTONE_ORE",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_ZQ_HSKSSCQ_2 =====
        new LSTMaterialGenerator(LSTGroups.YS_YBCLSCQ, LSTReg.lstStack("LENGSHANG_YS_ZQ_HSKSSCQ_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_YS_HSKSSCQ_2",30),null,null,null,null,null,null,null,null}, 32000, 2500, 1, new ItemStack[]{LSTReg.mat("REDSTONE_ORE",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_ZQ_HSKSSCQ_3 =====
        new LSTMaterialGenerator(LSTGroups.YS_YBCLSCQ, LSTReg.lstStack("LENGSHANG_YS_ZQ_HSKSSCQ_3"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_YS_HSKSSCQ_3",10),null,null,null,null,null,null,null,null}, 640000, 5000, 1, new ItemStack[]{LSTReg.mat("REDSTONE_ORE",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_ZQ_LBSKSSCQ_1 =====
        new LSTMaterialGenerator(LSTGroups.YS_YBCLSCQ, LSTReg.lstStack("LENGSHANG_YS_ZQ_LBSKSSCQ_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_YS_LBSKSSCQ_1",60),null,null,null,null,null,null,null,null}, 64000, 500, 1, new ItemStack[]{LSTReg.mat("EMERALD_ORE",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_ZQ_LBSKSSCQ_2 =====
        new LSTMaterialGenerator(LSTGroups.YS_YBCLSCQ, LSTReg.lstStack("LENGSHANG_YS_ZQ_LBSKSSCQ_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_YS_LBSKSSCQ_2",30),null,null,null,null,null,null,null,null}, 32000, 2500, 1, new ItemStack[]{LSTReg.mat("EMERALD_ORE",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_ZQ_LBSKSSCQ_3 =====
        new LSTMaterialGenerator(LSTGroups.YS_YBCLSCQ, LSTReg.lstStack("LENGSHANG_YS_ZQ_LBSKSSCQ_3"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_YS_LBSKSSCQ_3",10),null,null,null,null,null,null,null,null}, 640000, 5000, 1, new ItemStack[]{LSTReg.mat("EMERALD_ORE",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_ZQ_QJSKSSCQ_1 =====
        new LSTMaterialGenerator(LSTGroups.YS_YBCLSCQ, LSTReg.lstStack("LENGSHANG_YS_ZQ_QJSKSSCQ_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_YS_QJSKSSCQ_1",60),null,null,null,null,null,null,null,null}, 64000, 500, 1, new ItemStack[]{LSTReg.mat("LAPIS_ORE",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_ZQ_QJSKSSCQ_2 =====
        new LSTMaterialGenerator(LSTGroups.YS_YBCLSCQ, LSTReg.lstStack("LENGSHANG_YS_ZQ_QJSKSSCQ_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_YS_QJSKSSCQ_2",30),null,null,null,null,null,null,null,null}, 32000, 2500, 1, new ItemStack[]{LSTReg.mat("LAPIS_ORE",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_ZQ_QJSKSSCQ_3 =====
        new LSTMaterialGenerator(LSTGroups.YS_YBCLSCQ, LSTReg.lstStack("LENGSHANG_YS_ZQ_QJSKSSCQ_3"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_YS_QJSKSSCQ_3",10),null,null,null,null,null,null,null,null}, 640000, 5000, 1, new ItemStack[]{LSTReg.mat("LAPIS_ORE",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_ZQ_ZSKSSCQ_1 =====
        new LSTMaterialGenerator(LSTGroups.YS_YBCLSCQ, LSTReg.lstStack("LENGSHANG_YS_ZQ_ZSKSSCQ_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_YS_ZSKSSCQ_1",60),null,null,null,null,null,null,null,null}, 64000, 500, 1, new ItemStack[]{LSTReg.mat("DIAMOND_ORE",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_ZQ_ZSKSSCQ_2 =====
        new LSTMaterialGenerator(LSTGroups.YS_YBCLSCQ, LSTReg.lstStack("LENGSHANG_YS_ZQ_ZSKSSCQ_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_YS_ZSKSSCQ_2",30),null,null,null,null,null,null,null,null}, 32000, 2500, 1, new ItemStack[]{LSTReg.mat("DIAMOND_ORE",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_ZQ_ZSKSSCQ_3 =====
        new LSTMaterialGenerator(LSTGroups.YS_YBCLSCQ, LSTReg.lstStack("LENGSHANG_YS_ZQ_ZSKSSCQ_3"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_YS_ZSKSSCQ_3",10),null,null,null,null,null,null,null,null}, 640000, 5000, 1, new ItemStack[]{LSTReg.mat("DIAMOND_ORE",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_ZQ_XJSYKSSCQ_1 =====
        new LSTMaterialGenerator(LSTGroups.YS_YBCLSCQ, LSTReg.lstStack("LENGSHANG_YS_ZQ_XJSYKSSCQ_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_YS_XJSYKSSCQ_1",60),null,null,null,null,null,null,null,null}, 64000, 500, 1, new ItemStack[]{LSTReg.mat("NETHER_QUARTZ_ORE",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_ZQ_XJSYKSSCQ_2 =====
        new LSTMaterialGenerator(LSTGroups.YS_YBCLSCQ, LSTReg.lstStack("LENGSHANG_YS_ZQ_XJSYKSSCQ_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_YS_XJSYKSSCQ_2",30),null,null,null,null,null,null,null,null}, 32000, 2500, 1, new ItemStack[]{LSTReg.mat("NETHER_QUARTZ_ORE",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_ZQ_XJSYKSSCQ_3 =====
        new LSTMaterialGenerator(LSTGroups.YS_YBCLSCQ, LSTReg.lstStack("LENGSHANG_YS_ZQ_XJSYKSSCQ_3"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_YS_XJSYKSSCQ_3",10),null,null,null,null,null,null,null,null}, 640000, 5000, 1, new ItemStack[]{LSTReg.mat("NETHER_QUARTZ_ORE",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_ZQ_SCMKSSCQ_1 =====
        new LSTMaterialGenerator(LSTGroups.YS_YBCLSCQ, LSTReg.lstStack("LENGSHANG_YS_ZQ_SCMKSSCQ_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_YS_SCMKSSCQ_1",60),null,null,null,null,null,null,null,null}, 64000, 500, 1, new ItemStack[]{LSTReg.mat("DEEPSLATE_COAL_ORE",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_ZQ_SCMKSSCQ_2 =====
        new LSTMaterialGenerator(LSTGroups.YS_YBCLSCQ, LSTReg.lstStack("LENGSHANG_YS_ZQ_SCMKSSCQ_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_YS_SCMKSSCQ_2",30),null,null,null,null,null,null,null,null}, 32000, 2500, 1, new ItemStack[]{LSTReg.mat("DEEPSLATE_COAL_ORE",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_ZQ_SCMKSSCQ_3 =====
        new LSTMaterialGenerator(LSTGroups.YS_YBCLSCQ, LSTReg.lstStack("LENGSHANG_YS_ZQ_SCMKSSCQ_3"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_YS_SCMKSSCQ_3",10),null,null,null,null,null,null,null,null}, 640000, 5000, 1, new ItemStack[]{LSTReg.mat("DEEPSLATE_COAL_ORE",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_ZQ_SCTKSSCQ_1 =====
        new LSTMaterialGenerator(LSTGroups.YS_YBCLSCQ, LSTReg.lstStack("LENGSHANG_YS_ZQ_SCTKSSCQ_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_YS_SCTKSSCQ_1",60),null,null,null,null,null,null,null,null}, 64000, 500, 1, new ItemStack[]{LSTReg.mat("DEEPSLATE_IRON_ORE",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_ZQ_SCTKSSCQ_2 =====
        new LSTMaterialGenerator(LSTGroups.YS_YBCLSCQ, LSTReg.lstStack("LENGSHANG_YS_ZQ_SCTKSSCQ_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_YS_SCTKSSCQ_2",30),null,null,null,null,null,null,null,null}, 32000, 2500, 1, new ItemStack[]{LSTReg.mat("DEEPSLATE_IRON_ORE",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_ZQ_SCTKSSCQ_3 =====
        new LSTMaterialGenerator(LSTGroups.YS_YBCLSCQ, LSTReg.lstStack("LENGSHANG_YS_ZQ_SCTKSSCQ_3"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_YS_SCTKSSCQ_3",10),null,null,null,null,null,null,null,null}, 640000, 5000, 1, new ItemStack[]{LSTReg.mat("DEEPSLATE_IRON_ORE",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_ZQ_SCTONGKSSCQ_1 =====
        new LSTMaterialGenerator(LSTGroups.YS_YBCLSCQ, LSTReg.lstStack("LENGSHANG_YS_ZQ_SCTONGKSSCQ_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_YS_SCTONGKSSCQ_1",60),null,null,null,null,null,null,null,null}, 64000, 500, 1, new ItemStack[]{LSTReg.mat("DEEPSLATE_COPPER_ORE",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_ZQ_SCTONGKSSCQ_2 =====
        new LSTMaterialGenerator(LSTGroups.YS_YBCLSCQ, LSTReg.lstStack("LENGSHANG_YS_ZQ_SCTONGKSSCQ_2"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_YS_SCTONGKSSCQ_2",30),null,null,null,null,null,null,null,null}, 32000, 2500, 1, new ItemStack[]{LSTReg.mat("DEEPSLATE_COPPER_ORE",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_ZQ_SCTONGKSSCQ_3 =====
        new LSTMaterialGenerator(LSTGroups.YS_YBCLSCQ, LSTReg.lstStack("LENGSHANG_YS_ZQ_SCTONGKSSCQ_3"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_YS_SCTONGKSSCQ_3",10),null,null,null,null,null,null,null,null}, 640000, 5000, 1, new ItemStack[]{LSTReg.mat("DEEPSLATE_COPPER_ORE",64)}, false).register(plugin);
        // ===== LENGSHANG_YS_ZQ_SCJKSSCQ_1 =====
        new LSTMaterialGenerator(LSTGroups.YS_YBCLSCQ, LSTReg.lstStack("LENGSHANG_YS_ZQ_SCJKSSCQ_1"), RecipeType.COMPRESSOR, new ItemStack[]{LSTReg.sf("LENGSHANG_YS_SCJKSSCQ_1",60),null,null,null,null,null,null,null,null}, 64000, 500, 1, new ItemStack[]{LSTReg.mat("DEEPSLATE_GOLD_ORE",64)}, false).register(plugin);
    }

    private LSTMatGen_5() {
    }
}
