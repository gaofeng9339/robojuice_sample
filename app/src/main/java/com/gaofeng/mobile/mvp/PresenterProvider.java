package com.gaofeng.mobile.mvp;

import com.gaofeng.mobile.mvp.presenter.IPresenter;
import com.gaofeng.mobile.mvp.presenter.MyPresenter;
import com.gaofeng.mobile.mvp.repository.DataRepository;
import com.gaofeng.mobile.mvp.view.MyView;
import com.google.inject.Provider;

/**
 * Created by gaofeng on 16-7-6.
 */
public class PresenterProvider implements Provider<IPresenter> {
    @Override
    public IPresenter get() {
        return new MyPresenter(new MyView(),new DataRepository());
    }
}
