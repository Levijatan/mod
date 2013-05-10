package mymod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import mymod.block.MyBlock;
import mymod.block.ore.MyOre;
import mymod.item.MyItem;
import mymod.lib.Reference;
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
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class MyMod {
    
     @Instance ("MyMod")
     public static MyMod instance;
     
     //Items
     public final static Item myItem = new MyItem(9000, 64, CreativeTabs.tabMisc, 1, "myItem");
     public final static Item myIngot = new MyItem(9001, 64, CreativeTabs.tabMisc, 1, "myIngot");
     public final static Item myOreChunck = new MyItem(9001, 64, CreativeTabs.tabMaterials, 1, "myOreChunk");
     
     //Blocks
     public final static Block myDirt = new MyBlock(500, Material.ground, 0.5F, Block.soundGravelFootstep, "myDirt", CreativeTabs.tabBlock);

     //Ores
     public final static Block myOre = new MyOre(501, Material.iron, 4.0F, Block.soundStoneFootstep, "myOre", CreativeTabs.tabBlock);
     
     @SidedProxy (clientSide = "mymod.client.ClientProxy", serverSide = "mymod.MyProxy")
     public static MyProxy proxy;
     
     @PreInit
     public void preInit(FMLPreInitializationEvent event) {
         
     }
     
     @Init
     public void init(FMLInitializationEvent event) {
         //Items
         LanguageRegistry.addName(myItem, "My Item");
         LanguageRegistry.addName(myIngot, "My Ingot");
         
         //Blocks
         LanguageRegistry.addName(myDirt, "My Dirt");
         MinecraftForge.setBlockHarvestLevel(myDirt, "shovel", 0);
         GameRegistry.registerBlock(myDirt, "myDirt");
         
         //Ores
         LanguageRegistry.addName(myOre, "My Ore");
         MinecraftForge.setBlockHarvestLevel(myOre, "pickaxe", 3);
         GameRegistry.registerBlock(myOre, "myOre");
         
         proxy.registerRenderers();
     }
     
     @PostInit
     public void postInit(FMLPostInitializationEvent event) {
         
     }
}
