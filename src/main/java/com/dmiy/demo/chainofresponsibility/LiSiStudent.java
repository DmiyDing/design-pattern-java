package com.dmiy.demo.chainofresponsibility;

public class LiSiStudent extends AbstractStudent {

    private final int num;

    public LiSiStudent(int num) {
        this.num = num;
    }

    @Override
    public void countOff() {
        System.out.println("我是李四，我的编号是：" + num);
        if (getNextStudent() != null) {
            getNextStudent().countOff();
        }
    }
}
