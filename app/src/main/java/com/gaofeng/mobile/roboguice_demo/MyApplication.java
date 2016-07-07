package com.gaofeng.mobile.roboguice_demo;

import android.app.Application;
import android.util.Log;

import com.gaofeng.mobile.modules.BabyModule;
import com.gaofeng.mobile.modules.DogModule;
import com.gaofeng.mobile.mvp.MVPModule;
import com.gaofeng.mobile.mvp.MVPModule2;
import com.google.inject.AbstractModule;
import com.google.inject.Injector;
import com.google.inject.Stage;
import com.google.inject.util.Modules;

import java.util.ArrayList;
import java.util.List;

import roboguice.RoboGuice;

/**
 * Created by gaofeng on 16-6-29.
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        List<AbstractModule> moduleList = new ArrayList<AbstractModule>();
        moduleList.add(new DogModule());
        moduleList.add(new BabyModule());
      //  moduleList.add(new MVPModule());

        moduleList.add(new MVPModule2());

        Injector injector = RoboGuice.getOrCreateBaseApplicationInjector(this, Stage.PRODUCTION, Modules.override(RoboGuice.newDefaultRoboModule(this)).with(moduleList));
        Log.d("Module","MyApplication>>>" + injector);

    }
}
