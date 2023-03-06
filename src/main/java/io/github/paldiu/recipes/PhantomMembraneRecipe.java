package io.github.paldiu.recipes;

import io.github.paldiu.Uncraftables;
import org.bukkit.Material;
import org.bukkit.inventory.ShapedRecipe;

public class PhantomMembraneRecipe extends Craftable{
    public PhantomMembraneRecipe(Uncraftables plugin) {
        super(plugin);

        if (!getConfigValues().membraneEnabled()) return;

        ShapedRecipe membrane = getUtil().shaped(Material.PHANTOM_MEMBRANE, "membrane_recipe");
        membrane.shape("sfs", "frf", "sfs");
        membrane.setIngredient('s', Material.SLIME_BALL);
        membrane.setIngredient('f', Material.FEATHER);
        membrane.setIngredient('r', Material.FIREWORK_STAR);
        getPlugin().getServer().addRecipe(membrane);
    }
}
