package io.Yomicer.LengShangTech.utils;

import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.inventory.ItemStack;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 冷殇科技 saveditem 加载器。
 * RSC 配置包中的 278 个物品以完整 NBT 的 Bukkit YAML 形式保存在 saveditems/ 目录下,
 * 打包为插件资源后由此类在运行时按需读取并缓存。
 * 路径写法与 RSC 一致, 例如 "套装系列/修罗/XLBMSK" (.yml 后缀自动补全)。
 * 版本变体文件名形如 "XXX - 1.21"、"XXX - 1.21.3.4", 由 {@link #savedForVersion} 按服务器版本自动挑选;
 * 变体缺失时静默回退, 全部缺失才告警。
 */
public final class SavedItemLoader {

    private static final Map<String, ItemStack> CACHE = new ConcurrentHashMap<>();
    private static final Set<String> FAILED = ConcurrentHashMap.newKeySet();

    private SavedItemLoader() {
    }

    /** 按路径读取 saveditem (不带 .yml 后缀), 找不到时返回 null 并记录一次警告。 */
    public static ItemStack get(String path) {
        if (path == null || path.isEmpty()) {
            return null;
        }
        return get(path, true);
    }

    private static ItemStack get(String path, boolean warn) {
        ItemStack cached = CACHE.get(path);
        if (cached != null) {
            return cached;
        }
        if (FAILED.contains(path)) {
            return null;
        }
        ItemStack loaded = load(path, warn);
        if (loaded != null) {
            CACHE.put(path, loaded);
        } else {
            FAILED.add(path);
        }
        return loaded;
    }

    /**
     * 按服务器版本挑选 saveditem 变体 (对应 RSC register.conditions 的 version 区间规则):
     * v &lt; 1.21.1 用基础文件; 1.21.1 ~ 1.21.2 用 "- 1.21"; 1.21.3 ~ 1.21.4 用 "- 1.21.3.4"; v &ge; 1.21.5 用 fallback21。
     * 变体文件可能不存在 (静默尝试), 全部缺失时回退基础文件。
     */
    public static ItemStack savedForVersion(String base, String name21, String name2134) {
        if (LSTVersion.atLeast(1, 21, 5)) {
            ItemStack item = get(base + " - " + name21, false);
            if (item != null) return item;
        }
        if (LSTVersion.atLeast(1, 21, 3)) {
            ItemStack item = get(base + " - " + name2134, false);
            if (item != null) return item;
        }
        if (LSTVersion.atLeast(1, 21, 1)) {
            ItemStack item = get(base + " - " + name21, false);
            if (item != null) return item;
        }
        ItemStack baseItem = get(base, false);
        if (baseItem == null) {
            LSTLog.warn("saveditem 全部变体缺失: " + base + " (变体: " + name21 + " / " + name2134 + ")");
        }
        return baseItem;
    }

    private static ItemStack load(String path, boolean warn) {
        String resource = "/saveditems/" + path + ".yml";
        try (InputStream in = SavedItemLoader.class.getResourceAsStream(resource)) {
            if (in == null) {
                if (warn) {
                    LSTLog.warn("saveditem 资源不存在: " + resource);
                }
                return null;
            }
            YamlConfiguration yaml = new YamlConfiguration();
            yaml.load(new InputStreamReader(in, StandardCharsets.UTF_8));
            ItemStack item = yaml.getItemStack("item");
            if (item == null) {
                LSTLog.warn("saveditem 内没有 item 节点: " + resource);
                return null;
            }
            ItemStack clone = item.clone();
            if (clone.getAmount() <= 0) {
                clone.setAmount(1);
            }
            return clone;
        } catch (Throwable t) {
            // 旧版本服务器无法解析高版本 DataVersion 等情况, 记为失败 (调用方都有材质兜底), 保证不崩服
            LSTLog.warn("saveditem 加载失败(" + path + "): " + t.getMessage());
            return null;
        }
    }
}
