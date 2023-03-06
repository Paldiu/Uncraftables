package io.github.paldiu.recipes;

import io.github.paldiu.Uncraftables;
import org.bukkit.Material;
import org.bukkit.inventory.ShapelessRecipe;

public class NetherWartRecipe extends Craftable {
    public NetherWartRecipe(Uncraftables plugin) {
        super(plugin);

        if (!getConfigValues().netherWartEnabled()) return;

        ShapelessRecipe netherwart = getUtil().shapeless(Material.NETHER_WART, 9, "netherwart_recipe");
        netherwart.addIngredient(1, Material.NETHER_WART_BLOCK);
        getPlugin().getServer().addRecipe(netherwart);
    }
}
