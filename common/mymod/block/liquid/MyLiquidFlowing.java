package mymod.block.liquid;

import net.minecraft.block.BlockFlowing;
import net.minecraft.block.material.Material;
import net.minecraftforge.liquids.IBlockLiquid;

public abstract class MyLiquidFlowing extends BlockFlowing implements IBlockLiquid {

    protected MyLiquidFlowing(int id, Material material) {
        super(id, material);
        // TODO Auto-generated constructor stub
    }

}
