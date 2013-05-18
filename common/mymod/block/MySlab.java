package mymod.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockHalfSlab;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public abstract class MySlab extends BlockHalfSlab {

    public MySlab(int id, boolean isDouble, Material material) {
        super(id, isDouble, material);
        // TODO Auto-generated constructor stub
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IconRegister iconRegister){
        blockIcon = iconRegister.registerIcon(this.getUnlocalizedName());
    }
    
    @Override
    public String getFullSlabName(int i) {
        // TODO Auto-generated method stub
        return this.getUnlocalizedName();
    }

}
