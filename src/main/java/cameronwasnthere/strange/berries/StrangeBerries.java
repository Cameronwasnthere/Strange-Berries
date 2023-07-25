package cameronwasnthere.strange.berries;

import cameronwasnthere.strange.berries.event.PlayerTickHandler;
import cameronwasnthere.strange.berries.networking.BerrySickness;
import cameronwasnthere.strange.berries.block.ModBlocks;
import cameronwasnthere.strange.berries.effects.ModEffects;
import cameronwasnthere.strange.berries.items.ModItems;
import cameronwasnthere.strange.berries.potion.ModPotions;
import cameronwasnthere.strange.berries.world.gen.WorldGen;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class StrangeBerries implements ModInitializer {

	public static final String MOD_ID = "strangeberries";

	public static final ItemGroup GROUP = FabricItemGroupBuilder.build(new Identifier("strangeberries", "strangeberries"), () -> new ItemStack(ModItems.GOLDEN_BERRIES));

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

