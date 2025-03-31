package io.github.mcengine.papermc.survival.v1_21_3.command;

import io.github.mcengine.nms.survival.command.INmsCommandHandler;
import org.bukkit.entity.Player;

public class MCEngineSurvivalPaperMCCommand_1_21_3 implements INmsCommandHandler {
    public void getVersion(Player player) {
        player.sendMessage("Hello from PaperMC 1.21.3");
    }
}