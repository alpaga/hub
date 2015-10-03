package fr.ozedev.menuSelecSurvie;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import fr.ozedev.item.ItemSelec;

public class MenuSelecSurvie {
	public static void addInv(Player player){
		Inventory inv = Bukkit.createInventory(player, 9*4, "Survie");
		setInv(inv);
		player.openInventory(inv);
	}
	private static void setInv(Inventory inv){
		inv.setItem(11, ItemSelec.getSurviJaune());
		inv.setItem(20, ItemSelec.getSurviRouge());
	}
}
