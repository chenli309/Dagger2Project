package com.lee.study.dagger.component;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = DBaseModule.class)
public interface DBaseComponent {

    //父Component中提供一个获取子DActivityComponent的方法
    //如果子Module的构造方法需要参数，可以在这里添加一个参数 子Module(DActivityModule)
    DActivityComponent getDActivityComponent(DActivityModule dActivityModule);

    //上面的方法也可以这样理解 需要将SubComponent 追加到 被依赖的Component中
//    DActivityComponent addSub(DActivityModule dActivityModule);

}
