package com.lousiesmods.simplefarmworld.handler;

import java.util.function.Function;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.common.util.ITeleporter;

public class TeleportHandler
{
	public static void teleport(ServerPlayerEntity player, ServerWorld destination, BlockPos pos)
	{
		player.changeDimension(destination, new ITeleporter() {
			@Override
			public Entity placeEntity(Entity entity, ServerWorld current, ServerWorld desitnation, float yaw, Function<Boolean, Entity> repositionEntity)
			{
				entity = repositionEntity.apply(false);
				entity.teleportTo(pos.getX(), pos.getY(), pos.getZ());
				return entity;
			}
		});
	}
}