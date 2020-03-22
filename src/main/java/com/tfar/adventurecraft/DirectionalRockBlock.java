package com.tfar.adventurecraft;

import net.minecraft.block.Block;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.annotation.Nonnull;

public class DirectionalRockBlock extends RockBlock {

  public static final PropertyDirection FACING = BlockHorizontal.FACING;
  public static final PropertyEnum<BlockStairs.EnumHalf> HALF = PropertyEnum.create("half", BlockStairs.EnumHalf.class);

  public DirectionalRockBlock(Material materialIn, Block drop, int meta, boolean crumbles,double height,double h2) {
    super(materialIn, drop, meta, crumbles,height,h2);
    this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH).withProperty(HALF, BlockStairs.EnumHalf.BOTTOM));
  }

  /**
   * Called by ItemBlocks just before a block is actually set in the world, to allow for adjustments to the
   * IBlockstate
   */
  public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer) {
    IBlockState iblockstate = super.getStateForPlacement(worldIn, pos, facing, hitX, hitY, hitZ, meta, placer);
    iblockstate = iblockstate.withProperty(FACING, placer.getHorizontalFacing());
    return facing != EnumFacing.DOWN && (facing == EnumFacing.UP || (double)hitY <= 0.5D) ?
            iblockstate.withProperty(HALF, BlockStairs.EnumHalf.BOTTOM) :
            iblockstate.withProperty(HALF, BlockStairs.EnumHalf.TOP);
  }

  /**
   * Convert the given metadata into a BlockState for this Block
   */
  @Nonnull
  @Override
  public IBlockState getStateFromMeta(int meta) {
    IBlockState iblockstate = this.getDefaultState().withProperty(HALF, (meta & 4) > 0 ? BlockStairs.EnumHalf.TOP : BlockStairs.EnumHalf.BOTTOM);
    iblockstate = iblockstate.withProperty(FACING, EnumFacing.byIndex(5 - (meta & 3)));
    return iblockstate;
  }

  /**
   * Convert the BlockState into the correct metadata value
   */
  @Override
  public int getMetaFromState(IBlockState state) {
    int i = 0;

    if (state.getValue(HALF) == BlockStairs.EnumHalf.TOP)
    {
      i |= 4;
    }

    i = i | 5 - state.getValue(FACING).getIndex();
    return i;
  }

  @Nonnull
  @Override
  protected BlockStateContainer createBlockState() {
    return new BlockStateContainer(this, FACING, HALF);
  }
}
