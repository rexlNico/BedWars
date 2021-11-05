package de.rexlNico.GAME.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerDropItemEvent;

import de.rexlNico.GAME.Methodes.Var;

public class Drop implements Listener{

	@EventHandler
	public void on(InventoryClickEvent e){
		if(Var.canDrop == false){
			e.setCancelled(true);
		}
	}
	
	@EventHandler
	public void on(PlayerDropItemEvent e){
		if(Var.canDrop == false){
			e.setCancelled(true);
		}
	}
	
}
