package me.rodri.proxy.listeners;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.event.PostLoginEvent;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.event.EventHandler;


public class PlayerListener implements Listener {

    @EventHandler
    public void onPostLogin(PostLoginEvent event){
        ProxiedPlayer player = event.getPlayer();

        //Send message after player successfully connect to the proxy
        player.sendMessage(ChatColor.GREEN +  "" + ChatColor.BOLD + "✓" + ChatColor.YELLOW + " Your profile was successfully loaded!");

    }

}
