package com.chapter18.prac.proxy;

import java.lang.reflect.Proxy;

/**
 * @authore wuyanfeng
 * @description 为指定的target生成动态代理实例
 * @date 2017/12/19
 */
public class MyProxyFactory {
    /**
     *@author wuyanfeng
     *@description 动态代理对象与target实现了相同的接口，即具有相同的public方法，所以动态代理对象可以当成target对象使用
     *
     *@date: 22:09 2017/12/19
     */
    public static Object getProxy(Object target){
        MyInvokationHandler handler = new MyInvokationHandler();
        handler.setTarget(target);
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),handler);
    }
}
