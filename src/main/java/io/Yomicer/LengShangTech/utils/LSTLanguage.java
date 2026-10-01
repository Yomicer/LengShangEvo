package io.Yomicer.LengShangTech.utils;

import org.bukkit.configuration.file.YamlConfiguration;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/**
 * 冷殇科技语言文件 (resources/language_lengshang.yml)。
 * 键示例: lengshang.shop.title。
 */
public final class LSTLanguage {

    private static YamlConfiguration LANG = new YamlConfiguration();

    private LSTLanguage() {
    }

    public static void load() {
        try (InputStream in = LSTLanguage.class.getResourceAsStream("/language_lengshang.yml")) {
            if (in == null) {
                LSTLog.warn("language_lengshang.yml 资源缺失, 使用默认文案");
                return;
            }
            LANG = YamlConfiguration.loadConfiguration(new InputStreamReader(in, StandardCharsets.UTF_8));
        } catch (Throwable t) {
            LSTLog.warn("language_lengshang.yml 加载失败: " + t.getMessage());
        }
    }

    /** 取带颜色码的文本 (支持 & 与 §)。 */
    public static String get(String key, String def) {
        String value = LANG.getString(key, def);
        return value == null ? def : value.replace('§', '&');
    }

    public static String prefix() {
        return get("lengshang.prefix", "[冷殇科技]");
    }
}
