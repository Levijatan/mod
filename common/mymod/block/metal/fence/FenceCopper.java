package mymod.block.metal.fence;

import mymod.lib.Reference;

public class FenceCopper extends MyMetalFence {

    public FenceCopper(int id) {
        super(id, Reference.MOD_ID + ":" + "myMetalBlock.CopperBlock");
        this.setUnlocalizedName("copperFence");
    }
}
