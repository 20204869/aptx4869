package com.zyl.java.thread;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author 4869
 *  ThreadLocal 测试类
 *  ThreadLocal 是thread的局部变量；它是每个线程独享的本地变量，每个线程都有自己的ThreadLocal，它们是线程隔离的。
 *
 *  ThreadLocal 避免创建多个SimpleDateFormat 对象，且在不使用锁的情况下实现线程安全
 *  此demo类中 每个线程独享一个SimpleDateFormat对象
 */
public class ThreadLocalTest03 {

    //Executors 创建线程池 可能会导致OOM ，详情请参考：https://www.jianshu.com/p/1c68ebab761e
    public static ExecutorService THREAD_POOL = Executors.newFixedThreadPool(10);

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            int finalI = i;
            THREAD_POOL.submit(new Runnable() {
                @Override
                public void run() {
                    String date = new ThreadLocalTest03().date(finalI);
                    System.out.println(date +"-----"+Thread.currentThread());
                }
            });
        }
        THREAD_POOL.shutdown();
    }

    private String date(int seconds) {
        // 参数的单位是毫秒，从1970.1.1 00:00:00 GMT计时
        Date date = new Date(1000 * seconds);
        SimpleDateFormat simpleDateFormat = ThreadSafeDateFormatter.dateFormatThreadLocal.get();
        return simpleDateFormat.format(date);
    }

}

class ThreadSafeDateFormatter {
    public static ThreadLocal<SimpleDateFormat> dateFormatThreadLocal = new ThreadLocal<SimpleDateFormat>() {
        @Override
        protected SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        }
    };
}
