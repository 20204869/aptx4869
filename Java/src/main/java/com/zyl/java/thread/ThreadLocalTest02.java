package com.zyl.java.thread;

import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author 4869
 * 多线程模式下同时实现线程安全 测试类
 */
public class ThreadLocalTest02 {
    public static ExecutorService THREAD_POOL = Executors.newFixedThreadPool(10);
    static SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            int finalI = i;
            THREAD_POOL.submit(new Runnable() {
                @Override
                public void run() {
                    String date = new ThreadLocalTest02().date02(finalI);
                    System.out.println(date +"-----"+Thread.currentThread());
                }
            });
        }
        // 关闭线程池，此种关闭方式不再接受新的任务提交，等待现有队列中的任务全部执行完毕之后关闭
        THREAD_POOL.shutdown();
    }

    private String date01(int seconds) {
        // 参数的单位是毫秒，从1970.1.1 00:00:00 GMT计时
        Date date = new Date(1000 * seconds);
        return DATE_FORMAT.format(date);
    }

    /**
     * SimpleDateFormat 非线程安全，通过使用 synchronized进行线程同步控制
     * @param seconds
     * @return
     */
    private String date02(int seconds) {
        // 参数的单位是毫秒，从1970.1.1 00:00:00 GMT计时
        Date date = new Date(1000 * seconds);
        String format;
        synchronized (ThreadLocalTest02.class) {
            format = DATE_FORMAT.format(date);
        }
        return format;
    }
}
