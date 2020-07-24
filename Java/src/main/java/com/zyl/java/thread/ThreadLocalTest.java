package com.zyl.java.thread;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 4869
 * 多线程情况下使用 SimpleDateFormat 对时间进行格式化。每个线程都会创建属于自己的SimpleDateFormat对象。
 * 问题：耗内存
 * 解决方案参考 ThreadLocalTest02 & ThreadLocalTest03类
 *
 */
public class ThreadLocalTest {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                String date = new ThreadLocalTest().date(10);
                System.out.println(date);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                String date = new ThreadLocalTest().date(1000);
                System.out.println(date);
            }
        }).start();
    }

    private String date(int seconds) {
        // 参数的单位是毫秒，从1970.1.1 00:00:00 GMT计时
        Date date = new Date(1000 * seconds);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return dateFormat.format(date);
    }
}
