package io.github.paldiu.recipes;

import io.github.paldiu.Uncraftables;
import org.bukkit.Material;
import org.bukkit.inventory.ShapedRecipe;

public class ElytraRecipe extends Craftable {
    public ElytraRecipe(Uncraftables plugin) {
        super(plugin);

        if (!getConfigValues().elytraEnabled()) return;

        ShapedRecipe recipe = getUtil().shaped(Material.ELYTRA, "elytra_recipe");
        recipe.shape("sds","mnm","mam");
        recipe.setIngredient('s', Material.STRING);
        recipe.setIngredient('d', Material.DIAMOND);
        recipe.setIngredient('m', Material.PHANTOM_MEMBRANE);
        recipe.setIngredient('n', Material.NETHER_STAR);
        recipe.setIngredient('a', Material.AIR);
        getPlugin().getServer().addRecipe(recipe);
    }
}
