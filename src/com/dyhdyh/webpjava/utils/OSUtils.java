package com.dyhdyh.webpjava.utils;

/**
 * author  dengyuhan
 * created 2018/6/25 23:35
 */
public class OSUtils {

    public static OSType getOS() {
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains(OSType.Windows.name().toLowerCase())) {
            return OSType.Windows;
        } else if (osName.contains(OSType.Linux.name().toLowerCase())) {
            return OSType.Linux;
        } else if (osName.contains(OSType.Mac.name().toLowerCase())) {
            return OSType.Mac;
        } else {
            return null;
        }
    }

    public enum OSType {
        Windows,
        Linux,
        Mac
    }
}
