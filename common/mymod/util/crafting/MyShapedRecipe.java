package mymod.util.crafting;

import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class MyShapedRecipe implements IRecipe {
    
    public final int recipeOutputID;
    private final int sizeX;
    private final int sizeY;
    private final int tableX;
    private final int tableY;
    private final ItemStack[] inputArray;
    private final ItemStack output;
    private boolean hasMeta = false;
    
    public MyShapedRecipe(int sizeX, int sizeY, ItemStack[] inputArray, ItemStack output, int tableX, int tableY) {
        this.recipeOutputID = output.itemID;
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.inputArray = inputArray;
        this.output = output;
        this.tableX = tableX;
        this.tableY = tableY;
    }

    @Override
    public boolean matches(InventoryCrafting invCraft, World world) {
        for (int i = 0; i <= tableX - sizeX; i++) {
            for (int j = 0; j <= tableY - sizeY; j++) {
                if (isMatch(invCraft, i, j, true)) {
                    return true;
                }
                
                if (isMatch(invCraft, i, j, false)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private boolean isMatch(InventoryCrafting invCraft, int a, int h, boolean t) {
        
        for (int k = 0; k < tableX; k++) {
            
            for (int i = 0; i < tableY; i++) {
                
                int i1 = k - a;
                int j1 = i - h;
                ItemStack itemStack = null;
                
                if (i1 >= 0 && j1 >= 0 && i1 < sizeX && j1 < sizeY) {
                    if (t) {
                        itemStack = inputArray[sizeX - i1 - 1 + j1 * sizeX];
                    }
                    else {
                        itemStack = inputArray[i1 + j1 * sizeX];
                    }
                }
                
                ItemStack itemStack1 = invCraft.getStackInRowAndColumn(k, i);
                
                if (itemStack1 != null || itemStack != null) {
                    if (itemStack1 == null && itemStack != null || itemStack1 != null && itemStack == null){
                        return false;
                    }
                    
                    if (itemStack.itemID != itemStack1.itemID) {
                        return false;
                    }
                    
                    if (itemStack.getItemDamage() != 32767 && itemStack.getItemDamage() != itemStack1.getItemDamage()) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @Override
    public ItemStack getCraftingResult(InventoryCrafting invCraft) {
        
        ItemStack itemStack = this.getRecipeOutput().copy();
        
        if (hasMeta) {
            
            for (int i = 0; i < invCraft.getSizeInventory(); i++) {
                
                ItemStack itemStack1 = invCraft.getStackInSlot(i);
                
                if (itemStack1 != null && itemStack1.hasTagCompound()) {
                    itemStack.setTagCompound((NBTTagCompound)itemStack1.stackTagCompound.copy());
                }
            }
        }
        return itemStack;
    }

    @Override
    public int getRecipeSize() {
        
        return sizeX * sizeY;
    }

    @Override
    public ItemStack getRecipeOutput() {
        
        return output;
    }
    
    public MyShapedRecipe hasMeta() {
        hasMeta = true;
        return this;
    }

}
