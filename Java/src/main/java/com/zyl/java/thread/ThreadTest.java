package com.zyl.java.thread;

/**
 * @Author: zyl4869
 * @CreateDate: 2020/7/22$ 22:05$
 * 线程demo类
 */
public class ThreadTest {
        public static void main(String[] args) throws Exception {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println("线程运行中");
                }
            }).start();
        }
    }
