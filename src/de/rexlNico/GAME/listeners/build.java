package de.rexlNico.GAME.listeners;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;

import de.rexlNico.GAME.Methodes.BlockFactory;
import de.rexlNico.GAME.Methodes.Factory;
import de.rexlNico.GAME.Methodes.Var;

public class build implements Listener{

	@EventHandler
	public void on(BlockBreakEvent e){
		Player p = e.getPlayer();
		if(Var.canBuild == true){
			if((Var.PlacedBlocks.size() == 0)){
				e.setCancelled(true);
			}else{
				for(int i = 0; i <= Var.PlacedBlocks.size(); i++){
					if(Var.PlacedBlocks.get(i).getBlock().getX() == e.getBlock().getLocation().getX() && 
							Var.PlacedBlocks.get(i).getBlock().getY() == e.getBlock().getLocation().getY() &&
							Var.PlacedBlocks.get(i).getBlock().getZ() == e.getBlock().getLocation().getZ() &&
							Var.PlacedBlocks.get(i).getBlock().getWorld() == e.getBlock().getLocation().getWorld()){
						if(e.getBlock().getType().equals(Material.EMERALD_BLOCK)){
							e.getBlock().setType(Material.AIR);
							
							Location bedBlau = BlockFactory.getConfigLocation("Bed.Blau", Var.cfg);
							Location bedRot = BlockFactory.getConfigLocation("Bed.Rot", Var.cfg);
							Location bedGrün = BlockFactory.getConfigLocation("Bed.Grün", Var.cfg);
							Location bedGelb = BlockFactory.getConfigLocation("Bed.Gelb", Var.cfg);
							if(bedBlau.getBlock().getType() != Material.EMERALD_BLOCK && Var.bedBlau == true){
								Var.bedBlau = false;
								Bukkit.broadcastMessage(Var.pr+"§cTeam §1Blau §chat nun kein Bett mehr.");
								for(Player a : Bukkit.getOnlinePlayers()){
									a.playSound(a.getLocation(), Sound.ENDERDRAGON_DEATH, 1, 1);
								}
							}
							if(bedGrün.getBlock().getType() != Material.EMERALD_BLOCK && Var.bedGrün == true){
								Var.bedGrün = false;
								Bukkit.broadcastMessage(Var.pr+"§cTeam §aGrün §chat nun kein Bett mehr.");
								for(Player a : Bukkit.getOnlinePlayers()){
									a.playSound(a.getLocation(), Sound.ENDERDRAGON_DEATH, 1, 1);
								}
							}
							if(bedRot.getBlock().getType() != Material.EMERALD_BLOCK && Var.bedRot == true){
								Var.bedRot = false;
								Bukkit.broadcastMessage(Var.pr+"§cTeam §4Rot §chat nun kein Bett mehr.");
								for(Player a : Bukkit.getOnlinePlayers()){
									a.playSound(a.getLocation(), Sound.ENDERDRAGON_DEATH, 1, 1);
								}
							}
							if(bedGelb.getBlock().getType() != Material.EMERALD_BLOCK && Var.bedGelb == true){
								Var.bedGelb = false;
								Bukkit.broadcastMessage(Var.pr+"§cTeam §eGelb §chat nun kein Bett mehr.");
								for(Player a : Bukkit.getOnlinePlayers()){
									a.playSound(a.getLocation(), Sound.ENDERDRAGON_DEATH, 1, 1);
								}
							}
							
						}
						Var.PlacedBlocks.remove(i);
						e.getBlock().breakNaturally();
					}else{
						e.setCancelled(true);
					}
				}
				
			}
		}else{
			e.setCancelled(true);
		}
	}
	@EventHandler
	public void on(BlockPlaceEvent e){
		Player p = e.getPlayer();
		if(Var.canBuild == true){
			Var.PlacedBlocks.add(e.getBlock().getLocation());
		}else{
			e.setCancelled(true);
		}
	}
	
}
