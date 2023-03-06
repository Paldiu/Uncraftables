package io.github.paldiu.recipes;

import io.github.paldiu.Uncraftables;
import org.bukkit.Material;
import org.bukkit.inventory.ShapedRecipe;

public class NetherStarRecipe extends Craftable {
    public NetherStarRecipe(Uncraftables plugin) {
        super(plugin);

        if (!getConfigValues().netherStarEnabled()) return;

        ShapedRecipe nether_star = getUtil().shaped(Material.NETHER_STAR, "nether_star_recipe");
        nether_star.shape("nwn","sss","bqb");
        nether_star.setIngredient('n', Material.NETHER_WART);
        nether_star.setIngredient('w', Material.WITHER_SKELETON_SKULL);
        nether_star.setIngredient('s', Material.SOUL_SAND);
        nether_star.setIngredient('b', Material.BLAZE_ROD);
        nether_star.setIngredient('q', Material.QUARTZ);
        getPlugin().getServer().addRecipe(nether_star);
    }
}
