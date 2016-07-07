package com.gaofeng.mobile.roboguice_demo;

import android.support.annotation.NonNull;

import com.google.inject.Inject;

/**
 * Created by gaofeng on 16-6-29.
 */
public class DataSource {

    DataCallback callback;

    public void setCallback(@NonNull  DataCallback callback) {
        this.callback = callback;
    }

    public DataCallback getCallback() {
        return callback;
    }

    public String[] getData() {
        return new String[]{"AC","BB","CD"};
    }
}
