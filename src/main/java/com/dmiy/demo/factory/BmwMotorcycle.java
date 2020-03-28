package com.dmiy.demo.factory;

public class BmwMotorcycle implements Motorcycle{

    @Override
    public void create() {
        System.out.println("生产一辆宝马摩托车。");
    }
}
