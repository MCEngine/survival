package io.github.mcengine.papermc.survival.v1_21_4.command;

import io.github.mcengine.nms.survival.command.INmsCommandHandler;
import org.bukkit.entity.Player;

public class MCEngineSurvivalPaperMCCommand_1_21_4 implements INmsCommandHandler {
    public void getVersion(Player player) {
        player.sendMessage("Hello from 1.21.4");
    }
}