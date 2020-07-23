package com.zyl.java.thread;

/**
 * @author 4869
 * 锁消除：避免加锁操作
 */
public class LockEliminationTest {
    public static void main(String[] args) {
        LockEliminationTest test02 = new LockEliminationTest();
        //启动预热
        for (int i = 0; i < 10000; i++) {
            i++;
        }
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000000; i++) {
            test02.append("abc", "def");
        }
        System.out.println("Time=" + (System.currentTimeMillis() - start));
    }

    public void append(String str1, String str2) {
        StringBuffer sb = new StringBuffer();
        sb.append(str1).append(str2);
    }
}
