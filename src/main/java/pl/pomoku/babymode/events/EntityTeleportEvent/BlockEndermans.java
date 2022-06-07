package pl.pomoku.babymode.events.EntityTeleportEvent;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityTeleportEvent;
import pl.pomoku.babymode.Main;

public class BlockEndermans implements Listener {
    Main plugin;
    public BlockEndermans(Main m){
        plugin = m;
    }
    @EventHandler
    public void BlockEndermanEvent(EntityTeleportEvent e){
        if(plugin.getConfig().getBoolean("babymode")) {
            if (e.getEntity().getType() == EntityType.ENDERMAN) {
                e.setCancelled(true);
            }
        }
    }
}
