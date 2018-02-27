package pl.itzchmurqa.chmurqacase.util;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class ChatUtil {
	public static String Color(String m){
		if(m == null) {
			return "";
		}
		return ChatColor.translateAlternateColorCodes('&', m);
	}



	public static String[] Color(String[] m) {
		String[] s = m;
		for(int i = 0 ; i <s.length ; i++) {
			s[i] = Color(s[i]);
		}
		return s;
	}
	
	public static void sendB(String m) {
		Bukkit.getServer().broadcastMessage(Color(m));	
	}
	
	
	
	public static void sendM(CommandSender p, String m) {
		p.sendMessage(Color(m));	
	}



	public static void sendM(CommandSender sender, String m) {
		sender.sendMessage(Color(m));
		
	}
	
}
