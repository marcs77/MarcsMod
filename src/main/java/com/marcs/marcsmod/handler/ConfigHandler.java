package com.marcs.marcsmod.handler;

import com.marcs.marcsmod.reference.Info;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

/**
 * Marcs Mod por marcs77
 */
public class ConfigHandler {

    public static String prueba = "test";
    public static boolean b = false;
    public static Configuration config;

    public static void init(FMLPreInitializationEvent event) {

        if (config == null) config = new Configuration(event.getSuggestedConfigurationFile());
        load();

    }

    private static void load() {

        prueba = config.getString("prueba", Configuration.CATEGORY_GENERAL, prueba, "");
        b = config.getBoolean("b", Configuration.CATEGORY_GENERAL, b, "");

        if (config.hasChanged()) {
            config.save();
        }
    }

    @SubscribeEvent
    public void onConfigChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event) {

        if (event.modID.equalsIgnoreCase(Info.NOMBRE_INTERNO)) {
            load();
        }
    }

}
