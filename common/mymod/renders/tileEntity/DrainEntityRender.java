package mymod.renders.tileEntity;

import mymod.block.tileEntity.transport.liquid.DrainTileEntity;
import mymod.renders.model.Drain3Way;
import mymod.renders.model.DrainBase;
import mymod.renders.model.DrainStop;
import mymod.renders.model.DrainX;
import mymod.renders.model.DrainStraight;
import mymod.renders.model.DrainTurn;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;

public class DrainEntityRender extends TileEntitySpecialRenderer{
    
    private DrainX drainX = new DrainX();
    private DrainStraight drainStraight = new DrainStraight();
    private DrainTurn drainTurn = new DrainTurn();
    private DrainBase drainBase = new DrainBase();
    private Drain3Way drain3Way = new Drain3Way();
    private DrainStop drainStop = new DrainStop();
    
    

    @Override
    public void renderTileEntityAt(TileEntity tileentity, double x, double y,
            double z, float f) {
        int render = ((DrainTileEntity)tileentity).render;
        switch (render){
            case 0:
                drainBase.render((DrainTileEntity) tileentity, x, y, z);
                break;
            case 1:
                drainStop.render((DrainTileEntity) tileentity, x, y, z, 2);
                break;
            case 2:
                drainStop.render((DrainTileEntity) tileentity, x, y, z, 3);
                break;
            case 3:
                drainStop.render((DrainTileEntity) tileentity, x, y, z, 0);
                break;
            case 4:
                drainStop.render((DrainTileEntity) tileentity, x, y, z, 1);
                break;
            case 5:
                drainStraight.render((DrainTileEntity)tileentity, x, y, z, false);
                break;
            case 6:
                drainStraight.render((DrainTileEntity)tileentity, x, y, z, true);
                break;
            case 7:
                drainTurn.render((DrainTileEntity)tileentity, x, y, z, 3);
                break;
            case 8:
                drainTurn.render((DrainTileEntity)tileentity, x, y, z, 2);
                break;
            case 9:
                drainTurn.render((DrainTileEntity)tileentity, x, y, z, 0);
                break;
            case 10:
                drainTurn.render((DrainTileEntity)tileentity, x, y, z, 1);
                break;
            case 11:
                drain3Way.render((DrainTileEntity) tileentity, x, y, z, 2);
                break;
            case 12:
                drain3Way.render((DrainTileEntity) tileentity, x, y, z, 0);
                break;
            case 13:
                drain3Way.render((DrainTileEntity) tileentity, x, y, z, 1);
                break;
            case 14:
                drain3Way.render((DrainTileEntity) tileentity, x, y, z, 3);
                break;
            case 15:
                drainX.render((DrainTileEntity)tileentity, x, y, z);
                break;
            default:
                break;
        }
        
    }

}
