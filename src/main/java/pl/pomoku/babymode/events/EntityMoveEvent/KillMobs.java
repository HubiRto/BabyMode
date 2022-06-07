package pl.pomoku.babymode.events.EntityMoveEvent;

import io.papermc.paper.event.entity.EntityMoveEvent;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import pl.pomoku.babymode.Main;

public class KillMobs implements Listener {
    Main plugin;
    public KillMobs(Main m){
        plugin = m;
    }
    @EventHandler
    public void KillMobs(EntityMoveEvent e){
        if(plugin.getConfig().getBoolean("babymode") && plugin.getConfig().getBoolean("kill_mobs")) {
            if (e.getEntity().getType() == EntityType.WITHER) {
                e.getEntity().setHealth(0);
            }else if (e.getEntity().getType() == EntityType.ZOMBIE) {
                e.getEntity().setHealth(0);
            } else if (e.getEntity().getType() == EntityType.CREEPER) {
                e.getEntity().setHealth(0);
            } else if (e.getEntity().getType() == EntityType.SKELETON) {
                e.getEntity().setHealth(0);
            } else if (e.getEntity().getType() == EntityType.SPIDER) {
                e.getEntity().setHealth(0);
            } else if (e.getEntity().getType() == EntityType.DROWNED) {
                e.getEntity().setHealth(0);
            } else if (e.getEntity().getType() == EntityType.PHANTOM) {
                e.getEntity().setHealth(0);
            } else if (e.getEntity().getType() == EntityType.ENDERMAN) {
                e.getEntity().setHealth(0);
            }else if (e.getEntity().getType() == EntityType.WITCH) {
                e.getEntity().setHealth(0);
            }else if (e.getEntity().getType() == EntityType.CAVE_SPIDER) {
                e.getEntity().setHealth(0);
            }else if (e.getEntity().getType() == EntityType.ZOMBIE_VILLAGER) {
                e.getEntity().setHealth(0);
            }
        }
    }
}
