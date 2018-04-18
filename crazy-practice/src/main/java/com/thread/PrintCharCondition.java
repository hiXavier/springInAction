package com.thread;

/**
 * @authore wuyanfeng
 * @description
 * @date 2018/4/17
 */
public class PrintCharCondition extends Thread {
    private PrintCondition printer;

    public PrintCharCondition(String name,PrintCondition printer){
        super(name);
        this.printer = printer;
    }

    @Override
    public void  run(){
        for (int i = 0; i < 26; i++) {
            printer.printChar();
        }
    }
}
