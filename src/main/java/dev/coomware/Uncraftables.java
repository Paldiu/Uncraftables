package dev.coomware;

import org.bstats.Metrics;
import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.plugin.java.JavaPlugin;

public class Uncraftables extends JavaPlugin {
    public static Uncraftables plugin;
    public Server server;
    public CraftingUtils util;
    public int pluginId = 8179;

    @Override
    public void onLoad() {
        plugin = this;
        server = getServer();
        util = new CraftingUtils(this);
    }

    @Override
    public void onEnable() {
        final Metrics metrics = new Metrics(this, pluginId);
        Bukkit.getLogger().info("[Uncraftables] Successfully enabled bStats metrics!");

        new Craftable(this).craftables();
        new CraftingListener(this);
        Bukkit.getLogger().info("[Uncraftables] successfully loaded all recipes.");
    }

    @Override
    public void onDisable() {
        //
    }
}
