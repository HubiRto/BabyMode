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
                if (plugin.getConfig().getBoolean("respawn_animals")) {
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
                    } else if (e.getEntity().getType() == EntityType.SQUID) {
                        e.getEntity().getWorld().spawnEntity(e.getEntity().getLocation(), e.getEntityType());
                    } else if (e.getEntity().getType() == EntityType.TROPICAL_FISH) {
                        e.getEntity().getWorld().spawnEntity(e.getEntity().getLocation(), e.getEntityType());
                    } else if (e.getEntity().getType() == EntityType.PUFFERFISH) {
                        e.getEntity().getWorld().spawnEntity(e.getEntity().getLocation(), e.getEntityType());
                    } else if (e.getEntity().getType() == EntityType.SALMON) {
                        e.getEntity().getWorld().spawnEntity(e.getEntity().getLocation(), e.getEntityType());
                    } else if (e.getEntity().getType() == EntityType.COD) {
                        e.getEntity().getWorld().spawnEntity(e.getEntity().getLocation(), e.getEntityType());
                    } else if (e.getEntity().getType() == EntityType.AXOLOTL) {
                        e.getEntity().getWorld().spawnEntity(e.getEntity().getLocation(), e.getEntityType());
                    } else if (e.getEntity().getType() == EntityType.GOAT) {
                        e.getEntity().getWorld().spawnEntity(e.getEntity().getLocation(), e.getEntityType());
                    } else if (e.getEntity().getType() == EntityType.HORSE) {
                        e.getEntity().getWorld().spawnEntity(e.getEntity().getLocation(), e.getEntityType());
                    } else if (e.getEntity().getType() == EntityType.BAT) {
                        e.getEntity().getWorld().spawnEntity(e.getEntity().getLocation(), e.getEntityType());
                    } else if (e.getEntity().getType() == EntityType.CAT) {
                        e.getEntity().getWorld().spawnEntity(e.getEntity().getLocation(), e.getEntityType());
                    } else if (e.getEntity().getType() == EntityType.WOLF) {
                        e.getEntity().getWorld().spawnEntity(e.getEntity().getLocation(), e.getEntityType());
                    } else if (e.getEntity().getType() == EntityType.FOX) {
                        e.getEntity().getWorld().spawnEntity(e.getEntity().getLocation(), e.getEntityType());
                    } else if (e.getEntity().getType() == EntityType.POLAR_BEAR) {
                        e.getEntity().getWorld().spawnEntity(e.getEntity().getLocation(), e.getEntityType());
                    } else if (e.getEntity().getType() == EntityType.SALMON) {
                        e.getEntity().getWorld().spawnEntity(e.getEntity().getLocation(), e.getEntityType());
                    } else if (e.getEntity().getType() == EntityType.MUSHROOM_COW) {
                        e.getEntity().getWorld().spawnEntity(e.getEntity().getLocation(), e.getEntityType());
                    } else if (e.getEntity().getType() == EntityType.VILLAGER) {
                        e.getEntity().getWorld().spawnEntity(e.getEntity().getLocation(), e.getEntityType());
                    } else if (e.getEntity().getType() == EntityType.TURTLE) {
                        e.getEntity().getWorld().spawnEntity(e.getEntity().getLocation(), e.getEntityType());
                    } else if (e.getEntity().getType() == EntityType.GLOW_SQUID) {
                        e.getEntity().getWorld().spawnEntity(e.getEntity().getLocation(), e.getEntityType());
                    } else if (e.getEntity().getType() == EntityType.DONKEY) {
                        e.getEntity().getWorld().spawnEntity(e.getEntity().getLocation(), e.getEntityType());
                    } else if (e.getEntity().getType() == EntityType.PARROT) {
                        e.getEntity().getWorld().spawnEntity(e.getEntity().getLocation(), e.getEntityType());
                    } else if (e.getEntity().getType() == EntityType.MULE) {
                        e.getEntity().getWorld().spawnEntity(e.getEntity().getLocation(), e.getEntityType());
                    } else if (e.getEntity().getType() == EntityType.DOLPHIN) {
                        e.getEntity().getWorld().spawnEntity(e.getEntity().getLocation(), e.getEntityType());
                    } else if (e.getEntity().getType() == EntityType.LLAMA) {
                        e.getEntity().getWorld().spawnEntity(e.getEntity().getLocation(), e.getEntityType());
                    } else if (e.getEntity().getType() == EntityType.PANDA) {
                        e.getEntity().getWorld().spawnEntity(e.getEntity().getLocation(), e.getEntityType());
                    } else if (e.getEntity().getType() == EntityType.BEE) {
                        e.getEntity().getWorld().spawnEntity(e.getEntity().getLocation(), e.getEntityType());
                    }
                }
            }
        }
    }
}
