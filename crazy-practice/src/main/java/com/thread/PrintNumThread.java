package com.thread;

/**
 * @authore wuyanfeng
 * @description
 * @date 2018/4/17
 */
public class PrintNumThread extends Thread {

    private Printer printer;

    public PrintNumThread(String name, Printer printer) {
        super(name);
        this.printer = printer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 26; i++) {
            printer.printNum();
        }
    }
}
