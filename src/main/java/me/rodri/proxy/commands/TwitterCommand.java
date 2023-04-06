package me.rodri.proxy.commands;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

public class TwitterCommand extends Command {

    public TwitterCommand () {
        super("twitter");
    }
    @Override
    public void execute(CommandSender commandSender, String[] strings) {
        if (commandSender instanceof ProxiedPlayer) {
            ProxiedPlayer player = (ProxiedPlayer) commandSender;

            player.sendMessage("");
            player.sendMessage(ChatColor.YELLOW + "Follow us on: " + ChatColor.AQUA + "@voltdev_us");
            player.sendMessage("");

        }
    }
}
