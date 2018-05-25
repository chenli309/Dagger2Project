package com.lee.study.dagger.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.lee.study.dagger.R;
import com.lee.study.dagger.fragment.HomeFragment;

/**
 * Component依赖Component
 * 当我们其中一个Component跟另外一个Component所提供的依赖有重复的时候，我们没有必要完全再写一遍，一个Component是可以依赖另外一个依赖的，理解起来就像extends关键字；有两种实现方式：
 * 1.dependence方式
 * 2.subComponent方式
 */
public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity_layout);
    }

    @Override
    protected void onResume() {
        super.onResume();

        getSupportFragmentManager().beginTransaction().replace(R.id.fl_fragment, HomeFragment.getInstance()).commitAllowingStateLoss();
    }
}
