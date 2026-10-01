package io.Yomicer.LengShangTech.gen;

import io.Yomicer.LengShangTech.core.*;
import io.Yomicer.LengShangTech.machines.*;
import io.Yomicer.LengShangTech.scripts.*;
import io.Yomicer.LengShangTech.LengShangEvo;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.items.electric.Capacitor;
import org.bukkit.inventory.ItemStack;

/** 冷殇电容 (capacitors.yml)。 */
public final class LSTCapacitors {

    public static void setup(LengShangEvo plugin) {
        new Capacitor(LSTGroups.DL, 2100000000, LSTReg.lstStack("LENGSHANG_M87JJDR"), RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("M87NJW",1),LSTReg.sf("INFINITY_CAPACITOR",1),LSTReg.sf("M87NJW",1),null,null,null,null,null,null}).register(plugin);
        new Capacitor(LSTGroups.BLX_JQ, 29079, LSTReg.lstStack("LENGSHANG_箔澜电容"), RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("LENGSHANG_BLX_BLS",1),LSTReg.sf("LENGSHANG_BLX_YTB",1),LSTReg.sf("LENGSHANG_BLX_BLS",1),LSTReg.sf("LENGSHANG_BLX_BLS",1),LSTReg.sf("SMALL_CAPACITOR",1),LSTReg.sf("LENGSHANG_BLX_BLS",1),LSTReg.sf("LENGSHANG_BLX_BLS",1),LSTReg.sf("LENGSHANG_BLX_YTB",1),LSTReg.sf("LENGSHANG_BLX_BLS",1)}).register(plugin);
    }

    private LSTCapacitors() {
    }
}
