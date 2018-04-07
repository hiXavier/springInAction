package com.xavier.design.pattern.proxy.cglib;

/**
 * @authore wuyanfeng
 * @description
 * @date 2018/4/7
 */
public class MainTest {
    public static void main(String[] args) {
        CGlibProxy cGlibProxy = new CGlibProxy();
        Bank b = (Bank) cGlibProxy.getProxy(Bank.class);
        b.getMoney();
    }
}
