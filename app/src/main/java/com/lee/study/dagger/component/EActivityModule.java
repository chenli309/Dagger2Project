package com.lee.study.dagger.component;

import com.lee.study.dagger.bean.EBean;

import dagger.Module;
import dagger.Provides;

@Module
public class EActivityModule {

//    private EBean eBean;
//
//    public EActivityModule(EBean eBean) {
//        this.eBean = eBean;
//    }

    @Provides
    EBean provideEBean() {
        return new EBean();
    }
}
