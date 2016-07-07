package com.gaofeng.mobile.mvp;

import android.util.Log;

import com.gaofeng.mobile.mvp.presenter.IPresenter;
import com.gaofeng.mobile.mvp.presenter.MyPresenter;
import com.gaofeng.mobile.mvp.repository.DataRepository;
import com.gaofeng.mobile.mvp.repository.IRepository;
import com.gaofeng.mobile.mvp.view.ICusView;
import com.gaofeng.mobile.mvp.view.MyView;
import com.google.inject.AbstractModule;

/**
 * Created by gaofeng on 16-7-6.
 */
public class MVPModule extends AbstractModule {
    @Override
    protected void configure() {
        Log.d("Module","MVPModule....");
        bind(IPresenter.class).to(MyPresenter.class);
        bind(IRepository.class).to(DataRepository.class);
        bind(ICusView.class).to(MyView.class);
    }
}
