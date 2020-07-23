package com.zyl.java.thread;

import java.util.concurrent.*;

/**
 * @Author: zyl4869
 * @CreateDate: 2020/7/22$ 22:11$
 * <p>
 * 线程池简单demo类
 */
public class ThreadPoolTest {
    public static void main(String[] args) throws Exception {
        ExecutorService executorService = new ThreadPoolExecutor(1, 1,
                60L, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(10));

        executorService.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("abcdefg");
            }
        });

        executorService.shutdown();
    }


}
