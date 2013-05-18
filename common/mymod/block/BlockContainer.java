package mymod.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockHalfSlab;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSlab;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import mymod.block.liquid.metal.LiquidCopperFlowing;
import mymod.block.liquid.metal.LiquidCopperStill;
import mymod.block.metal.ItemMetalBlock;
import mymod.block.metal.MyMetalBlock;
import mymod.block.metal.fence.FenceBrass;
import mymod.block.metal.fence.FenceBronze;
import mymod.block.metal.fence.FenceCopper;
import mymod.block.metal.fence.FenceTin;
import mymod.block.metal.fence.FenceZinc;
import mymod.block.metal.fence.MyMetalFence;
import mymod.block.metal.slab.MyItemMetalSlab;
import mymod.block.metal.slab.MyMetalSlab;
import mymod.block.metal.stairs.StairsBrass;
import mymod.block.metal.stairs.StairsBronze;
import mymod.block.metal.stairs.StairsCopper;
import mymod.block.metal.stairs.StairsTin;
import mymod.block.metal.stairs.StairsZinc;
import mymod.block.ore.MyOre;
import mymod.block.ore.ItemMyOre;
import mymod.block.transport.liquid.DrainBlock;
import mymod.lib.BlockIds;
import mymod.lib.Reference;

public class BlockContainer {
    
    
    //Ores
    public static Block myOre;
    public static Item itemMyOre;
    
    //Liquid Metals
    public static Block liquidCopperStill;
    public static Block liquidCopperFlowing;
    
    //Metal Blocks
    public static Block myMetalBlock;
    public static Item itemMetalBlock;
    
    //Metal Stairs
    public static Block brassStairs;
    public static Block bronzeStairs;
    public static Block copperStairs;
    public static Block tinStairs;
    public static Block zincStairs;
    
    //Metal Fences
    public static Block brassFence;
    public static Block bronzeFence;
    public static Block copperFence;
    public static Block tinFence;
    public static Block zincFence;
    
    //Metal Slabs
    public static BlockHalfSlab metalSingleSlab;
    public static BlockHalfSlab metalDoubleSlab;
    public static Item itemMetalSlab;
    
    //Liquid Transport Drains
    public static Block drainBlock;
    
    
    public static void init() {
        
        //Ores
        myOre = new MyOre (BlockIds.COPPER_ORE);
        
        GameRegistry.registerBlock(myOre, ItemMyOre.class, Reference.MOD_ID + myOre.getUnlocalizedName2());
        
        LanguageRegistry.addName(new ItemStack(myOre, 1, 0), "Copper Ore");
        LanguageRegistry.addName(new ItemStack(myOre, 1, 1), "Tin Ore");
        LanguageRegistry.addName(new ItemStack(myOre, 1, 2), "Zinc Ore");
        
        itemMyOre = new ItemMyOre(2000).setUnlocalizedName("itemMyOre");
        
        MinecraftForge.setBlockHarvestLevel(myOre, "pickaxe", 1);
        
        
        
        //Liquid Metals
        liquidCopperStill = new LiquidCopperStill(BlockIds.LIQUID_COPPER_STILL);
        liquidCopperFlowing = new LiquidCopperFlowing(BlockIds.LIQUID_COPPER_FLOWING);
        
        LanguageRegistry.addName(liquidCopperFlowing, "Liquid Copper Flowing");
        LanguageRegistry.addName(liquidCopperStill, "Liquid Copper Still");
        
        GameRegistry.registerBlock(liquidCopperStill, "liquidCopperStill");
        GameRegistry.registerBlock(liquidCopperFlowing, "liquidCopperFlowing");
        
        
        //Metal Block
        myMetalBlock = new MyMetalBlock (BlockIds.COPPER_BLOCK);
        
        GameRegistry.registerBlock(myMetalBlock, ItemMetalBlock.class, Reference.MOD_ID + myMetalBlock.getUnlocalizedName2());
        
        LanguageRegistry.addName(new ItemStack(myMetalBlock, 1, 0), "Brass Block");
        LanguageRegistry.addName(new ItemStack(myMetalBlock, 1, 1), "Bronze Block");
        LanguageRegistry.addName(new ItemStack(myMetalBlock, 1, 2), "Copper Block");
        LanguageRegistry.addName(new ItemStack(myMetalBlock, 1, 3), "Tin Block");
        LanguageRegistry.addName(new ItemStack(myMetalBlock, 1, 4), "Zinc Block");
        
        itemMetalBlock = new ItemMetalBlock(2001).setUnlocalizedName("itemMetalBlock");
        


        
        
        //Metal Stairs
        brassStairs = new StairsBrass(BlockIds.BRASS_STAIRS);
        bronzeStairs = new StairsBronze(BlockIds.BRONZE_STAIRS);
        copperStairs = new StairsCopper(BlockIds.COPPER_STAIRS);
        tinStairs = new StairsTin(BlockIds.TIN_STAIRS);
        zincStairs = new StairsZinc(BlockIds.ZINC_STAIRS);
        
        LanguageRegistry.addName(brassStairs, "Brass Stairs");
        LanguageRegistry.addName(bronzeStairs, "Bronze Stairs");
        LanguageRegistry.addName(copperStairs, "Copper Stairs");
        LanguageRegistry.addName(tinStairs, "Tin Stairs");
        LanguageRegistry.addName(zincStairs, "Zinc Stairs");
        
        GameRegistry.registerBlock(brassStairs, "brassStairs");
        GameRegistry.registerBlock(bronzeStairs, "bronzeStairs");
        GameRegistry.registerBlock(copperStairs, "copperStairs");
        GameRegistry.registerBlock(tinStairs, "tinStairs");
        GameRegistry.registerBlock(zincStairs, "zincStairs");
        
        
        //Metal Fence
        brassFence = new FenceBrass(BlockIds.BRASS_FENCE);
        bronzeFence = new FenceBronze(BlockIds.BRONZE_FENCE);
        copperFence = new FenceCopper(BlockIds.COPPER_FENCE);
        tinFence = new FenceTin(BlockIds.TIN_FENCE);
        zincFence = new FenceZinc(BlockIds.ZINC_FENCE);
        
        GameRegistry.registerBlock(brassFence, Reference.MOD_ID + brassFence.getUnlocalizedName2());
        GameRegistry.registerBlock(bronzeFence, Reference.MOD_ID + bronzeFence.getUnlocalizedName2());
        GameRegistry.registerBlock(copperFence, Reference.MOD_ID + copperFence.getUnlocalizedName2());
        GameRegistry.registerBlock(tinFence, Reference.MOD_ID + tinFence.getUnlocalizedName2());
        GameRegistry.registerBlock(zincFence, Reference.MOD_ID + zincFence.getUnlocalizedName2());
        
        LanguageRegistry.addName(brassFence, "Brass Fence");
        LanguageRegistry.addName(bronzeFence, "Bronze Fence");
        LanguageRegistry.addName(copperFence, "Copper Fence");
        LanguageRegistry.addName(tinFence, "Tin Fence");
        LanguageRegistry.addName(zincFence, "Zinc Fence");
                
        
        //Metal Slabs
        metalSingleSlab = (BlockHalfSlab) new MyMetalSlab(BlockIds.METAL_SLAB, false).setHardness(2.0F).setResistance(10.0F).setCreativeTab(CreativeTabs.tabBlock);
        metalDoubleSlab = (BlockHalfSlab) new MyMetalSlab(BlockIds.METAL_DOUBLE_SLAB, true).setHardness(2.0F).setResistance(10.0F).setCreativeTab(CreativeTabs.tabBlock);
        
        GameRegistry.registerBlock(metalSingleSlab, MyItemMetalSlab.class, "metalSlab") ;
        GameRegistry.registerBlock(metalDoubleSlab, MyItemMetalSlab.class, "metalDoubleSlab");
        
        itemMetalSlab = new MyItemMetalSlab(2003).setUnlocalizedName("itemSlab");
        
        LanguageRegistry.instance().addStringLocalization("tile.metalSlab.brass.name", "Brass Slab");
        LanguageRegistry.addName(new ItemStack(metalSingleSlab, 1, 2), "Bronze Slab");
        LanguageRegistry.addName(new ItemStack(metalSingleSlab, 1, 4), "Copper slab");
        LanguageRegistry.addName(new ItemStack(metalSingleSlab, 1, 6), "Tin Slab");
        LanguageRegistry.addName(new ItemStack(metalSingleSlab, 1, 8), "Zinc slab");
        LanguageRegistry.addName(new ItemStack(metalDoubleSlab, 1, 0), "Brass Slab");
        LanguageRegistry.addName(new ItemStack(metalDoubleSlab, 1, 1), "Bronze Slab");
        LanguageRegistry.addName(new ItemStack(metalDoubleSlab, 1, 2), "Copper slab");
        LanguageRegistry.addName(new ItemStack(metalDoubleSlab, 1, 3), "Tin Slab");
        LanguageRegistry.addName(new ItemStack(metalDoubleSlab, 1, 4), "Zinc slab");
        
        LanguageRegistry.addName(itemMetalSlab, "Item Metal Slab");
        
        Item.itemsList[metalSingleSlab.blockID] = (new ItemSlab(metalSingleSlab.blockID - 256, metalSingleSlab, metalDoubleSlab, false)).setUnlocalizedName("metalSlab");
        Item.itemsList[metalDoubleSlab.blockID] = (new ItemSlab(metalDoubleSlab.blockID - 256, metalSingleSlab, metalDoubleSlab, true)).setUnlocalizedName("metalSlab");
        
        
        //Liquid Transport Drains
        drainBlock = new DrainBlock(BlockIds.TRANSPORT_LIQUID_DRAIN).setUnlocalizedName("drainBlock").setCreativeTab(CreativeTabs.tabBlock);
        
        GameRegistry.registerBlock(drainBlock, "drainBlock");
        
        LanguageRegistry.addName(drainBlock, "Drain");
        
        
        
        
    }

}
