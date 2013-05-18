package mymod.block.metal.stairs;

import mymod.block.BlockContainer;

public class StairsCopper extends MyMetalStairs {

    public StairsCopper(int id) {
        super(id, BlockContainer.myMetalBlock, 2);
        this.setUnlocalizedName("copperStairs");
    }

}
