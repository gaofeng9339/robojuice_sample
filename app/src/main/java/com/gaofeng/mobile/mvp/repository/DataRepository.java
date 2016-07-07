package com.gaofeng.mobile.mvp.repository;

import android.util.Log;

/**
 * Created by gaofeng on 16-7-6.
 */
public class DataRepository implements IRepository {

    public DataRepository () {
        Log.d("Module","DataRepository>>>" + this);
    }

    @Override
    public void loadData(IDataCallback callback) {
        Log.d("Module","DataRepository loadData>>>" + callback);
    }
}
