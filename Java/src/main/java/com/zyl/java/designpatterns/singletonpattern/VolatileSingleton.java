package com.zyl.java.designpatterns.singletonpattern;

/**
 * @author 4869
 * <p>
 * 双重校验锁 存在潜在隐患解决方案类
 * 序列化问题：即序列化和反序列化也会导致创建的对象不相同
 */
public class VolatileSingleton {
    private static volatile VolatileSingleton singleton;

    private VolatileSingleton() {
    }

    public static VolatileSingleton getInstance() {
        if (singleton == null) {
            synchronized (VolatileSingleton.class) {
                if (singleton == null) {
                    singleton = new VolatileSingleton();
                }
            }
        }
        return singleton;
    }

}
