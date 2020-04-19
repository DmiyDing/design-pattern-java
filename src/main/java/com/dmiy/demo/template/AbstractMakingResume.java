package com.dmiy.demo.template;

/**
 * 模板方法模式
 *
 * 封装一套固定的流程，其中部分逻辑可以由子类不同实现。
 *
 * 本例子是一个制作个人简历的模板。设置固定的简历title，定义固定制作简历的流程。
 */
public abstract class AbstractMakingResume {

    public String getTitle() {
        return "个人简历";
    }

    public abstract String getName();

    public abstract String getCity();

    public abstract String getResume();

    // 制作简历。将不同子类实现的获取姓名、城市、个人经历等按步骤组装起来返回。
    public String writing() {
        return this.getTitle() +
                this.getName() +
                this.getCity() +
                this.getResume();
    }
}
