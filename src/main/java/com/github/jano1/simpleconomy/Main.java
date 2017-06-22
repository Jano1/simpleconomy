package com.github.jano1.simpleconomy;

import org.slf4j.Logger;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.game.state.GameStartedServerEvent;
import org.spongepowered.api.plugin.Plugin;

import javax.inject.Inject;

@Plugin(id = "simpleconomy", name = "SimplEconomy", version = "0.00.01")
public class Main {

    @Inject
    private Logger logger;


    @Listener
    public void onServerStart(GameStartedServerEvent event) {
        performBasicCheck();
    }

    private void performBasicCheck() {
        logger.info("perform basic check...");

        logger.info("basic check finished!");
    }
}
