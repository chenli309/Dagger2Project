package com.lee.study.dagger.component;

import com.lee.study.dagger.bean.B2Bean;
import com.lee.study.dagger.bean.C1Bean;
import com.lee.study.dagger.bean.MainBean;
import com.lee.study.dagger.scope.ActivityScope;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class DBaseModule {

    private String name;

    public DBaseModule(String name) {
        this.name = name;
    }

    @Provides
    @Singleton
    public MainBean provideMainBean() {
        MainBean mainBean = new MainBean();
        mainBean.setName(name);
        return mainBean;
    }

    @Provides
    @Singleton
    public B2Bean provideB2Bean() {
        return new B2Bean();
    }
}
