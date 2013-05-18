package mymod.block.metal.fence;

import mymod.lib.Reference;

public class FenceTin extends MyMetalFence {

    public FenceTin(int id) {
        super(id, Reference.MOD_ID + ":" + "myMetalBlock.TinBlock");
        this.setUnlocalizedName("tinFence");
    }

}
