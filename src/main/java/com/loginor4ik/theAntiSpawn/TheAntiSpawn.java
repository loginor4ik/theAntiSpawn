package com.loginor4ik.theAntiSpawn;

import com.loginor4ik.theAntiSpawn.events.onEntitySpawn;
import org.bukkit.plugin.java.JavaPlugin;

public final class TheAntiSpawn extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new onEntitySpawn(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
