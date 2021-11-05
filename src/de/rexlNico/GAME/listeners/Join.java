package de.rexlNico.GAME.listeners;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import com.google.common.io.ByteArrayDataOutput;
import com.google.common.io.ByteStreams;

import de.rexlNico.GAME.GameStates.GameStateHandler;
import de.rexlNico.GAME.GameStates.LobbyState;
import de.rexlNico.GAME.Main.Main;
import de.rexlNico.GAME.Methodes.Factory;
import de.rexlNico.GAME.Methodes.Var;

public class Join implements Listener{
	
	@SuppressWarnings("static-access")
	@EventHandler
	public void on(PlayerJoinEvent e){
		Player p = e.getPlayer();
		e.setJoinMessage(null);
		
		if(Var.playing.size() == LobbyState.MAX_PLAYERS){
			p.kickPlayer("§4Der Server ist voll!");
			return;
		}
		
		if(GameStateHandler.getGamestate() instanceof LobbyState){
			p.teleport(Factory.getConfigLocation("Spawn.Lobby", Var.cfg));
			
			
			ItemStack i3 = new ItemStack(Material.BED);
			ItemMeta im3 = i3.getItemMeta();
			im3.setDisplayName("§4Wähle dein Team");
			i3.setItemMeta(im3);
			
			
			
			LobbyState ls = (LobbyState) GameStateHandler.getGamestate();
			Var.playing.add(p);
			Var.noTeam.add(p);
			
			Bukkit.broadcastMessage(Var.pr+"Der Spieler §a"+p.getDisplayName()+"§7 ist dem Spiel beigetreten. §r §8[§c"+Var.playing.size()+"§8/§c"+LobbyState.MAX_PLAYERS+"§8]");
			p.setLevel(0);
			p.getInventory().clear();
			p.getInventory().setItem(0, i3);
			
			
			if(Var.playing.size() >= LobbyState.MIN_PLAYERS){
				if(ls.getCountdown().isRunning == false){
					ls.getCountdown().stopIdle();
					ls.getCountdown().start();
				}
			}
			if(Var.playing.size() < LobbyState.MIN_PLAYERS){
				if(ls.getCountdown().isIdelind == false){
					ls.getCountdown().idle();
				}
			}
			
			
			Var.MAX_PLAYERS_PER_TEAM = 1;
			
			if(Var.playing.size() > 3 && Var.playing.size() < 5){
				Var.MAX_PLAYERS_PER_TEAM = 2;
			}else if(Var.playing.size() > 4 && Var.playing.size() < 9){
				Var.MAX_PLAYERS_PER_TEAM = 3;
			}else if(Var.playing.size() > 8 && Var.playing.size() < 13){
				Var.MAX_PLAYERS_PER_TEAM = 4;
			}else if(Var.playing.size() >12){
				Bukkit.spigot().restart();
			}
			
		}else{
			ByteArrayDataOutput out = ByteStreams.newDataOutput();
			out.writeUTF("Connect");
			out.writeUTF("lobby-01");
			p.sendPluginMessage(Main.getPlugin(), "BungeeCord", out.toByteArray());
		}
	}
	
}
