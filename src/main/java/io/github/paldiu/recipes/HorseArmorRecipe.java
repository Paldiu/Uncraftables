package io.github.paldiu.recipes;

import io.github.paldiu.Uncraftables;
import org.bukkit.Material;
import org.bukkit.inventory.ShapedRecipe;

public class HorseArmorRecipe extends Craftable {

    public HorseArmorRecipe(Uncraftables plugin) {
        super(plugin);

        if (!getConfigValues().horseArmorEnabled()) return;

        ShapedRecipe leather = getUtil().shaped(Material.LEATHER_HORSE_ARMOR, "leather_horse_armor_recipe");
        leather.shape("aal","lcl","lsi");
        leather.setIngredient('a', Material.AIR);
        leather.setIngredient('s', Material.STRING);
        leather.setIngredient('l', Material.LEATHER);
        leather.setIngredient('c', Material.SADDLE);
        leather.setIngredient('i', Material.IRON_INGOT);
        getPlugin().getServer().addRecipe(leather);

        ShapedRecipe iron = getUtil().shaped(Material.IRON_HORSE_ARMOR, "iron_horse_armor_recipe");
        iron.shape("aai","ici","isi");
        iron.setIngredient('a', Material.AIR);
        iron.setIngredient('s', Material.STRING);
        iron.setIngredient('c', Material.SADDLE);
        iron.setIngredient('i', Material.IRON_INGOT);
        getPlugin().getServer().addRecipe(iron);

        ShapedRecipe gold = getUtil().shaped(Material.GOLDEN_HORSE_ARMOR, "golden_horse_armor_recipe");
        gold.shape("aag","g*g","gsi");
        gold.setIngredient('a', Material.AIR);
        gold.setIngredient('s', Material.STRING);
        gold.setIngredient('g', Material.GOLD_INGOT);
        gold.setIngredient('*', Material.SADDLE);
        gold.setIngredient('i', Material.IRON_INGOT);
        getPlugin().getServer().addRecipe(gold);

        ShapedRecipe diamond = getUtil().shaped(Material.DIAMOND_HORSE_ARMOR, "diamond_horse_armor_recipe");
        diamond.shape("aad","d*d","dsi");
        diamond.setIngredient('a', Material.AIR);
        diamond.setIngredient('s', Material.STRING);
        diamond.setIngredient('d', Material.DIAMOND);
        diamond.setIngredient('*', Material.SADDLE);
        diamond.setIngredient('i', Material.IRON_INGOT);
        getPlugin().getServer().addRecipe(diamond);
    }
}
