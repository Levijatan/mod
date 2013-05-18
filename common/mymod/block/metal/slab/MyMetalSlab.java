package mymod.block.metal.slab;

import java.util.List;
import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockHalfSlab;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import mymod.block.BlockContainer;
import mymod.lib.Reference;

public class MyMetalSlab extends BlockHalfSlab {
    
    public static final String metalSlabTypes[] = new String[] {"Brass","Bronze","Copper","Tin","Zinc"};
    @SideOnly(Side.CLIENT)
    private Icon[] icons;

    public MyMetalSlab(int id, boolean isDouble) {
        super(id, isDouble, Material.iron);
        this.setLightOpacity(0);
        this.setStepSound(soundMetalFootstep);
        this.setUnlocalizedName("metalSlab");
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public Icon getIcon(int par1, int par2)
    {
        return icons[par2];
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IconRegister iconRegister)
    {
        icons = new Icon[5];
        
        for (int i = 0; i < icons.length; i++) {
            icons[i] = iconRegister.registerIcon(Reference.MOD_ID + ":" +"myMetalBlock." + metalSlabTypes[i] + "Block");
        }
        
    }
    
    @Override
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return BlockContainer.metalSingleSlab.blockID;
    }
    
    @Override
    protected ItemStack createStackedBlock(int par1)
    {
        return new ItemStack(BlockContainer.metalDoubleSlab.blockID, 2, par1 & 7);
    }
    
    @Override
    public int damageDropped (int metadata) {
        return metadata;
    }
    
    @Override
    public String getFullSlabName(int par1)
    {
        if (par1 < 0 || par1 >= metalSlabTypes.length)
        {
            par1 = 0;
        }

        String name = metalSlabTypes[par1] + " Slab";
        
        return name;
    }
    
    @SideOnly(Side.CLIENT)

    @Override
    public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List)
    {
        if (par1 != Block.stoneDoubleSlab.blockID)
        {
            for (int i = 0; i < metalSlabTypes.length; i++) {
                par3List.add(new ItemStack(par1, 1, i));
            }
        }
    }
   
    @SideOnly(Side.CLIENT)

    /**
     * Takes a block ID, returns true if it's the same as the ID for a stone or wooden single slab.
     */
    private static boolean isBlockSingleSlab(int par0)
    {
        return par0 == BlockContainer.metalSingleSlab.blockID;
    }

}
