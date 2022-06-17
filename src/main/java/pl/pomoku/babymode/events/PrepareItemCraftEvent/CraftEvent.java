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

        ItemStack iron_sword = new ItemStack(Material.IRON_SWORD);
        ItemMeta iron_sword_meta = iron_sword.getItemMeta();
        iron_sword_meta.addEnchant(Enchantment.FIRE_ASPECT, 2, true);
        iron_sword_meta.addEnchant(Enchantment.DAMAGE_ALL, 5, true);
        iron_sword_meta.addEnchant(Enchantment.DAMAGE_UNDEAD, 5, true);
        iron_sword_meta.addEnchant(Enchantment.DAMAGE_ARTHROPODS, 5, true);
        iron_sword_meta.addEnchant(Enchantment.LOOT_BONUS_MOBS, 3, true);
        iron_sword_meta.addEnchant(Enchantment.MENDING, 1, true);
        iron_sword_meta.addEnchant(Enchantment.DURABILITY, 3, true);
        iron_sword_meta.addEnchant(Enchantment.KNOCKBACK, 2, true);
        iron_sword.setItemMeta(iron_sword_meta);

        ItemStack gold_sword = new ItemStack(Material.GOLDEN_SWORD);
        ItemMeta gold_sword_meta = gold_sword.getItemMeta();
        gold_sword_meta.addEnchant(Enchantment.FIRE_ASPECT, 2, true);
        gold_sword_meta.addEnchant(Enchantment.DAMAGE_ALL, 5, true);
        gold_sword_meta.addEnchant(Enchantment.DAMAGE_UNDEAD, 5, true);
        gold_sword_meta.addEnchant(Enchantment.DAMAGE_ARTHROPODS, 5, true);
        gold_sword_meta.addEnchant(Enchantment.LOOT_BONUS_MOBS, 3, true);
        gold_sword_meta.addEnchant(Enchantment.MENDING, 1, true);
        gold_sword_meta.addEnchant(Enchantment.DURABILITY, 3, true);
        gold_sword_meta.addEnchant(Enchantment.KNOCKBACK, 2, true);
        gold_sword.setItemMeta(gold_sword_meta);

        ItemStack diamond_sword = new ItemStack(Material.DIAMOND_SWORD);
        ItemMeta diamond_sword_meta = diamond_sword.getItemMeta();
        diamond_sword_meta.addEnchant(Enchantment.FIRE_ASPECT, 2, true);
        diamond_sword_meta.addEnchant(Enchantment.DAMAGE_ALL, 5, true);
        diamond_sword_meta.addEnchant(Enchantment.DAMAGE_UNDEAD, 5, true);
        diamond_sword_meta.addEnchant(Enchantment.DAMAGE_ARTHROPODS, 5, true);
        diamond_sword_meta.addEnchant(Enchantment.LOOT_BONUS_MOBS, 3, true);
        diamond_sword_meta.addEnchant(Enchantment.MENDING, 1, true);
        diamond_sword_meta.addEnchant(Enchantment.DURABILITY, 3, true);
        diamond_sword_meta.addEnchant(Enchantment.KNOCKBACK, 2, true);
        diamond_sword.setItemMeta(diamond_sword_meta);

        ItemStack wooden_axe = new ItemStack(Material.WOODEN_AXE);
        ItemMeta wooden_axe_meta = wooden_axe.getItemMeta();
        wooden_axe_meta.addEnchant(Enchantment.DAMAGE_ALL, 5, true);
        wooden_axe_meta.addEnchant(Enchantment.DURABILITY, 3, true);
        wooden_axe_meta.addEnchant(Enchantment.MENDING, 1, true);
        wooden_axe_meta.addEnchant(Enchantment.DIG_SPEED, 5, true);
        wooden_axe.setItemMeta(wooden_axe_meta);

        ItemStack stone_axe = new ItemStack(Material.STONE_AXE);
        ItemMeta stone_axe_meta = stone_axe.getItemMeta();
        stone_axe_meta.addEnchant(Enchantment.DAMAGE_ALL, 5, true);
        stone_axe_meta.addEnchant(Enchantment.DURABILITY, 3, true);
        stone_axe_meta.addEnchant(Enchantment.MENDING, 1, true);
        stone_axe_meta.addEnchant(Enchantment.DIG_SPEED, 5, true);
        stone_axe.setItemMeta(stone_axe_meta);

        ItemStack iron_axe = new ItemStack(Material.IRON_AXE);
        ItemMeta iron_axe_meta = iron_axe.getItemMeta();
        iron_axe_meta.addEnchant(Enchantment.DAMAGE_ALL, 5, true);
        iron_axe_meta.addEnchant(Enchantment.DURABILITY, 3, true);
        iron_axe_meta.addEnchant(Enchantment.MENDING, 1, true);
        iron_axe_meta.addEnchant(Enchantment.DIG_SPEED, 5, true);
        iron_axe.setItemMeta(iron_axe_meta);

        ItemStack gold_axe = new ItemStack(Material.GOLDEN_AXE);
        ItemMeta gold_axe_meta = gold_axe.getItemMeta();
        gold_axe_meta.addEnchant(Enchantment.DAMAGE_ALL, 5, true);
        gold_axe_meta.addEnchant(Enchantment.DURABILITY, 3, true);
        gold_axe_meta.addEnchant(Enchantment.MENDING, 1, true);
        gold_axe_meta.addEnchant(Enchantment.DIG_SPEED, 5, true);
        gold_axe.setItemMeta(gold_axe_meta);

        ItemStack diamond_axe = new ItemStack(Material.DIAMOND_AXE);
        ItemMeta diamond_axe_meta = diamond_axe.getItemMeta();
        diamond_axe_meta.addEnchant(Enchantment.DAMAGE_ALL, 5, true);
        diamond_axe_meta.addEnchant(Enchantment.DURABILITY, 3, true);
        diamond_axe_meta.addEnchant(Enchantment.MENDING, 1, true);
        diamond_axe_meta.addEnchant(Enchantment.DIG_SPEED, 5, true);
        diamond_axe.setItemMeta(diamond_axe_meta);

        if(e.getRecipe() != null && e.getInventory().getResult() != null) {
            if (Objects.requireNonNull(e.getInventory().getResult()).getType() == Material.WOODEN_SWORD) {
                e.getInventory().setResult(wooden_sword);
            }else if (Objects.requireNonNull(e.getInventory().getResult()).getType() == Material.STONE_SWORD) {
                e.getInventory().setResult(stone_sword);
            }else if (Objects.requireNonNull(e.getInventory().getResult()).getType() == Material.IRON_SWORD) {
                e.getInventory().setResult(iron_sword);
            }else if (Objects.requireNonNull(e.getInventory().getResult()).getType() == Material.GOLDEN_SWORD) {
                e.getInventory().setResult(gold_sword);
            }else if (Objects.requireNonNull(e.getInventory().getResult()).getType() == Material.DIAMOND_SWORD) {
                e.getInventory().setResult(diamond_sword);
            }else if (Objects.requireNonNull(e.getInventory().getResult()).getType() == Material.WOODEN_AXE) {
                e.getInventory().setResult(wooden_axe);
            }else if (Objects.requireNonNull(e.getInventory().getResult()).getType() == Material.STONE_AXE) {
                e.getInventory().setResult(stone_axe);
            }else if (Objects.requireNonNull(e.getInventory().getResult()).getType() == Material.IRON_AXE) {
                e.getInventory().setResult(iron_axe);
            }else if (Objects.requireNonNull(e.getInventory().getResult()).getType() == Material.GOLDEN_AXE) {
                e.getInventory().setResult(gold_axe);
            }else if (Objects.requireNonNull(e.getInventory().getResult()).getType() == Material.DIAMOND_AXE) {
                e.getInventory().setResult(diamond_axe);
            }
        }
    }
}
