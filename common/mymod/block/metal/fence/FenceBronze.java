package mymod.block.metal.fence;

import mymod.lib.Reference;

public class FenceBronze extends MyMetalFence {

    public FenceBronze(int id) {
        super(id, Reference.MOD_ID + ":" + "myMetalBlock.BronzeBlock");
        this.setUnlocalizedName("bronzeFence");
    }

}
