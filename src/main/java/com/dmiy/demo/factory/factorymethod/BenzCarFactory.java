package com.dmiy.demo.factory.factorymethod;

import com.dmiy.demo.factory.BenzCar;
import com.dmiy.demo.factory.Car;

public class BenzCarFactory implements CarBaseFactory {

    @Override
    public Car createCar() {
        return new BenzCar();
    }
}
