package com.dyhdyh.webpjava.service;

import com.dyhdyh.webpjava.utils.OSUtils;

import java.io.File;

/**
 * author  dengyuhan
 * created 2018/6/25 23:42
 */
public class WebPJava {
    private final String LIBWEBP_VERSION = "1.0.0";

    public File getLibraryFile(String libraryName) {
        File rootFile = new File(this.getClass().getResource("/").getPath());
        String dirName = "libwebp-" + LIBWEBP_VERSION;
        File libwebpDir = new File(rootFile, dirName);
        OSUtils.OSType type = OSUtils.getOS();

        if (type != null) {
            File webpDirByOS = new File(libwebpDir, type.name().toLowerCase());
            System.out.println(webpDirByOS.getAbsolutePath());
            return new File(webpDirByOS, libraryName);
        }
        return null;
    }

    public String getVersion() {
        return LIBWEBP_VERSION;
    }
}
