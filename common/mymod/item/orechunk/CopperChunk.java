package mymod.item.orechunk;

import net.minecraft.creativetab.CreativeTabs;

public class CopperChunk extends MyChunk {

    public CopperChunk(int id) {
        super(id);
        this.setMaxStackSize(64);
        this.setUnlocalizedName("copperChunk");
        this.setCreativeTab(CreativeTabs.tabMaterials);
    }

}
