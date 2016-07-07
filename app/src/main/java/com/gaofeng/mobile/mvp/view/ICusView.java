package com.gaofeng.mobile.mvp.view;

import java.util.List;

/**
 * Created by gaofeng on 16-7-6.
 */
public interface ICusView {

    public void showLoading();

    public void updateData(List list);

    public void showError(int code,String msg);
}
