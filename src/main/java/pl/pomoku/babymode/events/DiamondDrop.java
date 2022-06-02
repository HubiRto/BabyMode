package pl.pomoku.babymode.events;

import net.kyori.adventure.text.ComponentLike;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;
import pl.pomoku.babymode.Main;

import java.awt.dnd.DropTargetListener;
import java.util.Random;

import static org.bukkit.Material.DIAMOND;

public class DiamondDrop implements Listener {
    Main plugin;
    public DiamondDrop(Main m){
        plugin = m;
    }
    @EventHandler
    public void DiamondDrop(PlayerDropItemEvent e){
        Item drop = e.getItemDrop();
        Player p = e.getPlayer();
        if(drop.getItemStack().getType() == Material.DIAMOND){
            Bukkit.getScheduler().runTaskLaterAsynchronously(plugin, () -> {
                if (e.getItemDrop().isOnGround()) {
                    p.sendMessage("you littered!!");
                }
            }, (new Random().nextInt(5) + 10) * 20);
        }
    }
}
