package cameronwasnthere.strange.berries.networking;

import net.minecraft.network.RegistryByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.network.codec.PacketCodecs;
import net.minecraft.network.packet.CustomPayload;

public record SyncDataPayload(int berriesEatenToday) implements CustomPayload {
    public static final CustomPayload.Id<SyncDataPayload> ID = new CustomPayload.Id<>(ModPackets.SYNC_ID);
    public static final PacketCodec<RegistryByteBuf, SyncDataPayload> CODEC = PacketCodec.tuple(
            PacketCodecs.INTEGER,
            SyncDataPayload::berriesEatenToday,
            SyncDataPayload::new);

    @Override
    public Id<? extends CustomPayload> getId() {
        return ID;
    }
}
