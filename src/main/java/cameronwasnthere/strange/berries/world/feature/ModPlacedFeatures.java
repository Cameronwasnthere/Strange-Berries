package cameronwasnthere.strange.berries.world.feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.placementmodifier.BiomePlacementModifier;
import net.minecraft.world.gen.placementmodifier.RarityFilterPlacementModifier;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;

public class ModPlacedFeatures {

    public static final RegistryEntry<PlacedFeature> INVISIBILITY_BERRY_BUSH_PLACED = PlacedFeatures.register("invisibility_berry_bush_placed",
            ModConfiguredFeatures.INVISIBILITY_BERRY_BUSH, PlacedFeatures.createCountExtraModifier(10, 1,1 ), SquarePlacementModifier.of(),
            PlacedFeatures.BOTTOM_TO_120_RANGE, BiomePlacementModifier.of());
    public static final RegistryEntry<PlacedFeature> RESISTANCE_BERRY_BUSH_PLACED = PlacedFeatures.register("resistance_berry_bush_placed",
            ModConfiguredFeatures.RESISTANCE_BERRY_BUSH, PlacedFeatures.createCountExtraModifier(8, 1,1 ), SquarePlacementModifier.of(),
            PlacedFeatures.BOTTOM_TO_120_RANGE, BiomePlacementModifier.of());
    public static final RegistryEntry<PlacedFeature> LEAPING_BERRY_BUSH_PLACED = PlacedFeatures.register("leaping_berry_bush_placed",
            ModConfiguredFeatures.LEAPING_BERRY_BUSH, RarityFilterPlacementModifier.of(5), SquarePlacementModifier.of(),
            PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
    public static final RegistryEntry<PlacedFeature> SPEED_BERRY_BUSH_PLACED = PlacedFeatures.register("speed_berry_bush_placed",
            ModConfiguredFeatures.SPEED_BERRY_BUSH, RarityFilterPlacementModifier.of(5), SquarePlacementModifier.of(),
            PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
    public static final RegistryEntry<PlacedFeature> STRENGTH_BERRY_BUSH_PLACED = PlacedFeatures.register("strength_berry_bush_placed",
            ModConfiguredFeatures.STRENGTH_BERRY_BUSH, RarityFilterPlacementModifier.of(5), SquarePlacementModifier.of(),
            PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
    public static final RegistryEntry<PlacedFeature> ASCENDING_BERRY_BUSH_PLACED = PlacedFeatures.register("ascending_berry_bush_placed",
            ModConfiguredFeatures.ASCENDING_BERRY_BUSH, RarityFilterPlacementModifier.of(5), SquarePlacementModifier.of(),
            PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
    public static final RegistryEntry<PlacedFeature> WARPED_FIRE_BERRY_BUSH_PLACED = PlacedFeatures.register("warped_fire_berry_bush_placed",
            ModConfiguredFeatures.WARPED_FIRE_BERRY_BUSH, PlacedFeatures.createCountExtraModifier(12, 1,1 ), SquarePlacementModifier.of(),
            PlacedFeatures.BOTTOM_TO_TOP_RANGE, BiomePlacementModifier.of());
    public static final RegistryEntry<PlacedFeature> CRIMSON_FIRE_BERRY_BUSH_PLACED = PlacedFeatures.register("crimson_fire_berry_bush_placed",
            ModConfiguredFeatures.CRIMSON_FIRE_BERRY_BUSH, PlacedFeatures.createCountExtraModifier(12, 1,1 ), SquarePlacementModifier.of(),
            PlacedFeatures.BOTTOM_TO_TOP_RANGE, BiomePlacementModifier.of());
    public static final RegistryEntry<PlacedFeature> FRUITFUL_BERRY_BUSH_PLACED = PlacedFeatures.register("fruitful_berry_bush_placed",
            ModConfiguredFeatures.FRUITFUL_BERRY_BUSH, RarityFilterPlacementModifier.of(5), SquarePlacementModifier.of(),
            PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
    public static final RegistryEntry<PlacedFeature> HASTE_BERRY_BUSH_PLACED = PlacedFeatures.register("haste_berry_bush_placed",
           ModConfiguredFeatures.HASTE_BERRY_BUSH, PlacedFeatures.createCountExtraModifier(6, 1,1 ), SquarePlacementModifier.of(),
           PlacedFeatures.BOTTOM_TO_120_RANGE, BiomePlacementModifier.of());
    public static final RegistryEntry<PlacedFeature> NIGHT_BERRY_BUSH_PLACED = PlacedFeatures.register("night_berry_bush_placed",
            ModConfiguredFeatures.NIGHT_BERRY_BUSH, RarityFilterPlacementModifier.of(5), SquarePlacementModifier.of(),
            PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
    public static final RegistryEntry<PlacedFeature> ROTTEN_BERRY_BUSH_PLACED = PlacedFeatures.register("rotten_berry_bush_placed",
            ModConfiguredFeatures.ROTTEN_BERRY_BUSH, RarityFilterPlacementModifier.of(5), SquarePlacementModifier.of(),
            PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
    public static final RegistryEntry<PlacedFeature> DOLPHIN_BERRY_BUSH_PLACED = PlacedFeatures.register("dolphin_berry_bush_placed",
            ModConfiguredFeatures.DOLPHIN_BERRY_BUSH, RarityFilterPlacementModifier.of(5), SquarePlacementModifier.of(),
            PlacedFeatures.OCEAN_FLOOR_HEIGHTMAP, BiomePlacementModifier.of()); // TODO: Change chance back to 8 when implemented underwater generation
    public static final RegistryEntry<PlacedFeature> SEA_BERRY_BUSH_PLACED = PlacedFeatures.register("sea_berry_bush_placed",
            ModConfiguredFeatures.SEA_BERRY_BUSH, RarityFilterPlacementModifier.of(5), SquarePlacementModifier.of(),
            PlacedFeatures.OCEAN_FLOOR_HEIGHTMAP, BiomePlacementModifier.of()); // TODO: Change chance back to 8 when implemented underwater generation
}

