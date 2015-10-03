package fr.ozedev.item;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Spawn {
	public static ItemStack getSpawn(){
		ItemStack item = new ItemStack(Material.BED);
		ItemMeta itemM = item.getItemMeta();
		itemM.setDisplayName("§r§6Spawn");
		item.setItemMeta(itemM);
		return item;
	}
}
