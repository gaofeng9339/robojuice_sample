package com.gaofeng.mobile.mvp.view;

import android.util.Log;

import java.util.List;

/**
 * Created by gaofeng on 16-7-6.
 */
public class MyView implements ICusView {

    @Override
    public void showLoading() {
        Log.d("Module","ICusView showLoading>>>>");
    }

    @Override
    public void updateData(List list) {

    }

    @Override
    public void showError(int code, String msg) {

    }
}
