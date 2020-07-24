package com.zyl.java.designpatterns.abstractfactorypattern;

public class BenzSportCar implements BenzCar {
    @Override
    public void gasUp() {
        System.out.println("给我的奔驰跑车加最好的汽油");
    }
}