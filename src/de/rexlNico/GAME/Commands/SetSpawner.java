package de.rexlNico.GAME.Commands;

import java.io.IOException;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.rexlNico.GAME.Methodes.BlockFactory;
import de.rexlNico.GAME.Methodes.Var;

public class SetSpawner implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String lable, String[] args) {
		if(sender instanceof Player){
			Player p = (Player)sender;
			if(p.hasPermission(Var.perms+"setspawner")){
				if(args.length == 1){
					if(args[0].equalsIgnoreCase("bronze")){
						int ibronze;
						if(Var.cfg.get("bronze.zahl") == null){
							ibronze = 1;
						}else{
							ibronze = Var.cfg.getInt("bronze.zahl")+1;
						}
						
						BlockFactory.CreateConfigLocation(p.getLocation().getBlock().getLocation(), Var.cfg, Var.file, "bronze.spawn."+ibronze);
						Var.cfg.set("bronze.zahl", ibronze);
						try {
							Var.cfg.save(Var.file);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}else if(args[0].equalsIgnoreCase("Silber")){
						int ibronze;
						if(Var.cfg.get("silber.zahl") == null){
							ibronze = 1;
						}else{
							ibronze = Var.cfg.getInt("silber.zahl")+1;
						}
						
						BlockFactory.CreateConfigLocation(p.getLocation().getBlock().getLocation(), Var.cfg, Var.file, "silber.spawn."+ibronze);
						Var.cfg.set("silber.zahl", ibronze);
						try {
							Var.cfg.save(Var.file);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}else if(args[0].equalsIgnoreCase("Gold")){
						int ibronze;
						if(Var.cfg.get("gold.zahl") == null){
							ibronze = 1;
						}else{
							ibronze = Var.cfg.getInt("silber.zahl")+1;
						}
						
						BlockFactory.CreateConfigLocation(p.getLocation().getBlock().getLocation(), Var.cfg, Var.file, "gold.spawn."+ibronze);
						Var.cfg.set("gold.zahl", ibronze);
						try {
							Var.cfg.save(Var.file);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}else{
					p.sendMessage(Var.error+"setspawner <bronze/Silber/Gold>");
				}
			}else{
				p.sendMessage(Var.noperm);
			}
		}else{
			sender.sendMessage(Var.console);
		}
		return false;
	}

}
