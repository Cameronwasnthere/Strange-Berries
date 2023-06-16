package cameronwasnthere.strange.berries.items;

import cameronwasnthere.strange.berries.events.ConsumedBerry;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.registry.Registry;

public class ModItems {
        public static final ConsumedBerry SPEED_BERRIES = new ConsumedBerry(new Item.Settings().food(FoodComponents.SPEED_BERRIES));
        public static final ConsumedBerry HASTE_BERRIES = new ConsumedBerry(new Item.Settings().food(FoodComponents.HASTE_BERRIES));
        public static final ConsumedBerry STRENGTH_BERRIES = new ConsumedBerry(new Item.Settings().food(FoodComponents.STRENGTH_BERRIES));
        public static final ConsumedBerry REGENERATION_BERRIES = new ConsumedBerry(new Item.Settings().food(FoodComponents.REGENERATION_BERRIES));
        public static final ConsumedBerry LEAPING_BERRIES = new ConsumedBerry(new Item.Settings().food(FoodComponents.LEAPING_BERRIES));
        public static final ConsumedBerry NIGHT_BERRIES = new ConsumedBerry(new Item.Settings().food(FoodComponents.NIGHT_BERRIES));
        public static final ConsumedBerry FIRE_BERRIES = new ConsumedBerry(new Item.Settings().food(FoodComponents.FIRE_BERRIES).fireproof());
        public static final ConsumedBerry RESISTANCE_BERRIES = new ConsumedBerry(new Item.Settings().food(FoodComponents.RESISTANCE_BERRIES));
        public static final ConsumedBerry HEALING_BERRIES = new ConsumedBerry(new Item.Settings().food(FoodComponents.HEALING_BERRIES));
        public static final ConsumedBerry ASCENDING_BERRIES = new ConsumedBerry(new Item.Settings().food(FoodComponents.ASCENDING_BERRIES));
        public static final ConsumedBerry INVISIBILITY_BERRIES = new ConsumedBerry(new Item.Settings().food(FoodComponents.INVISIBILITY_BERRIES));
        public static final ConsumedBerry GOLDEN_BERRIES = new ConsumedBerry(new Item.Settings().food(FoodComponents.GOLDEN_BERRIES).rarity(Rarity.RARE));
        public static final ConsumedBerry DOLPHIN_BERRIES = new ConsumedBerry(new Item.Settings().food(FoodComponents.DOLPHIN_BERRIES));
        public static final ConsumedBerry SEA_BERRIES = new ConsumedBerry(new FabricItemSettings().food(FoodComponents.SEA_BERRIES));
        public static final ConsumedBerry ROTTEN_BERRIES = new ConsumedBerry(new FabricItemSettings().food(FoodComponents.ROTTEN_BERRIES));

        public static void registerModItems() {
                Registry.register(Registries.ITEM, new Identifier("strangeberries", "rotten_berries"), ROTTEN_BERRIES);
                Registry.register(Registries.ITEM, new Identifier("strangeberries", "speed_berries"), SPEED_BERRIES);
                Registry.register(Registries.ITEM, new Identifier("strangeberries", "haste_berries"), HASTE_BERRIES);
                Registry.register(Registries.ITEM, new Identifier("strangeberries", "strength_berries"), STRENGTH_BERRIES);
                Registry.register(Registries.ITEM, new Identifier("strangeberries", "regeneration_berries"), REGENERATION_BERRIES);
                Registry.register(Registries.ITEM, new Identifier("strangeberries", "leaping_berries"), LEAPING_BERRIES);
                Registry.register(Registries.ITEM, new Identifier("strangeberries", "night_berries"), NIGHT_BERRIES);
                Registry.register(Registries.ITEM, new Identifier("strangeberries", "fire_berries"), FIRE_BERRIES);
                Registry.register(Registries.ITEM, new Identifier("strangeberries", "resistance_berries"), RESISTANCE_BERRIES);
                Registry.register(Registries.ITEM, new Identifier("strangeberries", "healing_berries"), HEALING_BERRIES);
                Registry.register(Registries.ITEM, new Identifier("strangeberries", "ascending_berries"), ASCENDING_BERRIES);
                Registry.register(Registries.ITEM, new Identifier("strangeberries", "invisibility_berries"), INVISIBILITY_BERRIES);
                Registry.register(Registries.ITEM, new Identifier("strangeberries", "sea_berries"), SEA_BERRIES);
                Registry.register(Registries.ITEM, new Identifier("strangeberries", "dolphin_berries"), DOLPHIN_BERRIES);
                Registry.register(Registries.ITEM, new Identifier("strangeberries", "golden_berries"), GOLDEN_BERRIES);
        }
}
