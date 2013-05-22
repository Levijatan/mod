package mymod.renders.model;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.client.FMLClientHandler;

import mymod.block.tileEntity.transport.liquid.DrainTileEntity;
import net.minecraft.client.model.ModelBase;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;

public class DrainStraight extends ModelBase {
    
    private IModelCustom modelDrain;
    
    public DrainStraight() {
        
        modelDrain = AdvancedModelLoader.loadModel("/mods/MM/models/drain.obj");
    }
    
    public void render() {
        
        modelDrain.renderAll();
    }
    
    public void render(DrainTileEntity drain, double x, double y, double z, Boolean EastWest) {
        
        GL11.glPushMatrix();
        
        GL11.glTranslatef((float)x + 0.5f, (float)y + 0.055f, (float)z + 0.5f);
        
        GL11.glScalef(1.0f, 1.0f, 1.0f);
        
        if (EastWest) {
            GL11.glRotatef(90F, 0F, 1.0F, 0.0F);
        }
        
        FMLClientHandler.instance().getClient().renderEngine.bindTexture("/mods/MM/textures/blocks/drainUVmap.Brass.png");
        
        this.render();
        
        GL11.glPopMatrix();
        
    }

}
