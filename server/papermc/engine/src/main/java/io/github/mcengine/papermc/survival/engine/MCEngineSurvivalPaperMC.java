package io.github.mcengine.papermc.survival.engine;

import org.bukkit.plugin.java.JavaPlugin;

public class MCEngineSurvivalPaperMC extends JavaPlugin {
    private static MCEngineSurvivalPaperMC instance;

    @Override
    public void onEnable() {
        instance = this;
        // Save default config if not already present
        saveDefaultConfig();
    }

    @Override
    public void onDisable() {}

    /*
     * Return instance of MCEngineSurvivalPaperMC
     */
    public static MCEngineSurvivalPaperMC getInstance() {
        return instance;
    }
}