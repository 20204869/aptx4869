package com.zyl.java.designpatterns.singletonpattern;

/**
 * @author 4869
 *
 * 饿汉式 变种
 */
public class Singleton02 {
    //在类内部定义
    private static Singleton02 instance;

    static {
        //实例化该对象
        instance = new Singleton02();
    }
    //私有构造函数，外部无法访问
    private Singleton02() {
    }

    //对外提供获取实例的静态方法
    public static Singleton02 getInstance(){
        return instance;
    }

}
