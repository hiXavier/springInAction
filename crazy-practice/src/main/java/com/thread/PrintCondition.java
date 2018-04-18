package com.thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @authore wuyanfeng
 * @description
 * @date 2018/4/17
 */
public class PrintCondition {
    //是否打印完数字
    private boolean flag = false;

    private int startNum = 1;

    private char startChar = 'A';

    private Lock lock = new ReentrantLock();

    private Condition condition = lock.newCondition();

    public synchronized void printNum(){
        lock.lock();
        try{
            if(flag){
                condition.await();
            }else {
                System.out.print(startNum++);
                System.out.print(startNum++);
                flag = true;
                condition.signalAll();
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public  void printChar(){
        lock.lock();
        try{
            if(!flag){
                condition.await();
            }else {
                System.out.print(startChar++);
                flag = false;
                condition.signalAll();
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}
