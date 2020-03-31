package com.dmiy.demo.observer;

/**
 * 微信端观察者
 */
public class WeChatUserB implements Observe {

    /**
     * 微信订阅订阅号
     *
     * @param subject
     */
    public WeChatUserB(Subject subject) {
        subject.register(this);
    }

    @Override
    public void response(String msg) {
        System.out.println("用户B收到订阅消息：" + msg);
    }
}
