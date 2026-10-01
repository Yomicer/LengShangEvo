package io.Yomicer.LengShangTech.machines;

import io.Yomicer.LengShangTech.core.LSTReg;
import io.Yomicer.LengShangTech.gen.LSTGroups;
import io.Yomicer.LengShangTech.scripts.LSTScriptBridge;
import io.Yomicer.LengShangTech.utils.LSTLog;
import io.Yomicer.LengShangTech.LengShangEvo;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.utils.ChestMenuUtils;
import me.mrCookieSlime.CSCoreLibPlugin.Configuration.Config;
import me.mrCookieSlime.Slimefun.Objects.handlers.BlockTicker;
import me.mrCookieSlime.Slimefun.api.BlockStorage;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenuPreset;
import me.mrCookieSlime.Slimefun.api.item_transport.ItemTransportFlow;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

/**
 * machines.yml 的 4 台特殊机器:
 * - 造物主编码器: 输入写有粘液物品 ID 的命名牌, 输出对应物品 (脚本 造物主编码器.js)。
 * - 堆叠乱码核心: MomoTech 联动物品 (缺附属时由配方守卫跳过)。
 * - 堆叠乱码生成器: MomoTech 联动检测机。
 * - 快捷序列化构造机: FinalTECH-Changed 联动。
 */
public final class LSTSpecialMachines {

    private LSTSpecialMachines() {
    }

    /** 造物主编码器 (无电力, 输入10 -> 输出16)。 */
    public static final class CreatorEncoder extends SlimefunItem {

        public static final int INPUT_SLOT = 10;
        public static final int OUTPUT_SLOT = 16;

        public CreatorEncoder(ItemGroup group, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
            super(group, item, recipeType, recipe);

            addItemHandler(new BlockTicker() {
                @Override
                public void tick(Block b, SlimefunItem sfItem, Config data) {
                    BlockMenu menu = BlockStorage.getInventory(b);
                    if (menu != null) {
                        CreatorEncoder.this.tick(menu);
                    }
                }

                @Override
                public boolean isSynchronized() {
                    return false;
                }
            });
        }

        @Override
        public void postRegister() {
            new BlockMenuPreset(this.getId(), "§d造物主编码器") {
                @Override
                public void init() {
                    LSTMenuRegistry.Layout l = LSTMenuRegistry.get(CreatorEncoder.this.getId());
                    if (LSTMenuRegistry.applyDecorations(this, l)) {
                        return;
                    }
                    drawBackground(new CustomItemStack(Material.PINK_STAINED_GLASS_PANE, " "), new int[] {
                            0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 15, 17,
                            18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35,
                            36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53
                    });
                    addItem(4, new CustomItemStack(Material.NAME_TAG,
                            "§d造物主编码器", "§7把写有粘液物品 ID 的命名牌放入左侧输入口",
                            "§7即可凭空创造对应物品", "§7示例: 命名牌名字为 slimefun:XXX 或直接 XXX"), ChestMenuUtils.getEmptyClickHandler());
                }

                @Override
                public boolean canOpen(Block block, Player player) {
                    return true;
                }

                @Override
                public int[] getSlotsAccessedByItemTransport(ItemTransportFlow flow) {
                    return flow == ItemTransportFlow.WITHDRAW ? new int[] { OUTPUT_SLOT } : new int[0];
                }
            };
        }

        /** 每刻检查: 输入命名牌 → 输出物品。 */
        private void tick(BlockMenu menu) {
            ItemStack input = menu.getItemInSlot(INPUT_SLOT);
            if (input == null || input.getType() != Material.NAME_TAG || !input.hasItemMeta()) {
                return;
            }
            String displayName = input.getItemMeta().getDisplayName();
            if (displayName == null || displayName.isEmpty()) {
                return;
            }
            String id = ChatColor.stripColor(displayName).trim();
            if (id.startsWith("slimefun:")) {
                id = id.substring("slimefun:".length()).trim();
            } else if (id.startsWith("SF:")) {
                id = id.substring(3).trim();
            }
            SlimefunItem target = SlimefunItem.getById(id);
            if (target == null) {
                return;
            }
            ItemStack output = menu.getItemInSlot(OUTPUT_SLOT);
            if (output != null && output.getType() != Material.AIR) {
                return;
            }
            menu.replaceExistingItem(OUTPUT_SLOT, target.getItem().clone());
            menu.consumeItem(INPUT_SLOT, 1);
        }
    }

    /** 注册全部特殊机器 (machines.yml)。 */
    public static void registerAll(LengShangEvo plugin) {
        // 造物主编码器
        try {
            SlimefunItemStack encoderStack = LSTReg.lstStack("LENGSHANG_造物主编码器");
            if (encoderStack != null) {
                new CreatorEncoder(LSTGroups.ZHONGZHANG, encoderStack, RecipeType.NULL, LSTScriptBridge.NO_RECIPE)
                        .register(plugin);
            }
        } catch (Throwable t) {
            LSTLog.warn("造物主编码器注册失败: " + t.getMessage());
        }

        // 堆叠乱码核心 (脚本道具, 依赖 MomoTech 原料, 由配方守卫兜底)
        registerScriptOnly(plugin, "LENGSHANG_堆叠乱码核心", LSTGroups.TSWP, "道具/堆叠乱码核心");
        // 堆叠乱码生成器 (展示机)
        registerScriptOnly(plugin, "LENGSHANG_堆叠乱码生成器", LSTGroups.TSWP, "道具/堆叠乱码生成器");
        // 快捷序列化构造机 (依赖 FinalTECH-Changed)
        registerScriptOnly(plugin, "LENGSHANG_快捷序列化构造机", LSTGroups.TSWP, "道具/快捷序列化构造机");
    }

    private static void registerScriptOnly(LengShangEvo plugin, String id, ItemGroup group, String script) {
        try {
            if (LSTReg.lstStack(id) == null) {
                return;
            }
            LSTScriptBridge.registerScriptItem(plugin, id, script, group);
        } catch (Throwable t) {
            LSTLog.warn("特殊机器注册失败: " + id + " - " + t.getMessage());
        }
    }
}
