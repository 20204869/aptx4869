package com.zyl.java.designpatterns.singletonpattern;

/**
 * @author 4869
 * 解决序列化和反序列化出现的线程安全问题
 */
public class SerializableSingleton {
    private volatile static SerializableSingleton singleton;
    private SerializableSingleton(){}
    public static SerializableSingleton getInstance(){
        if (singleton == null){
            synchronized (SerializableSingleton.class){
                if (singleton == null){
                    singleton = new SerializableSingleton();
                }
            }
        }
        return singleton;
    }

    private Object readResolve(){
        return singleton;
    }
}
