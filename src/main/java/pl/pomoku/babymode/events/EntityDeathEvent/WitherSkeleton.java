package pl.pomoku.babymode.events.EntityDeathEvent;

import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;
import pl.pomoku.babymode.Main;

import java.util.List;

public class WitherSkeleton implements Listener {
    Main plugin;
    public WitherSkeleton(Main m){
        plugin = m;
    }

    @EventHandler
    public void WitherSkieletonDrop(EntityDeathEvent e){
        if(plugin.getConfig().getBoolean("babymode")) {
            if (plugin.getConfig().getBoolean("wither_skeleton_drop")) {
                if (e.getEntity().getType() == EntityType.WITHER_SKELETON) {
                    List<ItemStack> list = e.getDrops();
                    list.add(new ItemStack(Material.WITHER_SKELETON_SKULL, 3));
                }
            }
        }
    }
}
