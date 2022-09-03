package cam11062.strange.berries.block;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static cam11062.strange.berries.StrangeBerries.*;

public class ModBlocks {

    public static void registerBlocks() {

        Registry.register(net.minecraft.util.registry.Registry.BLOCK, new Identifier("strangeberries", "fruitful_berry_bush"), FRUITFUL_BERRY_BUSH);
        Registry.register(net.minecraft.util.registry.Registry.BLOCK, new Identifier("strangeberries", "rotten_berry_bush"), ROTTEN_BERRY_BUSH);
        Registry.register(net.minecraft.util.registry.Registry.BLOCK, new Identifier("strangeberries", "haste_berry_bush"), HASTE_BERRY_BUSH);
        Registry.register(net.minecraft.util.registry.Registry.BLOCK, new Identifier("strangeberries", "sea_berry_bush"), SEA_BERRY_BUSH);
        Registry.register(net.minecraft.util.registry.Registry.BLOCK, new Identifier("strangeberries", "night_berry_bush"), NIGHT_BERRY_BUSH);
        Registry.register(net.minecraft.util.registry.Registry.BLOCK, new Identifier("strangeberries", "crimson_fire_berry_bush"), CRIMSON_FIRE_BERRY_BUSH);
        Registry.register(net.minecraft.util.registry.Registry.BLOCK, new Identifier("strangeberries", "warped_fire_berry_bush"), WARPED_FIRE_BERRY_BUSH);
        Registry.register(net.minecraft.util.registry.Registry.BLOCK, new Identifier("strangeberries", "ascending_berry_bush"), ASCENDING_BERRY_BUSH);
        Registry.register(net.minecraft.util.registry.Registry.BLOCK, new Identifier("strangeberries", "strength_berry_bush"), STRENGTH_BERRY_BUSH);
        Registry.register(net.minecraft.util.registry.Registry.BLOCK, new Identifier("strangeberries", "speed_berry_bush"), SPEED_BERRY_BUSH);
        Registry.register(net.minecraft.util.registry.Registry.BLOCK, new Identifier("strangeberries", "leaping_berry_bush"), LEAPING_BERRY_BUSH);
        Registry.register(net.minecraft.util.registry.Registry.BLOCK, new Identifier("strangeberries", "resistance_berry_bush"), RESISTANCE_BERRY_BUSH);
        Registry.register(net.minecraft.util.registry.Registry.BLOCK, new Identifier("strangeberries", "invisibility_berry_bush"), INVISIBILITY_BERRY_BUSH);
    }
}
