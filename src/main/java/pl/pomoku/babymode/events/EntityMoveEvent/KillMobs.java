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
                        if (plugin.getConfig().getBoolean("kill_mobs.drowned")) {
                            e.getEntity().setHealth(0);
                        }
                        break;
                    case STRAY:
                        if (plugin.getConfig().getBoolean("kill_mobs.stray")) {
                            e.getEntity().setHealth(0);
                        }
                        break;
                    case HUSK:
                        if (plugin.getConfig().getBoolean("kill_mobs.husk")) {
                            e.getEntity().setHealth(0);
                        }
                        break;
                    case PHANTOM:
                        if (plugin.getConfig().getBoolean("kill_mobs.phantom")) {
                            e.getEntity().setHealth(0);
                        }
                        break;
                    case ENDERMAN:
                        if (plugin.getConfig().getBoolean("kill_mobs.enderman")) {
                            e.getEntity().setHealth(0);
                        }
                        break;
                    case WITCH:
                        if (plugin.getConfig().getBoolean("kill_mobs.witch")) {
                            e.getEntity().setHealth(0);
                        }
                        break;
                    case CAVE_SPIDER:
                        if (plugin.getConfig().getBoolean("kill_mobs.cave_spider")) {
                            e.getEntity().setHealth(0);
                        }
                        break;
                    case ZOMBIE_VILLAGER:
                        if (plugin.getConfig().getBoolean("kill_mobs.zombie_villager")) {
                            e.getEntity().setHealth(0);
                        }
                        break;
                    case ELDER_GUARDIAN:
                        if (plugin.getConfig().getBoolean("kill_mobs.elder_guardian")) {
                            e.getEntity().setHealth(0);
                        }
                        break;
                    case GUARDIAN:
                        if (plugin.getConfig().getBoolean("kill_mobs.guardian")) {
                            e.getEntity().setHealth(0);
                        }
                        break;
                    case ENDERMITE:
                        if (plugin.getConfig().getBoolean("kill_mobs.endermite")) {
                            e.getEntity().setHealth(0);
                        }
                        break;
                    case ZOGLIN:
                        if (plugin.getConfig().getBoolean("kill_mobs.zoglin")) {
                            e.getEntity().setHealth(0);
                        }
                        break;
                    case PIGLIN_BRUTE:
                        if (plugin.getConfig().getBoolean("kill_mobs.piglin_brute")) {
                            e.getEntity().setHealth(0);
                        }
                        break;
                    case VEX:
                        if (plugin.getConfig().getBoolean("kill_mobs.vex")) {
                            e.getEntity().setHealth(0);
                        }
                        break;
                    case RAVAGER:
                        if (plugin.getConfig().getBoolean("kill_mobs.ravager")) {
                            e.getEntity().setHealth(0);
                        }
                        break;
                    case PILLAGER:
                        if (plugin.getConfig().getBoolean("kill_mobs.pillager")) {
                            e.getEntity().setHealth(0);
                        }
                        break;
                    case EVOKER:
                        if (plugin.getConfig().getBoolean("kill_mobs.evoker")) {
                            e.getEntity().setHealth(0);
                        }
                        break;
                    case VINDICATOR:
                        if (plugin.getConfig().getBoolean("kill_mobs.vindicator")) {
                            e.getEntity().setHealth(0);
                        }
                        break;
                    case WITHER_SKELETON:
                        if (plugin.getConfig().getBoolean("kill_mobs.wither_skeleton")) {
                            e.getEntity().setHealth(0);
                        }
                        break;
                    case SILVERFISH:
                        if (plugin.getConfig().getBoolean("kill_mobs.silverfish")) {
                            e.getEntity().setHealth(0);
                        }
                        break;
                    case MAGMA_CUBE:
                        if (plugin.getConfig().getBoolean("kill_mobs.magma_cube")) {
                            e.getEntity().setHealth(0);
                        }
                        break;
                    case GHAST:
                        if (plugin.getConfig().getBoolean("kill_mobs.ghast")) {
                            e.getEntity().setHealth(0);
                        }
                        break;
                    case BLAZE:
                        if (plugin.getConfig().getBoolean("kill_mobs.blaze")) {
                            e.getEntity().setHealth(0);
                        }
                        break;
                    case PIGLIN:
                        if (plugin.getConfig().getBoolean("kill_mobs.piglin")) {
                            e.getEntity().setHealth(0);
                        }
                        break;
                    case HOGLIN:
                        if (plugin.getConfig().getBoolean("kill_mobs.hoglin")) {
                            e.getEntity().setHealth(0);
                        }
                        break;
                    case ZOMBIFIED_PIGLIN:
                        if (plugin.getConfig().getBoolean("kill_mobs.zombified_piglin")) {
                            e.getEntity().setHealth(0);
                        }
                        break;
                }
            }
        }
    }
}
