package cameronwasnthere.strange.berries.mixin;

import cameronwasnthere.strange.berries.items.BerryItem;
import cameronwasnthere.strange.berries.items.ModItems;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.FoxEntity;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(AnimalEntity.class)
public class AnimalEntityMixin extends PassiveEntity {
    // Allows Healing and Regeneration Berries to be fed to animals to either heal or regenerate their health
    protected AnimalEntityMixin(EntityType<? extends PassiveEntity> entityType, World world) {
        super(entityType, world);
    }

    @Nullable
    @Override
    public PassiveEntity createChild(ServerWorld world, PassiveEntity entity) {
        return null;
    }

    @Inject(method = "interactMob", at = @At("HEAD"))
    public ActionResult interactMob(PlayerEntity player, Hand hand, CallbackInfoReturnable info) {
        ItemStack itemStack = player.getStackInHand(hand);
        if(itemStack.isOf(ModItems.HEALING_BERRIES) && !player.getItemCooldownManager().isCoolingDown(ModItems.HEALING_BERRIES)) {
            applyEffects(ModItems.HEALING_BERRIES, player, StatusEffects.INSTANT_HEALTH, 1, itemStack, hand);
            return ActionResult.SUCCESS;
        }
        else if(itemStack.isOf(ModItems.REGENERATION_BERRIES) && !player.getItemCooldownManager().isCoolingDown(ModItems.REGENERATION_BERRIES)){
            applyEffects(ModItems.REGENERATION_BERRIES, player, StatusEffects.REGENERATION, 200, itemStack, hand);
            return ActionResult.SUCCESS;
        }
        else {
            return ActionResult.FAIL;
        }
    }

    @Unique
    private void applyEffects(BerryItem berryItem, PlayerEntity player, RegistryEntry<StatusEffect> statusEffect, int duration, ItemStack itemStack, Hand hand) {
        itemStack.useOnEntity(player, this, hand);
        this.addStatusEffect(new StatusEffectInstance(statusEffect, duration, 1));
        this.playSound(SoundEvents.ENTITY_GENERIC_EAT, 1.0f, 1.0f);

        if(!player.getAbilities().creativeMode) {
            player.getItemCooldownManager().set(berryItem, 60);
            itemStack.decrement(1);
        }
    }
}
