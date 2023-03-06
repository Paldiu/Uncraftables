package io.github.paldiu.recipes;

import io.github.paldiu.Uncraftables;
import org.bukkit.Material;
import org.bukkit.inventory.ShapedRecipe;

public class WitherSkullRecipe extends Craftable {

    public WitherSkullRecipe(Uncraftables plugin) {
        super(plugin);

        if (!getConfigValues().witherSkullEnabled()) return;

        ShapedRecipe recipe = getUtil().shaped(Material.WITHER_SKELETON_SKULL, "wither_skull_recipe");
        recipe.shape("scs", "coc", "scs");
        recipe.setIngredient('s', Material.SOUL_SOIL);
        recipe.setIngredient('c', Material.COAL);
        recipe.setIngredient('o', Material.SKELETON_SKULL);
        getPlugin().getServer().addRecipe(recipe);
    }
}
