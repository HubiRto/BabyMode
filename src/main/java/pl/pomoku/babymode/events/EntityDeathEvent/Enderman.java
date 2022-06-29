package pl.pomoku.babymode.events.EntityDeathEvent;

import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;
import pl.pomoku.babymode.Main;

import java.util.ArrayList;
import java.util.List;

public class Enderman implements Listener {
    Main plugin;
    public Enderman(Main m){
        plugin = m;
    }

    @EventHandler
    public void EndermanDrop(EntityDeathEvent e){
        if(plugin.getConfig().getBoolean("babymode")) {
            if (plugin.getConfig().getBoolean("enderman_drop")) {
                if (e.getEntity().getType() == EntityType.ENDERMAN) {
                    List<ItemStack> list = e.getDrops();
                    list.add(new ItemStack(Material.ENDER_PEARL, 2));
                }
            }
        }
    }
}
