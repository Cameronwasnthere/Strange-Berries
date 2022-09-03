package cam11062.strange.berries.effect;

import cam11062.strange.berries.effect.BerrySicknessEffect;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static cam11062.strange.berries.StrangeBerries.*;

public class ModEffects {

    public static final StatusEffect BERRY_SICKNESS = new BerrySicknessEffect();

    public static void registerEffects() {

        Registry.register(Registry.STATUS_EFFECT, new Identifier("strangeberries", "berry_sickness"), BERRY_SICKNESS);

    }
}
