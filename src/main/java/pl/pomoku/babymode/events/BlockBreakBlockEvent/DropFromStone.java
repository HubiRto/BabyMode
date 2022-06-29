package pl.pomoku.babymode.events.BlockBreakBlockEvent;

import io.papermc.paper.event.block.BlockBreakBlockEvent;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;
import pl.pomoku.babymode.Main;

public class DropFromStone implements Listener {
    Main plugin;

    public DropFromStone(Main m){
        plugin = m;
    }

    @EventHandler
    public void BlockBreak(BlockBreakEvent e) {
        if (plugin.getConfig().getBoolean("babymode")) {
            if (plugin.getConfig().getBoolean("stone_drop")) {

                ItemStack diamond = new ItemStack(Material.DIAMOND);
                ItemStack obsidian = new ItemStack(Material.OBSIDIAN);
                ItemStack redstone = new ItemStack(Material.REDSTONE);
                ItemStack lapis = new ItemStack(Material.LAPIS_LAZULI);
                ItemStack iron = new ItemStack(Material.IRON_INGOT);
                ItemStack coal = new ItemStack(Material.COAL);
                ItemStack gold = new ItemStack(Material.GOLD_INGOT);
                ItemStack emerald = new ItemStack(Material.EMERALD);

                if (e.getBlock().getType() == Material.STONE) {
                    Player p = e.getPlayer();
                    int rand = (int) ((Math.random() * (9 - 1)) + 1);
                    switch (rand) {
                        case 1:
                            p.getInventory().addItem(diamond);
                            break;
                        case 2:
                            p.getInventory().addItem(obsidian);
                            break;
                        case 3:
                            p.getInventory().addItem(redstone);
                            break;
                        case 4:
                            p.getInventory().addItem(lapis);
                            break;
                        case 5:
                            p.getInventory().addItem(iron);
                            break;
                        case 6:
                            p.getInventory().addItem(coal);
                            break;
                        case 7:
                            p.getInventory().addItem(gold);
                            break;
                        case 8:
                            p.getInventory().addItem(emerald);
                            break;
                    }
                }
            }
        }
    }
}
