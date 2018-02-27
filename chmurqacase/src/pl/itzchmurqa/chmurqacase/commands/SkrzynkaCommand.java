package pl.itzchmurqa.chmurqacase.commands;

import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import pl.itzchmurqa.chmurqacase.itembuilder.ItemBuilder;
import pl.itzchmurqa.harrypotter.util.ChatUtil;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;

public class SkrzynkaCommand implements CommandExecutor {
	@Override
	public boolean onCommand(CommandSender sender, Command c, String s, String[] args) {
		if(!sender.hasPermission("chmurqacase")) {
			ChatUtil.sendM(sender, "&4&lchmurqacase: &cNie masz uprawnien do tej komendy");
			return false;
		}
		if(args.length < 2) {
			ChatUtil.sendM(sender, "&4&lchmurqacase: &2Poprawne uzycie: /skrzynka <all|gracz> <ilosc|nick> <puste ilosc>");
			return false;
		}
		if(args[0].equalsIgnoreCase("all")) {
			int i = Integer.parseInt(args[1]);
			if(i <= 0) {
				ChatUtil.sendM(sender, "&4&lchmurqacase: &cNie mozna dac 0 skrzynek lub mniej.");
				return false;
			}
			ItemStack item = new ItemBuilder(Material.CHEST, i).setName(ChatUtil.Color("&6CASE")).toItemStack();
			for(Player p : Bukkit.getOnlinePlayers()) {
				p.getInventory().addItem(item);
			}
			ChatUtil.sendB("&4&lchmurqacase: &6Gracz "+sender.getName()+" rozdal case x"+ i);
			return false;
		}
		if(args[0].equalsIgnoreCase("gracz"))
		{
			Player p = Bukkit.getPlayer(args[1]);
			if(p != null) {
				int i = 1;
				if(args.length < 3) {
					i = Integer.parseInt(args[2]);
				}
					
				if(i <= 0) {
					ChatUtil.sendM(sender, "&4&lchmurqacase: &cNie mozna dac 0 skrzynek lub mniej.");
					return false;
				}
				ItemStack item = new ItemBuilder(Material.CHEST, i).setName(ChatUtil.Color("&6CASE")).toItemStack();
				p.getInventory().addItem(item);
				ChatUtil.sendM(p, "&4&lchmurqacase: &6Gracz "+sender.getName()+" dal ci case x"+ i);
				ChatUtil.sendM(sender, "&4&lchmurqacase: &6Dales graczowi "+p.getName()+" case x"+ i);
			}
			else
			{
				ChatUtil.sendM(sender, "&4&lchmurqacase: &cGracz jest offline");
				return false;
			}
		}
	
		return false;
	}
}
