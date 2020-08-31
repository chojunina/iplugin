package com.jh.test;

import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {

    public Main instance;

    @Override
    public void onEnable() {
        instance = this;
        instance.getLogger().info("이나의 플러그인이 시작 됩니다");
        getServer().getPluginManager().registerEvents(this, this);
    }

    @Override
    public void onDisable() {
        instance = this;
        instance.getLogger().info("이나의 플러그인이 멈춤니다");
    }

    public void PlayerJoin(PlayerJoinEvent event){
        event.getPlayer().sendMessage("서버에 오신걸 환영합니다");
    }

}
