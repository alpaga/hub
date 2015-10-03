package fr.ozedev.listener;

import java.util.HashMap;
import java.util.Map;

import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import fr.ozedev.item.*;
import fr.ozedev.menuSelec.MenuSelec;

public class Interact implements Listener{
	Map<String, Long> useFeather = new HashMap<>();
	Map<String, Long> useBed = new HashMap<>();
	
	@EventHandler
	public void onPlayerInteract(PlayerInteractEvent event){
		Player player = event.getPlayer();
		if(!player.getGameMode().equals(GameMode.CREATIVE)){
			if((event.getAction().equals(Action.RIGHT_CLICK_AIR))||(event.getAction().equals(Action.RIGHT_CLICK_BLOCK))){
				if (player.getItemInHand().equals(Menu.getMenu())){
					MenuSelec.addInv(player);
				}else if (player.getItemInHand().equals(Jump.getJump())){
					Long lastUseFeather = useFeather.get(player.getName());
					if(lastUseFeather == null) lastUseFeather = 0L;
					long result = System.currentTimeMillis() - lastUseFeather;
					
					if(result < 2*1000){
						player.sendMessage("§aMerci de ne pas spamer cette objet");
					}else{
						player.teleport(new Location(player.getWorld(),55,38,34));
					}
					useFeather.put(player.getName(), System.currentTimeMillis());
				}else if (player.getItemInHand().equals(Spawn.getSpawn())){
					Long lastUseBed = useBed.get(player.getName());
					if(lastUseBed == null) lastUseBed = 0L;
					long result = System.currentTimeMillis() - lastUseBed;
					
					if(result < 2*1000){
						player.sendMessage("§aMerci de ne pas spamer cette objet");
					}else{
						player.teleport(new Location(player.getWorld(),32,25,61));
					}
					useBed.put(player.getName(), System.currentTimeMillis());
				}
			}
		event.setCancelled(true);
		}
	}
}
