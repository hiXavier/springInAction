package com.thread;

/**
 * @authore wuyanfeng
 * @description
 * @date 2018/4/17
 */
public class PrintNumCondition extends Thread{
    private PrintCondition printCondition;

    public PrintNumCondition(String name, PrintCondition printCondition) {
        super(name);
        this.printCondition = printCondition;
    }

    @Override
    public void run() {
        for (int i = 0; i < 26; i++) {
            printCondition.printNum();
        }
    }
}
