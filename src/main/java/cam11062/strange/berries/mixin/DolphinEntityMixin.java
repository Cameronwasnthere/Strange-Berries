package cam11062.strange.berries.mixin;

import cam11062.strange.berries.StrangeBerries;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EquipmentSlot;
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

    public DolphinEntityMixin(EntityType<? extends DolphinEntity> entityType, World world) {
        super(entityType, world);
    }

    @Inject(method = "interactMob", at = @At("HEAD"))
    public ActionResult interactMob(PlayerEntity player, Hand hand, CallbackInfoReturnable<PlayerEntity> cir) {
        ItemStack itemStack = player.getStackInHand(hand);
        if (itemStack.isOf(StrangeBerries.SEA_BERRIES) && player.getItemCooldownManager().isCoolingDown(StrangeBerries.SEA_BERRIES)) {
            return ActionResult.FAIL;
        } else if (itemStack.isOf(StrangeBerries.SEA_BERRIES) && this.getEquippedStack(EquipmentSlot.MAINHAND).isEmpty()) {
            player.playSound(SoundEvents.ENTITY_DOLPHIN_EAT, 1.0f, 1.0f);
            itemStack.useOnEntity(player, this, hand);
            if (!player.getAbilities().creativeMode) {
                itemStack.decrement(1);
                player.getItemCooldownManager().set(StrangeBerries.SEA_BERRIES, 20);
            }
            this.dropItem(StrangeBerries.DOLPHIN_BERRIES);
            return ActionResult.success(this.world.isClient);
        }
        return super.interactMob(player, hand);
    }
}
