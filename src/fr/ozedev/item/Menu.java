package fr.ozedev.item;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Menu {
	public static ItemStack getMenu(){
		ItemStack item = new ItemStack(Material.COMPASS);
		ItemMeta itemM = item.getItemMeta();
		itemM.setDisplayName("§r§6Jeux");
		item.setItemMeta(itemM);
		return item;
	}
}
