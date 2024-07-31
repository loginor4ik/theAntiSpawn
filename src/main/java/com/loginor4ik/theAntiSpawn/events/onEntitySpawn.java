package com.loginor4ik.theAntiSpawn.events;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntitySpawnEvent;

public class onEntitySpawn implements Listener {

    @EventHandler
    public void onEntitySpawn(EntitySpawnEvent e) {
        if(e.getEntity().getType() == EntityType.ZOMBIE_VILLAGER) {
            e.setCancelled(true);
        }
    }
}
