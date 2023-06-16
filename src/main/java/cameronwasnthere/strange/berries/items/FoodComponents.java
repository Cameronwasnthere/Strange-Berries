package cameronwasnthere.strange.berries.items;

import cameronwasnthere.strange.berries.effects.ModEffects;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class FoodComponents {
    public static final FoodComponent SPEED_BERRIES = (new FoodComponent
            .Builder())
            .hunger(1)
            .saturationModifier(1F)
            .alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 200, 1), 1F)
            .build();
    public static final FoodComponent HASTE_BERRIES = (new FoodComponent.
            Builder())
            .hunger(1)
            .saturationModifier(1F)
            .alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 200, 1), 1F)
            .build();
    public static final FoodComponent STRENGTH_BERRIES = (new FoodComponent
            .Builder())
            .hunger(1)
            .saturationModifier(1F)
            .alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 200, 0), 1F)
            .build();
    public static final FoodComponent REGENERATION_BERRIES = (new FoodComponent
            .Builder())
            .hunger(1)
            .saturationModifier(1F)
            .alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 200, 0), 1F)
            .build();
    public static final FoodComponent LEAPING_BERRIES = (new FoodComponent
            .Builder())
            .hunger(1)
            .saturationModifier(1F)
            .alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 200, 3), 1F)
            .build();
    public static final FoodComponent NIGHT_BERRIES = (new FoodComponent
            .Builder())
            .hunger(1)
            .saturationModifier(1F)
            .alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 400, 0), 1F)
            .build();
    public static final FoodComponent FIRE_BERRIES = (new FoodComponent
            .Builder())
            .hunger(1)
            .saturationModifier(1F)
            .alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 200, 0), 1F)
            .build();
    public static final FoodComponent RESISTANCE_BERRIES = (new FoodComponent
            .Builder())
            .hunger(1)
            .saturationModifier(1F)
            .alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 200, 0), 1F)
            .build();
    public static final FoodComponent HEALING_BERRIES = (new FoodComponent
            .Builder())
            .hunger(1)
            .saturationModifier(1F)
            .alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 20, 0), 1F)
            .build();
    public static final FoodComponent ASCENDING_BERRIES = (new FoodComponent
            .Builder())
            .hunger(1)
            .saturationModifier(1F)
            .alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.LEVITATION, 200, 0), 1F)
            .build();
    public static final FoodComponent INVISIBILITY_BERRIES = (new FoodComponent
            .Builder())
            .hunger(1)
            .saturationModifier(1F).statusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY, 200, 0), 1F)
            .alwaysEdible()
            .build();
    public static final FoodComponent SEA_BERRIES = (new FoodComponent
            .Builder())
            .hunger(1)
            .saturationModifier(1F)
            .alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 200, 0), 1F)
            .build();
    public static final FoodComponent GOLDEN_BERRIES = (new FoodComponent
            .Builder())
            .hunger(4)
            .saturationModifier(5F)
            .alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 400, 0), 1F)
            .build();
    public static final FoodComponent DOLPHIN_BERRIES = (new FoodComponent
            .Builder())
            .hunger(1)
            .saturationModifier(1F)
            .alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, 200, 0), 1F)
            .build();
    public static final FoodComponent ROTTEN_BERRIES = (new FoodComponent
            .Builder())
            .hunger(0)
            .saturationModifier(0F)
            .alwaysEdible()
            .statusEffect(new StatusEffectInstance(ModEffects.BERRY_SICKNESS, 200, 0), 1F)
            .build();
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
