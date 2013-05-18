package mymod.recipes;

import net.minecraft.item.ItemStack;
import mymod.block.BlockContainer;
import mymod.item.ItemContainer;
import cpw.mods.fml.common.registry.GameRegistry;

public class VanillaRecipes {
    
    public static void init(){
        
        //storage Blocks
        GameRegistry.addShapelessRecipe(new ItemStack(BlockContainer.myMetalBlock, 1, 0), new Object[]{ new ItemStack(ItemContainer.brassIngot), new ItemStack(ItemContainer.brassIngot), 
            new ItemStack(ItemContainer.brassIngot), new ItemStack(ItemContainer.brassIngot), new ItemStack(ItemContainer.brassIngot), new ItemStack(ItemContainer.brassIngot), 
            new ItemStack(ItemContainer.brassIngot), new ItemStack(ItemContainer.brassIngot), new ItemStack(ItemContainer.brassIngot)});
        GameRegistry.addShapelessRecipe(new ItemStack(BlockContainer.myMetalBlock, 1, 1), new Object[]{ new ItemStack(ItemContainer.bronzeIngot), new ItemStack(ItemContainer.bronzeIngot), 
            new ItemStack(ItemContainer.bronzeIngot), new ItemStack(ItemContainer.bronzeIngot), new ItemStack(ItemContainer.bronzeIngot), new ItemStack(ItemContainer.bronzeIngot), 
            new ItemStack(ItemContainer.bronzeIngot), new ItemStack(ItemContainer.bronzeIngot), new ItemStack(ItemContainer.bronzeIngot)});
        GameRegistry.addShapelessRecipe(new ItemStack(BlockContainer.myMetalBlock, 1, 2), new Object[]{ new ItemStack(ItemContainer.copperIngot),  new ItemStack(ItemContainer.copperIngot) ,
            new ItemStack(ItemContainer.copperIngot),  new ItemStack(ItemContainer.copperIngot),  new ItemStack(ItemContainer.copperIngot),  new ItemStack(ItemContainer.copperIngot),
            new ItemStack(ItemContainer.copperIngot),  new ItemStack(ItemContainer.copperIngot),  new ItemStack(ItemContainer.copperIngot)});
        GameRegistry.addShapelessRecipe(new ItemStack(BlockContainer.myMetalBlock, 1, 3), new Object[]{new ItemStack(ItemContainer.tinIngot), new ItemStack(ItemContainer.tinIngot), 
            new ItemStack(ItemContainer.tinIngot), new ItemStack(ItemContainer.tinIngot), new ItemStack(ItemContainer.tinIngot), new ItemStack(ItemContainer.tinIngot),
            new ItemStack(ItemContainer.tinIngot), new ItemStack(ItemContainer.tinIngot), new ItemStack(ItemContainer.tinIngot)});
        GameRegistry.addShapelessRecipe(new ItemStack(BlockContainer.myMetalBlock, 1, 4), new Object[]{ new ItemStack(ItemContainer.zincIngot), new ItemStack(ItemContainer.zincIngot), 
            new ItemStack(ItemContainer.zincIngot), new ItemStack(ItemContainer.zincIngot), new ItemStack(ItemContainer.zincIngot), new ItemStack(ItemContainer.zincIngot), 
            new ItemStack(ItemContainer.zincIngot), new ItemStack(ItemContainer.zincIngot), new ItemStack(ItemContainer.zincIngot)});
        
        //storage block uncraft
        GameRegistry.addShapelessRecipe(new ItemStack(ItemContainer.brassIngot, 9), new Object[]{ new ItemStack(BlockContainer.myMetalBlock, 1, 0)});
        GameRegistry.addShapelessRecipe(new ItemStack(ItemContainer.bronzeIngot, 9), new Object[]{ new ItemStack(BlockContainer.myMetalBlock, 1, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(ItemContainer.copperIngot, 9), new Object[]{ new ItemStack(BlockContainer.myMetalBlock, 1, 2)});
        GameRegistry.addShapelessRecipe(new ItemStack(ItemContainer.tinIngot, 9), new Object[]{ new ItemStack(BlockContainer.myMetalBlock, 1, 3)});
        GameRegistry.addShapelessRecipe(new ItemStack(ItemContainer.zincIngot, 9), new Object[]{ new ItemStack(BlockContainer.myMetalBlock, 1, 4)});

        
    }
}
