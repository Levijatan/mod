package mymod.block.metal;

import java.util.List;
import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import mymod.block.MyBlock;
import mymod.lib.Reference;

public class MyMetalBlock extends MyBlock {

    public MyMetalBlock(int id) {
        super(id, Material.iron);
        this.setHardness(3.0F);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setStepSound(soundMetalFootstep);
        this.setUnlocalizedName("myMetalBlock");
    }
    
    @SideOnly(Side.CLIENT)
    private Icon[] icons;
    
    private String[] blockNames = {"BrassBlock", "BronzeBlock",  "CopperBlock", "TinBlock", "ZincBlock"};
    
    @Override
    public int idDropped(int par1, Random random, int par2) {
        return 0;
    }
    
    
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister) {
        icons = new Icon[blockNames.length];
        
        for(int i = 0; i < icons.length; i ++){
            icons[i] = iconRegister.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(5) + "." + blockNames[i]);
        }
    }
    
    @SideOnly(Side.CLIENT)
    public Icon getIcon (int par1, int par2) {
        return icons[par2];
    }
    
    @SuppressWarnings({ "unchecked", "rawtypes" })
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(int par1, CreativeTabs creativeTabs, List par3List) {
        for(int i = 0; i < icons.length; i++) {
            par3List.add(new ItemStack(par1, 1, i));
        }
    }
}