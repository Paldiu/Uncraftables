package io.github.paldiu.recipes;

import io.github.paldiu.Uncraftables;
import org.bukkit.Material;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.ShapelessRecipe;

public class CryingObsidianRecipe extends Craftable {
    public CryingObsidianRecipe(Uncraftables plugin) {
        super(plugin);

        if (!getConfigValues().cryingObsidianEnabled()) return;

        ShapedRecipe recipe = getUtil().shaped(Material.CRYING_OBSIDIAN, 2, "crying_obsidian_recipe");
        recipe.shape("aga", "gog", "aga");
        recipe.setIngredient('a', Material.AIR);
        recipe.setIngredient('o', Material.OBSIDIAN);
        recipe.setIngredient('g', Material.GHAST_TEAR);
        getPlugin().getServer().addRecipe(recipe);
    }
}
