package cameronwasnthere.strange.berries.effects;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;

public class ModEffects {
    public static final StatusEffect BERRY_SICKNESS = new BerrySicknessEffect();

    public static void registerModEffects() {
        Registry.register(Registries.STATUS_EFFECT, new Identifier("strangeberries", "berry_sickness"), BERRY_SICKNESS);
    }
}
