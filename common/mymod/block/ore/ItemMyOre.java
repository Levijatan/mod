package mymod.block.ore;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemMyOre extends ItemBlock{

    public ItemMyOre(int par1) {
        super(par1);
        setHasSubtypes(true);
    }
    
    @Override
    public String getUnlocalizedName(ItemStack itemStack) {
        String name = "";
        switch(itemStack.getItemDamage()){
            case 0:{
                name = "copperOre";
                break;
            }
            case 1:{
                name = "tinOre";
                break;
            }
            case 2:{
                name = "zincOre";
                break;
            }
            default: name = "broken";
        }
        
        return getUnlocalizedName() + "." + name;
        
    }
    
    public int getMetadata(int par1){
        return par1;
    }

}
