package pl.pomoku.babymode.events.EntityDeathEvent;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Animals;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;
import pl.pomoku.babymode.Main;

import java.util.List;

public class IncreasingDropItemsFromMobs implements Listener {
    Main plugin;
    public IncreasingDropItemsFromMobs(Main m){
        plugin = m;
    }
    @EventHandler
    public void EntitiDiead(EntityDeathEvent e){
        if(plugin.getConfig().getBoolean("babymode")) {
            if(plugin.getConfig().getBoolean("more_loot")) {
                if(e.getEntity() instanceof Animals) {
                    List<ItemStack> items = e.getDrops();
                    for (ItemStack item : items) {
                        int b = (item.getAmount()) * 2;
                        item.setAmount(b);

                    }
                }
            }
        }
    }
}
