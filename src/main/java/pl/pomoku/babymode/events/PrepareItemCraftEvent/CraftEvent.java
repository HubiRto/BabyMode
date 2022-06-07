package pl.pomoku.babymode.events.PrepareItemCraftEvent;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.PrepareItemCraftEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import pl.pomoku.babymode.Main;

import java.util.Objects;

public class CraftEvent implements Listener {
    Main plugin;
    public CraftEvent(Main m){
        plugin = m;
    }

    @EventHandler
    public void CraftEventt(PrepareItemCraftEvent e){

        ItemStack wooden_sword = new ItemStack(Material.WOODEN_SWORD);
        ItemMeta wooden_sword_meta = wooden_sword.getItemMeta();
        wooden_sword_meta.addEnchant(Enchantment.FIRE_ASPECT, 2, true);
        wooden_sword_meta.addEnchant(Enchantment.DAMAGE_ALL, 5, true);
        wooden_sword_meta.addEnchant(Enchantment.DAMAGE_UNDEAD, 5, true);
        wooden_sword_meta.addEnchant(Enchantment.DAMAGE_ARTHROPODS, 5, true);
        wooden_sword_meta.addEnchant(Enchantment.LOOT_BONUS_MOBS, 3, true);
        wooden_sword_meta.addEnchant(Enchantment.MENDING, 1, true);
        wooden_sword_meta.addEnchant(Enchantment.DURABILITY, 3, true);
        wooden_sword_meta.addEnchant(Enchantment.KNOCKBACK, 2, true);
        wooden_sword.setItemMeta(wooden_sword_meta);

        ItemStack stone_sword = new ItemStack(Material.STONE_SWORD);
        ItemMeta stone_sword_meta = stone_sword.getItemMeta();
        stone_sword_meta.addEnchant(Enchantment.FIRE_ASPECT, 2, true);
        stone_sword_meta.addEnchant(Enchantment.DAMAGE_ALL, 5, true);
        stone_sword_meta.addEnchant(Enchantment.DAMAGE_UNDEAD, 5, true);
        stone_sword_meta.addEnchant(Enchantment.DAMAGE_ARTHROPODS, 5, true);
        stone_sword_meta.addEnchant(Enchantment.LOOT_BONUS_MOBS, 3, true);
        stone_sword_meta.addEnchant(Enchantment.MENDING, 1, true);
        stone_sword_meta.addEnchant(Enchantment.DURABILITY, 3, true);
        stone_sword_meta.addEnchant(Enchantment.KNOCKBACK, 2, true);
        stone_sword.setItemMeta(stone_sword_meta);

        if(e.getRecipe() != null && e.getInventory().getResult() != null) {
            if (Objects.requireNonNull(e.getInventory().getResult()).getType() == Material.WOODEN_SWORD) {
                e.getInventory().setResult(wooden_sword);
            }else if (Objects.requireNonNull(e.getInventory().getResult()).getType() == Material.STONE_SWORD) {
                e.getInventory().setResult(stone_sword);
            }
        }
    }
}
