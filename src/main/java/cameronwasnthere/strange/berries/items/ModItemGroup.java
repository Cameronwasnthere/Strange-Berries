package cameronwasnthere.strange.berries.items;

import cameronwasnthere.strange.berries.StrangeBerries;
import cameronwasnthere.strange.berries.potions.ModPotions;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final RegistryKey<ItemGroup> ITEM_GROUP = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(StrangeBerries.MOD_ID, "strange_berries_item_group"));

    public static void registerModItemGroup() {
        Registry.register(Registries.ITEM_GROUP, ITEM_GROUP, FabricItemGroup.builder()
                .icon(() -> new ItemStack(ModItems.GOLDEN_BERRIES))
                .displayName(Text.literal("Strange Berries"))
                .build());

        ItemGroupEvents.modifyEntriesEvent(ITEM_GROUP).register(content -> {
            content.add(ModItems.SPEED_BERRIES);
            content.add(ModItems.HASTE_BERRIES);
            content.add(ModItems.STRENGTH_BERRIES);
            content.add(ModItems.REGENERATION_BERRIES);
            content.add(ModItems.HEALING_BERRIES);
            content.add(ModItems.LEAPING_BERRIES);
            content.add(ModItems.NIGHT_BERRIES);
            content.add(ModItems.CRIMSON_FIRE_BERRIES);
            content.add(ModItems.WARPED_FIRE_BERRIES);
            content.add(ModItems.RESISTANCE_BERRIES);
            content.add(ModItems.ASCENDING_BERRIES);
            content.add(ModItems.INVISIBILITY_BERRIES);
            content.add(ModItems.DOLPHIN_BERRIES);
            content.add(ModItems.SEA_BERRIES);
            content.add(ModItems.ROTTEN_BERRIES);
            content.add(ModItems.GOLDEN_BERRIES);
        });
    }
}




