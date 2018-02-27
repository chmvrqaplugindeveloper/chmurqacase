package pl.itzchmurqa.chmurqacase;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import pl.itzchmurqa.chmurqacase.commands.SkrzynkaCommand;
import pl.itzchmurqa.chmurqacase.listener.BlockPlaceListener;

public class Main extends JavaPlugin{

	private static Main i;
	
	public void onEnable(){
		i = this;
		PluginManager pm = Bukkit.getPluginManager();
		pm.registerEvents(new BlockPlaceListener(), this);
		getCommand("skrzynka").setExecutor(new SkrzynkaCommand());
	}
	
	
	
	public static Main getInstance() {
		return i;
	}
}
