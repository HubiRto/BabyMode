package pl.pomoku.babymode.events.EntityMoveEvent.EntityExplodeEvent;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityExplodeEvent;
import pl.pomoku.babymode.Main;

public class BlockExlodeOfCreeper implements Listener {
    Main plugin;
    public BlockExlodeOfCreeper(Main m){
        plugin = m;
    }
    @EventHandler
    public void CreeperExpodeBlock(EntityExplodeEvent e){
        if(plugin.getConfig().getBoolean("babymode")) {
            e.setCancelled(true);
        }
    }
}
