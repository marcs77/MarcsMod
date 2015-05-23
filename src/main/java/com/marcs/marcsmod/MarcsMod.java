package com.marcs.marcsmod;

import com.marcs.marcsmod.creativetab.CreativeTabMarcs;
import com.marcs.marcsmod.handler.ConfigHandler;
import com.marcs.marcsmod.item.ModItems;
import com.marcs.marcsmod.proxy.CommonProxy;
import com.marcs.marcsmod.reference.Info;
import com.marcs.marcsmod.util.Logger;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;

/**
 * Marcs Mod por marcs77
 */

@Mod(modid = Info.NOMBRE_INTERNO, name = Info.NOMBRE_EXTERNO, version = Info.VERSION, guiFactory = Info.GUIFACTORY)
public class MarcsMod {

    public static final CreativeTabs MARCS_TAB = new CreativeTabMarcs();
    @Mod.Instance(Info.NOMBRE_INTERNO)
    public static MarcsMod miMod;
    @SidedProxy(clientSide = Info.CLIENTPROXY, serverSide = Info.SERVERPROXY)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent evento) {

        //Iniciar configuraciones, keybinds, items, bloques ...
        proxy.preInit();


        FMLCommonHandler.instance().bus().register(new ConfigHandler());
        ConfigHandler.init(evento);

        ModItems.init();

        Logger.info("Texto: " + ConfigHandler.prueba);

        Logger.info("Pre-Inicio completado");

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent evento) {

        //Iniciar GUIs, TileEntities, crafteos, EventHandlers ...
        proxy.init();

        Logger.info("Inicio completado");


    }


    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent evento) {

        proxy.postInit();

        Logger.info("Post-Inicio completado");

    }


}
