package cameronwasnthere.strange.berries.mixin;

import cameronwasnthere.strange.berries.util.IPlayerEntityAccessor;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.NbtCompound;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PlayerEntity.class)
public class PlayerEntityMixin implements IPlayerEntityAccessor {
    @Unique
    private NbtCompound persistentData= new NbtCompound();

    @Override
    public NbtCompound getPersistentData() {
        if(persistentData == null) {
            persistentData = new NbtCompound();
        }
        return persistentData;
    }

    @Inject(method = "writeCustomDataToNbt", at = @At("HEAD"))
    protected void writeCustomDataToNbt(NbtCompound nbt, CallbackInfo ci) {
        if(persistentData != null) {
            nbt.put("strangeberries", persistentData);
        }
    }

    @Inject(method = "readCustomDataFromNbt", at = @At("HEAD"))
    protected void readCustomDataFromNbt(NbtCompound nbt, CallbackInfo ci) {
        if (nbt.contains("strangeberries")) {
            persistentData.copyFrom(nbt.getCompound("strangeberries"));
        }
    }
}
