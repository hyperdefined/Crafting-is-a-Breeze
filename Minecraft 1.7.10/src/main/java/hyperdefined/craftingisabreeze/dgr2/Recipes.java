package hyperdefined.craftingisabreeze.dgr2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import cpw.mods.fml.common.registry.GameRegistry;
import hyperdefined.craftingisabreeze.Craftingisabreeze;
import hyperdefined.craftingisabreeze.config.ConfigHandler;
import net.minecraft.item.ItemStack;
import hyperdefined.dgr2.init.ItemRegistry;

public class Recipes {
	
	public static void dgr2AddRecipesSupport(){
		if (ConfigHandler.dgr2Recipes == true){
		Craftingisabreeze.LOGGER.info("Dark Gems Reborn 2 is detected. Adding recipes...");
		GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.dark_gem, 3), new ItemStack(ItemRegistry.dark_axe));
    	GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.dark_gem, 2), new ItemStack(ItemRegistry.dark_sword));
    	GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.dark_gem, 3), new ItemStack(ItemRegistry.dark_pickaxe));
    	GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.dark_gem, 1), new ItemStack(ItemRegistry.dark_spade));
    	GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.infused_gem, 3), new ItemStack(ItemRegistry.infused_axe));
    	GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.infused_gem, 2), new ItemStack(ItemRegistry.infused_sword));
    	GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.infused_gem, 3), new ItemStack(ItemRegistry.infused_pickaxe));
    	GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.infused_gem, 1), new ItemStack(ItemRegistry.infused_spade));
    	GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.green_gem, 3), new ItemStack(ItemRegistry.green_axe));
    	GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.green_gem, 2), new ItemStack(ItemRegistry.green_sword));
    	GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.green_gem, 3), new ItemStack(ItemRegistry.green_pickaxe));
    	GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.green_gem, 1), new ItemStack(ItemRegistry.green_spade));
    	GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.blue_gem, 3), new ItemStack(ItemRegistry.blue_axe));
    	GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.blue_gem, 2), new ItemStack(ItemRegistry.blue_sword));
    	GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.blue_gem, 3), new ItemStack(ItemRegistry.blue_pickaxe));
    	GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.blue_gem, 1), new ItemStack(ItemRegistry.blue_spade));
    	GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.magical_gem, 3), new ItemStack(ItemRegistry.magical_axe));
    	GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.magical_gem, 2), new ItemStack(ItemRegistry.magical_sword));
    	GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.magical_gem, 3), new ItemStack(ItemRegistry.magical_pickaxe));
    	GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.magical_gem, 1), new ItemStack(ItemRegistry.magical_spade));
    	GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.dark_gem, 5), new ItemStack(ItemRegistry.dark_helmet));
    	GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.dark_gem, 8), new ItemStack(ItemRegistry.dark_chestplate));
    	GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.dark_gem, 7), new ItemStack(ItemRegistry.dark_leggings));
    	GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.dark_gem, 4), new ItemStack(ItemRegistry.dark_boots));
    	GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.infused_gem, 5), new ItemStack(ItemRegistry.infused_helmet));
    	GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.infused_gem, 8), new ItemStack(ItemRegistry.infused_chestplate));
    	GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.infused_gem, 7), new ItemStack(ItemRegistry.infused_leggings));
    	GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.infused_gem, 4), new ItemStack(ItemRegistry.infused_boots));
    	GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.green_gem, 5), new ItemStack(ItemRegistry.green_helmet));
    	GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.green_gem, 8), new ItemStack(ItemRegistry.green_chestplate));
    	GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.green_gem, 7), new ItemStack(ItemRegistry.green_leggings));
    	GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.green_gem, 4), new ItemStack(ItemRegistry.green_boots));
    	GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.blue_gem, 5), new ItemStack(ItemRegistry.blue_helmet));
    	GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.blue_gem, 8), new ItemStack(ItemRegistry.blue_chestplate));
    	GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.blue_gem, 7), new ItemStack(ItemRegistry.blue_leggings));
    	GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.blue_gem, 4), new ItemStack(ItemRegistry.blue_boots));
    	GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.magical_gem, 5), new ItemStack(ItemRegistry.magical_helmet));
    	GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.magical_gem, 8), new ItemStack(ItemRegistry.magical_chestplate));
    	GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.magical_gem, 7), new ItemStack(ItemRegistry.magical_leggings));
    	GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.magical_gem, 4), new ItemStack(ItemRegistry.magical_boots));
		}
	}
}
