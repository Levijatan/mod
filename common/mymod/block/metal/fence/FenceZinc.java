package mymod.block.metal.fence;

import mymod.lib.Reference;

public class FenceZinc extends MyMetalFence {

    public FenceZinc(int id) {
        super(id, Reference.MOD_ID + ":" + "myMetalBlock.ZincBlock");
        this.setUnlocalizedName("zincFence");
    }

}
