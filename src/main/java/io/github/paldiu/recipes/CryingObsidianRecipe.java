package io.github.paldiu.recipes;

import io.github.paldiu.Uncraftables;
import org.bukkit.Material;
import org.bukkit.inventory.ShapelessRecipe;

public class CryingObsidianRecipe extends Craftable {
    public CryingObsidianRecipe(Uncraftables plugin) {
        super(plugin);

        if (!getConfigValues().cryingObsidianEnabled()) return;

        ShapelessRecipe recipe = getUtil().shapeless(Material.CRYING_OBSIDIAN, "crying_obsidian_recipe");
        recipe.addIngredient(1, Material.OBSIDIAN);
        recipe.addIngredient(4, Material.GHAST_TEAR);
        recipe.getResult().setAmount(2);
        getPlugin().getServer().addRecipe(recipe);
    }
}
