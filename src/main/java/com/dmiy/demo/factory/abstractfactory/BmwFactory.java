package com.dmiy.demo.factory.abstractfactory;

import com.dmiy.demo.factory.BmwCar;
import com.dmiy.demo.factory.BmwMotorcycle;
import com.dmiy.demo.factory.Car;
import com.dmiy.demo.factory.Motorcycle;

public class BmwFactory implements AbstractFactory {


    @Override
    public Car createCar() {
        return new BmwCar();
    }

    @Override
    public Motorcycle createMotorcycle() {
        return new BmwMotorcycle();
    }
}
