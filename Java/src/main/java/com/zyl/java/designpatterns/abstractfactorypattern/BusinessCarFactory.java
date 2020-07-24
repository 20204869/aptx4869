package com.zyl.java.designpatterns.abstractfactorypattern;

public class BusinessCarFactory implements CarFactory {
    @Override
    public BenzCar getBenzCar() {
        return new BenzBusinessCar();
    }

    @Override
    public TeslaCar getTeslaCar() {
        return new TeslaBusinessCar();
    }
}