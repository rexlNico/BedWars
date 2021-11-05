package de.rexlNico.GAME.listeners;

import org.bukkit.Bukkit;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Villager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerDropItemEvent;

import de.rexlNico.GAME.Main.Main;
import de.rexlNico.GAME.Methodes.Factory;
import de.rexlNico.GAME.Methodes.Var;
import net.minecraft.server.v1_8_R3.PacketPlayInClientCommand;
import net.minecraft.server.v1_8_R3.PacketPlayInClientCommand.EnumClientCommand;

public class DeathListener implements Listener{
	
	@EventHandler
	public void on(PlayerDeathEvent e){
		e.setDeathMessage(null);
		Player p = e.getEntity();
		((CraftPlayer) p).getHandle().playerConnection.a(new PacketPlayInClientCommand(EnumClientCommand.PERFORM_RESPAWN));

		e.setDroppedExp(0);
		p.getInventory().clear();
		
		for(Player a: Var.playing){
			if(a == p){
				a.sendMessage(Var.pr+"Du bist gestorben.");
			}else{
				a.sendMessage(Var.pr+"Der Spieler §b"+p.getDisplayName()+" §7ist gestorben.");
			}
		}
		
		if(Var.bedBlau == false && Var.Blau.contains(p)){
			Var.Blau.remove(p);
			Var.spec.add(p);
			Var.playing.remove(p);
			p.teleport(Factory.getConfigLocation("Spawn.Spec", Var.cfg));
		}else if(Var.bedRot == false && Var.Rot.contains(p)){
			Var.Rot.remove(p);
			Var.spec.add(p);
			Var.playing.remove(p);
			p.teleport(Factory.getConfigLocation("Spawn.Spec", Var.cfg));
		}else if(Var.bedGelb == false && Var.Gelb.contains(p)){
			Var.Gelb.remove(p);
			Var.spec.add(p);
			Var.playing.remove(p);
			p.teleport(Factory.getConfigLocation("Spawn.Spec", Var.cfg));
		}else if(Var.bedGrün == false && Var.Grün.contains(p)){
			Var.Grün.remove(p);
			Var.spec.add(p);
			Var.playing.remove(p);
			p.teleport(Factory.getConfigLocation("Spawn.Spec", Var.cfg));
		}else{
			Bukkit.getScheduler().scheduleSyncDelayedTask(Main.getPlugin(), new Runnable() {
				
				@Override
				public void run() {
					
					if(Var.bedBlau == true && Var.Blau.contains(p)){
						p.teleport(Factory.getConfigLocation("Spawn.Blau", Var.cfg));
					}else if(Var.bedRot == true && Var.Rot.contains(p)){
						p.teleport(Factory.getConfigLocation("Spawn.Rot", Var.cfg));
					}else if(Var.bedGelb == true && Var.Gelb.contains(p)){
						p.teleport(Factory.getConfigLocation("Spawn.Gelb", Var.cfg));
					}else if(Var.bedGrün == true && Var.Grün.contains(p)){
						p.teleport(Factory.getConfigLocation("Spawn.Grün", Var.cfg));
					}
					
				}
			}, 1);
		}
	}
	
	
	@EventHandler
	public void on(EntityDamageByEntityEvent e){
		
		if(e.getDamager() instanceof Player){
			if(e.getEntity() instanceof Player){
		Player ph = (Player) e.getDamager();
		Player pwh = (Player) e.getEntity();
		
		
		if(Var.pvp == true){
		
		if(Var.Blau.contains(ph) && Var.Blau.contains(pwh)){
			e.setCancelled(true);
		}else if(Var.Rot.contains(ph) && Var.Rot.contains(pwh)){
			e.setCancelled(true);
		}else if(Var.Grün.contains(ph) && Var.Grün.contains(pwh)){
			e.setCancelled(true);
		}else if(Var.Gelb.contains(ph) && Var.Gelb.contains(pwh)){
			e.setCancelled(true);
		}
		
		}else{
			e.setCancelled(true);
		}
		}else{
			e.setCancelled(true);
		}
		}else{
			e.setCancelled(true);
		}
	}

}
