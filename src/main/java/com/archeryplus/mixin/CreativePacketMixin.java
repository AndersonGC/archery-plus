package com.archeryplus.mixin;

import com.archeryplus.network.ModNetwork;
import net.minecraft.network.protocol.game.ServerboundSetCreativeModeSlotPacket;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.network.ServerGamePacketListenerImpl;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ServerGamePacketListenerImpl.class)
public abstract class CreativePacketMixin {
    @Shadow public ServerPlayer player;
    @Inject(method = "handleSetCreativeModeSlot", at = @At(value = "INVOKE", target = "Lnet/minecraft/server/level/ServerPlayer;hasInfiniteMaterials()Z"), cancellable = true)
    private void archeryPlus$ignoreCreativeEcho(ServerboundSetCreativeModeSlotPacket packet, CallbackInfo ci) {
        if (ModNetwork.creativeSession(player)) ci.cancel();
    }
}
