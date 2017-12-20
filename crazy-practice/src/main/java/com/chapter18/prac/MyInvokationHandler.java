package com.chapter18.prac;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @authore wuyanfeng
 * @description
 * @date 2017/12/14
 */
public class MyInvokationHandler implements InvocationHandler{

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("----正在执行的方法---：" + method);
        if(args != null){
            System.out.println("下面是执行方法的传入实参：");
            for (Object val :
                    args) {
                System.out.println(val);
            }
        }else {
            System.out.println("方法没有实参");
        }
        return null;
    }
}
