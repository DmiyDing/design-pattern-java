package com.dmiy.template;

import com.dmiy.demo.template.AbstractMakingResume;
import com.dmiy.demo.template.LiSiResume;
import com.dmiy.demo.template.ZhangSanResume;
import org.junit.Test;

public class TestTemplate {

    @Test
    public void test() {
        AbstractMakingResume zhangsan = new ZhangSanResume();
        System.out.println(zhangsan.writing());;
        AbstractMakingResume lisi = new LiSiResume();
        System.out.println(lisi.writing());
    }
}
