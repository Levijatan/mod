package mymod.block.metal.stairs;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import mymod.block.MyStairs;

public abstract class MyMetalStairs extends MyStairs {

    protected MyMetalStairs(int id, Block block, int meta) {
        super(id, block, meta);
        this.setStepSound(soundMetalFootstep);
        this.setHardness(3.0F);
        this.setCreativeTab(CreativeTabs.tabBlock);
    }

}
