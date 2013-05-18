package mymod.util.crafting;

import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.liquids.LiquidStack;

public class MyLiquidRecipe {
    
    private LiquidStack[] input;
    
    private LiquidStack output;

    public MyLiquidRecipe(LiquidStack output, LiquidStack[] input) {
        this.input = input;
        this.output = output;
    }
    
    public boolean isRecipe(LiquidStack slot1, LiquidStack slot2) {
        
    }

}
