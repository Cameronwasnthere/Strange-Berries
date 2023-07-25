package cameronwasnthere.strange.berries.networking;

import cameronwasnthere.strange.berries.networking.packet.BerrySicknessSyncDataS2CPacket;
import cameronwasnthere.strange.berries.networking.packet.ConsumedBerryC2SPacket;
import cameronwasnthere.strange.berries.networking.packet.OnJoinSyncC2SPacket;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.util.Identifier;

public class BerrySickness {
    public static final Identifier CONSUMED_ID = new Identifier("strangeberries", "consumed");
    public static final Identifier SYNC_ID = new Identifier("strangeberries", "sync");
    public static final Identifier ON_JOIN_SYNC_ID = new Identifier("strangeberries", "on_join_sync");

    public static void registerC2SPackets() {
        ServerPlayNetworking.registerGlobalReceiver(CONSUMED_ID, ConsumedBerryC2SPacket::receive);
        ServerPlayNetworking.registerGlobalReceiver(ON_JOIN_SYNC_ID, OnJoinSyncC2SPacket::receive);
    }

    public static void registerS2CPackets() {
        ClientPlayNetworking.registerGlobalReceiver(SYNC_ID, BerrySicknessSyncDataS2CPacket::receive);
    }
}
