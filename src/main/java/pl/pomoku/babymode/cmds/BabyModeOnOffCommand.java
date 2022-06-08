package pl.pomoku.babymode.cmds;

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
            if(args.length == 0) {
                p.sendMessage(" ");
                p.sendMessage("§8[§b+§8]§m------------§r§8[ §bBABY MODE §8]§m------------§r§8[§b+§8]");
                p.sendMessage(" ");
                p.sendMessage(" §8>> §e/bm §7- pomoc.");
                p.sendMessage(" §8>> §e/bm §8[§aon§7/§coff§7/§6info§8] §7- plugin.");
                p.sendMessage(" §8>> §e/bm §fall §8[§aon§7/§coff§7/§6info§8] §7- wszystko.");
                p.sendMessage(" §8>> §e/bm §fkillmobs §8[§aon§7/§coff§7/§6info§8] §7- zabijania potworow.");
                p.sendMessage(" ");
                p.sendMessage("§8[§b+§8]§m------------§r§8[ §bBABY MODE §8]§m------------§r§8[§b+§8]");
                p.sendMessage(" ");
            }else if(args.length == 1) {
                if (args[0].equals("on")){
                    plugin.getConfig().set("babymode", true);
                    plugin.saveConfig();
                    p.sendMessage(ChatColor.GREEN + "Wlaczyles " + ChatColor.AQUA + "" + ChatColor.BOLD + "BabyMode");
                }else if(args[0].equals("off")){
                    plugin.getConfig().set("babymode", false);
                    plugin.saveConfig();
                    p.sendMessage(ChatColor.RED + "Wylaczyles " + ChatColor.AQUA + "" + ChatColor.BOLD + "BabyMode");
                }
            }else if(args.length == 2) {
                if (args[0].equals("killmobs")){
                    if (args[1].equals("on")){
                        plugin.getConfig().set("kill_mobs.mode", true);
                        plugin.saveConfig();
                        p.sendMessage(ChatColor.GREEN + "Wlaczyles " + ChatColor.AQUA + "" + ChatColor.BOLD + "Zabijanie Potworow");
                    }else if(args[1].equals("off")){
                        plugin.getConfig().set("kill_mobs.mode", false);
                        plugin.saveConfig();
                        p.sendMessage(ChatColor.RED + "Wylaczyles " + ChatColor.AQUA + "" + ChatColor.BOLD + "Zabijanie Potworow");
                    }
                }else if (args[0].equals("all")){
                    if (args[1].equals("on")){
                        plugin.getConfig().set("babymode", true);
                        plugin.getConfig().set("kill_mobs", true);
                        plugin.saveConfig();
                        p.sendMessage(ChatColor.GREEN + "Wlaczyles " + ChatColor.AQUA + "" + ChatColor.BOLD + "Wszystkie opcje");
                    }else if(args[1].equals("off")){
                        plugin.getConfig().set("babymode", false);
                        plugin.getConfig().set("kill_mobs", false);
                        plugin.saveConfig();
                        p.sendMessage(ChatColor.RED + "Wylaczyles " + ChatColor.AQUA + "" + ChatColor.BOLD + "Wszystkie opcje");
                    }
                }
            }else if(args.length == 3){
                if (args[0].equals("killmobs")){
                    if(args[1].equals("zombie")){
                        if(args[2].equals("on")){
                            plugin.getConfig().set("kill_mobs.zombie", true);
                            plugin.saveConfig();
                            p.sendMessage(ChatColor.GREEN + "Wlaczyles " + ChatColor.AQUA + "" + ChatColor.BOLD + "Zabijanie Potworow (Zombie)");
                        }else if(args[2].equals("off")){
                            plugin.getConfig().set("kill_mobs.zombie", false);
                            plugin.saveConfig();
                            p.sendMessage(ChatColor.RED + "Wylaczyles " + ChatColor.AQUA + "" + ChatColor.BOLD + "Zabijanie Potworow (Zombie)");

                        }
                    }else if(args[1].equals("creeper")){
                        if(args[2].equals("on")){
                            plugin.getConfig().set("kill_mobs.creeper", true);
                            plugin.saveConfig();
                            p.sendMessage(ChatColor.GREEN + "Wlaczyles " + ChatColor.AQUA + "" + ChatColor.BOLD + "Zabijanie Potworow (Creeper)");
                        }else if(args[2].equals("off")){
                            plugin.getConfig().set("kill_mobs.creeper", false);
                            plugin.saveConfig();
                            p.sendMessage(ChatColor.RED + "Wylaczyles " + ChatColor.AQUA + "" + ChatColor.BOLD + "Zabijanie Potworow (Creeper)");

                        }
                    }else if(args[1].equals("skeleton")){
                        if(args[2].equals("on")){
                            plugin.getConfig().set("kill_mobs.skeleton", true);
                            plugin.saveConfig();
                            p.sendMessage(ChatColor.GREEN + "Wlaczyles " + ChatColor.AQUA + "" + ChatColor.BOLD + "Zabijanie Potworow (Skeleton)");
                        }else if(args[2].equals("off")){
                            plugin.getConfig().set("kill_mobs.skeleton", false);
                            plugin.saveConfig();
                            p.sendMessage(ChatColor.RED + "Wylaczyles " + ChatColor.AQUA + "" + ChatColor.BOLD + "Zabijanie Potworow (Skeleton)");

                        }
                    }
                }
            }
        }else {
            sender.sendMessage(ChatColor.RED + "Nie mozna wykonac tej komendy z konsoli!");
        }
        return true;
    }
}
