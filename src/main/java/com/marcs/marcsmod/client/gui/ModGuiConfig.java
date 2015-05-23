package com.marcs.marcsmod.client.gui;

import com.marcs.marcsmod.handler.ConfigHandler;
import com.marcs.marcsmod.reference.Info;
import cpw.mods.fml.client.config.GuiConfig;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

/**
 * Marcs Mod por marcs77
 */
public class ModGuiConfig extends GuiConfig {

    public ModGuiConfig(GuiScreen guiScreen) {
        super(guiScreen, new ConfigElement(ConfigHandler.config.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
                Info.NOMBRE_INTERNO, false, false, GuiConfig.getAbridgedConfigPath(ConfigHandler.config.toString()));
    }
}
