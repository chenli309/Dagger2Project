package com.lee.study.dagger.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.blankj.utilcode.util.ToastUtils;
import com.lee.study.dagger.R;
import com.lee.study.dagger.bean.C2Bean;
import com.lee.study.dagger.bean.DBean;
import com.lee.study.dagger.bean.MainBean;
import com.lee.study.dagger.component.DActivityModule;
import com.lee.study.dagger.component.DBaseComponent;
import com.lee.study.dagger.component.DBaseModule;
import com.lee.study.dagger.component.DaggerDBaseComponent;

import javax.inject.Inject;

/**
 * component依赖component Subcomponent方式
 */
public class DActivity extends AppCompatActivity {

    @Inject
    MainBean mainBean; // 注入父DBaseModule中的MainBean

    @Inject
    DBean dBean; // 注入子DActivityModule中的DBean

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d_layout);

        // 先生成一个DBaseComponent
        DBaseComponent dBaseComponent = DaggerDBaseComponent.builder().dBaseModule(new DBaseModule("Lee")).build();
        dBaseComponent.getDActivityComponent(new DActivityModule("DActivityModule Title")).inject(this);

        ToastUtils.showLong(mainBean.getName() + "\n" + dBean.getTitle());
    }
}
