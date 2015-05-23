package com.marcs.marcsmod.block;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;

/**
 * Marcs Mod por marcs77
 */
public class ModBlocks {

    public static Block bloqueGenerico;

    public static void init() {
        bloqueGenerico = new BlockMarcs("bloqueGenerico");
    }

    public static void register(Block b, String un) {
        GameRegistry.registerBlock(b, un);
    }

    public static void register(Block b, String un, Class<? extends ItemBlock> c) {
        GameRegistry.registerBlock(b, c, un);
    }
}
