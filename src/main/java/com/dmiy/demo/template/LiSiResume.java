package com.dmiy.demo.template;

public class LiSiResume extends AbstractMakingResume {
    
    @Override
    public String getName() {
        return "李四";
    }

    @Override
    public String getCity() {
        return "成都";
    }

    @Override
    public String getResume() {
        return "我是来自...";
    }
}
