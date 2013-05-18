package mymod.block.tileEntity.transport.liquid;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.INetworkManager;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.Packet132TileEntityData;
import mymod.block.tileEntity.MyTileEntity;

public class DrainTileEntity extends MyTileEntity {

    public int directionDrain;
    
    @Override
    public void writeToNBT(NBTTagCompound par1)
    {
       super.writeToNBT(par1);
       par1.setInteger("directionDrain", directionDrain);
    }

    @Override
    public void readFromNBT(NBTTagCompound par1)
    {
       super.readFromNBT(par1);
       directionDrain = par1.getInteger("directionDrain");
    }
    
    @Override
    public Packet getDescriptionPacket() {
        NBTTagCompound nbtTag = new NBTTagCompound();
        this.writeToNBT(nbtTag);
        return new Packet132TileEntityData(this.xCoord, this.yCoord, this.zCoord, 1, nbtTag);
    }
    
    @Override
    public void onDataPacket(INetworkManager net, Packet132TileEntityData packet) {
        readFromNBT (packet.customParam1);
    }
   
}
