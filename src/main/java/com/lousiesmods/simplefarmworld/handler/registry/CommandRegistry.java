package com.lousiesmods.simplefarmworld.handler.registry;

import com.lousiesmods.simplefarmworld.command.TeleportFarmWorldCommand;
import com.lousiesmods.simplefarmworld.util.Reference;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.tree.LiteralCommandNode;

import net.minecraft.command.CommandSource;
import net.minecraft.command.Commands;

public class CommandRegistry
{
	public static void register(CommandDispatcher<CommandSource> dispatcher)
	{
		LiteralCommandNode<CommandSource> cmdFarmWorldTeleport = dispatcher.register(
				Commands.literal(Reference.MOD_ID)
					.then(TeleportFarmWorldCommand.register(dispatcher))
		);
		
		dispatcher.register(Commands.literal("farmworld").redirect(cmdFarmWorldTeleport));
	}
}
