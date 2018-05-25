package com.lee.study.dagger.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.blankj.utilcode.util.ToastUtils;
import com.lee.study.dagger.R;
import com.lee.study.dagger.bean.C1Bean;
import com.lee.study.dagger.component.CActivityModule;
import com.lee.study.dagger.component.DaggerCActivityComponent;

import javax.inject.Inject;

/**
 * 只通过@Inject @Module @Component实现DI依赖注入
 * 1、C1Bean和C2Bean是第三方库中的文件，无法编辑这个文件在构造方法上添加@Inject注解
 * 2、Module类 起到一个工厂的角色，负责生产C1Bean和C2Bean
 */
public class CActivity extends AppCompatActivity {

    @Inject
    C1Bean c1Bean;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_layout);
        DaggerCActivityComponent.builder().cActivityModule(new CActivityModule()).build().inject(this);
        ToastUtils.showLong(c1Bean.work());
    }
}
