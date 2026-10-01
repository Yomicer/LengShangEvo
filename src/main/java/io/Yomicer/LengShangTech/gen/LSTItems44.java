package io.Yomicer.LengShangTech.gen;

import io.Yomicer.LengShangTech.core.*;
import io.Yomicer.LengShangTech.scripts.LSTScriptBridge;
import io.Yomicer.LengShangTech.scripts.LSTBlockDrops;
import io.Yomicer.LengShangTech.LengShangEvo;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import org.bukkit.inventory.ItemStack;

/** 冷殇物品定义 (自动转换, 第 45 批)。 */
public final class LSTItems44 {

    public static void create() {
        // LENGSHANG_tinalnessdt
        LSTItemFactory.head("LENGSHANG_tinalnessdt","73112785f64d814103931505ace00048c087337785550c99a67449c392b39772","&6tinalness的头","&7让大香蕉保佑你！","&7祈祷超新星和嬗变不会再炸了");
        // LENGSHANG_ysyt
        LSTItemFactory.material("LENGSHANG_ysyt","BLACK_DYE",false,"&6压缩以太","&716个以太压缩而成","&7冷殇科技-以太一体机材料");
        // LENGSHANG_yshuan
        LSTItemFactory.material("LENGSHANG_yshuan","BOWL",false,"&6压缩环","&74个环压缩而成","&7冷殇科技-以太一体机材料");
    }

    public static void register(LengShangEvo plugin) {
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_tinalnessdt", LSTGroups.CL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{LSTReg.sf("LOGITECH_MATL114",1),LSTReg.sf("LOGITECH_MATL114",1),LSTReg.sf("LOGITECH_MATL114",1),LSTReg.sf("LOGITECH_MATL114",1),LSTReg.sf("LOGITECH_MATL114",1),LSTReg.sf("LOGITECH_MATL114",1),LSTReg.sf("LOGITECH_MATL114",1),LSTReg.sf("LOGITECH_MATL114",1),LSTReg.sf("LOGITECH_MATL114",1)}, true);
        LSTScriptBridge.registerPlainItem(plugin, "LENGSHANG_ysyt", LSTGroups.CL, LSTRecipeTypes.get("LENGSHANG_XX_LSKJGZZ"), new ItemStack[]{null,null,null,null,LSTReg.sf("_FINALTECH_ETHER",16),null,null,null,null}, false);
    }

    private LSTItems44() {
    }
}
