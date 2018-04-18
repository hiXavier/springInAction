package com.thread;

/**
 * @authore wuyanfeng
 * @description
 * @date 2018/4/17
 */
public class PrintThreadTra extends Thread {

    private Printer printer;

    public PrintThreadTra(String name){
        super(name);
    }

    @Override
    public void  run(){
        for (int i = 0; i < 50; i++) {
            printer.printNum();
        }
    }
}
