package io.github.paldiu.recipes;

import io.github.paldiu.CraftingUtils;
import io.github.paldiu.Uncraftables;
import io.github.paldiu.config.ConfigValues;

public abstract class Craftable {
    private final Uncraftables plugin;
    private final CraftingUtils util;
    private final ConfigValues configValues;

    public Craftable(Uncraftables plugin) {
        this.plugin = plugin;
        this.util = getPlugin().getUtil();
        this.configValues = plugin.getYamlWrapper().getConfigValues();
    }

    protected Uncraftables getPlugin() {
        return plugin;
    }

    protected CraftingUtils getUtil() {
        return util;
    }

    protected ConfigValues getConfigValues() {
        return configValues;
    }
}
