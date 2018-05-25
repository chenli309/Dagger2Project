package com.lee.study.dagger.bean;

import javax.inject.Inject;

public class MainBean {

    private String name;

//    @Inject
    public MainBean() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
