package cameronwasnthere.strange.berries.client;

import cameronwasnthere.strange.berries.effects.ModEffects;
import cameronwasnthere.strange.berries.util.PlayerData;
import com.mojang.blaze3d.systems.RenderSystem;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class HudRenderer implements HudRenderCallback {
    private static final Identifier BERRY_POISONING_ICON = new Identifier("strangeberries", "textures/berry_poisoning/berry_poisoning_level_icon.png");

    private static final Identifier BERRY_POISONING_HEART_ICON = new Identifier("strangeberries", "textures/berry_poisoning/berry_poisoning_heart_icon.png");

    @Override
    public void onHudRender(DrawContext drawContext, float tickDelta) {
        int y = 0;
        int x = 0;
        MinecraftClient client = MinecraftClient.getInstance();

        if(client.player != null && client.player.hasStatusEffect(RegistryEntry.of(ModEffects.BERRY_POISONING))) {
            renderBerryPoisoningHearts(drawContext, client);
            System.out.println("ddsdsdsdsdsdsdsds");
        }

        int berriesEatenToday = 0;
        PlayerData playerData = ClientData.getPlayerData();
        if(playerData != null) {
            berriesEatenToday = playerData.getBerriesEatenToday();
        }

        int width = client.getWindow().getScaledWidth();
        int height = client.getWindow().getScaledHeight();
        x = width / 2;
        y = height;

        RenderSystem.setShader(GameRenderer::getPositionTexProgram);
        RenderSystem.setShaderColor(1F, 1F, 1F, 1F);
        RenderSystem.setShaderTexture(0, BERRY_POISONING_ICON);

        if(!client.player.isCreative()) {
            for(int i = 0; i < berriesEatenToday; i++) {
                drawContext.drawTexture(BERRY_POISONING_ICON, x - -94 + (i * 11), y - 12, 0, 0, 10, 10, 10, 10);
            }
        }
    }

    private void renderBerryPoisoningHearts(DrawContext drawContext, MinecraftClient client) {
        RenderSystem.setShader(GameRenderer::getPositionTexProgram);
        RenderSystem.setShaderColor(1F, 1F, 1F, 1F);
        RenderSystem.setShaderTexture(0, BERRY_POISONING_HEART_ICON);
        int x = 10;
        int y = 10;
        if(client.player != null) {
            int health = (int)client.player.getHealth();
            for(int i = 0; i < (health / 2); i++) {
                drawContext.drawTexture(BERRY_POISONING_HEART_ICON, x + (i * 8), y, 0, 0, 9, 9, 16, 16);
            }
        }
    }
}
