package com.lee.study.dagger.bean;

import javax.inject.Inject;

public class B2Bean {

    @Inject
    public B2Bean() {
    }

    public String work() {
        return "B2Bean do work";
    }
}
