package com.dyhdyh.webpjava.library;

/**
 * author  dengyuhan
 * created 2018/6/26 00:12
 */
public class CWebP extends AbstractWebPBuilder<CWebP>{

    public CWebP() {
        super("cwebp");
    }

    public CWebP quality(int quality) {
        append("-q");
        append(quality);
        return this;
    }

}
