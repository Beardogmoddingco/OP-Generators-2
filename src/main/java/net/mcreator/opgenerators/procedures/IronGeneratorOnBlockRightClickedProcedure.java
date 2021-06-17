package net.mcreator.opgenerators.procedures;

import net.minecraftforge.energy.CapabilityEnergy;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.tileentity.TileEntity;

import net.mcreator.opgenerators.OpGeneratorsModElements;
import net.mcreator.opgenerators.OpGeneratorsMod;

import java.util.Map;

@OpGeneratorsModElements.ModElement.Tag
public class IronGeneratorOnBlockRightClickedProcedure extends OpGeneratorsModElements.ModElement {
	public IronGeneratorOnBlockRightClickedProcedure(OpGeneratorsModElements instance) {
		super(instance, 84);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				OpGeneratorsMod.LOGGER.warn("Failed to load dependency x for procedure IronGeneratorOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				OpGeneratorsMod.LOGGER.warn("Failed to load dependency y for procedure IronGeneratorOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				OpGeneratorsMod.LOGGER.warn("Failed to load dependency z for procedure IronGeneratorOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				OpGeneratorsMod.LOGGER.warn("Failed to load dependency world for procedure IronGeneratorOnBlockRightClicked!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		for (int index0 = 0; index0 < (int) (100); index0++) {
			{
				TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) (y - 1), (int) z));
				int _amount = (int) 400;
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, Direction.UP).ifPresent(capability -> capability.receiveEnergy(_amount, false));
			}
		}
	}
}
