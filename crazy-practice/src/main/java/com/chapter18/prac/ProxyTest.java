package com.chapter18.prac;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @authore wuyanfeng
 * @description
 * @date 2017/12/14
 */
public class ProxyTest {
    public static void main(String[] args) {
        InvocationHandler myHandler = new MyInvokationHandler();
        PersonInterface p = (PersonInterface) Proxy.newProxyInstance(
                PersonInterface.class.getClassLoader(),new Class[]{PersonInterface.class},myHandler);
        p.walk();
        p.sayHello("孙悟空");
    }
}
