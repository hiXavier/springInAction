package com.chapter18.prac;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;

/**
 * @authore wuyanfeng
 * @description
 * @date 2017/12/13
 */
public class ClassLoaderPropTest {
    public static void main(String[] args) throws IOException {
        ClassLoader systemLoader = ClassLoader.getSystemClassLoader();
        System.out.println("系统类加载器：" + systemLoader);
        Enumeration<URL> em1 = systemLoader.getResources("");
        while (em1.hasMoreElements()){
            System.out.println(em1.nextElement());
        }
        ClassLoader extensionLoader = systemLoader.getParent();
        System.out.println("扩展类加载器： " + extensionLoader);
        System.out.println("扩展类加载器路径： " + System.getProperty("java.ext.dirs"));
        System.out.println("扩展类的父类：" + extensionLoader.getParent());
    }
}
