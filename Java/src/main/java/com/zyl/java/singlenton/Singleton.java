package com.zyl.java.singlenton;

import java.io.Serializable;

/**
 * @author 4869
 *
 * 线程安全和序列化 下的单列模式
 */
public class Singleton implements Serializable {
    private volatile static Singleton singleton;
    private Singleton(){}
    private static Singleton getInstance(){
        if (singleton == null){
            synchronized (Singleton.class){
                if (singleton == null){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

    private Object readResolve(){
        return singleton;
    }
}
