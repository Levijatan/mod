package mymod.block.transport.liquid;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemDrainBlock extends ItemBlock {

    public ItemDrainBlock(int par1) {
        super(par1);
        setHasSubtypes(true);
    }
    
    @Override
    public String getUnlocalizedName(ItemStack itemStack) {
        String name = "";
        switch(itemStack.getItemDamage()){
            case 0:{
                name = "straightNorthSouth";
                break;
            }
            case 1:{
                name = "straightEastWest";
                break;
            }
            case 2:{
                name = "turnNorthEast";
                break;
            }
            case 3:{
                name = "turnNorthWest";
                break;
            }
            case 4:{
                name = "turnSouthEast";
                break;
            }
            case 5:{
                name ="turnSouthWest";
                break;
            }
            case 6:{
                name ="tNorthSouthWest";
                break;
            }
            case 7:{
                name ="tNorthSouthEast";
                break;
            }
            case 8:{
                name ="tNorthWestEast";
                break;
            }
            case 9:{
                name ="tSouthWestEast";
                break;
            }
            case 10:{
                name ="cross";
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
