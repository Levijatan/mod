package mymod.block;

import mymod.MyProxy;
import net.minecraft.block.Block;
import net.minecraft.block.StepSound;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class MyBlock extends Block {

    public MyBlock(int id, Material material, float hardness,
            StepSound stepSound, String name, CreativeTabs tab) {
        super (id, material);
        setHardness (hardness);
        setStepSound (stepSound);
        setUnlocalizedName (name);
        setCreativeTab (tab);
    }

    public String getTextureFile () {
            return MyProxy.BLOCK_PNG;
    }

}