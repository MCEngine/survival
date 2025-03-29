package io.github.mcengine.nms.survival.spigotmc.v1_20_R3;

import io.github.mcengine.api.NMSAdapter;
import net.minecraft.network.protocol.game.ClientboundSetTitlesPacket;
import net.minecraft.network.protocol.game.ClientboundSetTitlesPacket.Type;
import net.minecraft.server.network.ServerGamePacketListenerImpl;
import net.minecraft.server.level.ServerPlayer;
import org.bukkit.craftbukkit.v1_20_R2.entity.CraftPlayer;
import org.bukkit.entity.Player;

public class NMSAdapterImpl implements NMSAdapter {
    public void sendTitle(Player player, String title, String subtitle) {
        ServerPlayer sp = ((CraftPlayer) player).getHandle();
        ServerGamePacketListenerImpl conn = sp.connection;

        conn.send(new ClientboundSetTitlesPacket(Type.TITLE, net.minecraft.network.chat.Component.literal(title)));
        conn.send(new ClientboundSetTitlesPacket(Type.SUBTITLE, net.minecraft.network.chat.Component.literal(subtitle)));
    }
}
