package mymod.item.ingot;

import net.minecraft.creativetab.CreativeTabs;

public class ZincIngot extends MyIngot {

    public ZincIngot(int id) {
        super(id);
        this.setMaxStackSize(64);
        this.setUnlocalizedName("zincIngot");
        this.setCreativeTab(CreativeTabs.tabMaterials);
    }

}
