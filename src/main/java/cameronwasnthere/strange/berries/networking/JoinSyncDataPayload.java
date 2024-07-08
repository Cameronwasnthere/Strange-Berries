package cameronwasnthere.strange.berries.networking;

import net.minecraft.network.RegistryByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.network.codec.PacketCodecs;
import net.minecraft.network.packet.CustomPayload;

public record JoinSyncDataPayload(boolean joined) implements CustomPayload {
    public static final CustomPayload.Id<JoinSyncDataPayload> ID = new CustomPayload.Id<>(ModPackets.JOIN_SYNC_ID);
    public static final PacketCodec<RegistryByteBuf, JoinSyncDataPayload> CODEC = PacketCodec.tuple(
            PacketCodecs.BOOL,
            JoinSyncDataPayload::joined,
            JoinSyncDataPayload::new);
    @Override
    public Id<? extends CustomPayload> getId() {
        return ID;
    }
}
