package io.github.paldiu.recipes;

import io.github.paldiu.Uncraftables;
import org.bukkit.Material;
import org.bukkit.inventory.ShapelessRecipe;

public class NetherWartRecipe extends Craftable {
    public NetherWartRecipe(Uncraftables plugin) {
        super(plugin);

        if (!getConfigValues().netherWartEnabled()) return;

        ShapelessRecipe recipe = getUtil().shapeless(Material.NETHER_WART, "netherwart_recipe");
        recipe.addIngredient(1, Material.NETHER_WART_BLOCK);
        recipe.getResult().setAmount(9);
        getPlugin().getServer().addRecipe(recipe);
    }
}
