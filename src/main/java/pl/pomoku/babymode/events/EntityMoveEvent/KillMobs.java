package pl.pomoku.babymode.events.EntityMoveEvent;

import io.papermc.paper.event.entity.EntityMoveEvent;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import pl.pomoku.babymode.Main;

public class KillMobs implements Listener {
    Main plugin;
    public KillMobs(Main m){
        plugin = m;
    }
    @EventHandler
    public void KillMobss(EntityMoveEvent e){
        if(plugin.getConfig().getBoolean("babymode")) {
            if(plugin.getConfig().getBoolean("kill_mobs.mode")) {
                switch (e.getEntity().getType()) {
                    case ZOMBIE:
                        if (plugin.getConfig().getBoolean("kill_mobs.zombie")) {
                            e.getEntity().setHealth(0);
                        }
                        break;
                    case CREEPER:
                        if (plugin.getConfig().getBoolean("kill_mobs.creeper")) {
                            e.getEntity().setHealth(0);
                        }
                        break;
                    case SKELETON:
                        if (plugin.getConfig().getBoolean("kill_mobs.skeleton")) {
                            e.getEntity().setHealth(0);
                        }
                        break;
                    case SLIME:
                        if (plugin.getConfig().getBoolean("kill_mobs.slime")) {
                            e.getEntity().setHealth(0);
                        }
                        break;
                    case SPIDER:
                        if (plugin.getConfig().getBoolean("kill_mobs.spider")) {
                            e.getEntity().setHealth(0);
                        }
                        break;
                    case DROWNED:
                        e.getEntity().setHealth(0);
                        break;
                    case PHANTOM:
                        e.getEntity().setHealth(0);
                        break;
                    case ENDERMAN:
                        e.getEntity().setHealth(0);
                        break;
                    case WITCH:
                        e.getEntity().setHealth(0);
                        break;
                    case CAVE_SPIDER:
                        e.getEntity().setHealth(0);
                        break;
                    case ZOMBIE_VILLAGER:
                        e.getEntity().setHealth(0);
                        break;
                }
            }
        }
    }
}
