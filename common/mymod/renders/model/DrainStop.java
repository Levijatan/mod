package mymod.renders.model;

import mymod.block.tileEntity.transport.liquid.DrainTileEntity;
import net.minecraft.client.model.ModelBase;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.client.FMLClientHandler;

public class DrainStop extends ModelBase {
    
    private IModelCustom modelDrain;
    
    public DrainStop() {
        
        modelDrain = AdvancedModelLoader.loadModel("/mods/MM/models/drain1Way.obj");
    }
    
    public void render() {
        
        modelDrain.renderAll();
    }
    
    public void render(DrainTileEntity drain, double x, double y, double z, int direction) {
        
        GL11.glPushMatrix();
        
        GL11.glTranslatef((float)x + 0.5f, (float)y + 0.0f, (float)z + 0.5f);
        
        GL11.glScalef(0.20f, 0.20f, 0.20f);
        
        switch (direction) {
            case 0:
                break;
            case 1:
                GL11.glRotatef(90F, 0F, 1.0F, 0.0F);
                break;
            case 2:
                GL11.glRotatef(180F, 0F, 1.0F, 0.0F);
                break;
            case 3:
                GL11.glRotatef(270F, 0F, 1.0F, 0.0F);
                break;
        }
        
        FMLClientHandler.instance().getClient().renderEngine.bindTexture("/mods/MM/textures/blocks/drain1Way.png");
        
        this.render();
        
        GL11.glPopMatrix();
        
    }

}
