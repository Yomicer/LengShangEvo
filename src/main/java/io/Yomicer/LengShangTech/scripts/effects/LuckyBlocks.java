package io.Yomicer.LengShangTech.scripts.effects;

import io.Yomicer.LengShangTech.scripts.LSTItemAction;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.WeatherType;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Sheep;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.DyeColor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * 幸运方块 (scripts/幸运方块 的 8 个 JS)。
 * 一次抽取: 专属奖池 + 公共事件池 (惩罚/经验/烟花/金币雨/回血/彩虹羊/附魔书/乱序/反向/饥饿/刷怪)。
 * 权重与原脚本一致。
 */
public final class LuckyBlocks {

    private LuckyBlocks() {
    }

    /** 一次加权抽取的条目 */
    public record Entry(int weight, BiConsumer<Player, Location> reward) {
    }

    /** 奖池: 多个加权条目。 */
    public static final class Table {
        private final List<Entry> entries = new ArrayList<>();
        private int total;

        public Table add(int weight, BiConsumer<Player, Location> reward) {
            entries.add(new Entry(weight, reward));
            total += weight;
            return this;
        }

        public BiConsumer<Player, Location> roll() {
            int pick = ThreadLocalRandom.current().nextInt(total);
            for (Entry entry : entries) {
                pick -= entry.weight();
                if (pick < 0) {
                    return entry.reward();
                }
            }
            return entries.get(entries.size() - 1).reward();
        }
    }

    private static final java.util.function.Consumer<Player> NOTHING = p -> {
    };

    // ===== 通用事件 (所有幸运方块共享, 与原脚本权重一致) =====

    public static Table common() {
        return new Table()
                .add(5, LuckyBlocks::punish)
                .add(5, LuckyBlocks::xpBottle)
                .add(3, LuckyBlocks::fireworkShow)
                .add(4, LuckyBlocks::coinRain)
                .add(5, LuckyBlocks::xpBurst)
                .add(4, LuckyBlocks::instantHeal)
                .add(3, LuckyBlocks::rainbowSheep)
                .add(3, LuckyBlocks::enchantedBook)
                .add(2, LuckyBlocks::inventoryShuffle)
                .add(1, LuckyBlocks::reverseControl)
                .add(2, LuckyBlocks::hungerCurse)
                .add(30, LuckyBlocks::spawnCategory);
    }

    /** 惩罚: 落雷 + 负面药水。 */
    private static void punish(Player player, Location loc) {
        loc.getWorld().strikeLightning(loc);
        apply(player, PotionEffectType.POISON, 1, 10);
        apply(player, PotionEffectType.SLOW, 1, 10);
        apply(player, PotionEffectType.WEAKNESS, 1, 10);
    }

    /** 经验瓶雨。 */
    private static void xpBottle(Player player, Location loc) {
        int count = 15 + ThreadLocalRandom.current().nextInt(31);
        for (int i = 0; i < count; i++) {
            loc.getWorld().spawnEntity(loc.clone().add(rnd(2), 2, rnd(2)), EntityType.EXPERIENCE_ORB);
        }
    }

    /** 烟花秀。 */
    private static void fireworkShow(Player player, Location loc) {
        for (int i = 0; i < 10; i++) {
            org.bukkit.entity.Firework firework = loc.getWorld().spawn(loc.clone().add(rnd(3), 1, rnd(3)), org.bukkit.entity.Firework.class);
            org.bukkit.inventory.meta.FireworkMeta meta = firework.getFireworkMeta();
            meta.addEffect(org.bukkit.FireworkEffect.builder()
                    .with(org.bukkit.FireworkEffect.Type.values()[ThreadLocalRandom.current().nextInt(org.bukkit.FireworkEffect.Type.values().length)])
                    .withColor(org.bukkit.Color.fromRGB(ThreadLocalRandom.current().nextInt(0xFFFFFF)))
                    .trail(true).build());
            meta.setPower(1);
            firework.setFireworkMeta(meta);
        }
    }

    /** 金币雨。 */
    private static void coinRain(Player player, Location loc) {
        int count = 20 + ThreadLocalRandom.current().nextInt(31);
        for (int i = 0; i < count; i++) {
            loc.getWorld().dropItemNaturally(loc.clone().add(rnd(3), 2, rnd(3)), new ItemStack(Material.GOLD_NUGGET));
        }
    }

    /** 经验爆发。 */
    private static void xpBurst(Player player, Location loc) {
        player.giveExp(200 + ThreadLocalRandom.current().nextInt(801));
    }

    /** 立即回血。 */
    private static void instantHeal(Player player, Location loc) {
        player.setHealth(player.getMaxHealth());
        player.setFoodLevel(20);
        apply(player, PotionEffectType.REGENERATION, 1, 10);
        apply(player, PotionEffectType.ABSORPTION, 2, 30);
    }

    /** 彩虹羊。 */
    private static void rainbowSheep(Player player, Location loc) {
        Sheep sheep = (Sheep) loc.getWorld().spawnEntity(loc, EntityType.SHEEP);
        sheep.setColor(DyeColor.values()[ThreadLocalRandom.current().nextInt(DyeColor.values().length)]);
        sheep.setCustomName("§d彩虹羊");
    }

    /** 随机附魔书 (等级 1-15)。 */
    private static void enchantedBook(Player player, Location loc) {
        Enchantment[] enchants = Arrays.stream(Enchantment.values())
                .filter(e -> e.canEnchantItem(new ItemStack(Material.DIAMOND_SWORD)))
                .toArray(Enchantment[]::new);
        if (enchants.length == 0) return;
        Enchantment pick = enchants[ThreadLocalRandom.current().nextInt(enchants.length)];
        ItemStack book = new ItemStack(Material.ENCHANTED_BOOK);
        org.bukkit.inventory.meta.EnchantmentStorageMeta meta = (org.bukkit.inventory.meta.EnchantmentStorageMeta) book.getItemMeta();
        meta.addStoredEnchant(pick, 1 + ThreadLocalRandom.current().nextInt(15), true);
        book.setItemMeta(meta);
        loc.getWorld().dropItemNaturally(loc, book);
    }

    /** 背包乱序 (Fisher-Yates)。 */
    private static void inventoryShuffle(Player player, Location loc) {
        ItemStack[] contents = player.getInventory().getContents();
        List<ItemStack> list = new ArrayList<>(Arrays.asList(contents));
        java.util.Collections.shuffle(list);
        player.getInventory().setContents(list.toArray(new ItemStack[0]));
        player.sendMessage("§5你的背包被乱序了!");
    }

    /** 反向控制: 减速/漂浮/反胃 20 秒。 */
    private static void reverseControl(Player player, Location loc) {
        apply(player, PotionEffectType.SLOW, 3, 20);
        apply(player, PotionEffectType.LEVITATION, 0, 20);
        apply(player, PotionEffectType.CONFUSION, 0, 20);
    }

    /** 饥饿诅咒。 */
    private static void hungerCurse(Player player, Location loc) {
        apply(player, PotionEffectType.HUNGER, 2, 30);
        player.setFoodLevel(Math.max(1, player.getFoodLevel() - 6));
    }

    /** 刷怪分类 (hostile 40% / neutral 30% / friendly 20% / special 10% + BOSS 1%)。 */
    private static void spawnCategory(Player player, Location loc) {
        int pick = ThreadLocalRandom.current().nextInt(100);
        if (pick < 1) {
            loc.getWorld().spawnEntity(loc, ThreadLocalRandom.current().nextBoolean() ? EntityType.WITHER : EntityType.WARDEN);
        } else if (pick < 41) {
            spawn(loc, EntityType.ZOMBIE, EntityType.SKELETON, EntityType.CREEPER, EntityType.SPIDER, EntityType.PHANTOM, EntityType.WITCH);
        } else if (pick < 71) {
            spawn(loc, EntityType.WOLF, EntityType.IRON_GOLEM, EntityType.PANDA, EntityType.GOAT, EntityType.BEE);
        } else if (pick < 91) {
            spawn(loc, EntityType.COW, EntityType.PIG, EntityType.CHICKEN, EntityType.SHEEP, EntityType.RABBIT);
        } else {
            spawn(loc, EntityType.VILLAGER, EntityType.ALLAY, EntityType.ARMOR_STAND);
        }
    }

    private static void spawn(Location loc, EntityType... types) {
        int count = 2 + ThreadLocalRandom.current().nextInt(4);
        for (int i = 0; i < count; i++) {
            loc.getWorld().spawnEntity(loc.clone().add(rnd(3), 0.5, rnd(3)), types[ThreadLocalRandom.current().nextInt(types.length)]);
        }
    }

    // ===== 物品奖池工具 =====

    /** 原版物品池: 单抽。 */
    public static Table withVanillaPool(Table table, List<Material> pool, int weight) {
        return table.add(weight, (player, loc) -> {
            Material pick = pool.get(ThreadLocalRandom.current().nextInt(pool.size()));
            dropItem(loc, new ItemStack(pick));
        });
    }

    /** 粘液物品池。 */
    public static Table withSlimefunPool(Table table, List<String> sfIds, int weight) {
        return table.add(weight, (player, loc) -> {
            String id = sfIds.get(ThreadLocalRandom.current().nextInt(sfIds.size()));
            SlimefunItem item = SlimefunItem.getById(id);
            if (item != null) {
                dropItem(loc, item.getItem().clone());
            }
        });
    }

    /** 套装池: 逐件发放幸运套装物品。 */
    public static Table withSetPool(Table table, List<String> setIds, int weight) {
        return table.add(weight, (player, loc) -> {
            for (String id : setIds) {
                SlimefunItem item = SlimefunItem.getById(id);
                if (item != null) {
                    dropItem(loc, item.getItem().clone());
                }
            }
        });
    }

    /** 多组 allDrop (每组一个加权 allDrop)。 */
    public static Table withAllDrops(Table table, List<Material> pool, int weight) {
        return withVanillaPool(table, pool, weight);
    }

    private static void dropItem(Location loc, ItemStack item) {
        loc.getWorld().dropItemNaturally(loc, item);
    }

    private static void apply(Player player, PotionEffectType type, int amplifier, int seconds) {
        player.addPotionEffect(new PotionEffect(type, seconds * 20, amplifier));
    }

    private static double rnd(double range) {
        return ThreadLocalRandom.current().nextDouble(-range, range);
    }

    // ===== 8 种幸运方块专属池 =====

    private static final List<Material> VANILLA_LUCKY = List.of(
            Material.BEACON, Material.ELYTRA, Material.DRAGON_EGG, Material.SPAWNER, Material.TOTEM_OF_UNDYING,
            Material.NETHER_STAR, Material.ENCHANTING_TABLE, Material.ANVIL, Material.SHULKER_SHELL, Material.HEART_OF_THE_SEA,
            Material.DIAMOND_BLOCK, Material.EMERALD_BLOCK, Material.GOLD_BLOCK, Material.IRON_BLOCK, Material.OBSIDIAN,
            Material.EXPERIENCE_BOTTLE, Material.GOLDEN_APPLE, Material.NAME_TAG, Material.SADDLE, Material.TRIDENT);

    private static final List<Material> WOOD_POOL = List.of(
            Material.OAK_LOG, Material.SPRUCE_LOG, Material.BIRCH_LOG, Material.JUNGLE_LOG, Material.ACACIA_LOG,
            Material.DARK_OAK_LOG, Material.MANGROVE_LOG, Material.CHERRY_LOG, Material.CRIMSON_STEM, Material.WARPED_STEM);
    private static final List<Material> SAPLING_POOL = List.of(
            Material.OAK_SAPLING, Material.SPRUCE_SAPLING, Material.BIRCH_SAPLING, Material.JUNGLE_SAPLING,
            Material.ACACIA_SAPLING, Material.DARK_OAK_SAPLING, Material.CHERRY_SAPLING, Material.MANGROVE_PROPAGULE);
    private static final List<Material> ORE_POOL = List.of(
            Material.COAL_ORE, Material.IRON_ORE, Material.COPPER_ORE, Material.GOLD_ORE, Material.REDSTONE_ORE,
            Material.LAPIS_ORE, Material.DIAMOND_ORE, Material.EMERALD_ORE, Material.NETHER_QUARTZ_ORE, Material.DEEPSLATE_DIAMOND_ORE);
    private static final List<Material> FLOWER_POOL = List.of(
            Material.POPPY, Material.DANDELION, Material.BLUE_ORCHID, Material.ALLIUM, Material.AZURE_BLUET, Material.CORNFLOWER,
            Material.RED_TULIP, Material.ORANGE_TULIP, Material.WHITE_TULIP, Material.PINK_TULIP, Material.LILY_OF_THE_VALLEY,
            Material.SUNFLOWER, Material.ROSE_BUSH, Material.PEONY, Material.LILAC);
    private static final List<Material> SLIME_INGOTS = List.of(
            Material.IRON_INGOT, Material.GOLD_INGOT, Material.COPPER_INGOT, Material.NETHERITE_INGOT);

    /** 幸运方块 (普通): 单抽 50 / 套装 10 / allDrop 30 + 公共事件。 */
    public static Table basic(List<String> luckySet) {
        Table table = common();
        withVanillaPool(table, VANILLA_LUCKY, 50);
        withSetPool(table, luckySet, 10);
        withVanillaPool(table, ORE_POOL, 15);
        withVanillaPool(table, WOOD_POOL, 15);
        return table;
    }

    public static Table wood() {
        Table table = common();
        withVanillaPool(table, WOOD_POOL, 25);
        withVanillaPool(table, SAPLING_POOL, 25);
        withVanillaPool(table, FLOWER_POOL, 10);
        return table;
    }

    public static Table ore() {
        Table table = common();
        withVanillaPool(table, ORE_POOL, 40);
        withVanillaPool(table, List.of(Material.DIAMOND, Material.EMERALD, Material.GOLD_INGOT, Material.IRON_INGOT), 10);
        return table;
    }

    public static Table flower() {
        Table table = common();
        withVanillaPool(table, FLOWER_POOL, 40);
        withVanillaPool(table, List.of(Material.BONE_MEAL, Material.WHEAT_SEEDS), 10);
        return table;
    }

    public static Table slime(List<String> set) {
        Table table = common();
        withVanillaPool(table, List.of(Material.SLIME_BALL, Material.SLIME_BLOCK, Material.HONEY_BLOCK, Material.HONEYCOMB, Material.HONEY_BOTTLE), 25);
        withVanillaPool(table, SLIME_INGOTS, 25);
        withSetPool(table, set, 10);
        return table;
    }

    public static Table logic(List<String> set) {
        Table table = common();
        withSetPool(table, set, 40);
        withVanillaPool(table, List.of(Material.REDSTONE, Material.REPEATER, Material.COMPARATOR, Material.OBSERVER, Material.REDSTONE_BLOCK), 20);
        return table;
    }

    public static Table endlessBasic(List<String> set) {
        Table table = common();
        withSetPool(table, set, 50);
        withVanillaPool(table, ORE_POOL, 10);
        return table;
    }

    public static Table endlessAdvanced(List<String> set) {
        Table table = common();
        withSetPool(table, set, 55);
        withVanillaPool(table, VANILLA_LUCKY, 10);
        return table;
    }

    /** 生成右键动作。 */
    public static LSTItemAction action(Function<Player, Table> tableFactory) {
        return (player, item) -> {
            Table table = tableFactory.apply(player);
            table.roll().accept(player, player.getLocation());
            player.getWorld().playSound(player.getLocation(), Sound.BLOCK_CHEST_OPEN, 1f, 1.4f);
            return true; // 消耗幸运方块
        };
    }
}
