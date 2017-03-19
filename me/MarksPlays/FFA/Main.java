package me.MarksPlays.FFA;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import me.MarksPlays.FFA.Listener.JoinQuitListener;


public class Main extends JavaPlugin {
	
	public static Main instance;
	
	@Override
	public void onEnable() {
		getServer().getConsoleSender().sendMessage("§7[§aF§bF§9A§7] §3Coded by MarksPlays");
		instance = this;
		PluginManager pm = Bukkit.getPluginManager();
		pm.registerEvents(new JoinQuitListener(), this);
		
	}
	
	public static Main getInstance() {
		return instance;
	}

}
