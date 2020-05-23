package co.uk.shaypunter.vap.events;

import co.uk.shaypunter.vap.VanishAllPlayers;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class onJoin implements Listener {

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onPlayerJoin(PlayerJoinEvent e) {
        Bukkit.getOnlinePlayers().forEach(player -> e.getPlayer().hidePlayer(VanishAllPlayers.getInstance(), player));

        Bukkit.getOnlinePlayers().forEach(player -> player.hidePlayer(VanishAllPlayers.getInstance(), e.getPlayer()));
    }

}
