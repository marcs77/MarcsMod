package com.marcs.marcsmod.block;

import com.marcs.marcsmod.MarcsMod;
import com.marcs.marcsmod.reference.Info;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemBlock;

/**
 * Marcs Mod por marcs77
 */
public class BlockMarcs extends Block {

    public BlockMarcs(String un) {
        this(Material.rock, un);
    }

    public BlockMarcs(Material mat, String un) {
        super(mat);
        this.setBlockName(un);
        ModBlocks.register(this, un);
        this.setCreativeTab(MarcsMod.MARCS_TAB);
    }

    public BlockMarcs(Material mat, String un, Class<? extends ItemBlock> c) {
        super(mat);
        this.setBlockName(un);
        ModBlocks.register(this, un, c);
        this.setCreativeTab(MarcsMod.MARCS_TAB);
    }

    public String getUnwrappedUnlocalizedName() {
        String un = super.getUnlocalizedName();
        return un.substring(un.indexOf('.') + 1);
    }

    @Override
    public String getUnlocalizedName() {
        return String.format("tile.%s%s", Info.RESOURCEPREFIX, getUnwrappedUnlocalizedName());
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void registerBlockIcons(IIconRegister register) {
        this.blockIcon = register.registerIcon(Info.RESOURCEPREFIX + getUnwrappedUnlocalizedName());
    }
}
