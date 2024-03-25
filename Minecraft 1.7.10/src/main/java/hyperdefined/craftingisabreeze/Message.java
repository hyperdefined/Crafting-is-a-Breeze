package hyperdefined.craftingisabreeze;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;


public class Message {
	String startMsg = EnumChatFormatting.GRAY + "Running version " + Reference.VERSION + " of Crafting is a Breeze.";
	@SubscribeEvent
	public void PlayerLoginEvent(PlayerEvent.PlayerLoggedInEvent event) {
		event.player.addChatComponentMessage(new ChatComponentText(startMsg));
	}
}