package mymod.renders.tileEntity;

import mymod.block.tileEntity.transport.liquid.DrainTileEntity;
import mymod.renders.model.DrainX;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;

public class DrainCrossEntityRender extends TileEntitySpecialRenderer{
    
    private DrainX drainModel = new DrainX();

    @Override
    public void renderTileEntityAt(TileEntity tileentity, double x, double y,
            double z, float f) {
        drainModel.render((DrainTileEntity)tileentity, x, y, z);
        
    }

}
