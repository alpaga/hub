package fr.ozedev.listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;

public class Loot implements Listener{
	@EventHandler
	public void onPlayerLoot(PlayerDropItemEvent event){
		event.setCancelled(true);
	}
}
