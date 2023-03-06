package io.github.paldiu.config;

import io.github.paldiu.Uncraftables;

public class ConfigValues {
    private final Uncraftables plugin;

    public ConfigValues(Uncraftables plugin) {
        this.plugin = plugin;
    }

    public boolean barrierEnabled() {
        return plugin.getYamlWrapper().getBoolean("barrier");
    }

    public boolean bedrockEnabled() {
        return plugin.getYamlWrapper().getBoolean("bedrock");
    }

    public boolean bellEnabled() {
        return plugin.getYamlWrapper().getBoolean("bell");
    }

    public boolean cryingObsidianEnabled() {
        return plugin.getYamlWrapper().getBoolean("crying_obsidian");
    }

    public boolean dragonEggEnabled() {
        return plugin.getYamlWrapper().getBoolean("dragon_egg");
    }

    public boolean elytraEnabled() {
        return plugin.getYamlWrapper().getBoolean("elytra");
    }

    public boolean endFrameEnabled() {
        return plugin.getYamlWrapper().getBoolean("end_frame");
    }

    public boolean eggsEnabled() {
        return plugin.getYamlWrapper().getBoolean("eggs");
    }

    public boolean horseArmorEnabled() {
        return plugin.getYamlWrapper().getBoolean("horse_armor");
    }

    public boolean musicDiscsEnabled() {
        return plugin.getYamlWrapper().getBoolean("music_discs");
    }

    public boolean nameTagEnabled() {
        return plugin.getYamlWrapper().getBoolean("name_tag");
    }

    public boolean netherStarEnabled() {
        return plugin.getYamlWrapper().getBoolean("nether_star");
    }

    public boolean netherWartEnabled() {
        return plugin.getYamlWrapper().getBoolean("nether_wart");
    }

    public boolean saddleEnabled() {
        return plugin.getYamlWrapper().getBoolean("saddle");
    }

    public boolean spawnerEnabled() {
        return plugin.getYamlWrapper().getBoolean("spawner");
    }

    public boolean totemEnabled() {
        return plugin.getYamlWrapper().getBoolean("totem");
    }

    public boolean tridentEnabled() {
        return plugin.getYamlWrapper().getBoolean("trident");
    }

    public boolean membraneEnabled() {
        return plugin.getYamlWrapper().getBoolean("membrane");
    }

    public boolean cobWebEnabled() {
        return plugin.getYamlWrapper().getBoolean("cobweb");
    }

    public boolean witherSkullEnabled() {
        return plugin.getYamlWrapper().getBoolean("wither_skull");
    }
}
