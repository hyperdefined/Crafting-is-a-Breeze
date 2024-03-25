package hyperdefined.craftingisabreeze;

import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;

public class Message {
	String startMsg = EnumChatFormatting.GRAY + "Running version " + Reference.VERSION + " of Crafting is a Breeze.";
	@SubscribeEvent
	public void PlayerLoginEvent(PlayerEvent.PlayerLoggedInEvent event) {
		event.player.addChatComponentMessage(new ChatComponentText(startMsg));
	}
}