package cameronwasnthere.strange.berries.potions;

import cameronwasnthere.strange.berries.effects.ModEffects;
import net.fabricmc.fabric.api.registry.FabricBrewingRecipeRegistryBuilder;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.potion.Potion;
import net.minecraft.potion.Potions;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;

import net.minecraft.recipe.BrewingRecipeRegistry;

import static cameronwasnthere.strange.berries.items.ModItems.*;

public class ModPotions {
    public static final RegistryEntry<Potion> BERRY_POISONING = registerModPotions("berry_poisoning", new Potion(new StatusEffectInstance(Registries.STATUS_EFFECT.getEntry(ModEffects.BERRY_POISONING), 800)));

    public static final RegistryEntry<Potion> STAGNANT = registerModPotions("stagnant", new Potion());

    private static RegistryEntry<Potion> registerModPotions(String name, Potion potion) {
        return Registry.registerReference(Registries.POTION, Identifier.of(name), potion);
    }

    public static void registerBerryBrewingRecipes() {
        FabricBrewingRecipeRegistryBuilder.BUILD.register((registry) -> {
            registry.registerPotionRecipe(Potions.WATER, Ingredient.ofItems(ROTTEN_BERRIES), STAGNANT);

            registry.registerPotionRecipe(STAGNANT, Ingredient.ofItems(SPEED_BERRIES), Potions.SWIFTNESS);
            registry.registerPotionRecipe(STAGNANT, Ingredient.ofItems(STRENGTH_BERRIES), Potions.STRENGTH);
            registry.registerPotionRecipe(STAGNANT, Ingredient.ofItems(REGENERATION_BERRIES), Potions.REGENERATION);
            registry.registerPotionRecipe(STAGNANT, Ingredient.ofItems(LEAPING_BERRIES), Potions.LEAPING);
            registry.registerPotionRecipe(STAGNANT, Ingredient.ofItems(NIGHT_BERRIES), Potions.NIGHT_VISION);
            registry.registerPotionRecipe(STAGNANT, Ingredient.ofItems(CRIMSON_FIRE_BERRIES), Potions.FIRE_RESISTANCE);
            registry.registerPotionRecipe(STAGNANT, Ingredient.ofItems(WARPED_FIRE_BERRIES), Potions.FIRE_RESISTANCE);
            registry.registerPotionRecipe(STAGNANT, Ingredient.ofItems(HEALING_BERRIES), Potions.HEALING);
            registry.registerPotionRecipe(STAGNANT, Ingredient.ofItems(ASCENDING_BERRIES), Potions.SLOW_FALLING);
            registry.registerPotionRecipe(STAGNANT, Ingredient.ofItems(INVISIBILITY_BERRIES), Potions.INVISIBILITY);
            registry.registerPotionRecipe(STAGNANT, Ingredient.ofItems(SEA_BERRIES), Potions.WATER_BREATHING);
            registry.registerPotionRecipe(STAGNANT, Ingredient.ofItems(GOLDEN_BERRIES), Potions.LUCK);
            registry.registerPotionRecipe(STAGNANT, Ingredient.ofItems(ROTTEN_BERRIES), BERRY_POISONING);

            registry.registerPotionRecipe(STAGNANT, Ingredient.ofItems(DOLPHIN_BERRIES), Potions.THICK);
            registry.registerPotionRecipe(STAGNANT, Ingredient.ofItems(RESISTANCE_BERRIES), Potions.THICK);
            registry.registerPotionRecipe(STAGNANT, Ingredient.ofItems(HASTE_BERRIES), Potions.THICK);

            registry.registerPotionRecipe(Potions.SLOWNESS, Ingredient.ofItems(RESISTANCE_BERRIES), Potions.TURTLE_MASTER);
            registry.registerPotionRecipe(Potions.STRONG_SLOWNESS, Ingredient.ofItems(RESISTANCE_BERRIES), Potions.STRONG_TURTLE_MASTER);
            registry.registerPotionRecipe(Potions.LONG_SLOWNESS, Ingredient.ofItems(RESISTANCE_BERRIES), Potions.LONG_TURTLE_MASTER);
        });
    }
}
