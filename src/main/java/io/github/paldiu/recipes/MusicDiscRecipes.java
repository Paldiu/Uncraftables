package io.github.paldiu.recipes;

import io.github.paldiu.Uncraftables;
import org.bukkit.Material;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.ShapelessRecipe;

public class MusicDiscRecipes extends Craftable {
    public MusicDiscRecipes(Uncraftables plugin) {
        super(plugin);

        if (!getConfigValues().musicDiscsEnabled()) return;

        cd11();
        cd13();
        cdCAT();
        cdBLOCKS();
        cdCHIRP();
        cdFAR();
        cdMALL();
        cdMELLOHI();
        cdSTAL();
        cdSTRAD();
        cdWARD();
        cdWAIT();
        cdPIGSTEP();
    }

    private void cd13() {
        ShapedRecipe thirteen = getUtil().shaped(Material.MUSIC_DISC_13, "13_recipe");
        thirteen.shape("fff", "fyf", "fff");
        thirteen.setIngredient('f', Material.FLINT);
        thirteen.setIngredient('y', Material.YELLOW_DYE);
        getPlugin().getServer().addRecipe(thirteen);
    }

    private void cdCAT() {
        ShapedRecipe cat = getUtil().shaped(Material.MUSIC_DISC_CAT, "cat_recipe");
        cat.shape("fff", "fgf", "fff");
        cat.setIngredient('f', Material.FLINT);
        cat.setIngredient('g', Material.LIME_DYE);
        getPlugin().getServer().addRecipe(cat);
    }

    private void cdBLOCKS() {
        ShapedRecipe blocks = getUtil().shaped(Material.MUSIC_DISC_BLOCKS, "blocks_recipe");
        blocks.shape("fff", "fof", "fff");
        blocks.setIngredient('f', Material.FLINT);
        blocks.setIngredient('o', Material.ORANGE_DYE);
        getPlugin().getServer().addRecipe(blocks);
    }

    private void cdCHIRP() {
        ShapedRecipe chirp = getUtil().shaped(Material.MUSIC_DISC_CHIRP, "chirp_recipe");
        chirp.shape("fff", "frf", "fff");
        chirp.setIngredient('f', Material.FLINT);
        chirp.setIngredient('r', Material.RED_DYE);
        getPlugin().getServer().addRecipe(chirp);
    }

    private void cdFAR() {
        ShapelessRecipe far = getUtil().shapeless(Material.MUSIC_DISC_FAR, "far_recipe");
        far.addIngredient(2, Material.BONE_MEAL);
        far.addIngredient(1, Material.MUSIC_DISC_CAT);
        getPlugin().getServer().addRecipe(far);
    }

    private void cdMALL() {
        ShapedRecipe mall = getUtil().shaped(Material.MUSIC_DISC_MALL, "mall_recipe");
        mall.shape("fff", "fpf", "fff");
        mall.setIngredient('f', Material.FLINT);
        mall.setIngredient('p', Material.PURPLE_DYE);
        getPlugin().getServer().addRecipe(mall);
    }

    private void cdMELLOHI() {
        ShapedRecipe mellohi = getUtil().shaped(Material.MUSIC_DISC_MELLOHI, "mellohi_recipe");
        mellohi.shape("fff", "fpf", "fff");
        mellohi.setIngredient('f', Material.FLINT);
        mellohi.setIngredient('p', Material.PINK_DYE);
        getPlugin().getServer().addRecipe(mellohi);
    }

    private void cdSTAL() {
        ShapedRecipe stal = getUtil().shaped(Material.MUSIC_DISC_STAL, "stal_recipe");
        stal.shape("fff", "fbf", "fff");
        stal.setIngredient('f', Material.FLINT);
        stal.setIngredient('b', Material.BLACK_DYE);
        getPlugin().getServer().addRecipe(stal);
    }

    private void cdSTRAD() {
        ShapedRecipe strad = getUtil().shaped(Material.MUSIC_DISC_STRAD, "strad_recipe");
        strad.shape("fff", "fwf", "fff");
        strad.setIngredient('f', Material.FLINT);
        strad.setIngredient('w', Material.WHITE_DYE);
        getPlugin().getServer().addRecipe(strad);
    }

    private void cdWARD() {
        ShapedRecipe ward = getUtil().shaped(Material.MUSIC_DISC_WARD, "ward_recipe");
        ward.shape("fff", "fgf", "fff");
        ward.setIngredient('f', Material.FLINT);
        ward.setIngredient('g', Material.GREEN_DYE);
        getPlugin().getServer().addRecipe(ward);
    }

    private void cd11() {
        ShapedRecipe eleven = getUtil().shaped(Material.MUSIC_DISC_11, "11_recipe");
        eleven.shape("fff", "fbf", "ffa");
        eleven.setIngredient('f', Material.FLINT);
        eleven.setIngredient('b', Material.BLACK_DYE);
        eleven.setIngredient('a', Material.AIR);
        getPlugin().getServer().addRecipe(eleven);
    }

    private void cdWAIT() {
        ShapedRecipe wait = getUtil().shaped(Material.MUSIC_DISC_WAIT, "wait_recipe");
        wait.shape("fff", "fbf", "fff");
        wait.setIngredient('f', Material.FLINT);
        wait.setIngredient('b', Material.BLUE_DYE);
        getPlugin().getServer().addRecipe(wait);
    }

    private void cdPIGSTEP() {
        ShapedRecipe pigstep = getUtil().shaped(Material.MUSIC_DISC_PIGSTEP, "pigstep_recipe");
        pigstep.shape("nqn", "qyq", "nqn");
        pigstep.setIngredient('n', Material.NETHER_BRICK);
        pigstep.setIngredient('q', Material.QUARTZ);
        pigstep.setIngredient('y', Material.YELLOW_DYE);
        getPlugin().getServer().addRecipe(pigstep);
    }
}
