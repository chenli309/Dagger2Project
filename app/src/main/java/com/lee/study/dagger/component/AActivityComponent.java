package com.lee.study.dagger.component;

import com.lee.study.dagger.activity.AActivity;

import dagger.Component;

@Component
public interface AActivityComponent {
    void inject(AActivity aActivity);
}
