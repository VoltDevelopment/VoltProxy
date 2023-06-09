package me.rodri.proxy.commands;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

public class PingCommand extends Command {

    public PingCommand (){
        super("ping");
    }

    @Override
    public void execute(CommandSender commandSender, String[] strings) {
        if (commandSender instanceof ProxiedPlayer ){
            ProxiedPlayer player = (ProxiedPlayer) commandSender;

            int ping = player.getPing();

            player.sendMessage(ChatColor.YELLOW + "Your ping: " + ChatColor.GREEN + ping);

        }
    }
}
