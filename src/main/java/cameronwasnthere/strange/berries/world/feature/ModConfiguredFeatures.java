package cameronwasnthere.strange.berries.world.feature;

import cameronwasnthere.strange.berries.StrangeBerries;
import cameronwasnthere.strange.berries.blocks.*;
import cameronwasnthere.strange.berries.blocks.ModBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;

public class ModConfiguredFeatures {

    public static final RegistryKey<ConfiguredFeature<?,?>> INVISIBILITY_BERRY_BUSH_KEY = registerKey("invisibility_berry_bush");
    public static final RegistryKey<ConfiguredFeature<?,?>> RESISTANCE_BERRY_BUSH_KEY = registerKey("resistance_berry_bush");
    public static final RegistryKey<ConfiguredFeature<?,?>> LEAPING_BERRY_BUSH_KEY = registerKey("leaping_berry_bush");
    public static final RegistryKey<ConfiguredFeature<?,?>> SPEED_BERRY_BUSH_KEY = registerKey("speed_berry_bush");
    public static final RegistryKey<ConfiguredFeature<?,?>> STRENGTH_BERRY_BUSH_KEY = registerKey("strength_berry_bush");
    public static final RegistryKey<ConfiguredFeature<?,?>> ASCENDING_BERRY_BUSH_KEY = registerKey("ascending_berry_bush");
    public static final RegistryKey<ConfiguredFeature<?,?>> WARPED_FIRE_BERRY_BUSH_KEY = registerKey("warped_berry_bush");
    public static final RegistryKey<ConfiguredFeature<?,?>> CRIMSON_FIRE_BERRY_BUSH_KEY = registerKey("crimson_berry_bush");
    public static final RegistryKey<ConfiguredFeature<?,?>> FRUITFUL_BERRY_BUSH_KEY = registerKey("fruitful_berry_bush");
    public static final RegistryKey<ConfiguredFeature<?,?>> HASTE_BERRY_BUSH_KEY = registerKey("haste_berry_bush");
    public static final RegistryKey<ConfiguredFeature<?,?>> NIGHT_BERRY_BUSH_KEY = registerKey("night_berry_bush");
    public static final RegistryKey<ConfiguredFeature<?,?>> ROTTEN_BERRY_BUSH_KEY = registerKey("rotten_berry_bush");
    public static final RegistryKey<ConfiguredFeature<?,?>> SEA_BERRY_BUSH_KEY = registerKey("sea_berry_bush");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        register(context, INVISIBILITY_BERRY_BUSH_KEY, Feature.RANDOM_PATCH,
                ConfiguredFeatures.createRandomPatchFeatureConfig(6, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.INVISIBILITY_BERRY_BUSH.getDefaultState().with(InvisibilityBerryBush.AGE, 3))))));

        register(context, RESISTANCE_BERRY_BUSH_KEY, Feature.RANDOM_PATCH,
                ConfiguredFeatures.createRandomPatchFeatureConfig(6, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.RESISTANCE_BERRY_BUSH.getDefaultState().with(ResistanceBerryBush.AGE, 3))))));

        register(context, LEAPING_BERRY_BUSH_KEY, Feature.RANDOM_PATCH,
                ConfiguredFeatures.createRandomPatchFeatureConfig(6, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.LEAPING_BERRY_BUSH.getDefaultState().with(LeapingBerryBush.AGE, 3))))));

        register(context, SPEED_BERRY_BUSH_KEY, Feature.RANDOM_PATCH,
                ConfiguredFeatures.createRandomPatchFeatureConfig(6, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.SPEED_BERRY_BUSH.getDefaultState().with(SpeedBerryBush.AGE, 3))))));

        register(context, STRENGTH_BERRY_BUSH_KEY, Feature.RANDOM_PATCH,
                ConfiguredFeatures.createRandomPatchFeatureConfig(6, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.STRENGTH_BERRY_BUSH.getDefaultState().with(StrengthBerryBush.AGE, 3))))));

        register(context, ASCENDING_BERRY_BUSH_KEY, Feature.RANDOM_PATCH,
                ConfiguredFeatures.createRandomPatchFeatureConfig(6, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.ASCENDING_BERRY_BUSH.getDefaultState().with(AscendingBerryBush.AGE, 3))))));

        register(context, WARPED_FIRE_BERRY_BUSH_KEY, Feature.RANDOM_PATCH,
                ConfiguredFeatures.createRandomPatchFeatureConfig(6, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.WARPED_FIRE_BERRY_BUSH.getDefaultState().with(WarpedFireBerryBush.AGE, 3))))));

        register(context, CRIMSON_FIRE_BERRY_BUSH_KEY, Feature.RANDOM_PATCH,
                ConfiguredFeatures.createRandomPatchFeatureConfig(6, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.CRIMSON_FIRE_BERRY_BUSH.getDefaultState().with(CrimsonFireBerryBush.AGE, 3))))));

        register(context, FRUITFUL_BERRY_BUSH_KEY, Feature.RANDOM_PATCH,
                ConfiguredFeatures.createRandomPatchFeatureConfig(6, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.FRUITFUL_BERRY_BUSH.getDefaultState().with(FruitfulBerryBush.AGE, 3))))));

        register(context, HASTE_BERRY_BUSH_KEY, Feature.RANDOM_PATCH,
                ConfiguredFeatures.createRandomPatchFeatureConfig(6, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.HASTE_BERRY_BUSH.getDefaultState().with(HasteBerryBush.AGE, 3))))));

        register(context, NIGHT_BERRY_BUSH_KEY, Feature.RANDOM_PATCH,
                ConfiguredFeatures.createRandomPatchFeatureConfig(6, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.NIGHT_BERRY_BUSH.getDefaultState().with(NightBerryBush.AGE, 3))))));

        register(context, ROTTEN_BERRY_BUSH_KEY, Feature.RANDOM_PATCH,
                ConfiguredFeatures.createRandomPatchFeatureConfig(6, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.ROTTEN_BERRY_BUSH.getDefaultState().with(RottenBerryBush.AGE, 3))))));

        register(context, SEA_BERRY_BUSH_KEY, Feature.RANDOM_PATCH,
                ConfiguredFeatures.createRandomPatchFeatureConfig(6, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.SEA_BERRY_BUSH.getDefaultState().with(SeaBerryBush.AGE, 3))))));
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(StrangeBerries.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context, RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
