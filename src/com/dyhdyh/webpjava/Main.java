package com.dyhdyh.webpjava;

import com.dyhdyh.webpjava.library.CWebP;

public class Main {

    public static void main(String[] args) {
        // new WebPJava().loadLibrary();
        String output = "/Users/dengyuhan/Downloads/webp/1.webp";
        String input = "/Users/dengyuhan/Downloads/20141003110813_ZvwaY.jpeg";
        String build = new CWebP().quality(80).input(input).output(output).build();
        System.out.println(build);
    }
}
