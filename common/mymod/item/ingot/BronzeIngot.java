package mymod.item.ingot;

import net.minecraft.creativetab.CreativeTabs;

public class BronzeIngot extends MyIngot {

    public BronzeIngot(int id) {
        super(id);
        this.setMaxStackSize(64);
        this.setUnlocalizedName("bronzeIngot");
        this.setCreativeTab(CreativeTabs.tabMaterials);
    }

}
