package io.github.paldiu.recipes;

import io.github.paldiu.Uncraftables;
import org.bukkit.Material;
import org.bukkit.inventory.ShapedRecipe;

public class NetherStarRecipe extends Craftable {
    public NetherStarRecipe(Uncraftables plugin) {
        super(plugin);

        if (!getConfigValues().netherStarEnabled()) return;

        ShapedRecipe recipe = getUtil().shaped(Material.NETHER_STAR, "nether_star_recipe");
        recipe.shape("nwn","sss","bqb");
        recipe.setIngredient('n', Material.NETHER_WART);
        recipe.setIngredient('w', Material.WITHER_SKELETON_SKULL);
        recipe.setIngredient('s', Material.SOUL_SAND);
        recipe.setIngredient('b', Material.BLAZE_ROD);
        recipe.setIngredient('q', Material.QUARTZ);
        getPlugin().getServer().addRecipe(recipe);
    }
}
