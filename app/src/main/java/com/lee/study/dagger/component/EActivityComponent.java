package com.lee.study.dagger.component;

import com.lee.study.dagger.activity.EActivity;

import dagger.Subcomponent;

@Subcomponent(modules = {EActivityModule.class})
public interface EActivityComponent {
    void inject(EActivity eActivity);

    @Subcomponent.Builder
    interface EActivityComponentBuilder {
        EActivityComponentBuilder eActivityModule(EActivityModule eActivityModule);

        EActivityComponent build();
    }
}
