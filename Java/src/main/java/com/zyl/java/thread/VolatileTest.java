package com.zyl.java.thread;

/**
 * @author 4869
 * <p>
 * 验证volatile 不能保证原子性操作的demo类
 */
public class VolatileTest {
    public volatile int inc = 0;
    public void increase() {
        inc++;
    }
    public static void main(String[] args) {
        final VolatileTest test = new VolatileTest();
        for(int i=0;i<10;i++){
            new Thread(){
                @Override
                public void run() {
                    for(int j=0;j<1000;j++){
                        test.increase();
                    }
                };
            }.start();
        }
        //保证前面的线程都执行完
        while(Thread.activeCount()>1){
            Thread.yield();
        }
        System.out.println(test.inc);
    }
}
