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
        wooden_sword_meta.addEnchant(Enchantment.SWEEPING_EDGE, 3, true);
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
        stone_sword_meta.addEnchant(Enchantment.SWEEPING_EDGE, 3, true);
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
        iron_sword_meta.addEnchant(Enchantment.SWEEPING_EDGE, 3, true);
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
        gold_sword_meta.addEnchant(Enchantment.SWEEPING_EDGE, 3, true);
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
        diamond_sword_meta.addEnchant(Enchantment.SWEEPING_EDGE, 3, true);
        diamond_sword.setItemMeta(diamond_sword_meta);

        ItemStack wooden_axe = new ItemStack(Material.WOODEN_AXE);
        ItemMeta wooden_axe_meta = wooden_axe.getItemMeta();
        wooden_axe_meta.addEnchant(Enchantment.DAMAGE_ALL, 5, true);
        wooden_axe_meta.addEnchant(Enchantment.DURABILITY, 3, true);
        wooden_axe_meta.addEnchant(Enchantment.MENDING, 1, true);
        wooden_axe_meta.addEnchant(Enchantment.DIG_SPEED, 5, true);
        wooden_axe_meta.addEnchant(Enchantment.SILK_TOUCH, 1, true);
        wooden_axe.setItemMeta(wooden_axe_meta);

        ItemStack stone_axe = new ItemStack(Material.STONE_AXE);
        ItemMeta stone_axe_meta = stone_axe.getItemMeta();
        stone_axe_meta.addEnchant(Enchantment.DAMAGE_ALL, 5, true);
        stone_axe_meta.addEnchant(Enchantment.DURABILITY, 3, true);
        stone_axe_meta.addEnchant(Enchantment.MENDING, 1, true);
        stone_axe_meta.addEnchant(Enchantment.DIG_SPEED, 5, true);
        stone_axe_meta.addEnchant(Enchantment.SILK_TOUCH, 1, true);
        stone_axe.setItemMeta(stone_axe_meta);

        ItemStack iron_axe = new ItemStack(Material.IRON_AXE);
        ItemMeta iron_axe_meta = iron_axe.getItemMeta();
        iron_axe_meta.addEnchant(Enchantment.DAMAGE_ALL, 5, true);
        iron_axe_meta.addEnchant(Enchantment.DURABILITY, 3, true);
        iron_axe_meta.addEnchant(Enchantment.MENDING, 1, true);
        iron_axe_meta.addEnchant(Enchantment.DIG_SPEED, 5, true);
        iron_axe_meta.addEnchant(Enchantment.SILK_TOUCH, 1, true);
        iron_axe.setItemMeta(iron_axe_meta);

        ItemStack gold_axe = new ItemStack(Material.GOLDEN_AXE);
        ItemMeta gold_axe_meta = gold_axe.getItemMeta();
        gold_axe_meta.addEnchant(Enchantment.DAMAGE_ALL, 5, true);
        gold_axe_meta.addEnchant(Enchantment.DURABILITY, 3, true);
        gold_axe_meta.addEnchant(Enchantment.MENDING, 1, true);
        gold_axe_meta.addEnchant(Enchantment.DIG_SPEED, 5, true);
        gold_axe_meta.addEnchant(Enchantment.SILK_TOUCH, 1, true);
        gold_axe.setItemMeta(gold_axe_meta);

        ItemStack diamond_axe = new ItemStack(Material.DIAMOND_AXE);
        ItemMeta diamond_axe_meta = diamond_axe.getItemMeta();
        diamond_axe_meta.addEnchant(Enchantment.DAMAGE_ALL, 5, true);
        diamond_axe_meta.addEnchant(Enchantment.DURABILITY, 3, true);
        diamond_axe_meta.addEnchant(Enchantment.MENDING, 1, true);
        diamond_axe_meta.addEnchant(Enchantment.DIG_SPEED, 5, true);
        diamond_axe_meta.addEnchant(Enchantment.SILK_TOUCH, 1, true);
        diamond_axe.setItemMeta(diamond_axe_meta);

        ItemStack wooden_pickaxe = new ItemStack(Material.WOODEN_PICKAXE);
        ItemMeta wooden_pickaxe_meta = wooden_pickaxe.getItemMeta();
        wooden_pickaxe_meta.addEnchant(Enchantment.DURABILITY, 3, true);
        wooden_pickaxe_meta.addEnchant(Enchantment.MENDING, 1, true);
        wooden_pickaxe_meta.addEnchant(Enchantment.DIG_SPEED, 5, true);
        wooden_pickaxe_meta.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 3, true);
        wooden_pickaxe.setItemMeta(wooden_pickaxe_meta);

        ItemStack stone_pickaxe = new ItemStack(Material.STONE_PICKAXE);
        ItemMeta stone_pickaxe_meta = stone_pickaxe.getItemMeta();
        stone_pickaxe_meta.addEnchant(Enchantment.DURABILITY, 3, true);
        stone_pickaxe_meta.addEnchant(Enchantment.MENDING, 1, true);
        stone_pickaxe_meta.addEnchant(Enchantment.DIG_SPEED, 5, true);
        stone_pickaxe_meta.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 3, true);
        stone_pickaxe.setItemMeta(stone_pickaxe_meta);

        ItemStack iron_pickaxe = new ItemStack(Material.IRON_PICKAXE);
        ItemMeta iron_pickaxe_meta = iron_pickaxe.getItemMeta();
        iron_pickaxe_meta.addEnchant(Enchantment.DURABILITY, 3, true);
        iron_pickaxe_meta.addEnchant(Enchantment.MENDING, 1, true);
        iron_pickaxe_meta.addEnchant(Enchantment.DIG_SPEED, 5, true);
        iron_pickaxe_meta.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 3, true);
        iron_pickaxe.setItemMeta(iron_pickaxe_meta);

        ItemStack gold_pickaxe = new ItemStack(Material.GOLDEN_PICKAXE);
        ItemMeta gold_pickaxe_meta = gold_pickaxe.getItemMeta();
        gold_pickaxe_meta.addEnchant(Enchantment.DURABILITY, 3, true);
        gold_pickaxe_meta.addEnchant(Enchantment.MENDING, 1, true);
        gold_pickaxe_meta.addEnchant(Enchantment.DIG_SPEED, 5, true);
        gold_pickaxe_meta.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 3, true);
        gold_pickaxe.setItemMeta(gold_pickaxe_meta);

        ItemStack diamond_pickaxe = new ItemStack(Material.DIAMOND_PICKAXE);
        ItemMeta diamond_pickaxe_meta = diamond_pickaxe.getItemMeta();
        diamond_pickaxe_meta.addEnchant(Enchantment.DURABILITY, 3, true);
        diamond_pickaxe_meta.addEnchant(Enchantment.MENDING, 1, true);
        diamond_pickaxe_meta.addEnchant(Enchantment.DIG_SPEED, 5, true);
        diamond_pickaxe_meta.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 3, true);
        diamond_pickaxe.setItemMeta(diamond_pickaxe_meta);

        ItemStack wooden_shovel = new ItemStack(Material.WOODEN_SHOVEL);
        ItemMeta wooden_shovel_meta = wooden_shovel.getItemMeta();
        wooden_shovel_meta.addEnchant(Enchantment.DURABILITY, 3, true);
        wooden_shovel_meta.addEnchant(Enchantment.MENDING, 1, true);
        wooden_shovel_meta.addEnchant(Enchantment.DIG_SPEED, 5, true);
        wooden_shovel_meta.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 3, true);
        wooden_shovel.setItemMeta(wooden_shovel_meta);

        ItemStack stone_shovel = new ItemStack(Material.STONE_SHOVEL);
        ItemMeta stone_shovel_meta = stone_shovel.getItemMeta();
        stone_shovel_meta.addEnchant(Enchantment.DURABILITY, 3, true);
        stone_shovel_meta.addEnchant(Enchantment.MENDING, 1, true);
        stone_shovel_meta.addEnchant(Enchantment.DIG_SPEED, 5, true);
        stone_shovel_meta.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 3, true);
        stone_shovel.setItemMeta(stone_shovel_meta);

        ItemStack iron_shovel = new ItemStack(Material.IRON_SHOVEL);
        ItemMeta iron_shovel_meta = iron_shovel.getItemMeta();
        iron_shovel_meta.addEnchant(Enchantment.DURABILITY, 3, true);
        iron_shovel_meta.addEnchant(Enchantment.MENDING, 1, true);
        iron_shovel_meta.addEnchant(Enchantment.DIG_SPEED, 5, true);
        iron_shovel_meta.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 3, true);
        iron_shovel.setItemMeta(iron_shovel_meta);

        ItemStack gold_shovel = new ItemStack(Material.GOLDEN_SHOVEL);
        ItemMeta gold_shovel_meta = gold_shovel.getItemMeta();
        gold_shovel_meta.addEnchant(Enchantment.DURABILITY, 3, true);
        gold_shovel_meta.addEnchant(Enchantment.MENDING, 1, true);
        gold_shovel_meta.addEnchant(Enchantment.DIG_SPEED, 5, true);
        gold_shovel_meta.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 3, true);
        gold_shovel.setItemMeta(gold_shovel_meta);

        ItemStack diamond_shovel = new ItemStack(Material.DIAMOND_SHOVEL);
        ItemMeta diamond_shovel_meta = diamond_shovel.getItemMeta();
        diamond_shovel_meta.addEnchant(Enchantment.DURABILITY, 3, true);
        diamond_shovel_meta.addEnchant(Enchantment.MENDING, 1, true);
        diamond_shovel_meta.addEnchant(Enchantment.DIG_SPEED, 5, true);
        diamond_shovel_meta.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 3, true);
        diamond_shovel.setItemMeta(diamond_shovel_meta);

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
            }else if (Objects.requireNonNull(e.getInventory().getResult()).getType() == Material.WOODEN_PICKAXE) {
                e.getInventory().setResult(wooden_pickaxe);
            }else if (Objects.requireNonNull(e.getInventory().getResult()).getType() == Material.STONE_PICKAXE) {
                e.getInventory().setResult(stone_pickaxe);
            }else if (Objects.requireNonNull(e.getInventory().getResult()).getType() == Material.IRON_PICKAXE) {
                e.getInventory().setResult(iron_pickaxe);
            }else if (Objects.requireNonNull(e.getInventory().getResult()).getType() == Material.GOLDEN_PICKAXE) {
                e.getInventory().setResult(gold_pickaxe);
            }else if (Objects.requireNonNull(e.getInventory().getResult()).getType() == Material.DIAMOND_PICKAXE) {
                e.getInventory().setResult(diamond_pickaxe);
            }else if (Objects.requireNonNull(e.getInventory().getResult()).getType() == Material.WOODEN_SHOVEL) {
                e.getInventory().setResult(wooden_shovel);
            }else if (Objects.requireNonNull(e.getInventory().getResult()).getType() == Material.STONE_SHOVEL) {
                e.getInventory().setResult(stone_shovel);
            }else if (Objects.requireNonNull(e.getInventory().getResult()).getType() == Material.IRON_SHOVEL) {
                e.getInventory().setResult(iron_shovel);
            }else if (Objects.requireNonNull(e.getInventory().getResult()).getType() == Material.GOLDEN_SHOVEL) {
                e.getInventory().setResult(gold_shovel);
            }else if (Objects.requireNonNull(e.getInventory().getResult()).getType() == Material.DIAMOND_SHOVEL) {
                e.getInventory().setResult(diamond_shovel);
            }
        }
    }
}
