package pl.pomoku.babymode;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.scheduler.BukkitRunnable;
import pl.pomoku.babymode.Main;

public class New implements Listener {

    static Main plugin;
    public New(Main m){
        plugin = m;
    }

    @EventHandler
    private void onDropTest(final PlayerDropItemEvent e) {

        BukkitRunnable runnable = new BukkitRunnable() {

            @Override
            public void run() {

                Player p = e.getPlayer();

                if(!e.getItemDrop().isOnGround()) {
                    p.sendMessage("eki");

                }else{
                    p.sendMessage("eko");
                    this.cancel();
                    Location l = e.getItemDrop().getLocation();
                    Block b = l.getBlock();
                    b.setType(Material.OBSIDIAN);
                }

            }

        };

        runnable.runTaskTimer(plugin, 0L, 20L);
    }
}
