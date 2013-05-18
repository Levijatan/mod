package mymod.renders.item;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.client.FMLClientHandler;

import mymod.renders.DrainModelOBJ;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;

public class ItemDrainRender implements IItemRenderer{

    private DrainModelOBJ drainModel;
    
    public ItemDrainRender() {
        drainModel = new DrainModelOBJ();
    }
    
    @Override
    public boolean handleRenderType(ItemStack item, ItemRenderType type) {
        return true;
    }

    @Override
    public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item,
            ItemRendererHelper helper) {
        return true;
    }

    @Override
    public void renderItem(ItemRenderType type, ItemStack item, Object... data) {

        switch(type){
            case ENTITY:{
                renderDrain(0f, 0f, 0f, 2.0f);
                return;
            }
            case EQUIPPED:{
                renderDrain(0f, 1f, 1f, 2.0f);
                return;
            }
            case INVENTORY:{
                renderDrain(0f, -0.5f, 0f, 2.0f);
                return;
            }
        }
    }
    
    public void renderDrain(float x, float y, float z, float scale) {
        GL11.glPushMatrix();
        
        GL11.glDisable(GL11.GL_LIGHTING);
        
        GL11.glTranslatef(x, y, z);
        GL11.glScalef(scale, scale, scale);
        GL11.glRotatef(180f, 0f, 1f, 0f);
        
        FMLClientHandler.instance().getClient().renderEngine.bindTexture("/mods/MM/textures/blocks/drain.Brass.png");
        
        drainModel.render();
        
        GL11.glEnable(GL11.GL_LIGHTING);
        GL11.glPopMatrix();
        
    }

}
