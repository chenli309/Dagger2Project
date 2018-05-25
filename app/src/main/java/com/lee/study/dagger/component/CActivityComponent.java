package com.lee.study.dagger.component;

import com.lee.study.dagger.activity.CActivity;

import dagger.Component;

@Component(modules = CActivityModule.class)
public interface CActivityComponent {
    void inject(CActivity cActivity);
}
