package cam11062.strange.berries.item;

import cam11062.strange.berries.mixin.BrewingRecipeRegistryMixin;
import cam11062.strange.berries.potion.ModPotions;
import net.minecraft.potion.Potion;
import net.minecraft.potion.Potions;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static cam11062.strange.berries.StrangeBerries.*;
import static cam11062.strange.berries.potion.ModPotions.BERRY_SICKNESS_POTION;

public class ModItems {

        public static void registerItems() {

                Registry.register(net.minecraft.util.registry.Registry.ITEM, new Identifier("strangeberries", "rotten_berries"), ROTTEN_BERRIES);
                Registry.register(net.minecraft.util.registry.Registry.ITEM, new Identifier("strangeberries", "speed_berries"), SPEED_BERRIES);
                Registry.register(net.minecraft.util.registry.Registry.ITEM, new Identifier("strangeberries", "haste_berries"), HASTE_BERRIES);
                Registry.register(net.minecraft.util.registry.Registry.ITEM, new Identifier("strangeberries", "strength_berries"), STRENGTH_BERRIES);
                Registry.register(net.minecraft.util.registry.Registry.ITEM, new Identifier("strangeberries", "regeneration_berries"), REGENERATION_BERRIES);
                Registry.register(net.minecraft.util.registry.Registry.ITEM, new Identifier("strangeberries", "leaping_berries"), LEAPING_BERRIES);
                Registry.register(net.minecraft.util.registry.Registry.ITEM, new Identifier("strangeberries", "night_berries"), NIGHT_BERRIES);
                Registry.register(net.minecraft.util.registry.Registry.ITEM, new Identifier("strangeberries", "fire_berries"), FIRE_BERRIES);
                Registry.register(net.minecraft.util.registry.Registry.ITEM, new Identifier("strangeberries", "resistance_berries"), RESISTANCE_BERRIES);
                Registry.register(net.minecraft.util.registry.Registry.ITEM, new Identifier("strangeberries", "healing_berries"), HEALING_BERRIES);
                Registry.register(net.minecraft.util.registry.Registry.ITEM, new Identifier("strangeberries", "ascending_berries"), ASCENDING_BERRIES);
                Registry.register(net.minecraft.util.registry.Registry.ITEM, new Identifier("strangeberries", "invisibility_berries"), INVISIBILITY_BERRIES);
                Registry.register(net.minecraft.util.registry.Registry.ITEM, new Identifier("strangeberries", "sea_berries"), SEA_BERRIES);
                Registry.register(net.minecraft.util.registry.Registry.ITEM, new Identifier("strangeberries", "dolphin_berries"), DOLPHIN_BERRIES);
                Registry.register(net.minecraft.util.registry.Registry.ITEM, new Identifier("strangeberries", "golden_berries"), GOLDEN_BERRIES);
        }
}
