package com.gaofeng.mobile.roboguice_demo;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

import com.gaofeng.mobile.mvp.presenter.IPresenter;
import com.google.inject.Inject;

import roboguice.inject.ContentView;

@ContentView(R.layout.activity_home)
public class HomeActivity extends MyBasicActivity {

    @Inject UserData userData;
    @Inject IPresenter presenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("Module","HomeActivity>>>>");
        if (presenter != null) {
            presenter.loadData();
        }
    }

}
