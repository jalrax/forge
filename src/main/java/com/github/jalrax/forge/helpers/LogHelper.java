package com.github.jalrax.forge.helpers;

import com.github.jalrax.forge.Reference;
import cpw.mods.fml.common.FMLLog;


/**
 * Created by Лена on 14.04.2016.
 */
public class LogHelper
{
    public enum Level{
        ALL,
        DEBUG,
        ERROR,
        FATAL,
        INFO,
        OFF,
        TRACE,
        WARN
    }

    public static void log(Level logLevel, Object object){
        FMLLog.log(Reference.NAME, logLevel, String.valueOf(object));}

    public static void all(Object object) {log(Level.ALL, object);}
    public static void debug(Object object){log(Level.DEBUG, object);}
    public static void error(Object object){log(Level.ERROR, object);}
    public static void fatal(Object object){log(Level.FATAL, object);}
    public static void info(Object object){log(Level.INFO, object);}
    public static void off(Object object){log(Level.OFF, object);}
    public static void trace(Object object){log(Level.TRACE, object);}
    public static void warn(Object object){log(Level.WARN, object);}
}