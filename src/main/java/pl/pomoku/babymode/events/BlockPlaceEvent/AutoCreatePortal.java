package pl.pomoku.babymode.events.BlockPlaceEvent;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import pl.pomoku.babymode.Main;

public class AutoCreatePortal implements Listener {
    Main plugin;
    public AutoCreatePortal(Main m){
        plugin = m;
    }
    @EventHandler
    public void DiamondDrop(BlockPlaceEvent e){
        if(plugin.getConfig().getBoolean("babymode")) {
            Player p = e.getPlayer();
            Block b = e.getBlock();
            Location loc = b.getLocation();
            if (b.getType() == Material.OBSIDIAN) {
                for (int a = 0; a < 4; a++) {
                    loc.setY(loc.getY() + 1);
                    loc.getBlock().setType(Material.OBSIDIAN);
                }
                for (int a = 0; a < 3; a++) {
                    loc.setX(loc.getX() + 1);
                    loc.getBlock().setType(Material.OBSIDIAN);
                }
                for (int a = 0; a < 4; a++) {
                    loc.setY(loc.getY() - 1);
                    loc.getBlock().setType(Material.OBSIDIAN);
                }
                for (int a = 0; a < 2; a++) {
                    loc.setX(loc.getX() - 1);
                    loc.getBlock().setType(Material.OBSIDIAN);
                }
                loc.setY(loc.getY() + 1);
                loc.getBlock().setType(Material.FIRE);
            }
        }
    }
}
