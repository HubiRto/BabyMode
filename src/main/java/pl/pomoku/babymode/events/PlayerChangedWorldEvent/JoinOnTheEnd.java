package pl.pomoku.babymode.events.PlayerChangedWorldEvent;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChangedWorldEvent;
import org.bukkit.inventory.ItemStack;
import pl.pomoku.babymode.Main;

public class JoinOnTheEnd implements Listener {
    Main plugin;
    public JoinOnTheEnd(Main m){
        plugin = m;
    }

    @EventHandler
    public void JoinTheEnd(PlayerChangedWorldEvent e){
        Player p = e.getPlayer();
        if(plugin.getConfig().getBoolean("babymode")) {
            if(plugin.getConfig().getBoolean("join_the_end")) {
                if (p.getWorld().getName().equals("world_the_end")) {
                    if (!p.hasPlayedBefore()) {
                        p.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.AQUA + "Baby" + ChatColor.GOLD + "Mode" + ChatColor.DARK_GRAY + "]" + ChatColor.WHITE + " Dalem Ci maly upominek, zebys nie musial/a sie meczyc!");
                        Location loc = new Location(Bukkit.getWorld("world_the_end"), 0, 68, 0);
                        p.teleport(loc);
                        p.getInventory().addItem(new ItemStack(Material.DRAGON_EGG));
                        p.getInventory().addItem(new ItemStack(Material.DRAGON_BREATH, 16));
                        p.getInventory().addItem(new ItemStack(Material.DRAGON_HEAD));
                    }
                }
            }
        }
    }
}
