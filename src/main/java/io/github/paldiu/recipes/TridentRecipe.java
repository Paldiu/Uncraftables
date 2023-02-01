package io.github.paldiu.recipes;

import io.github.paldiu.Uncraftables;
import org.bukkit.Material;
import org.bukkit.inventory.ShapedRecipe;

public class TridentRecipe extends Craftable {
    public TridentRecipe(Uncraftables plugin) {
        super(plugin);

        if (!getConfigValues().tridentEnabled()) return;

        ShapedRecipe recipe = getUtil().shaped(Material.TRIDENT, "trident_recipe");
        recipe.shape("add","apd","paa");
        recipe.setIngredient('a', Material.AIR);
        recipe.setIngredient('p', Material.PRISMARINE_SHARD);
        recipe.setIngredient('d', Material.DIAMOND);
        getPlugin().getServer().addRecipe(recipe);
    }
}
