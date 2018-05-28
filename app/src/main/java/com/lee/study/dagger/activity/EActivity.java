package com.lee.study.dagger.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.blankj.utilcode.util.ToastUtils;
import com.lee.study.dagger.R;
import com.lee.study.dagger.bean.EBean;
import com.lee.study.dagger.bean.MainBean;
import com.lee.study.dagger.component.DaggerEBaseComponent;
import com.lee.study.dagger.component.EActivityModule;
import com.lee.study.dagger.component.EBaseComponent;
import com.lee.study.dagger.component.EBaseModule;

import javax.inject.Inject;

/**
 * 子EActivityModule构建时需要传入参数的情况
 */
public class EActivity extends AppCompatActivity {

    @Inject
    MainBean mainBean; // 注入父EBaseModule中的MainBean

//    @Inject
//    EBean eBean; // 注入子EActivityModule中的EBean

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e_layout);

        // 先生成一个EBaseComponent
        EBaseComponent eBaseComponent = DaggerEBaseComponent.create();
        eBaseComponent.eActivityComponent().build().inject(this);
        ToastUtils.showLong(mainBean.getName()); //  + "\n" + eBean.getName()
    }
}
