package me.rodri.proxy.commands;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

public class DiscordCommand extends Command {

    public DiscordCommand () {
        super("discord");
    }

    @Override
    public void execute(CommandSender commandSender, String[] strings) {
        if (commandSender instanceof ProxiedPlayer){
            ProxiedPlayer player = (ProxiedPlayer) commandSender;

            player.sendMessage("");
            player.sendMessage(ChatColor.YELLOW + "Join our Discord: " + ChatColor.BLUE + "dsc.gg/voltdev");
            player.sendMessage("");

        }
    }
}
