package com.lee.study.dagger.component;

import com.lee.study.dagger.bean.C2Bean;
import com.lee.study.dagger.scope.ActivityScope;
import com.lee.study.dagger.scope.AppScope;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class D2ActivityModule {

    private C2Bean c2Bean;

    public D2ActivityModule(C2Bean c2Bean) {
        this.c2Bean = c2Bean;
    }

    @Provides
    @AppScope
    C2Bean provideC2Bean() {
        return this.c2Bean;
    }
}
