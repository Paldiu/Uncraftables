package io.github.paldiu.recipes;

import io.github.paldiu.Uncraftables;
import org.bukkit.Material;
import org.bukkit.inventory.ShapedRecipe;

public class TotemRecipe extends Craftable {
    public TotemRecipe(Uncraftables plugin) {
        super(plugin);

        if (!getConfigValues().totemEnabled()) return;

        ShapedRecipe recipe = getUtil().shaped(Material.TOTEM_OF_UNDYING, "totem_recipe");
        recipe.shape("aea","ibi","aga");
        recipe.setIngredient('a', Material.AIR);
        recipe.setIngredient('e', Material.EMERALD);
        recipe.setIngredient('i', Material.GOLD_INGOT);
        recipe.setIngredient('b', Material.GOLD_BLOCK);
        recipe.setIngredient('g', Material.GOLDEN_APPLE);
        getPlugin().getServer().addRecipe(recipe);
    }
}
