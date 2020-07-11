package dev.coomware;

import org.bukkit.Server;
import org.bukkit.plugin.java.JavaPlugin;

public class Uncraftables extends JavaPlugin {
    public static Uncraftables plugin;
    public Server server;
    public CraftingUtils util;

    @Override
    public void onLoad() {
        plugin = this;
        server = getServer();
        util = new CraftingUtils(this);
    }

    @Override
    public void onEnable() {
        new Craftable(this).craftables();
    }

    @Override
    public void onDisable() {

    }
}
