package mymod.block.ore;

import mymod.block.MyBlock;
import mymod.item.orechunk.MyChunk;
import net.minecraft.block.StepSound;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class MyOre extends MyBlock {

    public MyOre(int id, Material material, float hardness,
            StepSound stepSound, String name, CreativeTabs tab) {
        super(id, material, hardness, stepSound, name, tab);
        // TODO Auto-generated constructor stub
    }
    
    public int idDropped(MyChunk chunk) {
        int dropID = chunk.itemID;
        return dropID;
    }
    
}