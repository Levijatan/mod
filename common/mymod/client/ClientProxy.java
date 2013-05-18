package mymod.client;

import net.minecraftforge.client.MinecraftForgeClient;
import cpw.mods.fml.client.registry.ClientRegistry;
import mymod.CommonProxy;
import mymod.block.BlockContainer;
import mymod.block.tileEntity.transport.liquid.DrainTileEntity;
import mymod.renders.item.ItemDrainRender;
import mymod.renders.tileEntity.DrainEntityRender;

public class ClientProxy extends CommonProxy {
    
    @Override
    public void registerRenderers() {
        ClientRegistry.bindTileEntitySpecialRenderer(DrainTileEntity.class, new DrainEntityRender() );
        MinecraftForgeClient.registerItemRenderer(BlockContainer.drainBlock.blockID, new ItemDrainRender());
    }

}
