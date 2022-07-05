package pl.pomoku.babymode.events.BlockBreakBlockEvent;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;
import pl.pomoku.babymode.Main;

public class DropFromNetherrack implements Listener {
    Main plugin;
    public DropFromNetherrack(Main m){
        plugin = m;
    }
    @EventHandler
    public void Drop(BlockBreakEvent e){
        if (plugin.getConfig().getBoolean("babymode")) {
            if (plugin.getConfig().getBoolean("netherrack_drop")) {
                Player p = e.getPlayer();
                if(p.getWorld().getName().equals("world_nether")) {
                    if (e.getBlock().getType() == Material.NETHERRACK) {
                        p.getInventory().addItem(new ItemStack(Material.NETHERITE_INGOT));
                    }
                }
            }
        }
    }
}
