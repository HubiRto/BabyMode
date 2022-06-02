package pl.pomoku.babymode.events;

import io.papermc.paper.event.entity.EntityMoveEvent;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import pl.pomoku.babymode.Main;

public class ZabijaniePotworow implements Listener {
    Main plugin;
    public ZabijaniePotworow(Main m){
        plugin = m;
    }
    @EventHandler
    public void KillMobs(EntityMoveEvent e){
        if(e.getEntity().getType() == EntityType.ZOMBIE) {
            e.getEntity().setHealth(0);
        }else if(e.getEntity().getType() == EntityType.CREEPER){
            e.getEntity().setHealth(0);
        }else if(e.getEntity().getType() == EntityType.SKELETON){
            e.getEntity().setHealth(0);
        }else if(e.getEntity().getType() == EntityType.SPIDER){
            e.getEntity().setHealth(0);
        }else if(e.getEntity().getType() == EntityType.DROWNED){
            e.getEntity().setHealth(0);
        }else if(e.getEntity().getType() == EntityType.PHANTOM){
            e.getEntity().setHealth(0);
        }else if(e.getEntity().getType() == EntityType.ENDERMAN){
            e.getEntity().setHealth(0);
        }

    }
}
