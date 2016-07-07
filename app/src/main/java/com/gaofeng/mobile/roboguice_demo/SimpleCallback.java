package com.gaofeng.mobile.roboguice_demo;

import android.provider.ContactsContract;
import android.util.Log;

import java.util.List;

import javax.inject.Inject;

/**
 * Created by gaofeng on 16-6-29.
 */
public class SimpleCallback implements DataCallback {

    @Inject  DataSource dataSource;

    @Override
    public void onData(List t) {
        if (dataSource != null) {
            Log.d("Module","dataSource get information>>>>>>>>>>>>>>>1    " + t + dataSource);
        }
        Log.d("Module","dataSource get information>>>>>>>>>>>>>>>2   " + t + dataSource);
    }
}
