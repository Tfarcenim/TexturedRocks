package com.tfar.adventurecraft;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.Random;

public class FancyMushroomBlock extends BlockBush {

	protected static final AxisAlignedBB MUSHROOM_AABB = new AxisAlignedBB(0, 0.0D, 0, 1, 0.375, 1);


	public FancyMushroomBlock(Material materialIn,Block smallBlockIn) {
		super(materialIn);
		this.smallBlock = smallBlockIn;
	}

	private final Block smallBlock;


	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
		return MUSHROOM_AABB;
	}

	@Override
	protected boolean canSustainBush(IBlockState state) {
		return state.isFullBlock();
	}

	/**
	 * Returns the quantity of items to drop on block destruction.
	 */
	public int quantityDropped(Random random)
	{
		return Math.max(0, random.nextInt(10) - 7);
	}


	/**
	 * Get the Item that this Block should drop when harvested.
	 */
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
	{
		return Item.getItemFromBlock(this.smallBlock);
	}

	public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state)
	{
		return new ItemStack(this.smallBlock);
	}

	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}
}
