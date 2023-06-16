package cameronwasnthere.strange.berries.events;

import cameronwasnthere.strange.berries.networking.BerrySickness;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ConsumedBerry extends Item {
    public ConsumedBerry(Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        PlayerEntity playerentity = (PlayerEntity) user;
        if (world.isClient() && !playerentity.getAbilities().creativeMode) {
            ClientPlayNetworking.send(BerrySickness.CONSUMED_ID, PacketByteBufs.create());
        }
        return super.finishUsing(stack,world,user);
    }
}