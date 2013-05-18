package mymod.block.metal.slab;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class MyItemMetalSlab extends ItemBlock {

    public MyItemMetalSlab(int par1) {
        super(par1);
        setHasSubtypes(true);
    }
    
    public String getUnlocalizedName(ItemStack itemstack)
    {
           String name = "";
           switch(itemstack.getItemDamage())
           {
                 case 0:
                 {
                        name = "brass";
                        break;
                 }
                 case 1:
                 {
                        name = "bronze";
                        break;
                 }
                 case 2:
                 {
                        name = "copper";
                        break;
                 }
                 case 3:
                 {
                        name = "tin";
                        break;
                 }
                 case 4:
                 {
                        name = "zinc";
                        break;
                 }
                 default: name = "broken";
           }
           return getUnlocalizedName() + "." + name;
    }
    
    public int getMetadata(int par1)
    {
          return par1;
    }

}
