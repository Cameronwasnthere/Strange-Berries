package cam11062.strange.berries.client;

import cam11062.strange.berries.StrangeBerries;
import cam11062.strange.berries.networking.BerrySickness;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.minecraft.client.render.RenderLayer;

@Environment(EnvType.CLIENT)
public class ClientModInitializer implements net.fabricmc.api.ClientModInitializer {
       @Override
       public void onInitializeClient() {
               BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(),
                       StrangeBerries.FRUITFUL_BERRY_BUSH,
                       StrangeBerries.ROTTEN_BERRY_BUSH,
                       StrangeBerries.HASTE_BERRY_BUSH,
                       StrangeBerries.SEA_BERRY_BUSH,
                       StrangeBerries.NIGHT_BERRY_BUSH,
                       StrangeBerries.CRIMSON_FIRE_BERRY_BUSH,
                       StrangeBerries.WARPED_FIRE_BERRY_BUSH,
                       StrangeBerries.ASCENDING_BERRY_BUSH,
                       StrangeBerries.STRENGTH_BERRY_BUSH,
                       StrangeBerries.SPEED_BERRY_BUSH,
                       StrangeBerries.LEAPING_BERRY_BUSH,
                       StrangeBerries.RESISTANCE_BERRY_BUSH,
                       StrangeBerries.INVISIBILITY_BERRY_BUSH);

               BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getTranslucent(),
                       StrangeBerries.INVISIBILITY_BERRY_BUSH);

               BerrySickness.registerS2CPackets();

               HudRenderCallback.EVENT.register(new BerrySicknessHudOverlay());

               ClientPlayConnectionEvents.JOIN.register(new ClientPlayConnectionJoin());
       }
}
