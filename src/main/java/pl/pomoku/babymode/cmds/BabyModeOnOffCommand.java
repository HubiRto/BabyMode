package pl.pomoku.babymode.cmds;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import pl.pomoku.babymode.Main;

import java.util.Objects;

public class BabyModeOnOffCommand implements CommandExecutor {

    Main plugin;
    public BabyModeOnOffCommand(Main m){
        plugin = m;
        Objects.requireNonNull(m.getCommand("babymode")).setExecutor(this);
    }
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;
            switch (args.length) {
                case 0:
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
                    break;
                case 1:
                    if (args[0].equals("on")) {
                        plugin.getConfig().set("babymode", true);
                        plugin.saveConfig();
                        p.sendMessage(ChatColor.GREEN + "Wlaczyles " + ChatColor.AQUA + "" + ChatColor.BOLD + "BabyMode");
                    } else if (args[0].equals("off")) {
                        plugin.getConfig().set("babymode", false);
                        plugin.saveConfig();
                        p.sendMessage(ChatColor.RED + "Wylaczyles " + ChatColor.AQUA + "" + ChatColor.BOLD + "BabyMode");
                    }
                    break;
                case 2:
                    if (args[0].equals("killmobs")) {
                        if (args[1].equals("on")) {
                            plugin.getConfig().set("kill_mobs.mode", true);
                            plugin.saveConfig();
                            p.sendMessage(ChatColor.GREEN + "Wlaczyles " + ChatColor.AQUA + "" + ChatColor.BOLD + "Zabijanie Potworow");
                        } else if (args[1].equals("off")) {
                            plugin.getConfig().set("kill_mobs.mode", false);
                            plugin.saveConfig();
                            p.sendMessage(ChatColor.RED + "Wylaczyles " + ChatColor.AQUA + "" + ChatColor.BOLD + "Zabijanie Potworow");
                        }
                    } else if (args[0].equals("all")) {
                        if (args[1].equals("on")) {
                            plugin.getConfig().set("babymode", true);
                            plugin.getConfig().set("alldamage", true);
                            plugin.getConfig().set("extinguishing", true);
                            plugin.getConfig().set("kill_mobs.mode", true);
                            plugin.getConfig().set("kill_mobs.zombie", true);
                            plugin.saveConfig();
                            p.sendMessage(ChatColor.GREEN + "Wlaczyles " + ChatColor.AQUA + "" + ChatColor.BOLD + "Wszystkie opcje");
                        } else if (args[1].equals("off")) {
                            plugin.getConfig().set("babymode", false);
                            plugin.getConfig().set("extinguishing", false);
                            plugin.getConfig().set("alldamage", false);
                            plugin.getConfig().set("kill_mobs.mode", false);
                            plugin.getConfig().set("kill_mobs.zombie", false);
                            plugin.saveConfig();
                            p.sendMessage(ChatColor.RED + "Wylaczyles " + ChatColor.AQUA + "" + ChatColor.BOLD + "Wszystkie opcje");
                        }
                    } else if (args[0].equals("extinguishing")) {
                        if (args[1].equals("on")) {
                            plugin.getConfig().set("extinguishing", true);
                            plugin.saveConfig();
                            p.sendMessage(ChatColor.GREEN + "Wlaczyles " + ChatColor.AQUA + "" + ChatColor.BOLD + "Gaszenie");
                        } else if (args[1].equals("off")) {
                            plugin.getConfig().set("extinguishing", false);
                            plugin.saveConfig();
                            p.sendMessage(ChatColor.RED + "Wylaczyles " + ChatColor.AQUA + "" + ChatColor.BOLD + "Gaszenie");
                        }
                    }else if (args[0].equals("alldamage")) {
                        if (args[1].equals("on")) {
                            plugin.getConfig().set("alldamage", true);
                            plugin.saveConfig();
                            p.sendMessage(ChatColor.GREEN + "Wlaczyles " + ChatColor.AQUA + "" + ChatColor.BOLD + "Blokowanie Obrazenia");
                        } else if (args[1].equals("off")) {
                            plugin.getConfig().set("alldamage", false);
                            plugin.saveConfig();
                            p.sendMessage(ChatColor.RED + "Wylaczyles " + ChatColor.AQUA + "" + ChatColor.BOLD + "Blokowanie Obrazenia");
                        }
                    }
                    break;
                case 3:
                    if (args[0].equals("killmobs")) {
                        switch (args[1]) {
                            case "zombie":
                                extracted(args, p, "kill_mobs.zombie", "Zombie");
                                break;
                            case "creeper":
                                extracted(args, p, "kill_mobs.creeper", "Creeper");
                                break;
                            case "skeleton":
                                extracted(args, p, "kill_mobs.skeleton", "Skeleton");
                                break;
                            case "slime":
                                extracted(args, p, "kill_mobs.slime", "Slime");
                                break;
                            case "spider":
                                extracted(args, p, "kill_mobs.spider", "Spider");
                                break;
                            case "zombie_villager":
                                extracted(args, p, "kill_mobs.zombie_villager", "Zombie Villager");
                                break;
                            case "cave_spider":
                                extracted(args, p, "kill_mobs.cave_spider", "Cave Spider");
                                break;
                            case "witch":
                                extracted(args, p, "kill_mobs.witch", "Witch");
                                break;
                            case "drowned":
                                extracted(args, p, "kill_mobs.drowned", "Drowned");
                                break;
                            case "stray":
                                extracted(args, p, "kill_mobs.stray", "Stray");
                                break;
                            case "husk":
                                extracted(args, p, "kill_mobs.husk", "Husk");
                                break;
                            case "shulker":
                                extracted(args, p, "kill_mobs.shulker", "Shulker");
                                break;
                            case "elder_guardian":
                                extracted(args, p, "kill_mobs.elder_guardian", "Elder Guardian");
                                break;
                            case "guardian":
                                extracted(args, p, "kill_mobs.guardian", "Guardian");
                                break;
                        }
                    }
                    break;
            }
        }else {
            sender.sendMessage(ChatColor.RED + "Nie mozna wykonac tej komendy z konsoli!");
        }
        return true;
    }

    private void extracted(@NotNull String @NotNull [] args, Player p, String config, String name) {
        if (args[2].equals("on")) {
            plugin.getConfig().set(config, true);
            plugin.saveConfig();
            p.sendMessage(ChatColor.GREEN + "Wlaczyles " + ChatColor.AQUA + "" + ChatColor.BOLD + "Zabijanie Potworow (" + name + ")");
        } else if (args[2].equals("off")) {
            plugin.getConfig().set(config, false);
            plugin.saveConfig();
            p.sendMessage(ChatColor.RED + "Wylaczyles " + ChatColor.AQUA + "" + ChatColor.BOLD + "Zabijanie Potworow (" + name + ")");

        }
    }
}
