package de.rexlNico.GAME.Methodes;

import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ItemApi {

	public static void setItem(Inventory inv, String name, int subid, Material item, int Slot){
		ItemStack item1 = new ItemStack(item,1,(short) subid);
		ItemMeta imeta = item1.getItemMeta();
		imeta.setDisplayName(name);
		item1.setItemMeta(imeta);
		
		inv.setItem(Slot, item1);
	}
	
}
