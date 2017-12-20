package com.chapter18.prac.proxy;

/**
 * @authore wuyanfeng
 * @description
 * @date 2017/12/19
 */
public class GunDog implements Dog {
    @Override
    public void info() {
        System.out.println("我是一只猎狗");
    }

    @Override
    public void run() {
        System.out.println("我奔跑迅速");
    }
}
