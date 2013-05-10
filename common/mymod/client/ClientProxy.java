package mymod.client;

import net.minecraftforge.client.MinecraftForgeClient;
import mymod.MyProxy;

public class ClientProxy extends MyProxy {
    
    @SuppressWarnings("deprecation")
    @Override
    public void registerRenderers() {
            MinecraftForgeClient.preloadTexture(ITEMS_PNG);
            MinecraftForgeClient.preloadTexture(BLOCK_PNG);
    }

}
