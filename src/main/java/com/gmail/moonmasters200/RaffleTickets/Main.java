package com.gmail.moonmasters200.RaffleTickets;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	@SuppressWarnings("deprecation")
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("raffles")) {
			sender.sendMessage(ChatColor.GOLD + "[Swag-Raffles] " + ChatColor.BLUE + "Raffles Plugin by " + ChatColor.RED + "millenium200 " +
			ChatColor.BLUE + "for Swag-Craft Factions Reborn!");
			sender.sendMessage(ChatColor.GOLD + "[Swag-Raffles] " + ChatColor.BLUE + "Buy a raffle ticket with " + ChatColor.GREEN +
			"/raffle buy " + ChatColor.BLUE + "to get a chance to " + "win lots of cool prizes!");
			sender.sendMessage(ChatColor.GOLD + "[Swag-Raffles] " + ChatColor.BLUE + "Tickets: $250, Prizes include swords, armor, and money!");
			return true;
		}
		
		if (cmd.getName().equalsIgnoreCase("raffle")) {
			if (args.length != 1) {
				//When onCommand() returns false, the help message associated with the
				//command is displayed.
				return false;
			} else if (!(sender instanceof Player)) { //Make sure the sender is a player.
				sender.sendMessage("Only players can buy raffle tickets!");
				return true;
			}
			
			Player player = (Player) sender;
			
			int randomNumber;
			ItemStack itemstack;
			String prizeName;
			
			randomNumber = (int)(Math.random() * 1000);
			randomNumber = 6;
			switch(randomNumber) {
			case 1: {
				itemstack = new ItemStack(Material.OBSIDIAN, 16);
				prizeName = "Obsidian";
				PlayerInventory inventory = player.getInventory();
				inventory.addItem(itemstack);
				break;
			}
			case 2: {
				itemstack = new ItemStack(Material.OBSIDIAN, 16);
				prizeName = "Obsidian";
				PlayerInventory inventory = player.getInventory();
				inventory.addItem(itemstack);
				break;
			}
			case 3: {
				itemstack = new ItemStack(Material.OBSIDIAN, 16);
				prizeName = "Obsidian";
				PlayerInventory inventory = player.getInventory();
				inventory.addItem(itemstack);
				break;
			}
			case 4: {
				itemstack = new ItemStack(Material.BEACON, 1);
				prizeName = "A Beacon!";
				PlayerInventory inventory = player.getInventory();
				inventory.addItem(itemstack);
				break;
			}
			case 5: {
				itemstack = new ItemStack(Material.ANVIL);
				prizeName = "Anvil";
				PlayerInventory inventory = player.getInventory();
				inventory.addItem(itemstack);
				break;
			}
			case 6: {
				Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "eco give " + 
				player.getName() + " 1000");
				prizeName = "$1000";
				break;
				// Add money
			}
			case 7: {
				Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "eco give " + 
				player.getName() + " 1000");
				prizeName = "$1000";
				break;
				// Add money
			}
			case 9: {
				Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "eco give " + 
				player.getName() + " 1000");
				prizeName = "$1000";
				break;
				// Add money
			}
			case 11: {
				Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "eco give " + 
				player.getName() + " 1000");
				prizeName = "$1000";
				break;
				// Add money
			}
			case 12: {
				Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "eco give " + 
				player.getName() + " 1000");
				prizeName = "$1000";
				break;
				// Add money
			}
			case 13: {
				Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "eco give " + 
				player.getName() + " 1000");
				prizeName = "$1000";
				break;
				// Add money
			}
			case 14: {
				Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "eco give " + 
				player.getName() + " 1000");
				prizeName = "$1000";
				break;
				// Add money
			}
			case 15: {
				// Add tokens
			}
			case 16: {
				// Add tokens
			}
			case 17: {
				// Add tokens
			}
			case 18: {
				// Add tokens
			}
			case 19: {
				// Add tokens
			}
			case 20: {
				Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "eco give " + 
				player.getName() + " 1000");
				prizeName = "$1000";
				break;
				// Add McMMO credits
			}
			case 21: {
				// Add McMMO credits
			}
			case 22: {
				// Add McMMO credits
			}
			case 23: {
				// Add McMMO credits
			}
			case 24: {
				itemstack = new ItemStack(Material.COAL_ORE, 16);
				prizeName = "Coal Ore";
				PlayerInventory inventory = player.getInventory();
				inventory.addItem(itemstack);
				break;
			}
			case 25: {
				itemstack = new ItemStack(Material.DIAMOND_ORE, 8);
				prizeName = "Diamond Ore";
				PlayerInventory inventory = player.getInventory();
				inventory.addItem(itemstack);
				break;
			}
			case 26: {
				itemstack = new ItemStack(Material.GLOWSTONE_DUST, 16);
				prizeName = "Glowstone!";
				PlayerInventory inventory = player.getInventory();
				inventory.addItem(itemstack);
				break;
			}
			case 27: {
			  
			}
			case 28: {
			  
			}
			case 29: {
			  
			}
			case 30: {
			  
			}
			case 31: {
			  
			}
			case 32: {
			  
			}
			case 33: {
			  
			}
			case 34: {
			  
			}
			case 35: {
			  
			}
			case 36: {
			  
			}
			case 37: {
			  
			}
			case 38: {
			  
			}
			case 39: {
			  
			}
			case 40: {
			  
			}
			case 41: {
			  
			}
			case 42: {
			  
			}
			case 43: {
			  
			}
			case 44: {
			  
			}
			case 45: {
			  
			}
			case 46: {
			  
			}
			case 47: {
			  
			}
			case 48: {
			  
			}
			case 49: {
			  
			}
			case 50: {
			  
			}
			
			
			case 10: {
				itemstack = new ItemStack(Material.DIAMOND_SWORD, 1);
				prizeName = "Diamond Sword";
				PlayerInventory inventory = player.getInventory();
				inventory.addItem(itemstack);
				break;
			}
			case 8: {
				itemstack = new ItemStack(Material.IRON_SWORD, 1);
				prizeName = "Iron Sword";
				PlayerInventory inventory = player.getInventory();
				inventory.addItem(itemstack);
				break;
			}
			default: {
				itemstack = new ItemStack(Material.EXP_BOTTLE, 32);
				prizeName = "Bottles of Enchanting";
				PlayerInventory inventory = player.getInventory();
				inventory.addItem(itemstack);
				break;
			}
			}
			
			for (Player p : Bukkit.getOnlinePlayers()) {
				p.sendMessage(ChatColor.GOLD + "[Swag-Raffles]" + ChatColor.AQUA + " " + player.getName() + " has won " + ChatColor.BOLD + prizeName + ChatColor.AQUA + " from /raffles!");
			}
			
			// This was the initial idea for making the raffles
			//int randomNumber;
			// This creates a random number from 0 --> 1000
			//randomNumber = (int)(Math.random() * 10000);
			//if (randomNumber <= 100 && randomNumber >= 0) {
				// 9.9% chance
			//}
			
			return true;
		}
		return false;
		
	}

}
