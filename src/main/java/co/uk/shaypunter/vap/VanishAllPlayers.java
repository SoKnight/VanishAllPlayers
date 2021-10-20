package co.uk.shaypunter.vap;

import co.uk.shaypunter.vap.listener.PlayerJoinListener;
import co.uk.shaypunter.vap.metrics.Metrics;
import org.bukkit.plugin.java.JavaPlugin;

public final class VanishAllPlayers extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new PlayerJoinListener(this), this);

        new Metrics(this, 8085);
    }

}
