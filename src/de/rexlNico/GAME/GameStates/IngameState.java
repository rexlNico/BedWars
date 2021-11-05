package de.rexlNico.GAME.GameStates;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.inventory.InventoryView.Property;

import de.rexlNico.GAME.Main.Main;
import de.rexlNico.GAME.Methodes.BlockFactory;
import de.rexlNico.GAME.Methodes.Factory;
import de.rexlNico.GAME.Methodes.Spawner;
import de.rexlNico.GAME.Methodes.Var;
import de.rexlNico.GAME.Methodes.VillagerShop;

public class IngameState extends GameState{
	
	private int TaskID;
	private int bronze,silber,gold;
	
	@SuppressWarnings("deprecation")
	@Override
	public void init() {
		
		//Team Setzen
		for(Player a : Var.noTeam){
			if(Var.Blau.size() < Var.MAX_PLAYERS_PER_TEAM){
				Var.Blau.add(a);
			}else if(Var.Gelb.size() < Var.MAX_PLAYERS_PER_TEAM){
				Var.Gelb.add(a);
			}else if(Var.Grün.size() < Var.MAX_PLAYERS_PER_TEAM){
				Var.Grün.add(a);
			}else if(Var.Rot.size() < Var.MAX_PLAYERS_PER_TEAM){
				Var.Rot.add(a);
			}else{
				Var.spec.add(a);
			}
		}
		
		for(Player a: Var.playing){
			a.getInventory().clear();
			a.setGameMode(GameMode.SURVIVAL);
		}
		
		//Team teleportieren
		for(Player a:Var.Blau){
			a.teleport(Factory.getConfigLocation("Spawn.Blau", Var.cfg));
			a.playSound(a.getLocation(), Sound.ENDERMAN_TELEPORT, 1, 1);
		}
		for(Player a:Var.Grün){
			a.teleport(Factory.getConfigLocation("Spawn.Grün", Var.cfg));
			a.playSound(a.getLocation(), Sound.ENDERMAN_TELEPORT, 1, 1);
		}
		for(Player a:Var.Gelb){
			a.teleport(Factory.getConfigLocation("Spawn.Gelb", Var.cfg));
			a.playSound(a.getLocation(), Sound.ENDERMAN_TELEPORT, 1, 1);
		}
		for(Player a:Var.Rot){
			a.teleport(Factory.getConfigLocation("Spawn.Rot", Var.cfg));
			a.playSound(a.getLocation(), Sound.ENDERMAN_TELEPORT, 1, 1);
		}
		//Team Bed Setzen
		Location bedBlau = BlockFactory.getConfigLocation("Bed.Blau", Var.cfg);
		Location bedRot = BlockFactory.getConfigLocation("Bed.Rot", Var.cfg);
		Location bedGrün = BlockFactory.getConfigLocation("Bed.Grün", Var.cfg);
		Location bedGelb = BlockFactory.getConfigLocation("Bed.Gelb", Var.cfg);
		bedBlau.getWorld().getBlockAt(bedBlau).setType(Material.EMERALD_BLOCK);
		bedRot.getWorld().getBlockAt(bedRot).setType(Material.EMERALD_BLOCK);
		bedGrün.getWorld().getBlockAt(bedGrün).setType(Material.EMERALD_BLOCK);
		bedGelb.getWorld().getBlockAt(bedGelb).setType(Material.EMERALD_BLOCK);
		//Villager Setzen
		
		VillagerShop.SpawnShop();
		
		//Spawner Aktivieren
		
		bronze = Bukkit.getScheduler().scheduleAsyncRepeatingTask(Main.getPlugin(), new Runnable() {
			
			@Override
			public void run() {
				for(int i = 0; i < Var.bronze.size(); i++){
					Spawner.spawnBronze(Var.bronze.get(i));;
				}
			}
		}, 0, 20*1);
		
		silber = Bukkit.getScheduler().scheduleAsyncRepeatingTask(Main.getPlugin(), new Runnable() {
			
			@Override
			public void run() {
				for(int i = 0; i < Var.silber.size(); i++){
					Spawner.SpawnSilber(Var.silber.get(i));
				}
			}
		}, 0, 20*10);
		
		gold = Bukkit.getScheduler().scheduleAsyncRepeatingTask(Main.getPlugin(), new Runnable() {
			
			@Override
			public void run() {
				for(int i = 0; i < Var.gold.size(); i++){
					Spawner.spawnGold(Var.gold.get(i));
				}
			}
		}, 0, 20*60);
		
		
		
		
		
		//PvP true / build true
		Var.pvp = true;
		Var.canBuild = true;
		Var.canDrop = true;

		//Testen ob ein Team gewonnen hat
		TaskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(), new Runnable() {
			
			@Override
			public void run() {
				
				
				
				
				
				if(Var.Blau.size() == 0 && Var.Gelb.size() == 0 && Var.Rot.size() == 0 && Var.Grün.size() >= 1){
					
					for(Player a:Bukkit.getOnlinePlayers()){
						a.sendMessage(Var.pr+"§cTeam §aGrün §chat gewonnen!");
						a.playSound(a.getLocation(), Sound.FIREWORK_LARGE_BLAST, 1, 1);
					}
					GameStateHandler.setGameState(END_STATE);
					
				}else if(Var.Blau.size() == 0 && Var.Gelb.size() == 0 && Var.Grün.size() == 0 && Var.Rot.size() >= 1){
					
					for(Player a:Bukkit.getOnlinePlayers()){
						a.sendMessage(Var.pr+"§cTeam §4Rot §chat gewonnen!");
						a.playSound(a.getLocation(), Sound.FIREWORK_LARGE_BLAST, 1, 1);
					}
					GameStateHandler.setGameState(END_STATE);
					
				}else if(Var.Blau.size() == 0 && Var.Grün.size() == 0 && Var.Rot.size() == 0 && Var.Gelb.size() >= 1){
					
					for(Player a:Bukkit.getOnlinePlayers()){
						a.sendMessage(Var.pr+"§cTeam §eGelb §chat gewonnen!");
						a.playSound(a.getLocation(), Sound.FIREWORK_LARGE_BLAST, 1, 1);
					}
					GameStateHandler.setGameState(END_STATE);
					
				}else if(Var.Grün.size() == 0 && Var.Gelb.size() == 0 && Var.Rot.size() == 0 && Var.Blau.size() >= 1){
					
					for(Player a:Bukkit.getOnlinePlayers()){
						a.sendMessage(Var.pr+"§cTeam §1Blau §chat gewonnen!");
						a.playSound(a.getLocation(), Sound.FIREWORK_LARGE_BLAST, 1, 1);
					}
					GameStateHandler.setGameState(END_STATE);
					
				}
			}
		}, 0, 20*1);
	}

	@Override
	public void end() {
		// TODO Auto-generated method stub
		Bukkit.getScheduler().cancelTask(TaskID);
		Bukkit.getScheduler().cancelTask(bronze);
		Bukkit.getScheduler().cancelTask(silber);
		Bukkit.getScheduler().cancelTask(gold);
		Var.pvp = false;
		Var.canBuild = false;
	}
	
	
}
