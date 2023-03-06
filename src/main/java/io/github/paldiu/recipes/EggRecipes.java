package io.github.paldiu.recipes;

import io.github.paldiu.Uncraftables;
import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SpawnEggMeta;

public class EggRecipes extends Craftable {
    public EggRecipes(Uncraftables plugin) {
        super(plugin);

        if (!getConfigValues().eggsEnabled()) return;

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
        piglinBruteEgg();
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
        ShapedRecipe beeEgg = getUtil().shaped(Material.BEE_SPAWN_EGG, "bee_egg_recipe");
        beeEgg.shape("aha", "heh", "aha");
        beeEgg.setIngredient('a', Material.AIR);
        beeEgg.setIngredient('h', Material.HONEYCOMB);
        beeEgg.setIngredient('e', Material.EGG);
        getPlugin().getServer().addRecipe(beeEgg);
    }

    private void blazeEgg() {
        ShapedRecipe blazeEgg = getUtil().shaped(Material.BLAZE_SPAWN_EGG, "blaze_egg_recipe");
        blazeEgg.shape("sbs", "beb", "sbs");
        blazeEgg.setIngredient('s', Material.SOUL_SOIL);
        blazeEgg.setIngredient('b', Material.BLAZE_ROD);
        blazeEgg.setIngredient('e', Material.EGG);
        getPlugin().getServer().addRecipe(blazeEgg);
    }

    private void caveSpiderEgg() {
        ShapedRecipe caveSpiderEgg = getUtil().shaped(Material.CAVE_SPIDER_SPAWN_EGG, "cave_spider_egg_recipe");
        caveSpiderEgg.shape("afa", "ses", "afa");
        caveSpiderEgg.setIngredient('a', Material.AIR);
        caveSpiderEgg.setIngredient('f', Material.FERMENTED_SPIDER_EYE);
        caveSpiderEgg.setIngredient('s', Material.SPIDER_EYE);
        caveSpiderEgg.setIngredient('e', Material.SPIDER_SPAWN_EGG);
        getPlugin().getServer().addRecipe(caveSpiderEgg);
    }

    private void creeperEgg() {
        ShapedRecipe creeperEgg = getUtil().shaped(Material.CREEPER_SPAWN_EGG, "creeper_egg_recipe");
        creeperEgg.shape("aga", "geg", "aga");
        creeperEgg.setIngredient('a', Material.AIR);
        creeperEgg.setIngredient('g', Material.GUNPOWDER);
        creeperEgg.setIngredient('e', Material.EGG);
        getPlugin().getServer().addRecipe(creeperEgg);
    }

    private void dolphinEgg() {
        ShapedRecipe dolphin = getUtil().shaped(Material.DOLPHIN_SPAWN_EGG, "dolphin_egg_recipe");
        dolphin.shape("aca", "wew", "aca");
        dolphin.setIngredient('a', Material.AIR);
        dolphin.setIngredient('w', Material.WATER_BUCKET);
        dolphin.setIngredient('c', Material.TROPICAL_FISH);
        dolphin.setIngredient('e', Material.EGG);
        getPlugin().getServer().addRecipe(dolphin);
    }

    private void drownedEgg() {
        ShapedRecipe drowned = getUtil().shaped(Material.DROWNED_SPAWN_EGG, "drowned_egg_recipe");
        drowned.shape("awa", "fef", "awa");
        drowned.setIngredient('a', Material.AIR);
        drowned.setIngredient('w', Material.WATER_BUCKET);
        drowned.setIngredient('f', Material.KELP);
        drowned.setIngredient('e', Material.ZOMBIE_SPAWN_EGG);
        getPlugin().getServer().addRecipe(drowned);
    }

    private void elderGuardEgg() {
        ShapedRecipe eldGuard = getUtil().shaped(Material.ELDER_GUARDIAN_SPAWN_EGG, "elder_guardian_egg_recipe");
        eldGuard.shape(
                "sbs",
                "pep",
                "sps");
        eldGuard.setIngredient('s', Material.PRISMARINE_CRYSTALS);
        eldGuard.setIngredient('p', Material.PRISMARINE_SHARD);
        eldGuard.setIngredient('e', Material.GUARDIAN_SPAWN_EGG);
        eldGuard.setIngredient('b', Material.BEACON);
        getPlugin().getServer().addRecipe(eldGuard);
    }

    private void endermanEgg() {
        ShapedRecipe enderman = getUtil().shaped(Material.ENDERMAN_SPAWN_EGG, "enderman_egg_recipe");
        enderman.shape(
                "apa",
                "pep",
                "apa");
        enderman.setIngredient('a', Material.AIR);
        enderman.setIngredient('p', Material.ENDER_PEARL);
        enderman.setIngredient('e', Material.EGG);
        getPlugin().getServer().addRecipe(enderman);
    }

    private void endermiteEgg() {
        ShapedRecipe endermite = getUtil().shaped(Material.ENDERMITE_SPAWN_EGG, "endermite_egg_recipe");
        endermite.shape("apa", "cec", "apa");
        endermite.setIngredient('a', Material.AIR);
        endermite.setIngredient('p', Material.ENDER_PEARL);
        endermite.setIngredient('c', Material.CHORUS_FRUIT);
        endermite.setIngredient('e', Material.EGG);
        getPlugin().getServer().addRecipe(endermite);
    }

    private void evokerEgg() {
        ShapedRecipe evoker = getUtil().shaped(Material.EVOKER_SPAWN_EGG, "evoker_egg_recipe");
        evoker.shape("ata", "eve", "ata");
        evoker.setIngredient('a', Material.AIR);
        evoker.setIngredient('t', Material.TOTEM_OF_UNDYING);
        evoker.setIngredient('e', Material.EMERALD);
        evoker.setIngredient('v', Material.VINDICATOR_SPAWN_EGG);
        getPlugin().getServer().addRecipe(evoker);
    }

    private void foxEgg() {
        ShapedRecipe fox = getUtil().shaped(Material.FOX_SPAWN_EGG, "fox_egg_recipe");
        fox.shape("asa", "ses", "asa");
        fox.setIngredient('a', Material.AIR);
        fox.setIngredient('s', Material.SWEET_BERRIES);
        fox.setIngredient('e', Material.EGG);
        getPlugin().getServer().addRecipe(fox);
    }

    private void ghastEgg() {
        ShapedRecipe ghast = getUtil().shaped(Material.GHAST_SPAWN_EGG, "ghast_egg_recipe");
        ghast.shape("sts", "geg", "sts");
        ghast.setIngredient('s', Material.SOUL_SOIL);
        ghast.setIngredient('t', Material.GHAST_TEAR);
        ghast.setIngredient('g', Material.GUNPOWDER);
        ghast.setIngredient('e', Material.EGG);
        getPlugin().getServer().addRecipe(ghast);
    }

    private void guardianEgg() {
        ShapedRecipe guardian = getUtil().shaped(Material.GUARDIAN_SPAWN_EGG, "guardian_egg_recipe");
        guardian.shape("apa", "pep", "apa");
        guardian.setIngredient('a', Material.AIR);
        guardian.setIngredient('p', Material.PRISMARINE_SHARD);
        guardian.setIngredient('e', Material.EGG);
        getPlugin().getServer().addRecipe(guardian);
    }

    private void hoglinEgg() {
        ShapedRecipe hoglin = getUtil().shaped(Material.HOGLIN_SPAWN_EGG, "hoglin_egg_recipe");
        hoglin.shape("sls", "pep", "sls");
        hoglin.setIngredient('s', Material.SOUL_SOIL);
        hoglin.setIngredient('p', Material.PORKCHOP);
        hoglin.setIngredient('l', Material.LEATHER);
        hoglin.setIngredient('e', Material.EGG);
        getPlugin().getServer().addRecipe(hoglin);
    }

    private void huskEgg() {
        ShapedRecipe husk = getUtil().shaped(Material.HUSK_SPAWN_EGG, "husk_egg_recipe");
        husk.shape("asa", "ses", "asa");
        husk.setIngredient('a', Material.AIR);
        husk.setIngredient('s', Material.SAND);
        husk.setIngredient('e', Material.ZOMBIE_SPAWN_EGG);
        getPlugin().getServer().addRecipe(husk);
    }

    private void llamaEgg() {
        ShapedRecipe llama = getUtil().shaped(Material.LLAMA_SPAWN_EGG, "llama_egg_recipe");
        llama.shape("aca", "lel", "ana");
        llama.setIngredient('a', Material.AIR);
        llama.setIngredient('c', Material.WHITE_CARPET);
        llama.setIngredient('n', Material.IRON_NUGGET);
        llama.setIngredient('e', Material.EGG);
        llama.setIngredient('l', Material.LEATHER);
        getPlugin().getServer().addRecipe(llama);
    }

    private void magmaCubeEgg() {
        ShapedRecipe magma_cube = getUtil().shaped(Material.MAGMA_CUBE_SPAWN_EGG, "magma_cube_egg_recipe");
        magma_cube.shape("scs", "cec", "scs");
        magma_cube.setIngredient('s', Material.SOUL_SOIL);
        magma_cube.setIngredient('c', Material.MAGMA_CREAM);
        magma_cube.setIngredient('e', Material.SLIME_SPAWN_EGG);
        getPlugin().getServer().addRecipe(magma_cube);
    }

    private void pandaEgg() {
        ShapedRecipe panda = getUtil().shaped(Material.PANDA_SPAWN_EGG, "panda_egg_recipe");
        panda.shape("aba", "beb", "aba");
        panda.setIngredient('a', Material.AIR);
        panda.setIngredient('b', Material.BAMBOO);
        panda.setIngredient('e', Material.EGG);
        getPlugin().getServer().addRecipe(panda);
    }

    private void phantomEgg() {
        ShapedRecipe phantom = getUtil().shaped(Material.PHANTOM_SPAWN_EGG, "phantom_egg_recipe");
        phantom.shape("ama", "mem", "ama");
        phantom.setIngredient('a', Material.AIR);
        phantom.setIngredient('m', Material.PHANTOM_MEMBRANE);
        phantom.setIngredient('e', Material.EGG);
        getPlugin().getServer().addRecipe(phantom);
    }

    private void piglinEgg() {
        ShapedRecipe piglin = getUtil().shaped(Material.PIGLIN_SPAWN_EGG, "piglin_egg_recipe");
        piglin.shape("sgs", "nen", "sgs");
        piglin.setIngredient('s', Material.SOUL_SOIL);
        piglin.setIngredient('n', Material.GOLD_NUGGET);
        piglin.setIngredient('g', Material.GOLD_INGOT);
        piglin.setIngredient('e', Material.PIG_SPAWN_EGG);
        getPlugin().getServer().addRecipe(piglin);
    }

    private void piglinBruteEgg() {
        ShapedRecipe piglin_brute = getUtil().shaped(Material.PIGLIN_BRUTE_SPAWN_EGG, "piglin_brute_egg_recipe");
        piglin_brute.shape("sgs", "ael", "sgs");
        piglin_brute.setIngredient('s', Material.SOUL_SOIL);
        piglin_brute.setIngredient('a', Material.GOLDEN_AXE);
        piglin_brute.setIngredient('l', Material.LEATHER);
        piglin_brute.setIngredient('g', Material.GOLD_INGOT);
        piglin_brute.setIngredient('e', Material.PIGLIN_SPAWN_EGG);
    }

    private void pillagerEgg() {
        ShapedRecipe pillager = getUtil().shaped(Material.PILLAGER_SPAWN_EGG, "pillager_egg_recipe");
        pillager.shape("aca", "wew", "ada");
        pillager.setIngredient('a', Material.AIR);
        pillager.setIngredient('c', Material.CROSSBOW);
        pillager.setIngredient('d', Material.EMERALD);
        pillager.setIngredient('w', Material.ARROW);
        pillager.setIngredient('e', Material.VILLAGER_SPAWN_EGG);
        getPlugin().getServer().addRecipe(pillager);
    }

    private void polarBearEgg() {
        ShapedRecipe polar_bear = getUtil().shaped(Material.POLAR_BEAR_SPAWN_EGG, "polar_bear_egg_recipe");
        polar_bear.shape("aca", "ses", "aca");
        polar_bear.setIngredient('a', Material.AIR);
        polar_bear.setIngredient('c', Material.COD);
        polar_bear.setIngredient('e', Material.EGG);
        polar_bear.setIngredient('s', Material.SALMON);
        getPlugin().getServer().addRecipe(polar_bear);
    }

    private void ravagerEgg() {
        ShapedRecipe ravager = getUtil().shaped(Material.RAVAGER_SPAWN_EGG, "ravager_egg_recipe");
        ravager.shape("asa", "ded", "ada");
        ravager.setIngredient('a', Material.AIR);
        ravager.setIngredient('s', Material.SADDLE);
        ravager.setIngredient('d', Material.EMERALD);
        ravager.setIngredient('e', Material.HOGLIN_SPAWN_EGG);
        getPlugin().getServer().addRecipe(ravager);
    }

    private void shulkerEgg() {
        ShapedRecipe shulker = getUtil().shaped(Material.SHULKER_SPAWN_EGG, "shulker_egg_recipe");
        shulker.shape("scs", "beb", "scs");
        shulker.setIngredient('s', Material.END_STONE);
        shulker.setIngredient('b', Material.CHORUS_FRUIT);
        shulker.setIngredient('c', Material.SHULKER_SHELL);
        shulker.setIngredient('e', Material.EGG);
        getPlugin().getServer().addRecipe(shulker);
    }

    private void silverfishEgg() {
        ShapedRecipe silverfish = getUtil().shaped(Material.SILVERFISH_SPAWN_EGG, "silverfish_egg_recipe");
        silverfish.shape("asa", "cec", "asa");
        silverfish.setIngredient('a', Material.AIR);
        silverfish.setIngredient('s', Material.STONE_BRICKS);
        silverfish.setIngredient('c', Material.CHISELED_STONE_BRICKS);
        silverfish.setIngredient('e', Material.EGG);
        getPlugin().getServer().addRecipe(silverfish);
    }

    private void skeletonEgg() {
        ShapedRecipe skeleton = getUtil().shaped(Material.SKELETON_SPAWN_EGG, "skeleton_egg_recipe");
        skeleton.shape("asa", "bex", "aba");
        skeleton.setIngredient('a', Material.AIR);
        skeleton.setIngredient('b', Material.BONE);
        skeleton.setIngredient('x', Material.BOW);
        skeleton.setIngredient('s', Material.SKELETON_SKULL);
        skeleton.setIngredient('e', Material.EGG);
        getPlugin().getServer().addRecipe(skeleton);
    }

    private void slimeEgg() {
        ShapedRecipe slime = getUtil().shaped(Material.SLIME_SPAWN_EGG, "slime_egg_recipe");
        slime.shape("asa", "ses", "asa");
        slime.setIngredient('a', Material.AIR);
        slime.setIngredient('s', Material.SLIME_BALL);
        slime.setIngredient('e', Material.EGG);
        getPlugin().getServer().addRecipe(slime);
    }

    private void spiderEgg() {
        ShapedRecipe spider = getUtil().shaped(Material.SPIDER_SPAWN_EGG, "spider_egg_recipe");
        spider.shape("aia", "ses", "aia");
        spider.setIngredient('a', Material.AIR);
        spider.setIngredient('i', Material.SPIDER_EYE);
        spider.setIngredient('s', Material.STRING);
        spider.setIngredient('e', Material.EGG);
        getPlugin().getServer().addRecipe(spider);
    }

    private void strayEgg() {
        ShapedRecipe stray = getUtil().shaped(Material.STRAY_SPAWN_EGG, "stray_egg_recipe");
        stray.shape("asa", "iei", "asa");
        stray.setIngredient('a', Material.AIR);
        stray.setIngredient('s', Material.BLUE_ICE);
        stray.setIngredient('e', Material.SKELETON_SPAWN_EGG);
        stray.setIngredient('i', Material.PACKED_ICE);
        getPlugin().getServer().addRecipe(stray);
    }

    private void striderEgg() {
        ShapedRecipe strider = getUtil().shaped(Material.STRIDER_SPAWN_EGG, "strider_egg_recipe");
        strider.shape("sls", "lel", "sls");
        strider.setIngredient('s', Material.SOUL_SOIL);
        strider.setIngredient('l', Material.LAVA_BUCKET);
        strider.setIngredient('e', Material.EGG);
        getPlugin().getServer().addRecipe(strider);
    }

    private void vexEgg() {
        ShapedRecipe vex = getUtil().shaped(Material.VEX_SPAWN_EGG, "vex_egg_recipe");
        vex.shape("afa", "fef", "afa");
        vex.setIngredient('a', Material.AIR);
        vex.setIngredient('f', Material.FEATHER);
        vex.setIngredient('e', Material.EVOKER_SPAWN_EGG);
        getPlugin().getServer().addRecipe(vex);
    }

    private void vindicatorEgg() {
        ShapedRecipe vindicator = getUtil().shaped(Material.VINDICATOR_SPAWN_EGG, "vindicator_egg_recipe");
        vindicator.shape("a*a", "*ex", "a*a");
        vindicator.setIngredient('a', Material.AIR);
        vindicator.setIngredient('x', Material.IRON_AXE);
        vindicator.setIngredient('e', Material.PILLAGER_SPAWN_EGG);
        vindicator.setIngredient('*', Material.EMERALD);
        getPlugin().getServer().addRecipe(vindicator);
    }

    private void witchEgg() {
        ShapedRecipe witch = getUtil().shaped(Material.WITCH_SPAWN_EGG, "witch_egg_recipe");
        witch.shape("asa", "pep", "asa");
        witch.setIngredient('a', Material.AIR);
        witch.setIngredient('p', Material.SPLASH_POTION);
        witch.setIngredient('s', Material.VINE);
        witch.setIngredient('e', Material.EGG);
        getPlugin().getServer().addRecipe(witch);
    }

    private void witherSkeletonEgg() {
        ShapedRecipe wither_skeleton = getUtil().shaped(Material.WITHER_SKELETON_SPAWN_EGG, "wither_skeleton_egg_recipe");
        wither_skeleton.shape("scs", "cec", "scs");
        wither_skeleton.setIngredient('s', Material.SOUL_SOIL);
        wither_skeleton.setIngredient('c', Material.COAL);
        wither_skeleton.setIngredient('e', Material.SKELETON_SPAWN_EGG);
        getPlugin().getServer().addRecipe(wither_skeleton);
    }

    private void wolfEgg() {
        ShapedRecipe wolf = getUtil().shaped(Material.WOLF_SPAWN_EGG, "wolf_egg_recipe");
        wolf.shape("aba", "nen", "aba");
        wolf.setIngredient('a', Material.AIR);
        wolf.setIngredient('b', Material.BONE);
        wolf.setIngredient('n', Material.NAME_TAG);
        wolf.setIngredient('e', Material.EGG);
        getPlugin().getServer().addRecipe(wolf);
    }

    private void zoglinEgg() {
        ShapedRecipe zoglin = getUtil().shaped(Material.ZOGLIN_SPAWN_EGG, "zoglin_egg_recipe");
        zoglin.shape("srs", "rer", "srs");
        zoglin.setIngredient('s', Material.SOUL_SOIL);
        zoglin.setIngredient('r', Material.ROTTEN_FLESH);
        zoglin.setIngredient('e', Material.HOGLIN_SPAWN_EGG);
        getPlugin().getServer().addRecipe(zoglin);
    }

    private void zombieEgg() {
        ShapedRecipe zombie = getUtil().shaped(Material.ZOMBIE_SPAWN_EGG, "zombie_egg_recipe");
        zombie.shape("ara", "rer", "ara");
        zombie.setIngredient('a', Material.AIR);
        zombie.setIngredient('r', Material.ROTTEN_FLESH);
        zombie.setIngredient('e', Material.EGG);
        getPlugin().getServer().addRecipe(zombie);
    }

    private void zombieVillagerEgg() {
        ShapedRecipe zombie_villager = getUtil().shaped(Material.ZOMBIE_VILLAGER_SPAWN_EGG, "z_villager_egg_recipe");
        zombie_villager.shape("ara", "rer", "ara");
        zombie_villager.setIngredient('a', Material.AIR);
        zombie_villager.setIngredient('r', Material.ROTTEN_FLESH);
        zombie_villager.setIngredient('e', Material.VILLAGER_SPAWN_EGG);
        getPlugin().getServer().addRecipe(zombie_villager);
    }

    private void zPiglinEgg() {
        ShapedRecipe zombie_piglin = getUtil().shaped(Material.ZOMBIFIED_PIGLIN_SPAWN_EGG, "z_piglin_egg_recipe");
        zombie_piglin.shape("srs", "rer", "srs");
        zombie_piglin.setIngredient('s', Material.SOUL_SOIL);
        zombie_piglin.setIngredient('r', Material.ROTTEN_FLESH);
        zombie_piglin.setIngredient('e', Material.PIGLIN_SPAWN_EGG);
        getPlugin().getServer().addRecipe(zombie_piglin);
    }

    // NON-HOSTILE \\

    private void batEgg() {
        ShapedRecipe bat = getUtil().shaped(Material.BAT_SPAWN_EGG, "bat_egg_recipe");
        bat.shape("aba", "fef", "aba");
        bat.setIngredient('a', Material.AIR);
        bat.setIngredient('b', Material.APPLE);
        bat.setIngredient('e', Material.CHICKEN_SPAWN_EGG);
        bat.setIngredient('f', Material.FEATHER);
        getPlugin().getServer().addRecipe(bat);
    }

    private void catEgg() {
        ShapedRecipe cat = getUtil().shaped(Material.CAT_SPAWN_EGG, "cat_egg_recipe");
        cat.shape("aca", "ses", "aca");
        cat.setIngredient('a', Material.AIR);
        cat.setIngredient('c', Material.COD);
        cat.setIngredient('s', Material.SALMON);
        cat.setIngredient('e', Material.EGG);
        getPlugin().getServer().addRecipe(cat);
    }

    private void chickenEgg() {
        ShapedRecipe chimken = getUtil().shaped(Material.CHICKEN_SPAWN_EGG, "chicken_egg_recipe");
        chimken.shape("afa", "fef", "afa");
        chimken.setIngredient('a', Material.AIR);
        chimken.setIngredient('f', Material.FEATHER);
        chimken.setIngredient('e', Material.EGG);
        getPlugin().getServer().addRecipe(chimken);
    }

    private void codEgg() {
        ShapedRecipe cod = getUtil().shaped(Material.COD_SPAWN_EGG, "cod_egg_recipe");
        cod.shape("aca", "cec", "aca");
        cod.setIngredient('a', Material.AIR);
        cod.setIngredient('c', Material.COD);
        cod.setIngredient('e', Material.EGG);
        getPlugin().getServer().addRecipe(cod);
    }

    private void cowEgg() {
        ShapedRecipe coo = getUtil().shaped(Material.COW_SPAWN_EGG, "cow_egg_recipe");
        coo.shape("ala", "lel", "ala");
        coo.setIngredient('a', Material.AIR);
        coo.setIngredient('l', Material.LEATHER);
        coo.setIngredient('e', Material.EGG);
        getPlugin().getServer().addRecipe(coo);
    }

    private void donkeyEgg() {
        ShapelessRecipe donkeh = getUtil().shapeless(Material.DONKEY_SPAWN_EGG, "donkey_egg_recipe");
        donkeh.addIngredient(Material.HORSE_SPAWN_EGG);
        getPlugin().getServer().addRecipe(donkeh);
    }

    private void horseEgg() {
        ShapedRecipe hoarse = getUtil().shaped(Material.HORSE_SPAWN_EGG, "horse_egg_recipe");
        hoarse.shape("asa", "lel", "ala");
        hoarse.setIngredient('a', Material.AIR);
        hoarse.setIngredient('s', Material.SADDLE);
        hoarse.setIngredient('e', Material.EGG);
        hoarse.setIngredient('l', Material.LEATHER);
        getPlugin().getServer().addRecipe(hoarse);
    }

    private void mooshroomEgg() {
        ShapedRecipe coo_pat = getUtil().shaped(Material.MOOSHROOM_SPAWN_EGG, "mooshroom_egg_recipe");
        coo_pat.shape("ara", "rer", "ara");
        coo_pat.setIngredient('a', Material.AIR);
        coo_pat.setIngredient('r', Material.RED_MUSHROOM);
        coo_pat.setIngredient('e', Material.COW_SPAWN_EGG);
        getPlugin().getServer().addRecipe(coo_pat);
    }

    private void muleEgg() {
        ShapelessRecipe muhle = getUtil().shapeless(Material.MULE_SPAWN_EGG, "mule_egg_recipe");
        muhle.addIngredient(2, Material.CHEST);
        muhle.addIngredient(1, Material.HORSE_SPAWN_EGG);
        getPlugin().getServer().addRecipe(muhle);
    }

    private void ocelotEgg() {
        ShapedRecipe ocky_way = getUtil().shaped(Material.OCELOT_SPAWN_EGG, "ocelot_egg_recipe");
        ocky_way.shape("aca", "ses", "aca");
        ocky_way.setIngredient('a', Material.AIR);
        ocky_way.setIngredient('c', Material.COCOA_BEANS);
        ocky_way.setIngredient('s', Material.SALMON);
        ocky_way.setIngredient('e', Material.EGG);
        getPlugin().getServer().addRecipe(ocky_way);
    }

    private void parrotEgg() {
        ShapedRecipe garrote = getUtil().shaped(Material.PARROT_SPAWN_EGG, "parrot_egg_recipe");
        garrote.shape("asa", "fef", "asa");
        garrote.setIngredient('a', Material.AIR);
        garrote.setIngredient('s', Material.WHEAT_SEEDS);
        garrote.setIngredient('f', Material.FEATHER);
        garrote.setIngredient('e', Material.EGG);
        getPlugin().getServer().addRecipe(garrote);
    }

    private void pigEgg() {
        ShapedRecipe pidge = getUtil().shaped(Material.PIG_SPAWN_EGG, "pig_egg_recipe");
        pidge.shape("aca", "cec", "aca");
        pidge.setIngredient('a', Material.AIR);
        pidge.setIngredient('c', Material.PORKCHOP);
        pidge.setIngredient('e', Material.EGG);
        getPlugin().getServer().addRecipe(pidge);
    }

    private void pufferfishEgg() {
        ShapedRecipe paisson = getUtil().shaped(Material.PUFFERFISH_SPAWN_EGG, "pufferfish_egg_recipe");
        paisson.shape("apa", "pep", "apa");
        paisson.setIngredient('a', Material.AIR);
        paisson.setIngredient('p', Material.PUFFERFISH);
        paisson.setIngredient('e', Material.EGG);
        getPlugin().getServer().addRecipe(paisson);
    }

    private void rabbitEgg() {
        ShapedRecipe rebillet = getUtil().shaped(Material.RABBIT_SPAWN_EGG, "rabbit_egg_recipe");
        rebillet.shape("aha", "heh", "afa");
        rebillet.setIngredient('a', Material.AIR);
        rebillet.setIngredient('h', Material.RABBIT_HIDE);
        rebillet.setIngredient('e', Material.EGG);
        rebillet.setIngredient('f', Material.RABBIT_FOOT);
        getPlugin().getServer().addRecipe(rebillet);
    }

    private void salmonEgg() {
        ShapedRecipe slammin_salmon = getUtil().shaped(Material.SALMON_SPAWN_EGG, "salmon_egg_recipe");
        slammin_salmon.shape("asa", "ses", "asa");
        slammin_salmon.setIngredient('a', Material.AIR);
        slammin_salmon.setIngredient('s', Material.SALMON);
        slammin_salmon.setIngredient('e', Material.EGG);
        getPlugin().getServer().addRecipe(slammin_salmon);
    }

    private void sheepEgg() {
        ShapedRecipe haggis = getUtil().shaped(Material.SHEEP_SPAWN_EGG, "sheep_egg_recipe");
        haggis.shape("awa", "mem", "awa");
        haggis.setIngredient('a', Material.AIR);
        haggis.setIngredient('w', Material.WHITE_WOOL);
        haggis.setIngredient('m', Material.MUTTON);
        haggis.setIngredient('e', Material.EGG);
        getPlugin().getServer().addRecipe(haggis);
    }

    private void sHorseEgg() {
        ShapelessRecipe spooky_horse = getUtil().shapeless(Material.SKELETON_HORSE_SPAWN_EGG, "s_horse_egg_recipe");
        spooky_horse.addIngredient(1, Material.SKELETON_SPAWN_EGG);
        spooky_horse.addIngredient(1, Material.HORSE_SPAWN_EGG);
        getPlugin().getServer().addRecipe(spooky_horse);
    }

    private void squidEgg() {
        ShapedRecipe squidge = getUtil().shaped(Material.SQUID_SPAWN_EGG, "squid_egg_recipe");
        squidge.shape("aia", "iei", "aia");
        squidge.setIngredient('a', Material.AIR);
        squidge.setIngredient('i', Material.INK_SAC);
        squidge.setIngredient('e', Material.EGG);
        getPlugin().getServer().addRecipe(squidge);
    }

    private void tropicalFishEgg() {
        ShapelessRecipe trop_fish = getUtil().shapeless(Material.TROPICAL_FISH_SPAWN_EGG, "t_fish_egg_recipe");
        trop_fish.addIngredient(1, Material.COD);
        trop_fish.addIngredient(1, Material.EGG);
        trop_fish.addIngredient(1, Material.PUFFERFISH);
        trop_fish.addIngredient(1, Material.SALMON);
        trop_fish.addIngredient(1, Material.TROPICAL_FISH);
        getPlugin().getServer().addRecipe(trop_fish);
    }

    private void traderLlamaEgg() {
        ShapelessRecipe fancy_llama = getUtil().shapeless(Material.TRADER_LLAMA_SPAWN_EGG, "t_llama_egg_recipe");
        fancy_llama.addIngredient(1, Material.LLAMA_SPAWN_EGG);
        fancy_llama.addIngredient(1, Material.WANDERING_TRADER_SPAWN_EGG);
        getPlugin().getServer().addRecipe(fancy_llama);
    }

    private void turtleEgg() {
        ShapedRecipe tortuga = getUtil().shaped(Material.TURTLE_SPAWN_EGG, "turtle_egg_recipe");
        tortuga.shape("asa", "ses", "asa");
        tortuga.setIngredient('a', Material.AIR);
        tortuga.setIngredient('s', Material.SCUTE);
        tortuga.setIngredient('e', Material.EGG);
        getPlugin().getServer().addRecipe(tortuga);
    }

    private void villagerEgg() {
        ShapedRecipe moron = getUtil().shaped(Material.VILLAGER_SPAWN_EGG, "villager_egg_recipe");
        moron.shape("aea", "p*p", "aea");
        moron.setIngredient('a', Material.AIR);
        moron.setIngredient('e', Material.EGG);
        moron.setIngredient('p', Material.POPPY);
        moron.setIngredient('*', Material.EGG);
        getPlugin().getServer().addRecipe(moron);
    }

    private void traderEgg() {
        ShapedRecipe dinkhead = getUtil().shaped(Material.WANDERING_TRADER_SPAWN_EGG, "trader_egg_recipe");
        dinkhead.shape("aea", "e*e", "aea");
        dinkhead.setIngredient('a', Material.AIR);
        dinkhead.setIngredient('e', Material.EMERALD);
        dinkhead.setIngredient('*', Material.VILLAGER_SPAWN_EGG);
        getPlugin().getServer().addRecipe(dinkhead);
    }

    private void zHorseEgg() {
        ShapelessRecipe scary_horus = getUtil().shapeless(Material.ZOMBIE_HORSE_SPAWN_EGG, "z_horse_egg_recipe");
        scary_horus.addIngredient(1, Material.ZOMBIE_SPAWN_EGG);
        scary_horus.addIngredient(1, Material.HORSE_SPAWN_EGG);
        getPlugin().getServer().addRecipe(scary_horus);
    }
}
