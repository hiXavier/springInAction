package com.chapter18.prac;

/**
 * @authore wuyanfeng
 * @description
 * @date 2017/12/13
 */
public class ReflectInfo {
    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("=====first way===");
        Class clazz = Class.forName("com.chapter18.prac.StaticField");
        Class class3 = StaticField.class;
        StaticField staticField = new StaticField();
        Class class2 = staticField.getClass();
    }
}
