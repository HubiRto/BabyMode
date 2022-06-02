package pl.pomoku.babymode.events;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import pl.pomoku.babymode.Main;

public class RespawnZwierzat implements Listener {
    Main plugin;
    public RespawnZwierzat(Main m){
        plugin = m;
    }
    @EventHandler
    public void AnimalsDead(EntityDeathEvent e) {
        Player p = e.getEntity().getKiller();
        if(p != null) {
            if (plugin.getConfig().getBoolean(p.getDisplayName() + ".babymode")) {
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
