package com.thread;

/**
 * @authore wuyanfeng
 * @description
 * @date 2018/4/17
 */
public class ThreadJoin extends Thread{
    public ThreadJoin(String name){
        super(name);
    }

    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println(getName() + " " + i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        new ThreadJoin("新线程").start();
        for (int i = 0; i < 100; i++) {
            if(i == 20){
                ThreadJoin threadJoin = new ThreadJoin("被join的线程");
                threadJoin.start();
                threadJoin.join();

            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
