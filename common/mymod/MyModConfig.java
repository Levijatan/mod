package mymod;

import java.io.File;

import net.minecraftforge.common.Configuration;

public class MyModConfig {
    
    public static Configuration config;
    
    public static final String CATEGORY_BLOCKIDS = "Block Ids";
    public static final String CATEGORY_ITEMIDS = "Item Ids";
    
    public static void init(File configFile) {
        
        config = new Configuration(configFile);
        
        
        
    }

}
