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
                name = "base";
                break;
            }
            case 1:{
                name = "stopperNorth";
                break;
            }
            case 2:{
                name ="stopperWest";
                break;
            }
            case 3:{
                name ="stopperSouth";
                break;
            }
            case 4:{
                name ="stopperEast";
                break;
            }
            case 5:{
                name ="straightNorthSouth";
                break;
            }
            case 6:{
                name ="straightEastWest";
                break;
            }
            case 7:{
                name ="turnSouthWest";
                break;
            }
            case 8:{
                name = "turnNorthWest";
                break;
            }
            case 9:{
                name = "turnSouthEast";
                break;
            }
            case 10:{
                name = "turnNorthEast";
                break;
            }
            case 11:{
                name ="tNorthSouthWest";
                break;
            }
            case 12:{
                name ="tNorthSouthEast";
                break;
            }
            case 13:{
                name ="tNorthWestEast";
                break;
            }
            case 14:{
                name ="tSouthWestEast";
                break;
            }
            case 15:{
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
