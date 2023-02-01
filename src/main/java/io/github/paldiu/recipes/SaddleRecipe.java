package io.github.paldiu.recipes;

import io.github.paldiu.Uncraftables;
import org.bukkit.Material;
import org.bukkit.inventory.ShapedRecipe;

public class SaddleRecipe extends Craftable {

    public SaddleRecipe(Uncraftables plugin) {
        super(plugin);

        if (!getConfigValues().saddleEnabled()) return;

        ShapedRecipe saddle = getUtil().shaped(Material.SADDLE, "saddle_recipe");
        saddle.shape("wlw", "sls", "wlw");
        saddle.setIngredient('w', Material.STICK);
        saddle.setIngredient('s', Material.STRING);
        saddle.setIngredient('l', Material.LEATHER);
        getPlugin().getServer().addRecipe(saddle);
    }
}
