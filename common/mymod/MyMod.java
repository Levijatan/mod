package mymod;

import mymod.block.BlockContainer;
import mymod.block.tileEntity.TileEntityContainer;
import mymod.item.ItemContainer;
import mymod.lib.Reference;
import mymod.recipes.MyRecipes;
import mymod.recipes.VanillaRecipes;
import mymod.recipes.VanillaSmeltingRecipes;
import mymod.worldgen.WorldGenContainer;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class MyMod {
    
     @Instance ("MyMod")
     public static MyMod instance;
   
     @SidedProxy (clientSide = "mymod.client.ClientProxy", serverSide = "mymod.CommonProxy")
     public static CommonProxy proxy;
     
     @PreInit
     public void preInit(FMLPreInitializationEvent event) {
         
         
         
     }
     
     @Init
     public void init(FMLInitializationEvent event) {
         
         ItemContainer.init();
         BlockContainer.init();
         TileEntityContainer.init();
         WorldGenContainer.init();
         VanillaRecipes.init();
         VanillaSmeltingRecipes.init();
         MyRecipes.init();
         proxy.registerRenderers();
         
     }
     
     @PostInit
     public void postInit(FMLPostInitializationEvent event) {
         
     }
}
