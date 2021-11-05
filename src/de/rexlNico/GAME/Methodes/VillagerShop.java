package de.rexlNico.GAME.Methodes;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.CreatureType;
import org.bukkit.entity.Villager;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class VillagerShop {

	public static Inventory Blöcke(){
		
		Inventory inv = Bukkit.createInventory(null, 9*6, "§6Shop");
		
		
		for(int i = 0; i < inv.getSize(); i++){
			ItemApi.setItem(inv, "", 15, Material.STAINED_GLASS_PANE, i);
		}
		
		ItemApi.setItem(inv, "§eBlöcke", 1, Material.STAINED_CLAY, 10);
		ItemApi.setItem(inv, "§eSchwerter", 0, Material.DIAMOND_SWORD, 11);
		ItemApi.setItem(inv, "§eBögen", 0, Material.BOW, 12);
		ItemApi.setItem(inv, "§eRüstung", 0, Material.IRON_CHESTPLATE, 13);
		ItemApi.setItem(inv, "§eSpitzhacken", 0, Material.WOOD_PICKAXE, 14);
		ItemApi.setItem(inv, "§eEssen", 0, Material.COOKED_BEEF, 15);
		ItemApi.setItem(inv, "§5Extras", 0, Material.EYE_OF_ENDER, 16);
		//37-43
		ItemApi.setItem(inv, "§eBlock1", 1, Material.STAINED_CLAY, 37);
		ItemApi.setItem(inv, "§eBlock2", 0, Material.ENDER_STONE, 38);
		ItemApi.setItem(inv, "§eBlock3", 0, Material.IRON_BLOCK, 39);
		ItemApi.setItem(inv, "§eBlock4", 0, Material.GLASS, 40);
		ItemApi.setItem(inv, "§eBlock5", 0, Material.NETHER_BRICK_STAIRS, 41);
		ItemApi.setItem(inv, "§eBlock6", 0, Material.CHEST, 42);
		ItemApi.setItem(inv, "§eBlock7", 0, Material.ENDER_CHEST, 43);
		
		

		
		
		
		return inv;
	}
	public static Inventory Schwerter(){
		
		Inventory inv = Bukkit.createInventory(null, 9*6, "§6Shop");
		
		for(int i = 0; i < inv.getSize(); i++){
			ItemApi.setItem(inv, "", 15, Material.STAINED_GLASS_PANE, i);
		}
		
		ItemApi.setItem(inv, "§eBlöcke", 1, Material.STAINED_CLAY, 10);
		ItemApi.setItem(inv, "§eSchwerter", 0, Material.DIAMOND_SWORD, 11);
		ItemApi.setItem(inv, "§eBögen", 0, Material.BOW, 12);
		ItemApi.setItem(inv, "§eRüstung", 0, Material.IRON_CHESTPLATE, 13);
		ItemApi.setItem(inv, "§eSpitzhacken", 0, Material.WOOD_PICKAXE, 14);
		ItemApi.setItem(inv, "§eEssen", 0, Material.COOKED_BEEF, 15);
		ItemApi.setItem(inv, "§5Extras", 0, Material.EYE_OF_ENDER, 16);
		//37-43
		//§4Schwert §5Lv.1
		
		ItemStack i1 = new ItemStack(Material.STICK);
		ItemMeta im1 = i1.getItemMeta();
		im1.setDisplayName("§6Stick");
		i1.setItemMeta(im1);
		i1.addUnsafeEnchantment(Enchantment.KNOCKBACK, 2);
		
		ItemStack i2 = new ItemStack(Material.GOLD_SWORD);
		ItemMeta im2 = i2.getItemMeta();
		im2.setDisplayName("§4Schwert §5Lv.1");
		i2.setItemMeta(im2);
		i2.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 1);
		
		ItemStack i3 = new ItemStack(Material.GOLD_SWORD);
		ItemMeta im3 = i3.getItemMeta();
		im3.setDisplayName("§4Schwert §5Lv.2");
		i3.setItemMeta(im3);
		i3.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 2);
		i3.addUnsafeEnchantment(Enchantment.DURABILITY, 1);
		
		ItemStack i34 = new ItemStack(Material.GOLD_SWORD);
		ItemMeta im34 = i34.getItemMeta();
		im34.setDisplayName("§4Schwert §5Lv.3");
		i34.setItemMeta(im34);
		i34.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 2);
		i34.addUnsafeEnchantment(Enchantment.DURABILITY, 2);
		
		ItemStack i345 = new ItemStack(Material.IRON_SWORD);
		ItemMeta im345 = i345.getItemMeta();
		im345.setDisplayName("§4Schwert §5Lv.4");
		i345.setItemMeta(im345);
		i345.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 1);
		
		ItemStack i3456 = new ItemStack(Material.DIAMOND_SWORD);
		ItemMeta im3456 = i3456.getItemMeta();
		im3456.setDisplayName("§4Schwert §5Lv.5");
		i3456.setItemMeta(im3456);
		i3456.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 1);
		i3456.addUnsafeEnchantment(Enchantment.KNOCKBACK, 2);
		
		ItemStack i3457 = new ItemStack(Material.DIAMOND_SWORD);
		ItemMeta im3457 = i3457.getItemMeta();
		im3457.setDisplayName("§4Schwert §5Lv.6");
		i3457.setItemMeta(im3457);
		i3457.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 1);
		i3457.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 1);
		
		inv.setItem(37, i1);
		inv.setItem(38, i2);
		inv.setItem(39, i3);
		inv.setItem(40, i34);
		inv.setItem(41, i345);
		inv.setItem(42, i3456);
		inv.setItem(43, i3457);


		
		
		
		return inv;
	}
	public static Inventory Bögen(){
		
		Inventory inv = Bukkit.createInventory(null, 9*6, "§6Shop");
		
		for(int i = 0; i < inv.getSize(); i++){
			ItemApi.setItem(inv, "", 15, Material.STAINED_GLASS_PANE, i);
		}
		
		ItemApi.setItem(inv, "§eBlöcke", 1, Material.STAINED_CLAY, 10);
		ItemApi.setItem(inv, "§eSchwerter", 0, Material.DIAMOND_SWORD, 11);
		ItemApi.setItem(inv, "§eBögen", 0, Material.BOW, 12);
		ItemApi.setItem(inv, "§eRüstung", 0, Material.IRON_CHESTPLATE, 13);
		ItemApi.setItem(inv, "§eSpitzhacken", 0, Material.WOOD_PICKAXE, 14);
		ItemApi.setItem(inv, "§eEssen", 0, Material.COOKED_BEEF, 15);
		ItemApi.setItem(inv, "§5Extras", 0, Material.EYE_OF_ENDER, 16);
		//37-43
		//§4Schwert §5Lv.1
		
		ItemStack i1 = new ItemStack(Material.BOW);
		ItemMeta im1 = i1.getItemMeta();
		im1.setDisplayName("§4Bogen §5Lv.1");
		i1.setItemMeta(im1);
		i1.addUnsafeEnchantment(Enchantment.ARROW_DAMAGE, 2);
		
		ItemStack i2 = new ItemStack(Material.GOLD_SWORD);
		ItemMeta im2 = i2.getItemMeta();
		im2.setDisplayName("§4Bogen §5Lv.2");
		i2.setItemMeta(im2);
		i2.addUnsafeEnchantment(Enchantment.ARROW_DAMAGE, 2);
		i2.addUnsafeEnchantment(Enchantment.ARROW_KNOCKBACK, 1);
		
		ItemStack i3 = new ItemStack(Material.GOLD_SWORD);
		ItemMeta im3 = i3.getItemMeta();
		im3.setDisplayName("§4Bogen §5Lv.3");
		i3.setItemMeta(im3);
		i3.addUnsafeEnchantment(Enchantment.ARROW_DAMAGE, 3);
		i3.addUnsafeEnchantment(Enchantment.ARROW_FIRE, 1);
		i3.addUnsafeEnchantment(Enchantment.ARROW_INFINITE, 1);
		
		inv.setItem(39, i1);
		inv.setItem(40, i2);
		inv.setItem(41, i3);
		
		inv.setItem(42, new ItemStack(Material.ARROW));


		
		
		
		return inv;
	}
	public static Inventory Rüstung(){
		
		Inventory inv = Bukkit.createInventory(null, 9*6, "§6Shop");
		
		for(int i = 0; i < inv.getSize(); i++){
			ItemApi.setItem(inv, "", 15, Material.STAINED_GLASS_PANE, i);
		}
		
		ItemApi.setItem(inv, "§eBlöcke", 1, Material.STAINED_CLAY, 10);
		ItemApi.setItem(inv, "§eSchwerter", 0, Material.DIAMOND_SWORD, 11);
		ItemApi.setItem(inv, "§eBögen", 0, Material.BOW, 12);
		ItemApi.setItem(inv, "§eRüstung", 0, Material.IRON_CHESTPLATE, 13);
		ItemApi.setItem(inv, "§eSpitzhacken", 0, Material.WOOD_PICKAXE, 14);
		ItemApi.setItem(inv, "§eEssen", 0, Material.COOKED_BEEF, 15);
		ItemApi.setItem(inv, "§5Extras", 0, Material.EYE_OF_ENDER, 16);
		//37-43
		//§4Schwert §5Lv.1
		
		ItemApi.setItem(inv, "§4Leder Rüstung", 0, Material.LEATHER_HELMET, 37);
		ItemApi.setItem(inv, "§4Leder Rüstung", 0, Material.LEATHER_CHESTPLATE, 38);
		ItemApi.setItem(inv, "§4Leder Rüstung", 0, Material.LEATHER_LEGGINGS, 39);
		ItemApi.setItem(inv, "§4Leder Rüstung", 0, Material.LEATHER_BOOTS, 40);
		
		ItemStack i1 = new ItemStack(Material.CHAINMAIL_CHESTPLATE);
		ItemMeta im1 = i1.getItemMeta();
		im1.setDisplayName("§4Brust §5Lv.1");
		i1.setItemMeta(im1);
		i1.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
		
		ItemStack i2 = new ItemStack(Material.CHAINMAIL_CHESTPLATE);
		ItemMeta im2 = i2.getItemMeta();
		im2.setDisplayName("§4Brust §5Lv.2");
		i2.setItemMeta(im2);
		i2.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
		
		ItemStack i3 = new ItemStack(Material.CHAINMAIL_CHESTPLATE);
		ItemMeta im3 = i3.getItemMeta();
		im3.setDisplayName("§4Brust §5Lv.3");
		i3.setItemMeta(im3);
		i3.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
		
		inv.setItem(41, i1);
		inv.setItem(42, i2);
		inv.setItem(43, i3);

		return inv;
	}
	public static Inventory Spitzhacken(){
	
	Inventory inv = Bukkit.createInventory(null, 9*6, "§6Shop");
	
	for(int i = 0; i < inv.getSize(); i++){
		ItemApi.setItem(inv, "", 15, Material.STAINED_GLASS_PANE, i);
	}
	
	ItemApi.setItem(inv, "§eBlöcke", 1, Material.STAINED_CLAY, 10);
	ItemApi.setItem(inv, "§eSchwerter", 0, Material.DIAMOND_SWORD, 11);
	ItemApi.setItem(inv, "§eBögen", 0, Material.BOW, 12);
	ItemApi.setItem(inv, "§eRüstung", 0, Material.IRON_CHESTPLATE, 13);
	ItemApi.setItem(inv, "§eSpitzhacken", 0, Material.WOOD_PICKAXE, 14);
	ItemApi.setItem(inv, "§eEssen", 0, Material.COOKED_BEEF, 15);
	ItemApi.setItem(inv, "§5Extras", 0, Material.EYE_OF_ENDER, 16);
	//37-43
	//§4Schwert §5Lv.1
	
	ItemApi.setItem(inv, "§4Spitzhacke §5Lv.1", 0, Material.WOOD_PICKAXE, 38);
	ItemApi.setItem(inv, "§4Spitzhacke §5Lv.2", 0, Material.GOLD_PICKAXE, 39);
	ItemApi.setItem(inv, "§4Spitzhacke §5Lv.3", 0, Material.IRON_PICKAXE, 41);
	ItemApi.setItem(inv, "§4Spitzhacke §5Lv.4", 0, Material.DIAMOND_PICKAXE, 42);

	return inv;
}
	public static Inventory Essen(){
		
	Inventory inv = Bukkit.createInventory(null, 9*6, "§6Shop");
	
	for(int i = 0; i < inv.getSize(); i++){
		ItemApi.setItem(inv, "", 15, Material.STAINED_GLASS_PANE, i);
	}
	
	ItemApi.setItem(inv, "§eBlöcke", 1, Material.STAINED_CLAY, 10);
	ItemApi.setItem(inv, "§eSchwerter", 0, Material.DIAMOND_SWORD, 11);
	ItemApi.setItem(inv, "§eBögen", 0, Material.BOW, 12);
	ItemApi.setItem(inv, "§eRüstung", 0, Material.IRON_CHESTPLATE, 13);
	ItemApi.setItem(inv, "§eSpitzhacken", 0, Material.WOOD_PICKAXE, 14);
	ItemApi.setItem(inv, "§eEssen", 0, Material.COOKED_BEEF, 15);
	ItemApi.setItem(inv, "§5Extras", 0, Material.EYE_OF_ENDER, 16);
	//37-43
	//§4Schwert §5Lv.1
	
	ItemApi.setItem(inv, "§6Apfel", 0, Material.APPLE, 38);
	ItemApi.setItem(inv, "§6Steak", 0, Material.COOKED_BEEF, 39);
	ItemApi.setItem(inv, "§6Kuchen", 0, Material.CAKE, 41);
	ItemApi.setItem(inv, "§6§lGoldapfel", 0, Material.GOLDEN_APPLE, 42);

	return inv;
}
	public static Inventory Extras(){
		
		Inventory inv = Bukkit.createInventory(null, 9*6, "§6Shop");
		
		for(int i = 0; i < inv.getSize(); i++){
			ItemApi.setItem(inv, "", 15, Material.STAINED_GLASS_PANE, i);
		}
		
		ItemApi.setItem(inv, "§eBlöcke", 1, Material.STAINED_CLAY, 10);
		ItemApi.setItem(inv, "§eSchwerter", 0, Material.DIAMOND_SWORD, 11);
		ItemApi.setItem(inv, "§eBögen", 0, Material.BOW, 12);
		ItemApi.setItem(inv, "§eRüstung", 0, Material.IRON_CHESTPLATE, 13);
		ItemApi.setItem(inv, "§eSpitzhacken", 0, Material.WOOD_PICKAXE, 14);
		ItemApi.setItem(inv, "§eEssen", 0, Material.COOKED_BEEF, 15);
		ItemApi.setItem(inv, "§5Extras", 0, Material.ENDER_PEARL, 16);
		//37-43
		//§4Schwert §5Lv.1
		
		ItemApi.setItem(inv, "§6Rettungplatform", 0, Material.BLAZE_ROD, 37);
		ItemApi.setItem(inv, "§2Enderperle", 0, Material.ENDER_PEARL, 38);
		ItemApi.setItem(inv, "§cBackport", 0, Material.EYE_OF_ENDER, 39);
		
		ItemApi.setItem(inv, "§4TnT", 0, Material.TNT, 41);
		ItemApi.setItem(inv, "§8Feuerzeug", 0, Material.FLINT_AND_STEEL, 42);
		ItemApi.setItem(inv, "§aAngel", 0, Material.FISHING_ROD, 43);
		
		

		return inv;
	}
	public static Inventory Start(){
		
		Inventory inv = Bukkit.createInventory(null, 9*6, "§6Shop");
		
		for(int i = 0; i < inv.getSize(); i++){
			ItemApi.setItem(inv, "", 15, Material.STAINED_GLASS_PANE, i);
		}
		ItemApi.setItem(inv, "§eBlöcke", 1, Material.STAINED_CLAY, 10);
		ItemApi.setItem(inv, "§eSchwerter", 0, Material.DIAMOND_SWORD, 11);
		ItemApi.setItem(inv, "§eBögen", 0, Material.BOW, 12);
		ItemApi.setItem(inv, "§eRüstung", 0, Material.IRON_CHESTPLATE, 13);
		ItemApi.setItem(inv, "§eSpitzhacken", 0, Material.WOOD_PICKAXE, 14);
		ItemApi.setItem(inv, "§eEssen", 0, Material.COOKED_BEEF, 15);
		ItemApi.setItem(inv, "§5Extras", 0, Material.ENDER_PEARL, 16);
		return inv;
	}
	public static void SpawnShop(){
		Location loc1 = BlockFactory.getConfigLocation("Shop.Rot", Var.cfg);
		Location loc2 = BlockFactory.getConfigLocation("Shop.Blau", Var.cfg);
		Location loc3 = BlockFactory.getConfigLocation("Shop.Gelb", Var.cfg);
		Location loc4 = BlockFactory.getConfigLocation("Shop.Grün", Var.cfg);
		
		
		
		Villager v1 = (Villager) loc1.getWorld().spawnCreature(loc1, CreatureType.VILLAGER);
		Villager v2 =  (Villager) loc2.getWorld().spawnCreature(loc2, CreatureType.VILLAGER);
		Villager v3 = (Villager) loc3.getWorld().spawnCreature(loc3, CreatureType.VILLAGER);
		Villager v4 = (Villager) loc4.getWorld().spawnCreature(loc4, CreatureType.VILLAGER);
		
		v1.setCustomName("§eShop");
		v1.setCustomNameVisible(true);
		v1.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 356000, 356000));
		
		v2.setCustomName("§eShop");
		v2.setCustomNameVisible(true);
		v2.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 356000, 356000));
		
		v3.setCustomName("§eShop");
		v3.setCustomNameVisible(true);
		v3.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 356000, 356000));
		
		v4.setCustomName("§eShop");
		v4.setCustomNameVisible(true);
		v4.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 356000, 356000));
		
	}
}
