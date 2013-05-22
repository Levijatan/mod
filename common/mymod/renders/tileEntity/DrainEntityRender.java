package mymod.renders.tileEntity;

import mymod.block.tileEntity.transport.liquid.DrainTileEntity;
import mymod.renders.model.DrainX;
import mymod.renders.model.DrainStraight;
import mymod.renders.model.DrainTurn;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;

public class DrainEntityRender extends TileEntitySpecialRenderer{
    
    private DrainX drainX = new DrainX();
    private DrainStraight drainStraight = new DrainStraight();
    private DrainTurn drainTurn = new DrainTurn();

    @Override
    public void renderTileEntityAt(TileEntity tileentity, double x, double y,
            double z, float f) {
        
        switch (tileentity.blockMetadata){
            case 0:
                drainStraight.render((DrainTileEntity)tileentity, x, y, z, false);
                break;
            case 1:
                drainStraight.render((DrainTileEntity)tileentity, x, y, z, true);
                break;
            case 2:
                drainTurn.render((DrainTileEntity)tileentity, x, y, z, 3);
                break;
            case 3:
                drainTurn.render((DrainTileEntity)tileentity, x, y, z, 2);
                break;
            case 4:
                drainTurn.render((DrainTileEntity)tileentity, x, y, z, 0);
                break;
            case 5:
                drainTurn.render((DrainTileEntity)tileentity, x, y, z, 1);
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                drainX.render((DrainTileEntity)tileentity, x, y, z);
                break;
            default:
                break;
        }
        
    }

}
