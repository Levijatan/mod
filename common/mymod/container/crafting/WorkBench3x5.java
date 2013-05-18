package mymod.container.crafting;

import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.ContainerWorkbench;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.world.World;

import mymod.util.*;
import mymod.util.crafting.MyCraftingManager;

public class WorkBench3x5 extends ContainerWorkbench{
    
    public InventoryCrafting craftMatrix = new InventoryCrafting(this, 3, 5);
    private World worldObj;

    public WorkBench3x5(InventoryPlayer inventoryPlayer, World world,
            int posX, int posY, int posZ) {
        super(inventoryPlayer, world, posX, posY, posZ);
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public void onCraftMatrixChanged(IInventory par1IInventory)
    {
        this.craftResult.setInventorySlotContents(0, MyCraftingManager.getInstance("3x5").findMatchingRecipe(this.craftMatrix, this.worldObj));
    }

}
