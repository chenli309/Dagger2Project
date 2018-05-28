package com.lee.study.dagger.component;

import com.lee.study.dagger.activity.DActivity;
import com.lee.study.dagger.scope.ActivityScope;

import javax.inject.Singleton;

import dagger.Subcomponent;

@ActivityScope //这里不能用@Singleton 父Component(DBaseComponent)已经使用了
@Subcomponent(modules = DActivityModule.class)
public interface DActivityComponent {
    void inject(DActivity dActivity);
}
