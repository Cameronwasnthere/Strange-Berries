package cameronwasnthere.strange.berries;

import cameronwasnthere.strange.berries.blocks.ModBlocks;
import cameronwasnthere.strange.berries.client.BerrySicknessHudOverlay;
import cameronwasnthere.strange.berries.client.ClientPlayConnectionJoin;
import cameronwasnthere.strange.berries.networking.BerrySickness;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.minecraft.client.render.RenderLayer;

@Environment(EnvType.CLIENT)
public class StrangeBerriesClient implements net.fabricmc.api.ClientModInitializer {
       @Override
       public void onInitializeClient() {
               BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(),
                       ModBlocks.FRUITFUL_BERRY_BUSH,
                       ModBlocks.ROTTEN_BERRY_BUSH,
                       ModBlocks.HASTE_BERRY_BUSH,
                       ModBlocks.SEA_BERRY_BUSH,
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

               BerrySickness.registerS2CPackets();

               HudRenderCallback.EVENT.register(new BerrySicknessHudOverlay());

               ClientPlayConnectionEvents.JOIN.register(new ClientPlayConnectionJoin());
       }
}
