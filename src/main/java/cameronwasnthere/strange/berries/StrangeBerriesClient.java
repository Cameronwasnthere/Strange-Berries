package cameronwasnthere.strange.berries;

import cameronwasnthere.strange.berries.blocks.ModBlocks;
import cameronwasnthere.strange.berries.client.HudRenderer;
import cameronwasnthere.strange.berries.client.ClientPlayConnectionEvent;
import cameronwasnthere.strange.berries.events.KeyInputEventHandler;
import cameronwasnthere.strange.berries.networking.ModPackets;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.minecraft.client.render.RenderLayer;

@Environment(EnvType.CLIENT)
public class StrangeBerriesClient implements ClientModInitializer {
       @Override
       public void onInitializeClient() {
           BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(),
                       ModBlocks.FRUITFUL_BERRY_BUSH,
                       ModBlocks.HEALING_BERRY_BUSH,
                       ModBlocks.REGENERATION_BERRY_BUSH,
                       ModBlocks.ROTTEN_BERRY_BUSH,
                       ModBlocks.GOLDEN_BERRY_BUSH,
                       ModBlocks.HASTE_BERRY_BUSH,
                       ModBlocks.SEA_BERRY_BUSH,
                       ModBlocks.DOLPHIN_BERRY_BUSH,
                       ModBlocks.NIGHT_BERRY_BUSH,
                       ModBlocks.CRIMSON_FIRE_BERRY_BUSH,
                       ModBlocks.WARPED_FIRE_BERRY_BUSH,
                       ModBlocks.ASCENDING_BERRY_BUSH,
                       ModBlocks.STRENGTH_BERRY_BUSH,
                       ModBlocks.SPEED_BERRY_BUSH,
                       ModBlocks.LEAPING_BERRY_BUSH,
                       ModBlocks.RESISTANCE_BERRY_BUSH,
                       ModBlocks.INVISIBILITY_BERRY_BUSH);

           BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getTranslucent(),
                       ModBlocks.INVISIBILITY_BERRY_BUSH);

           HudRenderCallback.EVENT.register(new HudRenderer());
           ClientPlayConnectionEvents.JOIN.register(new ClientPlayConnectionEvent());

           KeyInputEventHandler.appendToolTips();

           ModPackets.registerS2C();
       }
}
