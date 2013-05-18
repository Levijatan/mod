package mymod.util.crafting;

import java.util.LinkedList;
import java.util.List;
import java.util.HashMap;

import net.minecraft.block.Block;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.world.World;


public class MyCraftingManager {
    
    private static final MyCraftingManager instance3x3 = new MyCraftingManager(3, 3);
    private static final MyCraftingManager instance4x4 = new MyCraftingManager(4, 4);
    private static final MyCraftingManager instance3x5 = new MyCraftingManager(3, 5);
    private static final MyCraftingManager instance5x5 = new MyCraftingManager(5, 5);
    
    @SuppressWarnings("rawtypes")
    private List recipes = new LinkedList();
    
    
    private final int craftY;
    private final int craftX;
    
    private MyCraftingManager(int craftX, int craftY) {
        this.craftX = craftX;
        this.craftY = craftY;
    }
    
    public static MyCraftingManager getInstance(String id){
        switch (id){
            case "3x3":{
                return instance3x3;
            }
            case "4x4":{
                return instance4x4;
            }
            case "3x5":{
                return instance3x5;
            }
            case "5x5":{
                return instance5x5;
            }
            default:{
                return null;
            }
        }
    }
    
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public MyShapedRecipe addRecipe(ItemStack output, Object ... arrayOfInput) {
        String s = "";
        int i = 0;
        int j = 0;
        int k = 0;
        
        if (arrayOfInput[i] instanceof String[]) {
            String[] astring = (String[])((String[]) arrayOfInput[i++]);
            
            for (int l = 0; l < astring.length; l++) {
                String s1 = astring[l];
                k++;
                j = s1.length();
                s = s + s1;
            }
        }
        else {
            while (arrayOfInput[i] instanceof String) {
                String s2 = (String)arrayOfInput[i++];
                k++;
                j = s2.length();
                s = s + s2;
            }
        }
        
        HashMap hashmap;
        
        for (hashmap = new HashMap(); i < arrayOfInput.length; i += 2) {
            Character character = (Character)arrayOfInput[i];
            ItemStack itemStack1 = null;
            
            if (arrayOfInput[i +1] instanceof Item) {
                itemStack1 = new ItemStack((Item)arrayOfInput[i + 1]);
            }
            else if (arrayOfInput[i + 1] instanceof Block) {
                itemStack1 = new ItemStack((Block)arrayOfInput[i + 1], 1, 32767);
            }
            else if (arrayOfInput[i + 1] instanceof ItemStack) {
                itemStack1 = (ItemStack)arrayOfInput[i + 1];
            }
            
            hashmap.put(character, itemStack1);
        }
        
        ItemStack[] aItemStack = new ItemStack[j * k];
        
        for (int i1 = 0; i1 < j * k; i1++) {
            char c0 = s.charAt(i1);
            
            if (hashmap.containsKey(Character.valueOf(c0))) {
                aItemStack[i1] = ((ItemStack)hashmap.get(Character.valueOf(c0))).copy();
            }
            else {
                aItemStack[i1] = null;
            }
        }
        
        MyShapedRecipe myShapedRecipe = new MyShapedRecipe(j, k, aItemStack, output, craftX, craftY);
        this.recipes.add(myShapedRecipe);
        return myShapedRecipe;
        
    }
    
    public ItemStack findMatchingRecipe(InventoryCrafting par1InventoryCrafting, World par2World)
    {
        int i = 0;
        ItemStack itemstack = null;
        ItemStack itemstack1 = null;
        int j;

        for (j = 0; j < par1InventoryCrafting.getSizeInventory(); ++j)
        {
            ItemStack itemstack2 = par1InventoryCrafting.getStackInSlot(j);

            if (itemstack2 != null)
            {
                if (i == 0)
                {
                    itemstack = itemstack2;
                }

                if (i == 1)
                {
                    itemstack1 = itemstack2;
                }

                ++i;
            }
        }

        if (i == 2 && itemstack.itemID == itemstack1.itemID && itemstack.stackSize == 1 && itemstack1.stackSize == 1 && Item.itemsList[itemstack.itemID].isRepairable())
        {
            Item item = Item.itemsList[itemstack.itemID];
            int k = item.getMaxDamage() - itemstack.getItemDamageForDisplay();
            int l = item.getMaxDamage() - itemstack1.getItemDamageForDisplay();
            int i1 = k + l + item.getMaxDamage() * 5 / 100;
            int j1 = item.getMaxDamage() - i1;

            if (j1 < 0)
            {
                j1 = 0;
            }

            return new ItemStack(itemstack.itemID, 1, j1);
        }
        else
        {
            for (j = 0; j < this.recipes.size(); ++j)
            {
                IRecipe irecipe = (IRecipe)this.recipes.get(j);

                if (irecipe.matches(par1InventoryCrafting, par2World))
                {
                    return irecipe.getCraftingResult(par1InventoryCrafting);
                }
            }

            return null;
        }
    }


}