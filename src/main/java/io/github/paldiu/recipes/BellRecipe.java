package io.github.paldiu.recipes;

import io.github.paldiu.Uncraftables;
import org.bukkit.Material;
import org.bukkit.inventory.ShapedRecipe;

public class BellRecipe extends Craftable {
    public BellRecipe(Uncraftables plugin) {
        super(plugin);

        if (!getConfigValues().bellEnabled()) return;

        ShapedRecipe recipe = getUtil().shaped(Material.BELL, "bell_recipe");
        recipe.shape("sks", "sis", "sns");
        recipe.setIngredient('s', Material.STONE);
        recipe.setIngredient('k', Material.STICK);
        recipe.setIngredient('i', Material.GOLD_INGOT);
        recipe.setIngredient('n', Material.GOLD_NUGGET);
        getPlugin().getServer().addRecipe(recipe);
    }
}
