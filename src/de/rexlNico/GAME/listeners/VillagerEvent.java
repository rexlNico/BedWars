package de.rexlNico.GAME.listeners;

import org.bukkit.Sound;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;

import de.rexlNico.GAME.Methodes.VillagerShop;

public class VillagerEvent implements Listener{

	@EventHandler
	public void on(PlayerInteractEntityEvent e){
		Player p = e.getPlayer();
		Entity ent = e.getRightClicked();
		if(ent.getType() == EntityType.VILLAGER){
			if(ent.getCustomName().equals("§eShop")){
				e.setCancelled(true);
				p.openInventory(VillagerShop.Start());
				p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
			}
		}
	}
	
}
