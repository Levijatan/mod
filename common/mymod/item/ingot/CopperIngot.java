package mymod.item.ingot;

import net.minecraft.creativetab.CreativeTabs;

public class CopperIngot extends MyIngot {

    public CopperIngot(int id) {
        super(id);
        this.setMaxStackSize(64);
        this.setUnlocalizedName("copperIngot");
        this.setCreativeTab(CreativeTabs.tabMaterials);
    }

}
