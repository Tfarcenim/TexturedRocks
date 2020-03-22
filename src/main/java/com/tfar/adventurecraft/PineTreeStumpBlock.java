package com.tfar.adventurecraft;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.BlockRenderLayer;

public class PineTreeStumpBlock extends Block {
	public PineTreeStumpBlock(Material materialIn) {
		super(materialIn);
	}

	@Override
	public BlockRenderLayer getRenderLayer() {
		return BlockRenderLayer.CUTOUT;
	}
}
