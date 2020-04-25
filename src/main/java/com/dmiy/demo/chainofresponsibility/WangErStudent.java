package com.dmiy.demo.chainofresponsibility;

public class WangErStudent extends AbstractStudent  {

    private final int num;

    public WangErStudent(int num) {
        this.num = num;
    }

    @Override
    public void countOff() {
        System.out.println("我是王二，我的编号是：" + num);
        if (getNextStudent() != null) {
            getNextStudent().countOff();
        }
    }
}
