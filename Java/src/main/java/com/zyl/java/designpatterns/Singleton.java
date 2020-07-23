package com.zyl.java.designpatterns;

import java.io.Serializable;

/**
 * 双重校验单列类
 */
public class Singleton implements Serializable {
    private volatile static Singleton singleton;
    private Singleton (){}
    public static Singleton getSingleton() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

    private Object readResolve() {
        return singleton;
    }
}