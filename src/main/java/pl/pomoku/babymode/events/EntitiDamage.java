package pl.pomoku.babymode.events;

import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import pl.pomoku.babymode.Main;

public class EntitiDamage implements Listener {
    Main plugin;
    public EntitiDamage(Main m){
        plugin = m;
    }
    @EventHandler
    public void EntitiDamage(EntityDamageByEntityEvent e){
        if(e.getDamager().getType() == EntityType.PLAYER) {
            Player p = (Player) e.getDamager();
            if (plugin.getConfig().getBoolean(p.getDisplayName() + ".babymode")) {
                if (e.getEntity().getType() == EntityType.COW) {
                    e.getEntity().setFireTicks(60);
                } else if (e.getEntity().getType() == EntityType.PIG) {
                    e.getEntity().setFireTicks(60);
                } else if (e.getEntity().getType() == EntityType.SHEEP) {
                    e.getEntity().setFireTicks(60);
                } else if (e.getEntity().getType() == EntityType.CHICKEN) {
                    e.getEntity().setFireTicks(60);
                } else if (e.getEntity().getType() == EntityType.RABBIT) {
                    e.getEntity().setFireTicks(60);
                }
            }
        }
    }
}
