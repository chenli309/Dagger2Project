package com.lee.study.dagger.bean;

public class C1Bean {
    private C2Bean c2Bean;

    public C1Bean(C2Bean c2Bean) {
        this.c2Bean = c2Bean;
    }

    public String work() {
        return c2Bean.work();
    }
}
