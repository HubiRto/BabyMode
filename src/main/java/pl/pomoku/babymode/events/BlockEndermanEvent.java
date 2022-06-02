package pl.pomoku.babymode.events;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityTeleportEvent;
import pl.pomoku.babymode.Main;

public class BlockEndermanEvent implements Listener {
    Main plugin;
    public BlockEndermanEvent(Main m){
        plugin = m;
    }
    @EventHandler
    public void BlockEndermanEvent(EntityTeleportEvent e){
        if(e.getEntity().getType() == EntityType.ENDERMAN) {
            e.setCancelled(true);
        }
    }
}
