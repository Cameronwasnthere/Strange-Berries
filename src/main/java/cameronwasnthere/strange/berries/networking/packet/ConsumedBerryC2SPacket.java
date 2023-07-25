package cameronwasnthere.strange.berries.networking.packet;

import cameronwasnthere.strange.berries.util.BerrySicknessData;
import cameronwasnthere.strange.berries.util.IEntityDataSaver;
import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayNetworkHandler;
import net.minecraft.server.network.ServerPlayerEntity;

public class ConsumedBerryC2SPacket {
    public static void receive(MinecraftServer server, ServerPlayerEntity player, ServerPlayNetworkHandler handler,
                               PacketByteBuf buf, PacketSender sender) {

        BerrySicknessData.syncBerrySickness(((IEntityDataSaver) player).getPersistentData().getInt("sicknesslevel"), player);
        BerrySicknessData.addSicknessLevel(((IEntityDataSaver) player),1);
    }
}
