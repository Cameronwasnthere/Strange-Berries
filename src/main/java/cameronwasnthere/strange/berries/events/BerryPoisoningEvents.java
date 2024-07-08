package cameronwasnthere.strange.berries.events;

import cameronwasnthere.strange.berries.effects.ModEffects;
import cameronwasnthere.strange.berries.util.BerryPoisoningDataHandler;
import cameronwasnthere.strange.berries.util.IPlayerEntityAccessor;
import net.fabricmc.fabric.api.entity.event.v1.EntitySleepEvents;
import net.fabricmc.fabric.api.entity.event.v1.ServerPlayerEvents;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.registry.Registries;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

public class BerryPoisoningEvents {
    private static long lastTime = -1;
    /* Explanation for these events:
       There are 3 ways a player can reset the counter for the amount of berries they have eaten:
         -> Through sleeping in a bed (essentially beginning a new Minecraft day)
         -> Dying and respawning
         -> Waiting until the start of a new Minecraft day
       Each event below reflects one of these in order */

    public static void registerSleepEvent() {
        EntitySleepEvents.STOP_SLEEPING.register((entity, sleepingPos) -> {
            // Checking whether the player has actually gone to sleep by checking if the time of day is 24000 when they have woken up
            if(entity instanceof PlayerEntity playerEntity) {
                if(playerEntity.getWorld().getTimeOfDay() == 24000) {
                    BerryPoisoningDataHandler.setNBTData((IPlayerEntityAccessor) playerEntity, "berriesEatenToday", 0);
                    playerEntity.sendMessage(Text.translatable("message.strangeberries.berry_poisoning_refresh_message")
                            .fillStyle(Style.EMPTY.withColor(Formatting.GREEN).withBold(true)), true);
                }
            }
        });
    }

    public static void registerRespawnEvent() {
        ServerPlayerEvents.AFTER_RESPAWN.register((oldPlayer, newPlayer, alive) -> {
            // Resetting the amount of berries eaten when respawned after death
            BerryPoisoningDataHandler.setNBTData((IPlayerEntityAccessor) newPlayer, "berriesEatenToday", 0);
        });
    }
    public static void registerEndServerTickEvent() {
        ServerTickEvents.END_SERVER_TICK.register(server -> {
            // Iterates through all worlds and players on the server and keeps track of the time,
            // then resets all player's amount of berries eaten upon the start of a new Minecraft day
            for(ServerWorld world : server.getWorlds()) {
                long timeOfDay = world.getTimeOfDay() % 24000;
                if (timeOfDay == 0 && timeOfDay != lastTime) {
                    for(ServerPlayerEntity player : world.getPlayers()) {
                        BerryPoisoningDataHandler.setNBTData((IPlayerEntityAccessor) player, "berriesEatenToday", 0);
                        player.sendMessage(Text.translatable("message.strangeberries.berry_poisoning_refresh_message")
                                .fillStyle(Style.EMPTY.withColor(Formatting.GREEN).withBold(true)), true);
                    }
                }
                lastTime = timeOfDay;
            }
        });
    }
}
