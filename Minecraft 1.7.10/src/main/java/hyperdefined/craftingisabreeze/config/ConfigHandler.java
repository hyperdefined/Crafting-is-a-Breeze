package hyperdefined.craftingisabreeze.config;

import java.io.File;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import hyperdefined.craftingisabreeze.Reference;
import net.minecraftforge.common.config.Configuration;
 
public class ConfigHandler {
	
    public static Configuration config;
    
	public static boolean goldenArmor;
	public static boolean goldenTools;
	public static boolean diamondArmor;
	public static boolean diamondTools;
	public static boolean ironArmor;
	public static boolean ironTools;
	public static boolean stoneTools;
	public static boolean woodTools;
	public static boolean woolDye;
	public static boolean stairs;
	public static boolean glassDye;
	public static boolean glassDyePanes;
	public static boolean walls;
	public static boolean slabs;
	public static boolean shears;
	public static boolean beacon;
	public static boolean woodSlab;
	public static boolean leather;
	public static boolean fences;
	public static boolean startMsg;
	public static boolean dgr2Recipes;
	public static boolean boat;
	public static boolean woodDoor;
	public static boolean ironDoor;
	
	public static final String CIAB_CONFIG_PATH = "/craftingisabreeze/config.cfg";
 
    public static void init(FMLPreInitializationEvent e) {	
    	config = new Configuration(new File(e.getModConfigurationDirectory() + CIAB_CONFIG_PATH));
    	loadConfiguration();
    	FMLCommonHandler.instance().bus().register(new ConfigHandler());
    }

    public static void loadConfiguration() {
    	goldenArmor = ConfigHandler.config.getBoolean("GoldenArmor", Configuration.CATEGORY_GENERAL, true, "Disable or enable Golden armor."); 
    	goldenTools = ConfigHandler.config.getBoolean("GoldenTools", Configuration.CATEGORY_GENERAL, true, "Disable or enable Golden tools."); 
    	diamondArmor = ConfigHandler.config.getBoolean("DiamondArmor", Configuration.CATEGORY_GENERAL, true, "Disable or enable Diamond armor."); 
    	diamondTools = ConfigHandler.config.getBoolean("DiamondTools", Configuration.CATEGORY_GENERAL, true, "Disable or enable Diamond tools."); 
    	ironArmor = ConfigHandler.config.getBoolean("IronArmor", Configuration.CATEGORY_GENERAL, true, "Disable or enable Iron armor."); 
    	ironTools = ConfigHandler.config.getBoolean("IronTools", Configuration.CATEGORY_GENERAL, true, "Disable or enable Iron tools."); 
    	stoneTools = ConfigHandler.config.getBoolean("StoneTools", Configuration.CATEGORY_GENERAL, true, "Disable or enable Stone tools."); 
    	woodTools = ConfigHandler.config.getBoolean("WoodTools", Configuration.CATEGORY_GENERAL, true, "Disable or enable Wood tools."); 
    	woolDye = ConfigHandler.config.getBoolean("WoolDye", Configuration.CATEGORY_GENERAL, true, "Disable or enable Dyes for Wool."); 
    	stairs = ConfigHandler.config.getBoolean("Stairs", Configuration.CATEGORY_GENERAL, true, "Disable or enable stairs."); 
    	glassDye = ConfigHandler.config.getBoolean("GlassDye", Configuration.CATEGORY_GENERAL, true, "Disable or enable dyes for Glass. Includes regular glass.."); 
    	glassDyePanes = ConfigHandler.config.getBoolean("GlassDyePanes", Configuration.CATEGORY_GENERAL, true, "Disable or enable dyes for Glass Panes. Includes regular Glass Pane."); 
    	walls = ConfigHandler.config.getBoolean("Walls", Configuration.CATEGORY_GENERAL, true, "Disable or enable Cobblestone/Mossy walls."); 
    	slabs = ConfigHandler.config.getBoolean("Slabs", Configuration.CATEGORY_GENERAL, true, "Disable or enable Slabs."); 
    	shears = ConfigHandler.config.getBoolean("Shears", Configuration.CATEGORY_GENERAL, true, "Disable or enable Shears."); 
    	beacon = ConfigHandler.config.getBoolean("Beacon", Configuration.CATEGORY_GENERAL, true, "Disable or enable Beacon."); 
    	woodSlab = ConfigHandler.config.getBoolean("WoodSlabs", Configuration.CATEGORY_GENERAL, true, "Disable or enable Wood slabs."); 
    	leather = ConfigHandler.config.getBoolean("LeatherArmor", Configuration.CATEGORY_GENERAL, true, "Disable or enable Leather Armor."); 
    	fences = ConfigHandler.config.getBoolean("Fences", Configuration.CATEGORY_GENERAL, true, "Disable or enable Fences."); 
    	startMsg = ConfigHandler.config.getBoolean("StartMessage", Configuration.CATEGORY_GENERAL, true, "Disable or enable the welcome message."); 	
    	dgr2Recipes = ConfigHandler.config.getBoolean("DarkGemsReborn2Recipes", Configuration.CATEGORY_GENERAL, true, "Disable or enable Dark Gems Reborn 2 recipes."); 	
    	boat = ConfigHandler.config.getBoolean("Boat", Configuration.CATEGORY_GENERAL, true, "Disable or enable boats."); 	
    	woodDoor = ConfigHandler.config.getBoolean("WoodDoor", Configuration.CATEGORY_GENERAL, true, "Disable or enable wood door."); 	
    	ironDoor = ConfigHandler.config.getBoolean("IronDoor", Configuration.CATEGORY_GENERAL, true, "Disable or enable iron door."); 	
    	if(config.hasChanged()){ config.save(); }
    }
    
    @SubscribeEvent
    public void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent event){
    	if(event.modID.equals(Reference.MODID))
    	{
    		loadConfiguration();
    	}
    }
}