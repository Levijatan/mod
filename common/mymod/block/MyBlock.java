package mymod.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mymod.lib.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public abstract class MyBlock extends Block {
    

    public MyBlock(int id, Material material) {
        super (id, material);
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IconRegister iconRegister){
        blockIcon = iconRegister.registerIcon(this.getUnlocalizedName());
    }
}
