package com.gmail.moonmasters200.RaffleTickets;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.enchantments.EnchantmentWrapper;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin
{
	
	@SuppressWarnings("deprecation")
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
	{
		if (cmd.getName().equalsIgnoreCase("raffles"))
		{
			sender.sendMessage(ChatColor.GOLD + "[Swag-Raffles] " + ChatColor.BLUE + "Raffles Plugin by " + ChatColor.RED + "millenium200 " +
			ChatColor.BLUE + "for Swag-Craft Factions Reborn!");
			sender.sendMessage(ChatColor.GOLD + "[Swag-Raffles] " + ChatColor.BLUE + "Buy a raffle ticket with " + ChatColor.GREEN +
			"/raffle buy " + ChatColor.BLUE + "to get a chance to " + "win lots of cool prizes!");
			sender.sendMessage(ChatColor.GOLD + "[Swag-Raffles] " + ChatColor.BLUE + "Tickets: $250, Prizes include swords, armor, and money!");
			return true;
		}
		
		if (cmd.getName().equalsIgnoreCase("raffle")) 
		{
			if (args.length != 1)
			{
				//When onCommand() returns false, the help message associated with the
				//command is displayed.
				return false;
			} else if (!(sender instanceof Player)) 
			{ //Make sure the sender is a player.
				sender.sendMessage("Only players can buy raffle tickets!");
				return true;
			}
			
			Player player = (Player) sender;
			
			int randomNumber;
			ItemStack itemstack;
			String prizeName = null;
			
			randomNumber = (int)(Math.random() * 1000);
			randomNumber = 6;
			switch(randomNumber) 
			{
			case 1:
			{
				itemstack = new ItemStack(Material.OBSIDIAN, 16);
				prizeName = "Obsidian";
				PlayerInventory inventory = player.getInventory();
				inventory.addItem(itemstack);
				break;
			}
			case 2:
			{
				itemstack = new ItemStack(Material.OBSIDIAN, 16);
				prizeName = "Obsidian";
				PlayerInventory inventory = player.getInventory();
				inventory.addItem(itemstack);
				break;
			}
			case 3:
			{
				itemstack = new ItemStack(Material.OBSIDIAN, 16);
				prizeName = "Obsidian";
				PlayerInventory inventory = player.getInventory();
				inventory.addItem(itemstack);
				break;
			}
			case 4:
			{
				itemstack = new ItemStack(Material.BEACON, 1);
				prizeName = "A Beacon!";
				PlayerInventory inventory = player.getInventory();
				inventory.addItem(itemstack);
				break;
			}
			case 5:
			{
				itemstack = new ItemStack(Material.ANVIL);
				prizeName = "Anvil";
				PlayerInventory inventory = player.getInventory();
				inventory.addItem(itemstack);
				break;
			}
			case 6:
			{
				Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "eco give " + 
				player.getName() + " 1000");
				prizeName = "$1000";
				break;
			}
			case 7:
			{
				Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "eco give " + 
				player.getName() + " 1000");
				prizeName = "$1000";
				break;
			}
	    case 8:
	    {
	      itemstack = new ItemStack(Material.IRON_SWORD, 1);
	      prizeName = "Iron Sword";
	      PlayerInventory inventory = player.getInventory();
	      inventory.addItem(itemstack);
	      break;
	    }
			case 9:
			{
				Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "eco give " + 
				player.getName() + " 1000");
				prizeName = "$1000";
				break;
			}
      case 10:
      {
        itemstack = new ItemStack(Material.DIAMOND_SWORD, 1);
        prizeName = "Diamond Sword";
        PlayerInventory inventory = player.getInventory();
        inventory.addItem(itemstack);
        break;
      }
			case 11:
			{
				Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "eco give " + 
				player.getName() + " 1000");
				prizeName = "$1000";
				break;
			}
			case 12:
			{
				Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "eco give " + 
				player.getName() + " 1000");
				prizeName = "$1000";
				break;
			}
			case 13:
			{
				Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "eco give " + 
				player.getName() + " 1000");
				prizeName = "$1000";
				break;
			}
			case 14:
			{
				Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "eco give " + 
				player.getName() + " 1000");
				prizeName = "$1000";
				break;
			}
			// TODO Check that the tokens command works here.
			case 15:
			{
	      Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "tokens give " + 
	      player.getName() + " 100");
	      prizeName = "$100 Tokens!";
			  break;
			}
			case 16:
			{
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "tokens give " + 
        player.getName() + " 50");
        prizeName = "$50 Tokens!";
        break;
			}
			case 17:
			{
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "tokens give " + 
        player.getName() + " 25");
        prizeName = "$25 Tokens!";
        break;
			}
			case 18:
			{
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "tokens give " + 
        player.getName() + " 10");
        prizeName = "$100 Tokens!";
        break;
			}
			case 19:
			{
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "tokens give " + 
        player.getName() + " 10");
        prizeName = "$10 Tokens!";
        break;
			}
			// TODO Cases 20 - 23: Add McMMO Credits
			case 20:
			{
				Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "eco give " + 
				player.getName() + " 1000");
				prizeName = "$1000";
				break;
			}
			case 21:
			{
			  break;
			}
			case 22:
			{
			  break;
			}
			case 23:
			{
			  break;
			}
			case 24:
			{
				itemstack = new ItemStack(Material.COAL_ORE, 16);
				prizeName = "Coal Ore";
				PlayerInventory inventory = player.getInventory();
				inventory.addItem(itemstack);
				break;
			}
			case 25:
			{
				itemstack = new ItemStack(Material.DIAMOND_ORE, 8);
				prizeName = "Diamond Ore";
				PlayerInventory inventory = player.getInventory();
				inventory.addItem(itemstack);
				break;
			}
			case 26:
			{
				itemstack = new ItemStack(Material.GLOWSTONE_DUST, 16);
				prizeName = "Glowstone!";
				PlayerInventory inventory = player.getInventory();
				inventory.addItem(itemstack);
				break;
			}
			case 27:
			{
			  itemstack = new ItemStack(Material.BLAZE_ROD, 5);
			  prizeName = "Blazkerods!";
			  PlayerInventory inventory = player.getInventory();
			  inventory.addItem(itemstack);
			  break;
			}
			case 28:
			{
        itemstack = new ItemStack(Material.BLAZE_ROD, 5);
        prizeName = "Blazkerods!";
        PlayerInventory inventory = player.getInventory();
        inventory.addItem(itemstack);
        break;
			}
			case 29:
			{
        itemstack = new ItemStack(Material.BLAZE_ROD, 5);
        prizeName = "Blazkerods!";
        PlayerInventory inventory = player.getInventory();
        inventory.addItem(itemstack);
        break;
			}
			case 30:
			{
			  itemstack = new ItemStack(Material.CHAINMAIL_BOOTS, 1);
			  prizeName = "Chainmail Boots!";
			  PlayerInventory inventory = player.getInventory();
			  inventory.addItem(itemstack);
			  break;
			}
			case 31:
			{
			  itemstack = new ItemStack(Material.CHAINMAIL_CHESTPLATE, 1);
			  prizeName = "Chainmail Chestplate!";
			  PlayerInventory inventory = player.getInventory();
			  inventory.addItem(itemstack);
			  break;
			}
			case 32:
			{
			  itemstack = new ItemStack(Material.CHAINMAIL_HELMET, 1);
			  prizeName = "Chainmail Helmet!";
			  PlayerInventory inventory = player.getInventory();
			  inventory.addItem(itemstack);
			  break;
			}
			case 33:
			{
			  itemstack = new ItemStack(Material.CHAINMAIL_LEGGINGS, 1);
			  prizeName = "Chainmail Leggings!";
			  PlayerInventory inventory = player.getInventory();
			  inventory.addItem(itemstack);
			  break;
			}
			case 34:
			{
			  itemstack = new ItemStack(Material.CAKE, 1);
			  prizeName = "Cake";
			  PlayerInventory inventory = player.getInventory();
			  inventory.addItem(itemstack);
			  break;
			}
			case 35:
			{
			  itemstack = new ItemStack(Material.DIAMOND_SWORD, 1);
			  Enchantment Sharpness = new EnchantmentWrapper(16);
			  itemstack.addEnchantment(Sharpness, 4);
			  prizeName = "Sharp Diamond Sword!";
			  PlayerInventory inventory = player.getInventory();
			  inventory.addItem(itemstack);
			  break;
			}
			case 36:
			{
        itemstack = new ItemStack(Material.DIAMOND_SWORD, 1);
        Enchantment Sharpness = new EnchantmentWrapper(16);
        itemstack.addEnchantment(Sharpness, 4);
        prizeName = "Sharp Diamond Sword!";
        PlayerInventory inventory = player.getInventory();
        inventory.addItem(itemstack);
        break;
			}
			case 37:
			{
        itemstack = new ItemStack(Material.DIAMOND_SWORD, 1);
        Enchantment Sharpness = new EnchantmentWrapper(16);
        itemstack.addEnchantment(Sharpness, 4);
        prizeName = "Sharp Diamond Sword!";
        PlayerInventory inventory = player.getInventory();
        inventory.addItem(itemstack);
        break;
			}
			case 38:
			{
        itemstack = new ItemStack(Material.DIAMOND_AXE, 1);
        Enchantment Sharpness = new EnchantmentWrapper(16);
        itemstack.addEnchantment(Sharpness, 3);
        prizeName = "Sharp Diamond Axe!";
        PlayerInventory inventory = player.getInventory();
        inventory.addItem(itemstack);
        break;
			}
			case 39:
			{
        itemstack = new ItemStack(Material.DIAMOND_AXE, 1);
        Enchantment Sharpness = new EnchantmentWrapper(16);
        itemstack.addEnchantment(Sharpness, 3);
        prizeName = "Sharp Diamond Axe!";
        PlayerInventory inventory = player.getInventory();
        inventory.addItem(itemstack);
        break;
			}
			case 40:
			{
        itemstack = new ItemStack(Material.DIAMOND_AXE, 1);
        Enchantment Sharpness = new EnchantmentWrapper(16);
        itemstack.addEnchantment(Sharpness, 3);
        prizeName = "Sharp Diamond Axe!";
        PlayerInventory inventory = player.getInventory();
        inventory.addItem(itemstack);
        break;
			}
			case 41:
			{
        itemstack = new ItemStack(Material.DIAMOND_AXE, 1);
        Enchantment Sharpness = new EnchantmentWrapper(16);
        itemstack.addEnchantment(Sharpness, 3);
        prizeName = "Sharp Diamond Axe!";
        PlayerInventory inventory = player.getInventory();
        inventory.addItem(itemstack);
        break;
			}
			case 42:
			{
			  itemstack = new ItemStack(Material.TNT, 16);
			  prizeName = "16 TNT";
			  PlayerInventory inventory = player.getInventory();
			  inventory.addItem(itemstack);
			  break;
			}
			case 43:
			{
        itemstack = new ItemStack(Material.TNT, 16);
        prizeName = "16 TNT";
        PlayerInventory inventory = player.getInventory();
        inventory.addItem(itemstack);
			  break;
			}
			case 44:
			{
        itemstack = new ItemStack(Material.TNT, 16);
        prizeName = "16 TNT";
        PlayerInventory inventory = player.getInventory();
        inventory.addItem(itemstack);
			  break;
			}
			case 45:
			{
        itemstack = new ItemStack(Material.TNT, 16);
        prizeName = "16 TNT";
        PlayerInventory inventory = player.getInventory();
        inventory.addItem(itemstack);
			  break;
			}
			case 46:
			{
        itemstack = new ItemStack(Material.TNT, 16);
        prizeName = "16 TNT";
        PlayerInventory inventory = player.getInventory();
        inventory.addItem(itemstack);
			  break;
			}
			case 47:
			{
        itemstack = new ItemStack(Material.TNT, 16);
        prizeName = "16 TNT";
        PlayerInventory inventory = player.getInventory();
        inventory.addItem(itemstack);
			  break;
			}
			case 48:
			{
        itemstack = new ItemStack(Material.TNT, 16);
        prizeName = "16 TNT";
        PlayerInventory inventory = player.getInventory();
        inventory.addItem(itemstack);
			  break;
			}
			case 49:
			{
        itemstack = new ItemStack(Material.TNT, 16);
        prizeName = "16 TNT";
        PlayerInventory inventory = player.getInventory();
        inventory.addItem(itemstack);
			  break;
			}
			case 50:
			{
        itemstack = new ItemStack(Material.TNT, 16);
        prizeName = "16 TNT";
        PlayerInventory inventory = player.getInventory();
        inventory.addItem(itemstack);
			  break;
			}
			default:
			{
				itemstack = new ItemStack(Material.EXP_BOTTLE, 32);
				prizeName = "Bottles of Enchanting";
				PlayerInventory inventory = player.getInventory();
				inventory.addItem(itemstack);
				break;
			}
			}
		 
			for (Player p : Bukkit.getOnlinePlayers())
			{
				p.sendMessage(ChatColor.GOLD + "[Swag-Raffles]" + ChatColor.AQUA + " "
				    + "" + player.getName() + " has won " + ChatColor.BOLD + 
				    prizeName + ChatColor.AQUA + " from /raffles!");
			}			
			return true;
		}
		return false;
		
	}

}
