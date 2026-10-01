package io.Yomicer.LengShangTech.utils;

import io.github.thebusybiscuit.slimefun4.utils.SlimefunUtils;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 头颅材质工具。
 * RSC 配置里有两种头颅写法: skull_hash (64 位纹理哈希) 与 skull_base64 (整段 base64 纹理 JSON)。
 * 统一转换成 SlimefunUtils.getCustomHead 可用的哈希。
 */
public final class LSTHeads {

    /** URL 里 texture/ 之后的纹理 ID (长度不定, Mojang 偶有 62/63 位)。 */
    private static final Pattern TEXTURE_URL = Pattern.compile("texture/([0-9a-zA-Z]+)");
    /** 兜底: 任意 60~64 位十六进制串 (URL 结构异常时用)。 */
    private static final Pattern TEXTURE_HASH = Pattern.compile("([0-9a-fA-F]{60,64})");

    private LSTHeads() {
    }

    /** 64 位纹理哈希直接取头颅。 */
    public static ItemStack byHash(String hash) {
        try {
            return SlimefunUtils.getCustomHead(hash);
        } catch (Throwable t) {
            return new ItemStack(Material.PLAYER_HEAD);
        }
    }

    /** base64 纹理 JSON → 解出哈希后取头颅。 */
    public static ItemStack byBase64(String base64) {
        String hash = hashFromBase64(base64);
        if (hash != null) {
            return byHash(hash);
        }
        return new ItemStack(Material.PLAYER_HEAD);
    }

    public static String hashFromBase64(String base64) {
        try {
            String json = new String(Base64.getDecoder().decode(base64), StandardCharsets.UTF_8);
            // 优先取 URL 中 texture/ 之后的纹理 ID (不限长度): 修复 63 位哈希被 {64} 正则漏掉、
            // 退化为默认史蒂夫头的问题 (幸运方块/花朵/树木等)。
            Matcher url = TEXTURE_URL.matcher(json);
            if (url.find()) {
                return url.group(1);
            }
            Matcher matcher = TEXTURE_HASH.matcher(json);
            if (matcher.find()) {
                return matcher.group(1);
            }
        } catch (Throwable ignored) {
        }
        return null;
    }
}
