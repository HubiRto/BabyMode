package pl.pomoku.babymode.cmds.tab_compliter;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pl.pomoku.babymode.Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BabyModeCommandCompleter implements TabCompleter {
    Main plugin;

    public BabyModeCommandCompleter(Main m){
        plugin = m;
        Objects.requireNonNull(m.getCommand("babymode")).setTabCompleter(this);
    }

    @Override
    public @Nullable List<String> onTabComplete(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if(command.getName().equalsIgnoreCase("babymode")){
            if(args.length == 1){
                List<String> arguments = new ArrayList<>();
                arguments.add("on");
                arguments.add("off");
                arguments.add("killmobs");
                arguments.add("all");
                arguments.add("extinguishing");
                arguments.add("alldamage");
                arguments.add("crate_portal");
                arguments.add("auto_enchant");
                arguments.add("block_explode");
                arguments.add("auto_cook");
                arguments.add("block_item_burn");
                arguments.add("make_obs");
                arguments.add("more_loot");
                arguments.add("respawn_animals");
                arguments.add("block_enderman");
                arguments.add("join_nether");
                arguments.add("swim");
                arguments.add("stone_drop");
                arguments.add("block_bad_effect");
                arguments.add("enderman_drop");
                arguments.add("blaze_drop");
                arguments.add("wither_skeleton_drop");
                return arguments;
            }else if(args.length == 2){
                if(!args[0].equals("on")) {
                    if(!args[0].equals("off")) {
                        if(args[0].equals("killmobs")){
                            List<String> arguments = new ArrayList<>();
                            arguments.add("on");
                            arguments.add("off");
                            arguments.add("info");
                            arguments.add("zombie");
                            arguments.add("creeper");
                            arguments.add("skeleton");
                            arguments.add("slime");
                            arguments.add("spider");
                            arguments.add("cave_spider");
                            arguments.add("zombie_villager");
                            arguments.add("witch");
                            arguments.add("drowned");
                            arguments.add("stray");
                            arguments.add("husk");
                            arguments.add("elder_guardian");
                            arguments.add("guardian");
                            arguments.add("endermite");
                            arguments.add("zoglin");
                            arguments.add("piglin_brute");
                            arguments.add("vex");
                            arguments.add("pillager");
                            arguments.add("ravager");
                            arguments.add("evoker");
                            arguments.add("vindicator");
                            arguments.add("wither_skeleton");
                            arguments.add("silverfish");
                            arguments.add("magma_cube");
                            arguments.add("ghast");
                            arguments.add("blaze");
                            arguments.add("phantom");
                            arguments.add("enderman");
                            arguments.add("hoglin");
                            arguments.add("piglin");
                            arguments.add("zombified_piglin");
                            arguments.add("shulker");
                            return arguments;
                        }else {
                            List<String> arguments = new ArrayList<>();
                            arguments.add("on");
                            arguments.add("off");
                            arguments.add("info");
                            return arguments;
                        }
                    }
                }
            }else if(args.length == 3){
                if(args[0].equals("killmobs")){
                    switch (args[1]) {
                        case "zombie":
                        case "creeper":
                        case "skeleton":
                        case "spider":
                        case "cave_spider":
                        case "slime":
                        case "zombie_villager":
                        case "witch":
                        case "drowned":
                        case "stray":
                        case "husk":
                        case "elder_guardian":
                        case "guardian":
                        case "endermite":
                        case "zoglin":
                        case "piglin_brute":
                        case "vex":
                        case "ravager":
                        case "pillager":
                        case "evoker":
                        case "vindicator":
                        case "wither_skeleton":
                        case "silverfish":
                        case "magma_cube":
                        case "ghast":
                        case "phantom":
                        case "enderman":
                        case "hoglin":
                        case "piglin":
                        case "zombified_piglin":
                        case "blaze":
                        case "shulker": {
                            return getStrings();
                        }
                    }
                }
            }
        }
        return null;
    }

    @NotNull
    private List<String> getStrings() {
        List<String> arguments = new ArrayList<>();
        arguments.add("on");
        arguments.add("off");
        return arguments;
    }
}
