package fr.ozedev.listener;

import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import fr.ozedev.hub.ChangeServ;
import fr.ozedev.hub.Hub;
import fr.ozedev.item.ItemSelec;
import fr.ozedev.menuSelecSurvie.MenuSelecSurvie;

public class InventoryClick implements Listener{
	@EventHandler
	public static void onInventoryClick(InventoryClickEvent event){
		Player player = (Player) event.getWhoClicked();
		if(!player.getGameMode().equals(GameMode.CREATIVE)){
			if(event.getInventory().getName().equals("Jeux")){
				if(event.getCurrentItem().equals(ItemSelec.getCrea())){
					ChangeServ.changeServ("crea", player, Hub.getThePlugin());
				}
				if(event.getCurrentItem().equals(ItemSelec.getSurvi())){
					MenuSelecSurvie.addInv(player);
				}else if(event.getCurrentItem().equals(ItemSelec.getBDS())){
					ChangeServ.changeServ("bds", player, Hub.getThePlugin());
				}else if(event.getCurrentItem().equals(ItemSelec.getSnow())){
					ChangeServ.changeServ("snowpunch", player, Hub.getThePlugin());
				}
			}
			if(event.getInventory().getName().equals("Survie")){
				if(event.getCurrentItem().equals(ItemSelec.getSurviJaune())){
					ChangeServ.changeServ("survi", player, Hub.getThePlugin());
				}
				if(event.getCurrentItem().equals(ItemSelec.getSurviRouge())){
					ChangeServ.changeServ("survi2", player, Hub.getThePlugin());
				}
			}
			event.setCancelled(true);
		}
	}
}
