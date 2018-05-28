package com.lee.study.dagger.component;

import com.lee.study.dagger.bean.MainBean;

import dagger.Module;
import dagger.Provides;

@Module
public class EBaseModule {

//    private String name;
//
//    public EBaseModule(String name) {
//        this.name = name;
//    }

    @Provides
//    @Singleton  父Module这里不能定义为单例?
    public MainBean provideMainBean() {
        MainBean mainBean = new MainBean();
        mainBean.setName("EBaseModule Lee");
        return mainBean;
    }
}
