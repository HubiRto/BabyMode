package pl.pomoku.babymode;

import org.bukkit.Bukkit;
import org.bukkit.entity.Monster;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scheduler.BukkitScheduler;

import static org.bukkit.Bukkit.getServer;

public class Run implements Runnable {
    static Main plugin;
    public Run(Main m){
        plugin = m;
    }

    @Override
    public void run() {
        BukkitScheduler scheduler = getServer().getScheduler();
        scheduler.scheduleSyncRepeatingTask(plugin, () -> {
            Bukkit.getOnlinePlayers().forEach(p -> {
                p.getNearbyEntities(10.0D, 12.5D, 14.0D).forEach((e) -> {
                   if(e instanceof Monster){
                       ((Monster) e).setHealth(0);
                   }
                });
            });
        }, 0L, 20L);
    }
}
