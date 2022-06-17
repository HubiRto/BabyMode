package pl.pomoku.babymode.events.BlockPlaceEvent;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import pl.pomoku.babymode.Main;

public class AutoCreatePortal implements Listener {
    Main plugin;
    public AutoCreatePortal(Main m){
        plugin = m;
    }
    @EventHandler
    public void DiamondDrop(BlockPlaceEvent e){

        ItemStack is = new ItemStack(Material.OBSIDIAN);
        ItemMeta im = is.getItemMeta();
        im.setDisplayName("Portal");
        is.setItemMeta(im);

        if(plugin.getConfig().getBoolean("babymode")) {
            if(plugin.getConfig().getBoolean("crate_portal")) {
                Player p = e.getPlayer();
                Block b = e.getBlock();
                Location loc = b.getLocation();
                if (b.getType() == Material.OBSIDIAN) {
                    if (p.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals("§bPortal")) {
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
                        for (int a = 0; a <= 2; a++) {
                            loc.setY(loc.getY() + 1);
                            loc.getBlock().setType(Material.AIR);
                        }

                        loc.setX(loc.getX() + 1);
                        loc.setY(loc.getY() + 1);

                        for (int a = 0; a < 2; a++) {
                            loc.setY(loc.getY() - 1);
                            loc.getBlock().setType(Material.AIR);
                        }

                        loc.setY(loc.getY() - 1);
                        loc.getBlock().setType(Material.FIRE);
                    }
                }
            }
        }
    }
}
