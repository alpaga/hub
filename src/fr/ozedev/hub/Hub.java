package fr.ozedev.hub;

import java.util.HashMap;
import java.util.Map;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffectType;

import fr.ozedev.item.*;
import fr.ozedev.hub.HubPlayer;
import fr.ozedev.listener.*;

public class Hub extends JavaPlugin{
	static Map<String, HubPlayer> hubPlayer = new HashMap<>();
	static Plugin instance;
	
	public void onEnable(){
		PluginManager pm = Bukkit.getPluginManager();
		pm.registerEvents(new Join(), this);
		pm.registerEvents(new Damage(), this);
		pm.registerEvents(new Interact(), this);
		pm.registerEvents(new InventoryClick(), this);
		pm.registerEvents(new Loot(), this);
		pm.registerEvents(new Move(), this);
		instance = this;
	}
	public static HubPlayer get(Player player){
		return hubPlayer.get(player.getName());
	}
	public static Plugin getThePlugin(){
		return instance;
	}
	public static void initPlayer(Player player){
		if (get(player) == null) hubPlayer.put(player.getName(), new HubPlayer());
		
		player.teleport(new Location(player.getWorld(),32,25,61));
		
		player.sendMessage("§6----------------------------------------------------");
		player.sendMessage("§aBienvenue §b"+player.getName().toString()+" §asur §6§kpo§r§aXitron§6§kpo§r§a");
		player.sendMessage("§6----------------------------------------------------");
		
		player.setGameMode(GameMode.ADVENTURE);
		
		player.getInventory().clear();
		player.getInventory().addItem(Menu.getMenu());
		player.getInventory().addItem(Jump.getJump());
		player.getInventory().addItem(Spawn.getSpawn());
		
		player.removePotionEffect(PotionEffectType.SATURATION);
		player.removePotionEffect(PotionEffectType.DAMAGE_RESISTANCE);
	}
}
