package com.marcs.marcsmod.util;

import com.marcs.marcsmod.reference.Info;
import cpw.mods.fml.common.FMLLog;
import org.apache.logging.log4j.Level;

/**
 * Marcs Mod por marcs77
 */
public class Logger {

    public static void log(Level l, Object t) {
        FMLLog.log(Info.NOMBRE_EXTERNO, l, String.valueOf(t));
    }

    public static void all(Object o) {
        log(Level.ALL, o);
    }

    public static void debug(Object o) {
        log(Level.DEBUG, o);
    }

    public static void error(Object o) {
        log(Level.ERROR, o);
    }

    public static void fatal(Object o) {
        log(Level.FATAL, o);
    }

    public static void info(Object o) {
        log(Level.INFO, o);
    }

    public static void warn(Object o) {
        log(Level.WARN, o);
    }

    public static void trace(Object o) {
        log(Level.TRACE, o);
    }

    public static void off(Object o) {
        log(Level.OFF, o);
    }

}
