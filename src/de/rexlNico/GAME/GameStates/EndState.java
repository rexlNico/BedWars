package de.rexlNico.GAME.GameStates;

import java.io.File;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Sign;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import com.google.common.io.ByteArrayDataOutput;
import com.google.common.io.ByteStreams;

import de.rexlNico.GAME.Main.Main;
import de.rexlNico.GAME.Methodes.Var;

public class EndState extends GameState{

	int TaskID;
	int sec = 16;
	
	@Override
	public void init() {
		
		TaskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(), new Runnable() {
			
			@Override
			public void run() {
				
				sec--;
				
				switch (sec) {
				case 15: case 10: case 5: case 4: case 3: case 2:case 1:
					Bukkit.broadcastMessage(Var.pr+"Der server startet in §e"+sec+" §7Sekunden neu.");
					break;

				case 0:
					Bukkit.getScheduler().cancelTask(TaskID);
					for(Player a : Bukkit.getOnlinePlayers()){
						ByteArrayDataOutput out = ByteStreams.newDataOutput();
									out.writeUTF("Connect");
									out.writeUTF("lobby-01");
									a.sendPluginMessage(Main.getPlugin(), "BungeeCord", out.toByteArray());
					}
					
					for(int i = 0; i < Var.PlacedBlocks.size(); i++){
						Var.PlacedBlocks.get(i).getWorld().getBlockAt(Var.PlacedBlocks.get(i)).setType(Material.AIR);
					}
					Bukkit.reload();
					
					break;
					
				default:
					break;
				}
				
			}
		}, 0, 20*1);
	}

	@Override
	public void end() {
		// TODO Auto-generated method stub
		
	}

}
