package com.dmiy.proxy;

import com.dmiy.demo.proxy.Agent;
import com.dmiy.demo.proxy.Star;
import com.dmiy.demo.proxy.TaylorSwift;
import org.junit.Test;

public class TestProxy {

    @Test
    public void test() {
        Star agent = new Agent(new TaylorSwift());
        agent.connect();
    }
}
