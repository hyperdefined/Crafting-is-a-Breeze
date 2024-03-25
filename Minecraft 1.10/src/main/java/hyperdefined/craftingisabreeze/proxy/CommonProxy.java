package hyperdefined.craftingisabreeze.proxy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import hyperdefined.craftingisabreeze.Init;
import hyperdefined.craftingisabreeze.config.ConfigHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
    
	public void preInit(FMLPreInitializationEvent e) {
	
    }
    public void init(FMLInitializationEvent e) {
    	Init.AddRecipes();
    }
    public void postInit(FMLPostInitializationEvent e) {
    	new ClientProxy.updater();
    }
}