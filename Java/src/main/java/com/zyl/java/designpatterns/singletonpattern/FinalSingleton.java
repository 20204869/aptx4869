package com.zyl.java.designpatterns.singletonpattern;

/**
 * @author 4869
 *  双重校验锁潜在问题解决方案类
 */
public class FinalSingleton {
    private FinalWrapper<FinalSingleton> singleton = null;

    public FinalSingleton getInstance(){
        FinalWrapper<FinalSingleton> wrapper = singleton;
        if (wrapper == null){
            synchronized (this){
                if (singleton == null){
                    singleton = new FinalWrapper<>(new FinalSingleton());
                }
                wrapper = singleton;
            }
        }
        return wrapper.value;
    }
}

class FinalWrapper<T> {
    public final T value;

    public FinalWrapper(T value) {
        this.value = value;
    }
}