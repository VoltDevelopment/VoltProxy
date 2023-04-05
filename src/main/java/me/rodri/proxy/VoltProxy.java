package me.rodri.proxy;

import net.md_5.bungee.api.plugin.Plugin;

public final class VoltProxy extends Plugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info(" successfully loaded!");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info(" successfully disabled");
    }
}
