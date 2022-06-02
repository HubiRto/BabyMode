package pl.pomoku.babymode.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityExplodeEvent;
import pl.pomoku.babymode.Main;

public class BlokowanieWybuchuCreepera implements Listener {
    Main plugin;
    public BlokowanieWybuchuCreepera(Main m){
        plugin = m;
    }
    @EventHandler
    public void CreeperExpodeBlock(EntityExplodeEvent e){
        e.setCancelled(true);
    }
}
