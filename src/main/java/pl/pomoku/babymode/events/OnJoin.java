package pl.pomoku.babymode.events;

import org.bukkit.entity.Player;
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
        Player p = e.getPlayer();
        plugin.getConfig().set(p.getDisplayName() + ".babymode", false);
        plugin.saveConfig();
    }
}
