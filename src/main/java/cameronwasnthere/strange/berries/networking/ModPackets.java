package cameronwasnthere.strange.berries.networking;

import cameronwasnthere.strange.berries.client.ClientData;
import cameronwasnthere.strange.berries.util.BerryPoisoningDataHandler;
import cameronwasnthere.strange.berries.util.IPlayerEntityAccessor;
import cameronwasnthere.strange.berries.util.PlayerData;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.networking.v1.PayloadTypeRegistry;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.util.Identifier;

public class ModPackets {
    public static final Identifier SYNC_ID = new Identifier("strangeberries", "sync");
    public static final Identifier JOIN_SYNC_ID = new Identifier("strangeberries", "join_sync");

    public static void registerPayloads() {
        PayloadTypeRegistry.playS2C().register(SyncDataPayload.ID, SyncDataPayload.CODEC);

        PayloadTypeRegistry.playC2S().register(JoinSyncDataPayload.ID, JoinSyncDataPayload.CODEC);
    }

    public static void registerS2C() {
        ClientPlayNetworking.registerGlobalReceiver(SyncDataPayload.ID, (payload, context) -> {
           context.client().execute(() -> {
               int data = payload.berriesEatenToday();
               PlayerData playerData = new PlayerData(data);
               ClientData.setPlayerData(playerData);
           });
        });
    }

    public static void registerC2S() {
        ServerPlayNetworking.registerGlobalReceiver(JoinSyncDataPayload.ID, (payload, context) -> {
            int value = BerryPoisoningDataHandler.getNBTData((IPlayerEntityAccessor) context.player(), "berriesEatenToday");
            BerryPoisoningDataHandler.setNBTData((IPlayerEntityAccessor) context.player(), "berriesEatenToday", value);
        });
    }
}
