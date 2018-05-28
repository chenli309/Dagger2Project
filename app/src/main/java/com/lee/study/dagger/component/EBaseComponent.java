package com.lee.study.dagger.component;

import dagger.Component;

@Component(modules = EBaseModule.class)
public interface EBaseComponent {

    EActivityComponent.EActivityComponentBuilder eActivityComponent();

}
