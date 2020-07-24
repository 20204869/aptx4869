package com.zyl.java.designpatterns.abstractfactorypattern;

public class BenzBusinessCar implements BenzCar{
    @Override
    public void gasUp() {
        System.out.println("给我的奔驰商务车加一般的汽油");
    }
}