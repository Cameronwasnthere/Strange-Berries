package cameronwasnthere.strange.berries.client;

import cameronwasnthere.strange.berries.StrangeBerries;
import cameronwasnthere.strange.berries.util.IEntityDataSaver;
import com.mojang.blaze3d.systems.RenderSystem;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.util.Identifier;

public class BerrySicknessHudOverlay implements HudRenderCallback {
    private static final Identifier SICKNESS_ICON = new Identifier(StrangeBerries.MOD_ID, "textures/berrysickness/sickness_icon.png");
    @Override
    public void onHudRender(DrawContext drawContext, float tickDelta) {
        int y = 0;
        int x = 0;
        MinecraftClient client = MinecraftClient.getInstance();
        if (client != null) {
            int width = client.getWindow().getScaledWidth();
            int height = client.getWindow().getScaledHeight();

            x = width / 2;
            y = height;
        }

        RenderSystem.setShader(GameRenderer::getPositionTexProgram);
        RenderSystem.setShaderColor(1F, 1F, 1F, 1F);
        RenderSystem.setShaderTexture(0, SICKNESS_ICON);

        for(int i = 0; i < 3; i++) {
            if (((IEntityDataSaver) MinecraftClient.getInstance().player).getPersistentData().getInt("sicknesslevel") > i) {
                drawContext.drawTexture(SICKNESS_ICON, x - -94 + (i * 9), y - 10, 0, 0, 10, 10, 10, 10);
            }
            else {
                break;
            }
        }
    }
}
