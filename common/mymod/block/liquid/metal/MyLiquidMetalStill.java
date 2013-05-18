package mymod.block.liquid.metal;

import net.minecraft.block.material.Material;
import mymod.block.liquid.MyLiquidStill;

public abstract class MyLiquidMetalStill extends MyLiquidStill {

    protected MyLiquidMetalStill(int id) {
        super(id, Material.water);
        this.setLightValue(0.3f);
    }

}
