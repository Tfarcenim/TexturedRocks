package com.tfar.adventurecraft;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.AxisAlignedBB;

public class PineTreePeakBlock extends Block {

	public final AxisAlignedBB aabb;

	public PineTreePeakBlock(Material blockMaterialIn, double width) {
		super(blockMaterialIn);
		aabb = new AxisAlignedBB(.5 - width/2,0,.5 - width/2,.5 + width/2,1,.5 + width/2);
	}

	@Override
	public boolean isFullCube(IBlockState state) {
		return false;
	}

	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}
}
