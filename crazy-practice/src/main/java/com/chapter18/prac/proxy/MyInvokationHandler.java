package com.chapter18.prac.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @authore wuyanfeng
 * @description
 * @date 2017/12/19
 */
public class MyInvokationHandler implements InvocationHandler {

    private Object target;

    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        DogUtil du = new DogUtil();
        du.method1();
        //通过反射以target作为主调来执行method方法
        Object result = method.invoke(target,args);
        du.method2();
        return result;
    }
}
