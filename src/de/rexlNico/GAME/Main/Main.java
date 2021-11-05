package de.rexlNico.GAME.Main;

import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.command.CommandExecutor;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Item;
import org.bukkit.entity.Villager;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import de.rexlNico.GAME.Commands.SetSpawner;
import de.rexlNico.GAME.Commands.Start;
import de.rexlNico.GAME.Commands.setSpawn;
import de.rexlNico.GAME.GameStates.GameState;
import de.rexlNico.GAME.GameStates.GameStateHandler;
import de.rexlNico.GAME.Methodes.BlockFactory;
import de.rexlNico.GAME.Methodes.Spawner;
import de.rexlNico.GAME.Methodes.Var;
import de.rexlNico.GAME.listeners.DeathListener;
import de.rexlNico.GAME.listeners.Drop;
import de.rexlNico.GAME.listeners.Join;
import de.rexlNico.GAME.listeners.MoveEvent;
import de.rexlNico.GAME.listeners.Quit;
import de.rexlNico.GAME.listeners.TeamAuswahl;
import de.rexlNico.GAME.listeners.VillagerEvent;
import de.rexlNico.GAME.listeners.VillagerShopEvent;
import de.rexlNico.GAME.listeners.build;

public class Main extends JavaPlugin{

	private static Main plugin;
	private PluginManager pm = Bukkit.getPluginManager();
	
	
	@Override
	public void onEnable() {
		plugin = this;	
		Bukkit.getConsoleSender().sendMessage("###############");
		Bukkit.getConsoleSender().sendMessage("§eLoM §aGeladen");
		Bukkit.getConsoleSender().sendMessage("###############");
		Load();
		this.getServer().getMessenger().registerOutgoingPluginChannel(this, "BungeeCord");
		new GameStateHandler();
		GameStateHandler.setGameState(GameState.LOBBY_STATE);
		
		
		
		Var.PlacedBlocks.add(BlockFactory.getConfigLocation("Bed.Rot", Var.cfg));
		Var.PlacedBlocks.add(BlockFactory.getConfigLocation("Bed.Blau", Var.cfg));
		Var.PlacedBlocks.add(BlockFactory.getConfigLocation("Bed.Gelb", Var.cfg));
		Var.PlacedBlocks.add(BlockFactory.getConfigLocation("Bed.Grün", Var.cfg));
			
		for(int i = 1; i < Var.cfg.getInt("silber.zahl"); i++){
			Var.silber.add(BlockFactory.getConfigLocation("silber.spawn."+i, Var.cfg));
		}
		for(int i = 1; i < Var.cfg.getInt("bronze.zahl"); i++){
			Var.bronze.add(BlockFactory.getConfigLocation("bronze.spawn."+i, Var.cfg));
		}
		for(int i = 1; i < Var.cfg.getInt("gold.zahl"); i++){
			Var.gold.add(BlockFactory.getConfigLocation("gold.spawn."+i, Var.cfg));
		}
	
		
		
		removeItems();
		
	}
	public static Main getPlugin() {
		return plugin;
	}
	
	private void Load(){
		//Commands
		RegCommand("start", new Start());
		RegCommand("set", new setSpawn());
		RegCommand("setspawner", new SetSpawner());
		//Listeners
		pm.registerEvents(new Join(), this);
		pm.registerEvents(new Quit(), this);
		pm.registerEvents(new TeamAuswahl(), this);
		pm.registerEvents(new build(), this);
		pm.registerEvents(new DeathListener(), this);
		pm.registerEvents(new MoveEvent(), this);
		pm.registerEvents(new VillagerEvent(), this);
		pm.registerEvents(new Drop(), this);   
		pm.registerEvents(new VillagerShopEvent(), this);
	}
	
	private void RegCommand(String name,CommandExecutor exe){
		getCommand(name).setExecutor(exe);
	}
	private void removeItems(){
		World world = BlockFactory.getConfigLocation("Bed.Rot", Var.cfg).getWorld();
		List<Entity> entities = world.getEntities();
		for(Entity items : entities){
			if(items instanceof Item){
				items.remove();
			}else if(items instanceof Villager){
				items.remove();
			}
		}
	}
}
