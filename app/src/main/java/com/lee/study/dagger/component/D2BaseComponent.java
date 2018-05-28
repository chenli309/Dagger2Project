package com.lee.study.dagger.component;

import com.lee.study.dagger.bean.MainBean;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = D2BaseModule.class)
public interface D2BaseComponent {

    MainBean provideMainBean();
}
