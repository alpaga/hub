package fr.ozedev.item;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ItemSelec {
	public static ItemStack getCrea(){
		ItemStack item = new ItemStack(Material.GRASS);
		ItemMeta itemM = item.getItemMeta();
		itemM.setDisplayName("§r§6Mode Creatif");
		item.setItemMeta(itemM);
		return item;
	}
	public static ItemStack getSurvi(){
		ItemStack item = new ItemStack(Material.DIAMOND_PICKAXE);
		ItemMeta itemM = item.getItemMeta();
		itemM.setDisplayName("§r§6Mode Survie");
		item.setItemMeta(itemM);
		return item;
	}
	public static ItemStack getBDS(){
		ItemStack item = new ItemStack(Material.REDSTONE);
		ItemMeta itemM = item.getItemMeta();
		itemM.setDisplayName("§r§6Bain De Sang");
		item.setItemMeta(itemM);
		return item;
	}
	public static ItemStack getSnow(){
		ItemStack item = new ItemStack(Material.SNOW_BALL);
		ItemMeta itemM = item.getItemMeta();
		itemM.setDisplayName("§r§6SnowPunch");
		item.setItemMeta(itemM);
		return item;
	}
}
