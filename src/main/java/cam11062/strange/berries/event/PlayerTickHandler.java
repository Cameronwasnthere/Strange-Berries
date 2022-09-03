package cam11062.strange.berries.event;

import cam11062.strange.berries.util.BerrySicknessData;
import cam11062.strange.berries.util.IEntityDataSaver;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.world.World;

import java.util.Random;

public class PlayerTickHandler implements ServerTickEvents.StartTick {

    int tick = 0;
    static int endtick = 340;

    @Override
    public void onStartTick(MinecraftServer server) {
            for (ServerPlayerEntity player : server.getPlayerManager().getPlayerList()) {
                IEntityDataSaver dataPlayer = ((IEntityDataSaver) player);
                if(tick < endtick) {
                    ++this.tick;
                }
                else if(tick >= endtick) {
                    tick = 0;
                    BerrySicknessData.removeSicknessLevel(dataPlayer,1);
                    }
                }

            }
        }
