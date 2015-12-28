package com.streamcraft.rmqsc;


import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

public class rmqsc extends JavaPlugin {
    public void onEnable() {
        getLogger().log(Level.INFO, "Loaded");
    }
}
