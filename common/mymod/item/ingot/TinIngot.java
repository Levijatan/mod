package mymod.item.ingot;

import net.minecraft.creativetab.CreativeTabs;

public class TinIngot extends MyIngot {

    public TinIngot(int id) {
        super(id);
        this.setMaxStackSize(64);
        this.setUnlocalizedName("tinIngot");
        this.setCreativeTab(CreativeTabs.tabMaterials);
    }

}
