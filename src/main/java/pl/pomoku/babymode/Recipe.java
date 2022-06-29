package pl.pomoku.babymode;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.inventory.meta.ItemMeta;

public class Recipe {
    public static ItemStack obs;

    public static void createPortal(){
        ItemStack is = new ItemStack(Material.OBSIDIAN);
        ItemMeta im = is.getItemMeta();
        im.setDisplayName("§bPortal");
        im.addEnchant(Enchantment.LUCK, 1, true);
        im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        is.setItemMeta(im);
        obs = is;

        ShapelessRecipe sir = new ShapelessRecipe(NamespacedKey.minecraft("portal_"), is);
        sir.addIngredient(1, Material.OBSIDIAN);
        Bukkit.getServer().addRecipe(sir);
    }
}
