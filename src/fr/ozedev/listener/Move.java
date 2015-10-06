package fr.ozedev.listener;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class Move implements Listener{	
	@EventHandler
	public void onPlayerMove(PlayerMoveEvent event){
		Player player = event.getPlayer();
		player.setSaturation(20);
		if(player.getLocation().getBlockY() <=0) player.teleport(new Location(player.getWorld(),32,25,61));
	}
}
