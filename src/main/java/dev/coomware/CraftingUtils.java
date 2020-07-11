package dev.coomware;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.ShapelessRecipe;

public class CraftingUtils {
    private Uncraftables plugin;

    public CraftingUtils(Uncraftables instance) {
        plugin = instance;
    }

    private NamespacedKey newKey(String string) {
        return new NamespacedKey(plugin, string);
    }

    public ShapedRecipe shaped(Material result, String key) {
        ItemStack is = new ItemStack(result);
        return new ShapedRecipe(newKey(key), is);
    }

    public ShapelessRecipe shapeless(Material result, String key) {
        ItemStack is = new ItemStack(result);
        return new ShapelessRecipe(newKey(key), is);
    }
}
