package me.FragCrypt.Tutorial;

import me.FragCrypt.Tutorial.events.PlayerJoin;
import me.FragCrypt.Tutorial.events.PlayerQuit;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
	
	@Override
	public void onEnable() {
	  PluginManager pm = getServer().getPluginManager();
	  pm.registerEvents(new PlayerJoin(), this);
	  pm.registerEvents(new PlayerQuit(), this);
	 
	}
	
	@Override
	public void onDisable() {
	  // TODO Auto-generated method stub
	 
	}
	
}
