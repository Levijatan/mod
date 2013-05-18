package mymod.renders.tileEntity;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.client.FMLClientHandler;

import mymod.block.BlockContainer;
import mymod.block.tileEntity.transport.liquid.DrainTileEntity;
import mymod.renders.DrainModel;
import mymod.renders.DrainModelOBJ;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class DrainEntityRender extends TileEntitySpecialRenderer{
    
    private DrainModelOBJ drainModel = new DrainModelOBJ();

    @Override
    public void renderTileEntityAt(TileEntity tileentity, double x, double y,
            double z, float f) {
        drainModel.render((DrainTileEntity)tileentity, x, y, z);
        
    }

}
