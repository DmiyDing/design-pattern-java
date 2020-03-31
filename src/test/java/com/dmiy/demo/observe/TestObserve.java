package com.dmiy.demo.observe;

import com.dmiy.demo.observer.OfficialAccounts;
import com.dmiy.demo.observer.WeChatUserA;
import com.dmiy.demo.observer.WeChatUserB;
import org.junit.Test;

/**
 * 观察者模式
 * <p>
 * 定义对象之间的一对多依赖。当一个对象状态改变时，它的所有依赖都会收到通知并且自动更新状态。
 * Subject：被观察者
 * Observe：观察者
 * <p>
 * 本用例是用A、B两个用户订阅公众号的例子
 */
public class TestObserve {

    @Test
    public void test() {
        OfficialAccounts officialAccounts = new OfficialAccounts();
        WeChatUserA userA = new WeChatUserA(officialAccounts);
        WeChatUserB userB = new WeChatUserB(officialAccounts);
        officialAccounts.notifyObserve("XX发布");
    }
}
