package pl.pomoku.babymode.events.PlayerChangedWorldEvent;

import org.bukkit.*;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChangedWorldEvent;
import org.bukkit.inventory.ItemStack;
import pl.pomoku.babymode.Main;

public class JoinOnNether implements Listener {
    Main plugin;
    public JoinOnNether(Main m){
        plugin = m;
    }
    @EventHandler
    public void PlayerChangedWorldEvent(PlayerChangedWorldEvent e){
        Player p = e.getPlayer();
        if(plugin.getConfig().getBoolean("babymode")) {
            if(plugin.getConfig().getBoolean("join_nether")) {
                if (p.getWorld().getName().equals("world_nether")) {
                    if (!p.hasPlayedBefore()) {
                        p.sendMessage(ChatColor.WHITE + "<" + ChatColor.GOLD + "GOD" + ChatColor.WHITE + ">" + ChatColor.GRAY + "Dalem ci maly upominek, zeby nie musial/a sie meczyc!");
                        p.getInventory().addItem(new ItemStack(Material.ENDER_EYE, 16));
                        p.getInventory().addItem(new ItemStack(Material.ENDER_PEARL, 16));
                        p.getInventory().addItem(new ItemStack(Material.BLAZE_ROD, 16));
                    }
                }
            }
        }
    }
}
