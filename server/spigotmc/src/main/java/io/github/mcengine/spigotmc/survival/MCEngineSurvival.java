package io.github.mcengine.spigotmc.survival;

import org.bukkit.plugin.java.JavaPlugin;

public class MCEngineSurvival extends JavaPlugin {

    private static MCEngineSurvival instance;

    @Override
    public void onEnable() {
        instance = this;
        // Save default config if not already present
        saveDefaultConfig();
    }

    @Override
    public void onDisable() {}

    /*
     * Return instance of MCEngineSurvival
     */
    public static MCEngineSurvival getInstance() {
        return instance;
    }
}
