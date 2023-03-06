package io.github.paldiu.recipes;

import io.github.paldiu.Uncraftables;
import org.bukkit.Material;
import org.bukkit.inventory.ShapelessRecipe;

public class CobWebRecipe extends Craftable {
    public CobWebRecipe(Uncraftables plugin) {
        super(plugin);

        if (!getConfigValues().cobWebEnabled()) return;

        ShapelessRecipe cobweb = getUtil().shapeless(Material.COBWEB, 2, "cobweb_recipe");
        cobweb.addIngredient(9, Material.STRING);
        getPlugin().getServer().addRecipe(cobweb);
    }
}
