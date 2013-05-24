package mymod.block.tileEntity.transport.liquid;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.INetworkManager;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.Packet132TileEntityData;
import net.minecraftforge.common.ForgeDirection;
import net.minecraftforge.liquids.ILiquidTank;
import net.minecraftforge.liquids.ITankContainer;
import net.minecraftforge.liquids.LiquidStack;
import mymod.block.tileEntity.MyTileEntity;

public class DrainTileEntity extends MyTileEntity implements ITankContainer {

    public int render;
    

    public DrainTileEntity(){
        render = 0;
    }
    
    public DrainTileEntity(int render){
        this.render = render;
    }
    
    @Override
    public void updateEntity() {
    }
    
    public int getRender() {
        return render;
    }

    public void setRender(int render) {
        this.render = render;
    }

    @Override
    public void writeToNBT(NBTTagCompound nbt)
    {
       super.writeToNBT(nbt);
       nbt.setInteger("render", render);
    }

    @Override
    public void readFromNBT(NBTTagCompound nbt)
    {
       super.readFromNBT(nbt);
       render = nbt.getInteger("render");
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

    @Override
    public int fill(ForgeDirection from, LiquidStack resource, boolean doFill) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int fill(int tankIndex, LiquidStack resource, boolean doFill) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public LiquidStack drain(ForgeDirection from, int maxDrain, boolean doDrain) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public LiquidStack drain(int tankIndex, int maxDrain, boolean doDrain) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ILiquidTank[] getTanks(ForgeDirection direction) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ILiquidTank getTank(ForgeDirection direction, LiquidStack type) {
        // TODO Auto-generated method stub
        return null;
    }

}
