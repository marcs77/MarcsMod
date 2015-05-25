package com.marcs.marcsmod.handler;

import com.marcs.marcsmod.item.ModItems;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

/**
 * Marcs Mod por marcs77
 */
public class RecipesHandler {

    public static void registerRecipes() {

        //Crafting
        GameRegistry.addRecipe(new ItemStack(ModItems.generico, 10), " n ", "ndn", " n ", 'n', Items.nether_star, 'd', Items.diamond);
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.dragon_egg), new ItemStack(ModItems.generico));


        //Smelting
        GameRegistry.addSmelting(Blocks.anvil, new ItemStack(Blocks.beacon), 2f);


    }

}
