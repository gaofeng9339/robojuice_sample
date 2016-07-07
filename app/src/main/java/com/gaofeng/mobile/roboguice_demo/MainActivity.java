package com.gaofeng.mobile.roboguice_demo;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.gaofeng.mobile.business.IBaby;
import com.gaofeng.mobile.mvp.presenter.IPresenter;
import com.gaofeng.mobile.mvp.repository.IRepository;
import com.gaofeng.mobile.mvp.view.ICusView;
import com.google.inject.Inject;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

import roboguice.activity.RoboActivity;
import roboguice.inject.ContentView;
import roboguice.inject.InjectExtra;
import roboguice.inject.InjectView;

@ContentView(R.layout.activity_main)
public class MainActivity extends RoboActivity {

   // @Inject DataCallback callback;
    @InjectView(R.id.title) TextView title;
    @Inject IBaby babyLife;
    @Inject DataCallback dataCallback;

   // @InjectExtra("myparam") String value;

    @Inject
    IPresenter presenter;

  //  @Inject
    IRepository repository;

   // @Inject
    ICusView cusView;

    //@Inject DataSource dataSource;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_main);
//        title.setText("injection.....");
//        setTitle(title);
        if (title != null) {
            title.setText("ok it is ok1");
        }

       // if (callback != null) {
       //     callback.onData(null);
        //    title.setText("ok it is callback");
        //}

        if (dataCallback != null) {
            dataCallback.onData(null);
        }
        if (babyLife != null) {
            babyLife.learn();
        }

        if (presenter != null) {
            presenter.init(cusView,repository);
            presenter.loadData();
        }

        if (repository != null) {
            repository.loadData(new IRepository.IDataCallback() {
                @Override
                public void onData(List list) {

                }

                @Override
                public void onError(int code, String msg) {

                }
            });
        }

        if (cusView != null) {
            cusView.showLoading();



        }

        Intent intent = new Intent(this,MyBasicActivity.class);
        intent.putExtra("data1","hello");
        intent.putExtra("value1",1000);
        startActivity(intent);
    }

    private void setTitle(@NonNull  TextView textView) {
       // textView.setText("ok got.");
     //   callback.onData(new ArrayList());
       // assert dataSource !=null;
       // textView.setText(dataSource.getData().toString());
    }
}
