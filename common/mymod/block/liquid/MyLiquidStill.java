package mymod.block.liquid;

import net.minecraft.block.BlockStationary;
import net.minecraft.block.material.Material;
import net.minecraftforge.liquids.IBlockLiquid;

public abstract class MyLiquidStill extends BlockStationary implements IBlockLiquid {

    protected MyLiquidStill(int id, Material material) {
        super(id, material);
        // TODO Auto-generated constructor stub
    }

}
