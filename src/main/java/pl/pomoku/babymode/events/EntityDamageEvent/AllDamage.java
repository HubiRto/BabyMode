package pl.pomoku.babymode.events.EntityDamageEvent;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import pl.pomoku.babymode.Main;

public class AllDamage implements Listener {
    Main plugin;
    public AllDamage(Main m){
        plugin = m;
    }

    @EventHandler
    public void AllDamagee(EntityDamageEvent e){
        if(plugin.getConfig().getBoolean("babymode")) {
            if(plugin.getConfig().getBoolean("alldamage")) {
                e.setCancelled(true);
            }
        }
    }

}
