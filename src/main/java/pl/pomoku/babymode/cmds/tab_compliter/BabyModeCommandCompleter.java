package pl.pomoku.babymode.cmds.tab_compliter;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pl.pomoku.babymode.Main;

import java.util.ArrayList;
import java.util.List;

public class BabyModeCommandCompleter implements TabCompleter {
    Main plugin;

    public BabyModeCommandCompleter(Main m){
        plugin = m;
        m.getCommand("babymode").setTabCompleter(this);
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
                return arguments;
            }else if(args.length == 2){
                if(!args[0].equals("on")) {
                    if(!args[0].equals("off")) {
                        List<String> arguments = new ArrayList<>();
                        arguments.add("on");
                        arguments.add("off");
                        arguments.add("info");
                        return arguments;
                    }
                }
            }
        }
        return null;
    }
}
