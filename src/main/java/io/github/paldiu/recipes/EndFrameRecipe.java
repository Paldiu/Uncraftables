package io.github.paldiu.recipes;

import io.github.paldiu.Uncraftables;
import org.bukkit.Material;
import org.bukkit.inventory.ShapedRecipe;

public class EndFrameRecipe extends Craftable {
    public EndFrameRecipe(Uncraftables plugin) {
        super(plugin);

        if (!getConfigValues().endFrameEnabled()) return;

        ShapedRecipe recipe = getUtil().shaped(Material.END_PORTAL_FRAME, "end_frame_recipe");
        recipe.shape("pap","eoe","eee");
        recipe.setIngredient('p', Material.ENDER_PEARL);
        recipe.setIngredient('a', Material.AIR);
        recipe.setIngredient('e', Material.END_STONE);
        recipe.setIngredient('o', Material.OBSIDIAN);
        getPlugin().getServer().addRecipe(recipe);
    }
}
