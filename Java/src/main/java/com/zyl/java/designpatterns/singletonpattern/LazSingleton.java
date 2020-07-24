package com.zyl.java.designpatterns.singletonpattern;

/**
 * @author 4869
 *
 * 懒汉式单例模式：将类对自己的实例化延迟到第一次被引用的时候。该模式存在线程安全问题即多线程时，多个线程同时进入if语句中，则在多线程都从if中
 * 退出的时候就创建出不同的对象。
 *
 */
public class LazSingleton {
    //定义实例
    private static LazSingleton singleton;
    //私有构造函数，防止外部访问
    private LazSingleton(){}

    //对外提供获取实例的静态方法
    public static LazSingleton getInstance(){
        //在对象被使用的时候才实例化
        if (singleton ==null){
            singleton = new LazSingleton();
        }
        return singleton;
    }
}
