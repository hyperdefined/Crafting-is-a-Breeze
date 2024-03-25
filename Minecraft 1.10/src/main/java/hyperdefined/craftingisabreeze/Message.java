package hyperdefined.craftingisabreeze;

import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;

public class Message {
	String startMsg = TextFormatting.GRAY + "Running version " + Reference.VERSION + " of Crafting is a Breeze.";
	@SubscribeEvent
	public void PlayerLoginEvent(PlayerEvent.PlayerLoggedInEvent event) {
		event.player.addChatComponentMessage(new TextComponentString(startMsg));
	}
}