package io.github.paldiu;

import io.github.paldiu.config.ItemMetaSupplier;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

public class CraftingUtils {
    private final Uncraftables plugin;

    public CraftingUtils(Uncraftables instance) {
        plugin = instance;
    }

    @Contract("_ -> new")
    private @NotNull
    NamespacedKey newKey(String string) {
        return new NamespacedKey(plugin, string);
    }

    public final @NotNull ShapedRecipe shaped(Material result, String key) {
        ItemStack is = new ItemStack(result);
        return new ShapedRecipe(newKey(key), is);
    }

    public final @NotNull ShapedRecipe shaped(Material result, int amount, String key) {
        ItemStack is = new ItemStack(result);
        is.setAmount(amount);
        return new ShapedRecipe(newKey(key), is);
    }

    public final @NotNull ShapedRecipe shaped(Material result, int amount, String key, ItemMetaSupplier customData) {
        ItemStack is = new ItemStack(result);
        is.setAmount(amount);
        is.setItemMeta(customData.getFrom(is));
        return new ShapedRecipe(newKey(key), is);
    }

    public final @NotNull ShapelessRecipe shapeless(Material result, String key) {
        ItemStack is = new ItemStack(result);
        return new ShapelessRecipe(newKey(key), is);
    }

    public final @NotNull ShapelessRecipe shapeless(Material result, int amount, String key) {
        ItemStack is = new ItemStack(result);
        is.setAmount(amount);
        return new ShapelessRecipe(newKey(key), is);
    }

    public final @NotNull ShapelessRecipe shapeless(Material result, int amount, String key, ItemMetaSupplier customData) {
        ItemStack is = new ItemStack(result);
        is.setAmount(amount);
        is.setItemMeta(customData.getFrom(is));
        return new ShapelessRecipe(newKey(key), is);
    }
}
