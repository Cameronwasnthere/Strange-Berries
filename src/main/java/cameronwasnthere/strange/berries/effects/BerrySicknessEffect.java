package cameronwasnthere.strange.berries.effects;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.player.PlayerEntity;

public class BerrySicknessEffect extends StatusEffect {
    public BerrySicknessEffect() {
        super(
                StatusEffectCategory.HARMFUL,
                5578058);
    }

    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }
    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        if(entity instanceof PlayerEntity) {
            ((PlayerEntity) entity).addExhaustion(1F);
        }
    }
}
