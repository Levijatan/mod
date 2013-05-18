package mymod.block.liquid.metal;

import mymod.lib.BlockIds;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class LiquidCopperFlowing extends MyLiquidMetalFlowing {

    public LiquidCopperFlowing(int id) {
        super(id);
        this.setUnlocalizedName("liquidCopperFlowing");
    }

    @Override
    public int stillLiquidId() {
        // TODO Auto-generated method stub
        return BlockIds.LIQUID_COPPER_STILL;
    }

    @Override
    public boolean isMetaSensitive() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public int stillLiquidMeta() {
        // TODO Auto-generated method stub
        return 0;
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister) {
        this.theIcon = new Icon[] { iconRegister.registerIcon("LiquidCopperStill"), iconRegister.registerIcon("LiquidCopperFlowing") };
    }

    @Override
    public boolean willGenerateSources() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public int getFlowDistance() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public byte[] getLiquidRGB() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getLiquidBlockTextureFile() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public NBTTagCompound getLiquidProperties() {
        // TODO Auto-generated method stub
        return null;
    }

}
