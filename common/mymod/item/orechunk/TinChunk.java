package mymod.item.orechunk;

import net.minecraft.creativetab.CreativeTabs;

public class TinChunk extends MyChunk {

    public TinChunk(int id) {
        super(id);
        this.setMaxStackSize(64);
        this.setUnlocalizedName("tinChunk");
        this.setCreativeTab(CreativeTabs.tabMaterials);
    }

}
