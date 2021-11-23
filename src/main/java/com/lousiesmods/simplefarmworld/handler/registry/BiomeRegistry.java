package com.lousiesmods.simplefarmworld.handler.registry;

import com.lousiesmods.simplefarmworld.util.Reference;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeMaker;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BiomeRegistry 
{
	public static final DeferredRegister<Biome> BIOMES = DeferredRegister.create(ForgeRegistries.BIOMES, Reference.MOD_ID);
	
	public static final RegistryObject<Biome> FARM_WORLD = BIOMES.register("farm_world", BiomeMaker::theVoidBiome);
	
	public static void registerBiomes()
	{
		BIOMES.register(FMLJavaModLoadingContext.get().getModEventBus());
	}
	
	public static final class Type 
	{
		public static final BiomeDictionary.Type FARM_WORLD = BiomeDictionary.Type.getType("FARM_WORLD");
	}
}
