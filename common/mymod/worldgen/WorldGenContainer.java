package mymod.worldgen;

import cpw.mods.fml.common.registry.GameRegistry;
import mymod.worldgen.ore.CopperGen;
import mymod.worldgen.ore.TinGen;
import mymod.worldgen.ore.ZincGen;

public class WorldGenContainer {
    
    public static void init() {
        
        //Ore gen
        GameRegistry.registerWorldGenerator(new CopperGen());
        GameRegistry.registerWorldGenerator(new TinGen());
        GameRegistry.registerWorldGenerator(new ZincGen());
        
    }

}
