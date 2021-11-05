package de.rexlNico.GAME.Methodes;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

import org.bukkit.Location;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

public class Var {

	public static File file = new File("plugins/PLUGINNAME/config.yml");
	public static YamlConfiguration cfg = YamlConfiguration.loadConfiguration(file);
	
	public static final String pr = "§8»§brexlNico.de§8« ● §7",
			noperm = pr+"§cDazu hast du keine rechte!",
			error = pr+"Bitte nutze §c/",
			console = "§4Das darf nur ein Spieler ausführen.",
			perms = "lom.",
			Mapname = "???";
	
	public static boolean canBuild = false,
						  pvp = false,
						  canDrop = false;
	
	public static boolean bedBlau = true;
	public static boolean bedGelb = true;
	public static boolean bedGrün = true;
	public static boolean bedRot = true;
	
	public static int MAX_PLAYERS_PER_TEAM = 1;
	
	public static ArrayList<Player> noTeam = new ArrayList<>();
	public static ArrayList<Player> Rot = new ArrayList<>();
	public static ArrayList<Player> Blau = new ArrayList<>();
	public static ArrayList<Player> Grün = new ArrayList<>();
	public static ArrayList<Player> Gelb = new ArrayList<>();
	public static ArrayList<Player> playing = new ArrayList<>();
	public static ArrayList<Player> spec = new ArrayList<>();
	
	public static ArrayList<Location> PlacedBlocks = new ArrayList<>();
	
	
	public static ArrayList<Location> gold = new ArrayList<>();
	public static ArrayList<Location> silber = new ArrayList<>();
	public static ArrayList<Location> bronze = new ArrayList<>();
	
	
			
	
}
