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
                    p.sendMessage(" §8>> §e/bm §fextinguishing §8[§aon§7/§coff§7/§6info§8] §7- gaszenie.");
                    p.sendMessage(" §8>> §e/bm §fcreate_portal §8[§aon§7/§coff§7/§6info§8] §7- tworzenie portalu.");
                    p.sendMessage(" §8>> §e/bm §fauto_enchant §8[§aon§7/§coff§7/§6info§8] §7- automatyczne ulepszanie.");
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
                            plugin.getConfig().set("crate_portal", true);
                            plugin.getConfig().set("auto_enchant", true);

                            plugin.getConfig().set("kill_mobs.mode", true);
                            plugin.getConfig().set("kill_mobs.zombie", true);
                            plugin.getConfig().set("kill_mobs.creeper", true);
                            plugin.getConfig().set("kill_mobs.skeleton", true);
                            plugin.getConfig().set("kill_mobs.slime", true);
                            plugin.getConfig().set("kill_mobs.zombie_villager", true);
                            plugin.getConfig().set("kill_mobs.cave_spider", true);
                            plugin.getConfig().set("kill_mobs.witch", true);
                            plugin.getConfig().set("kill_mobs.drowned", true);
                            plugin.getConfig().set("kill_mobs.stray", true);
                            plugin.getConfig().set("kill_mobs.husk", true);
                            plugin.getConfig().set("kill_mobs.elder_guardian", true);
                            plugin.getConfig().set("kill_mobs.guardian", true);
                            plugin.getConfig().set("kill_mobs.spider", true);
                            plugin.getConfig().set("kill_mobs.phantom", true);
                            plugin.getConfig().set("kill_mobs.enderman", true);
                            plugin.getConfig().set("kill_mobs.endermite", true);
                            plugin.getConfig().set("kill_mobs.zoglin", true);
                            plugin.getConfig().set("kill_mobs.piglin_brute", true);
                            plugin.getConfig().set("kill_mobs.vex", true);
                            plugin.getConfig().set("kill_mobs.ravager", true);
                            plugin.getConfig().set("kill_mobs.pillager", true);
                            plugin.getConfig().set("kill_mobs.evoker", true);
                            plugin.getConfig().set("kill_mobs.vindicator", true);
                            plugin.getConfig().set("kill_mobs.wither_skeleton", true);
                            plugin.getConfig().set("kill_mobs.silverfish", true);
                            plugin.getConfig().set("kill_mobs.magma_cube", true);
                            plugin.getConfig().set("kill_mobs.ghast", true);
                            plugin.getConfig().set("kill_mobs.blaze", true);
                            plugin.saveConfig();
                            p.sendMessage(ChatColor.GREEN + "Wlaczyles " + ChatColor.AQUA + "" + ChatColor.BOLD + "Wszystkie opcje");
                        } else if (args[1].equals("off")) {
                            plugin.getConfig().set("babymode", false);
                            plugin.getConfig().set("extinguishing", false);
                            plugin.getConfig().set("alldamage", false);
                            plugin.getConfig().set("crate_portal", false);
                            plugin.getConfig().set("auto_enchant", false);

                            plugin.getConfig().set("kill_mobs.mode", false);
                            plugin.getConfig().set("kill_mobs.zombie", false);
                            plugin.getConfig().set("kill_mobs.creeper", false);
                            plugin.getConfig().set("kill_mobs.skeleton", false);
                            plugin.getConfig().set("kill_mobs.slime", false);
                            plugin.getConfig().set("kill_mobs.zombie_villager", false);
                            plugin.getConfig().set("kill_mobs.cave_spider", false);
                            plugin.getConfig().set("kill_mobs.witch", false);
                            plugin.getConfig().set("kill_mobs.drowned", false);
                            plugin.getConfig().set("kill_mobs.stray", false);
                            plugin.getConfig().set("kill_mobs.husk", false);
                            plugin.getConfig().set("kill_mobs.elder_guardian", false);
                            plugin.getConfig().set("kill_mobs.guardian", false);
                            plugin.getConfig().set("kill_mobs.spider", false);
                            plugin.getConfig().set("kill_mobs.phantom", false);
                            plugin.getConfig().set("kill_mobs.enderman", false);
                            plugin.getConfig().set("kill_mobs.endermite", false);
                            plugin.getConfig().set("kill_mobs.zoglin", false);
                            plugin.getConfig().set("kill_mobs.piglin_brute", false);
                            plugin.getConfig().set("kill_mobs.vex", false);
                            plugin.getConfig().set("kill_mobs.ravager", false);
                            plugin.getConfig().set("kill_mobs.pillager", false);
                            plugin.getConfig().set("kill_mobs.evoker", false);
                            plugin.getConfig().set("kill_mobs.vindicator", false);
                            plugin.getConfig().set("kill_mobs.wither_skeleton", false);
                            plugin.getConfig().set("kill_mobs.silverfish", false);
                            plugin.getConfig().set("kill_mobs.magma_cube", false);
                            plugin.getConfig().set("kill_mobs.ghast", false);
                            plugin.getConfig().set("kill_mobs.blaze", false);

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
                    }else if (args[0].equals("crate_portal")) {
                        if (args[1].equals("on")) {
                            plugin.getConfig().set("crate_portal", true);
                            plugin.saveConfig();
                            p.sendMessage(ChatColor.GREEN + "Wlaczyles " + ChatColor.AQUA + "" + ChatColor.BOLD + "Automatyczne Tworzenie Portalu");
                        } else if (args[1].equals("off")) {
                            plugin.getConfig().set("crate_portal", false);
                            plugin.saveConfig();
                            p.sendMessage(ChatColor.RED + "Wylaczyles " + ChatColor.AQUA + "" + ChatColor.BOLD + "Automatyczne Tworzenie Portalu");
                        }
                    }else if (args[0].equals("auto_enchant")) {
                        if (args[1].equals("on")) {
                            plugin.getConfig().set("auto_enchant", true);
                            plugin.saveConfig();
                            p.sendMessage(ChatColor.GREEN + "Wlaczyles " + ChatColor.AQUA + "" + ChatColor.BOLD + "Automatyczne Ulepszanie");
                        } else if (args[1].equals("off")) {
                            plugin.getConfig().set("auto_enchant", false);
                            plugin.saveConfig();
                            p.sendMessage(ChatColor.RED + "Wylaczyles " + ChatColor.AQUA + "" + ChatColor.BOLD + "Automatyczne Ulepszanie");
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
                            case "elder_guardian":
                                extracted(args, p, "kill_mobs.elder_guardian", "Elder Guardian");
                                break;
                            case "guardian":
                                extracted(args, p, "kill_mobs.guardian", "Guardian");
                                break;
                            case "phantom":
                                extracted(args, p, "kill_mobs.phantom", "Phantom");
                                break;
                            case "enderman":
                                extracted(args, p, "kill_mobs.enderman", "Enderman");
                                break;
                            case "endermite":
                                extracted(args, p, "kill_mobs.endermite", "Endermite");
                                break;
                            case "zoglin":
                                extracted(args, p, "kill_mobs.zoglin", "Zoglin");
                                break;
                            case "piglin_brute":
                                extracted(args, p, "kill_mobs.piglin_brute", "Piglin Brute");
                                break;
                            case "vex":
                                extracted(args, p, "kill_mobs.vex", "Vex");
                                break;
                            case "ravager":
                                extracted(args, p, "kill_mobs.ravager", "Ravager");
                                break;
                            case "pillager":
                                extracted(args, p, "kill_mobs.pillager", "Pillager");
                                break;
                            case "vindicator":
                                extracted(args, p, "kill_mobs.vindicator", "Vindicator");
                                break;
                            case "wither_skeleton":
                                extracted(args, p, "kill_mobs.wither_skeleton", "Wither Skeleton");
                                break;
                            case "silverfish":
                                extracted(args, p, "kill_mobs.silverfish", "Silverfish");
                                break;
                            case "magma_cube":
                                extracted(args, p, "kill_mobs.magma_cube", "Magma Cube");
                                break;
                            case "ghast":
                                extracted(args, p, "kill_mobs.ghast", "Ghast");
                                break;
                            case "blaze":
                                extracted(args, p, "kill_mobs.blaze", "Blaze");
                                break;
                            case "evoker":
                                extracted(args, p, "kill_mobs.evoker", "Evoker");
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
