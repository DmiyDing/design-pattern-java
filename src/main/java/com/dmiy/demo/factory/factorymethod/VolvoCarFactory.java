package com.dmiy.demo.factory.factorymethod;

import com.dmiy.demo.factory.Car;
import com.dmiy.demo.factory.VolvoCar;

public class VolvoCarFactory implements CarBaseFactory {

    @Override
    public Car createCar() {
        return new VolvoCar();
    }
}
