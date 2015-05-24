package com.marcs.marcsmod.util;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

/**
 * Marcs Mod por marcs77
 */
public class NBTHelper {

    public static boolean hasTag(ItemStack stack, String tag) {
        return stack != null && stack.hasTagCompound() && stack.getTagCompound().hasKey(tag);
    }

    private static void initNBTTagCompound(ItemStack stack) {

        if (stack != null && !stack.hasTagCompound()) {
            stack.setTagCompound(new NBTTagCompound());
        }

    }

    public static void removeTag(ItemStack stack, String tag) {

        if (stack.hasTagCompound()) {
            stack.stackTagCompound.removeTag(tag);
        }
    }


    public static void setInt(ItemStack stack, String tag, int val) {

        initNBTTagCompound(stack);

        stack.stackTagCompound.setInteger(tag, val);
    }

    public static int getInt(ItemStack stack, String tag) {

        initNBTTagCompound(stack);

        if (!stack.stackTagCompound.hasKey(tag)) {
            setInt(stack, tag, 0);
        }

        return stack.stackTagCompound.getInteger(tag);
    }


    public static void setByte(ItemStack stack, String tag, byte val) {

        initNBTTagCompound(stack);

        stack.stackTagCompound.setByte(tag, val);
    }

    public static byte getByte(ItemStack stack, String tag) {

        initNBTTagCompound(stack);

        if (!stack.stackTagCompound.hasKey(tag)) {
            setByte(stack, tag, (byte) 0);
        }

        return stack.stackTagCompound.getByte(tag);
    }


    public static void setString(ItemStack stack, String tag, String val) {

        initNBTTagCompound(stack);

        stack.stackTagCompound.setString(tag, val);
    }

    public static String getString(ItemStack stack, String tag) {

        initNBTTagCompound(stack);

        if (!stack.stackTagCompound.hasKey(tag)) {
            setString(stack, tag, "");
        }

        return stack.stackTagCompound.getString(tag);
    }


    public static void setLong(ItemStack stack, String tag, long val) {

        initNBTTagCompound(stack);

        stack.stackTagCompound.setLong(tag, val);
    }

    public static long getLong(ItemStack stack, String tag) {

        initNBTTagCompound(stack);

        if (!stack.stackTagCompound.hasKey(tag)) {
            setLong(stack, tag, (long) 0);
        }

        return stack.stackTagCompound.getLong(tag);
    }


    public static void setBoolean(ItemStack stack, String tag, boolean val) {

        initNBTTagCompound(stack);

        stack.stackTagCompound.setBoolean(tag, val);
    }

    public static boolean getBoolean(ItemStack stack, String tag) {

        initNBTTagCompound(stack);

        if (!stack.stackTagCompound.hasKey(tag)) {
            setBoolean(stack, tag, false);
        }

        return stack.stackTagCompound.getBoolean(tag);
    }


    public static void setFloat(ItemStack stack, String tag, float val) {

        initNBTTagCompound(stack);

        stack.stackTagCompound.setFloat(tag, val);
    }

    public static float getFloat(ItemStack stack, String tag) {

        initNBTTagCompound(stack);

        if (!stack.stackTagCompound.hasKey(tag)) {
            setFloat(stack, tag, (float) 0);
        }

        return stack.stackTagCompound.getFloat(tag);
    }


    public static void setDouble(ItemStack stack, String tag, double val) {

        initNBTTagCompound(stack);

        stack.stackTagCompound.setDouble(tag, val);
    }

    public static double getDouble(ItemStack stack, String tag) {

        initNBTTagCompound(stack);

        if (!stack.stackTagCompound.hasKey(tag)) {
            setDouble(stack, tag, (double) 0);
        }

        return stack.stackTagCompound.getDouble(tag);
    }


    public static void setShort(ItemStack stack, String tag, short val) {

        initNBTTagCompound(stack);

        stack.stackTagCompound.setShort(tag, val);
    }

    public static short getShort(ItemStack stack, String tag) {

        initNBTTagCompound(stack);

        if (!stack.stackTagCompound.hasKey(tag)) {
            setShort(stack, tag, (short) 0);
        }

        return stack.stackTagCompound.getShort(tag);
    }


}
