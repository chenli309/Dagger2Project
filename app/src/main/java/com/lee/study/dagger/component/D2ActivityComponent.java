package com.lee.study.dagger.component;

import com.lee.study.dagger.activity.D2Activity;
import com.lee.study.dagger.activity.DActivity;
import com.lee.study.dagger.scope.ActivityScope;
import com.lee.study.dagger.scope.AppScope;

import javax.inject.Singleton;

import dagger.Component;
import dagger.Subcomponent;

@AppScope
@Component(dependencies = D2BaseComponent.class, modules = D2ActivityModule.class)
public interface D2ActivityComponent {
    void inject(D2Activity dActivity);
}
