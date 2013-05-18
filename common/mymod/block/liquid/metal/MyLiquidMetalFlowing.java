package mymod.block.liquid.metal;

import net.minecraft.block.material.Material;
import mymod.block.liquid.MyLiquidFlowing;

public abstract class MyLiquidMetalFlowing extends MyLiquidFlowing {

    protected MyLiquidMetalFlowing(int id) {
        super(id, Material.water);
        this.setLightValue(0.3f);
    }
  

}
