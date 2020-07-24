package com.zyl.java.designpatterns.abstractfactorypattern;

public interface CarFactory {

    public BenzCar getBenzCar();
    public TeslaCar getTeslaCar();
}