package com.chapter18.prac;

import java.util.List;

/**
 * @authore wuyanfeng
 * @description
 * @date 2017/12/12
 */
public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println(StaticField.value);
        ClassLoader cl = ClassLoader.getSystemClassLoader();
        cl.loadClass("com.chapter18.prac.StaticField");
        System.out.println("系统加载Static类1");
        Class.forName("com.chapter18.prac.StaticField");
    }
    public void replace(String str,List<String> list){}
}
