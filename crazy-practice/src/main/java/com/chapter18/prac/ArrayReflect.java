package com.chapter18.prac;

import java.lang.reflect.Array;

import static javafx.scene.input.KeyCode.O;

/**
 * @authore wuyanfeng
 * @description
 * @date 2017/12/14
 */
public class ArrayReflect {
    public static void main(String[] args) {
        try{
            Object arr = Array.newInstance(String.class,10);
            Array.set(arr,5,"crazy java");
            Array.set(arr,6,"By Xavier");
            Object v1 = Array.get(arr,5);
            Object v2 = Array.get(arr,6);
            System.out.println(v1);
            System.out.println(v2);

            /**
             * 多维数组
             */
            Object arra = Array.newInstance(String.class,3,4,10);
            Object arrayOb = Array.get(arra,2);
            Array.set(arrayOb,2,new String[]{
                    "1","2"
            });
            Object anArr = Array.get(arrayOb,3);
            Array.set(anArr,8,"三维");
            String[][][] cast = (String[][][])arra;
            System.out.println(cast[2][3][8]);
            System.out.println(cast[2][2][0]);
            System.out.println(cast[2][2][1]);
        }catch (Throwable e){
            System.out.println(e);
        }
    }
}
