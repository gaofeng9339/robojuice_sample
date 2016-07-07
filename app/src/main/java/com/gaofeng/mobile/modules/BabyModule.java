package com.gaofeng.mobile.modules;

import android.provider.ContactsContract;
import android.util.Log;

import com.gaofeng.mobile.business.BabyLife;
import com.gaofeng.mobile.business.IBaby;
import com.gaofeng.mobile.roboguice_demo.DataCallback;
import com.gaofeng.mobile.roboguice_demo.SimpleCallback;
import com.google.inject.AbstractModule;

/**
 * Created by gaofeng on 16-7-6.
 */
public class BabyModule extends AbstractModule {
    @Override
    protected void configure() {
        Log.d("Module","BabyModule Configure");
        bind(IBaby.class).to(BabyLife.class);
     //   bind(DataCallback.class).to(SimpleCallback.class);
    }
}
