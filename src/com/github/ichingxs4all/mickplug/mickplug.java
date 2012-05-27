package com.github.ichingxs4all.mickplug;

import java.util.logging.Logger;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class mickplug extends JavaPlugin{
	Logger log;
	
	public void onEnable(){ 
		log = this.getLogger();
		log.info("Your Mick plugin has been enabled!");
	}
	 
	public void onDisable(){ 
		log.info("Your Mick plugin has been disabled.");
	}

	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
	if(cmd.getName().equalsIgnoreCase("ignite")){ // If the player typed /basic then do the following...
		log.info("Burn baby Burn!");		return true;
	} //If this has happened the function will break and return true. if this hasn't happened the a value of false will be returned.
	return false; 
	}
}
