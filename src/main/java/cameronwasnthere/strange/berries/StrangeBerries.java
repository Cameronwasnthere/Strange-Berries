package cameronwasnthere.strange.berries;

import cameronwasnthere.strange.berries.events.PlayerTickHandler;
import cameronwasnthere.strange.berries.items.ModItemGroup;
import cameronwasnthere.strange.berries.networking.BerrySickness;
import cameronwasnthere.strange.berries.blocks.ModBlocks;
import cameronwasnthere.strange.berries.effects.ModEffects;
import cameronwasnthere.strange.berries.items.ModItems;
import cameronwasnthere.strange.berries.potions.ModPotions;
import cameronwasnthere.strange.berries.world.gen.ModWorldGen;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
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

		ModPotions.registerModPotions();
		ModPotions.registerBerryBrewingRecipes();

		BerrySickness.registerC2SPackets();

		ModWorldGen.generateModWorldGen();

		ServerTickEvents.START_SERVER_TICK.register(new PlayerTickHandler());
	}
}

