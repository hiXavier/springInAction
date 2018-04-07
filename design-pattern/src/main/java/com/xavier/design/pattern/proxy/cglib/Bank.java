package com.xavier.design.pattern.proxy.cglib;

import java.util.Random;

/**
 * @authore wuyanfeng
 * @description
 * @date 2018/4/7
 */
public class Bank {
    public void getMoney() {

        Random ran = new Random();

        Float f = ran.nextFloat() * 10000;

        System.out.println("取到了" + f + "人民币");

    }
}
