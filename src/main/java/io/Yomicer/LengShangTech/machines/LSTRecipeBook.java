package io.Yomicer.LengShangTech.machines;

import io.Yomicer.LengShangTech.LengShangEvo;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.player.PlayerProfile;
import io.github.thebusybiscuit.slimefun4.core.guide.GuideHistory;
import io.github.thebusybiscuit.slimefun4.core.guide.SlimefunGuide;
import io.github.thebusybiscuit.slimefun4.core.guide.SlimefunGuideImplementation;
import io.github.thebusybiscuit.slimefun4.core.guide.SlimefunGuideMode;
import io.github.thebusybiscuit.slimefun4.implementation.Slimefun;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.persistence.PersistentDataType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * 机器配方浏览器: 从机器菜单点击"配方列表"打开, 分页展示全部配方。
 * 每条配方占一个格子 (下界之星), lore 里写全材料与产物; 28 条/页, 支持翻页。
 */
public final class LSTRecipeBook implements Listener {

    /** 一条配方的展示数据。 */
    public record RecipeView(String name, List<ItemStack> inputs, List<ItemStack> outputs, int seconds) {
    }

    private static final class Session {
        final String title;
        final List<RecipeView> views;

        Session(String title, List<RecipeView> views) {
            this.title = title;
            this.views = views;
        }
    }

    private static final Map<UUID, Session> OPEN = new HashMap<>();
    private static final int[] ITEM_SLOTS = {
            10, 11, 12, 13, 14, 15, 16,
            19, 20, 21, 22, 23, 24, 25,
            28, 29, 30, 31, 32, 33, 34,
            37, 38, 39, 40, 41, 42, 43
    };
    private static final int PAGE_SIZE = ITEM_SLOTS.length;
    private static final String TITLE_MARK = "· 配方列表 ·";

    public LSTRecipeBook() {
    }

    /** 打开配方浏览器。 */
    public static void open(Player player, String machineName, List<RecipeView> views) {
        Session session = new Session(ChatColor.stripColor(machineName) + " " + TITLE_MARK, views);
        OPEN.put(player.getUniqueId(), session);
        show(player, 0);
    }

    private static void show(Player player, int page) {
        Session session = OPEN.get(player.getUniqueId());
        if (session == null) {
            return;
        }
        int pages = Math.max(1, (session.views.size() + PAGE_SIZE - 1) / PAGE_SIZE);
        page = Math.max(0, Math.min(page, pages - 1));
        Inventory menu = Bukkit.createInventory(null, 54,
                ChatColor.translateAlternateColorCodes('&', "&b" + session.title + " &e(" + (page + 1) + "/" + pages + ")"));

        ItemStack border = named(Material.LIGHT_BLUE_STAINED_GLASS_PANE, " ");
        for (int slot : new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 17, 18, 26, 27, 35, 36, 44, 45, 46, 47, 51, 52, 53 }) {
            menu.setItem(slot, border);
        }

        int from = page * PAGE_SIZE;
        for (int i = 0; i < PAGE_SIZE && from + i < session.views.size(); i++) {
            menu.setItem(ITEM_SLOTS[i], display(session.views.get(from + i)));
        }
        if (page > 0) {
            menu.setItem(48, named(Material.ARROW, "§e上一页"));
        }
        if (page < pages - 1) {
            menu.setItem(50, named(Material.ARROW, "§e下一页"));
        }
        menu.setItem(49, named(Material.BARRIER, "§c关闭"));
        player.openInventory(menu);
    }

    private static ItemStack display(RecipeView view) {
        List<String> lore = new ArrayList<>();
        lore.add("§6◆ " + view.name() + " §7(§e" + view.seconds() + "秒§7)");
        lore.add("");
        lore.add("§b§l材料:");
        if (view.inputs().isEmpty()) {
            lore.add("§7· 无 (自动产出)");
        }
        for (ItemStack input : view.inputs()) {
            lore.add("§f· " + LSTDisplayUtil.nameOf(input) + " §e×" + input.getAmount());
        }
        lore.add("");
        lore.add("§a§l产物:");
        for (ItemStack output : view.outputs()) {
            lore.add("§f· " + LSTDisplayUtil.nameOf(output) + " §e×" + output.getAmount());
        }
        ItemStack star = new ItemStack(Material.NETHER_STAR);
        ItemMeta meta = star.getItemMeta();
        meta.setDisplayName("§b" + view.name());
        meta.setLore(lore);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        star.setItemMeta(meta);
        return star;
    }

    private static ItemStack named(Material material, String name) {
        ItemStack item = new ItemStack(material);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(name);
        item.setItemMeta(meta);
        return item;
    }

    private static ItemStack named(Material material, String name, List<String> lore) {
        ItemStack item = new ItemStack(material);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(name);
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }

    @EventHandler
    public void onClick(InventoryClickEvent event) {
        if (!(event.getWhoClicked() instanceof Player player)) {
            return;
        }
        Session session = OPEN.get(player.getUniqueId());
        if (session == null || !event.getView().getTitle().contains(TITLE_MARK)) {
            return;
        }
        event.setCancelled(true);
        if (event.getClickedInventory() != event.getView().getTopInventory()) {
            return;
        }
        int slot = event.getSlot();
        Integer page = PAGE_STATE.get(player.getUniqueId());
        int current = page == null ? 0 : page;
        if (slot == 49) {
            OPEN.remove(player.getUniqueId());
            PAGE_STATE.remove(player.getUniqueId());
            player.closeInventory();
        } else if (slot == 48) {
            PAGE_STATE.put(player.getUniqueId(), Math.max(0, current - 1));
            show(player, current - 1);
        } else if (slot == 50) {
            PAGE_STATE.put(player.getUniqueId(), current + 1);
            show(player, current + 1);
        }
    }

    private static final Map<UUID, Integer> PAGE_STATE = new HashMap<>();

    // ==================== 配方明细界面 (点击折叠物品展开, 摆出全部输入/产物 + 返回键) ====================

    private static final int[] DETAIL_INPUT_SLOTS = { 10, 11, 12, 13, 14, 15, 16, 19, 20, 21, 22, 23, 24, 25 };
    private static final int[] DETAIL_OUTPUT_SLOTS = { 28, 29, 30, 31, 32, 33, 34, 37, 38, 39, 40, 41, 42, 43 };
    private static final int DETAIL_BACK_SLOT = 49;
    private static final int DETAIL_PREV_SLOT = 48;
    private static final int DETAIL_NEXT_SLOT = 50;
    /** 每页每个区 (输入/输出) 最多摆多少物品。 */
    private static final int DETAIL_ZONE_SIZE = 14;

    /** 明细界面的自定义 Holder: 承载来源明细、当前页码、打开前指南历史深度, 以及返回/翻页按钮所在槽位。 */
    private static final class DetailHolder implements InventoryHolder {
        private final LSTDisplayUtil.RecipeDetail detail;
        private final int page;
        private final int histSize;
        private final int returnSlot;
        private final int prevSlot;
        private final int nextSlot;
        private Inventory inventory;

        DetailHolder(LSTDisplayUtil.RecipeDetail detail, int page, int histSize,
                     int returnSlot, int prevSlot, int nextSlot) {
            this.detail = detail;
            this.page = page;
            this.histSize = histSize;
            this.returnSlot = returnSlot;
            this.prevSlot = prevSlot;
            this.nextSlot = nextSlot;
        }

        @Override
        public Inventory getInventory() {
            return inventory;
        }
    }

    /** 指南里点击折叠的输入/输出物品 → 延迟一 tick 打开配方明细界面 (同 tick openInventory 会被吞)。 */
    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void onCompressedClick(InventoryClickEvent event) {
        if (!(event.getWhoClicked() instanceof Player player)) {
            return;
        }
        ItemStack clicked = event.getCurrentItem();
        if (clicked == null || !clicked.hasItemMeta()) {
            return;
        }
        String key = clicked.getItemMeta().getPersistentDataContainer()
                .get(LSTDisplayUtil.getDetailKey(), PersistentDataType.STRING);
        if (key == null) {
            return;
        }
        LSTDisplayUtil.RecipeDetail detail = LSTDisplayUtil.getRecipeDetail(key);
        if (detail == null) {
            return;
        }
        event.setCancelled(true);
        // 记录打开明细前的指南历史深度: 指南自身在点击折叠物品时可能压入一条多余记录,
        // 返回时据此回退, 避免"返回需点两次"。本监听器优先级 LOWEST, 早于指南处理, 故此时尚未压入。
        int histSize = PlayerProfile.find(player).map(p -> p.getGuideHistory().size()).orElse(-1);
        Bukkit.getScheduler().runTask(LengShangEvo.getInstance(), () -> openDetail(player, detail, 0, histSize));
    }

    /**
     * 打开配方明细界面: 优先按来源机器的真实菜单布局摆放 (输入进输入槽、产物进输出槽);
     * 若无该机器布局或物品数超过槽位, 则退回通用的输入/输出分区分页视图。
     */
    private static void openDetail(Player player, LSTDisplayUtil.RecipeDetail detail, int page, int histSize) {
        LSTMenuRegistry.Layout layout = detail.getSourceId() == null ? null
                : LSTMenuRegistry.get(detail.getSourceId());
        List<ItemStack> inputs = detail.getInputs();
        List<ItemStack> outputs = detail.getOutputs();
        boolean machineMode = layout != null
                && (layout.input.length > 0 || layout.output.length > 0)
                && inputs.size() <= layout.input.length
                && outputs.size() <= layout.output.length;
        if (machineMode) {
            openMachineDetail(player, detail, layout, histSize);
        } else {
            openZoneDetail(player, detail, page, histSize);
        }
    }

    /** 按机器真实菜单布局摆放配方: 装饰照搬, 输入物品依次进输入槽, 产物依次进输出槽, 叠加一个返回键。 */
    private static void openMachineDetail(Player player, LSTDisplayUtil.RecipeDetail detail,
                                          LSTMenuRegistry.Layout layout, int histSize) {
        int returnSlot = pickReturnSlot(layout);
        DetailHolder holder = new DetailHolder(detail, 0, histSize, returnSlot, -1, -1);
        String title = "§b配方明细";
        SlimefunItem src = detail.getSourceId() == null ? null : SlimefunItem.getById(detail.getSourceId());
        if (src != null) {
            title = ChatColor.stripColor(src.getItemName()) + " §7· 配方";
        }
        Inventory menu = Bukkit.createInventory(holder, 54, ChatColor.translateAlternateColorCodes('&', title));
        holder.inventory = menu;

        // 1. 照搬机器装饰
        for (Map.Entry<Integer, ItemStack> d : layout.decorations.entrySet()) {
            if (d.getKey() >= 0 && d.getKey() < 54) {
                menu.setItem(d.getKey(), d.getValue().clone());
            }
        }
        // 2. 输入物品依次放进输入槽, 产物依次放进输出槽
        List<ItemStack> inputs = detail.getInputs();
        List<ItemStack> outputs = detail.getOutputs();
        for (int i = 0; i < inputs.size() && i < layout.input.length; i++) {
            menu.setItem(layout.input[i], detailDisplay(inputs.get(i)));
        }
        for (int i = 0; i < outputs.size() && i < layout.output.length; i++) {
            menu.setItem(layout.output[i], detailDisplay(outputs.get(i)));
        }
        // 3. 返回键 (叠加在一个装饰槽上, 不占用输入/输出槽)
        menu.setItem(returnSlot, named(Material.BARRIER, "§c« 返回"));
        player.openInventory(menu);
    }

    /** 选返回键槽位: 优先底行的装饰槽, 其次进度条槽, 再次任意装饰槽; 都不满足退回 53。 */
    private static int pickReturnSlot(LSTMenuRegistry.Layout layout) {
        Integer bottom = null;
        Integer any = null;
        for (Integer slot : layout.decorations.keySet()) {
            if (slot < 0 || slot > 53) {
                continue;
            }
            if (any == null) {
                any = slot;
            }
            if (slot >= 45 && (bottom == null || slot > bottom)) {
                bottom = slot; // 底行靠右者优先
            }
        }
        if (bottom != null) {
            return bottom;
        }
        if (layout.progressSlot >= 0) {
            return layout.progressSlot;
        }
        return any != null ? any : 53;
    }

    /** 通用分区视图 (无机器布局或物品过多时): 上半区输入、下半区产物, 每区 14 格分页。 */
    private static void openZoneDetail(Player player, LSTDisplayUtil.RecipeDetail detail, int page, int histSize) {
        int inputPages = pageCount(detail.getInputs().size());
        int outputPages = pageCount(detail.getOutputs().size());
        int pages = Math.max(1, Math.max(inputPages, outputPages));
        page = Math.max(0, Math.min(page, pages - 1));

        DetailHolder holder = new DetailHolder(detail, page, histSize,
                DETAIL_BACK_SLOT, DETAIL_PREV_SLOT, DETAIL_NEXT_SLOT);
        Inventory menu = Bukkit.createInventory(holder, 54,
                ChatColor.translateAlternateColorCodes('&', "&b配方明细 &e(" + (page + 1) + "/" + pages + ")"));
        holder.inventory = menu;

        // 中立色边框 (顶/底行), 输入区用蓝色特色边、输出区用橙色特色边
        ItemStack neutral = named(Material.BLACK_STAINED_GLASS_PANE, " ");
        for (int i = 0; i < 54; i++) {
            menu.setItem(i, neutral);
        }
        ItemStack inputEdge = named(Material.BLUE_STAINED_GLASS_PANE, " ");
        for (int slot : new int[] { 17, 26 }) {
            menu.setItem(slot, inputEdge);
        }
        ItemStack outputEdge = named(Material.ORANGE_STAINED_GLASS_PANE, " ");
        for (int slot : new int[] { 35, 44 }) {
            menu.setItem(slot, outputEdge);
        }
        menu.setItem(4, named(Material.KNOWLEDGE_BOOK, "§b配方明细",
                List.of("§7第 §e" + (page + 1) + " §7/ §e" + pages + " §7页")));
        int inCount = detail.getInputs().size();
        int outCount = detail.getOutputs().size();
        ItemStack inputLabel = named(Material.BLUE_STAINED_GLASS_PANE,
                "§9§l输入材料 §7(" + inCount + " 种)", zoneLore(inCount, page, inputPages));
        menu.setItem(9, inputLabel);
        menu.setItem(18, inputLabel);
        ItemStack outputLabel = named(Material.ORANGE_STAINED_GLASS_PANE,
                "§6§l输出产物 §7(" + outCount + " 种)", zoneLore(outCount, page, outputPages));
        menu.setItem(27, outputLabel);
        menu.setItem(36, outputLabel);

        placeDetailItems(menu, DETAIL_INPUT_SLOTS, detail.getInputs(), page);
        placeDetailItems(menu, DETAIL_OUTPUT_SLOTS, detail.getOutputs(), page);

        if (page > 0) {
            menu.setItem(DETAIL_PREV_SLOT, named(Material.ARROW, "§e« 上一页"));
        }
        if (page < pages - 1) {
            menu.setItem(DETAIL_NEXT_SLOT, named(Material.ARROW, "§e下一页 »"));
        }
        menu.setItem(DETAIL_BACK_SLOT, named(Material.BARRIER, "§c« 返回"));
        player.openInventory(menu);
    }

    /** 某一区 (输入/输出) 在当前页的显示范围提示; 一页放不下时提示翻页。 */
    private static List<String> zoneLore(int total, int page, int zonePages) {
        List<String> lore = new ArrayList<>();
        if (total <= DETAIL_ZONE_SIZE) {
            return lore;
        }
        int from = page * DETAIL_ZONE_SIZE;
        int to = Math.min(total, from + DETAIL_ZONE_SIZE);
        if (from >= total) {
            lore.add("§8本页无 (共 " + zonePages + " 页)");
            return lore;
        }
        lore.add("§7本页显示第 §e" + (from + 1) + "-" + to + " §7项 §8(共 " + zonePages + " 页)");
        if (page < zonePages - 1) {
            lore.add("§6▶ 还有 " + (total - to) + " 项, 点下一页查看");
        }
        return lore;
    }

    private static int pageCount(int size) {
        return (size + DETAIL_ZONE_SIZE - 1) / DETAIL_ZONE_SIZE;
    }

    private static void placeDetailItems(Inventory menu, int[] slots, List<ItemStack> items, int page) {
        int from = page * DETAIL_ZONE_SIZE;
        for (int i = 0; i < slots.length; i++) {
            int idx = from + i;
            if (idx < items.size()) {
                menu.setItem(slots[i], detailDisplay(items.get(idx)));
            }
        }
    }

    /** 明细里的单个物品: 保留原样, 数量夹到 1..64 显示, lore 末尾标注实际需求/产出数量与概率。 */
    private static ItemStack detailDisplay(ItemStack item) {
        ItemStack display = item.clone();
        display.setAmount(Math.min(64, Math.max(1, item.getAmount())));
        ItemMeta meta = display.getItemMeta();
        List<String> lore = meta.hasLore() ? new ArrayList<>(meta.getLore()) : new ArrayList<>();
        lore.add("");
        lore.add("§7数量: §e×" + item.getAmount());
        Double chance = LSTDisplayUtil.getChancePercent(item);
        if (chance != null) {
            lore.add("§7出现概率: §e" + LSTDisplayUtil.formatPercent(chance) + "%");
        }
        meta.setLore(lore);
        display.setItemMeta(meta);
        return display;
    }

    /** 明细界面内点击: 全部取消 (防取走展示物品); 翻页 / 返回。 */
    @EventHandler
    public void onDetailInventoryClick(InventoryClickEvent event) {
        Inventory top = event.getView().getTopInventory();
        if (!(top.getHolder() instanceof DetailHolder holder)) {
            return;
        }
        event.setCancelled(true);
        if (event.getClickedInventory() != top) {
            return;
        }
        if (!(event.getWhoClicked() instanceof Player player)) {
            return;
        }
        int slot = event.getSlot();
        LSTDisplayUtil.RecipeDetail detail = holder.detail;
        if (slot == holder.returnSlot) {
            Bukkit.getScheduler().runTask(LengShangEvo.getInstance(), () -> backToGuide(player, detail, holder.histSize));
        } else if (slot == holder.prevSlot) {
            Bukkit.getScheduler().runTask(LengShangEvo.getInstance(), () -> openDetail(player, detail, holder.page - 1, holder.histSize));
        } else if (slot == holder.nextSlot) {
            Bukkit.getScheduler().runTask(LengShangEvo.getInstance(), () -> openDetail(player, detail, holder.page + 1, holder.histSize));
        }
    }

    /** 返回键: 回退指南在点开明细时多压入的记录, 再重新展示来源机器的配方页 (使随后的指南"返回"一次即可回到组别)。 */
    private static void backToGuide(Player player, LSTDisplayUtil.RecipeDetail detail, int histSize) {
        SlimefunItem src = detail.getSourceId() == null ? null : SlimefunItem.getById(detail.getSourceId());
        PlayerProfile.find(player).ifPresentOrElse(profile -> {
            GuideHistory history = profile.getGuideHistory();
            SlimefunGuideImplementation impl = Slimefun.getRegistry().getSlimefunGuide(SlimefunGuideMode.SURVIVAL_MODE);
            // 回退到打开明细前的历史深度 (清掉指南点击折叠物品时压入的多余记录)
            if (histSize >= 0 && impl != null) {
                int guard = 0;
                while (history.size() > histSize && guard++ < 16) {
                    history.goBack(impl);
                }
            }
            if (src != null) {
                SlimefunGuide.displayItem(profile, src, false);
            } else {
                player.closeInventory();
            }
        }, player::closeInventory);
    }
}

