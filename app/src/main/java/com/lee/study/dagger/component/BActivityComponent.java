package com.lee.study.dagger.component;

import com.lee.study.dagger.activity.BActivity;

import dagger.Component;

@Component
public interface BActivityComponent {
    void inject(BActivity bActivity);
}
