package com.gaofeng.mobile.modules;

import android.util.Log;

import com.gaofeng.mobile.business.BabyLife;
import com.gaofeng.mobile.business.IBaby;
import com.gaofeng.mobile.roboguice_demo.DataCallback;
import com.gaofeng.mobile.roboguice_demo.SimpleCallback;
import com.google.inject.AbstractModule;

import java.net.SocketImpl;

/**
 * Created by gaofeng on 16-7-6.
 */
public class DogModule extends AbstractModule {
    @Override
    protected void configure() {
        Log.d("Module","DogModule");
        bind(DataCallback.class).to(SimpleCallback.class);
    }
}
