package com.lousiesmods.simplefarmworld.handler.registry;

import com.lousiesmods.simplefarmworld.util.Reference;

import net.minecraft.util.RegistryKey;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Reference.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DimensionRegistry 
{
	public static final RegistryKey<World> FARM_WORLD = RegistryKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation(Reference.MOD_ID, "farm_world"));
}
