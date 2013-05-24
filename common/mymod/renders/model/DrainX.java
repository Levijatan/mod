package mymod.renders.model;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.client.FMLClientHandler;

import mymod.block.tileEntity.transport.liquid.DrainTileEntity;
import net.minecraft.client.model.ModelBase;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;

public class DrainX extends ModelBase {
    
    private IModelCustom modelDrain;
    
    public DrainX() {
        
        modelDrain = AdvancedModelLoader.loadModel("/mods/MM/models/drain4Way.obj");
    }
    
    public void render() {
        
        modelDrain.renderAll();
    }
    
    public void render(DrainTileEntity drain, double x, double y, double z) {
        
        
        GL11.glPushMatrix();
        
        GL11.glTranslatef((float)x + 0.5f, (float)y + 0.0f, (float)z + 0.5f);
        
        GL11.glScalef(0.20f, 0.20f, 0.20f);
        
        FMLClientHandler.instance().getClient().renderEngine.bindTexture("/mods/MM/textures/blocks/drain4Way.png");
        
        this.render();
        
        GL11.glPopMatrix();
        
    }

}
