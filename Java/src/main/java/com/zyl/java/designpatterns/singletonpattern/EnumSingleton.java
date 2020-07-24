package com.zyl.java.designpatterns.singletonpattern;

/**
 * @author 4869
 *
 *  枚举实现单例
 *  优点：
 *  1.避免多线程同步问题
 *  2.防止反序列化重新创建新的对象
 */
public enum  EnumSingleton {
    INSTANCE;
    EnumSingleton(){
    }
}
