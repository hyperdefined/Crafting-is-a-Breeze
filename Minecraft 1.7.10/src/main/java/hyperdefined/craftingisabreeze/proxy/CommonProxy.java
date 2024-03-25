package hyperdefined.craftingisabreeze.proxy;
import java.io.File;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import hyperdefined.craftingisabreeze.Init;
import hyperdefined.craftingisabreeze.Message;
import hyperdefined.craftingisabreeze.config.ConfigHandler;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.oredict.OreDictionary;

public class CommonProxy {
    
	public void preInit(FMLPreInitializationEvent e) {
	
    }
    public void init(FMLInitializationEvent e) {
    	Init.AddRecipes();
    }
    public void postInit(FMLPostInitializationEvent e) {
    	
    }
}