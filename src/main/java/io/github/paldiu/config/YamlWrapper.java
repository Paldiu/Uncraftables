package io.github.paldiu.config;

import io.github.paldiu.Uncraftables;
import org.bukkit.Bukkit;
import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.YamlConfiguration;
import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.io.IOException;

public class YamlWrapper {
    private final YamlConfiguration config;
    private final File configFile;

    private final ConfigValues configValues;

    public YamlWrapper(@NotNull Uncraftables plugin) {
        String FILE_NAME = "config.yml";
        File dataFolder = plugin.getDataFolder();
        this.configFile = new File(dataFolder, FILE_NAME);
        try {
            if (configFile.createNewFile()) {
                plugin.saveResource(FILE_NAME, true);
            }
        } catch (IOException ex) {
            Bukkit.getLogger().severe(ex.getMessage());
        }
        this.config = YamlConfiguration.loadConfiguration(configFile);
        this.configValues = new ConfigValues(plugin);
    }

    public void save() {
        try {
            config.save(configFile);
        } catch (IOException ex) {
            Bukkit.getLogger().severe(ex.getMessage());
        }
    }

    public void load() {
        try {
            config.load(configFile);
        } catch (IOException | InvalidConfigurationException ex) {
            Bukkit.getLogger().severe(ex.getMessage());
        }
    }

    public void set(String path, Object value) {
        config.set(path, value);
    }

    public Object get(String path) {
        return config.get(path);
    }

    public String getString(String path) {
        return config.getString(path);
    }

    public int getInt(String path) {
        return config.getInt(path);
    }

    public boolean getBoolean(String path) {
        return config.getBoolean(path);
    }

    public double getDouble(String path) {
        return config.getDouble(path);
    }

    public long getLong(String path) {
        return config.getLong(path);
    }

    public float getFloat(String path) {
        return (float) config.getDouble(path);
    }

    public YamlConfiguration getConfig() {
        return config;
    }

    public ConfigValues getConfigValues() {
        return configValues;
    }
}
