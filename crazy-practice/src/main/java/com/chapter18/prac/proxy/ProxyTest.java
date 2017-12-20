package com.chapter18.prac.proxy;

/**
 * @authore wuyanfeng
 * @description
 * @date 2017/12/19
 */
public class ProxyTest {

    public static void main(String[] args) {
        Dog dog = new GunDog();
        Dog dogTar = (Dog) MyProxyFactory.getProxy(dog);
        dogTar.info();
        dogTar.run();
    }
}
