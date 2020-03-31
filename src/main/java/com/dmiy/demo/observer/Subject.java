package com.dmiy.demo.observer;

/**
 * 主题接口
 */
public interface Subject {

    /**
     * 注册观察者
     *
     * @param observe
     */
    public void register(Observe observe);

    /**
     * 移除观察者
     *
     * @param observe
     */
    public void remove(Observe observe);

    /**
     * 发送通知
     *
     * @param msg
     *
     */
    public void notifyObserve(String msg);
}
