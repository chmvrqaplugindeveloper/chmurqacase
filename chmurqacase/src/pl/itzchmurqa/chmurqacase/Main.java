package pl.itzchmurqa.chmurqacase;

import java.io.File;
import java.io.IOException;
import java.util.List;
 
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import pl.itzchmurqa.chmurqacase.commands.SkrzynkaCommand;
import pl.itzchmurqa.chmurqacase.listener.BlockPlaceListener;

public class Main extends JavaPlugin{
	File newConfig;
	FileConfiguration newConfigz;
	private static Main i;
	
	public void onEnable(){
		newConfig = new File(getDataFolder(), "config.yml");
		newConfigz = YamlConfiguration.loadConfiguration(newConfig);
		saveNewConfig();
		i = this;
		PluginManager pm = Bukkit.getPluginManager();
		pm.registerEvents(new BlockPlaceListener(), this);
		getCommand("skrzynka").setExecutor(new SkrzynkaCommand());
	}
	public void saveNewConfig(){
		try{
		newConfigz.save(newConfig);
		 
		}catch(Exception e){
		e.printStackTrace();
		}
	}
	
	public void onDisable(){
		 
	}
	
	
	public static Main getInstance() {
		return i;
	}
}
