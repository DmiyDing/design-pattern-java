package com.dmiy.demo.factory.abstractfactory;

import com.dmiy.demo.factory.Car;
import com.dmiy.demo.factory.Motorcycle;

public interface AbstractFactory {

    public Car createCar();

    public Motorcycle createMotorcycle();
}
