package pl.pomoku.babymode.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;
import pl.pomoku.babymode.Main;

import java.util.List;

public class EntitiDiead implements Listener {
    Main plugin;
    public EntitiDiead(Main m){
        plugin = m;
    }
    @EventHandler
    public void EntitiDiead(EntityDeathEvent e){
        List<ItemStack> items = e.getDrops();
        for (ItemStack item : items) {
            int b = (item.getAmount()) * 3;
            item.setAmount(b);

        }
    }
}
