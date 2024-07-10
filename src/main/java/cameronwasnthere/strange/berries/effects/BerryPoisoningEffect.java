package cameronwasnthere.strange.berries.effects;

import cameronwasnthere.strange.berries.damage_types.ModDamageTypes;
import cameronwasnthere.strange.berries.util.BerryPoisoningDataHandler;
import cameronwasnthere.strange.berries.util.IPlayerEntityAccessor;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.AttributeContainer;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.server.network.ServerPlayerEntity;

public class BerryPoisoningEffect extends StatusEffect {
    public BerryPoisoningEffect(StatusEffectCategory type, int color) {
        super(type, color);
    }

    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }

    @Override
    public boolean applyUpdateEffect(LivingEntity entity, int amplifier) {
        if(entity instanceof ServerPlayerEntity player) {
            if(player.age % 160 == 0) { // 8 seconds
                player.damage(ModDamageTypes.of(entity.getWorld(), ModDamageTypes.BERRY_POISONING_DAMAGE_TYPE), 8F);
            }
            BerryPoisoningDataHandler.setNBTData((IPlayerEntityAccessor)player, "berriesEatenToday", 6);
        }
        return true;
    }
}
