package mymod.recipes;

import net.minecraft.item.ItemStack;
import mymod.block.BlockContainer;
import mymod.item.ItemContainer;
import mymod.util.crafting.MyCraftingManager;

public class MyRecipes {

    public static void init(){
        MyCraftingManager.getInstance("3x5").addRecipe(new ItemStack(BlockContainer.itemMetalBlock,  1, 1), new Object[] {"###", "###","###","###","###",'#', ItemContainer.bronzeIngot});
    }
}
