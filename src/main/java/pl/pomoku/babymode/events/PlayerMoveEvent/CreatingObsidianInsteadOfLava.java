package pl.pomoku.babymode.events.PlayerMoveEvent;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import pl.pomoku.babymode.Main;



public class CreatingObsidianInsteadOfLava implements Listener {

    Main plugin;
    public CreatingObsidianInsteadOfLava(Main m){
        plugin = m;
    }

    @EventHandler
    public void OnMove(PlayerMoveEvent e){
        if(plugin.getConfig().getBoolean("babymode")) {
            Player p = e.getPlayer();
            Location loc = p.getLocation();

            if ((e.getFrom().getY() - e.getTo().getY()) > 0.5) {
                loc.setY(loc.getY() - 1);
                int r = 3;
                for (int x = (r * -1); x <= r; x++) {
                    for (int y = (r * -1); y <= r; y++) {
                        for (int z = (r * -1); z <= r; z++) {
                            Block b = loc.getWorld().getBlockAt(loc.getBlockX() + x, loc.getBlockY() + y, loc.getBlockZ() + z);
                            if (b.getType() == Material.LAVA) {
                                e.setCancelled(true);
                                b.setType(Material.OBSIDIAN);
                            }
                        }
                    }
                }
            }
            loc.setY(loc.getY() - 1);
            int r = 3;
            for (int x = (r * -1); x <= r; x++) {
                for (int y = (r * -1); y <= r; y++) {
                    for (int z = (r * -1); z <= r; z++) {
                        Block b = loc.getWorld().getBlockAt(loc.getBlockX() + x, loc.getBlockY() + y, loc.getBlockZ() + z);
                        if (b.getType() == Material.LAVA) {
                            b.setType(Material.OBSIDIAN);
                        }
                    }
                }
            }
        }
    }
}
