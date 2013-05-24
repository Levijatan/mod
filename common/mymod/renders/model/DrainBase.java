package mymod.renders.model;

import mymod.block.tileEntity.transport.liquid.DrainTileEntity;
import net.minecraft.client.model.ModelBase;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.client.FMLClientHandler;

public class DrainBase extends ModelBase {
    
    private IModelCustom modelDrain;
    
    public DrainBase() {
        
        modelDrain = AdvancedModelLoader.loadModel("/mods/MM/models/drainBase.obj");
    }
    
    public void render() {
        
        modelDrain.renderAll();
    }
    
    public void render(DrainTileEntity drain, double x, double y, double z) {
        
        GL11.glPushMatrix();
        
        GL11.glTranslatef((float)x + 0.5f, (float)y + 0.0f, (float)z + 0.5f);
        
        GL11.glScalef(0.20f, 0.20f, 0.20f);
        
        FMLClientHandler.instance().getClient().renderEngine.bindTexture("/mods/MM/textures/blocks/drainBase.png");
        
        this.render();
        
        GL11.glPopMatrix();
        
    }

}