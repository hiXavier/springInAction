package com.chapter18.prac;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @authore wuyanfeng
 * @description
 * @date 2017/12/12
 */
public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        Float count = null;
        Float num = 1.0F * count;
        System.out.println(num);
        Map<String,String> map = new HashMap<>();
        map.put("1","1");
        Integer octVal = 0177;
        Integer hexVal = 0X1ab;
        System.out.println("octVal=" + Integer.toBinaryString(octVal));
        float b = 0.100001F;

        System.out.println("b=" + b);
        System.out.println(StaticField.value);
        ClassLoader cl = ClassLoader.getSystemClassLoader();
        cl.loadClass("com.chapter18.prac.StaticField");
        System.out.println("系统加载Static类1");
        Class.forName("com.chapter18.prac.StaticField");
    }
    public void replace(String str,List<String> list){}
}
