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
        if(plugin.getConfig().getBoolean("babymode")) {
            if(plugin.getConfig().getBoolean("auto_enchant")) {

                //SWORD
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
                netherite_sword_meta.addEnchant(Enchantment.SWEEPING_EDGE, 3, true);
                netherite_sword.setItemMeta(netherite_sword_meta);

                //AXE
                ItemStack netherite_axe = new ItemStack(Material.NETHERITE_AXE);
                ItemMeta netherite_axe_meta = netherite_axe.getItemMeta();
                netherite_axe_meta.addEnchant(Enchantment.DAMAGE_ALL, 5, true);
                netherite_axe_meta.addEnchant(Enchantment.DURABILITY, 3, true);
                netherite_axe_meta.addEnchant(Enchantment.MENDING, 1, true);
                netherite_axe_meta.addEnchant(Enchantment.DIG_SPEED, 5, true);
                netherite_axe_meta.addEnchant(Enchantment.SILK_TOUCH, 1, true);
                netherite_axe.setItemMeta(netherite_axe_meta);

                //PICKAXE
                ItemStack netherite_pickaxe = new ItemStack(Material.NETHERITE_PICKAXE);
                ItemMeta netherite_pickaxe_meta = netherite_pickaxe.getItemMeta();
                netherite_pickaxe_meta.addEnchant(Enchantment.DURABILITY, 3, true);
                netherite_pickaxe_meta.addEnchant(Enchantment.MENDING, 1, true);
                netherite_pickaxe_meta.addEnchant(Enchantment.DIG_SPEED, 5, true);
                netherite_pickaxe_meta.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 5, true);
                netherite_pickaxe.setItemMeta(netherite_pickaxe_meta);

                //SHOVEL
                ItemStack netherite_shovel = new ItemStack(Material.NETHERITE_SHOVEL);
                ItemMeta netherite_shovel_meta = netherite_shovel.getItemMeta();
                netherite_shovel_meta.addEnchant(Enchantment.DURABILITY, 3, true);
                netherite_shovel_meta.addEnchant(Enchantment.MENDING, 1, true);
                netherite_shovel_meta.addEnchant(Enchantment.DIG_SPEED, 5, true);
                netherite_shovel_meta.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 3, true);
                netherite_shovel.setItemMeta(netherite_shovel_meta);

                //HOE
                ItemStack netherite_hoe = new ItemStack(Material.NETHERITE_HOE);
                ItemMeta netherite_hoe_meta = netherite_hoe.getItemMeta();
                netherite_hoe_meta.addEnchant(Enchantment.DURABILITY, 3, true);
                netherite_hoe_meta.addEnchant(Enchantment.MENDING, 1, true);
                netherite_hoe_meta.addEnchant(Enchantment.DIG_SPEED, 5, true);
                netherite_hoe.setItemMeta(netherite_hoe_meta);

                //HELMET
                ItemStack netherite_helmet = new ItemStack(Material.NETHERITE_HELMET);
                ItemMeta netherite_helmet_meta = netherite_helmet.getItemMeta();
                netherite_helmet_meta.addEnchant(Enchantment.DURABILITY, 3, true);
                netherite_helmet_meta.addEnchant(Enchantment.MENDING, 1, true);
                netherite_helmet_meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
                netherite_helmet_meta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 4, true);
                netherite_helmet_meta.addEnchant(Enchantment.PROTECTION_FIRE, 4, true);
                netherite_helmet_meta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 4, true);
                netherite_helmet_meta.addEnchant(Enchantment.OXYGEN, 3, true);
                netherite_helmet_meta.addEnchant(Enchantment.WATER_WORKER, 1, true);
                netherite_helmet.setItemMeta(netherite_helmet_meta);

                //CHESTPLATE
                ItemStack netherite_chestplate = new ItemStack(Material.NETHERITE_CHESTPLATE);
                ItemMeta netherite_chestplate_meta = netherite_chestplate.getItemMeta();
                netherite_chestplate_meta.addEnchant(Enchantment.DURABILITY, 3, true);
                netherite_chestplate_meta.addEnchant(Enchantment.MENDING, 1, true);
                netherite_chestplate_meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
                netherite_chestplate_meta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 4, true);
                netherite_chestplate_meta.addEnchant(Enchantment.PROTECTION_FIRE, 4, true);
                netherite_chestplate_meta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 4, true);
                netherite_chestplate.setItemMeta(netherite_chestplate_meta);

                //LEGGINGS
                ItemStack netherite_leggings = new ItemStack(Material.NETHERITE_LEGGINGS);
                ItemMeta netherite_leggings_meta = netherite_leggings.getItemMeta();
                netherite_leggings_meta.addEnchant(Enchantment.DURABILITY, 3, true);
                netherite_leggings_meta.addEnchant(Enchantment.MENDING, 1, true);
                netherite_leggings_meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
                netherite_leggings_meta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 4, true);
                netherite_leggings_meta.addEnchant(Enchantment.PROTECTION_FIRE, 4, true);
                netherite_leggings_meta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 4, true);
                netherite_leggings.setItemMeta(netherite_leggings_meta);

                //BOOTS
                ItemStack netherite_boots = new ItemStack(Material.NETHERITE_BOOTS);
                ItemMeta netherite_boots_meta = netherite_boots.getItemMeta();
                netherite_boots_meta.addEnchant(Enchantment.DURABILITY, 3, true);
                netherite_boots_meta.addEnchant(Enchantment.MENDING, 1, true);
                netherite_boots_meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
                netherite_boots_meta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 4, true);
                netherite_boots_meta.addEnchant(Enchantment.PROTECTION_FIRE, 4, true);
                netherite_boots_meta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 4, true);
                netherite_boots_meta.addEnchant(Enchantment.PROTECTION_FALL, 4, true);
                netherite_boots_meta.addEnchant(Enchantment.DEPTH_STRIDER, 3, true);
                netherite_boots_meta.addEnchant(Enchantment.SOUL_SPEED, 3, true);
                netherite_boots.setItemMeta(netherite_boots_meta);


                if (e.getResult() != null) {
                    if (e.getResult().getType() == Material.NETHERITE_SWORD) {
                        e.setResult(netherite_sword);
                    } else if (e.getResult().getType() == Material.NETHERITE_AXE) {
                        e.setResult(netherite_axe);
                    } else if (e.getResult().getType() == Material.NETHERITE_PICKAXE) {
                        e.setResult(netherite_pickaxe);
                    } else if (e.getResult().getType() == Material.NETHERITE_SHOVEL) {
                        e.setResult(netherite_shovel);
                    } else if (e.getResult().getType() == Material.NETHERITE_HOE) {
                        e.setResult(netherite_hoe);
                    } else if (e.getResult().getType() == Material.NETHERITE_HELMET) {
                        e.setResult(netherite_helmet);
                    } else if (e.getResult().getType() == Material.NETHERITE_CHESTPLATE) {
                        e.setResult(netherite_chestplate);
                    } else if (e.getResult().getType() == Material.NETHERITE_LEGGINGS) {
                        e.setResult(netherite_leggings);
                    } else if (e.getResult().getType() == Material.NETHERITE_BOOTS) {
                        e.setResult(netherite_boots);
                    }
                }
            }
        }
    }
}
