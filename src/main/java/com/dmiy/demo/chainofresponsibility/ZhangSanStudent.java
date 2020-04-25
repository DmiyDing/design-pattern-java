package com.dmiy.demo.chainofresponsibility;

public class ZhangSanStudent extends AbstractStudent  {

    private final int num;

    public ZhangSanStudent(int num) {
        this.num = num;
    }

    @Override
    public void countOff() {
        System.out.println("我是张三，我的编号是：" + num);
        if (getNextStudent() != null) {
            getNextStudent().countOff();
        }
    }
}
