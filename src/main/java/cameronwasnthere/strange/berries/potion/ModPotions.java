package cameronwasnthere.strange.berries.potion;

import cameronwasnthere.strange.berries.effects.ModEffects;
import cameronwasnthere.strange.berries.mixin.BrewingRecipeRegistryMixin;
import cameronwasnthere.strange.berries.items.ModItems;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.potion.Potion;
import net.minecraft.potion.Potions;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

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
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.THICK, ModItems.SPEED_BERRIES, Potions.SWIFTNESS);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.THICK, ModItems.HASTE_BERRIES, Potions.MUNDANE);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.THICK, ModItems.STRENGTH_BERRIES, Potions.STRENGTH);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.THICK, ModItems.REGENERATION_BERRIES, Potions.REGENERATION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.THICK, ModItems.LEAPING_BERRIES, Potions.LEAPING);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.THICK, ModItems.NIGHT_BERRIES, Potions.NIGHT_VISION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.THICK, ModItems.CRIMSON_FIRE_BERRIES, Potions.FIRE_RESISTANCE);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.THICK, ModItems.WARPED_FIRE_BERRIES, Potions.FIRE_RESISTANCE);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.THICK, ModItems.HEALING_BERRIES, Potions.HEALING);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.THICK, ModItems.ASCENDING_BERRIES, Potions.SLOW_FALLING);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.THICK, ModItems.INVISIBILITY_BERRIES, Potions.INVISIBILITY);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.THICK, ModItems.SEA_BERRIES, Potions.WATER_BREATHING);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.THICK, ModItems.DOLPHIN_BERRIES, Potions.MUNDANE);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.THICK, ModItems.RESISTANCE_BERRIES, Potions.MUNDANE);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.THICK, ModItems.GOLDEN_BERRIES, Potions.LUCK);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.THICK, ModItems.ROTTEN_BERRIES, BERRY_SICKNESS_POTION);

        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.SLOWNESS, ModItems.RESISTANCE_BERRIES, Potions.TURTLE_MASTER);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.STRONG_SLOWNESS, ModItems.RESISTANCE_BERRIES, Potions.STRONG_TURTLE_MASTER);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.LONG_SLOWNESS, ModItems.RESISTANCE_BERRIES, Potions.LONG_TURTLE_MASTER);
    }
}
