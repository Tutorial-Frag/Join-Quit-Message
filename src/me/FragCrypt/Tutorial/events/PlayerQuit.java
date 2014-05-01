package me.FragCrypt.Tutorial.events;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerQuit implements Listener {

	@EventHandler
	public static void onPlayerQuit(PlayerQuitEvent e){
		e.setQuitMessage(ChatColor.RED + "[-] " + e.getPlayer().getName() + " has left the game!");
	}
	
}
