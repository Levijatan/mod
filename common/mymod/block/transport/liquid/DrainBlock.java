package mymod.block.transport.liquid;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;
import mymod.block.MyBlock;
import mymod.block.tileEntity.transport.liquid.DrainTileEntity;
import mymod.lib.BlockIds;
import mymod.util.transport.MyConnector;

public class DrainBlock extends MyBlock implements MyConnector{
    
    

    public DrainBlock(int id) {
        super(id, Material.iron);
        // TODO Auto-generated constructor stub
    }
    
    private int x;
    private int y;
    private int z;
    
    private String[] blocknames = {"base", "stopperNorth", "stopperWest", "stopperSouth", "stopperEast", "straightNorthSouth", "straightEastWest", "turnSouthWest", "turnNorthWest", "turnSouthEast", "turnNorthEast", 
            "tNorthSouthWest", "tNorthSouthEast", "tNorthWestEast", "tSouthWestEast","cross"};
    
    
    @Override
    public int idDropped(int par1, Random random, int par2) {
        return BlockIds.TRANSPORT_LIQUID_DRAIN;
    }
    
    @Override
    public boolean shouldSideBeRendered(IBlockAccess iblockaccess, int i, int j, int k, int l) {
        return false;
    }
    
    @Override
    public boolean isOpaqueCube() {
        return false;
    }
   
    @Override
    public boolean hasTileEntity(int metadata)
    {
        return true;
    }
    
    @Override
    public TileEntity createTileEntity(World world, int metadata)
    {
        
        return new DrainTileEntity(renderChooser(world, x, y, z));
    }
    
    @Override
    public int getRenderType()
    {
        return -1;
    }
    
    public int renderChooser(World world, int x, int y, int z) {
        ArrayList<ForgeDirection> directions = checkSidesForConnectable(world,
                x, y, z);
        boolean north = false;
        boolean south = false;
        boolean west = false;
        boolean east = false;
        for (int i = 0; i < directions.size(); i++) {
            if (directions.get(i) == ForgeDirection.NORTH) {
                north = true;
            }
            if (directions.get(i) == ForgeDirection.SOUTH) {
                south = true;
            }
            if (directions.get(i) == ForgeDirection.EAST) {
                east = true;
            }
            if (directions.get(i) == ForgeDirection.WEST) {
                west = true;
            }
        }
        if(north && south && east && west){
            return 15;
        }
        else if(south && west && east){
            return 14;
        }
        else if(north && west && east){
            return 13;
        }
        else if(north && south && east){
            return 12;
        }
        else if(north && south && west){
            return 11;
        }
        else if(north && east){
            return 10;
        }
        else if(south && east){
            return 9;
        }
        else if(north && west){
            return 8;
        }
        else if(south && west){
            return 7;
        }
        else if(east && west){
            return 6;
        }
        else if(north && south){
            return 5;
        }
        else if(east){
            return 4;
        }
        else if(south){
            return 3;
        }
        else if(west){
            return 2;
        }
        else if(north){
            return 1;
        }
        else{
            return 0;
        }
        
    }
    
     @Override
     public int onBlockPlaced(World world, int x, int y, int z, int side, float par6, float par7, float par8, int meta){
         
         this.x = x;
         this.y = y;
         this.z = z;
         this.onNeighborBlockChange(world, x, y, z, this.blockID);
         return meta;
     }
     
     
     @SuppressWarnings({ "unchecked", "rawtypes" })
     @SideOnly(Side.CLIENT)
     public void getSubBlocks(int par1, CreativeTabs creativeTabs, List par3List) {
         for(int i = 0; i < blocknames.length; i++) {
             par3List.add(new ItemStack(par1, 1, i));
         }
     }

    @Override
    public boolean isConnectable(World world, Block block, int x, int y, int z) {
        
        int block2Id = world.getBlockId(x, y, z);
        if (block2Id == block.blockID) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public ArrayList<ForgeDirection> checkSidesForConnectable(World world,
            int x, int y, int z) {
        ArrayList<ForgeDirection> directions = new ArrayList<ForgeDirection>();
        
        int blockID = this.blockID;
        
        if (world.getBlockId(x - 1, y, z)== blockID) {
            directions.add(ForgeDirection.WEST);
        }
        if (world.getBlockId(x + 1, y, z) == blockID) {
            directions.add(ForgeDirection.EAST);
        }
        if (world.getBlockId(x, y, z - 1) == blockID) {
            directions.add(ForgeDirection.NORTH);
        }
        if (world.getBlockId(x, y, z + 1) == blockID) {
            directions.add(ForgeDirection.SOUTH);
        }
        return directions;
    }
    
    @Override
    public void onNeighborBlockChange(World world, int x, int y, int z, int neighborBlockID) {
        super.onNeighborBlockChange(world, x, y, z, neighborBlockID);
        TileEntity tile = world.getBlockTileEntity(x, y, z);
        if (tile instanceof DrainTileEntity) {
            ((DrainTileEntity)tile).setRender(renderChooser(world, x, y, z));
            world.markBlockForUpdate(x, y, z);
        }
    }

}
