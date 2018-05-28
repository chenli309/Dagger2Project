package com.lee.study.dagger.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.blankj.utilcode.util.ToastUtils;
import com.lee.study.dagger.R;
import com.lee.study.dagger.bean.C2Bean;
import com.lee.study.dagger.bean.MainBean;
import com.lee.study.dagger.component.D2ActivityModule;
import com.lee.study.dagger.component.D2BaseComponent;
import com.lee.study.dagger.component.D2BaseModule;
import com.lee.study.dagger.component.DaggerD2ActivityComponent;
import com.lee.study.dagger.component.DaggerD2BaseComponent;

import javax.inject.Inject;

/**
 * component依赖component dependencies方式
 */
public class D2Activity extends AppCompatActivity {

    @Inject
    MainBean mainBean; // 注入父DBaseModule中的MainBean
    @Inject
    MainBean mainBean2; // 注入父DBaseModule中的MainBean
    @Inject
    C2Bean c2Bean; // 注入子D2ActivityModule中的C2Bean
    @Inject
    C2Bean c2Bean2; // 注入子D2ActivityModule中的C2Bean

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d_layout);

        // 先生成一个D2BaseComponent
        D2BaseComponent d2BaseComponent = DaggerD2BaseComponent.builder().d2BaseModule(new D2BaseModule("")).build();
        DaggerD2ActivityComponent.builder().d2BaseComponent(d2BaseComponent).d2ActivityModule(new D2ActivityModule(new C2Bean())).build().inject(this);

        ToastUtils.showLong(mainBean + "\n" + mainBean2 + "\n" + c2Bean + "\n" + c2Bean2);
    }
}
