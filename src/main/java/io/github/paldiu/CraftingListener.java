package io.github.paldiu;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.CraftItemEvent;
import org.bukkit.event.inventory.PrepareItemCraftEvent;
import org.bukkit.inventory.CraftingInventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Recipe;
import org.bukkit.plugin.Plugin;

public class CraftingListener implements Listener {
    public CraftingListener(Plugin instance) {
        instance.getServer().getPluginManager().registerEvents(this, instance);
    }

    @EventHandler
    public void preCraftEvent(PrepareItemCraftEvent e) {
        final Recipe recipe = e.getRecipe();
        if (recipe == null) { return; }

        final ItemStack result = recipe.getResult();
        final CraftingInventory inv = e.getInventory();

        if (e.isRepair()) { return; }

        if (result.getType().equals(Material.NETHER_WART)) {
            result.setAmount(9);
            inv.setResult(result);
        }
        if (result.getType().equals(Material.CRYING_OBSIDIAN)) {
            result.setAmount(2);
            inv.setResult(result);
        }
        if (result.getType().equals(Material.BEDROCK)) {
            result.setAmount(4);
            inv.setResult(result);
        }
    }

    @EventHandler
    public void craftEvent(CraftItemEvent e) {
        final ItemStack result = e.getRecipe().getResult();
        final CraftingInventory inv = e.getInventory();

        if (result.getType().equals(Material.NETHER_WART)) {
            result.setAmount(9);
            inv.setResult(result);
        }
        if (result.getType().equals(Material.CRYING_OBSIDIAN)) {
            result.setAmount(2);
            inv.setResult(result);
        }
        if (result.getType().equals(Material.BEDROCK)) {
            result.setAmount(4);
            inv.setResult(result);
        }
    }

}
