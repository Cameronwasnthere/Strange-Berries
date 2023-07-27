package cameronwasnthere.strange.berries.items;

import cameronwasnthere.strange.berries.blocks.ModBlocks;
import cameronwasnthere.strange.berries.events.ConsumedBerry;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.registry.Registry;

public class ModItems {
        public static final ConsumedBerry SPEED_BERRIES = new ConsumedBerry(ModBlocks.SPEED_BERRY_BUSH, new FabricItemSettings().food(FoodComponents.SPEED_BERRIES));
        public static final ConsumedBerry HASTE_BERRIES = new ConsumedBerry(ModBlocks.HASTE_BERRY_BUSH, new FabricItemSettings().food(FoodComponents.HASTE_BERRIES));
        public static final ConsumedBerry STRENGTH_BERRIES = new ConsumedBerry(ModBlocks.STRENGTH_BERRY_BUSH, new FabricItemSettings().food(FoodComponents.STRENGTH_BERRIES));
        public static final ConsumedBerry REGENERATION_BERRIES = new ConsumedBerry(ModBlocks.REGENERATION_BERRY_BUSH,new FabricItemSettings().food(FoodComponents.REGENERATION_BERRIES));
        public static final ConsumedBerry LEAPING_BERRIES = new ConsumedBerry(ModBlocks.LEAPING_BERRY_BUSH,new FabricItemSettings().food(FoodComponents.LEAPING_BERRIES));
        public static final ConsumedBerry NIGHT_BERRIES = new ConsumedBerry(ModBlocks.NIGHT_BERRY_BUSH, new FabricItemSettings().food(FoodComponents.NIGHT_BERRIES));
        public static final ConsumedBerry CRIMSON_FIRE_BERRIES = new ConsumedBerry(ModBlocks.CRIMSON_FIRE_BERRY_BUSH, new FabricItemSettings().food(FoodComponents.FIRE_BERRIES).fireproof());
        public static final ConsumedBerry WARPED_FIRE_BERRIES = new ConsumedBerry(ModBlocks.WARPED_FIRE_BERRY_BUSH, new FabricItemSettings().food(FoodComponents.FIRE_BERRIES).fireproof());
        public static final ConsumedBerry RESISTANCE_BERRIES = new ConsumedBerry(ModBlocks.RESISTANCE_BERRY_BUSH, new FabricItemSettings().food(FoodComponents.RESISTANCE_BERRIES));
        public static final ConsumedBerry HEALING_BERRIES = new ConsumedBerry(ModBlocks.HEALING_BERRY_BUSH, new FabricItemSettings().food(FoodComponents.HEALING_BERRIES));
        public static final ConsumedBerry ASCENDING_BERRIES = new ConsumedBerry(ModBlocks.ASCENDING_BERRY_BUSH, new FabricItemSettings().food(FoodComponents.ASCENDING_BERRIES));
        public static final ConsumedBerry INVISIBILITY_BERRIES = new ConsumedBerry(ModBlocks.INVISIBILITY_BERRY_BUSH, new FabricItemSettings().food(FoodComponents.INVISIBILITY_BERRIES));
        public static final ConsumedBerry GOLDEN_BERRIES = new ConsumedBerry(ModBlocks.GOLDEN_BERRY_BUSH, new FabricItemSettings().food(FoodComponents.GOLDEN_BERRIES).rarity(Rarity.RARE));
        public static final ConsumedBerry DOLPHIN_BERRIES = new ConsumedBerry(ModBlocks.DOLPIN_BERRY_BUSH, new FabricItemSettings().food(FoodComponents.DOLPHIN_BERRIES));
        public static final ConsumedBerry SEA_BERRIES = new ConsumedBerry(ModBlocks.SEA_BERRY_BUSH, new FabricItemSettings().food(FoodComponents.SEA_BERRIES));
        public static final ConsumedBerry ROTTEN_BERRIES = new ConsumedBerry(ModBlocks.ROTTEN_BERRY_BUSH, new FabricItemSettings().food(FoodComponents.ROTTEN_BERRIES));

        public static void registerModItems() {
                Registry.register(Registries.ITEM, new Identifier("strangeberries", "rotten_berries"), ROTTEN_BERRIES);
                Registry.register(Registries.ITEM, new Identifier("strangeberries", "speed_berries"), SPEED_BERRIES);
                Registry.register(Registries.ITEM, new Identifier("strangeberries", "haste_berries"), HASTE_BERRIES);
                Registry.register(Registries.ITEM, new Identifier("strangeberries", "strength_berries"), STRENGTH_BERRIES);
                Registry.register(Registries.ITEM, new Identifier("strangeberries", "regeneration_berries"), REGENERATION_BERRIES);
                Registry.register(Registries.ITEM, new Identifier("strangeberries", "leaping_berries"), LEAPING_BERRIES);
                Registry.register(Registries.ITEM, new Identifier("strangeberries", "night_berries"), NIGHT_BERRIES);
                Registry.register(Registries.ITEM, new Identifier("strangeberries", "crimson_fire_berries"), CRIMSON_FIRE_BERRIES);
                Registry.register(Registries.ITEM, new Identifier("strangeberries", "warped_fire_berries"), WARPED_FIRE_BERRIES);
                Registry.register(Registries.ITEM, new Identifier("strangeberries", "resistance_berries"), RESISTANCE_BERRIES);
                Registry.register(Registries.ITEM, new Identifier("strangeberries", "healing_berries"), HEALING_BERRIES);
                Registry.register(Registries.ITEM, new Identifier("strangeberries", "ascending_berries"), ASCENDING_BERRIES);
                Registry.register(Registries.ITEM, new Identifier("strangeberries", "invisibility_berries"), INVISIBILITY_BERRIES);
                Registry.register(Registries.ITEM, new Identifier("strangeberries", "sea_berries"), SEA_BERRIES);
                Registry.register(Registries.ITEM, new Identifier("strangeberries", "dolphin_berries"), DOLPHIN_BERRIES);
                Registry.register(Registries.ITEM, new Identifier("strangeberries", "golden_berries"), GOLDEN_BERRIES);
        }
}
