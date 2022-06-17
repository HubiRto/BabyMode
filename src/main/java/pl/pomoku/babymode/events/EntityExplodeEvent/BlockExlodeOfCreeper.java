package pl.pomoku.babymode.events.EntityExplodeEvent;

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
            if(plugin.getConfig().getBoolean("block_explode")) {
                e.setCancelled(true);
            }
        }
    }
}
