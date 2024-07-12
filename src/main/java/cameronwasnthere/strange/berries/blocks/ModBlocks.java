package cameronwasnthere.strange.berries.blocks;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.CropBlock;
import net.minecraft.registry.Registries;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;

public class ModBlocks {
    public static final FruitfulBerryBush FRUITFUL_BERRY_BUSH = new FruitfulBerryBush(AbstractBlock.Settings.create()
            .resistance(0)
            .nonOpaque()
            .luminance(state -> 5)
            .noCollision()
            .ticksRandomly()
            .breakInstantly()
            .sounds(BlockSoundGroup.CROP));

    public static final HealingBerryBush HEALING_BERRY_BUSH = new HealingBerryBush(AbstractBlock.Settings.create()
            .resistance(0)
            .nonOpaque()
            .luminance(state -> 5)
            .noCollision()
            .ticksRandomly()
            .breakInstantly()
            .sounds(BlockSoundGroup.CROP));

    public static final RegenerationBerryBush REGENERATION_BERRY_BUSH = new RegenerationBerryBush(AbstractBlock.Settings.create()
            .resistance(0)
            .nonOpaque()
            .luminance(state -> 5)
            .noCollision()
            .ticksRandomly()
            .breakInstantly()
            .sounds(BlockSoundGroup.CROP));

    public static final RottenBerryBush ROTTEN_BERRY_BUSH = new RottenBerryBush(AbstractBlock.Settings.create()
            .resistance(0)
            .nonOpaque()
            .noCollision()
            .ticksRandomly()
            .breakInstantly()
            .sounds(BlockSoundGroup.CROP));

    public static final HasteBerryBush HASTE_BERRY_BUSH = new HasteBerryBush(AbstractBlock.Settings.create()
            .nonOpaque()
            .luminance(state -> 5)
            .noCollision()
            .ticksRandomly()
            .strength(1, 3)
            .sounds(BlockSoundGroup.STONE));

    public static final SeaBerryBush SEA_BERRY_BUSH = new SeaBerryBush(AbstractBlock.Settings.create()
            .resistance(0)
            .nonOpaque()
            .luminance(state -> 5)
            .noCollision()
            .ticksRandomly()
            .breakInstantly()
            .sounds(BlockSoundGroup.CROP));

    public static final DolphinBerryBush DOLPHIN_BERRY_BUSH = new DolphinBerryBush(AbstractBlock.Settings.create()
            .resistance(0)
            .nonOpaque()
            .luminance(state -> 5)
            .noCollision()
            .ticksRandomly()
            .breakInstantly()
            .sounds(BlockSoundGroup.CROP));

    public static final NightBerryBush NIGHT_BERRY_BUSH = new NightBerryBush(AbstractBlock.Settings.create()
            .resistance(0)
            .nonOpaque()
            .noCollision()
            .ticksRandomly()
            .breakInstantly()
            .sounds(BlockSoundGroup.CROP));

    public static final CrimsonFireBerryBush CRIMSON_FIRE_BERRY_BUSH = new CrimsonFireBerryBush(AbstractBlock.Settings.create()
            .resistance(0.4f)
            .nonOpaque()
            .luminance(state -> 5)
            .noCollision()
            .ticksRandomly()
            .breakInstantly()
            .sounds(BlockSoundGroup.CROP));

    public static final WarpedFireBerryBush WARPED_FIRE_BERRY_BUSH = new WarpedFireBerryBush(AbstractBlock.Settings.create()
            .resistance(0.4f)
            .nonOpaque()
            .luminance(state -> 5)
            .noCollision()
            .ticksRandomly()
            .breakInstantly()
            .sounds(BlockSoundGroup.CROP));

    public static final AscendingBerryBush ASCENDING_BERRY_BUSH = new AscendingBerryBush(AbstractBlock.Settings.create()
            .resistance(0)
            .nonOpaque()
            .luminance(state -> 5)
            .noCollision()
            .ticksRandomly()
            .breakInstantly()
            .sounds(BlockSoundGroup.CROP));

    public static final StrengthBerryBush STRENGTH_BERRY_BUSH = new StrengthBerryBush(AbstractBlock.Settings.create()
            .resistance(0)
            .nonOpaque()
            .luminance(state -> 5)
            .noCollision()
            .ticksRandomly()
            .breakInstantly()
            .sounds(BlockSoundGroup.CROP));

    public static final SpeedBerryBush SPEED_BERRY_BUSH = new SpeedBerryBush(AbstractBlock.Settings.create()
            .resistance(0)
            .nonOpaque()
            .luminance(state -> 5)
            .noCollision()
            .ticksRandomly()
            .breakInstantly()
            .sounds(BlockSoundGroup.CROP));

    public static final LeapingBerryBush LEAPING_BERRY_BUSH = new LeapingBerryBush(AbstractBlock.Settings.create()
            .resistance(0)
            .nonOpaque()
            .luminance(state -> 5)
            .noCollision()
            .ticksRandomly()
            .breakInstantly()
            .sounds(BlockSoundGroup.CROP));

    public static final ResistanceBerryBush RESISTANCE_BERRY_BUSH = new ResistanceBerryBush(AbstractBlock.Settings.create()
            .nonOpaque()
            .luminance(state -> 5)
            .noCollision()
            .ticksRandomly()
            .strength(3, 15)
            .sounds(BlockSoundGroup.DEEPSLATE));

    public static final InvisibilityBerryBush INVISIBILITY_BERRY_BUSH = new InvisibilityBerryBush(AbstractBlock.Settings.create()
            .nonOpaque()
            .luminance(state -> 5)
            .noCollision()
            .ticksRandomly()
            .strength(1, 3)
            .sounds(BlockSoundGroup.SCULK));

    public static final GoldenBerryBush GOLDEN_BERRY_BUSH = new GoldenBerryBush(AbstractBlock.Settings.create()
            .resistance(0)
            .nonOpaque()
            .luminance(state -> 5)
            .noCollision()
            .ticksRandomly()
            .breakInstantly()
            .sounds(BlockSoundGroup.CROP));

    public static void registerModBlocks() {
        Registry.register(Registries.BLOCK, Identifier.of("strangeberries", "fruitful_berry_bush"), FRUITFUL_BERRY_BUSH);
        Registry.register(Registries.BLOCK, Identifier.of("strangeberries", "healing_berry_bush"), HEALING_BERRY_BUSH);
        Registry.register(Registries.BLOCK, Identifier.of("strangeberries", "regeneration_berry_bush"), REGENERATION_BERRY_BUSH);
        Registry.register(Registries.BLOCK, Identifier.of("strangeberries", "rotten_berry_bush"), ROTTEN_BERRY_BUSH);
        Registry.register(Registries.BLOCK, Identifier.of("strangeberries", "haste_berry_bush"), HASTE_BERRY_BUSH);
        Registry.register(Registries.BLOCK, Identifier.of("strangeberries", "sea_berry_bush"), SEA_BERRY_BUSH);
        Registry.register(Registries.BLOCK, Identifier.of("strangeberries", "dolphin_berry_bush"), DOLPHIN_BERRY_BUSH);
        Registry.register(Registries.BLOCK, Identifier.of("strangeberries", "night_berry_bush"), NIGHT_BERRY_BUSH);
        Registry.register(Registries.BLOCK, Identifier.of("strangeberries", "crimson_fire_berry_bush"), CRIMSON_FIRE_BERRY_BUSH);
        Registry.register(Registries.BLOCK, Identifier.of("strangeberries", "warped_fire_berry_bush"), WARPED_FIRE_BERRY_BUSH);
        Registry.register(Registries.BLOCK, Identifier.of("strangeberries", "ascending_berry_bush"), ASCENDING_BERRY_BUSH);
        Registry.register(Registries.BLOCK, Identifier.of("strangeberries", "strength_berry_bush"), STRENGTH_BERRY_BUSH);
        Registry.register(Registries.BLOCK, Identifier.of("strangeberries", "speed_berry_bush"), SPEED_BERRY_BUSH);
        Registry.register(Registries.BLOCK, Identifier.of("strangeberries", "leaping_berry_bush"), LEAPING_BERRY_BUSH);
        Registry.register(Registries.BLOCK, Identifier.of("strangeberries", "resistance_berry_bush"), RESISTANCE_BERRY_BUSH);
        Registry.register(Registries.BLOCK, Identifier.of("strangeberries", "invisibility_berry_bush"), INVISIBILITY_BERRY_BUSH);
        Registry.register(Registries.BLOCK, Identifier.of("strangeberries", "golden_berry_bush"), GOLDEN_BERRY_BUSH);
    }
}
