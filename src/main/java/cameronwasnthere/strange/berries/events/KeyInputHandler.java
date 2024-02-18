package cameronwasnthere.strange.berries.events;

import cameronwasnthere.strange.berries.items.ModItems;
import com.google.common.collect.ImmutableMap;
import net.fabricmc.fabric.api.client.item.v1.ItemTooltipCallback;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.item.Item;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

import java.util.Map;

public class KeyInputHandler {
    // Grouping berries which are planted on the same blocks
    private static final Map<Item, String> SEA_DOLPHIN_BERRIES_MAP = ImmutableMap.<Item, String>builder()
            .put(ModItems.SEA_BERRIES, "")
            .put(ModItems.DOLPHIN_BERRIES, "")
            .build();

    private static final Map<Item, String> FRUITFUL_SPEED_BERRIES_MAP = ImmutableMap.<Item, String>builder()
            .put(ModItems.HEALING_BERRIES, "")
            .put(ModItems.REGENERATION_BERRIES, "")
            .put(ModItems.SPEED_BERRIES, "")
            .build();

    private static final Map<Item, String> ROTTEN_NIGHT_STRENGTH_BERRIES_MAP = ImmutableMap.<Item, String>builder()
            .put(ModItems.ROTTEN_BERRIES, "")
            .put(ModItems.NIGHT_BERRIES, "")
            .put(ModItems.STRENGTH_BERRIES, "")
            .build();

    public static void appendToolTips() {
        ItemTooltipCallback.EVENT.register((stack, context, tooltip) -> {
            Item item = stack.getItem();
            if(item instanceof ConsumedBerry) {
                tooltip.add(Text.translatable("item.strangeberries.default_tooltip").formatted(Formatting.GREEN));
            }
            if(Screen.hasShiftDown()) {
                // A bunch of if statements, YandereDev style :sunglasses:
                // ...all jokes aside this is probably NOT a good way of doing this...
                if(SEA_DOLPHIN_BERRIES_MAP.containsKey(item)) {
                    tooltip.set(1, Text.translatable("item.strangeberries.sea_dolphin_berries_tooltip").formatted(Formatting.DARK_GREEN));
                }
                if(FRUITFUL_SPEED_BERRIES_MAP.containsKey(item)) {
                    tooltip.set(1, Text.translatable("item.strangeberries.fruitful_speed_berries_tooltip").formatted(Formatting.DARK_GREEN));
                }
                if(ROTTEN_NIGHT_STRENGTH_BERRIES_MAP.containsKey(item)) {
                    tooltip.set(1, Text.translatable("item.strangeberries.rotten_night_strength_berries_tooltip").formatted(Formatting.DARK_GREEN));
                }

                // Berries which cannot be grouped
                if(item.equals(ModItems.CRIMSON_FIRE_BERRIES)) {
                    tooltip.set(1, Text.translatable("item.strangeberries.crimson_fire_berries_tooltip").formatted(Formatting.DARK_GREEN));
                }
                if(item.equals(ModItems.WARPED_FIRE_BERRIES)) {
                    tooltip.set(1, Text.translatable("item.strangeberries.warped_fire_berries_tooltip").formatted(Formatting.DARK_GREEN));
                }
                if(item.equals(ModItems.INVISIBILITY_BERRIES)) {
                    tooltip.set(1, Text.translatable("item.strangeberries.invisibility_berries_tooltip").formatted(Formatting.DARK_GREEN));
                }
                if(item.equals(ModItems.RESISTANCE_BERRIES)) {
                    tooltip.set(1, Text.translatable("item.strangeberries.resistance_berries_tooltip").formatted(Formatting.DARK_GREEN));
                }
                if(item.equals(ModItems.ASCENDING_BERRIES)) {
                    tooltip.set(1, Text.translatable("item.strangeberries.ascending_berries_tooltip").formatted(Formatting.DARK_GREEN));
                }
                if(item.equals(ModItems.GOLDEN_BERRIES)) {
                    tooltip.set(1, Text.translatable("item.strangeberries.golden_berries_tooltip").formatted(Formatting.DARK_GREEN));
                }
                if(item.equals(ModItems.LEAPING_BERRIES)) {
                    tooltip.set(1, Text.translatable("item.strangeberries.leaping_berries_tooltip").formatted(Formatting.DARK_GREEN));
                }
                if(item.equals(ModItems.HASTE_BERRIES)) {
                    tooltip.set(1, Text.translatable("item.strangeberries.haste_berries_tooltip").formatted(Formatting.DARK_GREEN));
                }
            }
        });
    }
}
