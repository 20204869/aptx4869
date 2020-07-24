package com.zyl.java.designpatterns.singletonpattern;

/**
 * 单例模式：保证一个类仅有一个实例，并提供一个访问它的全局访问点。
 * 优点：
 * 1、在内存里只有一个实例，减少了内存的开销，尤其是频繁的创建和销毁实例
 * 2、避免对资源的多重占用
 *
 * 饿汉式单例 ，在类被加载的时候对象会实例化；这也会造成不必要的消耗，因为该实例不一定被用到。且如果该类被多次加载的话也会造成多次实例化。
 * 解决上述问题方案：1.使用静态内部类形式 2. 懒汉式
 */
public class Singleton {
    //在类内部实例化一个实例
    private static Singleton instance = new Singleton();
    //私有的构造函数,外部无法访问
    private Singleton() {
    }
    //对外提供获取实例的静态方法
    public static Singleton getInstance() {
        return instance;
    }
}