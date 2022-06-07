package pl.pomoku.babymode.events.EntityDeathEvent;

import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import pl.pomoku.babymode.Main;

public class RespawnAnimals implements Listener {
    Main plugin;
    public RespawnAnimals(Main m){
        plugin = m;
    }
    @EventHandler
    public void AnimalsDead(EntityDeathEvent e) {
        Player p = e.getEntity().getKiller();
        if(p != null) {
            if (plugin.getConfig().getBoolean("babymode")) {
                if (e.getEntity().getType() == EntityType.COW) {
                    e.getEntity().getWorld().spawnEntity(e.getEntity().getLocation(), e.getEntityType());
                } else if (e.getEntity().getType() == EntityType.PIG) {
                    e.getEntity().getWorld().spawnEntity(e.getEntity().getLocation(), e.getEntityType());
                } else if (e.getEntity().getType() == EntityType.SHEEP) {
                    e.getEntity().getWorld().spawnEntity(e.getEntity().getLocation(), e.getEntityType());
                } else if (e.getEntity().getType() == EntityType.CHICKEN) {
                    e.getEntity().getWorld().spawnEntity(e.getEntity().getLocation(), e.getEntityType());
                } else if (e.getEntity().getType() == EntityType.RABBIT) {
                    e.getEntity().getWorld().spawnEntity(e.getEntity().getLocation(), e.getEntityType());
                }
            }
        }
    }
}
