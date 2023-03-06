package io.github.paldiu.config;

import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

@FunctionalInterface
public interface ItemMetaSupplier {
    ItemMeta getFrom(ItemStack itemStack);
}
