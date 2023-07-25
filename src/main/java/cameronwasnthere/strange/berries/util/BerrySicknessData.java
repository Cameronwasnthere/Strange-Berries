package cameronwasnthere.strange.berries.util;

import cameronwasnthere.strange.berries.effects.ModEffects;
import cameronwasnthere.strange.berries.networking.BerrySickness;
import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

public class BerrySicknessData {

    private static final String BERRY_SICKNESS_MESSAGE = "message.strangeberries.berry_sickness_message";
    public static int addSicknessLevel(IEntityDataSaver player, int amount) {
        NbtCompound nbt = player.getPersistentData();
        PlayerEntity playerentity = (PlayerEntity) player;
        int sicknesslevel = nbt.getInt("sicknesslevel");
        if (sicknesslevel + amount >= 3) {
            sicknesslevel = 3;
            if (!playerentity.getAbilities().creativeMode) {
                playerentity.addStatusEffect(new StatusEffectInstance(ModEffects.BERRY_SICKNESS, 99999999, 0));
                ((PlayerEntity) player).sendMessage(Text.translatable(BERRY_SICKNESS_MESSAGE).fillStyle(Style.EMPTY.withColor(Formatting.DARK_RED).withBold(true)), true);
            }
            }
        else {
            sicknesslevel += amount;
        }

        nbt.putInt("sicknesslevel", sicknesslevel);
        syncBerrySickness(sicknesslevel, (ServerPlayerEntity) player);
        return sicknesslevel;
    }

    public static int removeSicknessLevel(IEntityDataSaver player, int amount) {
        NbtCompound nbt = player.getPersistentData();
        PlayerEntity playerentity = (PlayerEntity) player;
        int sicknesslevel = nbt.getInt("sicknesslevel");
        if (sicknesslevel - amount < 0) {
            sicknesslevel = 0;
            }
        else {
            sicknesslevel -= amount;
            if (sicknesslevel < 3 && !playerentity.getAbilities().creativeMode); {
                playerentity.removeStatusEffect(ModEffects.BERRY_SICKNESS);
            }
        }

        nbt.putInt("sicknesslevel", sicknesslevel);
        syncBerrySickness(sicknesslevel, (ServerPlayerEntity) player);
        return sicknesslevel;
    }

    public static void syncBerrySickness(int sicknesslevel, ServerPlayerEntity player) {
        PacketByteBuf buffer = PacketByteBufs.create();
        buffer.writeInt(sicknesslevel);
        ServerPlayNetworking.send(player, BerrySickness.SYNC_ID, buffer);
    }
}
