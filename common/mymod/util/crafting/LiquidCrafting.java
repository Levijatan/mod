package mymod.util.crafting;

import net.minecraftforge.liquids.LiquidStack;
import net.minecraftforge.liquids.LiquidTank;

import net.minecraft.inventory.Container;

public class LiquidCrafting {
    
    private LiquidTank[] liquidList;
    
    private int nmbLiquidInput;
    
    public int getNmbLiquidInput() {
        return nmbLiquidInput;
    }

    public void setNmbLiquidInput(int nmbLiquidInput) {
        this.nmbLiquidInput = nmbLiquidInput;
    }

    private int maxLiquidInTank;

   public LiquidCrafting(int nmbLiquidInput, int maxLiquidInTank) {
       liquidList = new LiquidTank[nmbLiquidInput];
       setMaxLiquidInTank(maxLiquidInTank);
       setNmbLiquidInput(nmbLiquidInput);
   }
   
   public int getNmbOfLiquid() {
       return nmbLiquidInput;
   }
   
   public LiquidTank getLiquidInTank(int tank) {
       if (tank < this.getNmbOfLiquid()) {
           return liquidList[tank];
       }
       else {
           return null;
       }
   }
   
   public String getInvName()
   {
       return "mymod.container.liquid.crafting";
   }
   
   public boolean isInvNameLocalized() {
       return false;
   }

   public int getMaxLiquidInTank() {
       return maxLiquidInTank;
   }

   public void setMaxLiquidInTank(int maxLiquidInTank) {
       this.maxLiquidInTank = maxLiquidInTank;
   }
   
   public LiquidStack drainLiquid(int tank, int amount) {
       if (liquidList[tank] != null) {
           
       }
       else {
           return null;
       }
   }

}
