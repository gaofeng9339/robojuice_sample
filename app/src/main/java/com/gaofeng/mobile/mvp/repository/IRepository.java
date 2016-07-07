package com.gaofeng.mobile.mvp.repository;

import java.util.List;

/**
 * Created by gaofeng on 16-7-6.
 */
public interface IRepository {

    public void loadData(IDataCallback callback);

    public interface IDataCallback {
        public void onData(List list);
        public void onError(int code,String msg);
    }
}
