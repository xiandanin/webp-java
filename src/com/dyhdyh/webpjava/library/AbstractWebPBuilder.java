package com.dyhdyh.webpjava.library;

import java.util.ArrayList;
import java.util.List;

/**
 * author  dengyuhan
 * created 2018/6/26 00:19
 */
public abstract class AbstractWebPBuilder<Library> {
    protected List<String> command;

    public AbstractWebPBuilder(String name) {
        command = new ArrayList<>();
        command.add(name);
    }

    public Library input(String inputPath) {
        command.add(inputPath);
        return (Library) this;
    }

    public Library output(String outputPath) {
        command.add("-o");
        command.add(outputPath);
        return (Library) this;
    }

    public String build() {
        StringBuffer sb = new StringBuffer();
        for (String c : command) {
            sb.append(c);
            sb.append(" ");
        }
        return sb.toString();
    }

    public Library append(Object appendString) {
        command.add(String.valueOf(appendString));
        return (Library) this;
    }
}
