package com.zyl.java.designpatterns.abstractfactorypattern;

public class SportCarFactory implements CarFactory {
    @Override
    public BenzCar getBenzCar() {
        return new BenzSportCar();
    }

    @Override
    public TeslaCar getTeslaCar() {
        return new TeslaSportCar();
    }
}

