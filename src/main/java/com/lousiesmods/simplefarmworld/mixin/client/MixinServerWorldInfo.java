package com.lousiesmods.simplefarmworld.mixin.client;

import com.mojang.serialization.Lifecycle;

import net.minecraft.world.storage.ServerWorldInfo;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ServerWorldInfo.class)
public abstract class MixinServerWorldInfo 
{
	//todo this @Inject(method = "getLifecycle", at = @At("HEAD"), cancellable = true)
	//private void forceStableLifeCycle(CallbackInfoReturnable<Lifecycle> cir) 
	//{
		//cir.setReturnValue(Lifecycle.stable());
	//}
}
