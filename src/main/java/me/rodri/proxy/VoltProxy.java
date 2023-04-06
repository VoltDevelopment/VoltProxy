package me.rodri.proxy;

import me.rodri.proxy.commands.DiscordCommand;
import me.rodri.proxy.commands.PingCommand;
import me.rodri.proxy.commands.TwitterCommand;
import me.rodri.proxy.listeners.PlayerListener;
import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.plugin.Plugin;
import net.md_5.bungee.protocol.packet.Chat;

public final class VoltProxy extends Plugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info(ChatColor.GRAY + "------------------------------");
        getLogger().info("     " + ChatColor.YELLOW + "Volt Proxy");
        getLogger().info("");
        getLogger().info("Join our discord " + ChatColor.BLUE + "dsc.gg/voltdev");
        getLogger().info("Made by " + ChatColor.GOLD + "Volt Development");
        getLogger().info(ChatColor.GRAY +  "------------------------------");

        //Register Commands
        getProxy().getPluginManager().registerCommand(this, new PingCommand());
        getProxy().getPluginManager().registerCommand(this, new DiscordCommand());
        getProxy().getPluginManager().registerCommand(this, new TwitterCommand());


        getProxy().getPluginManager().registerListener(this, new PlayerListener());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info(" successfully disabled");

    }
}
