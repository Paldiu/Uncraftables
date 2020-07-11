package dev.coomware;

import org.bukkit.Material;
import org.bukkit.inventory.ShapedRecipe;

public class Craftable {
    private Uncraftables plugin;
    private CraftingUtils util = Uncraftables.plugin.util;

    public Craftable(Uncraftables instance) {
        plugin = instance;
    }

    public void craftables() {
        saddle();
        leatherHorseArmor();
        ironHorseArmor();
        goldHorseArmor();
        diamondHorseArmor();
        nametag();
    }

    private void saddle() {
        ShapedRecipe saddle = util.shaped(Material.SADDLE, "saddle_recipe");
        saddle.shape("wlw","sls","wlw");
        saddle.setIngredient('w', Material.STICK);
        saddle.setIngredient('s', Material.STRING);
        saddle.setIngredient('l', Material.LEATHER);
        plugin.server.addRecipe(saddle);
    }

    private void leatherHorseArmor() {
        ShapedRecipe armor = util.shaped(Material.LEATHER_HORSE_ARMOR, "leather_horse_armor_recipe");
        armor.shape("aal","l*l","lsi");
        armor.setIngredient('a', Material.AIR);
        armor.setIngredient('s', Material.STRING);
        armor.setIngredient('l', Material.LEATHER);
        armor.setIngredient('*', Material.SADDLE);
        armor.setIngredient('i', Material.IRON_INGOT);
        plugin.server.addRecipe(armor);
    }

    private void ironHorseArmor() {
        ShapedRecipe armor = util.shaped(Material.IRON_HORSE_ARMOR, "iron_horse_armor_recipe");
        armor.shape("aai","i*i","isi");
        armor.setIngredient('a', Material.AIR);
        armor.setIngredient('s', Material.STRING);
        armor.setIngredient('*', Material.SADDLE);
        armor.setIngredient('i', Material.IRON_INGOT);
        plugin.server.addRecipe(armor);
    }

    private void goldHorseArmor() {
        ShapedRecipe armor = util.shaped(Material.GOLDEN_HORSE_ARMOR, "golden_horse_armor_recipe");
        armor.shape("aag","g*g","gsi");
        armor.setIngredient('a', Material.AIR);
        armor.setIngredient('s', Material.STRING);
        armor.setIngredient('g', Material.GOLD_INGOT);
        armor.setIngredient('*', Material.SADDLE);
        armor.setIngredient('i', Material.IRON_INGOT);
        plugin.server.addRecipe(armor);
    }

    private void diamondHorseArmor() {
        ShapedRecipe armor = util.shaped(Material.DIAMOND_HORSE_ARMOR, "diamond_horse_armor_recipe");
        armor.shape("aad","d*d","dsi");
        armor.setIngredient('a', Material.AIR);
        armor.setIngredient('s', Material.STRING);
        armor.setIngredient('d', Material.DIAMOND);
        armor.setIngredient('*', Material.SADDLE);
        armor.setIngredient('i', Material.IRON_INGOT);
        plugin.server.addRecipe(armor);
    }

    private void nametag() {
        ShapedRecipe nametag = util.shaped(Material.NAME_TAG, "nametag_recipe");
        nametag.shape("aas","apa","paa");
        nametag.setIngredient('a', Material.AIR);
        nametag.setIngredient('s', Material.STRING);
        nametag.setIngredient('p', Material.PAPER);
        plugin.server.addRecipe(nametag);
    }
}
