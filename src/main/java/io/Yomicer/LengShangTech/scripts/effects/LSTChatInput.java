package io.Yomicer.LengShangTech.scripts.effects;

import io.Yomicer.LengShangTech.LengShangEvo;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;

/**
 * 聊天输入捕获: 供需要玩家在聊天框输入参数的道具使用 (对应 RSC 的 getChatInput)。
 * 捕获玩家的下一条聊天消息 (不广播), 在主线程回调。玩家退出时清理等待状态。
 */
public final class LSTChatInput implements Listener {

    private static final Map<UUID, Consumer<String>> WAITING = new ConcurrentHashMap<>();

    private LSTChatInput() {
    }

    public static LSTChatInput create() {
        return new LSTChatInput();
    }

    /** 该玩家当前是否正在等待输入。 */
    public static boolean isWaiting(Player player) {
        return WAITING.containsKey(player.getUniqueId());
    }

    /** 登记等待该玩家的下一条聊天输入, 收到后在主线程执行 callback。 */
    public static void await(Player player, Consumer<String> callback) {
        WAITING.put(player.getUniqueId(), callback);
    }

    /** 取消等待。 */
    public static void cancel(Player player) {
        WAITING.remove(player.getUniqueId());
    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void onChat(AsyncPlayerChatEvent event) {
        Consumer<String> callback = WAITING.remove(event.getPlayer().getUniqueId());
        if (callback == null) {
            return;
        }
        event.setCancelled(true);
        String message = event.getMessage();
        Bukkit.getScheduler().runTask(LengShangEvo.getInstance(), () -> {
            try {
                callback.accept(message);
            } catch (Throwable ignored) {
            }
        });
    }

    @EventHandler
    public void onQuit(PlayerQuitEvent event) {
        WAITING.remove(event.getPlayer().getUniqueId());
    }
}
