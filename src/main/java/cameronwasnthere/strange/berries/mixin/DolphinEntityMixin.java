package cameronwasnthere.strange.berries.mixin;

import cameronwasnthere.strange.berries.items.ModItems;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.WaterCreatureEntity;
import net.minecraft.entity.passive.DolphinEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(DolphinEntity.class)
public class DolphinEntityMixin extends WaterCreatureEntity {
    // Allows Dolphin Berries to be feed to a Dolphin
    public DolphinEntityMixin(EntityType<? extends DolphinEntity> entityType, World world) {
        super(entityType, world);
    }

    @Inject(method = "interactMob", at = @At("HEAD"))
    public ActionResult interactMob(PlayerEntity player, Hand hand, CallbackInfoReturnable<PlayerEntity> cir) {
        ItemStack itemStack = player.getStackInHand(hand);
        if (itemStack.isOf(ModItems.DOLPHIN_BERRIES)) {
            player.playSound(SoundEvents.ENTITY_DOLPHIN_EAT, 1.0f, 1.0f);
            itemStack.useOnEntity(player, this, hand);
            if (!player.getAbilities().creativeMode) {
                itemStack.decrement(1);
            }
            return ActionResult.success(this.getWorld().isClient);
        }
        return super.interactMob(player, hand);
    }
}
