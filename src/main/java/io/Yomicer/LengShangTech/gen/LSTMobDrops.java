package io.Yomicer.LengShangTech.gen;

import io.Yomicer.LengShangTech.core.*;
import io.Yomicer.LengShangTech.machines.*;
import io.Yomicer.LengShangTech.scripts.*;
import io.Yomicer.LengShangTech.LengShangEvo;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.items.electric.Capacitor;
import org.bukkit.inventory.ItemStack;

/** 冷殇生物掉落 (mob_drops.yml)。 */
public final class LSTMobDrops {

    public static void setup(LengShangEvo plugin) {
        LSTScriptBridge.registerMobDrop(plugin, "LENGSHANG_镧纱", LSTItemFactory.head("LENGSHANG_镧纱","a14d3c57f80824b3839b8b220f2158bca505d497fd1c9e3f29f422b1e6206a45","&a&l镧纱","&7富含稀有元素！"), LSTGroups.BLX_CL, "PHANTOM", 6);
        LSTScriptBridge.registerMobDrop(plugin, "LENGSHANG_光腺", LSTItemFactory.head("LENGSHANG_光腺","5d225635fe66cced5e1f1030a11bfbe1e28a8745f920e7b7076eb669c902283","&e&l光腺","&7如星星般闪耀"), LSTGroups.BLX_CL, "GLOW_SQUID", 4);
        LSTScriptBridge.registerMobDrop(plugin, "LENGSHANG_游商", LSTItemFactory.head("LENGSHANG_游商","5ccf9ea1a6e1b86ad60a804ff800b0dfd76d73e5c91f47f84bb7169306546012","&b&l游商","&7行商人的前世"), LSTGroups.BLX_CL, "WANDERING_TRADER", 3);
        LSTScriptBridge.registerMobDrop(plugin, "LENGSHANG_寂骸", LSTItemFactory.head("LENGSHANG_寂骸","99f334426eca60de8d0982f1c43f182d0240b39736780e72596f6fc70ec3cdee","&8&l寂骸","&7被遗忘在月球的流浪者"), LSTGroups.BLX_CL, "STRAY", 5);
    }

    private LSTMobDrops() {
    }
}
