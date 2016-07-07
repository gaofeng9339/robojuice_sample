package com.gaofeng.mobile.mvp.presenter;

import com.gaofeng.mobile.mvp.repository.IRepository;
import com.gaofeng.mobile.mvp.view.ICusView;

/**
 * Created by gaofeng on 16-7-6.
 */
public interface IPresenter {

    public void init(ICusView view, IRepository repository);

    public void loadData();

    public void reload();
}
