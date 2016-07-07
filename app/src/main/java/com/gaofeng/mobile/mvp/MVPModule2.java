package com.gaofeng.mobile.mvp;

import com.gaofeng.mobile.mvp.presenter.IPresenter;
import com.google.inject.AbstractModule;
import com.google.inject.Binder;

/**
 * Created by gaofeng on 16-7-6.
 */
public class MVPModule2 extends AbstractModule {
    @Override
    protected void configure() {
        binder.bind(IPresenter.class).toProvider(PresenterProvider.class);
    }
}
