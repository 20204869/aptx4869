package com.zyl.java.base;

/**
 * @author 4869
 * Java中共有三种变量，分别是类变量、成员变量和局部变量。他们分别存放在JVM的方法区、堆内存和栈内存中。
 */
public class JavaFileds {
    //类变量
    private static int a;
    //成员变量
    private int b;

    //局部变量
    public void test(int c){
        int d;
    }
}
