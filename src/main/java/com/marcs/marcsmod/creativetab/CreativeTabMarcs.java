package com.marcs.marcsmod.creativetab;

import com.marcs.marcsmod.item.ModItems;
import com.marcs.marcsmod.reference.Info;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Marcs Mod por marcs77
 */
public class CreativeTabMarcs extends CreativeTabs {

    public CreativeTabMarcs() {
        super(Info.NOMBRE_INTERNO);
    }

    @Override
    public Item getTabIconItem() {
        return ModItems.generico;
    }

    @Override
    public String getTranslatedTabLabel() {
        return Info.NOMBRE_EXTERNO;
    }
}
