package com.softaai.mvvmcode.di;

import android.app.Application;

import com.softaai.mvvmcode.di.Component.AppComponent;
import com.softaai.mvvmcode.di.Component.DaggerAppComponent;
import com.softaai.mvvmcode.di.module.ArticleDetailActivityModule;
import com.softaai.mvvmcode.di.module.MainListActivityModule;
import com.softaai.mvvmcode.di.module.NetworkModule;
import com.softaai.mvvmcode.model.Results;

/**
 * Created by Amol Pawar on 04-05-2019.
 * softAai Apps
 */
public class MvvmCodeApp extends Application {
    private static AppComponent component;

    private static final String url = "http://api.nytimes.com/";


    public static AppComponent getComponent(){
        return component;
    }

    @Override
    public void onCreate(){
        super.onCreate();
        component =buildComponent();
    }

    protected AppComponent buildComponent(){
        return DaggerAppComponent.builder()
                .articleDetailActivityModule(new ArticleDetailActivityModule(new Results()))
                .mainListActivityModule(new MainListActivityModule())
                .networkModule(new NetworkModule(url))
                .build();
    }
}
