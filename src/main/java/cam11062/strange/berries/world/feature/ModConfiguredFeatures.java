package cam11062.strange.berries.world.feature;

import cam11062.strange.berries.StrangeBerries;
import cam11062.strange.berries.block.*;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;

public class ModConfiguredFeatures {

    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> INVISIBILITY_BERRY_BUSH =
            ConfiguredFeatures.register("invisibility_berry_bush", Feature.RANDOM_PATCH,
                    ConfiguredFeatures.createRandomPatchFeatureConfig(6, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                            new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.INVISIBILITY_BERRY_BUSH.getDefaultState().with(InvisibilityBerryBush.AGE, 3))))));
    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> RESISTANCE_BERRY_BUSH =
            ConfiguredFeatures.register("resistance_berry_bush", Feature.RANDOM_PATCH,
                    ConfiguredFeatures.createRandomPatchFeatureConfig(6, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                            new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.RESISTANCE_BERRY_BUSH.getDefaultState().with(ResistanceBerryBush.AGE, 3))))));
    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> LEAPING_BERRY_BUSH =
            ConfiguredFeatures.register("leaping_berry_bush", Feature.RANDOM_PATCH,
                    ConfiguredFeatures.createRandomPatchFeatureConfig(6, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                            new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.LEAPING_BERRY_BUSH.getDefaultState().with(LeapingBerryBush.AGE, 3))))));
    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> SPEED_BERRY_BUSH =
            ConfiguredFeatures.register("speed_berry_bush", Feature.RANDOM_PATCH,
                    ConfiguredFeatures.createRandomPatchFeatureConfig(6, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                            new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.SPEED_BERRY_BUSH.getDefaultState().with(SpeedBerryBush.AGE, 3))))));
    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> STRENGTH_BERRY_BUSH =
            ConfiguredFeatures.register("strength_berry_bush", Feature.RANDOM_PATCH,
                    ConfiguredFeatures.createRandomPatchFeatureConfig(6, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                            new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.STRENGTH_BERRY_BUSH.getDefaultState().with(AscendingBerryBush.AGE, 3))))));
    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> ASCENDING_BERRY_BUSH =
            ConfiguredFeatures.register("ascending_berry_bush", Feature.RANDOM_PATCH,
                    ConfiguredFeatures.createRandomPatchFeatureConfig(6, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                            new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.ASCENDING_BERRY_BUSH.getDefaultState().with(AscendingBerryBush.AGE, 3))))));
    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> WARPED_FIRE_BERRY_BUSH =
            ConfiguredFeatures.register("warped_fire_berry_bush", Feature.RANDOM_PATCH,
                    ConfiguredFeatures.createRandomPatchFeatureConfig(6, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                            new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.WARPED_FIRE_BERRY_BUSH.getDefaultState().with(WarpedFireBerryBush.AGE, 3))))));
    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> CRIMSON_FIRE_BERRY_BUSH =
            ConfiguredFeatures.register("crimson_fire_berry_bush", Feature.RANDOM_PATCH,
                    ConfiguredFeatures.createRandomPatchFeatureConfig(6, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                            new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.CRIMSON_FIRE_BERRY_BUSH.getDefaultState().with(CrimsonFireBerryBush.AGE, 3))))));

    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> FRUITFUL_BERRY_BUSH =
            ConfiguredFeatures.register("fruitful_berry_bush", Feature.RANDOM_PATCH,
                    ConfiguredFeatures.createRandomPatchFeatureConfig(4, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                            new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.FRUITFUL_BERRY_BUSH.getDefaultState().with(FruitfulBerryBush.AGE, 3))))));

    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> HASTE_BERRY_BUSH =
            ConfiguredFeatures.register("haste_berry_bush", Feature.RANDOM_PATCH,
                    ConfiguredFeatures.createRandomPatchFeatureConfig(4, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                            new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.HASTE_BERRY_BUSH.getDefaultState().with(HasteBerryBush.AGE, 3))))));

    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> NIGHT_BERRY_BUSH =
            ConfiguredFeatures.register("night_berry_bush", Feature.RANDOM_PATCH,
                    ConfiguredFeatures.createRandomPatchFeatureConfig(4, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                            new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.NIGHT_BERRY_BUSH.getDefaultState().with(NightBerryBush.AGE, 3))))));

    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> ROTTEN_BERRY_BUSH =
            ConfiguredFeatures.register("rotten_berry_bush", Feature.RANDOM_PATCH,
                    ConfiguredFeatures.createRandomPatchFeatureConfig(4, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                            new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.ROTTEN_BERRY_BUSH.getDefaultState().with(RottenBerryBush.AGE, 3))))));

    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> SEA_BERRY_BUSH =
            ConfiguredFeatures.register("sea_berry_bush", Feature.RANDOM_PATCH,
                    ConfiguredFeatures.createRandomPatchFeatureConfig(4, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                            new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.SEA_BERRY_BUSH.getDefaultState().with(SeaBerryBush.AGE, 3))))));
}
