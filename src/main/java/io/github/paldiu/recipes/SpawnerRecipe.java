package io.github.paldiu.recipes;

import io.github.paldiu.Uncraftables;
import org.bukkit.Material;
import org.bukkit.inventory.ShapedRecipe;

public class SpawnerRecipe extends Craftable {
    public SpawnerRecipe(Uncraftables plugin) {
        super(plugin);

        if (!getConfigValues().spawnerEnabled()) return;

        ShapedRecipe recipe = getUtil().shaped(Material.SPAWNER, "spawner_recipe");
        recipe.shape("ccc","cec","ccc");
        recipe.setIngredient('c', Material.CHAIN);
        recipe.setIngredient('e', Material.PIG_SPAWN_EGG);
        getPlugin().getServer().addRecipe(recipe);
    }
}
