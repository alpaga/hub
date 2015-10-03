package fr.ozedev.menuSelec;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import fr.ozedev.item.ItemSelec;

public class MenuSelec {
	public static void addInv(Player player){
		Inventory inv = Bukkit.createInventory(player, 9*4, "Jeux");
		setInv(inv);
		player.openInventory(inv);
	}
	private static void setInv(Inventory inv){
		inv.setItem(11, ItemSelec.getCrea());
		inv.setItem(12, ItemSelec.getBDS());
		inv.setItem(20, ItemSelec.getSurvi());
		inv.setItem(21, ItemSelec.getSnow());
	}
}
