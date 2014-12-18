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
  
  private String announcePrefix = "" + ChatColor.DARK_GRAY + "[" + ChatColor.BLUE + ChatColor.BOLD +
      "ImperialRaffles" + ChatColor.DARK_GRAY + "]" + ChatColor.RESET + " ";
  
  public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
  {
    if (cmd.getName().equalsIgnoreCase("raffles"))
    {
      sender.sendMessage(announcePrefix + ChatColor.AQUA + "Raffles Plugin by " + 
          ChatColor.RED + "millenium200 " + ChatColor.AQUA + "for Imperial Factions Reborn!");
      sender.sendMessage(announcePrefix + ChatColor.AQUA + "Buy a raffle "
          + "ticket with " + ChatColor.GREEN + "/raffle buy " + ChatColor.AQUA + 
          "to get a chance to " + "win lots of cool prizes once every day!!");
      sender.sendMessage(announcePrefix + ChatColor.AQUA + "Tickets: $250, "
          + "Prizes include swords, armor, and money!");
      return true;
    }
    
    if (cmd.getName().equalsIgnoreCase("raffle")) 
    {
      if (args.length != 1)
      {
        //When onCommand() returns false, the help message associated with the
        //command is displayed.
        return false;
      } 
      else if (!(sender instanceof Player)) 
      { //Make sure the sender is a player.
        sender.sendMessage("Only players can buy raffle tickets!");
        return true;
      }
      else if (!(args[0].equalsIgnoreCase("buy")))
      {
        return false;
      }
      
      Player player = (Player) sender;
      
      int randomNumber;
      ItemStack itemstack;
      String prizeName;
      
      //randomNumber = (int)(Math.random() * 1000);
      randomNumber = (int) getRandomInteger(2);
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
      case 15:
      {
        // 10 Tokens in Future
        itemstack = new ItemStack(Material.EXP_BOTTLE, 48);
        prizeName = "48 Bottles of Enchanting";
        PlayerInventory inventory = player.getInventory();
        inventory.addItem(itemstack);
        break;
      }
      case 16:
      {
        // 25 Tokens in Future
        itemstack = new ItemStack(Material.EXP_BOTTLE, 48);
        prizeName = "48 Bottles of Enchanting";
        PlayerInventory inventory = player.getInventory();
        inventory.addItem(itemstack);
        break;
      }
      case 17:
      {
        // 20 Tokens in Future
        itemstack = new ItemStack(Material.EXP_BOTTLE, 48);
        prizeName = "48 Bottles of Enchanting";
        PlayerInventory inventory = player.getInventory();
        inventory.addItem(itemstack);
        break;
      }
      case 18:
      {
        // 10 Tokens in Future
        itemstack = new ItemStack(Material.EXP_BOTTLE, 48);
        prizeName = "48 Bottles of Enchanting";
        PlayerInventory inventory = player.getInventory();
        inventory.addItem(itemstack);
        break;
      }
      case 19:
      {
        // 10 Tokens in Future
        itemstack = new ItemStack(Material.EXP_BOTTLE, 48);
        prizeName = "48 Bottles of Enchanting";
        PlayerInventory inventory = player.getInventory();
        inventory.addItem(itemstack);
        break;
      }
      //  Cases 20 - 23: Add McMMO Credits // now just 20
      case 20:
      {
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "addcredits " + 
        player.getName() + " 30");
        prizeName = "30 McMMO Credits";
        break;
      }
      // TODO Cases 21 - 23: Add music discs yay
      case 21:
      {
        itemstack = new ItemStack(Material.RECORD_7, 1);
        prizeName = "Music disc!";
        PlayerInventory inventory = player.getInventory();
        inventory.addItem(itemstack);
        break;
      }
      case 22:
      {
        itemstack = new ItemStack(Material.RECORD_5, 1);
        prizeName = "Music disc!";
        PlayerInventory inventory = player.getInventory();
        inventory.addItem(itemstack);
        break;
      }
      case 23:
      {
        itemstack = new ItemStack(Material.RECORD_4, 1);
        prizeName = "Music disc!";
        PlayerInventory inventory = player.getInventory();
        inventory.addItem(itemstack);
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
        prizeName = "Blazerods!";
        PlayerInventory inventory = player.getInventory();
        inventory.addItem(itemstack);
        break;
      }
      case 28:
      {
        itemstack = new ItemStack(Material.BLAZE_ROD, 5);
        prizeName = "Blazerods!";
        PlayerInventory inventory = player.getInventory();
        inventory.addItem(itemstack);
        break;
      }
      case 29:
      {
        itemstack = new ItemStack(Material.BLAZE_ROD, 5);
        prizeName = "Blazerods!";
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
        short id = 92;
        itemstack = new ItemStack(Material.MONSTER_EGG, 1, id);
        prizeName = "Cow spawn egg!";
        PlayerInventory inventory = player.getInventory();
        inventory.addItem(itemstack);
        break;
      }
      case 36:
      {
        short id = 98;
        itemstack = new ItemStack(Material.MONSTER_EGG, 1, id);
        prizeName = "Ocelot spawn egg!";
        PlayerInventory inventory = player.getInventory();
        inventory.addItem(itemstack);
        break;
      }
      case 37:
      {
        short id = 66;
        itemstack = new ItemStack(Material.MONSTER_EGG, 1, id);
        prizeName = "Witch spawn egg!";
        PlayerInventory inventory = player.getInventory();
        inventory.addItem(itemstack);
        break;
      }
      case 38:
      {
        short id = 90;
        itemstack = new ItemStack(Material.MONSTER_EGG, 1, id);
        prizeName = "Pig spawn egg!";
        PlayerInventory inventory = player.getInventory();
        inventory.addItem(itemstack);
        break;
      }
      case 39:
      {
        short id = 94;
        itemstack = new ItemStack(Material.MONSTER_EGG, 1, id);
        prizeName = "Squid spawn egg!";
        PlayerInventory inventory = player.getInventory();
        inventory.addItem(itemstack);
        break;
      }
      case 40:
      {
        short id = 96;
        itemstack = new ItemStack(Material.MONSTER_EGG, 1, id);
        prizeName = "Mooshroom spawn egg!";
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
     
      Bukkit.broadcastMessage(announcePrefix + ChatColor.AQUA + player.getName() + 
          " has won " + ChatColor.BOLD + prizeName + ChatColor.AQUA + " from /raffles!");
      return true;
    }
    return false;
    
  }
  
  /** Generates a random double value with a set length */
  private static double getRandomInteger(int integerLength) {
    String randomInteger = "";
    char c = '0';
    for (int i = 0; i < integerLength; i++) {
      if (i == 0)
        c = getRandomCharacter('1', '9');
      else 
        c = getRandomCharacter('0', '9');
      randomInteger = randomInteger + c;
    }
    return Double.parseDouble(randomInteger);
  }
  
  /** Generate a random character between ch1 and ch2 */
  public static char getRandomCharacter(char ch1, char ch2) {
    return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
  }


}
