package com.dmiy.demo.chainofresponsibility;

/**
 * 学生抽象
 */
public abstract class AbstractStudent {

    private AbstractStudent nextStudent;

    public void setNextStudent(AbstractStudent nextStudent) {
        this.nextStudent = nextStudent;
    }

    public AbstractStudent getNextStudent() {
        return nextStudent;
    }

    public abstract void countOff();
}
