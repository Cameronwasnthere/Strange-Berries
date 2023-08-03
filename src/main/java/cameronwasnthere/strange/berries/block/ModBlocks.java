package cameronwasnthere.strange.berries.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final FruitfulBerryBush FRUITFUL_BERRY_BUSH = new FruitfulBerryBush(FabricBlockSettings.of(Material.PLANT)
            .nonOpaque()
            .luminance(5)
            .noCollision()
            .ticksRandomly()
            .breakInstantly()
            .sounds(BlockSoundGroup.CROP));

    public static final HealingBerryBush HEALING_BERRY_BUSH = new HealingBerryBush(FabricBlockSettings.of(Material.PLANT)
            .resistance(0)
            .nonOpaque()
            .luminance(5)
            .noCollision()
            .ticksRandomly()
            .breakInstantly()
            .sounds(BlockSoundGroup.CROP));

    public static final RegenerationBerryBush REGENERATION_BERRY_BUSH = new RegenerationBerryBush(FabricBlockSettings.of(Material.PLANT)
            .resistance(0)
            .nonOpaque()
            .luminance(5)
            .noCollision()
            .ticksRandomly()
            .breakInstantly()
            .sounds(BlockSoundGroup.CROP));

    public static final RottenBerryBush ROTTEN_BERRY_BUSH = new RottenBerryBush(FabricBlockSettings.of(Material.PLANT)
            .nonOpaque()
            .luminance(5)
            .noCollision()
            .ticksRandomly()
            .breakInstantly()
            .sounds(BlockSoundGroup.CROP));

    public static final HasteBerryBush HASTE_BERRY_BUSH = new HasteBerryBush(FabricBlockSettings.of(Material.STONE)
            .nonOpaque()
            .luminance(5)
            .noCollision()
            .ticksRandomly()
            .strength(1, 3)
            .sounds(BlockSoundGroup.STONE));

    public static final SeaBerryBush SEA_BERRY_BUSH = new SeaBerryBush(FabricBlockSettings.of(Material.UNDERWATER_PLANT)
            .nonOpaque()
            .luminance(5)
            .noCollision()
            .ticksRandomly()
            .breakInstantly()
            .sounds(BlockSoundGroup.CROP));

    public static final DolphinBerryBush DOLPHIN_BERRY_BUSH = new DolphinBerryBush(FabricBlockSettings.of(Material.UNDERWATER_PLANT)
            .resistance(0)
            .nonOpaque()
            .luminance(5)
            .noCollision()
            .ticksRandomly()
            .breakInstantly()
            .sounds(BlockSoundGroup.CROP));

    public static final NightBerryBush NIGHT_BERRY_BUSH = new NightBerryBush(FabricBlockSettings.of(Material.PLANT)
            .nonOpaque()
            .luminance(5)
            .noCollision()
            .ticksRandomly()
            .breakInstantly()
            .sounds(BlockSoundGroup.CROP));

    public static final CrimsonFireBerryBush CRIMSON_FIRE_BERRY_BUSH = new CrimsonFireBerryBush(FabricBlockSettings.of(Material.PLANT)
            .nonOpaque()
            .luminance(5)
            .noCollision()
            .ticksRandomly()
            .breakInstantly()
            .sounds(BlockSoundGroup.CROP));

    public static final WarpedFireBerryBush WARPED_FIRE_BERRY_BUSH = new WarpedFireBerryBush(FabricBlockSettings.of(Material.PLANT)
            .nonOpaque()
            .luminance(5)
            .noCollision()
            .ticksRandomly()
            .breakInstantly()
            .sounds(BlockSoundGroup.CROP));

    public static final AscendingBerryBush ASCENDING_BERRY_BUSH = new AscendingBerryBush(FabricBlockSettings.of(Material.PLANT)
            .nonOpaque()
            .luminance(5)
            .noCollision()
            .ticksRandomly()
            .breakInstantly()
            .sounds(BlockSoundGroup.CROP));

    public static final StrengthBerryBush STRENGTH_BERRY_BUSH = new StrengthBerryBush(FabricBlockSettings.of(Material.PLANT)
            .nonOpaque()
            .luminance(5)
            .noCollision()
            .ticksRandomly()
            .breakInstantly()
            .sounds(BlockSoundGroup.CROP));

    public static final SpeedBerryBush SPEED_BERRY_BUSH = new SpeedBerryBush(FabricBlockSettings.of(Material.PLANT)
            .nonOpaque()
            .luminance(5)
            .noCollision()
            .ticksRandomly()
            .breakInstantly()
            .sounds(BlockSoundGroup.CROP));

    public static final LeapingBerryBush LEAPING_BERRY_BUSH = new LeapingBerryBush(FabricBlockSettings.of(Material.PLANT)
            .nonOpaque()
            .luminance(5)
            .noCollision()
            .ticksRandomly()
            .breakInstantly()
            .sounds(BlockSoundGroup.CROP));

    public static final ResistanceBerryBush RESISTANCE_BERRY_BUSH = new ResistanceBerryBush(FabricBlockSettings.of(Material.STONE)
            .nonOpaque()
            .luminance(5)
            .noCollision()
            .ticksRandomly()
            .strength(3, 15)
            .sounds(BlockSoundGroup.DEEPSLATE));

    public static final InvisibilityBerryBush INVISIBILITY_BERRY_BUSH = new InvisibilityBerryBush(FabricBlockSettings.of(Material.STONE)
            .nonOpaque()
            .luminance(5)
            .noCollision()
            .ticksRandomly()
            .strength(1, 3)
            .sounds(BlockSoundGroup.SCULK));

    public static final GoldenBerryBush GOLDEN_BERRY_BUSH = new GoldenBerryBush(FabricBlockSettings.of(Material.PLANT)
            .resistance(0)
            .nonOpaque()
            .luminance(5)
            .noCollision()
            .ticksRandomly()
            .breakInstantly()
            .sounds(BlockSoundGroup.CROP));

    public static void registerBlocks() {

        Registry.register(Registry.BLOCK, new Identifier("strangeberries", "fruitful_berry_bush"), FRUITFUL_BERRY_BUSH);
        Registry.register(Registry.BLOCK, new Identifier("strangeberries", "regeneration_berry_bush"), REGENERATION_BERRY_BUSH);
        Registry.register(Registry.BLOCK, new Identifier("strangeberries", "healing_berry_bush"), HEALING_BERRY_BUSH);
        Registry.register(Registry.BLOCK, new Identifier("strangeberries", "rotten_berry_bush"), ROTTEN_BERRY_BUSH);
        Registry.register(Registry.BLOCK, new Identifier("strangeberries", "haste_berry_bush"), HASTE_BERRY_BUSH);
        Registry.register(Registry.BLOCK, new Identifier("strangeberries", "sea_berry_bush"), SEA_BERRY_BUSH);
        Registry.register(Registry.BLOCK, new Identifier("strangeberries", "dolphin_berry_bush"), DOLPHIN_BERRY_BUSH);
        Registry.register(Registry.BLOCK, new Identifier("strangeberries", "night_berry_bush"), NIGHT_BERRY_BUSH);
        Registry.register(Registry.BLOCK, new Identifier("strangeberries", "crimson_fire_berry_bush"), CRIMSON_FIRE_BERRY_BUSH);
        Registry.register(Registry.BLOCK, new Identifier("strangeberries", "warped_fire_berry_bush"), WARPED_FIRE_BERRY_BUSH);
        Registry.register(Registry.BLOCK, new Identifier("strangeberries", "ascending_berry_bush"), ASCENDING_BERRY_BUSH);
        Registry.register(Registry.BLOCK, new Identifier("strangeberries", "strength_berry_bush"), STRENGTH_BERRY_BUSH);
        Registry.register(Registry.BLOCK, new Identifier("strangeberries", "speed_berry_bush"), SPEED_BERRY_BUSH);
        Registry.register(Registry.BLOCK, new Identifier("strangeberries", "leaping_berry_bush"), LEAPING_BERRY_BUSH);
        Registry.register(Registry.BLOCK, new Identifier("strangeberries", "resistance_berry_bush"), RESISTANCE_BERRY_BUSH);
        Registry.register(Registry.BLOCK, new Identifier("strangeberries", "invisibility_berry_bush"), INVISIBILITY_BERRY_BUSH);
        Registry.register(Registry.BLOCK, new Identifier("strangeberries", "golden_berry_bush"), GOLDEN_BERRY_BUSH);
    }
}
