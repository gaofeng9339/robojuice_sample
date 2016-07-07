package com.gaofeng.mobile.roboguice_demo;

import android.os.Bundle;

import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;

import com.google.inject.Inject;

import roboguice.activity.RoboActivity;
import roboguice.inject.ContentView;
import roboguice.inject.InjectExtra;

@ContentView(R.layout.activity_main2)
public class Main2Activity extends RoboActivity {


    @InjectExtra("data1") @Nullable String data;
    @InjectExtra("value1") @Nullable int value;

    @Inject UserData user;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("","data1:" + data );
        Log.d("","value1:" + value);
        Log.d("","user data:" + user);
    }

}
