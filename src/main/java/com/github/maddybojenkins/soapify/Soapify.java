package com.github.maddybojenkins.soapify;

import org.bukkit.plugin.java.JavaPlugin;

public class Soapify extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("enabled");
    }

    @Override
    public void onDisable() {
        getLogger().info("disabled!");
    }

    public static void main(String[] args) {



    }
}
