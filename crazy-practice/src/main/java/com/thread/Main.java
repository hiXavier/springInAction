package com.thread;

/**
 * @authore wuyanfeng
 * @description
 * @date 2018/4/17
 */
public class Main {
    public static void main(String[] args) {
        Printer printer =  new Printer();
        new PrintNumThread("printNum",printer).start();
        new PrintCharThread("printChar",printer).start();
        PrintCondition printCondition = new PrintCondition();
        new PrintNumCondition("pnc",printCondition).start();
        new PrintCharCondition("pcc",printCondition).start();
    }

}
