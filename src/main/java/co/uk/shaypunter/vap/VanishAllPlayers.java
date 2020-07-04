package co.uk.shaypunter.vap;

import co.uk.shaypunter.vap.events.onJoin;
import org.bukkit.plugin.java.JavaPlugin;

public class VanishAllPlayers extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new onJoin(), this);
        new Metrics(this, 8085);
    }

    /**
     * Get the instance of the VanishAllPlayers class
     * @return VanishAllPlayers instance
     */
    public static VanishAllPlayers getInstance() {
        return getPlugin(VanishAllPlayers.class);
    }

}
