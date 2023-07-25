package cameronwasnthere.strange.berries.networking.packet;

import cameronwasnthere.strange.berries.util.IEntityDataSaver;
import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.network.PacketByteBuf;

public class BerrySicknessSyncDataS2CPacket {
    public static void receive(MinecraftClient client, ClientPlayNetworkHandler handler, PacketByteBuf buf, PacketSender sender) {
        ((IEntityDataSaver) client.player).getPersistentData().putInt("sicknesslevel", buf.readInt());
    }
}
