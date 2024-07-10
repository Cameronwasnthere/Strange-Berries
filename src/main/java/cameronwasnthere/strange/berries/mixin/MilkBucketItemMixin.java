package cameronwasnthere.strange.berries.mixin;

import cameronwasnthere.strange.berries.effects.ModEffects;
import cameronwasnthere.strange.berries.items.ModItems;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.MilkBucketItem;
import net.minecraft.registry.Registries;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(MilkBucketItem.class)
public class MilkBucketItemMixin {
    @Inject(method = "finishUsing", at = @At("HEAD"))
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user, CallbackInfoReturnable<ItemStack>cir) {
        if(user instanceof ServerPlayerEntity serverPlayerEntity) {
            if(user.hasStatusEffect(Registries.STATUS_EFFECT.getEntry(ModEffects.BERRY_POISONING))) {
                for(Item berries : ModItems.BERRIES) {
                    serverPlayerEntity.getItemCooldownManager().remove(berries);
                }
            }
        }
        return stack;
    }
}
