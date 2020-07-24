package com.zyl.java.designpatterns.singletonpattern;

/**
 * @author 4869
 *
 * 静态内部类形式 实现单例；利用classload的机制保证初始化instance时只有一个线程
 * 外部调用静态方法时，才会实例化该对象；即用的时候实例化，避免造成资源浪费
 *
 *
 */
public class StaticInnerClassSingleton {
    //在静态内部类中初始化实例对象
    private static class SingletonHolder{
        private static final StaticInnerClassSingleton INSTANCE = new StaticInnerClassSingleton();
    }

    //私有构造函数，防止外部访问
    private StaticInnerClassSingleton() {
    }

    //对外提供获取实例的静态方法
    public static final StaticInnerClassSingleton getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
