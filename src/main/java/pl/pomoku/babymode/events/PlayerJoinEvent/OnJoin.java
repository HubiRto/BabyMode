package pl.pomoku.babymode.events.PlayerJoinEvent;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import pl.pomoku.babymode.Main;


public class OnJoin implements Listener {
    Main plugin;
    public OnJoin(Main m){
        plugin = m;
    }
    @EventHandler
    public void OnJoin(PlayerJoinEvent e){
        plugin.getConfig().set("babymode", false);
        plugin.getConfig().set("kill_mobs", false);
        plugin.saveConfig();
    }
}
