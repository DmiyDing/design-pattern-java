package com.dmiy.demo.factory;

public class BenzCar implements Car{

    @Override
    public void create() {
        System.out.println("生产一辆奔驰汽车。");
    }
}
