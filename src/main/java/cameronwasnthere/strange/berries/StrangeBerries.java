package cameronwasnthere.strange.berries;

import cameronwasnthere.strange.berries.events.BerryPoisoningEvents;
import cameronwasnthere.strange.berries.items.ModItemGroup;
import cameronwasnthere.strange.berries.blocks.ModBlocks;
import cameronwasnthere.strange.berries.effects.ModEffects;
import cameronwasnthere.strange.berries.items.ModItems;
import cameronwasnthere.strange.berries.networking.ModPackets;
import cameronwasnthere.strange.berries.potions.ModPotions;
import cameronwasnthere.strange.berries.world.gen.ModWorldGen;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StrangeBerries implements ModInitializer {
	public static final String MOD_ID = "strangeberries";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModItemGroup.registerModItemGroup();

		ModBlocks.registerModBlocks();

		ModEffects.registerModEffects();

		BerryPoisoningEvents.registerSleepEvent();
		BerryPoisoningEvents.registerRespawnEvent();
		BerryPoisoningEvents.registerEndServerTickEvent();

		ModPotions.registerBerryBrewingRecipes();

		ModWorldGen.generateModWorldGen();

		ModPackets.registerPayloads();
		ModPackets.registerC2S();
	}
}

