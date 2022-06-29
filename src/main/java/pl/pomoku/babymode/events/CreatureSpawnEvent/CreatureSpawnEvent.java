package pl.pomoku.babymode.events.CreatureSpawnEvent;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import pl.pomoku.babymode.Main;

public class CreatureSpawnEvent implements Listener {
    Main plugin;
    public CreatureSpawnEvent(Main m){
        plugin = m;
    }
    @EventHandler
    public void KillDragon(org.bukkit.event.entity.CreatureSpawnEvent e){
        if(plugin.getConfig().getBoolean("babymode")) {
            if (plugin.getConfig().getBoolean("kill_ender_dragon")) {
                if (e.getEntity().getType() == EntityType.ENDER_DRAGON) {
                    e.getEntity().setHealth(0);
                }
            }
        }
    }
}
