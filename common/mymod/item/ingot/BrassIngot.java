package mymod.item.ingot;

import net.minecraft.creativetab.CreativeTabs;

public class BrassIngot extends MyIngot {

    public BrassIngot(int id) {
        super(id);
        this.setMaxStackSize(64);
        this.setUnlocalizedName("brassIngot");
        this.setCreativeTab(CreativeTabs.tabMaterials);
    }

}
