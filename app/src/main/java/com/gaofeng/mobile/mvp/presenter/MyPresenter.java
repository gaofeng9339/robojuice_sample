package com.gaofeng.mobile.mvp.presenter;

import android.util.Log;

import com.gaofeng.mobile.mvp.repository.DataRepository;
import com.gaofeng.mobile.mvp.repository.IRepository;
import com.gaofeng.mobile.mvp.view.ICusView;
import com.gaofeng.mobile.mvp.view.MyView;
import com.google.inject.Inject;

/**
 * Created by gaofeng on 16-7-6.
 */
public class MyPresenter implements  IPresenter {

    ICusView iCusView;

    IRepository iRepository;

    public MyPresenter(MyView myView, DataRepository dataRepository) {
        this.iCusView = myView;
        this.iRepository = dataRepository;
    }

    public void setiCusView(ICusView iCusView) {
        this.iCusView = iCusView;
    }

    public void setiRepository(IRepository iRepository) {
        this.iRepository = iRepository;
    }

    @Override
    public void init(ICusView view, IRepository repository) {
      //  this.iRepository = repository;
       // this.iCusView = view;
    }

    @Override
    public void loadData() {
        Log.d("Module","cusView:" + iCusView);
        Log.d("Module","iRepository:" + iRepository);
    }

    @Override
    public void reload() {

    }
}
