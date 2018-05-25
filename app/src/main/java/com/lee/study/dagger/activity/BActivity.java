package com.lee.study.dagger.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.blankj.utilcode.util.ToastUtils;
import com.lee.study.dagger.R;
import com.lee.study.dagger.bean.B1Bean;
import com.lee.study.dagger.component.DaggerBActivityComponent;

import javax.inject.Inject;

/**
 * 只通过@Inject @Component实现DI依赖注入
 * 1、B1Bean和B2Bean都是自己定义的或可编辑的类，非第三方库中的文件
 * 2、B1Bean的构造方法有参数
 */
public class BActivity extends AppCompatActivity {

    @Inject
    B1Bean b1Bean;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b_layout);
        DaggerBActivityComponent.create().inject(this);
        ToastUtils.showLong(b1Bean.work());
    }
}
