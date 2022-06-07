package pl.pomoku.babymode;

import org.bukkit.plugin.java.JavaPlugin;
import pl.pomoku.babymode.cmds.BabyModeOnOffCommand;
import pl.pomoku.babymode.cmds.tab_compliter.BabyModeCommandCompleter;
import pl.pomoku.babymode.events.BlockPlaceEvent.AutoCreatePortal;
import pl.pomoku.babymode.events.EntityDamageByEntityEvent.AutoBurningAnimals;
import pl.pomoku.babymode.events.EntityDamageEvent.BlockItemsBurning;
import pl.pomoku.babymode.events.EntityDamageEvent.ExtinguishingThePlayer;
import pl.pomoku.babymode.events.EntityDeathEvent.IncreasingDropItemsFromMobs;
import pl.pomoku.babymode.events.EntityDeathEvent.RespawnAnimals;
import pl.pomoku.babymode.events.EntityMoveEvent.EntityExplodeEvent.BlockExlodeOfCreeper;
import pl.pomoku.babymode.events.EntityMoveEvent.KillMobs;
import pl.pomoku.babymode.events.EntityTeleportEvent.BlockEndermans;
import pl.pomoku.babymode.events.PlayerChangedWorldEvent.JoinOnNether;
import pl.pomoku.babymode.events.PlayerJoinEvent.OnJoin;
import pl.pomoku.babymode.events.PlayerMoveEvent.CreatingObsidianInsteadOfLava;
import pl.pomoku.babymode.events.PrepareItemCraftEvent.CraftEvent;

public final class Main extends JavaPlugin {

    public static Main main;
    @Override
    public void onEnable() {
        main = this;

        new BabyModeOnOffCommand(this);
        new BabyModeCommandCompleter(this);

        getConfig().options().copyDefaults(true);
        saveConfig();

        getServer().getPluginManager().registerEvents(new OnJoin(this), this);
        getServer().getPluginManager().registerEvents(new RespawnAnimals(this), this);
        getServer().getPluginManager().registerEvents(new CreatingObsidianInsteadOfLava(this), this);
        getServer().getPluginManager().registerEvents(new ExtinguishingThePlayer(this), this);
        getServer().getPluginManager().registerEvents(new AutoBurningAnimals(this), this);
        getServer().getPluginManager().registerEvents(new AutoCreatePortal(this), this);
        getServer().getPluginManager().registerEvents(new KillMobs(this), this);
        getServer().getPluginManager().registerEvents(new BlockExlodeOfCreeper(this), this);
        getServer().getPluginManager().registerEvents(new BlockEndermans(this), this);
        getServer().getPluginManager().registerEvents(new IncreasingDropItemsFromMobs(this), this);
        getServer().getPluginManager().registerEvents(new JoinOnNether(this), this);
        getServer().getPluginManager().registerEvents(new CraftEvent(this), this);
        getServer().getPluginManager().registerEvents(new BlockItemsBurning(this), this);
    }
}
