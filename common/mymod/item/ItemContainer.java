package mymod.item;

import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import mymod.item.ingot.BrassIngot;
import mymod.item.ingot.BronzeIngot;
import mymod.item.ingot.CopperIngot;
import mymod.item.ingot.MyIngot;
import mymod.item.ingot.TinIngot;
import mymod.item.ingot.ZincIngot;
import mymod.item.orechunk.CopperChunk;
import mymod.item.orechunk.MyChunk;
import mymod.item.orechunk.TinChunk;
import mymod.item.orechunk.ZincChunk;

public class ItemContainer {

    //Ingot
    public static MyIngot brassIngot;
    public static MyIngot bronzeIngot;
    public static MyIngot copperIngot;
    public static MyIngot tinIngot;
    public static MyIngot zincIngot;
    
    //OreChunks
    public static MyChunk copperChunk;
    public static MyChunk tinChunk;
    public static MyChunk zincChunk;
    
    public static void init() {
        
        //Ingot
        brassIngot = new BrassIngot(9000);
        bronzeIngot = new BronzeIngot(9001);
        copperIngot = new CopperIngot(9002);
        tinIngot = new TinIngot(9003);
        zincIngot = new ZincIngot(9004);
        
        LanguageRegistry.addName(brassIngot, "Brass Ingot");
        LanguageRegistry.addName(bronzeIngot, "Bronze Ingot");
        LanguageRegistry.addName(copperIngot, "Copper Ingot");
        LanguageRegistry.addName(tinIngot, "Tin Ingot");
        LanguageRegistry.addName(zincIngot, "Zinc Ingot");
        
        //OreChunks
        copperChunk = new CopperChunk(9020);
        tinChunk = new TinChunk(9021);
        zincChunk = new ZincChunk(9022);
        
        LanguageRegistry.addName(copperChunk, "Copper Chunk");
        LanguageRegistry.addName(tinChunk, "Tin Chunk");
        LanguageRegistry.addName(zincChunk, "Zinc Chunk");
        
        GameRegistry.addSmelting(copperChunk.itemID, new ItemStack(copperIngot), 0.1f);
        GameRegistry.addSmelting(tinChunk.itemID, new ItemStack(tinIngot), 0.1f);
        GameRegistry.addSmelting(zincChunk.itemID, new ItemStack(zincIngot), 0.1f);
        
        
    }
}
