package co.uk.shaypunter.vap.listener;

import co.uk.shaypunter.vap.VanishAllPlayers;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public final class PlayerJoinListener implements Listener {

    private final VanishAllPlayers plugin;

    public PlayerJoinListener(VanishAllPlayers plugin) {
        this.plugin = plugin;
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();

        Bukkit.getOnlinePlayers().stream()
                .filter(onlinePlayer -> onlinePlayer != player)
                .peek(onlinePlayer -> player.hidePlayer(plugin, onlinePlayer))
                .forEach(onlinePlayer -> onlinePlayer.hidePlayer(plugin, player));
    }

}