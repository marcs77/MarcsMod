package com.marcs.marcsmod.item;

import com.marcs.marcsmod.MarcsMod;
import com.marcs.marcsmod.reference.Info;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Marcs Mod por marcs77
 */
public class ItemMarcs extends Item {

    public ItemMarcs(String un) {
        super();
        this.setUnlocalizedName(un);
        ModItems.register(this, un);
        //añadir a la pestaña de creativo
        this.setCreativeTab(MarcsMod.MARCS_TAB);

    }

    public String getUnwrappedUnlocalizedName() {
        String un = super.getUnlocalizedName();
        return un.substring(un.indexOf('.') + 1);
    }

    @Override
    public String getUnlocalizedName() {
        return String.format("item.%s%s", Info.RESOURCEPREFIX, getUnwrappedUnlocalizedName());
    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return this.getUnlocalizedName();
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IIconRegister register) {
        this.itemIcon = register.registerIcon(Info.RESOURCEPREFIX + getUnwrappedUnlocalizedName());
    }
}
