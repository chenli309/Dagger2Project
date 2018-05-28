package com.lee.study.dagger.component;

import com.lee.study.dagger.bean.MainBean;
import com.lee.study.dagger.scope.ActivityScope;
import com.lee.study.dagger.scope.AppScope;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class D2BaseModule {

    private String name;

    public D2BaseModule(String name) {
        this.name = name;
    }

    @Provides
    @Singleton
    public MainBean provideMainBean() {
        MainBean mainBean = new MainBean();
        mainBean.setName(name);
        return mainBean;
    }
}
