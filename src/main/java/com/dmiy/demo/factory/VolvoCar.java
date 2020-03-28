package com.dmiy.demo.factory;

public class VolvoCar implements Car{

    @Override
    public void create() {
        System.out.println("生产一辆沃尔沃汽车。");
    }
}
