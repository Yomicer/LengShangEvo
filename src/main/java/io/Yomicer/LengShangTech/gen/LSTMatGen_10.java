package io.Yomicer.LengShangTech.gen;

import io.Yomicer.LengShangTech.core.*;
import io.Yomicer.LengShangTech.machines.*;
import io.Yomicer.LengShangTech.scripts.*;
import io.Yomicer.LengShangTech.LengShangEvo;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.items.electric.Capacitor;
import org.bukkit.inventory.ItemStack;

/** 冷殇材料生成器 (自动转换)。 */
public final class LSTMatGen_10 {

    public static void setup(LengShangEvo plugin) {
        // ===== LENGSHANG_美西螈桶永动机 =====
        new LSTMaterialGenerator(LSTGroups.JQ, LSTReg.lstStack("LENGSHANG_美西螈桶永动机"), RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.mat("AXOLOTL_BUCKET",1),LSTReg.sf("VANILLA_AUTO_CRAFTER",1),LSTReg.mat("AXOLOTL_BUCKET",1),LSTReg.sf("VANILLA_AUTO_CRAFTER",1),LSTReg.sf("LENGSHANG_SCQHX",1),LSTReg.sf("VANILLA_AUTO_CRAFTER",1),LSTReg.mat("AXOLOTL_BUCKET",1),LSTReg.sf("VANILLA_AUTO_CRAFTER",1),LSTReg.mat("AXOLOTL_BUCKET",1)}, 10000, 50, 10, new ItemStack[]{LSTReg.mat("AXOLOTL_BUCKET",1)}, false).register(plugin);
    }

    private LSTMatGen_10() {
    }
}
