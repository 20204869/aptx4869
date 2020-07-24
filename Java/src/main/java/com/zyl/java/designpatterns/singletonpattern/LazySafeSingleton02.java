package com.zyl.java.designpatterns.singletonpattern;

/**
 * @author 4869
 *  双重校验锁 相比较LazySafeSingleton类实现的线程安全减小了同步的范围，由对方法同步改为代码块同步
 *  双重校验锁 存在问题（参考Java内存模型）：
 *  线程A发现变量没有被初始化，然后它获取锁并开始变量的初始化。
 *  由于某些编程语言的语义，编译器生成的代码允许在线程A执行完变量的初始化之前，更新变量并将其指向部分初始化的对象
 *  线程B发现共享变量已被初始化，并返回变量。由于线程B确信变量已被初始化，它没有获取锁。若线程A完成初始化之前共享变量对B可见，程序可能会崩溃。
 *  解决方案 参考VolatileSingleton 和 FinalSingleton 类
 */
public class LazySafeSingleton02 {
    //定义实例
    private static LazySafeSingleton02 singleton;
    //私有构造函数
    private LazySafeSingleton02(){}
    //对外提供获取实例的静态方法并对该方法加锁
    public static LazySafeSingleton02 getInstance(){
        //在对象被使用的时候实例化
        if (singleton == null){
            synchronized (LazySafeSingleton02.class){
                singleton = new LazySafeSingleton02();
            }
        }
        return singleton;
    }
}
