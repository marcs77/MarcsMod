package com.marcs.marcsmod.item;

import com.marcs.marcsmod.reference.Info;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

/**
 * Marcs Mod por marcs77
 */
public class ModItems {

    public static Item generico;

    public static void init() {
        generico = new ItemMarcs("generico");
    }


    public static void register(Item item, String un) {
        GameRegistry.registerItem(item, un, Info.NOMBRE_INTERNO);
    }
}
