package com.marcs.marcsmod.client.handler;

import com.marcs.marcsmod.client.settings.KeyBindings;
import com.marcs.marcsmod.reference.Key;
import com.marcs.marcsmod.util.Logger;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;

/**
 * Marcs Mod por marcs77
 */
public class KeyEventHandler {


    private static Key getPressedKeybinding() {

        if (KeyBindings.charge.isPressed()) {
            return Key.CHARGE;
        } else if (KeyBindings.release.isPressed()) {
            return Key.RELEASE;
        }

        return Key.UNKNOWN;

    }

    @SubscribeEvent
    public void handleKeyInputEvent(InputEvent.KeyInputEvent event) {

        Key key = getPressedKeybinding();

        switch (key) {

            case CHARGE: {
                Logger.info("Cargar");
                break;
            }

            case RELEASE: {
                Logger.info("Descargar");
                break;
            }

            case UNKNOWN: {
                break;
            }

        }

    }

}
