package pl.pomoku.babymode;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.*;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitScheduler;
import pl.pomoku.babymode.cmds.BabyModeOnOffCommand;
import pl.pomoku.babymode.cmds.tab_compliter.BabyModeCommandCompleter;
import pl.pomoku.babymode.events.BlockPlaceEvent.AutoCreatePortal;
import pl.pomoku.babymode.events.EntityDamageByEntityEvent.AutoBurningAnimals;
import pl.pomoku.babymode.events.EntityDamageEvent.AllDamage;
import pl.pomoku.babymode.events.EntityDamageEvent.BlockItemsBurning;
import pl.pomoku.babymode.events.EntityDamageEvent.ExtinguishingThePlayer;
import pl.pomoku.babymode.events.EntityDeathEvent.IncreasingDropItemsFromMobs;
import pl.pomoku.babymode.events.EntityDeathEvent.RespawnAnimals;
import pl.pomoku.babymode.events.EntityExplodeEvent.BlockExlodeOfCreeper;
import pl.pomoku.babymode.events.EntityTeleportEvent.BlockEndermans;
import pl.pomoku.babymode.events.PlayerChangedWorldEvent.JoinOnNether;
import pl.pomoku.babymode.events.PlayerMoveEvent.CreatingObsidianInsteadOfLava;
import pl.pomoku.babymode.events.PrepareItemCraftEvent.CraftEvent;
import pl.pomoku.babymode.events.PrepareSmithingEvent.AutoEnchantUpgradeItems;

public final class Main extends JavaPlugin {

    public static Main main;
    @Override
    public void onEnable() {
        main = this;

        //Recipes
        Recipe.createPortal();

        //Commands and CommandsCompliters
        new BabyModeOnOffCommand(this);
        new BabyModeCommandCompleter(this);

        //Config
        getConfig().options().copyDefaults(true);
        saveConfig();

        //LoadVoids
        KillMobss();
        RegisterEvents();
        AddBoat();
    }

    private void RegisterEvents() {
        getServer().getPluginManager().registerEvents(new RespawnAnimals(this), this);
        getServer().getPluginManager().registerEvents(new CreatingObsidianInsteadOfLava(this), this);
        getServer().getPluginManager().registerEvents(new ExtinguishingThePlayer(this), this);
        getServer().getPluginManager().registerEvents(new AutoBurningAnimals(this), this);
        getServer().getPluginManager().registerEvents(new AutoCreatePortal(this), this);
        getServer().getPluginManager().registerEvents(new BlockExlodeOfCreeper(this), this);
        getServer().getPluginManager().registerEvents(new BlockEndermans(this), this);
        getServer().getPluginManager().registerEvents(new IncreasingDropItemsFromMobs(this), this);
        getServer().getPluginManager().registerEvents(new JoinOnNether(this), this);
        getServer().getPluginManager().registerEvents(new CraftEvent(this), this);
        getServer().getPluginManager().registerEvents(new BlockItemsBurning(this), this);
        getServer().getPluginManager().registerEvents(new AutoEnchantUpgradeItems(this), this);
        getServer().getPluginManager().registerEvents(new AllDamage(this), this);
    }

    private void KillMobss() {
        BukkitScheduler scheduler = getServer().getScheduler();
        scheduler.scheduleSyncRepeatingTask(this, () ->
                Bukkit.getOnlinePlayers().forEach(p ->
                        p.getNearbyEntities(30.0D, 30.0D, 30.0D).forEach((e) -> {
            if(getConfig().getBoolean("babymode")) {
                if (getConfig().getBoolean("kill_mobs.mode")) {
                    KillMobsSystem(e);
                }
            }
        })), 0L, 1L);
    }
    private void AddBoat() {
        BukkitScheduler scheduler = getServer().getScheduler();
        scheduler.scheduleSyncRepeatingTask(this, () -> Bukkit.getOnlinePlayers().forEach(p -> {
            Location l = p.getLocation();
            if(l.getBlock().isLiquid()){
                if(!HaveBoat(p)){
                    p.getInventory().addItem(new ItemStack(Material.OAK_BOAT));
                }
            }
        }), 0L, 1L);
    }

    private boolean HaveBoat(Player p) {
        boolean have_boat = false;
        p.getInventory().getContents();
        for (ItemStack is : p.getInventory().getStorageContents()) {
            if(is != null) {
                if (is.getType() == Material.ACACIA_BOAT
                        || is.getType() == Material.OAK_BOAT
                        || is.getType() == Material.BIRCH_BOAT
                        || is.getType() == Material.DARK_OAK_BOAT
                        || is.getType() == Material.JUNGLE_BOAT
                        || is.getType() == Material.SPRUCE_BOAT) {
                    have_boat = true;
                }
            }
        }
        return have_boat;
    }

    private void KillMobsSystem(Entity e) {
        switch (e.getType()) {
            case ZOMBIE:
                if (getConfig().getBoolean("kill_mobs.zombie")) {
                    assert e instanceof Zombie;
                    ((Zombie) e).setHealth(0);
                }
                break;
            case CREEPER:
                if (getConfig().getBoolean("kill_mobs.creeper")) {
                    assert e instanceof Creeper;
                    ((Creeper) e).setHealth(0);
                }
                break;
            case SKELETON:
                if (getConfig().getBoolean("kill_mobs.skeleton")) {
                    assert e instanceof Skeleton;
                    ((Skeleton) e).setHealth(0);
                }
                break;
            case SLIME:
                if (getConfig().getBoolean("kill_mobs.slime")) {
                    assert e instanceof Slime;
                    ((Slime) e).setHealth(0);
                }
                break;
            case SPIDER:
                if (getConfig().getBoolean("kill_mobs.spider")) {
                    assert e instanceof Spider;
                    ((Spider) e).setHealth(0);
                }
                break;
            case DROWNED:
                if (getConfig().getBoolean("kill_mobs.drowned")) {
                    assert e instanceof Drowned;
                    ((Drowned) e).setHealth(0);
                }
                break;
            case STRAY:
                if (getConfig().getBoolean("kill_mobs.stray")) {
                    assert e instanceof Stray;
                    ((Stray) e).setHealth(0);
                }
                break;
            case HUSK:
                if (getConfig().getBoolean("kill_mobs.husk")) {
                    assert e instanceof Husk;
                    ((Husk) e).setHealth(0);
                }
                break;
            case PHANTOM:
                if (getConfig().getBoolean("kill_mobs.phantom")) {
                    assert e instanceof Phantom;
                    ((Phantom) e).setHealth(0);
                }
                break;
            case ENDERMAN:
                if (getConfig().getBoolean("kill_mobs.enderman")) {
                    assert e instanceof Enderman;
                    ((Enderman) e).setHealth(0);
                }
                break;
            case WITCH:
                if (getConfig().getBoolean("kill_mobs.witch")) {
                    assert e instanceof Witch;
                    ((Witch) e).setHealth(0);
                }
                break;
            case CAVE_SPIDER:
                if (getConfig().getBoolean("kill_mobs.cave_spider")) {
                    assert e instanceof CaveSpider;
                    ((CaveSpider) e).setHealth(0);
                }
                break;
            case ZOMBIE_VILLAGER:
                if (getConfig().getBoolean("kill_mobs.zombie_villager")) {
                    assert e instanceof ZombieVillager;
                    ((ZombieVillager) e).setHealth(0);
                }
                break;
            case ELDER_GUARDIAN:
                if (getConfig().getBoolean("kill_mobs.elder_guardian")) {
                    assert e instanceof ElderGuardian;
                    ((ElderGuardian) e).setHealth(0);
                }
                break;
            case GUARDIAN:
                if (getConfig().getBoolean("kill_mobs.guardian")) {
                    assert e instanceof Guardian;
                    ((Guardian) e).setHealth(0);
                }
                break;
            case ENDERMITE:
                if (getConfig().getBoolean("kill_mobs.endermite")) {
                    assert e instanceof Endermite;
                    ((Endermite) e).setHealth(0);
                }
                break;
            case ZOGLIN:
                if (getConfig().getBoolean("kill_mobs.zoglin")) {
                    assert e instanceof Zoglin;
                    ((Zoglin) e).setHealth(0);
                }
                break;
            case PIGLIN_BRUTE:
                if (getConfig().getBoolean("kill_mobs.piglin_brute")) {
                    assert e instanceof PiglinBrute;
                    ((PiglinBrute) e).setHealth(0);
                }
                break;
            case VEX:
                if (getConfig().getBoolean("kill_mobs.vex")) {
                    assert e instanceof Vex;
                    ((Vex) e).setHealth(0);
                }
                break;
            case RAVAGER:
                if (getConfig().getBoolean("kill_mobs.ravager")) {
                    assert e instanceof Ravager;
                    ((Ravager) e).setHealth(0);
                }
                break;
            case PILLAGER:
                if (getConfig().getBoolean("kill_mobs.pillager")) {
                    assert e instanceof Pillager;
                    ((Pillager) e).setHealth(0);
                }
                break;
            case EVOKER:
                if (getConfig().getBoolean("kill_mobs.evoker")) {
                    assert e instanceof Evoker;
                    ((Evoker) e).setHealth(0);
                }
                break;
            case VINDICATOR:
                if (getConfig().getBoolean("kill_mobs.vindicator")) {
                    assert e instanceof Vindicator;
                    ((Vindicator) e).setHealth(0);
                }
                break;
            case WITHER_SKELETON:
                if (getConfig().getBoolean("kill_mobs.wither_skeleton")) {
                    assert e instanceof WitherSkeleton;
                    ((WitherSkeleton) e).setHealth(0);
                }
                break;
            case SILVERFISH:
                if (getConfig().getBoolean("kill_mobs.silverfish")) {
                    assert e instanceof Silverfish;
                    ((Silverfish) e).setHealth(0);
                }
                break;
            case MAGMA_CUBE:
                if (getConfig().getBoolean("kill_mobs.magma_cube")) {
                    assert e instanceof MagmaCube;
                    ((MagmaCube) e).setHealth(0);
                }
                break;
            case GHAST:
                if (getConfig().getBoolean("kill_mobs.ghast")) {
                    assert e instanceof Ghast;
                    ((Ghast) e).setHealth(0);
                }
                break;
            case BLAZE:
                if (getConfig().getBoolean("kill_mobs.blaze")) {
                    assert e instanceof Blaze;
                    ((Blaze) e).setHealth(0);
                }
                break;
            case PIGLIN:
                if (getConfig().getBoolean("kill_mobs.piglin")) {
                    assert e instanceof Piglin;
                    ((Piglin) e).setHealth(0);
                }
                break;
            case HOGLIN:
                if (getConfig().getBoolean("kill_mobs.hoglin")) {
                    assert e instanceof Hoglin;
                    ((Hoglin) e).setHealth(0);
                }
                break;
            case ZOMBIFIED_PIGLIN:
                if (getConfig().getBoolean("kill_mobs.zombified_piglin")) {
                    assert e instanceof PigZombie;
                    ((PigZombie) e).setHealth(0);
                }
                break;
            case SHULKER:
                if (getConfig().getBoolean("kill_mobs.shulker")) {
                    assert e instanceof Shulker;
                    ((Shulker) e).setHealth(0);
                }
                break;
        }
    }
}
