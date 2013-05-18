package mymod.block.metal.fence;

import mymod.lib.Reference;

public class FenceBrass extends MyMetalFence {

    public FenceBrass(int id) {
        super(id, Reference.MOD_ID + ":" + "myMetalBlock.BrassBlock");
        this.setUnlocalizedName("brassFence");
    }

}
