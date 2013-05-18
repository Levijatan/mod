package mymod.block.tileEntity;

import cpw.mods.fml.common.registry.GameRegistry;

public class TileEntityContainer {
    
    public static void init() {
        GameRegistry.registerTileEntity(mymod.block.tileEntity.transport.liquid.DrainTileEntity.class, "drainTileEntity");
    }

}
