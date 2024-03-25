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
				GameRegistry.addShapelessRecipe(new ItemStack(Blocks.PLANKS, 5), new ItemStack(Items.BOAT, 1));
			}
			
			if (ConfigHandler.woodDoor){
				GameRegistry.addShapelessRecipe(new ItemStack(Blocks.PLANKS, 6, 0), new ItemStack(Items.OAK_DOOR, 1));
				GameRegistry.addShapelessRecipe(new ItemStack(Blocks.PLANKS, 6, 1), new ItemStack(Items.SPRUCE_DOOR, 1));
				GameRegistry.addShapelessRecipe(new ItemStack(Blocks.PLANKS, 6, 2), new ItemStack(Items.BIRCH_DOOR, 1));
				GameRegistry.addShapelessRecipe(new ItemStack(Blocks.PLANKS, 6, 3), new ItemStack(Items.JUNGLE_DOOR, 1));
				GameRegistry.addShapelessRecipe(new ItemStack(Blocks.PLANKS, 6, 4), new ItemStack(Items.ACACIA_DOOR, 1));
				GameRegistry.addShapelessRecipe(new ItemStack(Blocks.PLANKS, 6, 5), new ItemStack(Items.DARK_OAK_DOOR, 1));
			}
			
			if (ConfigHandler.ironDoor){
				GameRegistry.addShapelessRecipe(new ItemStack(Items.IRON_INGOT, 6), new ItemStack(Items.IRON_DOOR, 1));
			}
		
			if (ConfigHandler.fences) {
				GameRegistry.addShapelessRecipe(new ItemStack(Blocks.PLANKS, 4, 0), new ItemStack(Blocks.OAK_FENCE));
				GameRegistry.addShapelessRecipe(new ItemStack(Blocks.PLANKS, 4, 1), new ItemStack(Blocks.SPRUCE_FENCE));
				GameRegistry.addShapelessRecipe(new ItemStack(Blocks.PLANKS, 4, 2), new ItemStack(Blocks.BIRCH_FENCE));
				GameRegistry.addShapelessRecipe(new ItemStack(Blocks.PLANKS, 4, 3), new ItemStack(Blocks.JUNGLE_FENCE));
				GameRegistry.addShapelessRecipe(new ItemStack(Blocks.PLANKS, 4, 5), new ItemStack(Blocks.DARK_OAK_FENCE));
				GameRegistry.addShapelessRecipe(new ItemStack(Blocks.PLANKS, 4, 4), new ItemStack(Blocks.ACACIA_FENCE));
				GameRegistry.addShapelessRecipe(new ItemStack(Blocks.NETHER_BRICK, 4), new ItemStack(Blocks.NETHER_BRICK_FENCE));
			}

			if (ConfigHandler.leather) {
				GameRegistry.addShapelessRecipe(new ItemStack(Items.LEATHER, 5), new ItemStack(Items.LEATHER_HELMET, 1, OreDictionary.WILDCARD_VALUE));
				GameRegistry.addShapelessRecipe(new ItemStack(Items.LEATHER, 8), new ItemStack(Items.LEATHER_CHESTPLATE, 1, OreDictionary.WILDCARD_VALUE));
				GameRegistry.addShapelessRecipe(new ItemStack(Items.LEATHER, 7), new ItemStack(Items.LEATHER_LEGGINGS, 1, OreDictionary.WILDCARD_VALUE));
				GameRegistry.addShapelessRecipe(new ItemStack(Items.LEATHER, 4), new ItemStack(Items.LEATHER_BOOTS, 1, OreDictionary.WILDCARD_VALUE));
			}
			if (ConfigHandler.ironArmor) {
				GameRegistry.addShapelessRecipe(new ItemStack(Items.IRON_INGOT, 5), new ItemStack(Items.IRON_HELMET, 1, OreDictionary.WILDCARD_VALUE));
				GameRegistry.addShapelessRecipe(new ItemStack(Items.IRON_INGOT, 8), new ItemStack(Items.IRON_CHESTPLATE, 1, OreDictionary.WILDCARD_VALUE));
				GameRegistry.addShapelessRecipe(new ItemStack(Items.IRON_INGOT, 7), new ItemStack(Items.IRON_LEGGINGS, 1, OreDictionary.WILDCARD_VALUE));
				GameRegistry.addShapelessRecipe(new ItemStack(Items.IRON_INGOT, 4), new ItemStack(Items.IRON_BOOTS, 1, OreDictionary.WILDCARD_VALUE));

			}
			if (ConfigHandler.ironTools) {
				GameRegistry.addShapelessRecipe(new ItemStack(Items.IRON_INGOT, 1), new ItemStack(Items.IRON_SHOVEL, 1, OreDictionary.WILDCARD_VALUE));
				GameRegistry.addShapelessRecipe(new ItemStack(Items.IRON_INGOT, 2), new ItemStack(Items.IRON_SWORD, 1, OreDictionary.WILDCARD_VALUE));
				GameRegistry.addShapelessRecipe(new ItemStack(Items.IRON_INGOT, 3), new ItemStack(Items.IRON_PICKAXE, 1, OreDictionary.WILDCARD_VALUE));
				GameRegistry.addShapelessRecipe(new ItemStack(Items.IRON_INGOT, 3), new ItemStack(Items.IRON_AXE, 1, OreDictionary.WILDCARD_VALUE));
				GameRegistry.addShapelessRecipe(new ItemStack(Items.IRON_INGOT, 2), new ItemStack(Items.IRON_HOE, 1, OreDictionary.WILDCARD_VALUE));
			}

			if (ConfigHandler.stoneTools) {
				GameRegistry.addShapelessRecipe(new ItemStack(Blocks.COBBLESTONE, 3), new ItemStack(Items.STONE_PICKAXE, 1, OreDictionary.WILDCARD_VALUE));
				GameRegistry.addShapelessRecipe(new ItemStack(Blocks.COBBLESTONE, 1), new ItemStack(Items.STONE_SHOVEL, 1, OreDictionary.WILDCARD_VALUE));
				GameRegistry.addShapelessRecipe(new ItemStack(Blocks.COBBLESTONE, 2), new ItemStack(Items.STONE_SWORD, 1, OreDictionary.WILDCARD_VALUE));
				GameRegistry.addShapelessRecipe(new ItemStack(Blocks.COBBLESTONE, 3), new ItemStack(Items.STONE_AXE, 1, OreDictionary.WILDCARD_VALUE));
				GameRegistry.addShapelessRecipe(new ItemStack(Blocks.COBBLESTONE, 2), new ItemStack(Items.STONE_HOE, 1, OreDictionary.WILDCARD_VALUE));
			}
			if (ConfigHandler.woodTools) {
				GameRegistry.addShapelessRecipe(new ItemStack(Blocks.PLANKS, 2, 0), new ItemStack(Items.WOODEN_SWORD, 1, OreDictionary.WILDCARD_VALUE));
				GameRegistry.addShapelessRecipe(new ItemStack(Blocks.PLANKS, 2, 0), new ItemStack(Items.WOODEN_HOE, 1, OreDictionary.WILDCARD_VALUE));
				GameRegistry.addShapelessRecipe(new ItemStack(Blocks.PLANKS, 3, 0), new ItemStack(Items.WOODEN_PICKAXE, 1, OreDictionary.WILDCARD_VALUE));
				GameRegistry.addShapelessRecipe(new ItemStack(Blocks.PLANKS, 3, 0), new ItemStack(Items.WOODEN_AXE, 1, OreDictionary.WILDCARD_VALUE));
			}
			if (ConfigHandler.goldenArmor) {
				GameRegistry.addShapelessRecipe(new ItemStack(Items.GOLD_INGOT, 5), new ItemStack(Items.GOLDEN_HELMET, 1, OreDictionary.WILDCARD_VALUE));
				GameRegistry.addShapelessRecipe(new ItemStack(Items.GOLD_INGOT, 8), new ItemStack(Items.GOLDEN_CHESTPLATE, 1, OreDictionary.WILDCARD_VALUE));
				GameRegistry.addShapelessRecipe(new ItemStack(Items.GOLD_INGOT, 5), new ItemStack(Items.GOLDEN_LEGGINGS, 1, OreDictionary.WILDCARD_VALUE));
				GameRegistry.addShapelessRecipe(new ItemStack(Items.GOLD_INGOT, 4), new ItemStack(Items.GOLDEN_BOOTS, 1, OreDictionary.WILDCARD_VALUE));
			}
			if (ConfigHandler.goldenTools) {
				GameRegistry.addShapelessRecipe(new ItemStack(Items.GOLD_INGOT, 1), new ItemStack(Items.GOLDEN_SHOVEL, 1, OreDictionary.WILDCARD_VALUE));
				GameRegistry.addShapelessRecipe(new ItemStack(Items.GOLD_INGOT, 3), new ItemStack(Items.GOLDEN_PICKAXE, 1, OreDictionary.WILDCARD_VALUE));
				GameRegistry.addShapelessRecipe(new ItemStack(Items.GOLD_INGOT, 3), new ItemStack(Items.GOLDEN_AXE, 1, OreDictionary.WILDCARD_VALUE));
				GameRegistry.addShapelessRecipe(new ItemStack(Items.GOLD_INGOT, 2), new ItemStack(Items.GOLDEN_SWORD, 1, OreDictionary.WILDCARD_VALUE));
				GameRegistry.addShapelessRecipe(new ItemStack(Items.GOLD_INGOT, 2), new ItemStack(Items.GOLDEN_HOE, 1, OreDictionary.WILDCARD_VALUE));
			}

			if (ConfigHandler.diamondArmor) {
				GameRegistry.addShapelessRecipe(new ItemStack(Items.DIAMOND, 5), new ItemStack(Items.DIAMOND_HELMET, 1, OreDictionary.WILDCARD_VALUE));
				GameRegistry.addShapelessRecipe(new ItemStack(Items.DIAMOND, 8), new ItemStack(Items.DIAMOND_CHESTPLATE, 1, OreDictionary.WILDCARD_VALUE));
				GameRegistry.addShapelessRecipe(new ItemStack(Items.DIAMOND, 7), new ItemStack(Items.DIAMOND_LEGGINGS, 1, OreDictionary.WILDCARD_VALUE));
				GameRegistry.addShapelessRecipe(new ItemStack(Items.DIAMOND, 4), new ItemStack(Items.DIAMOND_BOOTS, 1, OreDictionary.WILDCARD_VALUE));
			}
			if (ConfigHandler.diamondTools) {
				GameRegistry.addShapelessRecipe(new ItemStack(Items.DIAMOND, 1), new ItemStack(Items.DIAMOND_SHOVEL, 1, OreDictionary.WILDCARD_VALUE));
				GameRegistry.addShapelessRecipe(new ItemStack(Items.DIAMOND, 3), new ItemStack(Items.DIAMOND_AXE, 1, OreDictionary.WILDCARD_VALUE));
				GameRegistry.addShapelessRecipe(new ItemStack(Items.DIAMOND, 3), new ItemStack(Items.DIAMOND_PICKAXE, 1, OreDictionary.WILDCARD_VALUE));
				GameRegistry.addShapelessRecipe(new ItemStack(Items.DIAMOND, 2), new ItemStack(Items.DIAMOND_SWORD, 1, OreDictionary.WILDCARD_VALUE));
				GameRegistry.addShapelessRecipe(new ItemStack(Items.DIAMOND, 2), new ItemStack(Items.DIAMOND_HOE, 1, OreDictionary.WILDCARD_VALUE));
			}
			if (ConfigHandler.woolDye) {
				GameRegistry.addShapelessRecipe(new ItemStack(Items.DYE, 1, 14), new ItemStack(Blocks.WOOL, 1, 1));
				GameRegistry.addShapelessRecipe(new ItemStack(Items.DYE, 1, 13), new ItemStack(Blocks.WOOL, 1, 2));
				GameRegistry.addShapelessRecipe(new ItemStack(Items.DYE, 1, 12), new ItemStack(Blocks.WOOL, 1, 3));
				GameRegistry.addShapelessRecipe(new ItemStack(Items.DYE, 1, 11), new ItemStack(Blocks.WOOL, 1, 4));
				GameRegistry.addShapelessRecipe(new ItemStack(Items.DYE, 1, 10), new ItemStack(Blocks.WOOL, 1, 5));
				GameRegistry.addShapelessRecipe(new ItemStack(Items.DYE, 1, 9), new ItemStack(Blocks.WOOL, 1, 6));
				GameRegistry.addShapelessRecipe(new ItemStack(Items.DYE, 1, 8), new ItemStack(Blocks.WOOL, 1, 7));
				GameRegistry.addShapelessRecipe(new ItemStack(Items.DYE, 1, 7), new ItemStack(Blocks.WOOL, 1, 8));
				GameRegistry.addShapelessRecipe(new ItemStack(Items.DYE, 1, 6), new ItemStack(Blocks.WOOL, 1, 9));
				GameRegistry.addShapelessRecipe(new ItemStack(Items.DYE, 1, 5), new ItemStack(Blocks.WOOL, 1, 10));
				GameRegistry.addShapelessRecipe(new ItemStack(Items.DYE, 1, 4), new ItemStack(Blocks.WOOL, 1, 11));
				GameRegistry.addShapelessRecipe(new ItemStack(Items.DYE, 1, 3), new ItemStack(Blocks.WOOL, 1, 12));
				GameRegistry.addShapelessRecipe(new ItemStack(Items.DYE, 1, 2), new ItemStack(Blocks.WOOL, 1, 13));
				GameRegistry.addShapelessRecipe(new ItemStack(Items.DYE, 1, 1), new ItemStack(Blocks.WOOL, 1, 14));
				GameRegistry.addShapelessRecipe(new ItemStack(Items.DYE, 1, 0), new ItemStack(Blocks.WOOL, 1, 15));
				GameRegistry.addShapelessRecipe(new ItemStack(Items.DYE, 1, 14), new ItemStack(Blocks.WOOL, 1, 1));
			}

			if (ConfigHandler.glassDye) {
				GameRegistry.addShapedRecipe(new ItemStack(Items.DYE, 1, 15), "XXX", "X X", "XXX", 'X', new ItemStack(Blocks.STAINED_GLASS, 1, 0));
				GameRegistry.addShapedRecipe(new ItemStack(Items.DYE, 1, 14), "XXX", "X X", "XXX", 'X', new ItemStack(Blocks.STAINED_GLASS, 1, 1));
				GameRegistry.addShapedRecipe(new ItemStack(Items.DYE, 1, 13), "XXX", "X X", "XXX", 'X', new ItemStack(Blocks.STAINED_GLASS, 1, 2));
				GameRegistry.addShapedRecipe(new ItemStack(Items.DYE, 1, 12), "XXX", "X X", "XXX", 'X', new ItemStack(Blocks.STAINED_GLASS, 1, 3));
				GameRegistry.addShapedRecipe(new ItemStack(Items.DYE, 1, 11), "XXX", "X X", "XXX", 'X', new ItemStack(Blocks.STAINED_GLASS, 1, 4));
				GameRegistry.addShapedRecipe(new ItemStack(Items.DYE, 1, 10), "XXX", "X X", "XXX", 'X', new ItemStack(Blocks.STAINED_GLASS, 1, 5));
				GameRegistry.addShapedRecipe(new ItemStack(Items.DYE, 1, 9), "XXX", "X X", "XXX", 'X', new ItemStack(Blocks.STAINED_GLASS, 1, 6));
				GameRegistry.addShapedRecipe(new ItemStack(Items.DYE, 1, 8), "XXX", "X X", "XXX", 'X', new ItemStack(Blocks.STAINED_GLASS, 1, 7));
				GameRegistry.addShapedRecipe(new ItemStack(Items.DYE, 1, 7), "XXX", "X X", "XXX", 'X', new ItemStack(Blocks.STAINED_GLASS, 1, 8));
				GameRegistry.addShapedRecipe(new ItemStack(Items.DYE, 1, 6), "XXX", "X X", "XXX", 'X', new ItemStack(Blocks.STAINED_GLASS, 1, 9));
				GameRegistry.addShapedRecipe(new ItemStack(Items.DYE, 1, 5), "XXX", "X X", "XXX", 'X', new ItemStack(Blocks.STAINED_GLASS, 1, 10));
				GameRegistry.addShapedRecipe(new ItemStack(Items.DYE, 1, 4), "XXX", "X X", "XXX", 'X', new ItemStack(Blocks.STAINED_GLASS, 1, 11));
				GameRegistry.addShapedRecipe(new ItemStack(Items.DYE, 1, 3), "XXX", "X X", "XXX", 'X', new ItemStack(Blocks.STAINED_GLASS, 1, 12));
				GameRegistry.addShapedRecipe(new ItemStack(Items.DYE, 1, 2), "XXX", "X X", "XXX", 'X', new ItemStack(Blocks.STAINED_GLASS, 1, 13));
				GameRegistry.addShapedRecipe(new ItemStack(Items.DYE, 1, 1), "XXX", "X X", "XXX", 'X', new ItemStack(Blocks.STAINED_GLASS, 1, 14));
				GameRegistry.addShapedRecipe(new ItemStack(Items.DYE, 1, 0), "XXX", "X X", "XXX", 'X', new ItemStack(Blocks.STAINED_GLASS, 1, 15));
			}
			if (ConfigHandler.glassDyePanes) {
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.STAINED_GLASS, 6, 0), "XXX", "X X", "XXX", 'X', new ItemStack(Blocks.STAINED_GLASS_PANE, 1, 0));
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.STAINED_GLASS, 6, 1), "XXX", "X X", "XXX", 'X', new ItemStack(Blocks.STAINED_GLASS_PANE, 1, 1));
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.STAINED_GLASS, 6, 2), "XXX", "X X", "XXX", 'X', new ItemStack(Blocks.STAINED_GLASS_PANE, 1, 2));
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.STAINED_GLASS, 6, 3), "XXX", "X X", "XXX", 'X', new ItemStack(Blocks.STAINED_GLASS_PANE, 1, 3));
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.STAINED_GLASS, 6, 4), "XXX", "X X", "XXX", 'X', new ItemStack(Blocks.STAINED_GLASS_PANE, 1, 4));
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.STAINED_GLASS, 6, 5), "XXX", "X X", "XXX", 'X', new ItemStack(Blocks.STAINED_GLASS_PANE, 1, 5));
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.STAINED_GLASS, 6, 6), "XXX", "X X", "XXX", 'X', new ItemStack(Blocks.STAINED_GLASS_PANE, 1, 6));
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.STAINED_GLASS, 6, 7), "XXX", "X X", "XXX", 'X', new ItemStack(Blocks.STAINED_GLASS_PANE, 1, 7));
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.STAINED_GLASS, 6, 8), "XXX", "X X", "XXX", 'X', new ItemStack(Blocks.STAINED_GLASS_PANE, 1, 8));
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.STAINED_GLASS, 6, 9), "XXX", "X X", "XXX", 'X', new ItemStack(Blocks.STAINED_GLASS_PANE, 1, 9));
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.STAINED_GLASS, 6, 10), "XXX", "X X", "XXX", 'X', new ItemStack(Blocks.STAINED_GLASS_PANE, 1, 10));
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.STAINED_GLASS, 6, 11), "XXX", "X X", "XXX", 'X', new ItemStack(Blocks.STAINED_GLASS_PANE, 1, 11));
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.STAINED_GLASS, 6, 12), "XXX", "X X", "XXX", 'X', new ItemStack(Blocks.STAINED_GLASS_PANE, 1, 12));
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.STAINED_GLASS, 6, 13), "XXX", "X X", "XXX", 'X', new ItemStack(Blocks.STAINED_GLASS_PANE, 1, 13));
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.STAINED_GLASS, 6, 14), "XXX", "X X", "XXX", 'X', new ItemStack(Blocks.STAINED_GLASS_PANE, 1, 14));
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.STAINED_GLASS, 6, 15), "XXX", "X X", "XXX", 'X', new ItemStack(Blocks.STAINED_GLASS_PANE, 1, 15));
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.GLASS, 6), "XXX", "X X", "XXX", 'X', new ItemStack(Blocks.GLASS_PANE));
			}
			if (ConfigHandler.slabs) {
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.STONE, 3), "   ", "XXX", "XXX", 'X', new ItemStack(Blocks.STONE_SLAB, 1, 0));
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.SANDSTONE, 3), "   ", "XXX", "XXX", 'X', new ItemStack(Blocks.STONE_SLAB, 1, 1));
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.COBBLESTONE, 3), "   ", "XXX", "XXX", 'X', new ItemStack(Blocks.STONE_SLAB, 1, 3));
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.BRICK_BLOCK, 3), "   ", "XXX", "XXX", 'X', new ItemStack(Blocks.STONE_SLAB, 1, 4));
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.STONEBRICK, 3), "   ", "XXX", "XXX", 'X', new ItemStack(Blocks.STONE_SLAB, 1, 5));
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.NETHER_BRICK, 3), "   ", "XXX", "XXX", 'X', new ItemStack(Blocks.STONE_SLAB, 1, 6));
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.QUARTZ_BLOCK, 3), "   ", "XXX", "XXX", 'X', new ItemStack(Blocks.STONE_SLAB, 1, 7));
			}
			if (ConfigHandler.walls) {
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.MOSSY_COBBLESTONE, 6), "   ", "XXX", "XXX", 'X', new ItemStack(Blocks.COBBLESTONE_WALL, 1, 1));
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.COBBLESTONE, 6), "   ", "XXX", "XXX", 'X', new ItemStack(Blocks.COBBLESTONE_WALL, 1, 0));
			}
			if (ConfigHandler.stairs) {
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.COBBLESTONE, 6), "   ", "XXX", "XXX", 'X', new ItemStack(Blocks.STONE_STAIRS, 1));
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.PLANKS, 6, 0), "   ", "XXX", "XXX", 'X', new ItemStack(Blocks.OAK_STAIRS, 1));
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.BRICK_BLOCK, 6), "   ", "XXX", "XXX", 'X', new ItemStack(Blocks.BRICK_STAIRS, 1));
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.STONEBRICK, 6), "   ", "XXX", "XXX", 'X', new ItemStack(Blocks.STONE_BRICK_STAIRS, 1));
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.NETHER_BRICK, 6), "   ", "XXX", "XXX", 'X', new ItemStack(Blocks.NETHER_BRICK_STAIRS, 1));
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.SANDSTONE, 6), "   ", "XXX", "XXX", 'X', new ItemStack(Blocks.SANDSTONE_STAIRS, 1));
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.PLANKS, 6, 1), "   ", "XXX", "XXX", 'X', new ItemStack(Blocks.SPRUCE_STAIRS, 1));
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.PLANKS, 6, 2), "   ", "XXX", "XXX", 'X', new ItemStack(Blocks.BIRCH_STAIRS, 1));
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.PLANKS, 6, 3), "   ", "XXX", "XXX", 'X', new ItemStack(Blocks.JUNGLE_STAIRS, 1));
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.QUARTZ_BLOCK, 6), "   ", "XXX", "XXX", 'X', new ItemStack(Blocks.QUARTZ_STAIRS, 1));
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.PLANKS, 6, 4), "   ", "XXX", "XXX", 'X', new ItemStack(Blocks.ACACIA_STAIRS, 1));
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.PLANKS, 6, 5), "   ", "XXX", "XXX", 'X', new ItemStack(Blocks.DARK_OAK_STAIRS, 1));
			}
			if (ConfigHandler.shears) {
				GameRegistry.addShapelessRecipe(new ItemStack(Items.IRON_INGOT, 2), new ItemStack(Items.SHEARS, 1, OreDictionary.WILDCARD_VALUE));
			}
			if (ConfigHandler.beacon) {
				GameRegistry.addShapelessRecipe(new ItemStack(Items.NETHER_STAR, 1), Blocks.BEACON);
			}
			if (ConfigHandler.woodSlab) {
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.PLANKS, 3, 0), "   ", "XXX", "XXX", 'X', new ItemStack(Blocks.WOODEN_SLAB, 1, 0));
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.PLANKS, 3, 1), "   ", "XXX", "XXX", 'X', new ItemStack(Blocks.WOODEN_SLAB, 1, 1));
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.PLANKS, 3, 2), "   ", "XXX", "XXX", 'X', new ItemStack(Blocks.WOODEN_SLAB, 1, 2));
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.PLANKS, 3, 3), "   ", "XXX", "XXX", 'X', new ItemStack(Blocks.WOODEN_SLAB, 1, 3));
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.PLANKS, 3, 4), "   ", "XXX", "XXX", 'X', new ItemStack(Blocks.WOODEN_SLAB, 1, 4));
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.PLANKS, 3, 5), "   ", "XXX", "XXX", 'X', new ItemStack(Blocks.WOODEN_SLAB, 1, 5));
			}
			if (ConfigHandler.startMsg) {
				FMLCommonHandler.instance().bus().register(events);
			}	
	}
}