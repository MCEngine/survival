package io.github.mcengine.spigotmc.survival.v1_21_3.command;

import io.github.mcengine.nms.survival.command.INmsCommandHandler;
import org.bukkit.entity.Player;

public class MCEngineSurvivalSpigotMCCommand_1_21_3 implements INmsCommandHandler {
    public void getVersion(Player player) {
        player.sendMessage("Hello from SpigotMC 1.21.3");
    }
}