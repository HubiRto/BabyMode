package pl.pomoku.babymode.cmds;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import pl.pomoku.babymode.Main;

public class BabyModeOnOffCommand implements CommandExecutor {

    Main plugin;
    public BabyModeOnOffCommand(Main m){
        plugin = m;
        m.getCommand("babymode").setExecutor(this);
    }
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;
            if(args.length == 1) {
                if (args[0].equals("on")){
                    plugin.getConfig().set(p.getDisplayName() + ".babymode", true);
                    plugin.saveConfig();
                    p.sendMessage(ChatColor.GREEN + "Wlaczyles " + ChatColor.AQUA + "" + ChatColor.BOLD + "BabyMode");
                }else if(args[0].equals("off")){
                    plugin.getConfig().set(p.getDisplayName() + ".babymode", false);
                    plugin.saveConfig();
                    p.sendMessage(ChatColor.RED + "Wylaczyles " + ChatColor.AQUA + "" + ChatColor.BOLD + "BabyMode");
                }
            }else if(args.length == 2){
                Player cel = Bukkit.getPlayerExact(args[1]);
                if(cel != null){
                    if(cel.isOnline()) {
                        if (args[0].equals("on")) {
                            plugin.getConfig().set(p.getDisplayName() + ".babymode", true);
                            plugin.saveConfig();
                            p.sendMessage(ChatColor.GREEN + "Wlaczyles " + ChatColor.AQUA + "" + ChatColor.BOLD + "BabyMode " + ChatColor.RESET + "" + ChatColor.YELLOW + cel.getDisplayName() + ChatColor.GRAY + ".");
                        } else if (args[0].equals("off")) {
                            plugin.getConfig().set(p.getDisplayName() + ".babymode", false);
                            plugin.saveConfig();
                            p.sendMessage(ChatColor.RED + "Wylaczyles " + ChatColor.AQUA + "" + ChatColor.BOLD + "BabyMode " + ChatColor.RESET + "" + ChatColor.YELLOW + cel.getDisplayName() + ChatColor.GRAY + ".");
                        }
                    }else {
                        p.sendMessage(ChatColor.RED + "Nie istnieje taki gracz lub jest offline!");
                    }
                }
            }
        }

        return true;
    }
}
