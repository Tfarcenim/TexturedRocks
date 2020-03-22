package com.tfar.adventurecraft;

import net.minecraft.block.Block;
import net.minecraft.block.BlockHugeMushroom;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.color.IBlockColor;
import net.minecraft.client.renderer.color.IItemColor;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ColorizerGrass;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.biome.BiomeColorHelper;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import javax.annotation.Nullable;

@Mod(modid = AdventureCraft.MODID, name = AdventureCraft.NAME, version = AdventureCraft.VERSION)
@Mod.EventBusSubscriber
public class AdventureCraft {
  public static final String MODID = "adventurecraft";
  public static final String NAME = "Adventure Craft";
  public static final String VERSION = "1.0";

  @GameRegistry.ObjectHolder(MODID+":stone")
  public static final Block stone = null;

  @GameRegistry.ObjectHolder(MODID+":granite")
  public static final Block granite = null;

  @GameRegistry.ObjectHolder(MODID+":diorite")
  public static final Block diorite = null;

  @GameRegistry.ObjectHolder(MODID+":andesite_boulder")
  public static final Block andesite = null;

  @GameRegistry.ObjectHolder(MODID+":stone2")
  public static final Block stone2 = null;

  @GameRegistry.ObjectHolder(MODID+":granite2")
  public static final Block granite2 = null;

  @GameRegistry.ObjectHolder(MODID+":diorite2")
  public static final Block diorite2 = null;

  @GameRegistry.ObjectHolder(MODID+":andesite_cliff")
  public static final Block andesite2 = null;

  @GameRegistry.ObjectHolder(MODID+":sandstone_pillar_l")
  public static final Block sandstone_pillar_l = null;

  @GameRegistry.ObjectHolder(MODID+":sandstone_pillar_s")
  public static final Block sandstone_pillar_s = null;

  @GameRegistry.ObjectHolder(MODID+":sandstone_rocks_l_stairs")
  public static final Block sandstone_rocks_l_stairs = null;

  @GameRegistry.ObjectHolder(MODID+":sandstone_rocks_m_stairs")
  public static final Block sandstone_rocks_m_stairs = null;

  @GameRegistry.ObjectHolder(MODID+":sandstone_rocks_s")
  public static final Block sandstone_rocks_s = null;

  @GameRegistry.ObjectHolder(MODID+":sandstone_rocks_xs")
  public static final Block sandstone_rocks_xs = null;

  @GameRegistry.ObjectHolder(MODID+":sandstone_rocks_xs_f")
  public static final Block sandstone_rocks_xs_f = null;

  @GameRegistry.ObjectHolder(MODID+":brown_mushrooms_1")
  public static final Block brown_mushroom_1 = null;

  @GameRegistry.ObjectHolder(MODID+":brown_mushrooms_2")
  public static final Block brown_mushroom_2 = null;

  @GameRegistry.ObjectHolder(MODID+":brown_mushrooms_3")
  public static final Block brown_mushroom_3 = null;

  @GameRegistry.ObjectHolder(MODID+":pine_tree_base")
  public static final Block pine_tree_base = null;

  @GameRegistry.ObjectHolder(MODID+":pine_tree_peak_base")
  public static final Block pine_tree_peak_base = null;

  @GameRegistry.ObjectHolder(MODID+":pine_tree_peak_middle")
  public static final Block pine_tree_peak_middle = null;

  @GameRegistry.ObjectHolder(MODID+":pine_tree_peak_top")
  public static final Block pine_tree_peak_top = null;

  @GameRegistry.ObjectHolder(MODID+":pine_tree_stump")
  public static final Block pine_tree_stump = null;

  @GameRegistry.ObjectHolder(MODID+":pine_tree_trunk")
  public static final Block pine_tree_trunk = null;

  @GameRegistry.ObjectHolder(MODID+":grass_stairs")
  public static final Block grass_stairs = null;

  static CreativeTabs tab = new CreativeTabs(MODID) {
    @Override
    public ItemStack createIcon() {
      return new ItemStack(Item.getItemFromBlock(Blocks.STONE));
    }
  };

  @SubscribeEvent
  public static void block(RegistryEvent.Register<Block> e) {
    e.getRegistry().register(new RockBlock(Material.ROCK,Blocks.STONE,0,true,0,1.5).setCreativeTab(tab).setHardness(2.0F).setResistance(10.0F).setRegistryName("stone").setTranslationKey("stone.stone"));
    e.getRegistry().register(new RockBlock(Material.ROCK,Blocks.STONE,1,true,0,1.5).setCreativeTab(tab).setHardness(2.0F).setResistance(10.0F).setRegistryName("granite").setTranslationKey("stone.granite"));
    e.getRegistry().register(new RockBlock(Material.ROCK,Blocks.STONE,3,true,0,1.5).setCreativeTab(tab).setHardness(2.0F).setResistance(10.0F).setRegistryName("diorite").setTranslationKey("stone.diorite"));
    e.getRegistry().register(new RockBlock(Material.ROCK,Blocks.STONE,5,true,0,1.5).setCreativeTab(tab).setHardness(2.0F).setResistance(10.0F).setRegistryName("andesite_boulder").setTranslationKey("stone.andesite"));
    e.getRegistry().register(new RockBlock(Material.ROCK,Blocks.STONE,0,true,0,1.5).setCreativeTab(tab).setHardness(2.0F).setResistance(10.0F).setRegistryName("stone2").setTranslationKey("stone.stone"));
    e.getRegistry().register(new RockBlock(Material.ROCK,Blocks.STONE,1,true,0,1.5).setCreativeTab(tab).setHardness(2.0F).setResistance(10.0F).setRegistryName("granite2").setTranslationKey("stone.granite"));
    e.getRegistry().register(new RockBlock(Material.ROCK,Blocks.STONE,3,true,0,1.5).setCreativeTab(tab).setHardness(2.0F).setResistance(10.0F).setRegistryName("diorite2").setTranslationKey("stone.diorite"));
    e.getRegistry().register(new RockBlock(Material.ROCK,Blocks.STONE,5,true,0,1.5).setCreativeTab(tab).setHardness(2.0F).setResistance(10.0F).setRegistryName("andesite_cliff").setTranslationKey("stone.andesite"));

    e.getRegistry().register(new RockBlock(Material.ROCK,Blocks.SANDSTONE,0,false,0,1.5).setCreativeTab(tab).setHardness(2.0F).setResistance(4.0F).setRegistryName("sandstone_pillar_l").setTranslationKey("stone.stone"));
    e.getRegistry().register(new RockBlock(Material.ROCK,Blocks.SANDSTONE,1,false,0,1.5).setCreativeTab(tab).setHardness(2.0F).setResistance(4.0F).setRegistryName("sandstone_pillar_s").setTranslationKey("stone.granite"));

    e.getRegistry().register(new DirectionalRockBlock(Material.ROCK,Blocks.SANDSTONE,1,false,0,1).setCreativeTab(tab).setHardness(2.0F).setResistance(10.0F).setRegistryName("sandstone_rocks_l_stairs").setTranslationKey("sandstone"));
    e.getRegistry().register(new DirectionalRockBlock(Material.ROCK,Blocks.SANDSTONE,1,false,0,1).setCreativeTab(tab).setHardness(2.0F).setResistance(10.0F).setRegistryName("sandstone_rocks_m_stairs").setTranslationKey("sandstone"));
    e.getRegistry().register(new RockBlock(Material.ROCK,Blocks.SANDSTONE,1,false,.5,1).setCreativeTab(tab).setHardness(2.0F).setResistance(10.0F).setRegistryName("sandstone_rocks_s").setTranslationKey("sandstone"));
    e.getRegistry().register(new RockBlock(Material.ROCK,Blocks.SANDSTONE,1,false,0,.5).setCreativeTab(tab).setHardness(2.0F).setResistance(10.0F).setRegistryName("sandstone_rocks_xs").setTranslationKey("sandstone"));
    e.getRegistry().register(new RockBlock(Material.ROCK,Blocks.SANDSTONE,1,false,.5,1).setCreativeTab(tab).setHardness(2.0F).setResistance(10.0F).setRegistryName("sandstone_rocks_xs_f").setTranslationKey("sandstone"));

    e.getRegistry().register(new FancyMushroomBlock(Material.WOOD,Blocks.BROWN_MUSHROOM).setHardness(0.2F).setCreativeTab(tab).setRegistryName("brown_mushrooms_1").setTranslationKey("brown_mushrooms_1"));
    e.getRegistry().register(new FancyMushroomBlock(Material.WOOD,Blocks.BROWN_MUSHROOM).setHardness(0.2F).setCreativeTab(tab).setRegistryName("brown_mushrooms_2").setTranslationKey("brown_mushrooms_2"));
    e.getRegistry().register(new FancyMushroomBlock(Material.WOOD,Blocks.BROWN_MUSHROOM).setHardness(0.2F).setCreativeTab(tab).setRegistryName("brown_mushrooms_3").setTranslationKey("brown_mushrooms_3"));

    e.getRegistry().register(new Block(Material.WOOD).setHardness(1).setCreativeTab(tab).setRegistryName("pine_tree_base").setTranslationKey("pine_tree_base"));
    e.getRegistry().register(new PineTreePeakBlock(Material.WOOD,1).setHardness(1).setCreativeTab(tab).setRegistryName("pine_tree_peak_base").setTranslationKey("pine_tree_peak_base"));
    e.getRegistry().register(new PineTreePeakBlock(Material.WOOD,.75).setHardness(1).setCreativeTab(tab).setRegistryName("pine_tree_peak_middle").setTranslationKey("pine_tree_peak_middle"));
    e.getRegistry().register(new PineTreePeakBlock(Material.WOOD,.5).setHardness(1).setCreativeTab(tab).setRegistryName("pine_tree_peak_top").setTranslationKey("pine_tree_peak_top"));
    e.getRegistry().register(new PineTreeStumpBlock(Material.WOOD).setHardness(1).setCreativeTab(tab).setRegistryName("pine_tree_stump").setTranslationKey("pine_tree_stump"));
    e.getRegistry().register(new Block(Material.WOOD).setHardness(1).setCreativeTab(tab).setRegistryName("pine_tree_trunk").setTranslationKey("pine_tree_trunk"));

    //e.getRegistry().register(new GrassStairsBlock(Blocks.GRASS.getDefaultState()).setRegistryName("grass_stairs").setTranslationKey("grass_stairs"));
  }

  @SubscribeEvent
  public static void item(RegistryEvent.Register<Item> e){
    e.getRegistry().register(new ItemBlock(stone).setRegistryName(stone.getRegistryName()).setTranslationKey("stone"));
    e.getRegistry().register(new ItemBlock(stone2).setRegistryName("stone2").setTranslationKey("stone2"));
    e.getRegistry().register(new ItemBlock(andesite).setRegistryName(andesite.getRegistryName()).setTranslationKey("andesite"));
    e.getRegistry().register(new ItemBlock(andesite2).setRegistryName(andesite2.getRegistryName()).setTranslationKey("andesite2"));
    e.getRegistry().register(new ItemBlock(granite).setRegistryName("granite").setTranslationKey("granite"));
    e.getRegistry().register(new ItemBlock(granite2).setRegistryName("granite2").setTranslationKey("granite2"));
    e.getRegistry().register(new ItemBlock(diorite).setRegistryName("diorite").setTranslationKey("diorite"));
    e.getRegistry().register(new ItemBlock(diorite2).setRegistryName("diorite2").setTranslationKey("diorite2"));

    e.getRegistry().register(new ItemBlock(sandstone_pillar_l).setRegistryName(sandstone_pillar_l.getRegistryName()).setTranslationKey("sandstone"));
    e.getRegistry().register(new ItemBlock(sandstone_pillar_s).setRegistryName(sandstone_pillar_s.getRegistryName()).setTranslationKey("sandstone"));

    e.getRegistry().register(new ItemBlock(sandstone_rocks_l_stairs).setRegistryName(sandstone_rocks_l_stairs.getRegistryName()).setTranslationKey("sandstone"));
    e.getRegistry().register(new ItemBlock(sandstone_rocks_m_stairs).setRegistryName(sandstone_rocks_m_stairs.getRegistryName()).setTranslationKey("sandstone"));
    e.getRegistry().register(new ItemBlock(sandstone_rocks_s).setRegistryName(sandstone_rocks_s.getRegistryName()).setTranslationKey("sandstone"));
    e.getRegistry().register(new ItemBlock(sandstone_rocks_xs).setRegistryName(sandstone_rocks_xs.getRegistryName()).setTranslationKey("sandstone"));
    e.getRegistry().register(new ItemBlock(sandstone_rocks_xs_f).setRegistryName(sandstone_rocks_xs_f.getRegistryName()).setTranslationKey("sandstone"));

    e.getRegistry().register(new ItemBlock(brown_mushroom_1).setRegistryName(brown_mushroom_1.getRegistryName()).setTranslationKey(brown_mushroom_1.getTranslationKey()));
    e.getRegistry().register(new ItemBlock(brown_mushroom_2).setRegistryName(brown_mushroom_2.getRegistryName()).setTranslationKey(brown_mushroom_2.getTranslationKey()));
    e.getRegistry().register(new ItemBlock(brown_mushroom_3).setRegistryName(brown_mushroom_3.getRegistryName()).setTranslationKey(brown_mushroom_3.getTranslationKey()));

    e.getRegistry().register(new ItemBlock(pine_tree_base).setRegistryName(pine_tree_base.getRegistryName()).setTranslationKey(pine_tree_base.getTranslationKey()));
    e.getRegistry().register(new ItemBlock(pine_tree_peak_base).setRegistryName(pine_tree_peak_base.getRegistryName()).setTranslationKey(pine_tree_peak_base.getTranslationKey()));
    e.getRegistry().register(new ItemBlock(pine_tree_peak_middle).setRegistryName(pine_tree_peak_middle.getRegistryName()).setTranslationKey(pine_tree_peak_middle.getTranslationKey()));
    e.getRegistry().register(new ItemBlock(pine_tree_peak_top).setRegistryName(pine_tree_peak_top.getRegistryName()).setTranslationKey(pine_tree_peak_top.getTranslationKey()));
    e.getRegistry().register(new ItemBlock(pine_tree_stump).setRegistryName(pine_tree_stump.getRegistryName()).setTranslationKey(pine_tree_stump.getTranslationKey()));
    e.getRegistry().register(new ItemBlock(pine_tree_trunk).setRegistryName(pine_tree_trunk.getRegistryName()).setTranslationKey(pine_tree_trunk.getTranslationKey()));

    //e.getRegistry().register(new ItemBlock(grass_stairs).setRegistryName(grass_stairs.getRegistryName()).setTranslationKey(grass_stairs.getTranslationKey()));

  }

  @SubscribeEvent
  public static void models(ModelRegistryEvent e) {
    setModel(stone);
    setModel(stone2);
    setModel(andesite);
    setModel(andesite2);
    setModel(diorite);
    setModel(diorite2);
    setModel(granite);
    setModel(granite2);

    setModel(sandstone_pillar_l);
    setModel(sandstone_pillar_s);

    setModel(sandstone_rocks_l_stairs);
    setModel(sandstone_rocks_m_stairs);
    setModel(sandstone_rocks_s);
    setModel(sandstone_rocks_xs);
    setModel(sandstone_rocks_xs_f);

    setModel(brown_mushroom_1);
    setModel(brown_mushroom_2);
    setModel(brown_mushroom_3);

    setModel(pine_tree_base);
    setModel(pine_tree_peak_base);
    setModel(pine_tree_peak_middle);
    setModel(pine_tree_peak_top);
    setModel(pine_tree_stump);
    setModel(pine_tree_trunk);

    //setModel(grass_stairs);
  }

  /*@SubscribeEvent
  public static void colors(ColorHandlerEvent.Block e){
    e.getBlockColors().registerBlockColorHandler((state, worldIn, pos, tintIndex) -> worldIn != null && pos != null ? BiomeColorHelper.getGrassColorAtPos(worldIn, pos) :
            ColorizerGrass.getGrassColor(0.5D, 1.0D), grass_stairs);
  }

  @SubscribeEvent
  public static void itemColors(ColorHandlerEvent.Item e) {
    e.getItemColors().registerItemColorHandler((stack, tintIndex) -> {
      IBlockState iblockstate = ((ItemBlock)stack.getItem()).getBlock().getStateFromMeta(stack.getMetadata());
      return Minecraft.getMinecraft().getBlockColors().colorMultiplier(iblockstate, null, null, tintIndex);
    }, grass_stairs);
  }*/

  public static void setModel(Block item) {
    setModel(Item.getItemFromBlock(item));
  }

  public static void setModel(Item item) {
    ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
  }


  @SubscribeEvent
  public static void crumbling(BlockEvent.BreakEvent e) {
    Block block = e.getState().getBlock();
    BlockPos pos = e.getPos();
    if (block instanceof RockBlock && ((RockBlock) block).crumbles()) {
      for (int x = -1; x < 2; x++) {
        for (int y = -1; y < 2; y++) {
          for (int z = -1; z < 2; z++) {
            BlockPos offset = pos.add(x,y,z);
            Block block1 = e.getWorld().getBlockState(offset).getBlock();
            if (block1 == Blocks.STONE){
              int meta = Blocks.STONE.getMetaFromState(e.getWorld().getBlockState(offset));
              switch (meta){
                case 0:
                  e.getWorld().setBlockState(offset,stone.getDefaultState());break;
                case 1:e.getWorld().setBlockState(offset,granite.getDefaultState());break;
                case 3:e.getWorld().setBlockState(offset,diorite.getDefaultState());break;
                case 5:e.getWorld().setBlockState(offset,andesite.getDefaultState());break;
              }
            } else if (block1 instanceof RockBlock && ((RockBlock) block1).crumbles()){
              e.getWorld().setBlockState(offset,block1.getDefaultState());
            }
          }
        }
      }
    }
  }
}
