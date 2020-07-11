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
        eggs();
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

    // EGGS --- EGGS --- EGGS --- EGGS --- EGGS \\

    private void eggs() {
        beeEgg();
        blazeEgg();
        caveSpiderEgg();
        creeperEgg();
        dolphinEgg();
        drownedEgg();
        elderGuardEgg();
        endermanEgg();
        endermiteEgg();
    }

    private void beeEgg() {
        ShapedRecipe beeEgg = util.shaped(Material.BEE_SPAWN_EGG, "bee_egg_recipe");
        beeEgg.shape("aha","heh","aha");
        beeEgg.setIngredient('a', Material.AIR);
        beeEgg.setIngredient('h', Material.HONEYCOMB);
        beeEgg.setIngredient('e', Material.EGG);
        plugin.server.addRecipe(beeEgg);
    }

    private void blazeEgg() {
        ShapedRecipe blazeEgg = util.shaped(Material.BLAZE_SPAWN_EGG, "blaze_egg_recipe");
        blazeEgg.shape("sbs","beb","sbs");
        blazeEgg.setIngredient('s', Material.SOUL_SOIL);
        blazeEgg.setIngredient('b', Material.BLAZE_ROD);
        blazeEgg.setIngredient('e', Material.EGG);
        plugin.server.addRecipe(blazeEgg);
    }

    private void caveSpiderEgg() {
        ShapedRecipe caveSpiderEgg = util.shaped(Material.CAVE_SPIDER_SPAWN_EGG, "cave_spider_egg_recipe");
        caveSpiderEgg.shape("afa","ses","afa");
        caveSpiderEgg.setIngredient('a', Material.AIR);
        caveSpiderEgg.setIngredient('f', Material.FERMENTED_SPIDER_EYE);
        caveSpiderEgg.setIngredient('s', Material.SPIDER_EYE);
        caveSpiderEgg.setIngredient('e', Material.SPIDER_SPAWN_EGG);
        plugin.server.addRecipe(caveSpiderEgg);
    }

    private void creeperEgg() {
        ShapedRecipe creeperEgg = util.shaped(Material.CREEPER_SPAWN_EGG, "creeper_egg_recipe");
        creeperEgg.shape("aga","geg","aga");
        creeperEgg.setIngredient('a', Material.AIR);
        creeperEgg.setIngredient('g', Material.GUNPOWDER);
        creeperEgg.setIngredient('e', Material.EGG);
        plugin.server.addRecipe(creeperEgg);
    }

    private void dolphinEgg() {
        ShapedRecipe dolphin = util.shaped(Material.DOLPHIN_SPAWN_EGG, "dolphin_egg_recipe");
        dolphin.shape("aca","wew","aca");
        dolphin.setIngredient('a', Material.AIR);
        dolphin.setIngredient('w', Material.WATER_BUCKET);
        dolphin.setIngredient('c', Material.COD);
        dolphin.setIngredient('e', Material.EGG);
        plugin.server.addRecipe(dolphin);
    }

    private void drownedEgg() {
        ShapedRecipe drowned = util.shaped(Material.DROWNED_SPAWN_EGG, "drowned_egg_recipe");
        drowned.shape("awa","fef","awa");
        drowned.setIngredient('a', Material.AIR);
        drowned.setIngredient('w', Material.WATER_BUCKET);
        drowned.setIngredient('f', Material.FISHING_ROD);
        drowned.setIngredient('e', Material.ZOMBIE_SPAWN_EGG);
        plugin.server.addRecipe(drowned);
    }

    private void elderGuardEgg() {
        ShapedRecipe eldGuard = util.shaped(Material.ELDER_GUARDIAN_SPAWN_EGG, "elder_guardian_egg_recipe");
        eldGuard.shape("apa","ses","apa");
        eldGuard.setIngredient('a', Material.AIR);
        eldGuard.setIngredient('p', Material.PRISMARINE_SHARD);
        eldGuard.setIngredient('e', Material.GUARDIAN_SPAWN_EGG);
        eldGuard.setIngredient('s', Material.SPONGE);
        plugin.server.addRecipe(eldGuard);
    }

    private void endermanEgg() {
        ShapedRecipe enderman = util.shaped(Material.ENDERMAN_SPAWN_EGG, "enderman_egg_recipe");
        enderman.shape("apa","pep","apa");
        enderman.setIngredient('a', Material.AIR);
        enderman.setIngredient('p', Material.ENDER_PEARL);
        enderman.setIngredient('e', Material.EGG);
        plugin.server.addRecipe(enderman);
    }

    private void endermiteEgg() {
        ShapedRecipe endermite = util.shaped(Material.ENDERMITE_SPAWN_EGG, "endermite_egg_recipe");
        endermite.shape("apa","cec","apa");
        endermite.setIngredient('a', Material.AIR);
        endermite.setIngredient('p', Material.ENDER_PEARL);
        endermite.setIngredient('c', Material.CHORUS_FRUIT);
        endermite.setIngredient('e', Material.EGG);
        plugin.server.addRecipe(endermite);
    }
}
