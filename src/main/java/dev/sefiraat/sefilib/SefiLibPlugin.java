package dev.sefiraat.sefilib;

import org.bukkit.plugin.java.JavaPlugin;

public class SefiLibPlugin extends JavaPlugin {

    private static SefiLibPlugin instance;

    @Override
    public void onEnable() {
        instance = this;
        getLogger().info("SefiLib enabled (EnigmaticMP fork).");
    }

    @Override
    public void onDisable() {
        getLogger().info("SefiLib disabled.");
    }

    public static SefiLibPlugin getInstance() {
        return instance;
    }
}
