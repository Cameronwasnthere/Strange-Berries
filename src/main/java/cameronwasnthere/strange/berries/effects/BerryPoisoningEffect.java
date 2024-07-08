package cameronwasnthere.strange.berries.effects;

import cameronwasnthere.strange.berries.damage_types.ModDamageTypes;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.AttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.damage.DamageSources;
import net.minecraft.entity.damage.DamageType;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;

public class BerryPoisoningEffect extends StatusEffect {
    public BerryPoisoningEffect(StatusEffectCategory type, int color) {
        super(type, color);
    }

    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }
    @Override
    public boolean applyUpdateEffect(LivingEntity entity, int amplifier) {
        if(entity instanceof PlayerEntity player) {
//            int foodLevel = player.getHungerManager().getFoodLevel();
//            if(foodLevel > 0) {
//                player.addExhaustion(1.0F);
//            }
            if (player.age % 200 == 0) { // 10 seconds
                player.damage(ModDamageTypes.of(entity.getWorld(), ModDamageTypes.BERRY_POISONING_DAMAGE_TYPE), 6F);
                player.addExhaustion(150.0F);
            }
        }
        return true;
    }
}
