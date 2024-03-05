package mrstreeet.portalpermissions;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

public final class PortalPermissions extends JavaPlugin {

    public String configPath;

    public static PortalPermissions plugin;
    private static Plugin instance;

    @Override
    public void onEnable() {
        //Set plugin instance
        plugin = this;
        instance = this;

        getLogger().log(Level.INFO, "PortalPermissions has been enabled!");
        getLogger().log(Level.INFO, "Author: MrStreeet");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().log(Level.INFO, "PortalPermissions has been disabled");
    }


}
