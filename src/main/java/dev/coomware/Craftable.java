package dev.coomware;

import org.bukkit.Material;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.ShapelessRecipe;

public class Craftable {
    private Uncraftables plugin;
    private static final CraftingUtils util = Uncraftables.plugin.util;

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
        spawner();
        discs();
        bedrock();
        barrier();
        bell();
        netherstar();
        elytra();
        trident();
        netherwart();
        cryingObsidian();
        endFrame();
        totem();
    }

    private void totem() {
        ShapedRecipe recipe = util.shaped(Material.TOTEM_OF_UNDYING, "totem_recipe");
        recipe.shape("aea","ibi","aga");
        recipe.setIngredient('a', Material.AIR);
        recipe.setIngredient('e', Material.EMERALD);
        recipe.setIngredient('i', Material.GOLD_INGOT);
        recipe.setIngredient('b', Material.GOLD_BLOCK);
        recipe.setIngredient('g', Material.GOLDEN_APPLE);
        plugin.server.addRecipe(recipe);
    }

    private void netherwart() {
        ShapelessRecipe recipe = util.shapeless(Material.NETHER_WART, "netherwart_recipe");
        recipe.addIngredient(1, Material.NETHER_WART_BLOCK);
        recipe.getResult().setAmount(9);
        plugin.server.addRecipe(recipe);
    }

    private void cryingObsidian() {
        ShapelessRecipe recipe = util.shapeless(Material.CRYING_OBSIDIAN, "crying_obsidian_recipe");
        recipe.addIngredient(1, Material.OBSIDIAN);
        recipe.addIngredient(4, Material.GHAST_TEAR);
        recipe.getResult().setAmount(2);
        plugin.server.addRecipe(recipe);
    }

    private void endFrame() {
        ShapedRecipe recipe = util.shaped(Material.END_PORTAL_FRAME, "end_frame_recipe");
        recipe.shape("pap","eoe","eee");
        recipe.setIngredient('p', Material.ENDER_PEARL);
        recipe.setIngredient('a', Material.AIR);
        recipe.setIngredient('e', Material.END_STONE);
        recipe.setIngredient('o', Material.OBSIDIAN);
        plugin.server.addRecipe(recipe);
    }

    private void trident() {
        ShapedRecipe recipe = util.shaped(Material.TRIDENT, "trident_recipe");
        recipe.shape("add","apd","paa");
        recipe.setIngredient('a', Material.AIR);
        recipe.setIngredient('p', Material.PRISMARINE_SHARD);
        recipe.setIngredient('d', Material.DIAMOND);
        plugin.server.addRecipe(recipe);
    }

    private void elytra() {
        ShapedRecipe recipe = util.shaped(Material.ELYTRA, "elytra_recipe");
        recipe.shape("sds","mnm","mam");
        recipe.setIngredient('s', Material.STRING);
        recipe.setIngredient('d', Material.DIAMOND);
        recipe.setIngredient('m', Material.PHANTOM_MEMBRANE);
        recipe.setIngredient('n', Material.NETHER_STAR);
        recipe.setIngredient('a', Material.AIR);
        plugin.server.addRecipe(recipe);
    }

    private void netherstar() {
        ShapedRecipe recipe = util.shaped(Material.NETHER_STAR, "netherstar_recipe");
        recipe.shape("nwn","sss","bqb");
        recipe.setIngredient('n', Material.NETHER_WART);
        recipe.setIngredient('w', Material.WITHER_SKELETON_SKULL);
        recipe.setIngredient('s', Material.SOUL_SAND);
        recipe.setIngredient('b', Material.BLAZE_ROD);
        recipe.setIngredient('q', Material.QUARTZ);
        plugin.server.addRecipe(recipe);
    }

    private void saddle() {
        ShapedRecipe saddle = util.shaped(Material.SADDLE, "saddle_recipe");
        saddle.shape("wlw","sls","wlw");
        saddle.setIngredient('w', Material.STICK);
        saddle.setIngredient('s', Material.STRING);
        saddle.setIngredient('l', Material.LEATHER);
        plugin.server.addRecipe(saddle);
    }

    private void bell() {
        ShapedRecipe recipe = util.shaped(Material.BELL, "bell_recipe");
        recipe.shape("s*s","sis","sns");
        recipe.setIngredient('s', Material.STONE);
        recipe.setIngredient('*', Material.STICK);
        recipe.setIngredient('i', Material.GOLD_INGOT);
        recipe.setIngredient('n', Material.GOLD_NUGGET);
        plugin.server.addRecipe(recipe);
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

    private void spawner() {
        ShapedRecipe recipe = util.shaped(Material.SPAWNER, "spawner_recipe");
        recipe.shape("ccc","cec","ccc");
        recipe.setIngredient('c', Material.CHAIN);
        recipe.setIngredient('e', Material.PIG_SPAWN_EGG);
        plugin.server.addRecipe(recipe);
    }

    private void bedrock() {
        ShapelessRecipe recipe = util.shapeless(Material.BEDROCK, "bedrock_recipe");
        recipe.addIngredient(2, Material.OBSIDIAN);
        recipe.addIngredient(2, Material.STONE);
        recipe.addIngredient(1, Material.DIAMOND);
        recipe.addIngredient(1, Material.IRON_INGOT);
        recipe.addIngredient(1, Material.COAL);
        recipe.addIngredient(1, Material.WATER_BUCKET);
        recipe.addIngredient(1, Material.LAVA_BUCKET);
        recipe.getResult().setAmount(4);
        plugin.server.addRecipe(recipe);
    }

    private void barrier() {
        ShapedRecipe recipe = util.shaped(Material.BARRIER, "barrier_recipe");
        recipe.shape("ggg","gbg","ggg");
        recipe.setIngredient('g', Material.GLASS);
        recipe.setIngredient('b', Material.BEDROCK);
        plugin.server.addRecipe(recipe);
    }

    // MUSIC DISCS \\

    private void discs() {
        cd11();
        cd13();
        cdBLOCKS();
        cdCAT();
        cdCHIRP();
        cdFAR();
        cdMALL();
        cdMELLOHI();
        cdPIGSTEP();
        cdSTAL();
        cdSTRAD();
        cdWAIT();
        cdWARD();
    }

    private void cd13() {
        ShapedRecipe recipe = util.shaped(Material.MUSIC_DISC_13, "13_recipe");
        recipe.shape("fff","fyf","fff");
        recipe.setIngredient('f', Material.FLINT);
        recipe.setIngredient('y', Material.YELLOW_DYE);
        plugin.server.addRecipe(recipe);
    }

    private void cdCAT() {
        ShapedRecipe recipe = util.shaped(Material.MUSIC_DISC_CAT, "cat_recipe");
        recipe.shape("fff","fgf","fff");
        recipe.setIngredient('f', Material.FLINT);
        recipe.setIngredient('g', Material.LIME_DYE);
        plugin.server.addRecipe(recipe);
    }

    private void cdBLOCKS() {
        ShapedRecipe recipe = util.shaped(Material.MUSIC_DISC_BLOCKS, "blocks_recipe");
        recipe.shape("fff","fof","fff");
        recipe.setIngredient('f', Material.FLINT);
        recipe.setIngredient('o', Material.ORANGE_DYE);
        plugin.server.addRecipe(recipe);
    }

    private void cdCHIRP() {
        ShapedRecipe recipe = util.shaped(Material.MUSIC_DISC_CHIRP, "chirp_recipe");
        recipe.shape("fff","frf","fff");
        recipe.setIngredient('f', Material.FLINT);
        recipe.setIngredient('r', Material.RED_DYE);
        plugin.server.addRecipe(recipe);
    }

    private void cdFAR() {
        ShapelessRecipe recipe = util.shapeless(Material.MUSIC_DISC_FAR, "far_recipe");
        recipe.addIngredient(2, Material.BONE_MEAL);
        recipe.addIngredient(1, Material.MUSIC_DISC_CAT);
        plugin.server.addRecipe(recipe);
    }

    private void cdMALL() {
        ShapedRecipe recipe = util.shaped(Material.MUSIC_DISC_MALL, "mall_recipe");
        recipe.shape("fff","fpf","fff");
        recipe.setIngredient('f', Material.FLINT);
        recipe.setIngredient('p', Material.PURPLE_DYE);
        plugin.server.addRecipe(recipe);
    }

    private void cdMELLOHI() {
        ShapedRecipe recipe = util.shaped(Material.MUSIC_DISC_MELLOHI, "mellohi_recipe");
        recipe.shape("fff","fpf","fff");
        recipe.setIngredient('f', Material.FLINT);
        recipe.setIngredient('p', Material.PINK_DYE);
        plugin.server.addRecipe(recipe);
    }

    private void cdSTAL() {
        ShapedRecipe recipe = util.shaped(Material.MUSIC_DISC_STAL, "stal_recipe");
        recipe.shape("fff","fbf","fff");
        recipe.setIngredient('f', Material.FLINT);
        recipe.setIngredient('b', Material.BLACK_DYE);
        plugin.server.addRecipe(recipe);
    }

    private void cdSTRAD() {
        ShapedRecipe recipe = util.shaped(Material.MUSIC_DISC_STRAD, "strad_recipe");
        recipe.shape("fff","fwf","fff");
        recipe.setIngredient('f', Material.FLINT);
        recipe.setIngredient('w', Material.WHITE_DYE);
        plugin.server.addRecipe(recipe);
    }

    private void cdWARD() {
        ShapedRecipe recipe = util.shaped(Material.MUSIC_DISC_WARD, "ward_recipe");
        recipe.shape("fff","fgf","fff");
        recipe.setIngredient('f', Material.FLINT);
        recipe.setIngredient('g', Material.GREEN_DYE);
        plugin.server.addRecipe(recipe);
    }

    private void cd11() {
        ShapedRecipe recipe = util.shaped(Material.MUSIC_DISC_11, "11_recipe");
        recipe.shape("fff","fbf","ffa");
        recipe.setIngredient('f', Material.FLINT);
        recipe.setIngredient('b', Material.BLACK_DYE);
        recipe.setIngredient('a', Material.AIR);
        plugin.server.addRecipe(recipe);
    }

    private void cdWAIT() {
        ShapedRecipe recipe = util.shaped(Material.MUSIC_DISC_WAIT, "wait_recipe");
        recipe.shape("fff","fbf","fff");
        recipe.setIngredient('f', Material.FLINT);
        recipe.setIngredient('b', Material.BLUE_DYE);
        plugin.server.addRecipe(recipe);
    }

    private void cdPIGSTEP() {
        ShapedRecipe recipe = util.shaped(Material.MUSIC_DISC_PIGSTEP, "pigstep_recipe");
        recipe.shape("nqn","qyq","nqn");
        recipe.setIngredient('n', Material.NETHER_BRICK);
        recipe.setIngredient('q', Material.QUARTZ);
        recipe.setIngredient('y', Material.YELLOW_DYE);
        plugin.server.addRecipe(recipe);
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
        evokerEgg();
        foxEgg();
        ghastEgg();
        guardianEgg();
        hoglinEgg();
        huskEgg();
        llamaEgg();
        magmaCubeEgg();
        pandaEgg();
        phantomEgg();
        piglinEgg();
        pillagerEgg();
        polarBearEgg();
        ravagerEgg();
        shulkerEgg();
        silverfishEgg();
        skeletonEgg();
        slimeEgg();
        spiderEgg();
        strayEgg();
        striderEgg();
        vexEgg();
        vindicatorEgg();
        witchEgg();
        witherSkeletonEgg();
        wolfEgg();
        zoglinEgg();
        zombieEgg();
        zombieVillagerEgg();
        zPiglinEgg();
        //non-hostile
        batEgg();
        catEgg();
        chickenEgg();
        codEgg();
        cowEgg();
        donkeyEgg();
        horseEgg();
        mooshroomEgg();
        muleEgg();
        ocelotEgg();
        parrotEgg();
        pigEgg();
        pufferfishEgg();
        rabbitEgg();
        salmonEgg();
        sheepEgg();
        sHorseEgg();
        squidEgg();
        traderEgg();
        traderLlamaEgg();
        tropicalFishEgg();
        turtleEgg();
        villagerEgg();
        zHorseEgg();
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

    private void evokerEgg() {
        ShapedRecipe evoker = util.shaped(Material.EVOKER_SPAWN_EGG, "evoker_egg_recipe");
        evoker.shape("ata","eve","ata");
        evoker.setIngredient('a', Material.AIR);
        evoker.setIngredient('t', Material.TOTEM_OF_UNDYING);
        evoker.setIngredient('e', Material.EMERALD);
        evoker.setIngredient('v', Material.VINDICATOR_SPAWN_EGG);
        plugin.server.addRecipe(evoker);
    }

    private void foxEgg() {
        ShapedRecipe recipe = util.shaped(Material.FOX_SPAWN_EGG, "fox_egg_recipe");
        recipe.shape("asa","ses","asa");
        recipe.setIngredient('a', Material.AIR);
        recipe.setIngredient('s', Material.SWEET_BERRIES);
        recipe.setIngredient('e', Material.EGG);
        plugin.server.addRecipe(recipe);
    }

    private void ghastEgg() {
        ShapedRecipe recipe = util.shaped(Material.GHAST_SPAWN_EGG, "ghast_egg_recipe");
        recipe.shape("sts","geg","sts");
        recipe.setIngredient('s', Material.SOUL_SOIL);
        recipe.setIngredient('t', Material.GHAST_TEAR);
        recipe.setIngredient('g', Material.GUNPOWDER);
        recipe.setIngredient('e', Material.EGG);
        plugin.server.addRecipe(recipe);
    }

    private void guardianEgg() {
        ShapedRecipe recipe = util.shaped(Material.GUARDIAN_SPAWN_EGG, "guardian_egg_recipe");
        recipe.shape("apa","pep","apa");
        recipe.setIngredient('a', Material.AIR);
        recipe.setIngredient('p', Material.PRISMARINE_SHARD);
        recipe.setIngredient('e', Material.EGG);
        plugin.server.addRecipe(recipe);
    }

    private void hoglinEgg() {
        ShapedRecipe recipe = util.shaped(Material.HOGLIN_SPAWN_EGG, "hoglin_egg_recipe");
        recipe.shape("sls","pep","sls");
        recipe.setIngredient('s', Material.SOUL_SOIL);
        recipe.setIngredient('p', Material.PORKCHOP);
        recipe.setIngredient('l', Material.LEATHER);
        recipe.setIngredient('e', Material.EGG);
        plugin.server.addRecipe(recipe);
    }

    private void huskEgg() {
        ShapedRecipe recipe = util.shaped(Material.HUSK_SPAWN_EGG, "husk_egg_recipe");
        recipe.shape("asa","rer","asa");
        recipe.setIngredient('a', Material.AIR);
        recipe.setIngredient('s', Material.SAND);
        recipe.setIngredient('e', Material.ZOMBIE_SPAWN_EGG);
        recipe.setIngredient('r', Material.ROTTEN_FLESH);
        plugin.server.addRecipe(recipe);
    }

    private void llamaEgg() {
        ShapedRecipe recipe = util.shaped(Material.LLAMA_SPAWN_EGG, "llama_egg_recipe");
        recipe.shape("aca","lel","aca");
        recipe.setIngredient('a', Material.AIR);
        recipe.setIngredient('c', Material.WHITE_CARPET);
        recipe.setIngredient('e', Material.EGG);
        recipe.setIngredient('l', Material.LEATHER);
        plugin.server.addRecipe(recipe);
    }

    private void magmaCubeEgg() {
        ShapedRecipe recipe = util.shaped(Material.MAGMA_CUBE_SPAWN_EGG, "magma_cube_egg_recipe");
        recipe.shape("scs","cec","scs");
        recipe.setIngredient('s', Material.SOUL_SOIL);
        recipe.setIngredient('c', Material.MAGMA_CREAM);
        recipe.setIngredient('e', Material.EGG);
        plugin.server.addRecipe(recipe);
    }

    private void pandaEgg() {
        ShapedRecipe recipe = util.shaped(Material.PANDA_SPAWN_EGG, "panda_egg_recipe");
        recipe.shape("aba","beb","aba");
        recipe.setIngredient('a', Material.AIR);
        recipe.setIngredient('b', Material.BAMBOO);
        recipe.setIngredient('e', Material.EGG);
        plugin.server.addRecipe(recipe);
    }

    private void phantomEgg() {
        ShapedRecipe recipe = util.shaped(Material.PHANTOM_SPAWN_EGG, "phantom_egg_recipe");
        recipe.shape("ama","mem","ama");
        recipe.setIngredient('a', Material.AIR);
        recipe.setIngredient('m', Material.PHANTOM_MEMBRANE);
        recipe.setIngredient('e', Material.EGG);
        plugin.server.addRecipe(recipe);
    }

    private void piglinEgg() {
        ShapedRecipe recipe = util.shaped(Material.PIGLIN_SPAWN_EGG, "piglin_egg_recipe");
        recipe.shape("sgs","nen","sgs");
        recipe.setIngredient('s', Material.SOUL_SOIL);
        recipe.setIngredient('n', Material.GOLD_NUGGET);
        recipe.setIngredient('g', Material.GOLD_INGOT);
        recipe.setIngredient('e', Material.PIG_SPAWN_EGG);
        plugin.server.addRecipe(recipe);
    }

    private void pillagerEgg() {
        ShapedRecipe recipe = util.shaped(Material.PILLAGER_SPAWN_EGG, "pillager_egg_recipe");
        recipe.shape("aca","*e*","aca");
        recipe.setIngredient('a', Material.AIR);
        recipe.setIngredient('c', Material.CROSSBOW);
        recipe.setIngredient('*', Material.ARROW);
        recipe.setIngredient('e', Material.VILLAGER_SPAWN_EGG);
        plugin.server.addRecipe(recipe);
    }

    private void polarBearEgg() {
        ShapedRecipe recipe = util.shaped(Material.POLAR_BEAR_SPAWN_EGG, "polar_bear_egg_recipe");
        recipe.shape("aca","ses","aca");
        recipe.setIngredient('a', Material.AIR);
        recipe.setIngredient('c', Material.COD);
        recipe.setIngredient('e', Material.EGG);
        recipe.setIngredient('s', Material.SALMON);
        plugin.server.addRecipe(recipe);
    }

    private void ravagerEgg() {
        ShapedRecipe recipe = util.shaped(Material.RAVAGER_SPAWN_EGG, "ravager_egg_recipe");
        recipe.shape("asa","ses","asa");
        recipe.setIngredient('a', Material.AIR);
        recipe.setIngredient('s', Material.SADDLE);
        recipe.setIngredient('e', Material.HOGLIN_SPAWN_EGG);
        plugin.server.addRecipe(recipe);
    }

    private void shulkerEgg() {
        ShapedRecipe recipe = util.shaped(Material.SHULKER_SPAWN_EGG, "shulker_egg_recipe");
        recipe.shape("scs","beb","scs");
        recipe.setIngredient('s', Material.END_STONE);
        recipe.setIngredient('c', Material.CHORUS_FRUIT);
        recipe.setIngredient('b', Material.SHULKER_SHELL);
        recipe.setIngredient('e', Material.EGG);
        plugin.server.addRecipe(recipe);
    }

    private void silverfishEgg() {
        ShapedRecipe recipe = util.shaped(Material.SILVERFISH_SPAWN_EGG, "silverfish_egg_recipe");
        recipe.shape("asa","cec","asa");
        recipe.setIngredient('a', Material.AIR);
        recipe.setIngredient('s', Material.STONE_BRICKS);
        recipe.setIngredient('c', Material.CHISELED_STONE_BRICKS);
        recipe.setIngredient('e', Material.EGG);
        plugin.server.addRecipe(recipe);
    }

    private void skeletonEgg() {
        ShapedRecipe recipe = util.shaped(Material.SKELETON_SPAWN_EGG, "skeleton_egg_recipe");
        recipe.shape("aba","beb","aba");
        recipe.setIngredient('a', Material.AIR);
        recipe.setIngredient('b', Material.BONE);
        recipe.setIngredient('e', Material.EGG);
        plugin.server.addRecipe(recipe);
    }

    private void slimeEgg() {
        ShapedRecipe recipe = util.shaped(Material.SLIME_SPAWN_EGG, "slime_egg_recipe");
        recipe.shape("asa","ses","asa");
        recipe.setIngredient('a', Material.AIR);
        recipe.setIngredient('s', Material.SLIME_BALL);
        recipe.setIngredient('e', Material.EGG);
        plugin.server.addRecipe(recipe);
    }

    private void spiderEgg() {
        ShapedRecipe recipe = util.shaped(Material.SPIDER_SPAWN_EGG, "spider_egg_recipe");
        recipe.shape("aia","ses","aia");
        recipe.setIngredient('a', Material.AIR);
        recipe.setIngredient('i', Material.SPIDER_EYE);
        recipe.setIngredient('s', Material.STRING);
        recipe.setIngredient('e', Material.EGG);
        plugin.server.addRecipe(recipe);
    }

    private void strayEgg() {
        ShapedRecipe recipe = util.shaped(Material.STRAY_SPAWN_EGG, "stray_egg_recipe");
        recipe.shape("asa","iei","asa");
        recipe.setIngredient('a', Material.AIR);
        recipe.setIngredient('s', Material.SNOWBALL);
        recipe.setIngredient('e', Material.SKELETON_SPAWN_EGG);
        recipe.setIngredient('i', Material.ICE);
        plugin.server.addRecipe(recipe);
    }

    private void striderEgg() {
        ShapedRecipe recipe = util.shaped(Material.STRIDER_SPAWN_EGG, "strider_egg_recipe");
        recipe.shape("sls","lel","sls");
        recipe.setIngredient('s', Material.SOUL_SOIL);
        recipe.setIngredient('l', Material.LAVA_BUCKET);
        recipe.setIngredient('e', Material.EGG);
        plugin.server.addRecipe(recipe);
    }

    private void vexEgg() {
        ShapedRecipe recipe = util.shaped(Material.VEX_SPAWN_EGG, "vex_egg_recipe");
        recipe.shape("afa","fef","afa");
        recipe.setIngredient('a', Material.AIR);
        recipe.setIngredient('f', Material.FEATHER);
        recipe.setIngredient('e', Material.EVOKER_SPAWN_EGG);
        plugin.server.addRecipe(recipe);
    }

    private void vindicatorEgg() {
        ShapedRecipe recipe = util.shaped(Material.VINDICATOR_SPAWN_EGG, "vindicator_egg_recipe");
        recipe.shape("axa","*e*","axa");
        recipe.setIngredient('a', Material.AIR);
        recipe.setIngredient('x', Material.IRON_AXE);
        recipe.setIngredient('e', Material.PILLAGER_SPAWN_EGG);
        recipe.setIngredient('*', Material.EMERALD);
        plugin.server.addRecipe(recipe);
    }

    private void witchEgg() {
        ShapedRecipe recipe = util.shaped(Material.WITCH_SPAWN_EGG, "witch_egg_recipe");
        recipe.shape("apa","ses","apa");
        recipe.setIngredient('a', Material.AIR);
        recipe.setIngredient('p', Material.SPLASH_POTION);
        recipe.setIngredient('s', Material.STICK);
        recipe.setIngredient('e', Material.EGG);
        plugin.server.addRecipe(recipe);
    }

    private void witherSkeletonEgg() {
        ShapedRecipe recipe = util.shaped(Material.WITHER_SKELETON_SPAWN_EGG, "wither_skeleton_egg_recipe");
        recipe.shape("scs","cec","scs");
        recipe.setIngredient('s', Material.SOUL_SOIL);
        recipe.setIngredient('c', Material.COAL);
        recipe.setIngredient('e', Material.SKELETON_SPAWN_EGG);
        plugin.server.addRecipe(recipe);
    }

    private void wolfEgg() {
        ShapedRecipe recipe = util.shaped(Material.WOLF_SPAWN_EGG, "wolf_egg_recipe");
        recipe.shape("aba","nen","aba");
        recipe.setIngredient('a', Material.AIR);
        recipe.setIngredient('b', Material.BONE);
        recipe.setIngredient('n', Material.NAME_TAG);
        recipe.setIngredient('e', Material.EGG);
        plugin.server.addRecipe(recipe);
    }

    private void zoglinEgg() {
        ShapedRecipe recipe = util.shaped(Material.ZOGLIN_SPAWN_EGG, "zoglin_egg_recipe");
        recipe.shape("srs","rer","srs");
        recipe.setIngredient('s', Material.SOUL_SOIL);
        recipe.setIngredient('r', Material.ROTTEN_FLESH);
        recipe.setIngredient('e', Material.HOGLIN_SPAWN_EGG);
        plugin.server.addRecipe(recipe);
    }

    private void zombieEgg() {
        ShapedRecipe recipe = util.shaped(Material.ZOMBIE_SPAWN_EGG, "zombie_egg_recipe");
        recipe.shape("ara","rer","ara");
        recipe.setIngredient('a', Material.AIR);
        recipe.setIngredient('r', Material.ROTTEN_FLESH);
        recipe.setIngredient('e', Material.EGG);
        plugin.server.addRecipe(recipe);
    }

    private void zombieVillagerEgg() {
        ShapedRecipe recipe = util.shaped(Material.ZOMBIE_VILLAGER_SPAWN_EGG, "z_villager_egg_recipe");
        recipe.shape("ara","rer","ara");
        recipe.setIngredient('a', Material.AIR);
        recipe.setIngredient('r', Material.ROTTEN_FLESH);
        recipe.setIngredient('e', Material.VILLAGER_SPAWN_EGG);
        plugin.server.addRecipe(recipe);
    }

    private void zPiglinEgg() {
        ShapedRecipe recipe = util.shaped(Material.ZOMBIFIED_PIGLIN_SPAWN_EGG, "z_piglin_egg_recipe");
        recipe.shape("srs","rer","srs");
        recipe.setIngredient('s', Material.SOUL_SOIL);
        recipe.setIngredient('r', Material.ROTTEN_FLESH);
        recipe.setIngredient('e', Material.PIGLIN_SPAWN_EGG);
        plugin.server.addRecipe(recipe);
    }

    // NON-HOSTILE \\

    private void batEgg() {
        ShapedRecipe recipe = util.shaped(Material.BAT_SPAWN_EGG, "bat_egg_recipe");
        recipe.shape("aba","fef","aba");
        recipe.setIngredient('a', Material.AIR);
        recipe.setIngredient('b', Material.APPLE);
        recipe.setIngredient('e', Material.CHICKEN_SPAWN_EGG);
        recipe.setIngredient('f', Material.FEATHER);
        plugin.server.addRecipe(recipe);
    }

    private void catEgg() {
        ShapedRecipe recipe = util.shaped(Material.CAT_SPAWN_EGG, "cat_egg_recipe");
        recipe.shape("aca","ses","aca");
        recipe.setIngredient('a', Material.AIR);
        recipe.setIngredient('c', Material.COD);
        recipe.setIngredient('s', Material.SALMON);
        recipe.setIngredient('e', Material.EGG);
        plugin.server.addRecipe(recipe);
    }

    private void chickenEgg() {
        ShapedRecipe recipe = util.shaped(Material.CHICKEN_SPAWN_EGG, "chicken_egg_recipe");
        recipe.shape("afa","fef","afa");
        recipe.setIngredient('a', Material.AIR);
        recipe.setIngredient('f', Material.FEATHER);
        recipe.setIngredient('e', Material.EGG);
        plugin.server.addRecipe(recipe);
    }

    private void codEgg() {
        ShapedRecipe recipe = util.shaped(Material.COD_SPAWN_EGG, "cod_egg_recipe");
        recipe.shape("aca","cec","aca");
        recipe.setIngredient('a', Material.AIR);
        recipe.setIngredient('c', Material.COD);
        recipe.setIngredient('e', Material.EGG);
        plugin.server.addRecipe(recipe);
    }

    private void cowEgg() {
        ShapedRecipe recipe = util.shaped(Material.COW_SPAWN_EGG, "cow_egg_recipe");
        recipe.shape("ala","lel","ala");
        recipe.setIngredient('a', Material.AIR);
        recipe.setIngredient('l', Material.LEATHER);
        recipe.setIngredient('e', Material.EGG);
        plugin.server.addRecipe(recipe);
    }

    private void donkeyEgg() {
        ShapelessRecipe recipe = util.shapeless(Material.DONKEY_SPAWN_EGG, "donkey_egg_recipe");
        recipe.addIngredient(Material.HORSE_SPAWN_EGG);
        plugin.server.addRecipe(recipe);
    }

    private void horseEgg() {
        ShapedRecipe recipe = util.shaped(Material.HORSE_SPAWN_EGG, "horse_egg_recipe");
        recipe.shape("asa","lel","ala");
        recipe.setIngredient('a', Material.AIR);
        recipe.setIngredient('s', Material.SADDLE);
        recipe.setIngredient('e', Material.EGG);
        recipe.setIngredient('l', Material.LEATHER);
        plugin.server.addRecipe(recipe);
    }

    private void mooshroomEgg() {
        ShapedRecipe recipe = util.shaped(Material.MOOSHROOM_SPAWN_EGG, "mooshroom_egg_recipe");
        recipe.shape("ara","rer","ara");
        recipe.setIngredient('a', Material.AIR);
        recipe.setIngredient('r', Material.RED_MUSHROOM);
        recipe.setIngredient('e', Material.COW_SPAWN_EGG);
        plugin.server.addRecipe(recipe);
    }

    private void muleEgg() {
        ShapelessRecipe recipe = util.shapeless(Material.MULE_SPAWN_EGG, "mule_egg_recipe");
        recipe.addIngredient(2, Material.CHEST);
        recipe.addIngredient(1, Material.HORSE_SPAWN_EGG);
        plugin.server.addRecipe(recipe);
    }

    private void ocelotEgg() {
        ShapedRecipe recipe = util.shaped(Material.OCELOT_SPAWN_EGG, "ocelot_egg_recipe");
        recipe.shape("aca","ses","aca");
        recipe.setIngredient('a', Material.AIR);
        recipe.setIngredient('c', Material.COCOA_BEANS);
        recipe.setIngredient('s', Material.SALMON);
        recipe.setIngredient('e', Material.EGG);
        plugin.server.addRecipe(recipe);
    }

    private void parrotEgg() {
        ShapedRecipe recipe = util.shaped(Material.PARROT_SPAWN_EGG, "parrot_egg_recipe");
        recipe.shape("asa","fef","asa");
        recipe.setIngredient('a', Material.AIR);
        recipe.setIngredient('s', Material.WHEAT_SEEDS);
        recipe.setIngredient('f', Material.FEATHER);
        recipe.setIngredient('e', Material.EGG);
        plugin.server.addRecipe(recipe);
    }

    private void pigEgg() {
        ShapedRecipe recipe = util.shaped(Material.PIG_SPAWN_EGG, "pig_egg_recipe");
        recipe.shape("aca","cec","aca");
        recipe.setIngredient('a', Material.AIR);
        recipe.setIngredient('c', Material.PORKCHOP);
        recipe.setIngredient('e', Material.EGG);
        plugin.server.addRecipe(recipe);
    }

    private void pufferfishEgg() {
        ShapedRecipe recipe = util.shaped(Material.PUFFERFISH_SPAWN_EGG, "pufferfish_egg_recipe");
        recipe.shape("apa","pep","apa");
        recipe.setIngredient('a', Material.AIR);
        recipe.setIngredient('p', Material.PUFFERFISH);
        recipe.setIngredient('e', Material.EGG);
        plugin.server.addRecipe(recipe);
    }

    private void rabbitEgg() {
        ShapedRecipe recipe = util.shaped(Material.RABBIT_SPAWN_EGG, "rabbit_egg_recipe");
        recipe.shape("aha","heh","afa");
        recipe.setIngredient('a', Material.AIR);
        recipe.setIngredient('h', Material.RABBIT_HIDE);
        recipe.setIngredient('e', Material.EGG);
        recipe.setIngredient('f', Material.RABBIT_FOOT);
        plugin.server.addRecipe(recipe);
    }

    private void salmonEgg() {
        ShapedRecipe recipe = util.shaped(Material.SALMON_SPAWN_EGG, "salmon_egg_recipe");
        recipe.shape("asa","ses","asa");
        recipe.setIngredient('a', Material.AIR);
        recipe.setIngredient('s', Material.SALMON);
        recipe.setIngredient('e', Material.EGG);
        plugin.server.addRecipe(recipe);
    }

    private void sheepEgg() {
        ShapedRecipe recipe = util.shaped(Material.SHEEP_SPAWN_EGG, "sheep_egg_recipe");
        recipe.shape("awa","mem","awa");
        recipe.setIngredient('a', Material.AIR);
        recipe.setIngredient('w', Material.WHITE_WOOL);
        recipe.setIngredient('m', Material.MUTTON);
        recipe.setIngredient('e', Material.EGG);
        plugin.server.addRecipe(recipe);
    }

    private void sHorseEgg() {
        ShapelessRecipe recipe = util.shapeless(Material.SKELETON_HORSE_SPAWN_EGG, "s_horse_egg_recipe");
        recipe.addIngredient(1, Material.SKELETON_SPAWN_EGG);
        recipe.addIngredient(1, Material.HORSE_SPAWN_EGG);
        plugin.server.addRecipe(recipe);
    }

    private void squidEgg() {
        ShapedRecipe recipe = util.shaped(Material.SQUID_SPAWN_EGG, "squid_egg_recipe");
        recipe.shape("aia","iei","aia");
        recipe.setIngredient('a', Material.AIR);
        recipe.setIngredient('i', Material.INK_SAC);
        recipe.setIngredient('e', Material.EGG);
        plugin.server.addRecipe(recipe);
    }

    private void tropicalFishEgg() {
        ShapelessRecipe recipe = util.shapeless(Material.TROPICAL_FISH_SPAWN_EGG, "t_fish_egg_recipe");
        recipe.addIngredient(1, Material.COD);
        recipe.addIngredient(1, Material.EGG);
        recipe.addIngredient(1, Material.PUFFERFISH);
        recipe.addIngredient(1, Material.SALMON);
        recipe.addIngredient(1, Material.TROPICAL_FISH);
        plugin.server.addRecipe(recipe);
    }

    private void traderLlamaEgg() {
        ShapelessRecipe recipe = util.shapeless(Material.TRADER_LLAMA_SPAWN_EGG, "t_llama_egg_recipe");
        recipe.addIngredient(1, Material.LLAMA_SPAWN_EGG);
        recipe.addIngredient(1, Material.WANDERING_TRADER_SPAWN_EGG);
        plugin.server.addRecipe(recipe);
    }

    private void turtleEgg() {
        ShapedRecipe recipe = util.shaped(Material.TURTLE_SPAWN_EGG, "turtle_egg_recipe");
        recipe.shape("asa","ses","asa");
        recipe.setIngredient('a', Material.AIR);
        recipe.setIngredient('s', Material.SCUTE);
        recipe.setIngredient('e', Material.EGG);
        plugin.server.addRecipe(recipe);
    }

    private void villagerEgg() {
        ShapedRecipe recipe = util.shaped(Material.VILLAGER_SPAWN_EGG, "villager_egg_recipe");
        recipe.shape("aea","p*p","aea");
        recipe.setIngredient('a', Material.AIR);
        recipe.setIngredient('e', Material.EGG);
        recipe.setIngredient('p', Material.POPPY);
        recipe.setIngredient('*', Material.EGG);
        plugin.server.addRecipe(recipe);
    }

    private void traderEgg() {
        ShapedRecipe recipe = util.shaped(Material.WANDERING_TRADER_SPAWN_EGG, "trader_egg_recipe");
        recipe.shape("aea","e*e","aea");
        recipe.setIngredient('a', Material.AIR);
        recipe.setIngredient('e', Material.EMERALD);
        recipe.setIngredient('*', Material.VILLAGER_SPAWN_EGG);
        plugin.server.addRecipe(recipe);
    }

    private void zHorseEgg() {
        ShapelessRecipe recipe = util.shapeless(Material.ZOMBIE_HORSE_SPAWN_EGG, "z_horse_egg_recipe");
        recipe.addIngredient(1, Material.ZOMBIE_SPAWN_EGG);
        recipe.addIngredient(1, Material.HORSE_SPAWN_EGG);
        plugin.server.addRecipe(recipe);
    }
}
