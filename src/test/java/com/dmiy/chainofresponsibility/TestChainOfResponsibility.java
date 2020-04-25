package com.dmiy.chainofresponsibility;

import com.dmiy.demo.chainofresponsibility.AbstractStudent;
import com.dmiy.demo.chainofresponsibility.LiSiStudent;
import com.dmiy.demo.chainofresponsibility.WangErStudent;
import com.dmiy.demo.chainofresponsibility.ZhangSanStudent;
import org.junit.Test;

/**
 * 责任链模式/职责链模式
 *
 * 定义一个抽象学生类，提供一个传递学生的方法。定义一个报数的方法。
 * 将学生链起来，报数。
 *
 */
public class TestChainOfResponsibility {

    @Test
    public void test() {
        AbstractStudent zhangsan = new ZhangSanStudent(1);
        AbstractStudent lisi = new LiSiStudent(2);
        AbstractStudent wanger = new WangErStudent(3);

        zhangsan.setNextStudent(lisi);
        lisi.setNextStudent(wanger);

        zhangsan.countOff();
    }
}
