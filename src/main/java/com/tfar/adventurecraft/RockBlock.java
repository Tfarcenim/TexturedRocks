package com.tfar.adventurecraft;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.Random;

public class RockBlock extends Block implements Crumbling {

	public final Block drop;
	public final int meta;
	private final boolean crumbles;

	protected final AxisAlignedBB AABB;
	protected final AxisAlignedBB s_AABB;


	public RockBlock(Material materialIn,Block drop,int meta,boolean crumbles,double h1,double h2) {
		super(materialIn);
		this.drop = drop;
		this.meta = meta;
		this.crumbles = crumbles;
		AABB = new AxisAlignedBB(0, h1, 0, 1, h2, 1);
		s_AABB = new AxisAlignedBB(0, h1, 0, 1, Math.min(h2,1), 1);
	}

	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
		return s_AABB;
	}

	@Nullable
	@Override
	public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos) {
		return AABB;
	}

	@Override
	public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
		return new ItemStack(this);
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return Item.getItemFromBlock(drop);
	}

	@Override
	public int damageDropped(IBlockState state) {
		return meta;
	}

	@Override
	public boolean crumbles() {
		return crumbles;
	}

	@Override
	public boolean isFullCube(IBlockState state) {
		return false;
	}

	public boolean isOpaqueCube(IBlockState state)
	{
		return false;
	}


	@Override
	public boolean doesSideBlockRendering(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing face) {
		return false;
	}
}
