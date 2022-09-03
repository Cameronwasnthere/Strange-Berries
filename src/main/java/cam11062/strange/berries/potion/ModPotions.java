package cam11062.strange.berries.potion;

import cam11062.strange.berries.effect.ModEffects;
import cam11062.strange.berries.mixin.BrewingRecipeRegistryMixin;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.potion.Potion;
import net.minecraft.potion.Potions;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static cam11062.strange.berries.StrangeBerries.*;

public class ModPotions {
    public static Potion BERRY_SICKNESS_POTION;

    public static Potion registerPotion(String name) {
        return Registry.register(Registry.POTION, new Identifier("strangeberries", name),
                new Potion(new StatusEffectInstance(ModEffects.BERRY_SICKNESS, 500, 0)));
    }

    public static void registerPotions() {
        BERRY_SICKNESS_POTION = registerPotion("berry_sickness_potion");
    }

    public static void registerBerryBrewingRecipes() {
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.THICK, SPEED_BERRIES, Potions.SWIFTNESS);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.THICK, HASTE_BERRIES, Potions.MUNDANE);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.THICK, STRENGTH_BERRIES, Potions.STRENGTH);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.THICK, REGENERATION_BERRIES, Potions.REGENERATION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.THICK, LEAPING_BERRIES, Potions.LEAPING);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.THICK, NIGHT_BERRIES, Potions.NIGHT_VISION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.THICK, FIRE_BERRIES, Potions.FIRE_RESISTANCE);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.THICK, HEALING_BERRIES, Potions.HEALING);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.THICK, ASCENDING_BERRIES, Potions.SLOW_FALLING);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.THICK, INVISIBILITY_BERRIES, Potions.INVISIBILITY);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.THICK, SEA_BERRIES, Potions.WATER_BREATHING);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.THICK, DOLPHIN_BERRIES, Potions.MUNDANE);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.THICK, RESISTANCE_BERRIES, Potions.MUNDANE);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.THICK, GOLDEN_BERRIES, Potions.LUCK);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.THICK, ROTTEN_BERRIES, BERRY_SICKNESS_POTION);

        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.SLOWNESS, RESISTANCE_BERRIES, Potions.TURTLE_MASTER);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.STRONG_SLOWNESS, RESISTANCE_BERRIES, Potions.STRONG_TURTLE_MASTER);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.LONG_SLOWNESS, RESISTANCE_BERRIES, Potions.LONG_TURTLE_MASTER);
    }
}
