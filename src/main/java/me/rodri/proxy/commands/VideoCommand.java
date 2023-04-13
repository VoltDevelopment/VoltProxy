package me.rodri.proxy.commands;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

public class VideoCommand extends Command {

    public VideoCommand() {
        super("video");
    }

    @Override
    public void execute(CommandSender sender, String[] args) {
        if (sender.hasPermission("vproxy.video")) {
            if (args.length > 0) {
                String separator = ChatColor.GRAY + "" + ChatColor.STRIKETHROUGH + "-----------------------------------";
                String message = separator + "\n" + ChatColor.YELLOW + sender.getName() + ChatColor.WHITE + " has uploaded a new video!\n" + ChatColor.YELLOW + args[0] + "\n" + separator;
                ProxyServer.getInstance().getPlayers().forEach(player -> {
                    player.sendMessage(message);
                });
            } else {
                sender.sendMessage(ChatColor.RED + "You must provide a link\n https://youtube.com/@VoltDevelopment");
            }
        } else {
            sender.sendMessage(ChatColor.RED + "That command was not found.");
        }
    }
}
