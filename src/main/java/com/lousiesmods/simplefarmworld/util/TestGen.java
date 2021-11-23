package com.lousiesmods.simplefarmworld.util;

import java.util.ArrayList;

import com.lousiesmods.simplefarmworld.SimpleFarmWorld;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class TestGen 
{
    public static void onPopulate(BiomeLoadingEvent event)
    {
    	SimpleFarmWorld.LOGGER.debug("AAHHHHH");
    	/*ArrayList<Block> ORES = new ArrayList<>();
    	ORES.add(Blocks.COAL_ORE);
    	ORES.add(Blocks.DIAMOND_ORE);
    	ORES.add(Blocks.EMERALD_ORE);
    	ORES.add(Blocks.GOLD_ORE);
    	ORES.add(Blocks.IRON_ORE);
    	ORES.add(Blocks.LAPIS_ORE);
    	ORES.add(Blocks.REDSTONE_ORE);
    	ORES.add(Blocks.IRON_ORE);
    	event.getGeneration().getFeatures(GenerationStage.Decoration.UNDERGROUND_ORES).removeAll(ORES);*/
    }
}
