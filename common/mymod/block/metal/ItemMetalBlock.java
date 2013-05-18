package mymod.block.metal;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemMetalBlock extends ItemBlock {

    public ItemMetalBlock(int par1) {
        super(par1);
        setHasSubtypes(true);
    }
    
    @Override
    public String getUnlocalizedName(ItemStack itemStack) {
        String name = "";
        switch(itemStack.getItemDamage()){
            case 0:{
                name = "brassBlock";
                break;
            }
            case 1:{
                name = "bronzeBlock";
                break;
            }
            case 2:{
                name = "copperBlock";
                break;
            }
            case 3:{
                name = "tinBlock";
                break;
            }
            case 4:{
                name = "zincBlock";
                break;
            }
            default: name = "broken";
        }
        
        return getUnlocalizedName() + "." + name;
        
    }
    
    @Override
    public int getMetadata(int par1){
        return par1;
    }
}