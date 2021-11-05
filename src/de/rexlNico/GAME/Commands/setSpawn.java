package de.rexlNico.GAME.Commands;

import java.io.File;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import de.rexlNico.GAME.Methodes.BlockFactory;
import de.rexlNico.GAME.Methodes.Factory;
import de.rexlNico.GAME.Methodes.Var;

public class setSpawn implements CommandExecutor{
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(sender instanceof Player){
			Player p = (Player)sender;
			if(p.hasPermission(Var.perms+"set")){
				if(args.length == 1){
					if(args[0].equalsIgnoreCase("Lobby")){
						Factory.CreateConfigLocation(p.getLocation(), Var.cfg, Var.file, "Spawn.Lobby");
						p.sendMessage(Var.pr+"Du hast den Spawn für die §eLobby §7gesetzt.");
					}else if(args[0].equalsIgnoreCase("Spec")){
						Factory.CreateConfigLocation(p.getLocation(), Var.cfg, Var.file, "Spawn.Spec");
						p.sendMessage(Var.pr+"Du hast den Spawn für die §eSpectator §7gesetzt.");	
					}else if(args[0].equalsIgnoreCase("Rot")){
						Factory.CreateConfigLocation(p.getLocation(), Var.cfg, Var.file, "Spawn.Rot");
						p.sendMessage(Var.pr+"Du hast den Spawn für die §4Rot §7gesetzt.");	
					}else if(args[0].equalsIgnoreCase("Blau")){
						Factory.CreateConfigLocation(p.getLocation(), Var.cfg, Var.file, "Spawn.Blau");
						p.sendMessage(Var.pr+"Du hast den Spawn für die §1Blau §7gesetzt.");	
					}else if(args[0].equalsIgnoreCase("Grün")){
						Factory.CreateConfigLocation(p.getLocation(), Var.cfg, Var.file, "Spawn.Grün");
						p.sendMessage(Var.pr+"Du hast den Spawn für die §aGrün §7gesetzt.");	
					}else if(args[0].equalsIgnoreCase("Gelb")){
						Factory.CreateConfigLocation(p.getLocation(), Var.cfg, Var.file, "Spawn.Gelb");
						p.sendMessage(Var.pr+"Du hast den Spawn für die §eGelb §7gesetzt.");	
					}else{
						p.sendMessage(Var.error+"set <Lobby/Spec/Rot/Blau/Grün/Rot>");
					}
				}else if(args.length == 2){
					if(args[0].equalsIgnoreCase("Bed")){
						if(args[1].equalsIgnoreCase("Rot")){
							BlockFactory.CreateConfigLocation(p.getLocation().getBlock().getLocation(), Var.cfg, Var.file, "Bed.Rot");
							p.sendMessage(Var.pr+"Du hast das Bett für §4Rot §7gesetzt.");	
						}else if(args[1].equalsIgnoreCase("Gelb")){
							BlockFactory.CreateConfigLocation(p.getLocation().getBlock().getLocation(), Var.cfg, Var.file, "Bed.Gelb");
							p.sendMessage(Var.pr+"Du hast das Bett für §eGelb §7gesetzt.");	
						}else if(args[1].equalsIgnoreCase("Grün")){
							BlockFactory.CreateConfigLocation(p.getLocation().getBlock().getLocation(), Var.cfg, Var.file, "Bed.Grün");
							p.sendMessage(Var.pr+"Du hast das Bett für §aGrün §7gesetzt.");	
						}else if(args[1].equalsIgnoreCase("Blau")){
							BlockFactory.CreateConfigLocation(p.getLocation().getBlock().getLocation(), Var.cfg, Var.file, "Bed.Blau");
							p.sendMessage(Var.pr+"Du hast das Bett für §1Blau §7gesetzt.");	
						}else{
							p.sendMessage(Var.error+"set <Bed> [Rot/Blau/Grün/Gelb]");
						}
					}else if(args[0].equalsIgnoreCase("shop")){
						if(args[1].equalsIgnoreCase("Rot")){
							BlockFactory.CreateConfigLocation(p.getLocation().getBlock().getLocation(), Var.cfg, Var.file, "Shop.Rot");
							p.sendMessage(Var.pr+"Du hast den Shop für §4Rot §7gesetzt.");	
						}else if(args[1].equalsIgnoreCase("Gelb")){
							BlockFactory.CreateConfigLocation(p.getLocation().getBlock().getLocation(), Var.cfg, Var.file, "Shop.Gelb");
							p.sendMessage(Var.pr+"Du hast den Shop für §eGelb §7gesetzt.");	
						}else if(args[1].equalsIgnoreCase("Grün")){
							BlockFactory.CreateConfigLocation(p.getLocation().getBlock().getLocation(), Var.cfg, Var.file, "Shop.Grün");
							p.sendMessage(Var.pr+"Du hast den Shop für §aGrün §7gesetzt.");	
						}else if(args[1].equalsIgnoreCase("Blau")){
							BlockFactory.CreateConfigLocation(p.getLocation().getBlock().getLocation(), Var.cfg, Var.file, "Shop.Blau");
							p.sendMessage(Var.pr+"Du hast den Shop für §1Blau §7gesetzt.");	
						}else{
							p.sendMessage(Var.error+"set <Shop> [Rot/Blau/Grün/Gelb]");
						}
					}else{
						p.sendMessage(Var.error+"set <Bed/Shop> [Rot/Blau/Grün/Gelb]");
					}
				}else{
					p.sendMessage(Var.error+"set [<Lobby/Spec/Rot/Blau/Grün/Rot>/<Bed/shop>] [Rot/Blau/Grün/Gelb]");
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
