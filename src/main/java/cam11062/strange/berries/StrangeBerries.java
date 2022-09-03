package cam11062.strange.berries;

import cam11062.strange.berries.block.*;
import cam11062.strange.berries.event.ConsumedBerry;
import cam11062.strange.berries.event.PlayerTickHandler;
import cam11062.strange.berries.item.FoodComponents;
import cam11062.strange.berries.networking.BerrySickness;
import cam11062.strange.berries.block.ModBlocks;
import cam11062.strange.berries.effect.ModEffects;
import cam11062.strange.berries.item.ModItems;
import cam11062.strange.berries.potion.ModPotions;
import cam11062.strange.berries.world.gen.WorldGen;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class StrangeBerries implements ModInitializer {

	public static final String MOD_ID = "strangeberries";

	private static final ItemGroup GROUP = FabricItemGroupBuilder.build(new Identifier("strangeberries", "strangeberries"), () -> new ItemStack(StrangeBerries.GOLDEN_BERRIES));

	public static final FruitfulBerryBush FRUITFUL_BERRY_BUSH = new FruitfulBerryBush(FabricBlockSettings.of(Material.PLANT)
			.nonOpaque()
			.noCollision()
			.ticksRandomly()
			.breakInstantly()
			.sounds(BlockSoundGroup.CROP));
	public static final RottenBerryBush ROTTEN_BERRY_BUSH = new RottenBerryBush(FabricBlockSettings.of(Material.PLANT)
			.nonOpaque()
			.noCollision()
			.ticksRandomly()
			.breakInstantly()
			.sounds(BlockSoundGroup.CROP));
	public static final HasteBerryBush HASTE_BERRY_BUSH = new HasteBerryBush(FabricBlockSettings.of(Material.STONE)
			.nonOpaque()
			.noCollision()
			.ticksRandomly()
			.strength(1, 3)
			.sounds(BlockSoundGroup.STONE));
	public static final SeaBerryBush SEA_BERRY_BUSH = new SeaBerryBush(FabricBlockSettings.of(Material.PLANT)
			.nonOpaque()
			.noCollision()
			.ticksRandomly()
			.breakInstantly()
			.sounds(BlockSoundGroup.CROP));
	public static final NightBerryBush NIGHT_BERRY_BUSH = new NightBerryBush(FabricBlockSettings.of(Material.PLANT)
			.nonOpaque()
			.noCollision()
			.ticksRandomly()
			.breakInstantly()
			.sounds(BlockSoundGroup.CROP));
	public static final CrimsonFireBerryBush CRIMSON_FIRE_BERRY_BUSH = new CrimsonFireBerryBush(FabricBlockSettings.of(Material.PLANT)
			.nonOpaque()
			.noCollision()
			.ticksRandomly()
			.breakInstantly()
			.sounds(BlockSoundGroup.CROP));

	public static final WarpedFireBerryBush WARPED_FIRE_BERRY_BUSH = new WarpedFireBerryBush(FabricBlockSettings.of(Material.PLANT)
			.nonOpaque()
			.noCollision()
			.ticksRandomly()
			.breakInstantly()
			.sounds(BlockSoundGroup.CROP));

	public static final AscendingBerryBush ASCENDING_BERRY_BUSH = new AscendingBerryBush(FabricBlockSettings.of(Material.PLANT)
			.nonOpaque()
			.noCollision()
			.ticksRandomly()
			.breakInstantly()
			.sounds(BlockSoundGroup.CROP));

	public static final StrengthBerryBush STRENGTH_BERRY_BUSH = new StrengthBerryBush(FabricBlockSettings.of(Material.PLANT)
			.nonOpaque()
			.noCollision()
			.ticksRandomly()
			.breakInstantly()
			.sounds(BlockSoundGroup.CROP));

	public static final SpeedBerryBush SPEED_BERRY_BUSH = new SpeedBerryBush(FabricBlockSettings.of(Material.PLANT)
			.nonOpaque()
			.noCollision()
			.ticksRandomly()
			.breakInstantly()
			.sounds(BlockSoundGroup.CROP));

	public static final LeapingBerryBush LEAPING_BERRY_BUSH = new LeapingBerryBush(FabricBlockSettings.of(Material.PLANT)
			.nonOpaque()
			.noCollision()
			.ticksRandomly()
			.breakInstantly()
			.sounds(BlockSoundGroup.CROP));

	public static final ResistanceBerryBush RESISTANCE_BERRY_BUSH = new ResistanceBerryBush(FabricBlockSettings.of(Material.STONE)
			.nonOpaque()
			.noCollision()
			.ticksRandomly()
			.strength(3, 15)
			.sounds(BlockSoundGroup.DEEPSLATE));

	public static final InvisibilityBerryBush INVISIBILITY_BERRY_BUSH = new InvisibilityBerryBush(FabricBlockSettings.of(Material.STONE)
			.nonOpaque()
			.noCollision()
			.ticksRandomly()
			.strength(1, 3)
			.sounds(BlockSoundGroup.SCULK));

	public static final ConsumedBerry SPEED_BERRIES = new ConsumedBerry(new Item.Settings().group(GROUP).food(FoodComponents.SPEED_BERRIES));
	public static final ConsumedBerry HASTE_BERRIES = new ConsumedBerry(new Item.Settings().group(GROUP).food(FoodComponents.HASTE_BERRIES));
	public static final ConsumedBerry STRENGTH_BERRIES = new ConsumedBerry(new Item.Settings().group(GROUP).food(FoodComponents.STRENGTH_BERRIES));
	public static final ConsumedBerry REGENERATION_BERRIES = new ConsumedBerry(new Item.Settings().group(GROUP).food(FoodComponents.REGENERATION_BERRIES));
	public static final ConsumedBerry LEAPING_BERRIES = new ConsumedBerry(new Item.Settings().group(GROUP).food(FoodComponents.LEAPING_BERRIES));
	public static final ConsumedBerry NIGHT_BERRIES = new ConsumedBerry(new Item.Settings().group(GROUP).food(FoodComponents.NIGHT_BERRIES));
	public static final ConsumedBerry FIRE_BERRIES = new ConsumedBerry(new Item.Settings().group(GROUP).food(FoodComponents.FIRE_BERRIES).fireproof());
	public static final ConsumedBerry RESISTANCE_BERRIES = new ConsumedBerry(new Item.Settings().group(GROUP).food(FoodComponents.RESISTANCE_BERRIES));
	public static final ConsumedBerry HEALING_BERRIES = new ConsumedBerry(new Item.Settings().group(GROUP).food(FoodComponents.HEALING_BERRIES));
	public static final ConsumedBerry ASCENDING_BERRIES = new ConsumedBerry(new Item.Settings().group(GROUP).food(FoodComponents.ASCENDING_BERRIES));
	public static final ConsumedBerry INVISIBILITY_BERRIES = new ConsumedBerry(new Item.Settings().group(GROUP).food(FoodComponents.INVISIBILITY_BERRIES));
	public static final ConsumedBerry GOLDEN_BERRIES = new ConsumedBerry(new Item.Settings().group(GROUP).food(FoodComponents.GOLDEN_BERRIES).rarity(Rarity.RARE));
	public static final ConsumedBerry DOLPHIN_BERRIES = new ConsumedBerry(new Item.Settings().group(GROUP).food(FoodComponents.DOLPHIN_BERRIES));
	public static final ConsumedBerry SEA_BERRIES = new ConsumedBerry(new FabricItemSettings().group(GROUP).food(FoodComponents.SEA_BERRIES));
	public static final ConsumedBerry ROTTEN_BERRIES = new ConsumedBerry(new FabricItemSettings().group(GROUP).food(FoodComponents.ROTTEN_BERRIES));

	@Override
	public void onInitialize() {

		ModItems.registerItems();
		ModBlocks.registerBlocks();
		ModEffects.registerEffects();
		ModPotions.registerPotions();
		ModPotions.registerBerryBrewingRecipes();

		BerrySickness.registerC2SPackets();
		WorldGen.GenerateWorldGen();
		ServerTickEvents.START_SERVER_TICK.register(new PlayerTickHandler());

	}
}

