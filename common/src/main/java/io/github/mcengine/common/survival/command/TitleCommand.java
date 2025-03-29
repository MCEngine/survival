package io.github.mcengine.common.survival.command;

import io.github.mcengine.nms.survival.MCEngineSurvivalNmsAdapter;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.CommandExecutor;
import org.bukkit.entity.Player;

public class TitleCommand implements CommandExecutor {
    private final MCEngineSurvivalNmsAdapter adapter;

    public TitleCommand(MCEngineSurvivalNmsAdapter adapter) {
        this.adapter = adapter;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player player) {
            adapter.sendTitle(player, "Hello!", "This is your NMS title.");
            return true;
        }
        return false;
    }
}
