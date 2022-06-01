package pl.pomoku.babymode;

import org.bukkit.plugin.java.JavaPlugin;
import pl.pomoku.babymode.cmds.BabyModeOnOffCommand;
import pl.pomoku.babymode.events.*;

public final class Main extends JavaPlugin {

    public static Main main;
    @Override
    public void onEnable() {
        main = this;

        new BabyModeOnOffCommand(this);

        getConfig().options().copyDefaults(true);
        saveConfig();

        getServer().getPluginManager().registerEvents(new OnJoin(this), this);
        getServer().getPluginManager().registerEvents(new AnimalsDeadEvent(this), this);
        getServer().getPluginManager().registerEvents(new OnMove(this), this);
        getServer().getPluginManager().registerEvents(new OnPlayerDamage(this), this);
        getServer().getPluginManager().registerEvents(new EntitiDamage(this), this);
    }
}
