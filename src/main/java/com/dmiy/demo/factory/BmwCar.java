package com.dmiy.demo.factory;

public class BmwCar implements Car{

    @Override
    public void create() {
        System.out.println("生产一辆宝马汽车。");
    }
}
