package com.lee.study.dagger.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.blankj.utilcode.util.ToastUtils;
import com.lee.study.dagger.R;
import com.lee.study.dagger.bean.CoffeeMachine;
import com.lee.study.dagger.bean.MainBean;
import com.lee.study.dagger.component.DaggerMainActivityComponent;
import com.lee.study.dagger.component.MainActivityModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Inject
    MainBean mainBean1;

    @Inject
    MainBean mainBean2;

    @Inject
    CoffeeMachine coffeeMachine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerMainActivityComponent.builder().mainActivityModule(new MainActivityModule("Lee")).build().inject(this);
        String info = mainBean1 + "\n" + mainBean2 + "\n" + mainBean1.getName() + "\n" + coffeeMachine.makeCoffee();
        ToastUtils.showLong(info);

        TextView tv_info = findViewById(R.id.tv_info);
        tv_info.setText(info);

        findViewById(R.id.btn_1).setOnClickListener(this);
        findViewById(R.id.btn_2).setOnClickListener(this);
        findViewById(R.id.btn_3).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_1) {
            startActivity(new Intent(this, AActivity.class));
        } else if (v.getId() == R.id.btn_2) {
            startActivity(new Intent(this, BActivity.class));
        } else if (v.getId() == R.id.btn_3) {
            startActivity(new Intent(this, CActivity.class));
        }
    }
}
