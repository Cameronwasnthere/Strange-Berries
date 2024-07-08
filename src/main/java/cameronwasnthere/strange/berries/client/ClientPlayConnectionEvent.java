package cameronwasnthere.strange.berries.client;

import cameronwasnthere.strange.berries.networking.JoinSyncDataPayload;
import cameronwasnthere.strange.berries.networking.SyncDataPayload;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.entity.player.PlayerEntity;

public class ClientPlayConnectionEvent implements ClientPlayConnectionEvents.Join {
    @Override
    public void onPlayReady(ClientPlayNetworkHandler handler, PacketSender sender, MinecraftClient client) {
        ClientPlayNetworking.send(new JoinSyncDataPayload(true));
    }
}
