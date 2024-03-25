package hyperdefined.craftingisabreeze;

import hyperdefined.craftingisabreeze.config.ConfigHandler;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class Init {
	static Message events = new Message();
	public static void AddRecipes(){
		
			if (ConfigHandler.boat){
				GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 5), new ItemStack(Items.boat, 1));
			}
			
			if (ConfigHandler.woodDoor){
				GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 6, 0), new ItemStack(Items.oak_door, 1));
				GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 6, 1), new ItemStack(Items.spruce_door, 1));
				GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 6, 2), new ItemStack(Items.birch_door, 1));
				GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 6, 3), new ItemStack(Items.jungle_door, 1));
				GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 6, 4), new ItemStack(Items.acacia_door, 1));
				GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 6, 5), new ItemStack(Items.dark_oak_door, 1));
			}
			
			if (ConfigHandler.ironDoor){
				GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_ingot, 6), new ItemStack(Items.iron_door, 1));
			}
		
			if (ConfigHandler.fences) {
				GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 4, 0), new ItemStack(Blocks.oak_fence));
				GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 4, 1), new ItemStack(Blocks.spruce_fence));
				GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 4, 2), new ItemStack(Blocks.birch_fence));
				GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 4, 3), new ItemStack(Blocks.jungle_fence));
				GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 4, 5), new ItemStack(Blocks.dark_oak_fence));
				GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 4, 4), new ItemStack(Blocks.acacia_fence));
				GameRegistry.addShapelessRecipe(new ItemStack(Blocks.nether_brick, 4), new ItemStack(Blocks.nether_brick_fence));
			}

			if (ConfigHandler.leather) {
				GameRegistry.addShapelessRecipe(new ItemStack(Items.leather, 5), new ItemStack(Items.leather_helmet, 1, OreDictionary.WILDCARD_VALUE));
				GameRegistry.addShapelessRecipe(new ItemStack(Items.leather, 8), new ItemStack(Items.leather_chestplate, 1, OreDictionary.WILDCARD_VALUE));
				GameRegistry.addShapelessRecipe(new ItemStack(Items.leather, 7), new ItemStack(Items.leather_leggings, 1, OreDictionary.WILDCARD_VALUE));
				GameRegistry.addShapelessRecipe(new ItemStack(Items.leather, 4), new ItemStack(Items.leather_boots, 1, OreDictionary.WILDCARD_VALUE));
			}
			if (ConfigHandler.ironArmor) {
				GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_ingot, 5), new ItemStack(Items.iron_helmet, 1, OreDictionary.WILDCARD_VALUE));
				GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_ingot, 8), new ItemStack(Items.iron_chestplate, 1, OreDictionary.WILDCARD_VALUE));
				GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_ingot, 7), new ItemStack(Items.iron_leggings, 1, OreDictionary.WILDCARD_VALUE));
				GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_ingot, 4), new ItemStack(Items.iron_boots, 1, OreDictionary.WILDCARD_VALUE));

			}
			if (ConfigHandler.ironTools) {
				GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_ingot, 1), new ItemStack(Items.iron_shovel, 1, OreDictionary.WILDCARD_VALUE));
				GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_ingot, 2), new ItemStack(Items.iron_sword, 1, OreDictionary.WILDCARD_VALUE));
				GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_ingot, 3), new ItemStack(Items.iron_pickaxe, 1, OreDictionary.WILDCARD_VALUE));
				GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_ingot, 3), new ItemStack(Items.iron_axe, 1, OreDictionary.WILDCARD_VALUE));
				GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_ingot, 2), new ItemStack(Items.iron_hoe, 1, OreDictionary.WILDCARD_VALUE));
			}

			if (ConfigHandler.stoneTools) {
				GameRegistry.addShapelessRecipe(new ItemStack(Blocks.cobblestone, 3), new ItemStack(Items.stone_pickaxe, 1, OreDictionary.WILDCARD_VALUE));
				GameRegistry.addShapelessRecipe(new ItemStack(Blocks.cobblestone, 1), new ItemStack(Items.stone_shovel, 1, OreDictionary.WILDCARD_VALUE));
				GameRegistry.addShapelessRecipe(new ItemStack(Blocks.cobblestone, 2), new ItemStack(Items.stone_sword, 1, OreDictionary.WILDCARD_VALUE));
				GameRegistry.addShapelessRecipe(new ItemStack(Blocks.cobblestone, 3), new ItemStack(Items.stone_axe, 1, OreDictionary.WILDCARD_VALUE));
				GameRegistry.addShapelessRecipe(new ItemStack(Blocks.cobblestone, 2), new ItemStack(Items.stone_hoe, 1, OreDictionary.WILDCARD_VALUE));
			}
			if (ConfigHandler.woodTools) {
				GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 2, 0), new ItemStack(Items.wooden_sword, 1, OreDictionary.WILDCARD_VALUE));
				GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 2, 0), new ItemStack(Items.wooden_hoe, 1, OreDictionary.WILDCARD_VALUE));
				GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 3, 0), new ItemStack(Items.wooden_pickaxe, 1, OreDictionary.WILDCARD_VALUE));
				GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 3, 0), new ItemStack(Items.wooden_axe, 1, OreDictionary.WILDCARD_VALUE));
				GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 1, 0), new ItemStack(Items.wooden_shovel, 1, OreDictionary.WILDCARD_VALUE));
			}
			if (ConfigHandler.goldenArmor) {
				GameRegistry.addShapelessRecipe(new ItemStack(Items.gold_ingot, 5), new ItemStack(Items.golden_helmet, 1, OreDictionary.WILDCARD_VALUE));
				GameRegistry.addShapelessRecipe(new ItemStack(Items.gold_ingot, 8), new ItemStack(Items.golden_chestplate, 1, OreDictionary.WILDCARD_VALUE));
				GameRegistry.addShapelessRecipe(new ItemStack(Items.gold_ingot, 5), new ItemStack(Items.golden_leggings, 1, OreDictionary.WILDCARD_VALUE));
				GameRegistry.addShapelessRecipe(new ItemStack(Items.gold_ingot, 4), new ItemStack(Items.golden_boots, 1, OreDictionary.WILDCARD_VALUE));
			}
			if (ConfigHandler.goldenTools) {
				GameRegistry.addShapelessRecipe(new ItemStack(Items.gold_ingot, 1), new ItemStack(Items.golden_shovel, 1, OreDictionary.WILDCARD_VALUE));
				GameRegistry.addShapelessRecipe(new ItemStack(Items.gold_ingot, 3), new ItemStack(Items.golden_pickaxe, 1, OreDictionary.WILDCARD_VALUE));
				GameRegistry.addShapelessRecipe(new ItemStack(Items.gold_ingot, 3), new ItemStack(Items.golden_axe, 1, OreDictionary.WILDCARD_VALUE));
				GameRegistry.addShapelessRecipe(new ItemStack(Items.gold_ingot, 2), new ItemStack(Items.golden_sword, 1, OreDictionary.WILDCARD_VALUE));
				GameRegistry.addShapelessRecipe(new ItemStack(Items.gold_ingot, 2), new ItemStack(Items.golden_hoe, 1, OreDictionary.WILDCARD_VALUE));
			}

			if (ConfigHandler.diamondArmor) {
				GameRegistry.addShapelessRecipe(new ItemStack(Items.diamond, 5), new ItemStack(Items.diamond_helmet, 1, OreDictionary.WILDCARD_VALUE));
				GameRegistry.addShapelessRecipe(new ItemStack(Items.diamond, 8), new ItemStack(Items.diamond_chestplate, 1, OreDictionary.WILDCARD_VALUE));
				GameRegistry.addShapelessRecipe(new ItemStack(Items.diamond, 7), new ItemStack(Items.diamond_leggings, 1, OreDictionary.WILDCARD_VALUE));
				GameRegistry.addShapelessRecipe(new ItemStack(Items.diamond, 4), new ItemStack(Items.diamond_boots, 1, OreDictionary.WILDCARD_VALUE));
			}
			if (ConfigHandler.diamondTools) {
				GameRegistry.addShapelessRecipe(new ItemStack(Items.diamond, 1), new ItemStack(Items.diamond_shovel, 1, OreDictionary.WILDCARD_VALUE));
				GameRegistry.addShapelessRecipe(new ItemStack(Items.diamond, 3), new ItemStack(Items.diamond_axe, 1, OreDictionary.WILDCARD_VALUE));
				GameRegistry.addShapelessRecipe(new ItemStack(Items.diamond, 3), new ItemStack(Items.diamond_pickaxe, 1, OreDictionary.WILDCARD_VALUE));
				GameRegistry.addShapelessRecipe(new ItemStack(Items.diamond, 2), new ItemStack(Items.diamond_sword, 1, OreDictionary.WILDCARD_VALUE));
				GameRegistry.addShapelessRecipe(new ItemStack(Items.diamond, 2), new ItemStack(Items.diamond_hoe, 1, OreDictionary.WILDCARD_VALUE));
			}
			if (ConfigHandler.woolDye) {
				GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 1, 14), new ItemStack(Blocks.wool, 1, 1));
				GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 1, 13), new ItemStack(Blocks.wool, 1, 2));
				GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 1, 12), new ItemStack(Blocks.wool, 1, 3));
				GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 1, 11), new ItemStack(Blocks.wool, 1, 4));
				GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 1, 10), new ItemStack(Blocks.wool, 1, 5));
				GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 1, 9), new ItemStack(Blocks.wool, 1, 6));
				GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 1, 8), new ItemStack(Blocks.wool, 1, 7));
				GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 1, 7), new ItemStack(Blocks.wool, 1, 8));
				GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 1, 6), new ItemStack(Blocks.wool, 1, 9));
				GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 1, 5), new ItemStack(Blocks.wool, 1, 10));
				GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 1, 4), new ItemStack(Blocks.wool, 1, 11));
				GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 1, 3), new ItemStack(Blocks.wool, 1, 12));
				GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 1, 2), new ItemStack(Blocks.wool, 1, 13));
				GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 1, 1), new ItemStack(Blocks.wool, 1, 14));
				GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 1, 0), new ItemStack(Blocks.wool, 1, 15));
				GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 1, 14), new ItemStack(Blocks.wool, 1, 1));
			}

			if (ConfigHandler.glassDye) {
				GameRegistry.addShapedRecipe(new ItemStack(Items.dye, 1, 15), "XXX", "X X", "XXX", 'X', new ItemStack(Blocks.stained_glass, 1, 0));
				GameRegistry.addShapedRecipe(new ItemStack(Items.dye, 1, 14), "XXX", "X X", "XXX", 'X', new ItemStack(Blocks.stained_glass, 1, 1));
				GameRegistry.addShapedRecipe(new ItemStack(Items.dye, 1, 13), "XXX", "X X", "XXX", 'X', new ItemStack(Blocks.stained_glass, 1, 2));
				GameRegistry.addShapedRecipe(new ItemStack(Items.dye, 1, 12), "XXX", "X X", "XXX", 'X', new ItemStack(Blocks.stained_glass, 1, 3));
				GameRegistry.addShapedRecipe(new ItemStack(Items.dye, 1, 11), "XXX", "X X", "XXX", 'X', new ItemStack(Blocks.stained_glass, 1, 4));
				GameRegistry.addShapedRecipe(new ItemStack(Items.dye, 1, 10), "XXX", "X X", "XXX", 'X', new ItemStack(Blocks.stained_glass, 1, 5));
				GameRegistry.addShapedRecipe(new ItemStack(Items.dye, 1, 9), "XXX", "X X", "XXX", 'X', new ItemStack(Blocks.stained_glass, 1, 6));
				GameRegistry.addShapedRecipe(new ItemStack(Items.dye, 1, 8), "XXX", "X X", "XXX", 'X', new ItemStack(Blocks.stained_glass, 1, 7));
				GameRegistry.addShapedRecipe(new ItemStack(Items.dye, 1, 7), "XXX", "X X", "XXX", 'X', new ItemStack(Blocks.stained_glass, 1, 8));
				GameRegistry.addShapedRecipe(new ItemStack(Items.dye, 1, 6), "XXX", "X X", "XXX", 'X', new ItemStack(Blocks.stained_glass, 1, 9));
				GameRegistry.addShapedRecipe(new ItemStack(Items.dye, 1, 5), "XXX", "X X", "XXX", 'X', new ItemStack(Blocks.stained_glass, 1, 10));
				GameRegistry.addShapedRecipe(new ItemStack(Items.dye, 1, 4), "XXX", "X X", "XXX", 'X', new ItemStack(Blocks.stained_glass, 1, 11));
				GameRegistry.addShapedRecipe(new ItemStack(Items.dye, 1, 3), "XXX", "X X", "XXX", 'X', new ItemStack(Blocks.stained_glass, 1, 12));
				GameRegistry.addShapedRecipe(new ItemStack(Items.dye, 1, 2), "XXX", "X X", "XXX", 'X', new ItemStack(Blocks.stained_glass, 1, 13));
				GameRegistry.addShapedRecipe(new ItemStack(Items.dye, 1, 1), "XXX", "X X", "XXX", 'X', new ItemStack(Blocks.stained_glass, 1, 14));
				GameRegistry.addShapedRecipe(new ItemStack(Items.dye, 1, 0), "XXX", "X X", "XXX", 'X', new ItemStack(Blocks.stained_glass, 1, 15));
			}
			if (ConfigHandler.glassDyePanes) {
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.stained_glass, 6, 0), "XXX", "X X", "XXX", 'X', new ItemStack(Blocks.stained_glass_pane, 1, 0));
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.stained_glass, 6, 1), "XXX", "X X", "XXX", 'X', new ItemStack(Blocks.stained_glass_pane, 1, 1));
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.stained_glass, 6, 2), "XXX", "X X", "XXX", 'X', new ItemStack(Blocks.stained_glass_pane, 1, 2));
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.stained_glass, 6, 3), "XXX", "X X", "XXX", 'X', new ItemStack(Blocks.stained_glass_pane, 1, 3));
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.stained_glass, 6, 4), "XXX", "X X", "XXX", 'X', new ItemStack(Blocks.stained_glass_pane, 1, 4));
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.stained_glass, 6, 5), "XXX", "X X", "XXX", 'X', new ItemStack(Blocks.stained_glass_pane, 1, 5));
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.stained_glass, 6, 6), "XXX", "X X", "XXX", 'X', new ItemStack(Blocks.stained_glass_pane, 1, 6));
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.stained_glass, 6, 7), "XXX", "X X", "XXX", 'X', new ItemStack(Blocks.stained_glass_pane, 1, 7));
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.stained_glass, 6, 8), "XXX", "X X", "XXX", 'X', new ItemStack(Blocks.stained_glass_pane, 1, 8));
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.stained_glass, 6, 9), "XXX", "X X", "XXX", 'X', new ItemStack(Blocks.stained_glass_pane, 1, 9));
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.stained_glass, 6, 10), "XXX", "X X", "XXX", 'X', new ItemStack(Blocks.stained_glass_pane, 1, 10));
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.stained_glass, 6, 11), "XXX", "X X", "XXX", 'X', new ItemStack(Blocks.stained_glass_pane, 1, 11));
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.stained_glass, 6, 12), "XXX", "X X", "XXX", 'X', new ItemStack(Blocks.stained_glass_pane, 1, 12));
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.stained_glass, 6, 13), "XXX", "X X", "XXX", 'X', new ItemStack(Blocks.stained_glass_pane, 1, 13));
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.stained_glass, 6, 14), "XXX", "X X", "XXX", 'X', new ItemStack(Blocks.stained_glass_pane, 1, 14));
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.stained_glass, 6, 15), "XXX", "X X", "XXX", 'X', new ItemStack(Blocks.stained_glass_pane, 1, 15));
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.glass, 6), "XXX", "X X", "XXX", 'X', new ItemStack(Blocks.glass_pane));
			}
			if (ConfigHandler.slabs) {
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.stone, 3), "   ", "XXX", "XXX", 'X', new ItemStack(Blocks.stone_slab, 1, 0));
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.sandstone, 3), "   ", "XXX", "XXX", 'X', new ItemStack(Blocks.stone_slab, 1, 1));
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.cobblestone, 3), "   ", "XXX", "XXX", 'X', new ItemStack(Blocks.stone_slab, 1, 3));
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.brick_block, 3), "   ", "XXX", "XXX", 'X', new ItemStack(Blocks.stone_slab, 1, 4));
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.stonebrick, 3), "   ", "XXX", "XXX", 'X', new ItemStack(Blocks.stone_slab, 1, 5));
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.nether_brick, 3), "   ", "XXX", "XXX", 'X', new ItemStack(Blocks.stone_slab, 1, 6));
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.quartz_block, 3), "   ", "XXX", "XXX", 'X', new ItemStack(Blocks.stone_slab, 1, 7));
			}
			if (ConfigHandler.walls) {
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.mossy_cobblestone, 6), "   ", "XXX", "XXX", 'X', new ItemStack(Blocks.cobblestone_wall, 1, 1));
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.cobblestone, 6), "   ", "XXX", "XXX", 'X', new ItemStack(Blocks.cobblestone_wall, 1, 0));
			}
			if (ConfigHandler.stairs) {
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.cobblestone, 6), "   ", "XXX", "XXX", 'X', new ItemStack(Blocks.stone_stairs, 1));
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.planks, 6, 0), "   ", "XXX", "XXX", 'X', new ItemStack(Blocks.oak_stairs, 1));
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.brick_block, 6), "   ", "XXX", "XXX", 'X', new ItemStack(Blocks.brick_stairs, 1));
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.stonebrick, 6), "   ", "XXX", "XXX", 'X', new ItemStack(Blocks.stone_brick_stairs, 1));
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.nether_brick, 6), "   ", "XXX", "XXX", 'X', new ItemStack(Blocks.nether_brick_stairs, 1));
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.sandstone, 6), "   ", "XXX", "XXX", 'X', new ItemStack(Blocks.sandstone_stairs, 1));
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.planks, 6, 1), "   ", "XXX", "XXX", 'X', new ItemStack(Blocks.spruce_stairs, 1));
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.planks, 6, 2), "   ", "XXX", "XXX", 'X', new ItemStack(Blocks.birch_stairs, 1));
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.planks, 6, 3), "   ", "XXX", "XXX", 'X', new ItemStack(Blocks.jungle_stairs, 1));
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.quartz_block, 6), "   ", "XXX", "XXX", 'X', new ItemStack(Blocks.quartz_stairs, 1));
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.planks, 6, 4), "   ", "XXX", "XXX", 'X', new ItemStack(Blocks.acacia_stairs, 1));
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.planks, 6, 5), "   ", "XXX", "XXX", 'X', new ItemStack(Blocks.dark_oak_stairs, 1));
			}
			if (ConfigHandler.shears) {
				GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_ingot, 2), new ItemStack(Items.shears, 1, OreDictionary.WILDCARD_VALUE));
			}
			if (ConfigHandler.beacon) {
				GameRegistry.addShapelessRecipe(new ItemStack(Items.nether_star, 1), Blocks.beacon);
			}
			if (ConfigHandler.woodSlab) {
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.planks, 3, 0), "   ", "XXX", "XXX", 'X', new ItemStack(Blocks.wooden_slab, 1, 0));
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.planks, 3, 1), "   ", "XXX", "XXX", 'X', new ItemStack(Blocks.wooden_slab, 1, 1));
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.planks, 3, 2), "   ", "XXX", "XXX", 'X', new ItemStack(Blocks.wooden_slab, 1, 2));
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.planks, 3, 3), "   ", "XXX", "XXX", 'X', new ItemStack(Blocks.wooden_slab, 1, 3));
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.planks, 3, 4), "   ", "XXX", "XXX", 'X', new ItemStack(Blocks.wooden_slab, 1, 4));
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.planks, 3, 5), "   ", "XXX", "XXX", 'X', new ItemStack(Blocks.wooden_slab, 1, 5));
			}
			if (ConfigHandler.startMsg) {
				FMLCommonHandler.instance().bus().register(events);
			}	
	}
}
