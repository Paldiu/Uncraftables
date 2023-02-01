package io.github.paldiu.recipes;

import io.github.paldiu.Uncraftables;
import org.bukkit.Material;
import org.bukkit.inventory.ShapedRecipe;

public class NameTagRecipe extends Craftable {
    public NameTagRecipe(Uncraftables plugin) {
        super(plugin);

        if (!getConfigValues().nameTagEnabled()) return;

        ShapedRecipe nametag = getUtil().shaped(Material.NAME_TAG, "nametag_recipe");
        nametag.shape("aas","apa","paa");
        nametag.setIngredient('a', Material.AIR);
        nametag.setIngredient('s', Material.STRING);
        nametag.setIngredient('p', Material.PAPER);
        getPlugin().getServer().addRecipe(nametag);
    }
}
