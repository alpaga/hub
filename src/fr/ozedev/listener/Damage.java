package fr.ozedev.listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

public class Damage implements Listener{
	@EventHandler
	public void onDamage (EntityDamageEvent event){
		if (event.getEntity() instanceof Player){
			event.setCancelled(true);
		}
	}
}
