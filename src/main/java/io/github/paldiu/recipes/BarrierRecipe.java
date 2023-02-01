package io.github.paldiu.recipes;

import io.github.paldiu.Uncraftables;
import org.bukkit.Material;
import org.bukkit.inventory.ShapedRecipe;

public class BarrierRecipe extends Craftable {
    public BarrierRecipe(Uncraftables plugin) {
        super(plugin);

        if (!getConfigValues().barrierEnabled()) return;

        ShapedRecipe recipe = getUtil().shaped(Material.BARRIER, "barrier_recipe");
        recipe.shape("ggg", "gbg", "ggg");
        recipe.setIngredient('g', Material.GLASS);
        recipe.setIngredient('b', Material.BEDROCK);
        getPlugin().getServer().addRecipe(recipe);
    }
}
