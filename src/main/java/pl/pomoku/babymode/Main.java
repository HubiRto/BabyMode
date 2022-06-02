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
        getServer().getPluginManager().registerEvents(new RespawnZwierzat(this), this);
        getServer().getPluginManager().registerEvents(new TworzenieObsydianuZamiastLava(this), this);
        getServer().getPluginManager().registerEvents(new GaszenieGraczaGdySiePali(this), this);
        getServer().getPluginManager().registerEvents(new PodpalanieZwierzat(this), this);
        getServer().getPluginManager().registerEvents(new TworzeniePortalu(this), this);
        getServer().getPluginManager().registerEvents(new ZabijaniePotworow(this), this);
        getServer().getPluginManager().registerEvents(new BlokowanieWybuchuCreepera(this), this);
        getServer().getPluginManager().registerEvents(new BlokowanieEndermanow(this), this);
        getServer().getPluginManager().registerEvents(new ZwiekszanieDropuZMobow(this), this);
        getServer().getPluginManager().registerEvents(new WejscieDoNetheru(this), this);
    }
}
