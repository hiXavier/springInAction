package com.chapter18.prac;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.List;

/**
 * @authore wuyanfeng
 * @description
 * @date 2017/12/14
 */
public class MethodReflect {
    public static void main(String[] args) throws NoSuchMethodException {
        Class<Test> clazz = Test.class;
        Method replace = clazz.getMethod("replace", String.class, List.class);
        System.out.println("replace方法参数个数" + replace.getParameterCount());
        Parameter[] parameters = replace.getParameters();
        int index = 1;
        for (Parameter parame: parameters){
            if(parame.isNamePresent()){
                System.out.println("---第" + index++ + "个参数信息");
                System.out.println("参数名：" + parame.getName());
                System.out.println("形参类型：" + parame.getType());
                System.out.println("'泛型类型：" + parame.getParameterizedType());
            }
        }
    }
}
