package io.github.paldiu.recipes;

import io.github.paldiu.Uncraftables;
import org.bukkit.Material;
import org.bukkit.inventory.ShapedRecipe;

public class DragonEggRecipe extends Craftable {

    public DragonEggRecipe(Uncraftables plugin) {
        super(plugin);

        if (!getConfigValues().dragonEggEnabled()) return;

        ShapedRecipe recipe = getUtil().shaped(Material.DRAGON_EGG, "dragon_egg_recipe");
        recipe.shape("obo", "beb", "obo");
        recipe.setIngredient('o', Material.OBSIDIAN);
        recipe.setIngredient('b', Material.DRAGON_BREATH);
        recipe.setIngredient('e', Material.DRAGON_HEAD);
        getPlugin().getServer().addRecipe(recipe);
    }
}
