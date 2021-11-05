package de.rexlNico.GAME.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

import de.rexlNico.GAME.Methodes.Factory;
import de.rexlNico.GAME.Methodes.Var;

public class MoveEvent implements Listener{

	@EventHandler
	public void on(PlayerMoveEvent e){
		Player p = e.getPlayer();
		if(p.getLocation().getY() < 1){
			if(Var.bedBlau == true && Var.Blau.contains(p)){
				p.teleport(Factory.getConfigLocation("Spawn.Blau", Var.cfg));
			}else if(Var.bedRot == true && Var.Rot.contains(p)){
				p.teleport(Factory.getConfigLocation("Spawn.Rot", Var.cfg));
			}else if(Var.bedGelb == true && Var.Gelb.contains(p)){
				p.teleport(Factory.getConfigLocation("Spawn.Gelb", Var.cfg));
			}else if(Var.bedGrün == true && Var.Grün.contains(p)){
				p.teleport(Factory.getConfigLocation("Spawn.Grün", Var.cfg));
			}
			p.getInventory().clear();
		}
	}
	
}
