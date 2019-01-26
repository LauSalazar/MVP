package com.example.u93.mvp.views.activities;

import android.os.Bundle;

import com.example.u93.mvp.R;
import com.example.u93.mvp.presenters.MainPresenter;
import com.example.u93.mvp.views.BaseActivity;
import com.example.u93.mvp.views.interfaces.IMainView;

public class MainActivity extends BaseActivity<MainPresenter> implements IMainView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setPresenter(new MainPresenter());
        getPresenter().inject(this, getValidateInternet());
    }
}
