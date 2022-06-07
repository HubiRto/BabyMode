package pl.pomoku.babymode.events.EntityDamageEvent;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Item;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import pl.pomoku.babymode.Main;

public class BlockItemsBurning implements Listener {
    Main plugin;
    public BlockItemsBurning(Main m){
        plugin = m;
    }
    @EventHandler
    public void ItemsBurning(EntityDamageEvent e){
        Entity en = e.getEntity();
        if(en instanceof Item){
            if (e.getCause() == EntityDamageEvent.DamageCause.LAVA) {
                e.setCancelled(true);
            }
        }
    }
}
