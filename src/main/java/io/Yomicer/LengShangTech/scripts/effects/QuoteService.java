package io.Yomicer.LengShangTech.scripts.effects;

import io.Yomicer.LengShangTech.scripts.LSTItemAction;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.entity.Player;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.nio.charset.StandardCharsets;

/**
 * 语录道具 (EMO文案/伤感语录/舔狗语录/随机一言): 从原脚本的同款 API 异步获取后发到聊天。
 */
public final class QuoteService {

    private QuoteService() {
    }

    public static LSTItemAction of(String apiUrl) {
        return (player, item) -> {
            Bukkit.getScheduler().runTaskAsynchronously(Bukkit.getPluginManager().getPlugin("LengShangEvo"), () -> {
                String quote = fetch(apiUrl);
                Bukkit.getScheduler().runTask(Bukkit.getPluginManager().getPlugin("LengShangEvo"), () -> {
                    player.sendMessage("");
                    player.sendMessage("§d§l══════════════════════════════════════");
                    player.sendMessage("");
                    player.sendMessage("§f" + quote);
                    player.sendMessage("");
                    player.sendMessage("§d§l══════════════════════════════════════");
                    player.playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1f, 1.5f);
                });
            });
            return false;
        };
    }

    private static String fetch(String apiUrl) {
        try {
            URL url = URI.create(apiUrl).toURL();
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestProperty("User-Agent", "Mozilla/5.0 (LengShangTech)");
            conn.setConnectTimeout(10000);
            conn.setReadTimeout(10000);
            int code = conn.getResponseCode();
            if (code != 200) {
                return "§c获取失败 (HTTP " + code + ")";
            }
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream(), StandardCharsets.UTF_8))) {
                StringBuilder sb = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    sb.append(line);
                }
                return sb.toString().trim().replaceAll("[\\u200B\\u200C\\u200D\\uFEFF\\u2060]", "").replace('\u00A0', ' ');
            }
        } catch (Exception e) {
            return "§c获取语录失败: " + e.getMessage();
        }
    }
}
