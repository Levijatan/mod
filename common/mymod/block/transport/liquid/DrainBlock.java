package mymod.block.transport.liquid;

import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLiving;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import mymod.block.MyBlock;
import mymod.block.tileEntity.transport.liquid.DrainTileEntity;

public class DrainBlock extends MyBlock{

    public DrainBlock(int id) {
        super(id, Material.ground);
        // TODO Auto-generated constructor stub
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
       return new DrainTileEntity();
    }
    
    @Override
    public int getRenderType()
    {
        return -1;
    }
    

}
