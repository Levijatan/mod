package mymod.util.transport;

import java.util.ArrayList;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;

public interface MyConnector {
    
    public boolean isConnectable(World world, Block block, int x, int y, int z);
    
    public ArrayList<ForgeDirection> checkSidesForConnectable(World world, int x, int y, int z);

}