package com.thread;

/**
 * @authore wuyanfeng
 * @description
 * @date 2018/4/17
 */
public class Printer {
    //是否打印完数字
    private boolean flag = false;

    private int startNum = 1;

    private char startChar = 'A';

    public synchronized void printNum(){
        try{
            if(flag){
                wait();
            }else {
                System.out.print(startNum++);
                System.out.print(startNum++);
                flag = true;
                notifyAll();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public synchronized void printChar(){
        try{
            if(!flag){
                wait();
            }else {
                System.out.print(startChar++);
                flag = false;
                notifyAll();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
