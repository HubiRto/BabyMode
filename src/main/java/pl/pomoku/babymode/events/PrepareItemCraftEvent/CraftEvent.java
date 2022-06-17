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
        if(plugin.getConfig().getBoolean("babymode")) {
            if(plugin.getConfig().getBoolean("auto_enchant")) {

                //SWORD

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

                //AXE

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

                //PICKAXE

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

                //SHOVEL

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

                //HOE

                ItemStack wooden_hoe = new ItemStack(Material.WOODEN_HOE);
                ItemMeta wooden_hoe_meta = wooden_hoe.getItemMeta();
                wooden_hoe_meta.addEnchant(Enchantment.DURABILITY, 3, true);
                wooden_hoe_meta.addEnchant(Enchantment.MENDING, 1, true);
                wooden_hoe_meta.addEnchant(Enchantment.DIG_SPEED, 5, true);
                wooden_hoe.setItemMeta(wooden_hoe_meta);

                ItemStack stone_hoe = new ItemStack(Material.STONE_HOE);
                ItemMeta stone_hoe_meta = stone_hoe.getItemMeta();
                stone_hoe_meta.addEnchant(Enchantment.DURABILITY, 3, true);
                stone_hoe_meta.addEnchant(Enchantment.MENDING, 1, true);
                stone_hoe_meta.addEnchant(Enchantment.DIG_SPEED, 5, true);
                stone_hoe.setItemMeta(stone_hoe_meta);

                ItemStack iron_hoe = new ItemStack(Material.IRON_HOE);
                ItemMeta iron_hoe_meta = iron_hoe.getItemMeta();
                iron_hoe_meta.addEnchant(Enchantment.DURABILITY, 3, true);
                iron_hoe_meta.addEnchant(Enchantment.MENDING, 1, true);
                iron_hoe_meta.addEnchant(Enchantment.DIG_SPEED, 5, true);
                iron_hoe.setItemMeta(iron_hoe_meta);

                ItemStack gold_hoe = new ItemStack(Material.GOLDEN_HOE);
                ItemMeta gold_hoe_meta = gold_hoe.getItemMeta();
                gold_hoe_meta.addEnchant(Enchantment.DURABILITY, 3, true);
                gold_hoe_meta.addEnchant(Enchantment.MENDING, 1, true);
                gold_hoe_meta.addEnchant(Enchantment.DIG_SPEED, 5, true);
                gold_hoe.setItemMeta(gold_hoe_meta);

                ItemStack diamond_hoe = new ItemStack(Material.DIAMOND_HOE);
                ItemMeta diamond_hoe_meta = diamond_hoe.getItemMeta();
                diamond_hoe_meta.addEnchant(Enchantment.DURABILITY, 3, true);
                diamond_hoe_meta.addEnchant(Enchantment.MENDING, 1, true);
                diamond_hoe_meta.addEnchant(Enchantment.DIG_SPEED, 5, true);
                diamond_hoe.setItemMeta(diamond_hoe_meta);

                //HELMET

                ItemStack leather_helmet = new ItemStack(Material.LEATHER_HELMET);
                ItemMeta leather_helmet_meta = leather_helmet.getItemMeta();
                leather_helmet_meta.addEnchant(Enchantment.DURABILITY, 3, true);
                leather_helmet_meta.addEnchant(Enchantment.MENDING, 1, true);
                leather_helmet_meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
                leather_helmet_meta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 4, true);
                leather_helmet_meta.addEnchant(Enchantment.PROTECTION_FIRE, 4, true);
                leather_helmet_meta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 4, true);
                leather_helmet_meta.addEnchant(Enchantment.OXYGEN, 3, true);
                leather_helmet_meta.addEnchant(Enchantment.WATER_WORKER, 1, true);
                leather_helmet.setItemMeta(leather_helmet_meta);

                ItemStack iron_helmet = new ItemStack(Material.IRON_HELMET);
                ItemMeta iron_helmet_meta = iron_helmet.getItemMeta();
                iron_helmet_meta.addEnchant(Enchantment.DURABILITY, 3, true);
                iron_helmet_meta.addEnchant(Enchantment.MENDING, 1, true);
                iron_helmet_meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
                iron_helmet_meta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 4, true);
                iron_helmet_meta.addEnchant(Enchantment.PROTECTION_FIRE, 4, true);
                iron_helmet_meta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 4, true);
                iron_helmet_meta.addEnchant(Enchantment.OXYGEN, 3, true);
                iron_helmet_meta.addEnchant(Enchantment.WATER_WORKER, 1, true);
                iron_helmet.setItemMeta(iron_helmet_meta);

                ItemStack gold_helmet = new ItemStack(Material.GOLDEN_HELMET);
                ItemMeta gold_helmet_meta = gold_helmet.getItemMeta();
                gold_helmet_meta.addEnchant(Enchantment.DURABILITY, 3, true);
                gold_helmet_meta.addEnchant(Enchantment.MENDING, 1, true);
                gold_helmet_meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
                gold_helmet_meta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 4, true);
                gold_helmet_meta.addEnchant(Enchantment.PROTECTION_FIRE, 4, true);
                gold_helmet_meta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 4, true);
                gold_helmet_meta.addEnchant(Enchantment.OXYGEN, 3, true);
                gold_helmet_meta.addEnchant(Enchantment.WATER_WORKER, 1, true);
                gold_helmet.setItemMeta(gold_helmet_meta);

                ItemStack diamond_helmet = new ItemStack(Material.DIAMOND_HELMET);
                ItemMeta diamond_helmet_meta = diamond_helmet.getItemMeta();
                diamond_helmet_meta.addEnchant(Enchantment.DURABILITY, 3, true);
                diamond_helmet_meta.addEnchant(Enchantment.MENDING, 1, true);
                diamond_helmet_meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
                diamond_helmet_meta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 4, true);
                diamond_helmet_meta.addEnchant(Enchantment.PROTECTION_FIRE, 4, true);
                diamond_helmet_meta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 4, true);
                diamond_helmet_meta.addEnchant(Enchantment.OXYGEN, 3, true);
                diamond_helmet_meta.addEnchant(Enchantment.WATER_WORKER, 1, true);
                diamond_helmet.setItemMeta(diamond_helmet_meta);

                //CHESTPLATE

                ItemStack leather_chestplate = new ItemStack(Material.LEATHER_CHESTPLATE);
                ItemMeta leather_chestplate_meta = leather_chestplate.getItemMeta();
                leather_chestplate_meta.addEnchant(Enchantment.DURABILITY, 3, true);
                leather_chestplate_meta.addEnchant(Enchantment.MENDING, 1, true);
                leather_chestplate_meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
                leather_chestplate_meta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 4, true);
                leather_chestplate_meta.addEnchant(Enchantment.PROTECTION_FIRE, 4, true);
                leather_chestplate_meta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 4, true);
                leather_chestplate.setItemMeta(leather_chestplate_meta);

                ItemStack iron_chestplate = new ItemStack(Material.IRON_CHESTPLATE);
                ItemMeta iron_chestplate_meta = iron_chestplate.getItemMeta();
                iron_chestplate_meta.addEnchant(Enchantment.DURABILITY, 3, true);
                iron_chestplate_meta.addEnchant(Enchantment.MENDING, 1, true);
                iron_chestplate_meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
                iron_chestplate_meta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 4, true);
                iron_chestplate_meta.addEnchant(Enchantment.PROTECTION_FIRE, 4, true);
                iron_chestplate_meta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 4, true);
                iron_chestplate.setItemMeta(iron_chestplate_meta);

                ItemStack gold_chestplate = new ItemStack(Material.GOLDEN_CHESTPLATE);
                ItemMeta gold_chestplate_meta = gold_chestplate.getItemMeta();
                gold_chestplate_meta.addEnchant(Enchantment.DURABILITY, 3, true);
                gold_chestplate_meta.addEnchant(Enchantment.MENDING, 1, true);
                gold_chestplate_meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
                gold_chestplate_meta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 4, true);
                gold_chestplate_meta.addEnchant(Enchantment.PROTECTION_FIRE, 4, true);
                gold_chestplate_meta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 4, true);
                gold_chestplate.setItemMeta(gold_chestplate_meta);

                ItemStack diamond_chestplate = new ItemStack(Material.DIAMOND_CHESTPLATE);
                ItemMeta diamond_chestplate_meta = diamond_chestplate.getItemMeta();
                diamond_chestplate_meta.addEnchant(Enchantment.DURABILITY, 3, true);
                diamond_chestplate_meta.addEnchant(Enchantment.MENDING, 1, true);
                diamond_chestplate_meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
                diamond_chestplate_meta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 4, true);
                diamond_chestplate_meta.addEnchant(Enchantment.PROTECTION_FIRE, 4, true);
                diamond_chestplate_meta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 4, true);
                diamond_chestplate.setItemMeta(diamond_chestplate_meta);

                //LEGGINGS

                ItemStack leather_leggings = new ItemStack(Material.LEATHER_LEGGINGS);
                ItemMeta leather_leggings_meta = leather_leggings.getItemMeta();
                leather_leggings_meta.addEnchant(Enchantment.DURABILITY, 3, true);
                leather_leggings_meta.addEnchant(Enchantment.MENDING, 1, true);
                leather_leggings_meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
                leather_leggings_meta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 4, true);
                leather_leggings_meta.addEnchant(Enchantment.PROTECTION_FIRE, 4, true);
                leather_leggings_meta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 4, true);
                leather_leggings.setItemMeta(leather_leggings_meta);

                ItemStack iron_leggings = new ItemStack(Material.IRON_LEGGINGS);
                ItemMeta iron_leggings_meta = iron_leggings.getItemMeta();
                iron_leggings_meta.addEnchant(Enchantment.DURABILITY, 3, true);
                iron_leggings_meta.addEnchant(Enchantment.MENDING, 1, true);
                iron_leggings_meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
                iron_leggings_meta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 4, true);
                iron_leggings_meta.addEnchant(Enchantment.PROTECTION_FIRE, 4, true);
                iron_leggings_meta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 4, true);
                iron_leggings.setItemMeta(iron_leggings_meta);

                ItemStack gold_leggings = new ItemStack(Material.GOLDEN_LEGGINGS);
                ItemMeta gold_leggings_meta = gold_leggings.getItemMeta();
                gold_leggings_meta.addEnchant(Enchantment.DURABILITY, 3, true);
                gold_leggings_meta.addEnchant(Enchantment.MENDING, 1, true);
                gold_leggings_meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
                gold_leggings_meta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 4, true);
                gold_leggings_meta.addEnchant(Enchantment.PROTECTION_FIRE, 4, true);
                gold_leggings_meta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 4, true);
                gold_leggings.setItemMeta(gold_leggings_meta);

                ItemStack diamond_leggings = new ItemStack(Material.DIAMOND_LEGGINGS);
                ItemMeta diamond_leggings_meta = diamond_leggings.getItemMeta();
                diamond_leggings_meta.addEnchant(Enchantment.DURABILITY, 3, true);
                diamond_leggings_meta.addEnchant(Enchantment.MENDING, 1, true);
                diamond_leggings_meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
                diamond_leggings_meta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 4, true);
                diamond_leggings_meta.addEnchant(Enchantment.PROTECTION_FIRE, 4, true);
                diamond_leggings_meta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 4, true);
                diamond_leggings.setItemMeta(diamond_leggings_meta);

                //BOOTS

                ItemStack leather_boots = new ItemStack(Material.LEATHER_BOOTS);
                ItemMeta leather_boots_meta = leather_boots.getItemMeta();
                leather_boots_meta.addEnchant(Enchantment.DURABILITY, 3, true);
                leather_boots_meta.addEnchant(Enchantment.MENDING, 1, true);
                leather_boots_meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
                leather_boots_meta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 4, true);
                leather_boots_meta.addEnchant(Enchantment.PROTECTION_FIRE, 4, true);
                leather_boots_meta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 4, true);
                leather_boots_meta.addEnchant(Enchantment.DEPTH_STRIDER, 3, true);
                leather_boots_meta.addEnchant(Enchantment.SOUL_SPEED, 3, true);
                leather_boots_meta.addEnchant(Enchantment.PROTECTION_FALL, 4, true);
                leather_boots.setItemMeta(leather_boots_meta);

                ItemStack iron_boots = new ItemStack(Material.IRON_BOOTS);
                ItemMeta iron_boots_meta = iron_boots.getItemMeta();
                iron_boots_meta.addEnchant(Enchantment.DURABILITY, 3, true);
                iron_boots_meta.addEnchant(Enchantment.MENDING, 1, true);
                iron_boots_meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
                iron_boots_meta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 4, true);
                iron_boots_meta.addEnchant(Enchantment.PROTECTION_FIRE, 4, true);
                iron_boots_meta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 4, true);
                iron_boots_meta.addEnchant(Enchantment.DEPTH_STRIDER, 3, true);
                iron_boots_meta.addEnchant(Enchantment.SOUL_SPEED, 3, true);
                iron_boots_meta.addEnchant(Enchantment.PROTECTION_FALL, 4, true);
                iron_boots.setItemMeta(iron_boots_meta);

                ItemStack gold_boots = new ItemStack(Material.GOLDEN_BOOTS);
                ItemMeta gold_boots_meta = gold_boots.getItemMeta();
                gold_boots_meta.addEnchant(Enchantment.DURABILITY, 3, true);
                gold_boots_meta.addEnchant(Enchantment.MENDING, 1, true);
                gold_boots_meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
                gold_boots_meta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 4, true);
                gold_boots_meta.addEnchant(Enchantment.PROTECTION_FIRE, 4, true);
                gold_boots_meta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 4, true);
                gold_boots_meta.addEnchant(Enchantment.DEPTH_STRIDER, 3, true);
                gold_boots_meta.addEnchant(Enchantment.SOUL_SPEED, 3, true);
                gold_boots_meta.addEnchant(Enchantment.PROTECTION_FALL, 4, true);
                gold_boots.setItemMeta(gold_boots_meta);

                ItemStack diamond_boots = new ItemStack(Material.DIAMOND_BOOTS);
                ItemMeta diamond_boots_meta = diamond_boots.getItemMeta();
                diamond_boots_meta.addEnchant(Enchantment.DURABILITY, 3, true);
                diamond_boots_meta.addEnchant(Enchantment.MENDING, 1, true);
                diamond_boots_meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
                diamond_boots_meta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 4, true);
                diamond_boots_meta.addEnchant(Enchantment.PROTECTION_FIRE, 4, true);
                diamond_boots_meta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 4, true);
                diamond_boots_meta.addEnchant(Enchantment.DEPTH_STRIDER, 3, true);
                diamond_boots_meta.addEnchant(Enchantment.SOUL_SPEED, 3, true);
                diamond_boots_meta.addEnchant(Enchantment.PROTECTION_FALL, 4, true);
                diamond_boots.setItemMeta(diamond_boots_meta);

                //BOW
                ItemStack bow = new ItemStack(Material.BOW);
                ItemMeta bow_meta = bow.getItemMeta();
                bow_meta.addEnchant(Enchantment.ARROW_INFINITE, 1, true);
                bow_meta.addEnchant(Enchantment.ARROW_DAMAGE, 5, true);
                bow_meta.addEnchant(Enchantment.ARROW_FIRE, 1, true);
                bow_meta.addEnchant(Enchantment.ARROW_KNOCKBACK, 2, true);
                bow_meta.addEnchant(Enchantment.DURABILITY, 3, true);
                bow.setItemMeta(bow_meta);

                //CROSSBOW
                ItemStack crossbow = new ItemStack(Material.CROSSBOW);
                ItemMeta crossbow_meta = crossbow.getItemMeta();
                crossbow_meta.addEnchant(Enchantment.QUICK_CHARGE, 3, true);
                crossbow_meta.addEnchant(Enchantment.PIERCING, 4, true);
                crossbow_meta.addEnchant(Enchantment.MENDING, 1, true);
                crossbow_meta.addEnchant(Enchantment.DURABILITY, 3, true);
                crossbow.setItemMeta(crossbow_meta);

                //SHEARS
                ItemStack shears = new ItemStack(Material.SHEARS);
                ItemMeta shears_meta = shears.getItemMeta();
                shears_meta.addEnchant(Enchantment.DIG_SPEED, 5, true);
                shears_meta.addEnchant(Enchantment.MENDING, 1, true);
                shears_meta.addEnchant(Enchantment.DURABILITY, 3, true);
                shears.setItemMeta(shears_meta);

                //FLINT_AND_STEEL
                ItemStack flint_and_steel = new ItemStack(Material.FLINT_AND_STEEL);
                ItemMeta flint_and_steel_meta = flint_and_steel.getItemMeta();
                flint_and_steel_meta.addEnchant(Enchantment.MENDING, 1, true);
                flint_and_steel_meta.addEnchant(Enchantment.DURABILITY, 3, true);
                flint_and_steel.setItemMeta(flint_and_steel_meta);

                //FISHING_ROD
                ItemStack fishing_rod = new ItemStack(Material.FISHING_ROD);
                ItemMeta fishing_rod_meta = fishing_rod.getItemMeta();
                fishing_rod_meta.addEnchant(Enchantment.MENDING, 1, true);
                fishing_rod_meta.addEnchant(Enchantment.DURABILITY, 3, true);
                fishing_rod_meta.addEnchant(Enchantment.LURE, 3, true);
                fishing_rod_meta.addEnchant(Enchantment.LUCK, 3, true);
                fishing_rod.setItemMeta(fishing_rod_meta);

                //SHIELD
                ItemStack shield = new ItemStack(Material.SHIELD);
                ItemMeta shield_meta = shield.getItemMeta();
                shield_meta.addEnchant(Enchantment.MENDING, 1, true);
                shield_meta.addEnchant(Enchantment.DURABILITY, 3, true);
                shield.setItemMeta(shield_meta);

                if (e.getRecipe() != null && e.getInventory().getResult() != null) {
                    if (Objects.requireNonNull(e.getInventory().getResult()).getType() == Material.WOODEN_SWORD) {
                        e.getInventory().setResult(wooden_sword);
                    } else if (Objects.requireNonNull(e.getInventory().getResult()).getType() == Material.STONE_SWORD) {
                        e.getInventory().setResult(stone_sword);
                    } else if (Objects.requireNonNull(e.getInventory().getResult()).getType() == Material.IRON_SWORD) {
                        e.getInventory().setResult(iron_sword);
                    } else if (Objects.requireNonNull(e.getInventory().getResult()).getType() == Material.GOLDEN_SWORD) {
                        e.getInventory().setResult(gold_sword);
                    } else if (Objects.requireNonNull(e.getInventory().getResult()).getType() == Material.DIAMOND_SWORD) {
                        e.getInventory().setResult(diamond_sword);
                    } else if (Objects.requireNonNull(e.getInventory().getResult()).getType() == Material.WOODEN_AXE) {
                        e.getInventory().setResult(wooden_axe);
                    } else if (Objects.requireNonNull(e.getInventory().getResult()).getType() == Material.STONE_AXE) {
                        e.getInventory().setResult(stone_axe);
                    } else if (Objects.requireNonNull(e.getInventory().getResult()).getType() == Material.IRON_AXE) {
                        e.getInventory().setResult(iron_axe);
                    } else if (Objects.requireNonNull(e.getInventory().getResult()).getType() == Material.GOLDEN_AXE) {
                        e.getInventory().setResult(gold_axe);
                    } else if (Objects.requireNonNull(e.getInventory().getResult()).getType() == Material.DIAMOND_AXE) {
                        e.getInventory().setResult(diamond_axe);
                    } else if (Objects.requireNonNull(e.getInventory().getResult()).getType() == Material.WOODEN_PICKAXE) {
                        e.getInventory().setResult(wooden_pickaxe);
                    } else if (Objects.requireNonNull(e.getInventory().getResult()).getType() == Material.STONE_PICKAXE) {
                        e.getInventory().setResult(stone_pickaxe);
                    } else if (Objects.requireNonNull(e.getInventory().getResult()).getType() == Material.IRON_PICKAXE) {
                        e.getInventory().setResult(iron_pickaxe);
                    } else if (Objects.requireNonNull(e.getInventory().getResult()).getType() == Material.GOLDEN_PICKAXE) {
                        e.getInventory().setResult(gold_pickaxe);
                    } else if (Objects.requireNonNull(e.getInventory().getResult()).getType() == Material.DIAMOND_PICKAXE) {
                        e.getInventory().setResult(diamond_pickaxe);
                    } else if (Objects.requireNonNull(e.getInventory().getResult()).getType() == Material.WOODEN_SHOVEL) {
                        e.getInventory().setResult(wooden_shovel);
                    } else if (Objects.requireNonNull(e.getInventory().getResult()).getType() == Material.STONE_SHOVEL) {
                        e.getInventory().setResult(stone_shovel);
                    } else if (Objects.requireNonNull(e.getInventory().getResult()).getType() == Material.IRON_SHOVEL) {
                        e.getInventory().setResult(iron_shovel);
                    } else if (Objects.requireNonNull(e.getInventory().getResult()).getType() == Material.GOLDEN_SHOVEL) {
                        e.getInventory().setResult(gold_shovel);
                    } else if (Objects.requireNonNull(e.getInventory().getResult()).getType() == Material.DIAMOND_SHOVEL) {
                        e.getInventory().setResult(diamond_shovel);
                    } else if (Objects.requireNonNull(e.getInventory().getResult()).getType() == Material.WOODEN_HOE) {
                        e.getInventory().setResult(wooden_hoe);
                    } else if (Objects.requireNonNull(e.getInventory().getResult()).getType() == Material.STONE_HOE) {
                        e.getInventory().setResult(stone_hoe);
                    } else if (Objects.requireNonNull(e.getInventory().getResult()).getType() == Material.IRON_HOE) {
                        e.getInventory().setResult(iron_hoe);
                    } else if (Objects.requireNonNull(e.getInventory().getResult()).getType() == Material.GOLDEN_HOE) {
                        e.getInventory().setResult(gold_hoe);
                    } else if (Objects.requireNonNull(e.getInventory().getResult()).getType() == Material.DIAMOND_HOE) {
                        e.getInventory().setResult(diamond_hoe);
                    } else if (Objects.requireNonNull(e.getInventory().getResult()).getType() == Material.LEATHER_HELMET) {
                        e.getInventory().setResult(leather_helmet);
                    } else if (Objects.requireNonNull(e.getInventory().getResult()).getType() == Material.IRON_HELMET) {
                        e.getInventory().setResult(iron_helmet);
                    } else if (Objects.requireNonNull(e.getInventory().getResult()).getType() == Material.GOLDEN_HELMET) {
                        e.getInventory().setResult(gold_helmet);
                    } else if (Objects.requireNonNull(e.getInventory().getResult()).getType() == Material.DIAMOND_HELMET) {
                        e.getInventory().setResult(diamond_helmet);
                    } else if (Objects.requireNonNull(e.getInventory().getResult()).getType() == Material.LEATHER_CHESTPLATE) {
                        e.getInventory().setResult(leather_chestplate);
                    } else if (Objects.requireNonNull(e.getInventory().getResult()).getType() == Material.IRON_CHESTPLATE) {
                        e.getInventory().setResult(iron_chestplate);
                    } else if (Objects.requireNonNull(e.getInventory().getResult()).getType() == Material.GOLDEN_CHESTPLATE) {
                        e.getInventory().setResult(gold_chestplate);
                    } else if (Objects.requireNonNull(e.getInventory().getResult()).getType() == Material.DIAMOND_CHESTPLATE) {
                        e.getInventory().setResult(diamond_chestplate);
                    } else if (Objects.requireNonNull(e.getInventory().getResult()).getType() == Material.LEATHER_LEGGINGS) {
                        e.getInventory().setResult(leather_leggings);
                    } else if (Objects.requireNonNull(e.getInventory().getResult()).getType() == Material.IRON_LEGGINGS) {
                        e.getInventory().setResult(iron_leggings);
                    } else if (Objects.requireNonNull(e.getInventory().getResult()).getType() == Material.GOLDEN_LEGGINGS) {
                        e.getInventory().setResult(gold_leggings);
                    } else if (Objects.requireNonNull(e.getInventory().getResult()).getType() == Material.DIAMOND_LEGGINGS) {
                        e.getInventory().setResult(diamond_leggings);
                    } else if (Objects.requireNonNull(e.getInventory().getResult()).getType() == Material.LEATHER_BOOTS) {
                        e.getInventory().setResult(leather_boots);
                    } else if (Objects.requireNonNull(e.getInventory().getResult()).getType() == Material.IRON_BOOTS) {
                        e.getInventory().setResult(iron_boots);
                    } else if (Objects.requireNonNull(e.getInventory().getResult()).getType() == Material.GOLDEN_BOOTS) {
                        e.getInventory().setResult(gold_boots);
                    } else if (Objects.requireNonNull(e.getInventory().getResult()).getType() == Material.DIAMOND_BOOTS) {
                        e.getInventory().setResult(diamond_boots);
                    } else if (Objects.requireNonNull(e.getInventory().getResult()).getType() == Material.BOW) {
                        e.getInventory().setResult(bow);
                    } else if (Objects.requireNonNull(e.getInventory().getResult()).getType() == Material.CROSSBOW) {
                        e.getInventory().setResult(crossbow);
                    } else if (Objects.requireNonNull(e.getInventory().getResult()).getType() == Material.SHEARS) {
                        e.getInventory().setResult(shears);
                    } else if (Objects.requireNonNull(e.getInventory().getResult()).getType() == Material.FLINT_AND_STEEL) {
                        e.getInventory().setResult(flint_and_steel);
                    } else if (Objects.requireNonNull(e.getInventory().getResult()).getType() == Material.FISHING_ROD) {
                        e.getInventory().setResult(fishing_rod);
                    }else if (Objects.requireNonNull(e.getInventory().getResult()).getType() == Material.SHIELD) {
                        e.getInventory().setResult(shield);
                    }
                }
            }
        }
    }
}
