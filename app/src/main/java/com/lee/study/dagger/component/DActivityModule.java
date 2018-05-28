package com.lee.study.dagger.component;

import com.lee.study.dagger.bean.DBean;
import com.lee.study.dagger.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

@Module
public class DActivityModule {

    private String title;

    public DActivityModule(String title) {
        this.title = title;
    }

    @Provides
    @ActivityScope //这里不能用@Singleton 父Module(DBaseModule)已经用了
    DBean provideDBean() {
        return new DBean(title);
    }
}
