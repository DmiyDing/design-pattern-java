package com.dmiy.demo.proxy;

public class Agent implements Star {

    private Star star;

    public Agent(Star star) {
        this.star = star;
    }

    @Override
    public void connect() {
        System.out.println("有个广告想请你来代言。");
        star.connect();
        System.out.println("合作愉快。");
    }
}
