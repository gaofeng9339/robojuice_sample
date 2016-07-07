package com.gaofeng.mobile.roboguice_demo;

import android.content.Context;
import android.util.Log;

import com.google.inject.AbstractModule;
import com.google.inject.Binder;
import com.google.inject.Module;


/**
 * Created by gaofeng on 16-6-29.
 */
public class BaseDataModel extends AbstractModule {


    @Override
    protected void configure() {
        bind(DataCallback.class).to(SimpleCallback.class);
        Log.d("Module","bind now............");
    }
}
