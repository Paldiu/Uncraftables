package io.github.paldiu;

import io.github.paldiu.config.YamlWrapper;
import io.github.paldiu.recipes.*;
import org.bstats.Metrics;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Uncraftables extends JavaPlugin {
    private final int pluginId = 8179;

    private Uncraftables plugin;
    private CraftingUtils util;
    private YamlWrapper yamlWrapper;

    @Override
    public void onLoad() {
        plugin = this;
        util = new CraftingUtils(this);
    }

    @Override
    public void onEnable() {
        yamlWrapper = new YamlWrapper(this);
        new Metrics(this, pluginId);
        Bukkit.getLogger().info("[Uncraftables] Successfully enabled bStats metrics!");

        register();
        new CraftingListener(this);
        Bukkit.getLogger().info("[Uncraftables] successfully loaded all recipes.");

        new ReloadCMD(this);
    }

    @Override
    public void onDisable() {
        yamlWrapper.save();
    }

    public void register() {
        new BarrierRecipe(this);
        new BedrockRecipe(this);
        new BellRecipe(this);
        new CryingObsidianRecipe(this);
        new DragonEggRecipe(this);
        new EggRecipes(this);
        new ElytraRecipe(this);
        new EndFrameRecipe(this);
        new HorseArmorRecipe(this);
        new MusicDiscRecipes(this);
        new NameTagRecipe(this);
        new NetherStarRecipe(this);
        new NetherWartRecipe(this);
        new SaddleRecipe(this);
        new SpawnerRecipe(this);
        new TotemRecipe(this);
        new TridentRecipe(this);
    }

    public YamlWrapper getYamlWrapper() {
        return yamlWrapper;
    }

    public Uncraftables getPlugin() {
        return plugin;
    }

    public CraftingUtils getUtil() {
        return util;
    }
}
