package fr.ozedev.item;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Jump{
	public static ItemStack getJump(){
		ItemStack item = new ItemStack(Material.FEATHER);
		ItemMeta itemM = item.getItemMeta();
		itemM.setDisplayName("§r§6Jump");
		item.setItemMeta(itemM);
		return item;
	}
}
