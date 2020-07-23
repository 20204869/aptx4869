package com.zyl.java.thread;

/**
 * @author 4869
 * Synchronized 关键字测试类
 * synchronized 解决线程安全问题
 */
public class SynchronizedTest {
    //同步方法
    public synchronized void doSth(){
        System.out.println("Hello World");
    }

    //同步代码块
    public void doSomething(){
        synchronized (SynchronizedTest.class){
            System.out.println("Hello World");
        }
    }
}
