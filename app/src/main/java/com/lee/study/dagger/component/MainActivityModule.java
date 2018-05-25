package com.lee.study.dagger.component;

import com.lee.study.dagger.bean.CoffeeMachine;
import com.lee.study.dagger.bean.Cooker;
import com.lee.study.dagger.bean.MainBean;
import com.lee.study.dagger.bean.SimpleCoffeeMaker;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class MainActivityModule {

    private String name;

    public MainActivityModule(String name) {
        this.name = name;
    }

    @Provides
    @Singleton
    public MainBean provideMainBean() {
        MainBean mainBean = new MainBean();
        mainBean.setName(name);
        return mainBean;
    }

    // =============================================================================

    /*
    步骤1：查找Module中是否存在创建该类的方法。
    步骤2：若存在创建类方法，查看该方法是否存在参数
    步骤2.1：若存在参数，则按从步骤1开始依次初始化每个参数
    步骤2.2：若不存在参数，则直接初始化该类实例，一次依赖注入到此结束
    步骤3：若不存在创建类方法，则查找Inject注解的构造函数，看构造函数是否存在参数
    步骤3.1：若存在参数，则从步骤1开始依次初始化每个参数
    步骤3.2：若不存在参数，则直接初始化该类实例，一次依赖注入到此结束
     */

    @Provides
    public CoffeeMachine provideCoffeeMachine(SimpleCoffeeMaker coffeeMaker) {
        return new CoffeeMachine(coffeeMaker);
    }

    @Provides
    public SimpleCoffeeMaker provideCoffeeMaker(Cooker cooker) {
        return new SimpleCoffeeMaker(cooker);
    }

    @Provides
    public Cooker provideCooker() {
        return new Cooker("James", "Espresso");
    }
}
