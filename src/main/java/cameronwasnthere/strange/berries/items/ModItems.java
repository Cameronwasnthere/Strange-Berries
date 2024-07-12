package cameronwasnthere.strange.berries.items;

import cameronwasnthere.strange.berries.blocks.ModBlocks;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.registry.Registry;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ModItems {
        public static final List<Item> BERRIES = new ArrayList<>();

        public static final BerryItem SPEED_BERRIES = new BerryItem(ModBlocks.SPEED_BERRY_BUSH, new Item.Settings().food(FoodComponents.SPEED_BERRIES));
        public static final BerryItem HASTE_BERRIES = new BerryItem(ModBlocks.HASTE_BERRY_BUSH, new Item.Settings().food(FoodComponents.HASTE_BERRIES));
        public static final BerryItem STRENGTH_BERRIES = new BerryItem(ModBlocks.STRENGTH_BERRY_BUSH, new Item.Settings().food(FoodComponents.STRENGTH_BERRIES));
        public static final BerryItem REGENERATION_BERRIES = new BerryItem(ModBlocks.REGENERATION_BERRY_BUSH,new Item.Settings().food(FoodComponents.REGENERATION_BERRIES));
        public static final BerryItem LEAPING_BERRIES = new BerryItem(ModBlocks.LEAPING_BERRY_BUSH,new Item.Settings().food(FoodComponents.LEAPING_BERRIES));
        public static final BerryItem NIGHT_BERRIES = new BerryItem(ModBlocks.NIGHT_BERRY_BUSH, new Item.Settings().food(FoodComponents.NIGHT_BERRIES));
        public static final BerryItem CRIMSON_FIRE_BERRIES = new BerryItem(ModBlocks.CRIMSON_FIRE_BERRY_BUSH, new Item.Settings().food(FoodComponents.FIRE_BERRIES).fireproof());
        public static final BerryItem WARPED_FIRE_BERRIES = new BerryItem(ModBlocks.WARPED_FIRE_BERRY_BUSH, new Item.Settings().food(FoodComponents.FIRE_BERRIES).fireproof());
        public static final BerryItem RESISTANCE_BERRIES = new BerryItem(ModBlocks.RESISTANCE_BERRY_BUSH, new Item.Settings().food(FoodComponents.RESISTANCE_BERRIES));
        public static final BerryItem HEALING_BERRIES = new BerryItem(ModBlocks.HEALING_BERRY_BUSH, new Item.Settings().food(FoodComponents.HEALING_BERRIES));
        public static final BerryItem ASCENDING_BERRIES = new BerryItem(ModBlocks.ASCENDING_BERRY_BUSH, new Item.Settings().food(FoodComponents.ASCENDING_BERRIES));
        public static final BerryItem INVISIBILITY_BERRIES = new BerryItem(ModBlocks.INVISIBILITY_BERRY_BUSH, new Item.Settings().food(FoodComponents.INVISIBILITY_BERRIES));
        public static final BerryItem GOLDEN_BERRIES = new BerryItem(ModBlocks.GOLDEN_BERRY_BUSH, new Item.Settings().food(FoodComponents.GOLDEN_BERRIES).rarity(Rarity.RARE));
        public static final BerryItem DOLPHIN_BERRIES = new BerryItem(ModBlocks.DOLPHIN_BERRY_BUSH, new Item.Settings().food(FoodComponents.DOLPHIN_BERRIES));
        public static final BerryItem SEA_BERRIES = new BerryItem(ModBlocks.SEA_BERRY_BUSH, new Item.Settings().food(FoodComponents.SEA_BERRIES));
        public static final BerryItem ROTTEN_BERRIES = new BerryItem(ModBlocks.ROTTEN_BERRY_BUSH, new Item.Settings().food(FoodComponents.ROTTEN_BERRIES));

        public static void registerBerriesItemList() {
                BERRIES.add(SPEED_BERRIES);
                BERRIES.add(HASTE_BERRIES);
                BERRIES.add(STRENGTH_BERRIES);
                BERRIES.add(REGENERATION_BERRIES);
                BERRIES.add(LEAPING_BERRIES);
                BERRIES.add(NIGHT_BERRIES);
                BERRIES.add(CRIMSON_FIRE_BERRIES);
                BERRIES.add(WARPED_FIRE_BERRIES);
                BERRIES.add(RESISTANCE_BERRIES);
                BERRIES.add(HEALING_BERRIES);
                BERRIES.add(ASCENDING_BERRIES);
                BERRIES.add(INVISIBILITY_BERRIES);
                BERRIES.add(GOLDEN_BERRIES);
                BERRIES.add(DOLPHIN_BERRIES);
                BERRIES.add(SEA_BERRIES);
                BERRIES.add(ROTTEN_BERRIES);
        }

        public static void registerModItems() {
                Registry.register(Registries.ITEM, Identifier.of("strangeberries", "rotten_berries"), ROTTEN_BERRIES);
                Registry.register(Registries.ITEM, Identifier.of("strangeberries", "speed_berries"), SPEED_BERRIES);
                Registry.register(Registries.ITEM, Identifier.of("strangeberries", "haste_berries"), HASTE_BERRIES);
                Registry.register(Registries.ITEM, Identifier.of("strangeberries", "strength_berries"), STRENGTH_BERRIES);
                Registry.register(Registries.ITEM, Identifier.of("strangeberries", "regeneration_berries"), REGENERATION_BERRIES);
                Registry.register(Registries.ITEM, Identifier.of("strangeberries", "leaping_berries"), LEAPING_BERRIES);
                Registry.register(Registries.ITEM, Identifier.of("strangeberries", "night_berries"), NIGHT_BERRIES);
                Registry.register(Registries.ITEM, Identifier.of("strangeberries", "crimson_fire_berries"), CRIMSON_FIRE_BERRIES);
                Registry.register(Registries.ITEM, Identifier.of("strangeberries", "warped_fire_berries"), WARPED_FIRE_BERRIES);
                Registry.register(Registries.ITEM, Identifier.of("strangeberries", "resistance_berries"), RESISTANCE_BERRIES);
                Registry.register(Registries.ITEM, Identifier.of("strangeberries", "healing_berries"), HEALING_BERRIES);
                Registry.register(Registries.ITEM, Identifier.of("strangeberries", "ascending_berries"), ASCENDING_BERRIES);
                Registry.register(Registries.ITEM, Identifier.of("strangeberries", "invisibility_berries"), INVISIBILITY_BERRIES);
                Registry.register(Registries.ITEM, Identifier.of("strangeberries", "sea_berries"), SEA_BERRIES);
                Registry.register(Registries.ITEM, Identifier.of("strangeberries", "dolphin_berries"), DOLPHIN_BERRIES);
                Registry.register(Registries.ITEM, Identifier.of("strangeberries", "golden_berries"), GOLDEN_BERRIES);
        }
}
