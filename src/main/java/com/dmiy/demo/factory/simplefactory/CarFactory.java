package com.dmiy.demo.factory.simplefactory;

import com.dmiy.demo.factory.BenzCar;
import com.dmiy.demo.factory.Car;
import com.dmiy.demo.factory.VolvoCar;

public class CarFactory {

    private static final String BENZ_CAR = "benz";

    private static final String VOLVO_CAR = "volvo";

    public Car createCar(String brand) {
        if (brand.equalsIgnoreCase(BENZ_CAR)) {
            return new BenzCar();
        } else if (brand.equalsIgnoreCase(VOLVO_CAR)) {
            return new VolvoCar();
        }
        return null;
    }
}
