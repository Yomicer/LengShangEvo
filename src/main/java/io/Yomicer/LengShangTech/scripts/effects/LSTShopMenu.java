package io.Yomicer.LengShangTech.scripts.effects;

import io.Yomicer.LengShangTech.LengShangEvo;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import io.Yomicer.LengShangTech.core.MagicExpansionHook;
import org.bukkit.NamespacedKey;
import org.bukkit.persistence.PersistentDataType;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * 冷殇聚宝阁商店 (聚宝阁.js → lengshang_shop.yml + 通用 GUI)。
 * 采用自定义 InventoryHolder 承载界面状态 (当前分类/页码), 不依赖会话表与标题匹配,
 * 因此不会因为"开新界面触发旧界面关闭事件"而丢失状态 —— 这是之前分类点不开的根因。
 */
public final class LSTShopMenu implements Listener {

    public record Price(String currency, int amount) {
    }

    public record ShopItem(String id, boolean vanilla, List<Price> prices) {
    }

    public record Category(String id, String name, Material icon, int slot) {
    }

    /** 界面状态载体: category=null 表示主菜单, 否则为分类页 (带页码)。 */
    public static final class ShopHolder implements InventoryHolder {
        private final String category;
        private final int page;
        private Inventory inventory;

        ShopHolder(String category, int page) {
            this.category = category;
            this.page = page;
        }

        void setInventory(Inventory inventory) {
            this.inventory = inventory;
        }

        @Override
        public Inventory getInventory() {
            return inventory;
        }
    }

    private static final Map<String, List<ShopItem>> ITEMS = new LinkedHashMap<>();
    private static final List<Category> CATEGORIES = new ArrayList<>();
    private static String MAIN_TITLE = "§c§l❀ §e聚§b宝§d阁 §c§l❀";
    private static String BUY_OK = "&a购买成功 ×{count}";
    private static String BUY_FAIL = "&c材料不足!";

    private static final int[] ITEM_SLOTS = {
            10, 11, 12, 13, 14, 15, 16, 19, 20, 21, 22, 23, 24, 25, 28, 29, 30, 31, 32, 33, 34, 37, 38, 39, 40, 41, 42, 43
    };
    private static final int[] BORDER_SLOTS = {
            0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 17, 18, 26, 27, 35, 36, 44, 45, 46, 47, 51, 52, 53
    };
    private static final int BACK_SLOT = 45;
    private static final int PREV_SLOT = 48;
    private static final int NEXT_SLOT = 50;

    public LSTShopMenu() {
    }

    public static void load() {
        MAIN_TITLE = color(io.Yomicer.LengShangTech.utils.LSTLanguage.get("lengshang.shop.title", MAIN_TITLE));
        BUY_OK = io.Yomicer.LengShangTech.utils.LSTLanguage.get("lengshang.shop.buy-success", BUY_OK);
        BUY_FAIL = io.Yomicer.LengShangTech.utils.LSTLanguage.get("lengshang.shop.buy-fail", BUY_FAIL);
        CATEGORIES.clear();
        ITEMS.clear();
        try (InputStream in = LSTShopMenu.class.getResourceAsStream("/lengshang_shop.yml")) {
            if (in == null) {
                return;
            }
            YamlConfiguration yaml = YamlConfiguration.loadConfiguration(new InputStreamReader(in, StandardCharsets.UTF_8));
            for (Map<?, ?> cat : yaml.getMapList("categories")) {
                String id = String.valueOf(cat.get("id"));
                String name = color(String.valueOf(cat.get("name")));
                Material icon = Material.matchMaterial(String.valueOf(cat.get("icon")));
                int slot = Integer.parseInt(String.valueOf(cat.get("slot")));
                CATEGORIES.add(new Category(id, name, icon == null ? Material.CHEST : icon, slot));
                ITEMS.put(id, new ArrayList<>());
            }
            ConfigurationSection items = yaml.getConfigurationSection("items");
            if (items != null) {
                for (String catId : items.getKeys(false)) {
                    List<ShopItem> list = ITEMS.computeIfAbsent(catId, k -> new ArrayList<>());
                    for (Map<?, ?> entry : items.getMapList(catId)) {
                        String id = String.valueOf(entry.get("id"));
                        boolean vanilla = !"slimefun".equals(String.valueOf(entry.get("type")));
                        List<Price> prices = new ArrayList<>();
                        if (entry.get("price") instanceof List<?> priceList) {
                            for (Object p : priceList) {
                                if (p instanceof Map<?, ?> pm) {
                                    prices.add(new Price(String.valueOf(pm.get("id")), Integer.parseInt(String.valueOf(pm.get("amount")))));
                                }
                            }
                        }
                        if (!prices.isEmpty()) {
                            list.add(new ShopItem(id, vanilla, prices));
                        }
                    }
                }
            }
        } catch (Exception e) {
            LengShangEvo.getInstance().getLogger().warning("[冷殇科技] 聚宝阁商店数据加载失败: " + e.getMessage());
        }
    }

    private static String color(String s) {
        return s == null ? "" : ChatColor.translateAlternateColorCodes('&', s.replace('§', '&'));
    }

    private static ItemStack simple(Material material, String name, String... lore) {
        ItemStack item = new ItemStack(material);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(name);
        if (lore.length > 0) {
            meta.setLore(List.of(lore));
        }
        item.setItemMeta(meta);
        return item;
    }

    // ==================== 打开界面 ====================

    /** 配方页中心的"打开聚宝阁"图标标记 (PDC), 供指南点击识别。 */
    private static final NamespacedKey OPEN_ICON_KEY = MagicExpansionHook.key("lst_shop_open_icon");

    /** 生成放入聚宝阁按钮配方中心格的图标: 在指南里点击它即打开聚宝阁。 */
    public static ItemStack openIcon() {
        ItemStack icon = new ItemStack(Material.CHEST);
        ItemMeta meta = icon.getItemMeta();
        meta.setDisplayName(color("&6&l❀ 点击打开聚宝阁 ❀"));
        meta.setLore(List.of(
                color("&7点击此处打开聚宝阁商店"),
                color("&7海量物品明码标价, 一键购买")));
        meta.getPersistentDataContainer().set(OPEN_ICON_KEY, PersistentDataType.BYTE, (byte) 1);
        icon.setItemMeta(meta);
        return icon;
    }

    /** 判断某物品是否为聚宝阁"打开"图标 (指南点击分发用)。 */
    public static boolean isOpenIcon(ItemStack item) {
        if (item == null || !item.hasItemMeta()) {
            return false;
        }
        Byte flag = item.getItemMeta().getPersistentDataContainer().get(OPEN_ICON_KEY, PersistentDataType.BYTE);
        return flag != null && flag == (byte) 1;
    }

    /** 打开主菜单 (指南按钮入口)。 */
    public static void open(Player player) {
        ShopHolder holder = new ShopHolder(null, 0);
        Inventory menu = Bukkit.createInventory(holder, 54, MAIN_TITLE);
        holder.setInventory(menu);

        ItemStack border = simple(Material.PINK_STAINED_GLASS_PANE, " ");
        for (int slot : BORDER_SLOTS) {
            menu.setItem(slot, border);
        }
        menu.setItem(4, simple(Material.PAINTING, color("&c❀ 聚宝阁 ❀"),
                color("&f点击分类查看可购买物品"), color("&e左键×1  右键×16"),
                color("&eShift+左键×64  Shift+右键全买")));
        for (Category category : CATEGORIES) {
            if (category.slot() >= 0 && category.slot() < 54) {
                menu.setItem(category.slot(), simple(category.icon(), category.name(), color("&7点击查看该分类")));
            }
        }
        player.openInventory(menu);
    }

    /** 打开分类页。 */
    private static void openCategory(Player player, String categoryId, int page) {
        List<ShopItem> items = ITEMS.getOrDefault(categoryId, List.of());
        int pages = Math.max(1, (items.size() + ITEM_SLOTS.length - 1) / ITEM_SLOTS.length);
        page = Math.max(0, Math.min(page, pages - 1));

        ShopHolder holder = new ShopHolder(categoryId, page);
        Inventory menu = Bukkit.createInventory(holder, 54,
                color("&c❀ 聚宝阁 · " + categoryId + " ❀ (" + (page + 1) + "/" + pages + ")"));
        holder.setInventory(menu);

        ItemStack border = simple(Material.PINK_STAINED_GLASS_PANE, " ");
        for (int slot : BORDER_SLOTS) {
            menu.setItem(slot, border);
        }
        int from = page * ITEM_SLOTS.length;
        for (int i = 0; i < ITEM_SLOTS.length && from + i < items.size(); i++) {
            menu.setItem(ITEM_SLOTS[i], display(items.get(from + i)));
        }
        if (page > 0) {
            menu.setItem(PREV_SLOT, simple(Material.ARROW, color("&e上一页")));
        }
        if (page < pages - 1) {
            menu.setItem(NEXT_SLOT, simple(Material.ARROW, color("&e下一页")));
        }
        menu.setItem(BACK_SLOT, simple(Material.BARRIER, color("&c返回主菜单")));
        player.openInventory(menu);
    }

    private static ItemStack display(ShopItem shopItem) {
        ItemStack item = shopItem.vanilla()
                ? new ItemStack(Material.matchMaterial(shopItem.id()) == null ? Material.PAPER : Material.matchMaterial(shopItem.id()))
                : java.util.Objects.requireNonNullElse(iconOf(shopItem.id()), new ItemStack(Material.PAPER));
        ItemMeta meta = item.getItemMeta();
        List<String> lore = new ArrayList<>();
        lore.add(color("&f------&a&l点击购买&f------"));
        for (Price price : shopItem.prices()) {
            lore.add(color("&a售价: " + price.amount() + " 个 " + nameOf(price.currency())));
        }
        lore.add(color("&e左键×1 右键×16 Shift+左键×64 Shift+右键全买"));
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }

    private static ItemStack iconOf(String sfId) {
        io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem sfItem = io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem.getById(sfId);
        return sfItem == null ? null : sfItem.getItem().clone();
    }

    private static String nameOf(String id) {
        Material material = Material.matchMaterial(id);
        if (material != null) {
            return io.Yomicer.LengShangTech.machines.LSTDisplayUtil.nameOf(new ItemStack(material));
        }
        io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem sfItem = io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem.getById(id);
        return sfItem == null ? id : sfItem.getItemName();
    }

    // ==================== 交互处理 (状态取自 Holder, 稳如磐石) ====================

    @EventHandler(priority = EventPriority.LOWEST)
    public void onClick(InventoryClickEvent event) {
        if (!(event.getView().getTopInventory().getHolder() instanceof ShopHolder holder)) {
            return;
        }
        if (!(event.getWhoClicked() instanceof Player player)) {
            return;
        }
        // 商店界面内任何点击 (含 shift 搬运/数字键换位) 一律拦截, 物品拿不走
        event.setCancelled(true);
        event.setResult(org.bukkit.event.Event.Result.DENY);

        // 只处理点在商店界面内的点击 (点自己背包直接忽略)
        if (event.getClickedInventory() == null
                || !(event.getClickedInventory().getHolder() instanceof ShopHolder)) {
            return;
        }
        int slot = event.getRawSlot();

        if (holder.category == null) {
            // 主菜单: 找被点分类
            for (Category category : CATEGORIES) {
                if (category.slot() == slot) {
                    Bukkit.getScheduler().runTask(LengShangEvo.getInstance(),
                            () -> openCategory(player, category.id(), 0));
                    return;
                }
            }
            return;
        }

        // 分类页
        if (slot == BACK_SLOT) {
            Bukkit.getScheduler().runTask(LengShangEvo.getInstance(), () -> open(player));
            return;
        }
        if (slot == PREV_SLOT) {
            Bukkit.getScheduler().runTask(LengShangEvo.getInstance(),
                    () -> openCategory(player, holder.category, holder.page - 1));
            return;
        }
        if (slot == NEXT_SLOT) {
            Bukkit.getScheduler().runTask(LengShangEvo.getInstance(),
                    () -> openCategory(player, holder.category, holder.page + 1));
            return;
        }
        // 商品格: 槽位 → 分类内索引
        int itemIndex = -1;
        for (int i = 0; i < ITEM_SLOTS.length; i++) {
            if (ITEM_SLOTS[i] == slot) {
                itemIndex = holder.page * ITEM_SLOTS.length + i;
                break;
            }
        }
        if (itemIndex < 0) {
            return;
        }
        List<ShopItem> items = ITEMS.getOrDefault(holder.category, List.of());
        if (itemIndex >= items.size()) {
            return;
        }
        int amount = switch (event.getClick()) {
            case SHIFT_LEFT -> 64;
            case SHIFT_RIGHT -> Integer.MAX_VALUE;
            case RIGHT -> 16;
            default -> 1;
        };
        buy(player, items.get(itemIndex), amount);
    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void onDrag(InventoryDragEvent event) {
        if (event.getView().getTopInventory().getHolder() instanceof ShopHolder) {
            event.setCancelled(true);
        }
    }

    // ==================== 购买 ====================

    private void buy(Player player, ShopItem shopItem, int maxAmount) {
        int bought = 0;
        while (bought < maxAmount) {
            if (!payOnce(player, shopItem)) {
                break;
            }
            ItemStack give;
            if (shopItem.vanilla()) {
                Material material = Material.matchMaterial(shopItem.id());
                give = new ItemStack(material == null ? Material.PAPER : material, 1);
            } else {
                io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem sfItem =
                        io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem.getById(shopItem.id());
                if (sfItem == null) {
                    break;
                }
                give = sfItem.getItem().clone();
                give.setAmount(1);
            }
            player.getInventory().addItem(give).values()
                    .forEach(rest -> player.getWorld().dropItemNaturally(player.getLocation(), rest));
            bought++;
        }
        if (bought > 0) {
            player.sendMessage(color(BUY_OK.replace("{count}", String.valueOf(bought))));
            player.playSound(player.getLocation(), org.bukkit.Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1f, 1.2f);
        } else {
            player.sendMessage(color(BUY_FAIL));
            player.playSound(player.getLocation(), org.bukkit.Sound.ENTITY_VILLAGER_NO, 1f, 1f);
        }
    }

    private boolean payOnce(Player player, ShopItem shopItem) {
        for (Price price : shopItem.prices()) {
            Material material = Material.matchMaterial(price.currency());
            if (material == null) {
                io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem sfItem =
                        io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem.getById(price.currency());
                ItemStack need = sfItem == null ? null : sfItem.getItem().clone();
                if (need == null) return false;
                need.setAmount(price.amount());
                if (!player.getInventory().containsAtLeast(need, price.amount())) {
                    return false;
                }
                player.getInventory().removeItem(need);
            } else {
                ItemStack need = new ItemStack(material, price.amount());
                if (!player.getInventory().containsAtLeast(need, price.amount())) {
                    return false;
                }
                player.getInventory().removeItem(need);
            }
        }
        return true;
    }
}
