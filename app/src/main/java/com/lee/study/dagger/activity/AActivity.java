package com.lee.study.dagger.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.blankj.utilcode.util.ToastUtils;
import com.lee.study.dagger.R;
import com.lee.study.dagger.bean.ABean;
import com.lee.study.dagger.component.DaggerAActivityComponent;

import javax.inject.Inject;

/**
 * 只通过@Inject @Component实现DI依赖注入
 * 1、ABean是自己定义的或可编辑的类，非第三方库中的文件
 * 2、ABean的构造方法无参数
 */
public class AActivity extends AppCompatActivity {

    @Inject
    ABean aBean;
//    private ABean aBean;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_layout);
        DaggerAActivityComponent.create().inject(this);
        ToastUtils.showLong(String.valueOf(aBean.hashCode()));
    }
}
