package com.lousiesmods.simplefarmworld.handler;

import com.lousiesmods.simplefarmworld.handler.registry.CommandRegistry;
import com.lousiesmods.simplefarmworld.util.Reference;

import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Reference.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class EventsHandler 
{
    @SubscribeEvent
    public static void serverLoad(RegisterCommandsEvent event)
    {
    	CommandRegistry.register(event.getDispatcher());
    }
}
