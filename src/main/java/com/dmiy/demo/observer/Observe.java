package com.dmiy.demo.observer;

/**
 * 观察者接口
 */
public interface Observe {

    /**
     * 响应
     *
     * @param msg
     */
    public void response(String msg);
}
