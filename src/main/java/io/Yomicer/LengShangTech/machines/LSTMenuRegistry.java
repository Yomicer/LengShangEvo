package io.Yomicer.LengShangTech.machines;

import io.Yomicer.LengShangTech.utils.LSTLog;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.utils.ChestMenuUtils;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenuPreset;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.yaml.snakeyaml.LoaderOptions;
import org.yaml.snakeyaml.Yaml;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 冷殇机器菜单布局注册表: 从打包资源 lengshang_menus.yml (由 RSC menus.yml + 各机器配置提取) 加载,
 * 按机器 ID 提供 输入槽 / 输出槽 / 进度条槽与图标 / 装饰物 的还原数据。
 * 各机器类在 setupMenu / getInputSlots / getOutputSlots 里按自身 ID 查询本表, 无记录则退回默认布局。
 */
public final class LSTMenuRegistry {

    /** 一台机器的完整菜单布局。 */
    public static final class Layout {
        public final int[] input;
        public final int[] output;
        public final int progressSlot;      // -1 表示无
        public final ItemStack progressBar;  // null 表示无
        public final Map<Integer, ItemStack> decorations;
        private final java.util.Set<Integer> reserved;

        Layout(int[] input, int[] output, int progressSlot, ItemStack progressBar, Map<Integer, ItemStack> decorations) {
            this.input = input;
            this.output = output;
            this.progressSlot = progressSlot;
            this.progressBar = progressBar;
            this.decorations = decorations;
            java.util.Set<Integer> r = new java.util.HashSet<>();
            for (int s : input) r.add(s);
            for (int s : output) r.add(s);
            this.reserved = r;
        }

        /** 该槽是否为输入/输出功能槽 (装饰不应覆盖)。 */
        public boolean isFunctional(int slot) {
            return reserved.contains(slot);
        }
    }

    private static volatile Map<String, Layout> LAYOUTS;
    private static final Pattern HEX_BRACE = Pattern.compile("\\{#([0-9a-fA-F]{6})}");

    private LSTMenuRegistry() {
    }

    /** 按机器 ID 取布局; 无记录返回 null。 */
    public static Layout get(String id) {
        Map<String, Layout> map = LAYOUTS;
        if (map == null) {
            map = load();
        }
        return map.get(id);
    }

    /**
     * 把布局装饰绘制到菜单预设 (跳过输入/输出功能槽, 避免覆盖真实槽位)。
     * 返回 true 表示确有 RSC 装饰被应用。
     */
    public static boolean applyDecorations(BlockMenuPreset preset, Layout l) {
        if (l == null || l.decorations.isEmpty()) {
            return false;
        }
        for (Map.Entry<Integer, ItemStack> d : l.decorations.entrySet()) {
            if (l.isFunctional(d.getKey())) {
                continue;
            }
            preset.addItem(d.getKey(), d.getValue().clone(), ChestMenuUtils.getEmptyClickHandler());
        }
        return true;
    }

    private static synchronized Map<String, Layout> load() {
        if (LAYOUTS != null) {
            return LAYOUTS;
        }
        Map<String, Layout> map = new java.util.HashMap<>();
        try (InputStream in = LSTMenuRegistry.class.getResourceAsStream("/lengshang_menus.yml")) {
            if (in == null) {
                LSTLog.warn("菜单布局资源缺失: /lengshang_menus.yml");
                LAYOUTS = map;
                return map;
            }
            LoaderOptions opts = new LoaderOptions();
            opts.setCodePointLimit(256 * 1024 * 1024);
            opts.setMaxAliasesForCollections(Integer.MAX_VALUE);
            Yaml yaml = new Yaml(opts);
            Map<String, Object> root = yaml.load(new InputStreamReader(in, StandardCharsets.UTF_8));
            if (root == null) {
                LAYOUTS = map;
                return map;
            }
            // 装饰物按源 Map 身份缓存 (别名共享 → 同一实例, 只构建一次)
            IdentityHashMap<Object, Map<Integer, ItemStack>> decoCache = new IdentityHashMap<>();
            for (Map.Entry<String, Object> e : root.entrySet()) {
                if (!(e.getValue() instanceof Map)) {
                    continue;
                }
                map.put(e.getKey(), toLayout((Map<?, ?>) e.getValue(), decoCache));
            }
            LSTLog.info("菜单布局加载完毕 (" + map.size() + " 台机器)");
        } catch (Throwable t) {
            LSTLog.warn("菜单布局加载失败: " + t.getMessage());
        }
        LAYOUTS = map;
        return map;
    }

    private static Layout toLayout(Map<?, ?> entry, IdentityHashMap<Object, Map<Integer, ItemStack>> decoCache) {
        int[] input = toIntArray(entry.get("in"));
        int[] output = toIntArray(entry.get("out"));
        Object decoObj = entry.get("deco");
        Map<Integer, ItemStack> deco = java.util.Collections.emptyMap();
        int progressSlot = -1;
        ItemStack progressBar = null;
        if (decoObj instanceof Map) {
            Map<Integer, ItemStack> built = decoCache.get(decoObj);
            if (built == null) {
                built = new java.util.HashMap<>();
                for (Map.Entry<?, ?> s : ((Map<?, ?>) decoObj).entrySet()) {
                    int slot = Integer.parseInt(s.getKey().toString());
                    if (!(s.getValue() instanceof Map)) {
                        continue;
                    }
                    built.put(slot, buildItem((Map<?, ?>) s.getValue()));
                }
                decoCache.put(decoObj, built);
            }
            deco = built;
            // 进度条槽与图标从装饰里解析 (prog:true)
            for (Map.Entry<?, ?> s : ((Map<?, ?>) decoObj).entrySet()) {
                if (s.getValue() instanceof Map && Boolean.TRUE.equals(((Map<?, ?>) s.getValue()).get("prog"))) {
                    progressSlot = Integer.parseInt(s.getKey().toString());
                    Object pbi = ((Map<?, ?>) s.getValue()).get("pbi");
                    if (pbi != null) {
                        Material mat = Material.matchMaterial(pbi.toString());
                        if (mat != null) {
                            progressBar = new ItemStack(mat);
                        }
                    }
                    break;
                }
            }
        }
        return new Layout(input, output, progressSlot, progressBar, deco);
    }

    private static ItemStack buildItem(Map<?, ?> d) {
        Material mat = null;
        if (d.get("m") != null) {
            mat = Material.matchMaterial(d.get("m").toString());
        }
        if (mat == null) {
            mat = Material.GRAY_STAINED_GLASS_PANE;
        }
        String name = d.get("n") != null ? color(d.get("n").toString()) : " ";
        List<String> lore = new ArrayList<>();
        if (d.get("l") instanceof List) {
            for (Object line : (List<?>) d.get("l")) {
                lore.add(color(String.valueOf(line)));
            }
        }
        ItemStack item = new CustomItemStack(mat, name, lore.toArray(new String[0]));
        ItemMeta meta = item.getItemMeta();
        if (meta != null) {
            if (d.get("model") != null) {
                try {
                    meta.setCustomModelData(Integer.parseInt(d.get("model").toString()));
                } catch (NumberFormatException ignored) {
                }
            }
            if (Boolean.TRUE.equals(d.get("g"))) {
                meta.addEnchant(Enchantment.DURABILITY, 1, true);
                meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
            }
            item.setItemMeta(meta);
        }
        return item;
    }

    /** RSC 颜色格式转 Bukkit: {#RRGGBB} → &x&R&R&G&G&B&B, 再翻译 & 代码。 */
    private static String color(String s) {
        if (s == null) {
            return " ";
        }
        Matcher m = HEX_BRACE.matcher(s);
        StringBuffer sb = new StringBuffer();
        while (m.find()) {
            StringBuilder rep = new StringBuilder("&x");
            for (char c : m.group(1).toCharArray()) {
                rep.append('&').append(c);
            }
            m.appendReplacement(sb, Matcher.quoteReplacement(rep.toString()));
        }
        m.appendTail(sb);
        return ChatColor.translateAlternateColorCodes('&', sb.toString());
    }

    private static int[] toIntArray(Object o) {
        if (!(o instanceof List)) {
            return new int[0];
        }
        List<?> list = (List<?>) o;
        int[] arr = new int[list.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(list.get(i).toString().trim());
        }
        return arr;
    }
}
