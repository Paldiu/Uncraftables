package io.github.paldiu.recipes;

import io.github.paldiu.Uncraftables;
import org.bukkit.Material;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.ShapelessRecipe;

public class BedrockRecipe extends Craftable {
    public BedrockRecipe(Uncraftables plugin) {
        super(plugin);

        if (!getConfigValues().bedrockEnabled()) return;

        ShapedRecipe recipe = getUtil().shaped(Material.BEDROCK, 4, "bedrock_recipe");
        recipe.shape("dod", "ono", "dod");
        recipe.setIngredient('d', Material.DIAMOND_BLOCK);
        recipe.setIngredient('o', Material.OBSIDIAN);
        recipe.setIngredient('n', Material.NETHERITE_BLOCK);
        getPlugin().getServer().addRecipe(recipe);
    }
}
