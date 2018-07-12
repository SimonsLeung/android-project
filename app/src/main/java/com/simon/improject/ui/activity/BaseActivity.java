package com.simon.improject.ui.activity;

import android.content.Context;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;

/**
 * activity基类
 * Created by simon on 2018/6/26.
 */

public abstract class BaseActivity extends AppCompatActivity{



    protected Context mContext;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
    }




    @Override
    protected void onStart() {
        super.onStart();

    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }




    public abstract void initView();//初始化控件

    public abstract void initListener();//初始化监听器

    public abstract void initData();//初始化数据


}
