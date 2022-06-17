package pl.pomoku.babymode.events.PrepareSmithingEvent;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.PrepareSmithingEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import pl.pomoku.babymode.Main;

public class AutoEnchantUpgradeItems implements Listener {
    Main plugin;
    public AutoEnchantUpgradeItems(Main m){
        plugin = m;
    }
    @EventHandler
    public void SmithingEvent(PrepareSmithingEvent e){

        ItemStack netherite_sword = new ItemStack(Material.NETHERITE_SWORD);
        ItemMeta netherite_sword_meta = netherite_sword.getItemMeta();
        netherite_sword_meta.addEnchant(Enchantment.FIRE_ASPECT, 2, true);
        netherite_sword_meta.addEnchant(Enchantment.DAMAGE_ALL, 5, true);
        netherite_sword_meta.addEnchant(Enchantment.DAMAGE_UNDEAD, 5, true);
        netherite_sword_meta.addEnchant(Enchantment.DAMAGE_ARTHROPODS, 5, true);
        netherite_sword_meta.addEnchant(Enchantment.LOOT_BONUS_MOBS, 3, true);
        netherite_sword_meta.addEnchant(Enchantment.MENDING, 1, true);
        netherite_sword_meta.addEnchant(Enchantment.DURABILITY, 3, true);
        netherite_sword_meta.addEnchant(Enchantment.KNOCKBACK, 2, true);
        netherite_sword.setItemMeta(netherite_sword_meta);

        ItemStack netherite_axe = new ItemStack(Material.NETHERITE_AXE);
        ItemMeta netherite_axe_meta = netherite_axe.getItemMeta();
        netherite_axe_meta.addEnchant(Enchantment.DAMAGE_ALL, 5, true);
        netherite_axe_meta.addEnchant(Enchantment.DURABILITY, 3, true);
        netherite_axe_meta.addEnchant(Enchantment.MENDING, 1, true);
        netherite_axe_meta.addEnchant(Enchantment.DIG_SPEED, 5, true);
        netherite_axe.setItemMeta(netherite_axe_meta);

        if(e.getResult() != null) {
            if(e.getResult().getType() == Material.NETHERITE_SWORD){
                e.setResult(netherite_sword);
            }else if(e.getResult().getType() == Material.NETHERITE_AXE){
                e.setResult(netherite_axe);
            }
        }
    }
}
