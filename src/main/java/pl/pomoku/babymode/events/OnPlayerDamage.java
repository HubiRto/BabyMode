package pl.pomoku.babymode.events;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.data.Levelled;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import pl.pomoku.babymode.Main;

public class OnPlayerDamage implements Listener {
    Main plugin;
    public OnPlayerDamage(Main m){
        plugin = m;
    }

    @EventHandler
    public void onPlayerDamage(EntityDamageEvent e) {
        if (e.getEntity() instanceof Player) {
            Player p = ((Player) e.getEntity()).getPlayer();
            if(plugin.getConfig().getBoolean(p.getDisplayName() + ".babymode")) {
                e.setCancelled(true);
                if (e.getCause().equals(EntityDamageEvent.DamageCause.FIRE_TICK)) {
                    Location loc = p.getLocation();
                    Block b = loc.getBlock();
                    b.setType(Material.WATER);
                    p.sendMessage(ChatColor.WHITE + "<" + ChatColor.GOLD + "Bog" + ChatColor.WHITE + ">" + ChatColor.GRAY + " Widzialem ze sie paliles, wiec cie ugasilem swoim strumieniem.");
                }
            }
        }
    }
}
