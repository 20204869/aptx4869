package com.zyl.java.designpatterns.singletonpattern;

/**
 * 单例模式测试类
 */
public class SingletonClient {

    public static void main(String[] args) {
        Singleton singleton01 = Singleton.getInstance();
        Singleton singleton02 = Singleton.getInstance();
        System.out.println(singleton01==singleton02);
    }
}