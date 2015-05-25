package com.marcs.marcsmod.proxy;

import com.marcs.marcsmod.client.settings.KeyBindings;
import cpw.mods.fml.client.registry.ClientRegistry;

/**
 * Marcs Mod por marcs77
 */
public class ClientProxy extends CommonProxy {

    @Override
    public void preInit() {
        //Key binds
        ClientRegistry.registerKeyBinding(KeyBindings.charge);
        ClientRegistry.registerKeyBinding(KeyBindings.release);
    }

    @Override
    public void init() {

    }

    @Override
    public void postInit() {

    }
}
