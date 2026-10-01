package io.Yomicer.LengShangTech.gen;

import io.Yomicer.LengShangTech.core.*;
import io.Yomicer.LengShangTech.machines.*;
import io.Yomicer.LengShangTech.scripts.*;
import io.Yomicer.LengShangTech.LengShangEvo;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.items.electric.Capacitor;
import org.bukkit.inventory.ItemStack;

/** 冷殇 GEO 资源 (geo_resources.yml)。 */
public final class LSTGeo {

    public static void setup(LengShangEvo plugin) {
        LSTScriptBridge.registerGeoResource(plugin, "LENGSHANG_MTXJ", "#FFB6C1莓糖星酱", LSTItemFactory.head("LENGSHANG_MTXJ","f274a8a5ca66afeb2c7f162253a6c461d56b8511427a55857882a1f77aac8","&x&F&F&B&6&C&1莓糖星酱","&x&F&F&9&B&B&3是一颗从棉花糖星系掉下来的小脑袋","&x&F&F&9&B&B&3软萌的粉色外壳里装着一整罐草莓气泡和闪闪星屑","&x&F&F&9&B&B&3谁敲一下都会“啵”地冒出甜甜圈味的彩虹"), LSTGroups.CL, 30, 30, 30, 1, true);
        LSTScriptBridge.registerGeoResource(plugin, "LENGSHANG_BLX_BLS", "&b&l箔澜沙", LSTItemFactory.head("LENGSHANG_BLX_BLS","8988fe7f49072bd9be53d16e589ce72e0dca8c308b3e9dc6f43262a816e60473","&b&l箔澜沙","&7在深渊中留存有一丝痕迹"), LSTGroups.BLX_CL, 0, 1, 0, 1, true);
        LSTScriptBridge.registerGeoResource(plugin, "LENGSHANG_BLX_YTB", "&b&l陨土碑", LSTItemFactory.material("LENGSHANG_BLX_YTB","STONE_SWORD",false,"&b&l陨土碑","&7它撕开了一条裂缝..."), LSTGroups.BLX_CL, 0, 0, 1, 1, true);
    }

    private LSTGeo() {
    }
}
