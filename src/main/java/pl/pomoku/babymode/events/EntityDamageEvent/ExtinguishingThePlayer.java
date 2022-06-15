package pl.pomoku.babymode.events.EntityDamageEvent;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import pl.pomoku.babymode.Main;

public class ExtinguishingThePlayer implements Listener {
    Main plugin;
    public ExtinguishingThePlayer(Main m){
        plugin = m;
    }

    @EventHandler
    public void onPlayerDamage(EntityDamageEvent e) {
        if(plugin.getConfig().getBoolean("babymode")) {
            if (plugin.getConfig().getBoolean("extinguishing")) {
                if (e.getEntity() instanceof Player) {
                    Player p = ((Player) e.getEntity()).getPlayer();
                    Location loc = p.getLocation();
                    Block b = loc.getBlock();
                    if (b.getType() == Material.FIRE) {
                        b.setType(Material.AIR);
                        p.setFireTicks(0);
                        //Tutaj bedzie wiadomosc
                    } else if (b.getType() == Material.SOUL_FIRE) {
                        b.setType(Material.AIR);
                        p.setFireTicks(0);
                        //Tutaj bedzie wiadomosc
                    }
                }
            }
        }
    }
}
