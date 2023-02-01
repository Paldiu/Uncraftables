package io.github.paldiu.recipes;

import io.github.paldiu.Uncraftables;
import org.bukkit.Material;
import org.bukkit.inventory.ShapelessRecipe;

public class BedrockRecipe extends Craftable {
    public BedrockRecipe(Uncraftables plugin) {
        super(plugin);

        if (!getConfigValues().bedrockEnabled()) return;

        ShapelessRecipe recipe = getUtil().shapeless(Material.BEDROCK, "bedrock_recipe");
        recipe.addIngredient(2, Material.OBSIDIAN);
        recipe.addIngredient(2, Material.STONE);
        recipe.addIngredient(1, Material.DIAMOND);
        recipe.addIngredient(1, Material.IRON_INGOT);
        recipe.addIngredient(1, Material.COAL);
        recipe.addIngredient(1, Material.WATER_BUCKET);
        recipe.addIngredient(1, Material.LAVA_BUCKET);
        recipe.getResult().setAmount(4);
        getPlugin().getServer().addRecipe(recipe);
    }
}
