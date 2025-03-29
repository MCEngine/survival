package io.github.mcengine.nms.survival;

import org.bukkit.entity.Player;

public interface MCEngineSurvivalNmsAdapter {
    void sendTitle(Player player, String title, String subtitle);
}