package cameronwasnthere.strange.berries.items;

import cameronwasnthere.strange.berries.util.BerryPoisoningDataHandler;
import cameronwasnthere.strange.berries.util.IPlayerEntityAccessor;
import net.minecraft.block.Block;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class BerryItem extends BlockItem {
    public BerryItem(Block block, Settings settings) {
        super(block, settings);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        if(!world.isClient() && user instanceof PlayerEntity playerEntity && !((PlayerEntity) user).isCreative()) {
            if(stack.isOf(ModItems.ROTTEN_BERRIES)) {
                BerryPoisoningDataHandler.setNBTData((IPlayerEntityAccessor) playerEntity, "berriesEatenToday", 6);
            }
            BerryPoisoningDataHandler.checkNBTData((IPlayerEntityAccessor) playerEntity, "berriesEatenToday");
        }
        return super.finishUsing(stack,world,user);
    }
}
