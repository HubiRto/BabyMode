package pl.pomoku.babymode.events.EntityDeathEvent;

import org.bukkit.enchantments.Enchantment;
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
            if(e.getEntity().getKiller() != null){
                Player p = e.getEntity().getKiller();
                p.getInventory().getItemInMainHand().containsEnchantment(Enchantment.LOOT_BONUS_MOBS);
            }else {
                List<ItemStack> items = e.getDrops();
                for (ItemStack item : items) {
                    int b = (item.getAmount()) * 3;
                    item.setAmount(b);

                }
            }
        }
    }
}
