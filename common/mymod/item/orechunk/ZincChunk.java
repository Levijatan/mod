package mymod.item.orechunk;

import net.minecraft.creativetab.CreativeTabs;

public class ZincChunk extends MyChunk {

    public ZincChunk(int id) {
        super(id);
        this.setMaxStackSize(64);
        this.setUnlocalizedName("zincChunk");
        this.setCreativeTab(CreativeTabs.tabMaterials);
    }

}
