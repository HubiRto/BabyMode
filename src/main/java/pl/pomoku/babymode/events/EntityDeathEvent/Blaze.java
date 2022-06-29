package pl.pomoku.babymode.events.EntityDeathEvent;

import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;
import pl.pomoku.babymode.Main;

import java.util.List;

public class Blaze implements Listener {
    Main plugin;
    public Blaze(Main m){
        plugin = m;
    }

    @EventHandler
    public void BlazeDrop(EntityDeathEvent e){
        if(plugin.getConfig().getBoolean("babymode")) {
            if (plugin.getConfig().getBoolean("blaze_drop")) {
                if (e.getEntity().getType() == EntityType.BLAZE) {
                    List<ItemStack> list = e.getDrops();
                    list.add(new ItemStack(Material.BLAZE_ROD, 12));
                }
            }
        }
    }
}
