package cameronwasnthere.strange.berries.effects;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;

public class ModEffects {
    public static final StatusEffect BERRY_POISONING = new BerryPoisoningEffect(StatusEffectCategory.HARMFUL, 5578058);

    public static void registerModEffects() {
        Registry.register(Registries.STATUS_EFFECT, new Identifier("strangeberries", "berry_poisoning"), BERRY_POISONING);
    }
}
