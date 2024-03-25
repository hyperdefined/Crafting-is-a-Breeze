package hyperdefined.craftingisabreeze;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import hyperdefined.craftingisabreeze.config.ConfigHandler;
import hyperdefined.craftingisabreeze.dgr2.Recipes;
import hyperdefined.craftingisabreeze.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.Optional;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.MODNAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS, updateJSON = Reference.UPDATE_URL, acceptedMinecraftVersions = Reference.MC_VERSION)

public class Craftingisabreeze{	
	@SidedProxy(clientSide= Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@Instance(Reference.MODID)
	public static Craftingisabreeze Instance;
	  
	public static final Logger LOGGER = LogManager.getLogger("CraftingisaBreeze");
	
	@EventHandler
	public void preint(FMLPreInitializationEvent e) {
		proxy.preInit(e);
		ConfigHandler.init(e);
	}
	@EventHandler
	public void init(FMLInitializationEvent e) {
		proxy.init(e);
	}
	@EventHandler
	public void postinit(FMLPostInitializationEvent e){
		proxy.postInit(e);
	}
    @Optional.Method(modid = "dgr2")
    @EventHandler
    public void dgr2Recipes(FMLInitializationEvent e){
    	Recipes.dgr2AddRecipesSupport();
    	LOGGER.info("Dark Gems Reborn 2 is detected, adding recipes...");
    }
}