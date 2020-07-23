package com.zyl.java.reflect;

/**
 * @author 4869
 * 代理测试类
 */
public class ProxyTest {
    public static void main(String[] args) {
        HelloSerivice serivice = new HelloServiceImp();
        HelloSeriviceProxy proxy = new HelloSeriviceProxy(serivice);

        proxy.say();
    }
}
