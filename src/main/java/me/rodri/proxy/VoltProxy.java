package me.rodri.proxy;

import me.rodri.proxy.commands.PingCommand;
import net.md_5.bungee.api.plugin.Plugin;

public final class VoltProxy extends Plugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info(" successfully loaded!");




        //Register Commands
        getProxy().getPluginManager().registerCommand(this, new PingCommand());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info(" successfully disabled");

    }
}
