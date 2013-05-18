package mymod.block.tileEntity;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

public abstract class MyTileEntity extends TileEntity {

    public void writeToNBT(NBTTagCompound par1)
    {
       super.writeToNBT(par1);
    }

    public void readFromNBT(NBTTagCompound par1)
    {
       super.readFromNBT(par1);
    }

}
