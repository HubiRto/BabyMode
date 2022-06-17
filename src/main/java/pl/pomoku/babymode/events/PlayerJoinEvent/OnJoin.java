package pl.pomoku.babymode.events.PlayerJoinEvent;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import pl.pomoku.babymode.Main;


public class OnJoin implements Listener {
    Main plugin;
    public OnJoin(Main m){
        plugin = m;
    }
    @EventHandler
    public void OnJoin(PlayerJoinEvent e){
        plugin.getConfig().set("babymode", false);
        plugin.getConfig().set("extinguishing", false);
        plugin.getConfig().set("alldamage", false);
        plugin.getConfig().set("crate_portal", false);
        plugin.getConfig().set("auto_enchant", false);
        plugin.getConfig().set("block_explode", false);
        plugin.getConfig().set("block_item_burn", false);
        plugin.getConfig().set("make_obs", false);

        plugin.getConfig().set("kill_mobs.mode", false);
        plugin.getConfig().set("kill_mobs.zombie", false);
        plugin.getConfig().set("kill_mobs.skeleton", false);
        plugin.getConfig().set("kill_mobs.slime", false);
        plugin.getConfig().set("kill_mobs.spider", false);
        plugin.getConfig().set("kill_mobs.cave_spider", false);
        plugin.getConfig().set("kill_mobs.creeper", false);
        plugin.getConfig().set("kill_mobs.zombie_villager", false);
        plugin.getConfig().set("kill_mobs.witch", false);
        plugin.getConfig().set("kill_mobs.drowned", false);
        plugin.getConfig().set("kill_mobs.stray", false);
        plugin.getConfig().set("kill_mobs.husk", false);
        plugin.getConfig().set("kill_mobs.elder_guardian", false);
        plugin.getConfig().set("kill_mobs.guardian", false);
        plugin.getConfig().set("kill_mobs.endermite", false);
        plugin.getConfig().set("kill_mobs.enderman", false);
        plugin.getConfig().set("kill_mobs.zoglin", false);
        plugin.getConfig().set("kill_mobs.piglin_brute", false);
        plugin.getConfig().set("kill_mobs.vex", false);
        plugin.getConfig().set("kill_mobs.ravager", false);
        plugin.getConfig().set("kill_mobs.pillager", false);
        plugin.getConfig().set("kill_mobs.evoker", false);
        plugin.getConfig().set("kill_mobs.vindicator", false);
        plugin.getConfig().set("kill_mobs.wither_skeleton", false);
        plugin.getConfig().set("kill_mobs.silverfish", false);
        plugin.getConfig().set("kill_mobs.magma_cube", false);
        plugin.getConfig().set("kill_mobs.ghast", false);
        plugin.getConfig().set("kill_mobs.blaze", false);
        plugin.getConfig().set("kill_mobs.phantom", false);

        plugin.saveConfig();
    }
}
