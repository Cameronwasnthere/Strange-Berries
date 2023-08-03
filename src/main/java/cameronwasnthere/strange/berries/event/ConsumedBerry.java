package cameronwasnthere.strange.berries.event;

import cameronwasnthere.strange.berries.networking.BerrySickness;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ConsumedBerry extends BlockItem {
    public ConsumedBerry(Block block, Item.Settings settings) {
        super(block, settings);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        Entity entity = (Entity) user;
        if (world.isClient() && entity.isPlayer()) { // Ideally we want this but oh well I'm too lazy !playerentity.getAbilities().creativeMode
            ClientPlayNetworking.send(BerrySickness.CONSUMED_ID, PacketByteBufs.create());
        }
        return super.finishUsing(stack,world,user);
    }
}