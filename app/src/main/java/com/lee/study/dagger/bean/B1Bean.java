package com.lee.study.dagger.bean;

import javax.inject.Inject;

public class B1Bean {
    private B2Bean b2Bean;

    @Inject
    public B1Bean(B2Bean b2Bean) {
        this.b2Bean = b2Bean;
    }

    public String work() {
        return b2Bean.work();
    }
}
