package com.zyl.java.designpatterns.singletonpattern;

/**
 * @author 4869
 *
 * 懒汉式线程安全单例模式
 * 该单例模式效率低；且synchronized的加锁范围是整个方法，该方法所有的操作都是同步进行的，但是对非第一次创建对象的情况即没有进入if语句中，根本不需要同步操作，直接返回Singleton
 */
public class LazySafeSingleton {
    //定义实例
    private static LazySafeSingleton singleton;
    //私有构造函数
    private LazySafeSingleton(){}
    //对外提供获取实例的静态方法并对该方法加锁
    public static synchronized LazySafeSingleton getInstance(){
        //在对象被使用的时候实例化
        if (singleton == null){
            singleton = new LazySafeSingleton();
        }
        return singleton;
    }
}
