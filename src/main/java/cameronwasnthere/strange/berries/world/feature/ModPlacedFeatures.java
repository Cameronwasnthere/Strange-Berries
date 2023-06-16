package cameronwasnthere.strange.berries.world.feature;

import cameronwasnthere.strange.berries.StrangeBerries;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.BiomePlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;
import net.minecraft.world.gen.placementmodifier.RarityFilterPlacementModifier;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;
import java.util.List;

public class ModPlacedFeatures {
    public static final RegistryKey<PlacedFeature> INVISIBILITY_BERRY_BUSH_PLACED_KEY = registerKey("invisibility_berry_bush_placed");
    public static final RegistryKey<PlacedFeature> RESISTANCE_BERRY_BUSH_PLACED_KEY = registerKey("resistance_berry_bush_placed");
    public static final RegistryKey<PlacedFeature> LEAPING_BERRY_BUSH_PLACED_KEY = registerKey("leaping_berry_bush_placed");
    public static final RegistryKey<PlacedFeature> SPEED_BERRY_BUSH_PLACED_KEY = registerKey("speed_berry_bush_placed");
    public static final RegistryKey<PlacedFeature> STRENGTH_BERRY_BUSH_PLACED_KEY = registerKey("strength_berry_bush_placed");
    public static final RegistryKey<PlacedFeature> ASCENDING_BERRY_BUSH_PLACED_KEY = registerKey("ascending_berry_bush_placed");
    public static final RegistryKey<PlacedFeature> WARPED_FIRE_BERRY_BUSH_PLACED_KEY = registerKey("warped_berry_bush_placed");
    public static final RegistryKey<PlacedFeature> CRIMSON_FIRE_BERRY_BUSH_PLACED_KEY = registerKey("crimson_fire_berry_bush_placed");
    public static final RegistryKey<PlacedFeature> FRUITFUL_BERRY_BUSH_PLACED_KEY = registerKey("fruitful_berry_bush_placed");
    public static final RegistryKey<PlacedFeature> HASTE_BERRY_BUSH_PLACED_KEY = registerKey("haste_berry_bush_placed");
    public static final RegistryKey<PlacedFeature> NIGHT_BERRY_BUSH_PLACED_KEY = registerKey("night_berry_bush_placed");
    public static final RegistryKey<PlacedFeature> ROTTEN_BERRY_BUSH_PLACED_KEY = registerKey("rotten_berry_bush_placed");
    public static final RegistryKey<PlacedFeature> SEA_BERRY_BUSH_PLACED_KEY = registerKey("sea_berry_bush_placed");

    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, INVISIBILITY_BERRY_BUSH_PLACED_KEY,
                configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.INVISIBILITY_BERRY_BUSH_KEY),
                        PlacedFeatures.createCountExtraModifier(10, 1,1), SquarePlacementModifier.of(),
                                PlacedFeatures.BOTTOM_TO_120_RANGE, BiomePlacementModifier.of());

        register(context, RESISTANCE_BERRY_BUSH_PLACED_KEY,
                configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.RESISTANCE_BERRY_BUSH_KEY),
                        PlacedFeatures.createCountExtraModifier(10, 1,1), SquarePlacementModifier.of(),
                                PlacedFeatures.BOTTOM_TO_120_RANGE, BiomePlacementModifier.of());

        register(context, LEAPING_BERRY_BUSH_PLACED_KEY,
                configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.LEAPING_BERRY_BUSH_KEY),
                (RarityFilterPlacementModifier.of(5)), SquarePlacementModifier.of(),
                                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

        register(context, SPEED_BERRY_BUSH_PLACED_KEY,
                configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.SPEED_BERRY_BUSH_KEY),
                        (RarityFilterPlacementModifier.of(5)), SquarePlacementModifier.of(),
                                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

        register(context, STRENGTH_BERRY_BUSH_PLACED_KEY,
                configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.STRENGTH_BERRY_BUSH_KEY),
                        (RarityFilterPlacementModifier.of(5)), SquarePlacementModifier.of(),
                                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

        register(context, ASCENDING_BERRY_BUSH_PLACED_KEY,
                configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ASCENDING_BERRY_BUSH_KEY),
                        (RarityFilterPlacementModifier.of(5)), SquarePlacementModifier.of(),
                                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

        register(context, WARPED_FIRE_BERRY_BUSH_PLACED_KEY,
                configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.WARPED_FIRE_BERRY_BUSH_KEY),
                        PlacedFeatures.createCountExtraModifier(10, 1,1), SquarePlacementModifier.of(),
                                PlacedFeatures.BOTTOM_TO_120_RANGE, BiomePlacementModifier.of());

        register(context, CRIMSON_FIRE_BERRY_BUSH_PLACED_KEY,
                configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.CRIMSON_FIRE_BERRY_BUSH_KEY),
                        PlacedFeatures.createCountExtraModifier(10, 1,1), SquarePlacementModifier.of(),
                                PlacedFeatures.BOTTOM_TO_120_RANGE, BiomePlacementModifier.of());

        register(context, FRUITFUL_BERRY_BUSH_PLACED_KEY,
                configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.FRUITFUL_BERRY_BUSH_KEY),
                        (RarityFilterPlacementModifier.of(5)), SquarePlacementModifier.of(),
                                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

        register(context, HASTE_BERRY_BUSH_PLACED_KEY,
                configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.HASTE_BERRY_BUSH_KEY),
                        PlacedFeatures.createCountExtraModifier(10, 1,1), SquarePlacementModifier.of(),
                                PlacedFeatures.BOTTOM_TO_120_RANGE, BiomePlacementModifier.of());

        register(context, NIGHT_BERRY_BUSH_PLACED_KEY,
                configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.NIGHT_BERRY_BUSH_KEY),
                        (RarityFilterPlacementModifier.of(5)), SquarePlacementModifier.of(),
                                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

        register(context, ROTTEN_BERRY_BUSH_PLACED_KEY,
                configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ROTTEN_BERRY_BUSH_KEY),
                        (RarityFilterPlacementModifier.of(5)), SquarePlacementModifier.of(),
                                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

        register(context, SEA_BERRY_BUSH_PLACED_KEY,
                configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.SEA_BERRY_BUSH_KEY),
                        (RarityFilterPlacementModifier.of(5)), SquarePlacementModifier.of(),
                                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
    }

    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(StrangeBerries.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key,
                                                                                   RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                                                                   PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }
}

