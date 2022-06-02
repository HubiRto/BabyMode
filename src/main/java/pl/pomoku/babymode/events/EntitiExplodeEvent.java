package pl.pomoku.babymode.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import pl.pomoku.babymode.Main;

public class EntitiExplodeEvent implements Listener {
    Main plugin;
    public EntitiExplodeEvent(Main m){
        plugin = m;
    }
    @EventHandler
    public void CreeperExpodeBlock(EntityExplodeEvent e){
        e.setCancelled(true);
    }
}
