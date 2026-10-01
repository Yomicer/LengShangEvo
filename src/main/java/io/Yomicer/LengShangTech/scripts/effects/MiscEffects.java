package io.Yomicer.LengShangTech.scripts.effects;

import io.Yomicer.LengShangTech.scripts.LSTItemAction;
import io.Yomicer.LengShangTech.utils.LSTPdc;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.implementation.Slimefun;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.attribute.Attribute;
import org.bukkit.block.Block;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Giant;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.EnchantmentStorageMeta;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * 杂项道具效果 (scripts/道具 的右键道具, 语录类除外)。
 */
public final class MiscEffects {

    private MiscEffects() {
    }

    /** 解析数量输入: 支持纯数字与 k(×1000)/m(×1000000) 后缀。 */
    private static Integer parseAmount(String input) {
        try {
            String s = input.trim().toLowerCase();
            long multiplier = 1;
            if (s.endsWith("m")) {
                multiplier = 1_000_000;
                s = s.substring(0, s.length() - 1);
            } else if (s.endsWith("k")) {
                multiplier = 1_000;
                s = s.substring(0, s.length() - 1);
            }
            double number = Double.parseDouble(s);
            long value = (long) Math.floor(number * multiplier);
            if (value < 0) return null;
            if (value > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            return (int) value;
        } catch (Exception e) {
            return null;
        }
    }

    /** 设置/更新以 prefix 开头的一行 lore (存在则替换, 否则追加)。 */
    private static void setLoreLine(ItemStack item, String prefix, String value) {
        if (item == null || !item.hasItemMeta()) {
            if (item == null) return;
        }
        ItemMeta meta = item.getItemMeta();
        if (meta == null) return;
        List<String> lore = meta.hasLore() ? new ArrayList<>(meta.getLore()) : new ArrayList<>();
        String line = prefix + value;
        boolean updated = false;
        for (int i = 0; i < lore.size(); i++) {
            if (lore.get(i).startsWith(prefix)) {
                lore.set(i, line);
                updated = true;
                break;
            }
        }
        if (!updated) lore.add(line);
        meta.setLore(lore);
        item.setItemMeta(meta);
    }

    /** 便携式复刻坤: 复制瞄准的粘液掉落物 (amount 份)。 */
    public static LSTItemAction cloneAimed(int amount) {
        return (player, item) -> {
            Entity target = player.getTargetEntity(6);
            if (target instanceof Item dropped) {
                ItemStack stack = dropped.getItemStack();
                SlimefunItem sfItem = SlimefunItem.getByItem(stack);
                if (sfItem == null) {
                    player.sendMessage("§c仅支持复刻粘液物品!");
                    return false;
                }
                ItemStack give = stack.clone();
                give.setAmount(stack.getMaxStackSize() == 1 ? 1 : Math.min(amount, stack.getMaxStackSize()));
                player.getInventory().addItem(give);
                player.sendMessage("§a已复刻: " + sfItem.getItemName());
                return false;
            }
            player.sendMessage("§c请瞄准掉落物!");
            return false;
        };
    }

    /** 卸甲令: 全部盔甲移入背包。 */
    public static final LSTItemAction UNARM = (player, item) -> {
        ItemStack[] armor = player.getInventory().getArmorContents();
        List<ItemStack> remain = new ArrayList<>();
        for (ItemStack piece : armor) {
            if (piece != null && piece.getType() != Material.AIR) {
                remain.add(piece);
            }
        }
        player.getInventory().setArmorContents(new ItemStack[4]);
        for (ItemStack piece : remain) {
            player.getInventory().addItem(piece).values()
                    .forEach(left -> player.getWorld().dropItemNaturally(player.getLocation(), left));
        }
        player.sendMessage("§a已卸下全部盔甲");
        return false;
    };

    /** 呼风/唤雨/唤雷符: 天气控制 (5 分钟, 每种符独立 3 分钟冷却, 成功后消耗 1 张)。 */
    public static LSTItemAction weather(String mode) {
        return (player, item) -> {
            if (LSTEffectLib.onCooldownNotify(player, "weather_" + mode, 180000)) {
                return false;
            }
            World world = player.getWorld();
            boolean already;
            switch (mode) {
                case "clear" -> already = !world.hasStorm() && !world.isThundering();
                case "rain" -> already = world.hasStorm() && !world.isThundering();
                default -> already = world.isThundering();
            }
            if (already) {
                player.sendMessage("§7天气已经是这个样子了...");
                return false;
            }
            switch (mode) {
                case "clear" -> {
                    world.setStorm(false);
                    world.setThundering(false);
                }
                case "rain" -> {
                    world.setStorm(true);
                    world.setThundering(false);
                }
                default -> {
                    world.setStorm(true);
                    world.setThundering(true);
                }
            }
            world.setWeatherDuration(6000); // 5 分钟
            player.sendMessage("§a天气已改变, 持续 5 分钟");
            item.setAmount(item.getAmount() - 1); // 消耗 1 张符
            return true;
        };
    }

    /** 幸运四叶草: 随机获取一个原版物品 (排除方块指令类/占位类), 掉落到地上, 消耗 1 个。 */
    private static final java.util.Set<Material> CLOVER_BLACKLIST = java.util.EnumSet.noneOf(Material.class);
    private static volatile List<Material> CLOVER_ITEMS;

    static {
        for (String n : new String[]{"AIR", "CAVE_AIR", "VOID_AIR", "COMMAND_BLOCK", "CHAIN_COMMAND_BLOCK",
                "REPEATING_COMMAND_BLOCK", "STRUCTURE_BLOCK", "STRUCTURE_VOID", "JIGSAW", "BARRIER", "LIGHT",
                "SPAWNER", "TRIAL_SPAWNER", "END_PORTAL_FRAME", "DEBUG_STICK", "KNOWLEDGE_BOOK",
                "COMMAND_BLOCK_MINECART"}) {
            Material m = Material.matchMaterial(n);
            if (m != null) CLOVER_BLACKLIST.add(m);
        }
    }

    private static List<Material> cloverItems() {
        List<Material> cache = CLOVER_ITEMS;
        if (cache != null) return cache;
        List<Material> list = new ArrayList<>();
        for (Material m : Material.values()) {
            if (m.isLegacy() || !m.isItem() || CLOVER_BLACKLIST.contains(m)) continue;
            list.add(m);
        }
        CLOVER_ITEMS = list;
        return list;
    }

    public static final LSTItemAction CLOVER = (player, item) -> {
        if (LSTEffectLib.onCooldownNotify(player, "clover", 500)) return false;
        List<Material> pool = cloverItems();
        if (pool.isEmpty()) return false;
        Material pick = pool.get(ThreadLocalRandom.current().nextInt(pool.size()));
        player.getWorld().dropItemNaturally(player.getLocation(), new ItemStack(pick));
        player.sendMessage("§a四叶草为你带来了: §f" + pick.name());
        item.setAmount(item.getAmount() - 1); // 消耗 1 个
        return true;
    };

    /** 巨人刷怪蛋 (消耗 1 个)。 */
    public static final LSTItemAction GIANT_EGG = (player, item) -> {
        Block target = player.getTargetBlockExact(20);
        Location spawn = target != null ? target.getLocation().add(0.5, 1, 0.5) : player.getLocation();
        Giant giant = (Giant) player.getWorld().spawnEntity(spawn, EntityType.GIANT);
        giant.setCustomName("§c巨人");
        giant.setCustomNameVisible(true);
        LSTEffectLib.sound(spawn, Sound.ENTITY_ZOMBIE_AMBIENT, 1f, 0.5f);
        item.setAmount(item.getAmount() - 1);
        return true;
    };

    /**
     * 经验作弊器: 蹲下右键在聊天框设置"每次提升的等级数量"(1-5000, 支持 k/m), 右键按该数量提升玩家等级。
     * 首次使用绑定到该玩家, 他人无法使用 (对应 RSC 道具/经验作弊器)。
     */
    public static final LSTItemAction XP_CHEAT = (player, item) -> {
        String bound = LSTPdc.get(item, "bind_uuid");
        if (bound == null || bound.isEmpty()) {
            LSTPdc.set(item, "bind_uuid", player.getUniqueId().toString());
            setLoreLine(item, "§7绑定玩家: §e", player.getName());
            player.sendMessage("§a✅ 经验作弊器已绑定至玩家 §f" + player.getName());
            player.sendMessage("§7此物品仅限你本人使用");
        } else if (!bound.equals(player.getUniqueId().toString())) {
            player.sendMessage("§c❌ 此经验作弊器已绑定给其他玩家!");
            return false;
        }

        if (player.isSneaking()) {
            if (LSTChatInput.isWaiting(player)) {
                player.sendMessage("§c⚠️ 你已经在输入状态中");
                return false;
            }
            Integer current = LSTPdc.getInt(item, "xp_boost");
            if (current != null && current > 0) {
                player.sendMessage("§6当前每次提升: §b" + current + " 级");
            }
            player.sendMessage("§6请输入每次要提升的等级数量:");
            player.sendMessage("§7支持 1-5000, 可用 k/m 后缀; 输入 §ccancel §7取消");
            LSTChatInput.await(player, input -> {
                input = input.trim();
                if (input.equalsIgnoreCase("cancel")) {
                    player.sendMessage("§a✅ 已取消操作");
                    return;
                }
                Integer num = parseAmount(input);
                if (num == null || num <= 0) {
                    player.sendMessage("§c❌ 请输入有效的正整数!");
                    return;
                }
                if (num > 5000) {
                    player.sendMessage("§c❌ 设置的等级过高! 最大 5000 级");
                    return;
                }
                ItemStack hand = player.getInventory().getItemInMainHand();
                if (hand == null || hand.getType().isAir()) {
                    player.sendMessage("§c❌ 主手工具已空");
                    return;
                }
                LSTPdc.setInt(hand, "xp_boost", num);
                setLoreLine(hand, "§7每次提升: §6", num + " 级");
                player.sendMessage("§a✅ 每次提升等级已设置为: §b" + num + " 级");
                player.sendMessage("§7请使用普通右键提升等级");
            });
            return false;
        }

        if (LSTEffectLib.onCooldownNotify(player, "xp_cheat", 3000)) return false;
        Integer boost = LSTPdc.getInt(item, "xp_boost");
        if (boost == null || boost <= 0) {
            player.sendMessage("§c❌ 请先蹲下右键设置要提升的等级数量");
            player.sendMessage("§7例如输入: 20 (表示每次右键增加 20 级)");
            return false;
        }
        long newLevel = (long) player.getLevel() + boost;
        if (newLevel > Integer.MAX_VALUE) {
            player.sendMessage("§c❌ 提升后的等级超过游戏限制!");
            return false;
        }
        int old = player.getLevel();
        player.setLevel((int) newLevel);
        player.sendMessage("§a✅ 等级提升成功! §7" + old + " §f→ §b" + newLevel + " §7(+" + boost + ")");
        LSTEffectLib.sound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1f, 1f);
        return false;
    };

    /** 经验存储器: 潜行右键存 1 级, 右键取 1 级。 */
    public static final LSTItemAction XP_STORE = (player, item) -> {
        Integer stored = LSTPdc.getInt(item, "xp_stored");
        if (stored == null) stored = 0;
        if (player.isSneaking()) {
            if (player.getLevel() >= 1) {
                player.giveExpLevels(-1);
                LSTPdc.setInt(item, "xp_stored", stored + 1);
                player.sendMessage("§a已存入 1 级 (当前存储: " + (stored + 1) + ")");
            } else {
                player.sendMessage("§c等级不足!");
            }
        } else {
            if (stored >= 1) {
                player.giveExpLevels(1);
                LSTPdc.setInt(item, "xp_stored", stored - 1);
                player.sendMessage("§a已取出 1 级 (当前存储: " + (stored - 1) + ")");
            } else {
                player.sendMessage("§c存储器是空的! 潜行右键存入等级");
            }
        }
        return false;
    };

    /** 命运之轮: 随机粘液注册物品。 */
    public static final LSTItemAction WHEEL = (player, item) -> {
        if (LSTEffectLib.onCooldownNotify(player, "wheel", 1500)) return false;
        List<SlimefunItem> all = new ArrayList<>(Slimefun.getRegistry().getAllSlimefunItems());
        all.removeIf(sf -> sf.getItem() == null || sf.isDisabled() || sf.isHidden());
        if (all.isEmpty()) return false;
        SlimefunItem pick = all.get(ThreadLocalRandom.current().nextInt(all.size()));
        player.getWorld().dropItemNaturally(player.getLocation(), pick.getItem().clone());
        player.sendMessage("§d命运之轮指向了: " + pick.getItemName());
        return true;
    };

    /** 粘液全解: 解锁全部研究 (消耗 1 本)。 */
    public static final LSTItemAction SF_ALL = (player, item) -> {
        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "sf research " + player.getName() + " all");
        player.sendMessage("§a全部研究已解锁!");
        item.setAmount(item.getAmount() - 1);
        return true;
    };

    /** 诅咒消除令。 */
    public static final LSTItemAction CURSE = (player, item) -> {
        int cleared = 0;
        List<ItemStack> items = new ArrayList<>();
        items.addAll(List.of(player.getInventory().getArmorContents()));
        items.addAll(List.of(player.getInventory().getContents()));
        for (ItemStack stack : items) {
            if (stack == null || !stack.hasItemMeta()) continue;
            ItemMeta meta = stack.getItemMeta();
            boolean changed = false;
            for (Enchantment enchant : List.copyOf(meta.getEnchants().keySet())) {
                String name = enchant.getKey().getKey();
                if (name.contains("binding_curse") || name.contains("vanishing_curse")) {
                    meta.removeEnchant(enchant);
                    changed = true;
                    cleared++;
                }
            }
            if (changed) {
                stack.setItemMeta(meta);
            }
        }
        player.sendMessage("§a已消除 " + cleared + " 个诅咒附魔");
        return true;
    };

    /** 智能充电器: 从自身电荷向背包第一件未充满的充能物品转移电力。 */
    public static final LSTItemAction CHARGER = (player, item) -> {
        float charge = io.Yomicer.LengShangTech.utils.LSTCharge.getCharge(item);
        if (charge <= 0) {
            player.sendMessage("§c充电器已没电!");
            return false;
        }
        for (ItemStack stack : player.getInventory().getContents()) {
            if (stack == null || stack.getType() == Material.AIR) continue;
            SlimefunItem sfItem = SlimefunItem.getByItem(stack);
            if (sfItem instanceof io.github.thebusybiscuit.slimefun4.core.attributes.Rechargeable rechargeable) {
                float current = rechargeable.getItemCharge(stack);
                float max = rechargeable.getMaxItemCharge(stack);
                if (current < max) {
                    float need = Math.min(charge, max - current);
                    rechargeable.setItemCharge(stack, current + need);
                    io.Yomicer.LengShangTech.utils.LSTCharge.setCharge(item, charge - need);
                    player.sendMessage("§a已为 " + sfItem.getItemName() + " 充入 " + (int) need + " J");
                    return false;
                }
            }
        }
        player.sendMessage("§7背包里没有需要充电的物品");
        return false;
    };

    /** 幻穹瞬闪: 前方 5 格瞬移。 */
    public static final LSTItemAction BLINK = (player, item) -> {
        Location dest = player.getLocation().add(player.getLocation().getDirection().setY(0).normalize().multiply(5));
        player.getWorld().spawnParticle(org.bukkit.Particle.PORTAL, player.getLocation(), 30, 0.3, 0.5, 0.3, 0.5);
        player.teleport(dest);
        LSTEffectLib.sound(dest, Sound.ENTITY_ENDERMAN_TELEPORT, 0.8f, 1.2f);
        return false;
    };

    /** 全息文字清除器: 两步确认 —— 首次右键锁定最近全息文字, 再次右键确认清除。 */
    private static final java.util.Map<java.util.UUID, java.util.UUID> HOLO_MARK = new java.util.concurrent.ConcurrentHashMap<>();

    private static Entity findNearestHologram(Player player) {
        Entity nearest = null;
        double best = 3 * 3;
        for (Entity entity : player.getNearbyEntities(3, 3, 3)) {
            boolean holo = entity instanceof org.bukkit.entity.TextDisplay
                    || (entity instanceof org.bukkit.entity.ArmorStand stand && !stand.isVisible() && !stand.hasGravity());
            if (!holo) continue;
            double dist = entity.getLocation().distanceSquared(player.getLocation());
            if (dist < best) {
                best = dist;
                nearest = entity;
            }
        }
        return nearest;
    }

    public static final LSTItemAction HOLO_CLEAR = (player, item) -> {
        Entity nearest = findNearestHologram(player);
        if (nearest == null) {
            HOLO_MARK.remove(player.getUniqueId());
            player.sendMessage("§c附近 3 格内没有全息文字!");
            return false;
        }
        java.util.UUID marked = HOLO_MARK.get(player.getUniqueId());
        if (marked != null && marked.equals(nearest.getUniqueId())) {
            nearest.remove();
            HOLO_MARK.remove(player.getUniqueId());
            player.sendMessage("§a已清除全息文字");
            return true;
        }
        HOLO_MARK.put(player.getUniqueId(), nearest.getUniqueId());
        player.sendMessage("§e已锁定最近的全息文字, §6再次右键确认清除");
        return false;
    };

    /** 附魔提取器: 取出副手物品的第一个附魔。 */
    public static final LSTItemAction ENCH_EXTRACT = (player, item) -> {
        ItemStack off = player.getInventory().getItemInOffHand();
        if (off.getType() == Material.AIR || !off.hasItemMeta()) {
            player.sendMessage("§c请把要提取的物品放在副手!");
            return false;
        }
        ItemMeta meta = off.getItemMeta();
        for (Enchantment enchant : meta.getEnchants().keySet()) {
            int level = meta.getEnchants().get(enchant);
            meta.removeEnchant(enchant);
            off.setItemMeta(meta);
            ItemStack book = new ItemStack(Material.ENCHANTED_BOOK);
            EnchantmentStorageMeta bookMeta = (EnchantmentStorageMeta) book.getItemMeta();
            bookMeta.addStoredEnchant(enchant, level, true);
            book.setItemMeta(bookMeta);
            player.getInventory().addItem(book);
            player.sendMessage("§a提取成功: " + enchant.getKey().getKey() + " " + level);
            return true;
        }
        player.sendMessage("§c该物品没有附魔!");
        return false;
    };

    /** 附魔提取器 (副手为已存附魔书时的直接提取)。 */
    public static final LSTItemAction ENCH_EXTRACT_BOOK = ENCH_EXTRACT;

    /** 巨人召唤别名。 */
    public static final LSTItemAction SPAWN_GIANT = GIANT_EGG;

    /** 屏蔽未实现的占位效果 (依赖其它附属的脚本)。 */
    public static final LSTItemAction UNSUPPORTED = (player, item) -> {
        player.sendMessage(ChatColor.GRAY + "该功能需要对应附属支持, 当前版本不可用。");
        return false;
    };
}
