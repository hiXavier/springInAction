package com.chapter18.prac.generic;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;

/**
 * @authore wuyanfeng
 * @description
 * @date 2017/12/19
 */
public class GenericTest {
    private Map<String,Integer> score;

    public static void main(String[] args) throws NoSuchFieldException {
        Class<GenericTest> clazz = GenericTest.class;
        Field f = clazz.getDeclaredField("score");
        Class<?> a = f.getType();
        System.out.println("score的类型是" + a);
        Type gType = f.getGenericType();
        if(gType instanceof ParameterizedType){
            ParameterizedType pType = (ParameterizedType) gType;
            Type rType = pType.getRawType();
            System.out.println("原始类型是：" + rType);
            Type[] tAargs = pType.getActualTypeArguments();
            System.out.println("泛型信息是");
            for (int i = 0; i < tAargs.length; i++) {
                System.out.println("第" + i + "个泛型类型是" + tAargs[i]);
            }
        }
    }
}
