package com.dyhdyh.webpjava.service;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * author  dengyuhan
 * created 2018/6/25 23:43
 */
public class Command {

    public static String execute(String command) {
        try {
            System.out.println(command);
            Process process = Runtime.getRuntime().exec(command);

            DataInputStream dataInputStream = new DataInputStream(process.getErrorStream());
            Reader inputStreamReader = new InputStreamReader(dataInputStream, "UTF-8");
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            StringBuffer sb = new StringBuffer();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null || readLine.isEmpty()) {
                    break;
                }
                sb.append(readLine);
                sb.append("\n");
            }
            process.destroy();
            return sb.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
