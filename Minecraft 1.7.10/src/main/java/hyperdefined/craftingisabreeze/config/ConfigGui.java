package hyperdefined.craftingisabreeze.config;

import cpw.mods.fml.client.config.GuiConfig;
import hyperdefined.craftingisabreeze.Reference;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

public class ConfigGui extends GuiConfig {

	static String CONFIG_MESSAGE = EnumChatFormatting.BOLD + "Any changes made will require a game restart!";
	
	public ConfigGui(GuiScreen parent) {
		super(parent,
    		new ConfigElement(ConfigHandler.config.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(), Reference.MODID, true, true, CONFIG_MESSAGE);
  }
}