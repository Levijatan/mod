package mymod.block.metal.fence;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import mymod.block.MyFence;

public abstract class MyMetalFence extends MyFence {

    public MyMetalFence(int id, String parent) {
        super(id,  parent, Material.iron);
        this.setStepSound(soundMetalFootstep);
        this.setHardness(3.0F);
        this.setCreativeTab(CreativeTabs.tabBlock);
    }
}
