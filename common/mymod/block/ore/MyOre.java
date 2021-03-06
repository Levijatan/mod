package mymod.block.ore;

import java.util.List;
import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import mymod.block.MyBlock;
import mymod.item.ItemContainer;
import mymod.lib.Reference;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

public class MyOre extends MyBlock {

    public MyOre(int id) {
        super(id, Material.rock);
        this.setStepSound(soundStoneFootstep);
        this.setHardness(3.0F);
        this.setCreativeTab(CreativeTabs.tabBlock);
    }
    
    @SideOnly(Side.CLIENT)
    private Icon[] icons;
    
    private String[] blockNames = {"CopperOre", "TinOre", "ZincOre"};
    
    @Override
    public int idDropped(int par1, Random random, int par2) {
        int itemId = 0;
        switch(par1){
            case 0:{
                itemId = ItemContainer.copperChunk.itemID;
                break;
            }
            case 1:{
                itemId = ItemContainer.tinChunk.itemID;
                break;
            }
            case 2:{
                itemId = ItemContainer.zincChunk.itemID;
                break;
            }
        }
        return itemId;
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
    
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(int par1, CreativeTabs creativeTabs, List par3List) {
        for(int i = 0; i < icons.length; i++) {
            par3List.add(new ItemStack(par1, 1, i));
        }
    }
}
