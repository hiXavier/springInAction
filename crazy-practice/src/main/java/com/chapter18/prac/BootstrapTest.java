package com.chapter18.prac;

import java.net.URL;

/**
 * @authore wuyanfeng
 * @description
 * @date 2017/12/13
 */
public class BootstrapTest {
    public static void main(String[] args) {
        URL[] urls = sun.misc.Launcher.getBootstrapClassPath().getURLs();
        for (int i = 0; i < urls.length ; i++) {
            System.out.println(urls[i].toExternalForm());
        }
    }
}
