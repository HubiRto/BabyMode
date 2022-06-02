package pl.pomoku.babymode.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDropItemEvent;
import pl.pomoku.babymode.Main;

public class EntityDropItem implements Listener {
    Main plugin;
    public EntityDropItem(Main m){
        plugin = m;
    }
    @EventHandler
    public void EntityDropItemEvent(EntityDropItemEvent e){
        e.setCancelled(true);
    }
}
