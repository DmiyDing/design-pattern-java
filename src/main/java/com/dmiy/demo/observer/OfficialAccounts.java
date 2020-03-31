package com.dmiy.demo.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 订阅号
 */
public class OfficialAccounts implements Subject {

    private List<Observe> observes = new ArrayList<Observe>();

    @Override
    public void register(Observe observe) {
        observes.add(observe);
    }

    @Override
    public void remove(Observe observe) {
        observes.remove(observe);
    }

    @Override
    public void notifyObserve(String msg) {
        for (Observe observe : observes) {
            observe.response(msg);
        }
    }
}
