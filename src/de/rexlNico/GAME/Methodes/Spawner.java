package de.rexlNico.GAME.Methodes;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Spawner {

	public static void spawnBronze(Location loc){
		
		ItemStack item = new ItemStack(336);
		ItemMeta imeta = item.getItemMeta();
		imeta.setDisplayName("§cBronze");
		item.setItemMeta(imeta);
		
		
		loc.getWorld().dropItem(loc, item);
	}
	
	public static void SpawnSilber(Location loc){
		
		ItemStack item = new ItemStack(Material.IRON_INGOT);
		ItemMeta imeta = item.getItemMeta();
		imeta.setDisplayName("§7Silber");
		item.setItemMeta(imeta);
		
		
		loc.getWorld().dropItem(loc, item);
	}
	
	public static void spawnGold(Location loc){
		
		ItemStack item = new ItemStack(Material.GOLD_INGOT);
		ItemMeta imeta = item.getItemMeta();
		imeta.setDisplayName("§eGold");
		item.setItemMeta(imeta);
		
		
		loc.getWorld().dropItem(loc, item);
	}
	
}
