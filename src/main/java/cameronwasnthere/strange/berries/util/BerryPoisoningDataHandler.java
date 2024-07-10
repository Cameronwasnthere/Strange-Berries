package cameronwasnthere.strange.berries.util;

import cameronwasnthere.strange.berries.effects.ModEffects;
import cameronwasnthere.strange.berries.items.ModItems;
import cameronwasnthere.strange.berries.networking.SyncDataPayload;
import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.Item;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.registry.Registries;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

public class BerryPoisoningDataHandler {
    public static void checkNBTData(IPlayerEntityAccessor player, String key) {
        NbtCompound persistentData = player.getPersistentData();
        ServerPlayerEntity serverPlayerEntity = (ServerPlayerEntity) player;
        int currentValue = persistentData.getInt(key);
        if(currentValue >= 6) {
            poisonPlayer(serverPlayerEntity, currentValue);
        }
        else {
            int newValue = currentValue + 1;
            if(newValue == 6) {
                poisonPlayer(serverPlayerEntity, newValue);
            }
            persistentData.putInt(key, newValue);
            PacketByteBuf buf = PacketByteBufs.create();
            buf.writeNbt(persistentData);

            // Sync with the client
            ServerPlayNetworking.send(serverPlayerEntity, new SyncDataPayload(newValue));
        }
    }

    private static void poisonPlayer(ServerPlayerEntity serverPlayerEntity, int value) {
        serverPlayerEntity.addStatusEffect(new StatusEffectInstance(Registries.STATUS_EFFECT.getEntry(ModEffects.BERRY_POISONING), 800));
        serverPlayerEntity.sendMessage(Text.translatable("message.strangeberries.berry_poisoning_message")
                .fillStyle(Style.EMPTY.withColor(Formatting.DARK_RED).withBold(true)), true);

        for(Item berries : ModItems.BERRIES) {
            serverPlayerEntity.getItemCooldownManager().set(berries, 800);
        }

        // Sync with the client
        ServerPlayNetworking.send(serverPlayerEntity, new SyncDataPayload(value));
    }

    public static void setNBTData(IPlayerEntityAccessor player, String key, int value) {
        NbtCompound persistentData = player.getPersistentData();
        ServerPlayerEntity serverPlayerEntity = (ServerPlayerEntity) player;
        persistentData.putInt(key, value);

        // Sync with the client
        ServerPlayNetworking.send(serverPlayerEntity, new SyncDataPayload(value));
    }

    public static int getNBTData(IPlayerEntityAccessor player, String key) {
        NbtCompound persistentData = player.getPersistentData();
        return persistentData.getInt(key);
    }
}
