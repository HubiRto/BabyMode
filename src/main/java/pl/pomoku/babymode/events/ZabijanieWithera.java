package pl.pomoku.babymode.events;

import io.papermc.paper.event.entity.EntityMoveEvent;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntitySpawnEvent;
import pl.pomoku.babymode.Main;

public class ZabijanieWithera implements Listener {
    Main plugin;
    public ZabijanieWithera(Main m){
        plugin = m;
    }

    @EventHandler
    public void ZabijanieWithera(EntityMoveEvent e) {
        if(e.getEntity().getType() == EntityType.WITHER){
            e.getEntity().setHealth(0);
        }
    }
}
