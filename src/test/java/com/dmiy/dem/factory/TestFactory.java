package com.dmiy.dem.factory;

import com.dmiy.demo.factory.Car;
import com.dmiy.demo.factory.abstractfactory.AbstractFactory;
import com.dmiy.demo.factory.abstractfactory.BmwFactory;
import com.dmiy.demo.factory.factorymethod.VolvoCarFactory;
import com.dmiy.demo.factory.simplefactory.CarFactory;
import org.junit.Test;

public class TestFactory {

    @Test
    public void testSimpleFactory() {
        Car car = new CarFactory().createCar("benz");
        car.create();
    }

    @Test
    public void testFactoryMethod() {
        Car car = new VolvoCarFactory().createCar();
        car.create();
    }

    @Test
    public void testAbstractFactory() {
        AbstractFactory factory = new BmwFactory();
        factory.createCar().create();
        factory.createMotorcycle().create();
    }
}
