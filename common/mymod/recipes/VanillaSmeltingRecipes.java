package mymod.recipes;

import mymod.item.ItemContainer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;

public class VanillaSmeltingRecipes {
    
    public static void init() {
        
        //Ingot Recipes
        FurnaceRecipes.smelting().addSmelting(ItemContainer.copperChunk.itemID, new ItemStack(ItemContainer.copperIngot), 0.1F);
        FurnaceRecipes.smelting().addSmelting(ItemContainer.tinChunk.itemID, new ItemStack(ItemContainer.tinIngot), 0.1F);
        FurnaceRecipes.smelting().addSmelting(ItemContainer.zincChunk.itemID, new ItemStack(ItemContainer.zincIngot), 0.1F);
    }

}
