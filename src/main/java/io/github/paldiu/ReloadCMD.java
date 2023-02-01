package io.github.paldiu;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public class ReloadCMD implements CommandExecutor {
    private final Uncraftables crf;

    public ReloadCMD(@NotNull Uncraftables crf) {
        this.crf = crf;
        crf.getPlugin().getCommand("reload").setExecutor(this);
    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        if (sender.hasPermission("uncraftables.reload")) {
            crf.getYamlWrapper().load();
            sender.sendMessage(Component.text("[Uncraftables] Reloaded configurations!").color(NamedTextColor.GREEN));
        } else {
            sender.sendMessage(Component.text("You do not have permission to use this command!").color(NamedTextColor.RED));
        }

        return true;
    }
}
